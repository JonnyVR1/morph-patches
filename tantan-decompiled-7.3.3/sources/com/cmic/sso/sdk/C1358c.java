package com.cmic.sso.sdk;

import com.cmic.sso.sdk.p023e.C1386c;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c */
/* JADX INFO: loaded from: classes.dex */
public class C1358c {

    /* JADX INFO: renamed from: a */
    private final String f5593a = "LockManager";

    /* JADX INFO: renamed from: b */
    private final Object f5594b = new Object();

    /* JADX INFO: renamed from: c */
    private volatile boolean f5595c = false;

    /* JADX INFO: renamed from: a */
    public void m7138a() {
        C1386c.m7288b("LockManager", "unLockPre");
        synchronized (this.f5594b) {
            try {
                this.f5595c = false;
                this.f5594b.notify();
            } catch (Exception e) {
                e.printStackTrace();
                C1386c.m7286a("LockManager", "unLock error ");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7139a(long j) {
        synchronized (this.f5594b) {
            if (this.f5595c) {
                C1386c.m7288b("LockManager", "wait for pre");
                try {
                    this.f5594b.wait(j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f5595c = true;
            } else {
                this.f5595c = true;
            }
            throw th;
        }
    }
}
