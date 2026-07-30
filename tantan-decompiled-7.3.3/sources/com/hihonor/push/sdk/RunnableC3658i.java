package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.i */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3658i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3664l f12624b;

    public RunnableC3658i(C3664l c3664l, HonorPushCallback honorPushCallback) {
        this.f12624b = c3664l;
        this.f12623a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3678s c3678s = this.f12624b.f12635d;
        c3678s.m18603a(new CallableC3672p(c3678s), this.f12623a);
    }
}
