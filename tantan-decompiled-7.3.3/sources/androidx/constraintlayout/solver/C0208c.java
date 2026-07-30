package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;
import p153l.c6k;
import p153l.pa00;
import p153l.wx3;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.c */
/* JADX INFO: loaded from: classes.dex */
public class C0208c {

    /* JADX INFO: renamed from: q */
    public static int f1011q = 1000;

    /* JADX INFO: renamed from: r */
    public static pa00 f1012r;

    /* JADX INFO: renamed from: c */
    public a f1015c;

    /* JADX INFO: renamed from: f */
    public C0207b[] f1018f;

    /* JADX INFO: renamed from: l */
    public final wx3 f1024l;

    /* JADX INFO: renamed from: p */
    public final a f1028p;

    /* JADX INFO: renamed from: a */
    public int f1013a = 0;

    /* JADX INFO: renamed from: b */
    public HashMap<String, SolverVariable> f1014b = null;

    /* JADX INFO: renamed from: d */
    public int f1016d = 32;

    /* JADX INFO: renamed from: e */
    public int f1017e = 32;

    /* JADX INFO: renamed from: g */
    public boolean f1019g = false;

    /* JADX INFO: renamed from: h */
    public boolean[] f1020h = new boolean[32];

    /* JADX INFO: renamed from: i */
    public int f1021i = 1;

    /* JADX INFO: renamed from: j */
    public int f1022j = 0;

    /* JADX INFO: renamed from: k */
    public int f1023k = 32;

    /* JADX INFO: renamed from: m */
    public SolverVariable[] f1025m = new SolverVariable[f1011q];

    /* JADX INFO: renamed from: n */
    public int f1026n = 0;

    /* JADX INFO: renamed from: o */
    public C0207b[] f1027o = new C0207b[32];

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo900a(a aVar);

        /* JADX INFO: renamed from: b */
        SolverVariable mo901b(C0208c c0208c, boolean[] zArr);

        /* JADX INFO: renamed from: c */
        void mo902c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();
    }

    public C0208c() {
        this.f1018f = null;
        this.f1018f = new C0207b[32];
        m930E();
        wx3 wx3Var = new wx3();
        this.f1024l = wx3Var;
        this.f1015c = new c6k(wx3Var);
        this.f1028p = new C0207b(wx3Var);
    }

    /* JADX INFO: renamed from: t */
    public static C0207b m924t(C0208c c0208c, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, boolean z) {
        C0207b c0207bM951s = c0208c.m951s();
        if (z) {
            c0208c.m939g(c0207bM951s);
        }
        return c0207bM951s.m908i(solverVariable, solverVariable2, solverVariable3, f);
    }

    /* JADX INFO: renamed from: y */
    public static pa00 m925y() {
        return f1012r;
    }

    /* JADX INFO: renamed from: A */
    public final void m926A() {
        int i = this.f1016d * 2;
        this.f1016d = i;
        this.f1018f = (C0207b[]) Arrays.copyOf(this.f1018f, i);
        wx3 wx3Var = this.f1024l;
        wx3Var.f191361c = (SolverVariable[]) Arrays.copyOf(wx3Var.f191361c, this.f1016d);
        int i2 = this.f1016d;
        this.f1020h = new boolean[i2];
        this.f1017e = i2;
        this.f1023k = i2;
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151207d++;
            pa00Var.f151219p = Math.max(pa00Var.f151219p, i2);
            pa00 pa00Var2 = f1012r;
            pa00Var2.f151203D = pa00Var2.f151219p;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m927B() throws Exception {
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151208e++;
        }
        if (!this.f1019g) {
            m928C(this.f1015c);
            return;
        }
        if (pa00Var != null) {
            pa00Var.f151221r++;
        }
        for (int i = 0; i < this.f1022j; i++) {
            if (!this.f1018f[i].f1010e) {
                m928C(this.f1015c);
                return;
            }
        }
        pa00 pa00Var2 = f1012r;
        if (pa00Var2 != null) {
            pa00Var2.f151220q++;
        }
        m947o();
    }

    /* JADX INFO: renamed from: C */
    public void m928C(a aVar) throws Exception {
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151223t++;
            pa00Var.f151224u = Math.max(pa00Var.f151224u, this.f1021i);
            pa00 pa00Var2 = f1012r;
            pa00Var2.f151225v = Math.max(pa00Var2.f151225v, this.f1022j);
        }
        m932G((C0207b) aVar);
        m953v(aVar);
        m929D(aVar, false);
        m947o();
    }

    /* JADX INFO: renamed from: D */
    public final int m929D(a aVar, boolean z) {
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151211h++;
        }
        for (int i = 0; i < this.f1021i; i++) {
            this.f1020h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            pa00 pa00Var2 = f1012r;
            if (pa00Var2 != null) {
                pa00Var2.f151212i++;
            }
            i2++;
            if (i2 < this.f1021i * 2) {
                if (aVar.getKey() != null) {
                    this.f1020h[aVar.getKey().f986b] = true;
                }
                SolverVariable solverVariableMo901b = aVar.mo901b(this, this.f1020h);
                if (solverVariableMo901b != null) {
                    boolean[] zArr = this.f1020h;
                    int i3 = solverVariableMo901b.f986b;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (solverVariableMo901b != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.f1022j; i5++) {
                        C0207b c0207b = this.f1018f[i5];
                        if (c0207b.f1006a.f991g != SolverVariable.Type.UNRESTRICTED && !c0207b.f1010e && c0207b.m918s(solverVariableMo901b)) {
                            float fM890f = c0207b.f1009d.m890f(solverVariableMo901b);
                            if (fM890f < 0.0f) {
                                float f2 = (-c0207b.f1007b) / fM890f;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        C0207b c0207b2 = this.f1018f[i4];
                        c0207b2.f1006a.f987c = -1;
                        pa00 pa00Var3 = f1012r;
                        if (pa00Var3 != null) {
                            pa00Var3.f151213j++;
                        }
                        c0207b2.m921v(solverVariableMo901b);
                        SolverVariable solverVariable = c0207b2.f1006a;
                        solverVariable.f987c = i4;
                        solverVariable.m884f(c0207b2);
                    }
                }
                z2 = true;
            }
            return i2;
        }
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public final void m930E() {
        int i = 0;
        while (true) {
            C0207b[] c0207bArr = this.f1018f;
            if (i >= c0207bArr.length) {
                return;
            }
            C0207b c0207b = c0207bArr[i];
            if (c0207b != null) {
                this.f1024l.f191359a.release(c0207b);
            }
            this.f1018f[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m931F() {
        wx3 wx3Var;
        int i = 0;
        while (true) {
            wx3Var = this.f1024l;
            SolverVariable[] solverVariableArr = wx3Var.f191361c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.m882d();
            }
            i++;
        }
        wx3Var.f191360b.mo167844a(this.f1025m, this.f1026n);
        this.f1026n = 0;
        Arrays.fill(this.f1024l.f191361c, (Object) null);
        HashMap<String, SolverVariable> map = this.f1014b;
        if (map != null) {
            map.clear();
        }
        this.f1013a = 0;
        this.f1015c.clear();
        this.f1021i = 1;
        for (int i2 = 0; i2 < this.f1022j; i2++) {
            this.f1018f[i2].f1008c = false;
        }
        m930E();
        this.f1022j = 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m932G(C0207b c0207b) {
        if (this.f1022j > 0) {
            c0207b.f1009d.m899o(c0207b, this.f1018f);
            if (c0207b.f1009d.f995a == 0) {
                c0207b.f1010e = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final SolverVariable m933a(SolverVariable.Type type, String str) {
        SolverVariable solverVariableAcquire = this.f1024l.f191360b.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new SolverVariable(type, str);
            solverVariableAcquire.m883e(type, str);
        } else {
            solverVariableAcquire.m882d();
            solverVariableAcquire.m883e(type, str);
        }
        int i = this.f1026n;
        int i2 = f1011q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f1011q = i3;
            this.f1025m = (SolverVariable[]) Arrays.copyOf(this.f1025m, i3);
        }
        SolverVariable[] solverVariableArr = this.f1025m;
        int i4 = this.f1026n;
        this.f1026n = i4 + 1;
        solverVariableArr[i4] = solverVariableAcquire;
        return solverVariableAcquire;
    }

    /* JADX INFO: renamed from: b */
    public void m934b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableM950r = m950r(constraintWidget.mo1019h(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableM950r2 = m950r(constraintWidget.mo1019h(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableM950r3 = m950r(constraintWidget.mo1019h(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableM950r4 = m950r(constraintWidget.mo1019h(type4));
        SolverVariable solverVariableM950r5 = m950r(constraintWidget2.mo1019h(type));
        SolverVariable solverVariableM950r6 = m950r(constraintWidget2.mo1019h(type2));
        SolverVariable solverVariableM950r7 = m950r(constraintWidget2.mo1019h(type3));
        SolverVariable solverVariableM950r8 = m950r(constraintWidget2.mo1019h(type4));
        C0207b c0207bM951s = m951s();
        double d = f;
        double d2 = i;
        c0207bM951s.m915p(solverVariableM950r2, solverVariableM950r4, solverVariableM950r6, solverVariableM950r8, (float) (Math.sin(d) * d2));
        m936d(c0207bM951s);
        C0207b c0207bM951s2 = m951s();
        c0207bM951s2.m915p(solverVariableM950r, solverVariableM950r3, solverVariableM950r5, solverVariableM950r7, (float) (Math.cos(d) * d2));
        m936d(c0207bM951s2);
    }

    /* JADX INFO: renamed from: c */
    public void m935c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        C0207b c0207bM951s = m951s();
        c0207bM951s.m906g(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 6) {
            c0207bM951s.m903d(this, i3);
        }
        m936d(c0207bM951s);
    }

    /* JADX INFO: renamed from: d */
    public void m936d(C0207b c0207b) {
        SolverVariable solverVariableM920u;
        if (c0207b == null) {
            return;
        }
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151209f++;
            if (c0207b.f1010e) {
                pa00Var.f151210g++;
            }
        }
        boolean z = true;
        if (this.f1022j + 1 >= this.f1023k || this.f1021i + 1 >= this.f1017e) {
            m926A();
        }
        boolean z2 = false;
        if (!c0207b.f1010e) {
            m932G(c0207b);
            if (c0207b.m919t()) {
                return;
            }
            c0207b.m916q();
            if (c0207b.m905f(this)) {
                SolverVariable solverVariableM949q = m949q();
                c0207b.f1006a = solverVariableM949q;
                m945m(c0207b);
                this.f1028p.mo900a(c0207b);
                m929D(this.f1028p, true);
                if (solverVariableM949q.f987c == -1) {
                    if (c0207b.f1006a == solverVariableM949q && (solverVariableM920u = c0207b.m920u(solverVariableM949q)) != null) {
                        pa00 pa00Var2 = f1012r;
                        if (pa00Var2 != null) {
                            pa00Var2.f151213j++;
                        }
                        c0207b.m921v(solverVariableM920u);
                    }
                    if (!c0207b.f1010e) {
                        c0207b.f1006a.m884f(c0207b);
                    }
                    this.f1022j--;
                }
            } else {
                z = false;
            }
            if (!c0207b.m917r()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        m945m(c0207b);
    }

    /* JADX INFO: renamed from: e */
    public C0207b m937e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0207b c0207bM951s = m951s();
        c0207bM951s.m912m(solverVariable, solverVariable2, i);
        if (i2 != 6) {
            c0207bM951s.m903d(this, i2);
        }
        m936d(c0207bM951s);
        return c0207bM951s;
    }

    /* JADX INFO: renamed from: f */
    public void m938f(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f987c;
        if (i2 == -1) {
            C0207b c0207bM951s = m951s();
            c0207bM951s.m907h(solverVariable, i);
            m936d(c0207bM951s);
            return;
        }
        C0207b c0207b = this.f1018f[i2];
        if (c0207b.f1010e) {
            c0207b.f1007b = i;
            return;
        }
        if (c0207b.f1009d.f995a == 0) {
            c0207b.f1010e = true;
            c0207b.f1007b = i;
        } else {
            C0207b c0207bM951s2 = m951s();
            c0207bM951s2.m911l(solverVariable, i);
            m936d(c0207bM951s2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m939g(C0207b c0207b) {
        c0207b.m903d(this, 0);
    }

    /* JADX INFO: renamed from: h */
    public void m940h(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C0207b c0207bM951s = m951s();
        SolverVariable solverVariableM952u = m952u();
        solverVariableM952u.f988d = 0;
        c0207bM951s.m913n(solverVariable, solverVariable2, solverVariableM952u, 0);
        if (z) {
            m946n(c0207bM951s, (int) (c0207bM951s.f1009d.m890f(solverVariableM952u) * (-1.0f)), 1);
        }
        m936d(c0207bM951s);
    }

    /* JADX INFO: renamed from: i */
    public void m941i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0207b c0207bM951s = m951s();
        SolverVariable solverVariableM952u = m952u();
        solverVariableM952u.f988d = 0;
        c0207bM951s.m913n(solverVariable, solverVariable2, solverVariableM952u, i);
        if (i2 != 6) {
            m946n(c0207bM951s, (int) (c0207bM951s.f1009d.m890f(solverVariableM952u) * (-1.0f)), i2);
        }
        m936d(c0207bM951s);
    }

    /* JADX INFO: renamed from: j */
    public void m942j(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C0207b c0207bM951s = m951s();
        SolverVariable solverVariableM952u = m952u();
        solverVariableM952u.f988d = 0;
        c0207bM951s.m914o(solverVariable, solverVariable2, solverVariableM952u, 0);
        if (z) {
            m946n(c0207bM951s, (int) (c0207bM951s.f1009d.m890f(solverVariableM952u) * (-1.0f)), 1);
        }
        m936d(c0207bM951s);
    }

    /* JADX INFO: renamed from: k */
    public void m943k(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0207b c0207bM951s = m951s();
        SolverVariable solverVariableM952u = m952u();
        solverVariableM952u.f988d = 0;
        c0207bM951s.m914o(solverVariable, solverVariable2, solverVariableM952u, i);
        if (i2 != 6) {
            m946n(c0207bM951s, (int) (c0207bM951s.f1009d.m890f(solverVariableM952u) * (-1.0f)), i2);
        }
        m936d(c0207bM951s);
    }

    /* JADX INFO: renamed from: l */
    public void m944l(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C0207b c0207bM951s = m951s();
        c0207bM951s.m909j(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 6) {
            c0207bM951s.m903d(this, i);
        }
        m936d(c0207bM951s);
    }

    /* JADX INFO: renamed from: m */
    public final void m945m(C0207b c0207b) {
        C0207b c0207b2 = this.f1018f[this.f1022j];
        if (c0207b2 != null) {
            this.f1024l.f191359a.release(c0207b2);
        }
        C0207b[] c0207bArr = this.f1018f;
        int i = this.f1022j;
        c0207bArr[i] = c0207b;
        SolverVariable solverVariable = c0207b.f1006a;
        solverVariable.f987c = i;
        this.f1022j = i + 1;
        solverVariable.m884f(c0207b);
    }

    /* JADX INFO: renamed from: n */
    public void m946n(C0207b c0207b, int i, int i2) {
        c0207b.m904e(m948p(i2, null), i);
    }

    /* JADX INFO: renamed from: o */
    public final void m947o() {
        for (int i = 0; i < this.f1022j; i++) {
            C0207b c0207b = this.f1018f[i];
            c0207b.f1006a.f989e = c0207b.f1007b;
        }
    }

    /* JADX INFO: renamed from: p */
    public SolverVariable m948p(int i, String str) {
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151216m++;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m926A();
        }
        SolverVariable solverVariableM933a = m933a(SolverVariable.Type.ERROR, str);
        int i2 = this.f1013a + 1;
        this.f1013a = i2;
        this.f1021i++;
        solverVariableM933a.f986b = i2;
        solverVariableM933a.f988d = i;
        this.f1024l.f191361c[i2] = solverVariableM933a;
        this.f1015c.mo902c(solverVariableM933a);
        return solverVariableM933a;
    }

    /* JADX INFO: renamed from: q */
    public SolverVariable m949q() {
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151218o++;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m926A();
        }
        SolverVariable solverVariableM933a = m933a(SolverVariable.Type.SLACK, null);
        int i = this.f1013a + 1;
        this.f1013a = i;
        this.f1021i++;
        solverVariableM933a.f986b = i;
        this.f1024l.f191361c[i] = solverVariableM933a;
        return solverVariableM933a;
    }

    /* JADX INFO: renamed from: r */
    public SolverVariable m950r(Object obj) {
        SolverVariable solverVariableM963g = null;
        if (obj == null) {
            return null;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m926A();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableM963g = constraintAnchor.m963g();
            if (solverVariableM963g == null) {
                constraintAnchor.m970n(this.f1024l);
                solverVariableM963g = constraintAnchor.m963g();
            }
            int i = solverVariableM963g.f986b;
            if (i != -1 && i <= this.f1013a && this.f1024l.f191361c[i] != null) {
                return solverVariableM963g;
            }
            if (i != -1) {
                solverVariableM963g.m882d();
            }
            int i2 = this.f1013a + 1;
            this.f1013a = i2;
            this.f1021i++;
            solverVariableM963g.f986b = i2;
            solverVariableM963g.f991g = SolverVariable.Type.UNRESTRICTED;
            this.f1024l.f191361c[i2] = solverVariableM963g;
        }
        return solverVariableM963g;
    }

    /* JADX INFO: renamed from: s */
    public C0207b m951s() {
        C0207b c0207bAcquire = this.f1024l.f191359a.acquire();
        if (c0207bAcquire == null) {
            c0207bAcquire = new C0207b(this.f1024l);
        } else {
            c0207bAcquire.m922w();
        }
        SolverVariable.m879b();
        return c0207bAcquire;
    }

    /* JADX INFO: renamed from: u */
    public SolverVariable m952u() {
        pa00 pa00Var = f1012r;
        if (pa00Var != null) {
            pa00Var.f151217n++;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m926A();
        }
        SolverVariable solverVariableM933a = m933a(SolverVariable.Type.SLACK, null);
        int i = this.f1013a + 1;
        this.f1013a = i;
        this.f1021i++;
        solverVariableM933a.f986b = i;
        this.f1024l.f191361c[i] = solverVariableM933a;
        return solverVariableM933a;
    }

    /* JADX INFO: renamed from: v */
    public final int m953v(a aVar) throws Exception {
        for (int i = 0; i < this.f1022j; i++) {
            C0207b c0207b = this.f1018f[i];
            if (c0207b.f1006a.f991g != SolverVariable.Type.UNRESTRICTED) {
                float f = 0.0f;
                if (c0207b.f1007b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        pa00 pa00Var = f1012r;
                        long j = 1;
                        if (pa00Var != null) {
                            pa00Var.f151214k++;
                        }
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int i7 = 1;
                            if (i5 >= this.f1022j) {
                                break;
                            }
                            C0207b c0207b2 = this.f1018f[i5];
                            if (c0207b2.f1006a.f991g != SolverVariable.Type.UNRESTRICTED && !c0207b2.f1010e && c0207b2.f1007b < f) {
                                while (i7 < this.f1021i) {
                                    SolverVariable solverVariable = this.f1024l.f191361c[i7];
                                    float fM890f = c0207b2.f1009d.m890f(solverVariable);
                                    if (fM890f > f) {
                                        for (int i8 = 0; i8 < 7; i8++) {
                                            float f3 = solverVariable.f990f[i8] / fM890f;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                f2 = f3;
                                                i3 = i5;
                                                i4 = i7;
                                            }
                                        }
                                    }
                                    i7++;
                                    j = j;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            j = j;
                            f = 0.0f;
                        }
                        long j2 = j;
                        if (i3 != -1) {
                            C0207b c0207b3 = this.f1018f[i3];
                            c0207b3.f1006a.f987c = -1;
                            pa00 pa00Var2 = f1012r;
                            if (pa00Var2 != null) {
                                pa00Var2.f151213j += j2;
                            }
                            c0207b3.m921v(this.f1024l.f191361c[i4]);
                            SolverVariable solverVariable2 = c0207b3.f1006a;
                            solverVariable2.f987c = i3;
                            solverVariable2.m884f(c0207b3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f1021i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public void m954w(pa00 pa00Var) {
        f1012r = pa00Var;
    }

    /* JADX INFO: renamed from: x */
    public wx3 m955x() {
        return this.f1024l;
    }

    /* JADX INFO: renamed from: z */
    public int m956z(Object obj) {
        SolverVariable solverVariableM963g = ((ConstraintAnchor) obj).m963g();
        if (solverVariableM963g != null) {
            return (int) (solverVariableM963g.f989e + 0.5f);
        }
        return 0;
    }
}
