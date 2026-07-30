package com.immomo.mwc.sdk.adapter.http;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HttpResponse<T> implements Serializable {
    public T data;
    public Error error = new Error(0, null);
    public Map<String, String> header;
    public int status;

    public static class Error implements Serializable {
        public int code;
        public String msg;

        public Error(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }
}
