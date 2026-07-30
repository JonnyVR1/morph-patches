package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.u0 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3524u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3476a1 f11930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3526v0 f11931b;

    public RunnableC3524u0(C3526v0 c3526v0, C3476a1 c3476a1) {
        this.f11931b = c3526v0;
        this.f11930a = c3476a1;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f11931b.f11936c) {
            try {
                InterfaceC3506l0 interfaceC3506l0 = this.f11931b.f11935b;
                if (interfaceC3506l0 != null) {
                    this.f11930a.m17482b();
                    ((C3532y0) interfaceC3506l0).f11947a.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
