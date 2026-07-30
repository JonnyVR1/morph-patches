package p153l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class syt0 implements k8u0, y6s0 {

    /* JADX INFO: renamed from: a */
    public final q6w0 f171289a;

    /* JADX INFO: renamed from: b */
    public final h7u0 f171290b;

    /* JADX INFO: renamed from: c */
    public final t8u0 f171291c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f171292d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f171293e = new AtomicBoolean();

    public syt0(q6w0 q6w0Var, h7u0 h7u0Var, t8u0 t8u0Var) {
        this.f171289a = q6w0Var;
        this.f171290b = h7u0Var;
        this.f171291c = t8u0Var;
    }

    /* JADX INFO: renamed from: b */
    private final void m188579b() {
        if (this.f171292d.compareAndSet(false, true)) {
            this.f171290b.zza();
        }
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        if (this.f171289a.f155883f == 1 && x6s0Var.f192630j) {
            m188579b();
        }
        if (x6s0Var.f192630j && this.f171293e.compareAndSet(false, true)) {
            this.f171291c.zza();
        }
    }

    @Override // p153l.k8u0
    public final synchronized void zzr() {
        if (this.f171289a.f155883f != 1) {
            m188579b();
        }
    }
}
