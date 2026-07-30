package com.tencent.liteav.beauty.p093b;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14062a {

    /* JADX INFO: renamed from: a */
    private boolean f58605a = false;

    /* JADX INFO: renamed from: a */
    public synchronized void m83088a() {
        this.f58605a = true;
        notify();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83089b() throws InterruptedException {
        while (!this.f58605a) {
            try {
                wait();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f58605a = false;
    }
}
