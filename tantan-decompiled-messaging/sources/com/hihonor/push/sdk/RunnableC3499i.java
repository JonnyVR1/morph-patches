package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.i */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3499i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3505l f11883b;

    public RunnableC3499i(C3505l c3505l, HonorPushCallback honorPushCallback) {
        this.f11883b = c3505l;
        this.f11882a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3519s c3519s = this.f11883b.f11894d;
        c3519s.m17526a(new CallableC3513p(c3519s), this.f11882a);
    }
}
