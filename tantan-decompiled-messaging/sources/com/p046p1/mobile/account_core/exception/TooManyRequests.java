package com.p046p1.mobile.account_core.exception;

import p149l.exc0;

/* JADX INFO: loaded from: classes8.dex */
public class TooManyRequests extends RuntimeException {
    public final int resetInSeconds;

    public TooManyRequests(exc0 exc0Var, int i) {
        this.resetInSeconds = i;
    }
}
