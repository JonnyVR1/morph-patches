package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.z0 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3534z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3510n0 f11958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f11959b;

    public RunnableC3534z0(C3510n0 c3510n0, Callable callable) {
        this.f11958a = c3510n0;
        this.f11959b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f11958a.m17524a(this.f11959b.call());
        } catch (Exception e) {
            this.f11958a.m17523a(e);
        }
    }
}
