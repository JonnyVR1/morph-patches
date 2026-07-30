package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;
import p149l.muv0;

/* JADX INFO: loaded from: classes6.dex */
final class zzfd extends TimeoutException {
    public /* synthetic */ zzfd(String str, muv0 muv0Var) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
