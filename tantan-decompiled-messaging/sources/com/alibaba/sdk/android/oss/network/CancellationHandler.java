package com.alibaba.sdk.android.oss.network;

import p149l.sx3;

/* JADX INFO: loaded from: classes.dex */
public class CancellationHandler {
    private volatile sx3 call;
    private volatile boolean isCancelled;

    public void cancel() {
        if (this.call != null) {
            this.call.cancel();
        }
        this.isCancelled = true;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCall(sx3 sx3Var) {
        this.call = sx3Var;
    }
}
