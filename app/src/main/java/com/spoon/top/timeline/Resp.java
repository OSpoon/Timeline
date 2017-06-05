package com.spoon.top.timeline;

import java.util.List;

/**
 * Created by zhanxiaolin-n22 on 2017/6/5.
 */

public class Resp {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"mailNo":"3330834879128","update":1496645401434,"updateStr":"2017-06-05 14:50:01","ret_code":0,"flag":true,"dataSize":7,"status":2,"tel":"400-889-5543","expSpellName":"shentong","data":[{"time":"2017-06-05 09:10:00","context":"【北京双桥公司】的【王大东】正在派件,扫描员是【刘颖】"},{"time":"2017-06-05 08:07:00","context":"快件到达【北京双桥公司】,上一站是【】,扫描员是【小胡】"},{"time":"2017-06-05 04:05:00","context":"快件在【北京中转部】由【市内274】扫描发往【北京双桥公司】"},{"time":"2017-06-04 01:48:00","context":"快件在【广东东莞航空部】由【张竹祥】扫描发往【北京中转部】"},{"time":"2017-06-04 00:35:00","context":"快件在【广东东莞中转部】进行装包发往扫描，发往【北京航空部】"},{"time":"2017-06-03 23:11:00","context":"快件在【广东东莞中堂分部】由【中堂财务】扫描发往【广东东莞中转部】"},{"time":"2017-06-03 22:05:00","context":"【广东东莞中堂分部】的【菲斯贝顿】已收件,扫描员是【中堂扫描4】"}],"expTextName":"申通快递","msg":"查询成功!"}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * mailNo : 3330834879128
         * update : 1496645401434
         * updateStr : 2017-06-05 14:50:01
         * ret_code : 0
         * flag : true
         * dataSize : 7
         * status : 2
         * tel : 400-889-5543
         * expSpellName : shentong
         * data : [{"time":"2017-06-05 09:10:00","context":"【北京双桥公司】的【王大东】正在派件,扫描员是【刘颖】"},{"time":"2017-06-05 08:07:00","context":"快件到达【北京双桥公司】,上一站是【】,扫描员是【小胡】"},{"time":"2017-06-05 04:05:00","context":"快件在【北京中转部】由【市内274】扫描发往【北京双桥公司】"},{"time":"2017-06-04 01:48:00","context":"快件在【广东东莞航空部】由【张竹祥】扫描发往【北京中转部】"},{"time":"2017-06-04 00:35:00","context":"快件在【广东东莞中转部】进行装包发往扫描，发往【北京航空部】"},{"time":"2017-06-03 23:11:00","context":"快件在【广东东莞中堂分部】由【中堂财务】扫描发往【广东东莞中转部】"},{"time":"2017-06-03 22:05:00","context":"【广东东莞中堂分部】的【菲斯贝顿】已收件,扫描员是【中堂扫描4】"}]
         * expTextName : 申通快递
         * msg : 查询成功!
         */

        private String mailNo;
        private long update;
        private String updateStr;
        private int ret_code;
        private boolean flag;
        private int dataSize;
        private int status;
        private String tel;
        private String expSpellName;
        private String expTextName;
        private String msg;
        private List<DataBean> data;

        public String getMailNo() {
            return mailNo;
        }

        public void setMailNo(String mailNo) {
            this.mailNo = mailNo;
        }

        public long getUpdate() {
            return update;
        }

        public void setUpdate(long update) {
            this.update = update;
        }

        public String getUpdateStr() {
            return updateStr;
        }

        public void setUpdateStr(String updateStr) {
            this.updateStr = updateStr;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public int getDataSize() {
            return dataSize;
        }

        public void setDataSize(int dataSize) {
            this.dataSize = dataSize;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getExpSpellName() {
            return expSpellName;
        }

        public void setExpSpellName(String expSpellName) {
            this.expSpellName = expSpellName;
        }

        public String getExpTextName() {
            return expTextName;
        }

        public void setExpTextName(String expTextName) {
            this.expTextName = expTextName;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * time : 2017-06-05 09:10:00
             * context : 【北京双桥公司】的【王大东】正在派件,扫描员是【刘颖】
             */

            private String time;
            private String context;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getContext() {
                return context;
            }

            public void setContext(String context) {
                this.context = context;
            }
        }
    }
}
