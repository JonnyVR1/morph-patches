package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2140f3 {

    /* JADX INFO: renamed from: d */
    public static final C2140f3 f9887d = new C2140f3();

    /* JADX INFO: renamed from: a */
    public final Runnable f9888a;

    /* JADX INFO: renamed from: b */
    public final Executor f9889b;

    /* JADX INFO: renamed from: c */
    public C2140f3 f9890c;

    public C2140f3() {
        this.f9888a = null;
        this.f9889b = null;
    }

    public C2140f3(Runnable runnable, Executor executor) {
        this.f9888a = runnable;
        this.f9889b = executor;
    }
}
