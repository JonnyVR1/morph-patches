package com.android.volley;

import p149l.sc20;

/* JADX INFO: loaded from: classes.dex */
public class VolleyError extends Exception {
    public final sc20 networkResponse;
    private long networkTimeMs;

    public VolleyError() {
        this.networkResponse = null;
    }

    public long getNetworkTimeMs() {
        return this.networkTimeMs;
    }

    public void setNetworkTimeMs(long j) {
        this.networkTimeMs = j;
    }

    public VolleyError(sc20 sc20Var) {
        this.networkResponse = sc20Var;
    }

    public VolleyError(String str) {
        super(str);
        this.networkResponse = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.networkResponse = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.networkResponse = null;
    }
}
