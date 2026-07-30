package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.u */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3523u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f11928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f11929c;

    public RunnableC3523u(C3519s c3519s, HonorPushCallback honorPushCallback, int i, String str) {
        this.f11927a = honorPushCallback;
        this.f11928b = i;
        this.f11929c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f11927a;
        if (honorPushCallback != null) {
            honorPushCallback.onFailure(this.f11928b, this.f11929c);
        }
    }
}
