package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p149l.kxq;
import p149l.qf80;
import p149l.rvc0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.m */
/* JADX INFO: loaded from: classes.dex */
class C1076m<Z> implements rvc0<Z> {

    /* JADX INFO: renamed from: a */
    private final boolean f4536a;

    /* JADX INFO: renamed from: b */
    private final boolean f4537b;

    /* JADX INFO: renamed from: c */
    private final rvc0<Z> f4538c;

    /* JADX INFO: renamed from: d */
    private final a f4539d;

    /* JADX INFO: renamed from: e */
    private final kxq f4540e;

    /* JADX INFO: renamed from: f */
    private int f4541f;

    /* JADX INFO: renamed from: g */
    private boolean f4542g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.m$a */
    public interface a {
        /* JADX INFO: renamed from: d */
        void mo5446d(kxq kxqVar, C1076m<?> c1076m);
    }

    public C1076m(rvc0<Z> rvc0Var, boolean z, boolean z2, kxq kxqVar, a aVar) {
        this.f4538c = (rvc0) qf80.m174276d(rvc0Var);
        this.f4536a = z;
        this.f4537b = z2;
        this.f4540e = kxqVar;
        this.f4539d = (a) qf80.m174276d(aVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m5476a() {
        if (this.f4542g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4541f++;
    }

    /* JADX INFO: renamed from: b */
    public rvc0<Z> m5477b() {
        return this.f4538c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m5478c() {
        return this.f4536a;
    }

    /* JADX INFO: renamed from: d */
    public void m5479d() {
        boolean z;
        synchronized (this) {
            int i = this.f4541f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f4541f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f4539d.mo5446d(this.f4540e, this);
        }
    }

    @Override // p149l.rvc0
    @NonNull
    public Z get() {
        return this.f4538c.get();
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<Z> getResourceClass() {
        return this.f4538c.getResourceClass();
    }

    @Override // p149l.rvc0
    public int getSize() {
        return this.f4538c.getSize();
    }

    @Override // p149l.rvc0
    public synchronized void recycle() {
        if (this.f4541f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4542g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4542g = true;
        if (this.f4537b) {
            this.f4538c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4536a + ", listener=" + this.f4539d + ", key=" + this.f4540e + ", acquired=" + this.f4541f + ", isRecycled=" + this.f4542g + ", resource=" + this.f4538c + '}';
    }
}
