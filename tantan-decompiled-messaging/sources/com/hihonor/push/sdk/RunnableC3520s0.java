package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.s0 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3520s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3476a1 f11920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3522t0 f11921b;

    public RunnableC3520s0(C3522t0 c3522t0, C3476a1 c3476a1) {
        this.f11921b = c3522t0;
        this.f11920a = c3476a1;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f11921b.f11926c) {
            try {
                InterfaceC3504k0<TResult> interfaceC3504k0 = this.f11921b.f11925b;
                if (interfaceC3504k0 != 0) {
                    interfaceC3504k0.mo17478a(this.f11920a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
