package com.hihonor.push.sdk;

import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.y */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3531y implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3533z.a f11946b;

    public RunnableC3531y(C3533z.a aVar, int i) {
        this.f11946b = aVar;
        this.f11945a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11946b.m17533a(HonorPushErrorEnum.fromCode(this.f11945a));
    }
}
