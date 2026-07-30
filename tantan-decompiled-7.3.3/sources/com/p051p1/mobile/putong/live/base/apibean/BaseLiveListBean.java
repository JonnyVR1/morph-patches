package com.p051p1.mobile.putong.live.base.apibean;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BaseLiveListBean<T> extends BaseLiveBean {
    public List<T> list;

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public String toString() {
        return "BaseLiveListBean{list=" + this.list + ", pagination=" + getPagination() + '}';
    }
}
