package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yxy0 implements m0z0, buy0 {

    /* JADX INFO: renamed from: a */
    public final Object f202021a;

    /* JADX INFO: renamed from: b */
    public l0z0 f202022b;

    /* JADX INFO: renamed from: c */
    public zty0 f202023c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tyy0 f202024d;

    public yxy0(tyy0 tyy0Var, Object obj) {
        this.f202024d = tyy0Var;
        this.f202022b = tyy0Var.m193546r(null);
        this.f202023c = tyy0Var.m193544p(null);
        this.f202021a = obj;
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: M */
    public final void mo141198M(int i, @Nullable kzy0 kzy0Var, bzy0 bzy0Var, gzy0 gzy0Var) {
        if (m217747g(0, kzy0Var)) {
            this.f202022b.m152413g(bzy0Var, m217746a(gzy0Var, kzy0Var));
        }
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: N */
    public final void mo141199N(int i, @Nullable kzy0 kzy0Var, bzy0 bzy0Var, gzy0 gzy0Var) {
        if (m217747g(0, kzy0Var)) {
            this.f202022b.m152410d(bzy0Var, m217746a(gzy0Var, kzy0Var));
        }
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: P */
    public final void mo141201P(int i, @Nullable kzy0 kzy0Var, bzy0 bzy0Var, gzy0 gzy0Var) {
        if (m217747g(0, kzy0Var)) {
            this.f202022b.m152411e(bzy0Var, m217746a(gzy0Var, kzy0Var));
        }
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: U */
    public final void mo141206U(int i, @Nullable kzy0 kzy0Var, gzy0 gzy0Var) {
        if (m217747g(0, kzy0Var)) {
            this.f202022b.m152409c(m217746a(gzy0Var, kzy0Var));
        }
    }

    /* JADX INFO: renamed from: a */
    public final gzy0 m217746a(gzy0 gzy0Var, @Nullable kzy0 kzy0Var) {
        tyy0 tyy0Var = this.f202024d;
        Object obj = this.f202021a;
        long j = gzy0Var.f107255c;
        tyy0Var.mo179574D(obj, j, kzy0Var);
        tyy0 tyy0Var2 = this.f202024d;
        Object obj2 = this.f202021a;
        long j2 = gzy0Var.f107256d;
        tyy0Var2.mo179574D(obj2, j2, kzy0Var);
        return (j == gzy0Var.f107255c && j2 == gzy0Var.f107256d) ? gzy0Var : new gzy0(1, gzy0Var.f107253a, gzy0Var.f107254b, 0, null, j, j2);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m217747g(int i, @Nullable kzy0 kzy0Var) {
        kzy0 kzy0VarMo170186E;
        if (kzy0Var != null) {
            kzy0VarMo170186E = this.f202024d.mo170186E(this.f202021a, kzy0Var);
            if (kzy0VarMo170186E == null) {
                return false;
            }
        } else {
            kzy0VarMo170186E = null;
        }
        this.f202024d.mo179573C(this.f202021a, 0);
        l0z0 l0z0Var = this.f202022b;
        int i2 = l0z0Var.f129630a;
        if (!mpw0.m159408f(l0z0Var.f129631b, kzy0VarMo170186E)) {
            this.f202022b = this.f202024d.m193547s(0, kzy0VarMo170186E);
        }
        zty0 zty0Var = this.f202023c;
        int i3 = zty0Var.f206070a;
        if (mpw0.m159408f(zty0Var.f206071b, kzy0VarMo170186E)) {
            return true;
        }
        this.f202023c = this.f202024d.m193545q(0, kzy0VarMo170186E);
        return true;
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: w */
    public final void mo141237w(int i, @Nullable kzy0 kzy0Var, bzy0 bzy0Var, gzy0 gzy0Var, IOException iOException, boolean z) {
        if (m217747g(0, kzy0Var)) {
            this.f202022b.m152412f(bzy0Var, m217746a(gzy0Var, kzy0Var), iOException, z);
        }
    }
}
