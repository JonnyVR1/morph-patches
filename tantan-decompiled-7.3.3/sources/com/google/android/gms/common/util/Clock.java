package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
public interface Clock {

    /* JADX INFO: renamed from: com.google.android.gms.common.util.Clock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    @KeepForSdk
    long currentThreadTimeMillis();

    @KeepForSdk
    long currentTimeMillis();

    @KeepForSdk
    long elapsedRealtime();

    @KeepForSdk
    long nanoTime();
}
