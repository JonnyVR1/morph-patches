package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2163f3 {

    /* JADX INFO: renamed from: d */
    public static final C2163f3 f9924d = new C2163f3();

    /* JADX INFO: renamed from: a */
    public final Runnable f9925a;

    /* JADX INFO: renamed from: b */
    public final Executor f9926b;

    /* JADX INFO: renamed from: c */
    public C2163f3 f9927c;

    public C2163f3() {
        this.f9925a = null;
        this.f9926b = null;
    }

    public C2163f3(Runnable runnable, Executor executor) {
        this.f9925a = runnable;
        this.f9926b = executor;
    }
}
