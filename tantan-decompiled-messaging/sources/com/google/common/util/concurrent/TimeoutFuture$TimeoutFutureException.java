package com.google.common.util.concurrent;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
final class TimeoutFuture$TimeoutFutureException extends TimeoutException {
    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    private TimeoutFuture$TimeoutFutureException(String str) {
        super(str);
    }
}
