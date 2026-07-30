package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class soy0 implements gry0, vky0 {

    /* JADX INFO: renamed from: a */
    public final Object f165731a;

    /* JADX INFO: renamed from: b */
    public fry0 f165732b;

    /* JADX INFO: renamed from: c */
    public tky0 f165733c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ npy0 f165734d;

    public soy0(npy0 npy0Var, Object obj) {
        this.f165734d = npy0Var;
        this.f165732b = npy0Var.m160434r(null);
        this.f165733c = npy0Var.m160432p(null);
        this.f165731a = obj;
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: M */
    public final void mo106370M(int i, @Nullable eqy0 eqy0Var, vpy0 vpy0Var, aqy0 aqy0Var) {
        if (m185312g(0, eqy0Var)) {
            this.f165732b.m122913g(vpy0Var, m185311a(aqy0Var, eqy0Var));
        }
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: N */
    public final void mo106371N(int i, @Nullable eqy0 eqy0Var, vpy0 vpy0Var, aqy0 aqy0Var) {
        if (m185312g(0, eqy0Var)) {
            this.f165732b.m122910d(vpy0Var, m185311a(aqy0Var, eqy0Var));
        }
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: P */
    public final void mo106373P(int i, @Nullable eqy0 eqy0Var, vpy0 vpy0Var, aqy0 aqy0Var) {
        if (m185312g(0, eqy0Var)) {
            this.f165732b.m122911e(vpy0Var, m185311a(aqy0Var, eqy0Var));
        }
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: U */
    public final void mo106378U(int i, @Nullable eqy0 eqy0Var, aqy0 aqy0Var) {
        if (m185312g(0, eqy0Var)) {
            this.f165732b.m122909c(m185311a(aqy0Var, eqy0Var));
        }
    }

    /* JADX INFO: renamed from: a */
    public final aqy0 m185311a(aqy0 aqy0Var, @Nullable eqy0 eqy0Var) {
        npy0 npy0Var = this.f165734d;
        Object obj = this.f165731a;
        long j = aqy0Var.f71222c;
        npy0Var.mo151758D(obj, j, eqy0Var);
        npy0 npy0Var2 = this.f165734d;
        Object obj2 = this.f165731a;
        long j2 = aqy0Var.f71223d;
        npy0Var2.mo151758D(obj2, j2, eqy0Var);
        return (j == aqy0Var.f71222c && j2 == aqy0Var.f71223d) ? aqy0Var : new aqy0(1, aqy0Var.f71220a, aqy0Var.f71221b, 0, null, j, j2);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m185312g(int i, @Nullable eqy0 eqy0Var) {
        eqy0 eqy0VarMo142979E;
        if (eqy0Var != null) {
            eqy0VarMo142979E = this.f165734d.mo142979E(this.f165731a, eqy0Var);
            if (eqy0VarMo142979E == null) {
                return false;
            }
        } else {
            eqy0VarMo142979E = null;
        }
        this.f165734d.mo151757C(this.f165731a, 0);
        fry0 fry0Var = this.f165732b;
        int i2 = fry0Var.f99019a;
        if (!ggw0.m126064f(fry0Var.f99020b, eqy0VarMo142979E)) {
            this.f165732b = this.f165734d.m160435s(0, eqy0VarMo142979E);
        }
        tky0 tky0Var = this.f165733c;
        int i3 = tky0Var.f170928a;
        if (ggw0.m126064f(tky0Var.f170929b, eqy0VarMo142979E)) {
            return true;
        }
        this.f165733c = this.f165734d.m160433q(0, eqy0VarMo142979E);
        return true;
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: w */
    public final void mo106410w(int i, @Nullable eqy0 eqy0Var, vpy0 vpy0Var, aqy0 aqy0Var, IOException iOException, boolean z) {
        if (m185312g(0, eqy0Var)) {
            this.f165732b.m122912f(vpy0Var, m185311a(aqy0Var, eqy0Var), iOException, z);
        }
    }
}
