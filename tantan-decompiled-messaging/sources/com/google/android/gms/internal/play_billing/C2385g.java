package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2385g {

    /* JADX INFO: renamed from: d */
    public static final C2385g f10322d = new C2385g();

    /* JADX INFO: renamed from: a */
    public final Runnable f10323a;

    /* JADX INFO: renamed from: b */
    public final Executor f10324b;

    /* JADX INFO: renamed from: c */
    public C2385g f10325c;

    public C2385g() {
        this.f10323a = null;
        this.f10324b = null;
    }

    public C2385g(Runnable runnable, Executor executor) {
        this.f10323a = runnable;
        this.f10324b = executor;
    }
}
