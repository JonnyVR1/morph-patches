package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
import p153l.fww0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgfj extends TimeoutException {
    public /* synthetic */ zzgfj(String str, fww0 fww0Var) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
