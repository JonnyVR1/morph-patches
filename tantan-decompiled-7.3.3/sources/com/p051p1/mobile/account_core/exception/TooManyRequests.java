package com.p051p1.mobile.account_core.exception;

import p153l.i5d0;

/* JADX INFO: loaded from: classes8.dex */
public class TooManyRequests extends RuntimeException {
    public final int resetInSeconds;

    public TooManyRequests(i5d0 i5d0Var, int i) {
        this.resetInSeconds = i;
    }
}
