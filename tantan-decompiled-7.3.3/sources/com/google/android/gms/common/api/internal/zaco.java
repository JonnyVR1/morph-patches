package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import p153l.m8r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaco {
    private static final ExecutorService zaa = m8r0.m157498a().mo143882c(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return zaa;
    }
}
