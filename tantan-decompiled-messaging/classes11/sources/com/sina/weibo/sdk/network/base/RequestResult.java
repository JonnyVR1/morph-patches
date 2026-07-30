package com.sina.weibo.sdk.network.base;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RequestResult<T> {

    /* JADX INFO: renamed from: e */
    private Exception f8744e;
    private ArrayList<Object> interceptResult;
    private T response;

    public Exception getE() {
        return this.f8744e;
    }

    public ArrayList<Object> getInterceptResult() {
        return this.interceptResult;
    }

    public T getResponse() {
        return this.response;
    }

    public void setE(Exception exc) {
        this.f8744e = exc;
    }

    public void setInterceptResult(ArrayList<Object> arrayList) {
        this.interceptResult = arrayList;
    }

    public void setResponse(T t) {
        this.response = t;
    }
}
