package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.j */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3660j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3664l f12628b;

    public RunnableC3660j(C3664l c3664l, HonorPushCallback honorPushCallback) {
        this.f12628b = c3664l;
        this.f12627a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3678s c3678s = this.f12628b.f12635d;
        c3678s.m18603a(new CallableC3674q(c3678s), this.f12627a);
    }
}
