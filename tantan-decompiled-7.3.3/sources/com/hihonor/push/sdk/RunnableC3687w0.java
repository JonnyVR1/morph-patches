package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.w0 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC3687w0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3635a1 f12680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3689x0 f12681b;

    public RunnableC3687w0(C3689x0 c3689x0, C3635a1 c3635a1) {
        this.f12681b = c3689x0;
        this.f12680a = c3635a1;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f12681b.f12685c) {
            try {
                Object obj = this.f12681b.f12684b;
                if (obj != null) {
                    this.f12680a.m18560c();
                    ((C3691y0) obj).f12688a.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
