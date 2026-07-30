package com.cmic.sso.sdk;

import com.cmic.sso.sdk.p022e.C1363c;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c */
/* JADX INFO: loaded from: classes.dex */
public class C1335c {

    /* JADX INFO: renamed from: a */
    private final String f5556a = "LockManager";

    /* JADX INFO: renamed from: b */
    private final Object f5557b = new Object();

    /* JADX INFO: renamed from: c */
    private volatile boolean f5558c = false;

    /* JADX INFO: renamed from: a */
    public void m7084a() {
        C1363c.m7234b("LockManager", "unLockPre");
        synchronized (this.f5557b) {
            try {
                this.f5558c = false;
                this.f5557b.notify();
            } catch (Exception e) {
                e.printStackTrace();
                C1363c.m7232a("LockManager", "unLock error ");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7085a(long j) {
        synchronized (this.f5557b) {
            if (this.f5558c) {
                C1363c.m7234b("LockManager", "wait for pre");
                try {
                    this.f5557b.wait(j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f5558c = true;
            } else {
                this.f5558c = true;
            }
            throw th;
        }
    }
}
