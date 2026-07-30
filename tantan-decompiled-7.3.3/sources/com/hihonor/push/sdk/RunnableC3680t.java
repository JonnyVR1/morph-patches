package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.t */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3680t implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12664b;

    public RunnableC3680t(C3678s c3678s, HonorPushCallback honorPushCallback, Object obj) {
        this.f12663a = honorPushCallback;
        this.f12664b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f12663a;
        if (honorPushCallback != null) {
            honorPushCallback.onSuccess(this.f12664b);
        }
    }
}
