package com.tantanapp.common.network;

/* JADX INFO: loaded from: classes13.dex */
public class NetIgnoredException extends Exception {

    /* JADX INFO: renamed from: e */
    private Exception f56040e;

    public NetIgnoredException(Exception exc) {
        this.f56040e = exc;
    }

    public Exception getOriginException() {
        return this.f56040e;
    }
}
