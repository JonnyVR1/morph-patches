package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.f */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3649f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f12601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3664l f12602c;

    public RunnableC3649f(C3664l c3664l, HonorPushCallback honorPushCallback, boolean z) {
        this.f12602c = c3664l;
        this.f12600a = honorPushCallback;
        this.f12601b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3678s c3678s = this.f12602c.f12635d;
        c3678s.m18603a(new CallableC3666m(c3678s, this.f12601b), this.f12600a);
    }
}
