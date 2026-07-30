package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.n0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3669n0<TResult> {

    /* JADX INFO: renamed from: a */
    public final C3635a1 f12642a = new C3635a1();

    /* JADX INFO: renamed from: a */
    public void m18601a(TResult tresult) {
        C3635a1 c3635a1 = this.f12642a;
        synchronized (c3635a1.f12581a) {
            try {
                if (!c3635a1.f12582b) {
                    c3635a1.f12582b = true;
                    c3635a1.f12583c = tresult;
                    c3635a1.f12581a.notifyAll();
                    c3635a1.m18558a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m18600a(Exception exc) {
        C3635a1 c3635a1 = this.f12642a;
        synchronized (c3635a1.f12581a) {
            try {
                if (!c3635a1.f12582b) {
                    c3635a1.f12582b = true;
                    c3635a1.f12584d = exc;
                    c3635a1.f12581a.notifyAll();
                    c3635a1.m18558a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
