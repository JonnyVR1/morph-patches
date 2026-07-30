package com.tencent.liteav.beauty.p098b;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14225a {

    /* JADX INFO: renamed from: a */
    private boolean f59453a = false;

    /* JADX INFO: renamed from: a */
    public synchronized void m84271a() {
        this.f59453a = true;
        notify();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84272b() throws InterruptedException {
        while (!this.f59453a) {
            try {
                wait();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f59453a = false;
    }
}
