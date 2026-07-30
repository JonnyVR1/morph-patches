package com.hihonor.push.sdk;

import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.y */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3690y implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3692z.a f12687b;

    public RunnableC3690y(C3692z.a aVar, int i) {
        this.f12687b = aVar;
        this.f12686a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12687b.m18610a(HonorPushErrorEnum.fromCode(this.f12686a));
    }
}
