package com.alibaba.sdk.android.oss.network;

import p153l.ry3;

/* JADX INFO: loaded from: classes.dex */
public class CancellationHandler {
    private volatile ry3 call;
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

    public void setCall(ry3 ry3Var) {
        this.call = ry3Var;
    }
}
