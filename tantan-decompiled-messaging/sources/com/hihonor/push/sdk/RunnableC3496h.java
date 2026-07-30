package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.h */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3496h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3505l f11878b;

    public RunnableC3496h(C3505l c3505l, HonorPushCallback honorPushCallback) {
        this.f11878b = c3505l;
        this.f11877a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3519s c3519s = this.f11878b.f11894d;
        c3519s.m17526a(new CallableC3511o(c3519s), this.f11877a);
    }
}
