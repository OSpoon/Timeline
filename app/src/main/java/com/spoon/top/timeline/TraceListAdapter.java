package com.spoon.top.timeline;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class TraceListAdapter extends BaseQuickAdapter<Trace, BaseViewHolder> {

    private static final int TYPE_TOP = 0x0000;

    public TraceListAdapter(@Nullable List<Trace> data) {
        super(R.layout.item_trace, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Trace item) {
        int position = helper.getLayoutPosition();
        if (position == TYPE_TOP) {
            // 字体颜色加深
            helper.setTextColor(R.id.tvAcceptTime, 0xff555555);
            helper.setTextColor(R.id.tvAcceptStation, 0xff555555);
            helper.setBackgroundRes(R.id.tvDot, R.drawable.timelline_dot_first);
        } else {
            helper.setTextColor(R.id.tvAcceptTime, 0xff999999);
            helper.setTextColor(R.id.tvAcceptStation, 0xff999999);
            helper.setBackgroundRes(R.id.tvDot, R.drawable.timelline_dot_normal);
        }
        helper.setText(R.id.tvAcceptTime, item.getAcceptTime());
        helper.setText(R.id.tvAcceptStation, item.getAcceptStation());
    }
}
