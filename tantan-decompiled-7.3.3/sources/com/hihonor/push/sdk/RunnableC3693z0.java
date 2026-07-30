package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.z0 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3693z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3669n0 f12699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f12700b;

    public RunnableC3693z0(C3669n0 c3669n0, Callable callable) {
        this.f12699a = c3669n0;
        this.f12700b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f12699a.m18601a(this.f12700b.call());
        } catch (Exception e) {
            this.f12699a.m18600a(e);
        }
    }
}
