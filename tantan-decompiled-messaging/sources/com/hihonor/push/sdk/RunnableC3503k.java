package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.k */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3503k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3505l f11889b;

    public RunnableC3503k(C3505l c3505l, HonorPushCallback honorPushCallback) {
        this.f11889b = c3505l;
        this.f11888a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3519s c3519s = this.f11889b.f11894d;
        HonorPushCallback honorPushCallback = this.f11888a;
        c3519s.getClass();
        if (honorPushCallback == null) {
            return;
        }
        C3476a1 c3476a1M17487a = C3477b.m17487a(new CallableC3514p0(c3519s.f11915a));
        C3517r c3517r = new C3517r(c3519s, honorPushCallback);
        c3476a1M17487a.getClass();
        c3476a1M17487a.m17480a(new C3522t0(C3512o0.f11903c.f11904a, c3517r));
    }
}
