package com.p046p1.mobile.putong.live.base.apibean;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class BaseLiveBean {
    private int code;
    private String data;
    private String msg;
    private PaginationBean pagination;

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getNextPageUntil() {
        return this.pagination.getProcessedNext();
    }

    public PaginationBean getPagination() {
        return this.pagination;
    }

    public boolean hasNextPage() {
        PaginationBean paginationBean = this.pagination;
        return (paginationBean == null || TextUtils.isEmpty(paginationBean.getProcessedNext())) ? false : true;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setPagination(PaginationBean paginationBean) {
        this.pagination = paginationBean;
    }

    public static boolean hasNextPage(PaginationBean paginationBean) {
        return (paginationBean == null || TextUtils.isEmpty(paginationBean.getProcessedNext())) ? false : true;
    }
}
