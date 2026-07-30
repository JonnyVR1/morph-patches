package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import p149l.gzq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaco {
    private static final ExecutorService zaa = gzq0.m128909a().mo114132c(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return zaa;
    }
}
