package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.w0 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3528w0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3476a1 f11939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3530x0 f11940b;

    public RunnableC3528w0(C3530x0 c3530x0, C3476a1 c3476a1) {
        this.f11940b = c3530x0;
        this.f11939a = c3476a1;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f11940b.f11944c) {
            try {
                Object obj = this.f11940b.f11943b;
                if (obj != null) {
                    this.f11939a.m17483c();
                    ((C3532y0) obj).f11947a.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
