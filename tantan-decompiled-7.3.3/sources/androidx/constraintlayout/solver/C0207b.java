package androidx.constraintlayout.solver;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import p153l.wx3;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.b */
/* JADX INFO: loaded from: classes.dex */
public class C0207b implements C0208c.a {

    /* JADX INFO: renamed from: d */
    public final C0206a f1009d;

    /* JADX INFO: renamed from: a */
    public SolverVariable f1006a = null;

    /* JADX INFO: renamed from: b */
    public float f1007b = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f1008c = false;

    /* JADX INFO: renamed from: e */
    public boolean f1010e = false;

    public C0207b(wx3 wx3Var) {
        this.f1009d = new C0206a(this, wx3Var);
    }

    @Override // androidx.constraintlayout.solver.C0208c.a
    /* JADX INFO: renamed from: a */
    public void mo900a(C0208c.a aVar) {
        if (!(aVar instanceof C0207b)) {
            return;
        }
        C0207b c0207b = (C0207b) aVar;
        this.f1006a = null;
        this.f1009d.m887c();
        int i = 0;
        while (true) {
            C0206a c0206a = c0207b.f1009d;
            if (i >= c0206a.f995a) {
                return;
            }
            this.f1009d.m885a(c0206a.m892h(i), c0207b.f1009d.m893i(i), true);
            i++;
        }
    }

    @Override // androidx.constraintlayout.solver.C0208c.a
    /* JADX INFO: renamed from: b */
    public SolverVariable mo901b(C0208c c0208c, boolean[] zArr) {
        return this.f1009d.m891g(zArr, null);
    }

    @Override // androidx.constraintlayout.solver.C0208c.a
    /* JADX INFO: renamed from: c */
    public void mo902c(SolverVariable solverVariable) {
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
        this.f1009d.m896l(solverVariable, f);
    }

    @Override // androidx.constraintlayout.solver.C0208c.a
    public void clear() {
        this.f1009d.m887c();
        this.f1006a = null;
        this.f1007b = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public C0207b m903d(C0208c c0208c, int i) {
        this.f1009d.m896l(c0208c.m948p(i, "ep"), 1.0f);
        this.f1009d.m896l(c0208c.m948p(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0207b m904e(SolverVariable solverVariable, int i) {
        this.f1009d.m896l(solverVariable, i);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public boolean m905f(C0208c c0208c) {
        boolean z;
        SolverVariable solverVariableM886b = this.f1009d.m886b(c0208c);
        if (solverVariableM886b == null) {
            z = true;
        } else {
            m921v(solverVariableM886b);
            z = false;
        }
        if (this.f1009d.f995a == 0) {
            this.f1010e = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public C0207b m906g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f1009d.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable4, 1.0f);
            this.f1009d.m896l(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f1009d.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable2, -1.0f);
            this.f1009d.m896l(solverVariable3, -1.0f);
            this.f1009d.m896l(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f1007b = (-i) + i2;
                return this;
            }
        } else {
            if (f <= 0.0f) {
                this.f1009d.m896l(solverVariable, -1.0f);
                this.f1009d.m896l(solverVariable2, 1.0f);
                this.f1007b = i;
                return this;
            }
            C0206a c0206a = this.f1009d;
            if (f >= 1.0f) {
                c0206a.m896l(solverVariable3, -1.0f);
                this.f1009d.m896l(solverVariable4, 1.0f);
                this.f1007b = i2;
                return this;
            }
            float f2 = 1.0f - f;
            c0206a.m896l(solverVariable, f2 * 1.0f);
            this.f1009d.m896l(solverVariable2, f2 * (-1.0f));
            this.f1009d.m896l(solverVariable3, (-1.0f) * f);
            this.f1009d.m896l(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f1007b = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    @Override // androidx.constraintlayout.solver.C0208c.a
    public SolverVariable getKey() {
        return this.f1006a;
    }

    /* JADX INFO: renamed from: h */
    public C0207b m907h(SolverVariable solverVariable, int i) {
        this.f1006a = solverVariable;
        float f = i;
        solverVariable.f989e = f;
        this.f1007b = f;
        this.f1010e = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C0207b m908i(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.f1009d.m896l(solverVariable, -1.0f);
        this.f1009d.m896l(solverVariable2, 1.0f - f);
        this.f1009d.m896l(solverVariable3, f);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0207b m909j(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f1009d.m896l(solverVariable, -1.0f);
        this.f1009d.m896l(solverVariable2, 1.0f);
        this.f1009d.m896l(solverVariable3, f);
        this.f1009d.m896l(solverVariable4, -f);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C0207b m910k(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f1007b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f1009d.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable2, -1.0f);
            this.f1009d.m896l(solverVariable4, 1.0f);
            this.f1009d.m896l(solverVariable3, -1.0f);
            return this;
        }
        if (f == 0.0f) {
            this.f1009d.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable2, -1.0f);
            return this;
        }
        C0206a c0206a = this.f1009d;
        if (f3 == 0.0f) {
            c0206a.m896l(solverVariable3, 1.0f);
            this.f1009d.m896l(solverVariable4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        c0206a.m896l(solverVariable, 1.0f);
        this.f1009d.m896l(solverVariable2, -1.0f);
        this.f1009d.m896l(solverVariable4, f4);
        this.f1009d.m896l(solverVariable3, -f4);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C0207b m911l(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f1007b = i * (-1);
            this.f1009d.m896l(solverVariable, 1.0f);
            return this;
        }
        this.f1007b = i;
        this.f1009d.m896l(solverVariable, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C0207b m912m(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1007b = i;
        }
        C0206a c0206a = this.f1009d;
        if (z) {
            c0206a.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable2, -1.0f);
            return this;
        }
        c0206a.m896l(solverVariable, -1.0f);
        this.f1009d.m896l(solverVariable2, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C0207b m913n(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1007b = i;
        }
        C0206a c0206a = this.f1009d;
        if (z) {
            c0206a.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable2, -1.0f);
            this.f1009d.m896l(solverVariable3, -1.0f);
            return this;
        }
        c0206a.m896l(solverVariable, -1.0f);
        this.f1009d.m896l(solverVariable2, 1.0f);
        this.f1009d.m896l(solverVariable3, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C0207b m914o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1007b = i;
        }
        C0206a c0206a = this.f1009d;
        if (z) {
            c0206a.m896l(solverVariable, 1.0f);
            this.f1009d.m896l(solverVariable2, -1.0f);
            this.f1009d.m896l(solverVariable3, 1.0f);
            return this;
        }
        c0206a.m896l(solverVariable, -1.0f);
        this.f1009d.m896l(solverVariable2, 1.0f);
        this.f1009d.m896l(solverVariable3, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C0207b m915p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f1009d.m896l(solverVariable3, 0.5f);
        this.f1009d.m896l(solverVariable4, 0.5f);
        this.f1009d.m896l(solverVariable, -0.5f);
        this.f1009d.m896l(solverVariable2, -0.5f);
        this.f1007b = -f;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m916q() {
        float f = this.f1007b;
        if (f < 0.0f) {
            this.f1007b = f * (-1.0f);
            this.f1009d.m894j();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m917r() {
        SolverVariable solverVariable = this.f1006a;
        if (solverVariable != null) {
            return solverVariable.f991g == SolverVariable.Type.UNRESTRICTED || this.f1007b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean m918s(SolverVariable solverVariable) {
        return this.f1009d.m888d(solverVariable);
    }

    /* JADX INFO: renamed from: t */
    public boolean m919t() {
        return this.f1006a == null && this.f1007b == 0.0f && this.f1009d.f995a == 0;
    }

    public String toString() {
        return m923x();
    }

    /* JADX INFO: renamed from: u */
    public SolverVariable m920u(SolverVariable solverVariable) {
        return this.f1009d.m891g(null, solverVariable);
    }

    /* JADX INFO: renamed from: v */
    public void m921v(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1006a;
        if (solverVariable2 != null) {
            this.f1009d.m896l(solverVariable2, -1.0f);
            this.f1006a = null;
        }
        float fM897m = this.f1009d.m897m(solverVariable, true) * (-1.0f);
        this.f1006a = solverVariable;
        if (fM897m == 1.0f) {
            return;
        }
        this.f1007b /= fM897m;
        this.f1009d.m889e(fM897m);
    }

    /* JADX INFO: renamed from: w */
    public void m922w() {
        this.f1006a = null;
        this.f1009d.m887c();
        this.f1007b = 0.0f;
        this.f1010e = false;
    }

    /* JADX INFO: renamed from: x */
    public String m923x() {
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
            SolverVariable solverVariableM892h = this.f1009d.m892h(i2);
            if (solverVariableM892h != null) {
                float fM893i = this.f1009d.m893i(i2);
                if (fM893i != 0.0f) {
                    String string = solverVariableM892h.toString();
                    if (z) {
                        if (fM893i > 0.0f) {
                            strConcat = strConcat + " + ";
                        } else {
                            strConcat = strConcat + " - ";
                            fM893i *= -1.0f;
                        }
                    } else if (fM893i < 0.0f) {
                        strConcat = strConcat + "- ";
                        fM893i *= -1.0f;
                    }
                    strConcat = fM893i == 1.0f ? strConcat + string : strConcat + fM893i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string;
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
