package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2408g {

    /* JADX INFO: renamed from: d */
    public static final C2408g f10359d = new C2408g();

    /* JADX INFO: renamed from: a */
    public final Runnable f10360a;

    /* JADX INFO: renamed from: b */
    public final Executor f10361b;

    /* JADX INFO: renamed from: c */
    public C2408g f10362c;

    public C2408g() {
        this.f10360a = null;
        this.f10361b = null;
    }

    public C2408g(Runnable runnable, Executor executor) {
        this.f10360a = runnable;
        this.f10361b = executor;
    }
}
