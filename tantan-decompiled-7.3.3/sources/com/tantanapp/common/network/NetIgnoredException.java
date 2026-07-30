package com.tantanapp.common.network;

/* JADX INFO: loaded from: classes11.dex */
public class NetIgnoredException extends Exception {

    /* JADX INFO: renamed from: e */
    private Exception f56888e;

    public NetIgnoredException(Exception exc) {
        this.f56888e = exc;
    }

    public Exception getOriginException() {
        return this.f56888e;
    }
}
