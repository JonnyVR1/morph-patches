package com.p003p1.mobile.account_core.exception;

import l.exc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class TooManyRequests extends RuntimeException {
    public final int resetInSeconds;

    public TooManyRequests(exc0 exc0Var, int i) {
        this.resetInSeconds = i;
    }
}
