package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.p */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3672p implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3678s f12647a;

    public CallableC3672p(C3678s c3678s) {
        this.f12647a = c3678s;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f12647a.f12657b.m18556a(true);
        return null;
    }
}
