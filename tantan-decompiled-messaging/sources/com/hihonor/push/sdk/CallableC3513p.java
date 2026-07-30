package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.p */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3513p implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3519s f11906a;

    public CallableC3513p(C3519s c3519s) {
        this.f11906a = c3519s;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f11906a.f11916b.m17479a(true);
        return null;
    }
}
