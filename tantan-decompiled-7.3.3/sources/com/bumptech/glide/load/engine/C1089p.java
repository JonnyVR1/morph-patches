package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p153l.mxf;
import p153l.nj80;
import p153l.u3d0;
import p153l.vn80;
import p153l.x3g0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.p */
/* JADX INFO: loaded from: classes.dex */
final class C1089p<Z> implements u3d0<Z>, mxf.InterfaceC18738f {

    /* JADX INFO: renamed from: e */
    private static final nj80<C1089p<?>> f4561e = mxf.m160653d(20, new a());

    /* JADX INFO: renamed from: a */
    private final x3g0 f4562a = x3g0.m209209a();

    /* JADX INFO: renamed from: b */
    private u3d0<Z> f4563b;

    /* JADX INFO: renamed from: c */
    private boolean f4564c;

    /* JADX INFO: renamed from: d */
    private boolean f4565d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$a */
    public class a implements mxf.InterfaceC18736d<C1089p<?>> {
        @Override // p153l.mxf.InterfaceC18736d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1089p<?> create() {
            return new C1089p<>();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5512a(u3d0<Z> u3d0Var) {
        this.f4565d = false;
        this.f4564c = true;
        this.f4563b = u3d0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <Z> C1089p<Z> m5513c(u3d0<Z> u3d0Var) {
        C1089p<Z> c1089p = (C1089p) vn80.m201944d(f4561e.acquire());
        c1089p.m5512a(u3d0Var);
        return c1089p;
    }

    /* JADX INFO: renamed from: d */
    private void m5514d() {
        this.f4563b = null;
        f4561e.release(this);
    }

    @Override // p153l.mxf.InterfaceC18738f
    @NonNull
    /* JADX INFO: renamed from: b */
    public x3g0 mo5402b() {
        return this.f4562a;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m5515e() {
        this.f4562a.mo209211c();
        if (!this.f4564c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4564c = false;
        if (this.f4565d) {
            recycle();
        }
    }

    @Override // p153l.u3d0
    @NonNull
    public Z get() {
        return this.f4563b.get();
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<Z> getResourceClass() {
        return this.f4563b.getResourceClass();
    }

    @Override // p153l.u3d0
    public int getSize() {
        return this.f4563b.getSize();
    }

    @Override // p153l.u3d0
    public synchronized void recycle() {
        this.f4562a.mo209211c();
        this.f4565d = true;
        if (!this.f4564c) {
            this.f4563b.recycle();
            m5514d();
        }
    }
}
