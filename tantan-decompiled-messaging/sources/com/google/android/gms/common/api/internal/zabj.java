package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import p149l.gzq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zabj {
    private static final ExecutorService zaa = gzq0.m128909a().mo114130a(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService zaa() {
        return zaa;
    }
}
