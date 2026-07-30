package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.j */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3501j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3505l f11887b;

    public RunnableC3501j(C3505l c3505l, HonorPushCallback honorPushCallback) {
        this.f11887b = c3505l;
        this.f11886a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3519s c3519s = this.f11887b.f11894d;
        c3519s.m17526a(new CallableC3515q(c3519s), this.f11886a);
    }
}
