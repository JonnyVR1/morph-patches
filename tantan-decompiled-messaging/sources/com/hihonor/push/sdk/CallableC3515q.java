package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.q */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3515q implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3519s f11908a;

    public CallableC3515q(C3519s c3519s) {
        this.f11908a = c3519s;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f11908a.f11916b.m17479a(false);
        return null;
    }
}
