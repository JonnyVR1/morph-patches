package androidx.constraintlayout.solver;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import p149l.xw3;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.b */
/* JADX INFO: loaded from: classes.dex */
public class C0206b implements C0207c.a {

    /* JADX INFO: renamed from: d */
    public final C0205a f1009d;

    /* JADX INFO: renamed from: a */
    public SolverVariable f1006a = null;

    /* JADX INFO: renamed from: b */
    public float f1007b = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f1008c = false;

    /* JADX INFO: renamed from: e */
    public boolean f1010e = false;

    public C0206b(xw3 xw3Var) {
        this.f1009d = new C0205a(this, xw3Var);
    }

    @Override // androidx.constraintlayout.solver.C0207c.a
    /* JADX INFO: renamed from: a */
    public void mo899a(C0207c.a aVar) {
        if (!(aVar instanceof C0206b)) {
            return;
        }
        C0206b c0206b = (C0206b) aVar;
        this.f1006a = null;
        this.f1009d.m886c();
        int i = 0;
        while (true) {
            C0205a c0205a = c0206b.f1009d;
            if (i >= c0205a.f995a) {
                return;
            }
            this.f1009d.m884a(c0205a.m891h(i), c0206b.f1009d.m892i(i), true);
            i++;
        }
    }

    @Override // androidx.constraintlayout.solver.C0207c.a
    /* JADX INFO: renamed from: b */
    public SolverVariable mo900b(C0207c c0207c, boolean[] zArr) {
        return this.f1009d.m890g(zArr, null);
    }

    @Override // androidx.constraintlayout.solver.C0207c.a
    /* JADX INFO: renamed from: c */
    public void mo901c(SolverVariable solverVariable) {
        int i = solverVariable.f988d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f1009d.m895l(solverVariable, f);
    }

    @Override // androidx.constraintlayout.solver.C0207c.a
    public void clear() {
        this.f1009d.m886c();
        this.f1006a = null;
        this.f1007b = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public C0206b m902d(C0207c c0207c, int i) {
        this.f1009d.m895l(c0207c.m947p(i, "ep"), 1.0f);
        this.f1009d.m895l(c0207c.m947p(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0206b m903e(SolverVariable solverVariable, int i) {
        this.f1009d.m895l(solverVariable, i);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public boolean m904f(C0207c c0207c) {
        boolean z;
        SolverVariable solverVariableM885b = this.f1009d.m885b(c0207c);
        if (solverVariableM885b == null) {
            z = true;
        } else {
            m920v(solverVariableM885b);
            z = false;
        }
        if (this.f1009d.f995a == 0) {
            this.f1010e = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public C0206b m905g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f1009d.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable4, 1.0f);
            this.f1009d.m895l(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f1009d.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable2, -1.0f);
            this.f1009d.m895l(solverVariable3, -1.0f);
            this.f1009d.m895l(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f1007b = (-i) + i2;
                return this;
            }
        } else {
            if (f <= 0.0f) {
                this.f1009d.m895l(solverVariable, -1.0f);
                this.f1009d.m895l(solverVariable2, 1.0f);
                this.f1007b = i;
                return this;
            }
            C0205a c0205a = this.f1009d;
            if (f >= 1.0f) {
                c0205a.m895l(solverVariable3, -1.0f);
                this.f1009d.m895l(solverVariable4, 1.0f);
                this.f1007b = i2;
                return this;
            }
            float f2 = 1.0f - f;
            c0205a.m895l(solverVariable, f2 * 1.0f);
            this.f1009d.m895l(solverVariable2, f2 * (-1.0f));
            this.f1009d.m895l(solverVariable3, (-1.0f) * f);
            this.f1009d.m895l(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f1007b = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    @Override // androidx.constraintlayout.solver.C0207c.a
    public SolverVariable getKey() {
        return this.f1006a;
    }

    /* JADX INFO: renamed from: h */
    public C0206b m906h(SolverVariable solverVariable, int i) {
        this.f1006a = solverVariable;
        float f = i;
        solverVariable.f989e = f;
        this.f1007b = f;
        this.f1010e = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C0206b m907i(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.f1009d.m895l(solverVariable, -1.0f);
        this.f1009d.m895l(solverVariable2, 1.0f - f);
        this.f1009d.m895l(solverVariable3, f);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0206b m908j(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f1009d.m895l(solverVariable, -1.0f);
        this.f1009d.m895l(solverVariable2, 1.0f);
        this.f1009d.m895l(solverVariable3, f);
        this.f1009d.m895l(solverVariable4, -f);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C0206b m909k(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f1007b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f1009d.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable2, -1.0f);
            this.f1009d.m895l(solverVariable4, 1.0f);
            this.f1009d.m895l(solverVariable3, -1.0f);
            return this;
        }
        if (f == 0.0f) {
            this.f1009d.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable2, -1.0f);
            return this;
        }
        C0205a c0205a = this.f1009d;
        if (f3 == 0.0f) {
            c0205a.m895l(solverVariable3, 1.0f);
            this.f1009d.m895l(solverVariable4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        c0205a.m895l(solverVariable, 1.0f);
        this.f1009d.m895l(solverVariable2, -1.0f);
        this.f1009d.m895l(solverVariable4, f4);
        this.f1009d.m895l(solverVariable3, -f4);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C0206b m910l(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f1007b = i * (-1);
            this.f1009d.m895l(solverVariable, 1.0f);
            return this;
        }
        this.f1007b = i;
        this.f1009d.m895l(solverVariable, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C0206b m911m(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1007b = i;
        }
        C0205a c0205a = this.f1009d;
        if (z) {
            c0205a.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable2, -1.0f);
            return this;
        }
        c0205a.m895l(solverVariable, -1.0f);
        this.f1009d.m895l(solverVariable2, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C0206b m912n(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1007b = i;
        }
        C0205a c0205a = this.f1009d;
        if (z) {
            c0205a.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable2, -1.0f);
            this.f1009d.m895l(solverVariable3, -1.0f);
            return this;
        }
        c0205a.m895l(solverVariable, -1.0f);
        this.f1009d.m895l(solverVariable2, 1.0f);
        this.f1009d.m895l(solverVariable3, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C0206b m913o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1007b = i;
        }
        C0205a c0205a = this.f1009d;
        if (z) {
            c0205a.m895l(solverVariable, 1.0f);
            this.f1009d.m895l(solverVariable2, -1.0f);
            this.f1009d.m895l(solverVariable3, 1.0f);
            return this;
        }
        c0205a.m895l(solverVariable, -1.0f);
        this.f1009d.m895l(solverVariable2, 1.0f);
        this.f1009d.m895l(solverVariable3, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C0206b m914p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f1009d.m895l(solverVariable3, 0.5f);
        this.f1009d.m895l(solverVariable4, 0.5f);
        this.f1009d.m895l(solverVariable, -0.5f);
        this.f1009d.m895l(solverVariable2, -0.5f);
        this.f1007b = -f;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m915q() {
        float f = this.f1007b;
        if (f < 0.0f) {
            this.f1007b = f * (-1.0f);
            this.f1009d.m893j();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m916r() {
        SolverVariable solverVariable = this.f1006a;
        if (solverVariable != null) {
            return solverVariable.f991g == SolverVariable.Type.UNRESTRICTED || this.f1007b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean m917s(SolverVariable solverVariable) {
        return this.f1009d.m887d(solverVariable);
    }

    /* JADX INFO: renamed from: t */
    public boolean m918t() {
        return this.f1006a == null && this.f1007b == 0.0f && this.f1009d.f995a == 0;
    }

    public String toString() {
        return m922x();
    }

    /* JADX INFO: renamed from: u */
    public SolverVariable m919u(SolverVariable solverVariable) {
        return this.f1009d.m890g(null, solverVariable);
    }

    /* JADX INFO: renamed from: v */
    public void m920v(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1006a;
        if (solverVariable2 != null) {
            this.f1009d.m895l(solverVariable2, -1.0f);
            this.f1006a = null;
        }
        float fM896m = this.f1009d.m896m(solverVariable, true) * (-1.0f);
        this.f1006a = solverVariable;
        if (fM896m == 1.0f) {
            return;
        }
        this.f1007b /= fM896m;
        this.f1009d.m888e(fM896m);
    }

    /* JADX INFO: renamed from: w */
    public void m921w() {
        this.f1006a = null;
        this.f1009d.m886c();
        this.f1007b = 0.0f;
        this.f1010e = false;
    }

    /* JADX INFO: renamed from: x */
    public String m922x() {
        boolean z;
        String strConcat = (this.f1006a == null ? "0" : "" + this.f1006a).concat(" = ");
        if (this.f1007b != 0.0f) {
            strConcat = strConcat + this.f1007b;
            z = true;
        } else {
            z = false;
        }
        int i = this.f1009d.f995a;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableM891h = this.f1009d.m891h(i2);
            if (solverVariableM891h != null) {
                float fM892i = this.f1009d.m892i(i2);
                if (fM892i != 0.0f) {
                    String string = solverVariableM891h.toString();
                    if (z) {
                        if (fM892i > 0.0f) {
                            strConcat = strConcat + " + ";
                        } else {
                            strConcat = strConcat + " - ";
                            fM892i *= -1.0f;
                        }
                    } else if (fM892i < 0.0f) {
                        strConcat = strConcat + "- ";
                        fM892i *= -1.0f;
                    }
                    strConcat = fM892i == 1.0f ? strConcat + string : strConcat + fM892i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string;
                    z = true;
                }
            }
        }
        if (z) {
            return strConcat;
        }
        return strConcat + IdManager.DEFAULT_VERSION_NAME;
    }
}
