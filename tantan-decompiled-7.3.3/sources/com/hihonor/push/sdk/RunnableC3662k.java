package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.k */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3662k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3664l f12630b;

    public RunnableC3662k(C3664l c3664l, HonorPushCallback honorPushCallback) {
        this.f12630b = c3664l;
        this.f12629a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3678s c3678s = this.f12630b.f12635d;
        HonorPushCallback honorPushCallback = this.f12629a;
        c3678s.getClass();
        if (honorPushCallback == null) {
            return;
        }
        C3635a1 c3635a1M18564a = C3636b.m18564a(new CallableC3673p0(c3678s.f12656a));
        C3676r c3676r = new C3676r(c3678s, honorPushCallback);
        c3635a1M18564a.getClass();
        c3635a1M18564a.m18557a(new C3681t0(C3671o0.f12644c.f12645a, c3676r));
    }
}
