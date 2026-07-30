package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p153l.kzq;
import p153l.u3d0;
import p153l.vn80;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.m */
/* JADX INFO: loaded from: classes.dex */
class C1086m<Z> implements u3d0<Z> {

    /* JADX INFO: renamed from: a */
    private final boolean f4548a;

    /* JADX INFO: renamed from: b */
    private final boolean f4549b;

    /* JADX INFO: renamed from: c */
    private final u3d0<Z> f4550c;

    /* JADX INFO: renamed from: d */
    private final a f4551d;

    /* JADX INFO: renamed from: e */
    private final kzq f4552e;

    /* JADX INFO: renamed from: f */
    private int f4553f;

    /* JADX INFO: renamed from: g */
    private boolean f4554g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.m$a */
    public interface a {
        /* JADX INFO: renamed from: d */
        void mo5472d(kzq kzqVar, C1086m<?> c1086m);
    }

    public C1086m(u3d0<Z> u3d0Var, boolean z, boolean z2, kzq kzqVar, a aVar) {
        this.f4550c = (u3d0) vn80.m201944d(u3d0Var);
        this.f4548a = z;
        this.f4549b = z2;
        this.f4552e = kzqVar;
        this.f4551d = (a) vn80.m201944d(aVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m5502a() {
        if (this.f4554g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4553f++;
    }

    /* JADX INFO: renamed from: b */
    public u3d0<Z> m5503b() {
        return this.f4550c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m5504c() {
        return this.f4548a;
    }

    /* JADX INFO: renamed from: d */
    public void m5505d() {
        boolean z;
        synchronized (this) {
            int i = this.f4553f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f4553f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f4551d.mo5472d(this.f4552e, this);
        }
    }

    @Override // p153l.u3d0
    @NonNull
    public Z get() {
        return this.f4550c.get();
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<Z> getResourceClass() {
        return this.f4550c.getResourceClass();
    }

    @Override // p153l.u3d0
    public int getSize() {
        return this.f4550c.getSize();
    }

    @Override // p153l.u3d0
    public synchronized void recycle() {
        if (this.f4553f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4554g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4554g = true;
        if (this.f4549b) {
            this.f4550c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4548a + ", listener=" + this.f4551d + ", key=" + this.f4552e + ", acquired=" + this.f4553f + ", isRecycled=" + this.f4554g + ", resource=" + this.f4550c + '}';
    }
}
