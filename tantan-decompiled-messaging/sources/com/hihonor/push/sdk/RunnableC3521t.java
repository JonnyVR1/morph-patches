package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.t */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3521t implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11923b;

    public RunnableC3521t(C3519s c3519s, HonorPushCallback honorPushCallback, Object obj) {
        this.f11922a = honorPushCallback;
        this.f11923b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f11922a;
        if (honorPushCallback != null) {
            honorPushCallback.onSuccess(this.f11923b);
        }
    }
}
