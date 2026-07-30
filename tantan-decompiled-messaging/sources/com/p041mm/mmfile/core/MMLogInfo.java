package com.p041mm.mmfile.core;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MMLogInfo {
    private String body;
    private List<String> headers;

    public MMLogInfo(List<String> list, String str) {
        this.headers = list;
        this.body = str;
    }

    public String getBody() {
        return this.body;
    }

    public List<String> getHeaders() {
        return this.headers;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setHeaders(List<String> list) {
        this.headers = list;
    }

    public String toString() {
        return "MMLogInfo{headers=" + this.headers + ", body='" + this.body + "'}";
    }

    public MMLogInfo() {
    }
}
