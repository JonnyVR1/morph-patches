package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p149l.hb80;
import p149l.ovf0;
import p149l.qf80;
import p149l.rvc0;
import p149l.yvf;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.p */
/* JADX INFO: loaded from: classes.dex */
final class C1079p<Z> implements rvc0<Z>, yvf.InterfaceC21545f {

    /* JADX INFO: renamed from: e */
    private static final hb80<C1079p<?>> f4549e = yvf.m216209d(20, new a());

    /* JADX INFO: renamed from: a */
    private final ovf0 f4550a = ovf0.m166181a();

    /* JADX INFO: renamed from: b */
    private rvc0<Z> f4551b;

    /* JADX INFO: renamed from: c */
    private boolean f4552c;

    /* JADX INFO: renamed from: d */
    private boolean f4553d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$a */
    public class a implements yvf.InterfaceC21543d<C1079p<?>> {
        @Override // p149l.yvf.InterfaceC21543d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1079p<?> create() {
            return new C1079p<>();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5486b(rvc0<Z> rvc0Var) {
        this.f4553d = false;
        this.f4552c = true;
        this.f4551b = rvc0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <Z> C1079p<Z> m5487c(rvc0<Z> rvc0Var) {
        C1079p<Z> c1079p = (C1079p) qf80.m174276d(f4549e.acquire());
        c1079p.m5486b(rvc0Var);
        return c1079p;
    }

    /* JADX INFO: renamed from: d */
    private void m5488d() {
        this.f4551b = null;
        f4549e.release(this);
    }

    @Override // p149l.yvf.InterfaceC21545f
    @NonNull
    /* JADX INFO: renamed from: a */
    public ovf0 mo5376a() {
        return this.f4550a;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m5489e() {
        this.f4550a.mo166183c();
        if (!this.f4552c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4552c = false;
        if (this.f4553d) {
            recycle();
        }
    }

    @Override // p149l.rvc0
    @NonNull
    public Z get() {
        return this.f4551b.get();
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<Z> getResourceClass() {
        return this.f4551b.getResourceClass();
    }

    @Override // p149l.rvc0
    public int getSize() {
        return this.f4551b.getSize();
    }

    @Override // p149l.rvc0
    public synchronized void recycle() {
        this.f4550a.mo166183c();
        this.f4553d = true;
        if (!this.f4552c) {
            this.f4551b.recycle();
            m5488d();
        }
    }
}
