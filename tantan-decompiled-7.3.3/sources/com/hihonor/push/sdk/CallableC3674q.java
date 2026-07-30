package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.q */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3674q implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3678s f12649a;

    public CallableC3674q(C3678s c3678s) {
        this.f12649a = c3678s;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f12649a.f12657b.m18556a(false);
        return null;
    }
}
