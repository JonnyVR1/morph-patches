package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes7.dex */
public class UncheckedTimeoutException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(String str) {
        super(str);
    }

    public UncheckedTimeoutException(Throwable th) {
        super(th);
    }

    public UncheckedTimeoutException(String str, Throwable th) {
        super(str, th);
    }
}
