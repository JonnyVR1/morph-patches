package com.tencent.open.log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Tracer {

    /* JADX INFO: renamed from: a */
    private volatile int f61110a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f61111b;

    /* JADX INFO: renamed from: c */
    private C14543g f61112c;

    public Tracer(int i, boolean z, C14543g c14543g) {
        this.f61110a = C14539c.f61133a;
        this.f61111b = true;
        this.f61112c = C14543g.f61151a;
        m85503a(i);
        m85506a(z);
        m85505a(c14543g);
    }

    /* JADX INFO: renamed from: a */
    public void m85504a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (m85507d() && C14540d.a.m85538a(this.f61110a, i)) {
            doTrace(i, thread, j, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m85507d() {
        return this.f61111b;
    }

    public abstract void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th);

    /* JADX INFO: renamed from: e */
    public C14543g m85508e() {
        return this.f61112c;
    }

    /* JADX INFO: renamed from: a */
    public void m85503a(int i) {
        this.f61110a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m85506a(boolean z) {
        this.f61111b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m85505a(C14543g c14543g) {
        this.f61112c = c14543g;
    }

    public Tracer() {
        this(C14539c.f61133a, true, C14543g.f61151a);
    }
}
