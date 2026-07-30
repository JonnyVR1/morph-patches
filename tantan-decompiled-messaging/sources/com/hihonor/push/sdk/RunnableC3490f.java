package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.f */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3490f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f11860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3505l f11861c;

    public RunnableC3490f(C3505l c3505l, HonorPushCallback honorPushCallback, boolean z) {
        this.f11861c = c3505l;
        this.f11859a = honorPushCallback;
        this.f11860b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3519s c3519s = this.f11861c.f11894d;
        c3519s.m17526a(new CallableC3507m(c3519s, this.f11860b), this.f11859a);
    }
}
