package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.g */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3652g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3664l f12614b;

    public RunnableC3652g(C3664l c3664l, HonorPushCallback honorPushCallback) {
        this.f12614b = c3664l;
        this.f12613a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3678s c3678s = this.f12614b.f12635d;
        c3678s.m18603a(new CallableC3668n(c3678s), this.f12613a);
    }
}
