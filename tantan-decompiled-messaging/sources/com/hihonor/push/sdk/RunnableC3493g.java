package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.g */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3493g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3505l f11873b;

    public RunnableC3493g(C3505l c3505l, HonorPushCallback honorPushCallback) {
        this.f11873b = c3505l;
        this.f11872a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3519s c3519s = this.f11873b.f11894d;
        c3519s.m17526a(new CallableC3509n(c3519s), this.f11872a);
    }
}
