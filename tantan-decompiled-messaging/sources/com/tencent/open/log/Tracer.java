package com.tencent.open.log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Tracer {

    /* JADX INFO: renamed from: a */
    private volatile int f60262a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f60263b;

    /* JADX INFO: renamed from: c */
    private C14380g f60264c;

    public Tracer(int i, boolean z, C14380g c14380g) {
        this.f60262a = C14376c.f60285a;
        this.f60263b = true;
        this.f60264c = C14380g.f60303a;
        m84320a(i);
        m84323a(z);
        m84322a(c14380g);
    }

    /* JADX INFO: renamed from: a */
    public void m84321a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (m84324d() && C14377d.a.m84355a(this.f60262a, i)) {
            doTrace(i, thread, j, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m84324d() {
        return this.f60263b;
    }

    public abstract void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th);

    /* JADX INFO: renamed from: e */
    public C14380g m84325e() {
        return this.f60264c;
    }

    /* JADX INFO: renamed from: a */
    public void m84320a(int i) {
        this.f60262a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m84323a(boolean z) {
        this.f60263b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m84322a(C14380g c14380g) {
        this.f60264c = c14380g;
    }

    public Tracer() {
        this(C14376c.f60285a, true, C14380g.f60303a);
    }
}
