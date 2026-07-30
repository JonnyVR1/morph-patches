package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.u */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3682u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f12669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f12670c;

    public RunnableC3682u(C3678s c3678s, HonorPushCallback honorPushCallback, int i, String str) {
        this.f12668a = honorPushCallback;
        this.f12669b = i;
        this.f12670c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f12668a;
        if (honorPushCallback != null) {
            honorPushCallback.onFailure(this.f12669b, this.f12670c);
        }
    }
}
