package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.h */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3655h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12618a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3664l f12619b;

    public RunnableC3655h(C3664l c3664l, HonorPushCallback honorPushCallback) {
        this.f12619b = c3664l;
        this.f12618a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3678s c3678s = this.f12619b.f12635d;
        c3678s.m18603a(new CallableC3670o(c3678s), this.f12618a);
    }
}
