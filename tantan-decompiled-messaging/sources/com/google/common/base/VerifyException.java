package com.google.common.base;

/* JADX INFO: loaded from: classes7.dex */
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(String str) {
        super(str);
    }

    public VerifyException(Throwable th) {
        super(th);
    }

    public VerifyException(String str, Throwable th) {
        super(str, th);
    }
}
