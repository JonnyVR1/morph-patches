package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.s0 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3679s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3635a1 f12661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3681t0 f12662b;

    public RunnableC3679s0(C3681t0 c3681t0, C3635a1 c3635a1) {
        this.f12662b = c3681t0;
        this.f12661a = c3635a1;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f12662b.f12667c) {
            try {
                InterfaceC3663k0<TResult> interfaceC3663k0 = this.f12662b.f12666b;
                if (interfaceC3663k0 != 0) {
                    interfaceC3663k0.mo18555a(this.f12661a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
