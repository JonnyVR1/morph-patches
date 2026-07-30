package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.n0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3510n0<TResult> {

    /* JADX INFO: renamed from: a */
    public final C3476a1 f11901a = new C3476a1();

    /* JADX INFO: renamed from: a */
    public void m17524a(TResult tresult) {
        C3476a1 c3476a1 = this.f11901a;
        synchronized (c3476a1.f11840a) {
            try {
                if (!c3476a1.f11841b) {
                    c3476a1.f11841b = true;
                    c3476a1.f11842c = tresult;
                    c3476a1.f11840a.notifyAll();
                    c3476a1.m17481a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m17523a(Exception exc) {
        C3476a1 c3476a1 = this.f11901a;
        synchronized (c3476a1.f11840a) {
            try {
                if (!c3476a1.f11841b) {
                    c3476a1.f11841b = true;
                    c3476a1.f11843d = exc;
                    c3476a1.f11840a.notifyAll();
                    c3476a1.m17481a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
