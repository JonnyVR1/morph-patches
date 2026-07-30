package com.hihonor.push.sdk;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.hihonor.push.sdk.e */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3646e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3684v f12597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3664l f12598b;

    public RunnableC3646e(C3664l c3664l, C3684v c3684v) {
        this.f12598b = c3664l;
        this.f12597a = c3684v;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f12598b.f12633b) {
            return;
        }
        this.f12598b.f12633b = true;
        this.f12598b.getClass();
        this.f12598b.f12632a = new WeakReference<>(this.f12597a.f12673a);
        this.f12598b.f12634c = this.f12597a.f12674b;
        this.f12598b.f12635d = new C3678s(this.f12597a.f12673a);
        if (this.f12598b.f12634c) {
            C3664l c3664l = this.f12598b;
            c3664l.m18598a(new RunnableC3649f(c3664l, null, true), (HonorPushCallback<?>) null);
        }
    }
}
