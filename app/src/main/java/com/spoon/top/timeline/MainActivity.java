package com.spoon.top.timeline;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView rvTrace;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private List<Trace> traceList = new ArrayList<>();
    private TraceListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initData();
    }

    private void findView() {
        rvTrace = (RecyclerView) findViewById(R.id.rvTrace);
        rvTrace.setLayoutManager(new LinearLayoutManager(this));

        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeLayout);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
    }

    private void initData() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .build();
        OkHttpUtils.initClient(okHttpClient);

        adapter = new TraceListAdapter(traceList);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, traceList.get(position).getAcceptStation(), Toast.LENGTH_SHORT).show();
            }
        });
        rvTrace.setAdapter(adapter);
    }


    @Override
    public void onRefresh() {
        String url = "https://route.showapi.com/64-19?com=shentong&nu=3330834879128&showapi_appid=39621&showapi_test_draft=false&showapi_sign=b71f8ed5c8be4d3299bb985fad10d95f";
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {

                    @Override
                    public void onError(Call call, Exception e, int i) {
                        Toast.makeText(MainActivity.this, i + "", Toast.LENGTH_SHORT).show();
                        mSwipeRefreshLayout.setRefreshing(false);
                    }

                    @Override
                    public void onResponse(String resp, int i) {
                        Resp respClazz = new Gson().fromJson(resp, Resp.class);
                        if (!TextUtils.isEmpty(respClazz.getShowapi_res_error())) {
                            Toast.makeText(MainActivity.this, respClazz.getShowapi_res_error(), Toast.LENGTH_SHORT).show();
                        } else {
                            List<Resp.ShowapiResBodyBean.DataBean> datas = respClazz.getShowapi_res_body().getData();
                            if (datas != null) {
                                Collections.reverse(datas); // 倒序排列
                                for (Resp.ShowapiResBodyBean.DataBean dataBean : datas) {
                                    traceList.add(0, new Trace(dataBean.getTime(), dataBean.getContext()));
                                }
                            }
                            adapter.setNewData(traceList);
                        }
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                });
    }
}
