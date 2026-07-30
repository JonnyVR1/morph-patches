package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.u0 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3683u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3635a1 f12671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3685v0 f12672b;

    public RunnableC3683u0(C3685v0 c3685v0, C3635a1 c3635a1) {
        this.f12672b = c3685v0;
        this.f12671a = c3635a1;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f12672b.f12677c) {
            try {
                InterfaceC3665l0 interfaceC3665l0 = this.f12672b.f12676b;
                if (interfaceC3665l0 != null) {
                    this.f12671a.m18559b();
                    ((C3691y0) interfaceC3665l0).f12688a.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
