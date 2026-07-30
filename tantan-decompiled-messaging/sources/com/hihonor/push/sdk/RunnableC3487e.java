package com.hihonor.push.sdk;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.hihonor.push.sdk.e */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3487e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3525v f11856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3505l f11857b;

    public RunnableC3487e(C3505l c3505l, C3525v c3525v) {
        this.f11857b = c3505l;
        this.f11856a = c3525v;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f11857b.f11892b) {
            return;
        }
        this.f11857b.f11892b = true;
        this.f11857b.getClass();
        this.f11857b.f11891a = new WeakReference<>(this.f11856a.f11932a);
        this.f11857b.f11893c = this.f11856a.f11933b;
        this.f11857b.f11894d = new C3519s(this.f11856a.f11932a);
        if (this.f11857b.f11893c) {
            C3505l c3505l = this.f11857b;
            c3505l.m17521a(new RunnableC3490f(c3505l, null, true), (HonorPushCallback<?>) null);
        }
    }
}
