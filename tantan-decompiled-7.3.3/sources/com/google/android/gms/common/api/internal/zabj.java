package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import p153l.m8r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zabj {
    private static final ExecutorService zaa = m8r0.m157498a().mo143880a(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService zaa() {
        return zaa;
    }
}
