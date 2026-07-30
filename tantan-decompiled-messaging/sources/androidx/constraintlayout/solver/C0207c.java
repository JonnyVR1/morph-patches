package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;
import p149l.k3k;
import p149l.s100;
import p149l.xw3;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.c */
/* JADX INFO: loaded from: classes.dex */
public class C0207c {

    /* JADX INFO: renamed from: q */
    public static int f1011q = 1000;

    /* JADX INFO: renamed from: r */
    public static s100 f1012r;

    /* JADX INFO: renamed from: c */
    public a f1015c;

    /* JADX INFO: renamed from: f */
    public C0206b[] f1018f;

    /* JADX INFO: renamed from: l */
    public final xw3 f1024l;

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
    public C0206b[] f1027o = new C0206b[32];

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo899a(a aVar);

        /* JADX INFO: renamed from: b */
        SolverVariable mo900b(C0207c c0207c, boolean[] zArr);

        /* JADX INFO: renamed from: c */
        void mo901c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();
    }

    public C0207c() {
        this.f1018f = null;
        this.f1018f = new C0206b[32];
        m929E();
        xw3 xw3Var = new xw3();
        this.f1024l = xw3Var;
        this.f1015c = new k3k(xw3Var);
        this.f1028p = new C0206b(xw3Var);
    }

    /* JADX INFO: renamed from: t */
    public static C0206b m923t(C0207c c0207c, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, boolean z) {
        C0206b c0206bM950s = c0207c.m950s();
        if (z) {
            c0207c.m938g(c0206bM950s);
        }
        return c0206bM950s.m907i(solverVariable, solverVariable2, solverVariable3, f);
    }

    /* JADX INFO: renamed from: y */
    public static s100 m924y() {
        return f1012r;
    }

    /* JADX INFO: renamed from: A */
    public final void m925A() {
        int i = this.f1016d * 2;
        this.f1016d = i;
        this.f1018f = (C0206b[]) Arrays.copyOf(this.f1018f, i);
        xw3 xw3Var = this.f1024l;
        xw3Var.f194691c = (SolverVariable[]) Arrays.copyOf(xw3Var.f194691c, this.f1016d);
        int i2 = this.f1016d;
        this.f1020h = new boolean[i2];
        this.f1017e = i2;
        this.f1023k = i2;
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161836d++;
            s100Var.f161848p = Math.max(s100Var.f161848p, i2);
            s100 s100Var2 = f1012r;
            s100Var2.f161832D = s100Var2.f161848p;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m926B() throws Exception {
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161837e++;
        }
        if (!this.f1019g) {
            m927C(this.f1015c);
            return;
        }
        if (s100Var != null) {
            s100Var.f161850r++;
        }
        for (int i = 0; i < this.f1022j; i++) {
            if (!this.f1018f[i].f1010e) {
                m927C(this.f1015c);
                return;
            }
        }
        s100 s100Var2 = f1012r;
        if (s100Var2 != null) {
            s100Var2.f161849q++;
        }
        m946o();
    }

    /* JADX INFO: renamed from: C */
    public void m927C(a aVar) throws Exception {
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161852t++;
            s100Var.f161853u = Math.max(s100Var.f161853u, this.f1021i);
            s100 s100Var2 = f1012r;
            s100Var2.f161854v = Math.max(s100Var2.f161854v, this.f1022j);
        }
        m931G((C0206b) aVar);
        m952v(aVar);
        m928D(aVar, false);
        m946o();
    }

    /* JADX INFO: renamed from: D */
    public final int m928D(a aVar, boolean z) {
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161840h++;
        }
        for (int i = 0; i < this.f1021i; i++) {
            this.f1020h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            s100 s100Var2 = f1012r;
            if (s100Var2 != null) {
                s100Var2.f161841i++;
            }
            i2++;
            if (i2 < this.f1021i * 2) {
                if (aVar.getKey() != null) {
                    this.f1020h[aVar.getKey().f986b] = true;
                }
                SolverVariable solverVariableMo900b = aVar.mo900b(this, this.f1020h);
                if (solverVariableMo900b != null) {
                    boolean[] zArr = this.f1020h;
                    int i3 = solverVariableMo900b.f986b;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (solverVariableMo900b != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.f1022j; i5++) {
                        C0206b c0206b = this.f1018f[i5];
                        if (c0206b.f1006a.f991g != SolverVariable.Type.UNRESTRICTED && !c0206b.f1010e && c0206b.m917s(solverVariableMo900b)) {
                            float fM889f = c0206b.f1009d.m889f(solverVariableMo900b);
                            if (fM889f < 0.0f) {
                                float f2 = (-c0206b.f1007b) / fM889f;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        C0206b c0206b2 = this.f1018f[i4];
                        c0206b2.f1006a.f987c = -1;
                        s100 s100Var3 = f1012r;
                        if (s100Var3 != null) {
                            s100Var3.f161842j++;
                        }
                        c0206b2.m920v(solverVariableMo900b);
                        SolverVariable solverVariable = c0206b2.f1006a;
                        solverVariable.f987c = i4;
                        solverVariable.m883f(c0206b2);
                    }
                }
                z2 = true;
            }
            return i2;
        }
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public final void m929E() {
        int i = 0;
        while (true) {
            C0206b[] c0206bArr = this.f1018f;
            if (i >= c0206bArr.length) {
                return;
            }
            C0206b c0206b = c0206bArr[i];
            if (c0206b != null) {
                this.f1024l.f194689a.release(c0206b);
            }
            this.f1018f[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m930F() {
        xw3 xw3Var;
        int i = 0;
        while (true) {
            xw3Var = this.f1024l;
            SolverVariable[] solverVariableArr = xw3Var.f194691c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.m881d();
            }
            i++;
        }
        xw3Var.f194690b.mo135252a(this.f1025m, this.f1026n);
        this.f1026n = 0;
        Arrays.fill(this.f1024l.f194691c, (Object) null);
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
        m929E();
        this.f1022j = 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m931G(C0206b c0206b) {
        if (this.f1022j > 0) {
            c0206b.f1009d.m898o(c0206b, this.f1018f);
            if (c0206b.f1009d.f995a == 0) {
                c0206b.f1010e = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final SolverVariable m932a(SolverVariable.Type type, String str) {
        SolverVariable solverVariableAcquire = this.f1024l.f194690b.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new SolverVariable(type, str);
            solverVariableAcquire.m882e(type, str);
        } else {
            solverVariableAcquire.m881d();
            solverVariableAcquire.m882e(type, str);
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
    public void m933b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableM949r = m949r(constraintWidget.mo1018h(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableM949r2 = m949r(constraintWidget.mo1018h(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableM949r3 = m949r(constraintWidget.mo1018h(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableM949r4 = m949r(constraintWidget.mo1018h(type4));
        SolverVariable solverVariableM949r5 = m949r(constraintWidget2.mo1018h(type));
        SolverVariable solverVariableM949r6 = m949r(constraintWidget2.mo1018h(type2));
        SolverVariable solverVariableM949r7 = m949r(constraintWidget2.mo1018h(type3));
        SolverVariable solverVariableM949r8 = m949r(constraintWidget2.mo1018h(type4));
        C0206b c0206bM950s = m950s();
        double d = f;
        double d2 = i;
        c0206bM950s.m914p(solverVariableM949r2, solverVariableM949r4, solverVariableM949r6, solverVariableM949r8, (float) (Math.sin(d) * d2));
        m935d(c0206bM950s);
        C0206b c0206bM950s2 = m950s();
        c0206bM950s2.m914p(solverVariableM949r, solverVariableM949r3, solverVariableM949r5, solverVariableM949r7, (float) (Math.cos(d) * d2));
        m935d(c0206bM950s2);
    }

    /* JADX INFO: renamed from: c */
    public void m934c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        C0206b c0206bM950s = m950s();
        c0206bM950s.m905g(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 6) {
            c0206bM950s.m902d(this, i3);
        }
        m935d(c0206bM950s);
    }

    /* JADX INFO: renamed from: d */
    public void m935d(C0206b c0206b) {
        SolverVariable solverVariableM919u;
        if (c0206b == null) {
            return;
        }
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161838f++;
            if (c0206b.f1010e) {
                s100Var.f161839g++;
            }
        }
        boolean z = true;
        if (this.f1022j + 1 >= this.f1023k || this.f1021i + 1 >= this.f1017e) {
            m925A();
        }
        boolean z2 = false;
        if (!c0206b.f1010e) {
            m931G(c0206b);
            if (c0206b.m918t()) {
                return;
            }
            c0206b.m915q();
            if (c0206b.m904f(this)) {
                SolverVariable solverVariableM948q = m948q();
                c0206b.f1006a = solverVariableM948q;
                m944m(c0206b);
                this.f1028p.mo899a(c0206b);
                m928D(this.f1028p, true);
                if (solverVariableM948q.f987c == -1) {
                    if (c0206b.f1006a == solverVariableM948q && (solverVariableM919u = c0206b.m919u(solverVariableM948q)) != null) {
                        s100 s100Var2 = f1012r;
                        if (s100Var2 != null) {
                            s100Var2.f161842j++;
                        }
                        c0206b.m920v(solverVariableM919u);
                    }
                    if (!c0206b.f1010e) {
                        c0206b.f1006a.m883f(c0206b);
                    }
                    this.f1022j--;
                }
            } else {
                z = false;
            }
            if (!c0206b.m916r()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        m944m(c0206b);
    }

    /* JADX INFO: renamed from: e */
    public C0206b m936e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0206b c0206bM950s = m950s();
        c0206bM950s.m911m(solverVariable, solverVariable2, i);
        if (i2 != 6) {
            c0206bM950s.m902d(this, i2);
        }
        m935d(c0206bM950s);
        return c0206bM950s;
    }

    /* JADX INFO: renamed from: f */
    public void m937f(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f987c;
        if (i2 == -1) {
            C0206b c0206bM950s = m950s();
            c0206bM950s.m906h(solverVariable, i);
            m935d(c0206bM950s);
            return;
        }
        C0206b c0206b = this.f1018f[i2];
        if (c0206b.f1010e) {
            c0206b.f1007b = i;
            return;
        }
        if (c0206b.f1009d.f995a == 0) {
            c0206b.f1010e = true;
            c0206b.f1007b = i;
        } else {
            C0206b c0206bM950s2 = m950s();
            c0206bM950s2.m910l(solverVariable, i);
            m935d(c0206bM950s2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m938g(C0206b c0206b) {
        c0206b.m902d(this, 0);
    }

    /* JADX INFO: renamed from: h */
    public void m939h(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C0206b c0206bM950s = m950s();
        SolverVariable solverVariableM951u = m951u();
        solverVariableM951u.f988d = 0;
        c0206bM950s.m912n(solverVariable, solverVariable2, solverVariableM951u, 0);
        if (z) {
            m945n(c0206bM950s, (int) (c0206bM950s.f1009d.m889f(solverVariableM951u) * (-1.0f)), 1);
        }
        m935d(c0206bM950s);
    }

    /* JADX INFO: renamed from: i */
    public void m940i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0206b c0206bM950s = m950s();
        SolverVariable solverVariableM951u = m951u();
        solverVariableM951u.f988d = 0;
        c0206bM950s.m912n(solverVariable, solverVariable2, solverVariableM951u, i);
        if (i2 != 6) {
            m945n(c0206bM950s, (int) (c0206bM950s.f1009d.m889f(solverVariableM951u) * (-1.0f)), i2);
        }
        m935d(c0206bM950s);
    }

    /* JADX INFO: renamed from: j */
    public void m941j(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C0206b c0206bM950s = m950s();
        SolverVariable solverVariableM951u = m951u();
        solverVariableM951u.f988d = 0;
        c0206bM950s.m913o(solverVariable, solverVariable2, solverVariableM951u, 0);
        if (z) {
            m945n(c0206bM950s, (int) (c0206bM950s.f1009d.m889f(solverVariableM951u) * (-1.0f)), 1);
        }
        m935d(c0206bM950s);
    }

    /* JADX INFO: renamed from: k */
    public void m942k(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0206b c0206bM950s = m950s();
        SolverVariable solverVariableM951u = m951u();
        solverVariableM951u.f988d = 0;
        c0206bM950s.m913o(solverVariable, solverVariable2, solverVariableM951u, i);
        if (i2 != 6) {
            m945n(c0206bM950s, (int) (c0206bM950s.f1009d.m889f(solverVariableM951u) * (-1.0f)), i2);
        }
        m935d(c0206bM950s);
    }

    /* JADX INFO: renamed from: l */
    public void m943l(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C0206b c0206bM950s = m950s();
        c0206bM950s.m908j(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 6) {
            c0206bM950s.m902d(this, i);
        }
        m935d(c0206bM950s);
    }

    /* JADX INFO: renamed from: m */
    public final void m944m(C0206b c0206b) {
        C0206b c0206b2 = this.f1018f[this.f1022j];
        if (c0206b2 != null) {
            this.f1024l.f194689a.release(c0206b2);
        }
        C0206b[] c0206bArr = this.f1018f;
        int i = this.f1022j;
        c0206bArr[i] = c0206b;
        SolverVariable solverVariable = c0206b.f1006a;
        solverVariable.f987c = i;
        this.f1022j = i + 1;
        solverVariable.m883f(c0206b);
    }

    /* JADX INFO: renamed from: n */
    public void m945n(C0206b c0206b, int i, int i2) {
        c0206b.m903e(m947p(i2, null), i);
    }

    /* JADX INFO: renamed from: o */
    public final void m946o() {
        for (int i = 0; i < this.f1022j; i++) {
            C0206b c0206b = this.f1018f[i];
            c0206b.f1006a.f989e = c0206b.f1007b;
        }
    }

    /* JADX INFO: renamed from: p */
    public SolverVariable m947p(int i, String str) {
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161845m++;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m925A();
        }
        SolverVariable solverVariableM932a = m932a(SolverVariable.Type.ERROR, str);
        int i2 = this.f1013a + 1;
        this.f1013a = i2;
        this.f1021i++;
        solverVariableM932a.f986b = i2;
        solverVariableM932a.f988d = i;
        this.f1024l.f194691c[i2] = solverVariableM932a;
        this.f1015c.mo901c(solverVariableM932a);
        return solverVariableM932a;
    }

    /* JADX INFO: renamed from: q */
    public SolverVariable m948q() {
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161847o++;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m925A();
        }
        SolverVariable solverVariableM932a = m932a(SolverVariable.Type.SLACK, null);
        int i = this.f1013a + 1;
        this.f1013a = i;
        this.f1021i++;
        solverVariableM932a.f986b = i;
        this.f1024l.f194691c[i] = solverVariableM932a;
        return solverVariableM932a;
    }

    /* JADX INFO: renamed from: r */
    public SolverVariable m949r(Object obj) {
        SolverVariable solverVariableM962g = null;
        if (obj == null) {
            return null;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m925A();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableM962g = constraintAnchor.m962g();
            if (solverVariableM962g == null) {
                constraintAnchor.m969n(this.f1024l);
                solverVariableM962g = constraintAnchor.m962g();
            }
            int i = solverVariableM962g.f986b;
            if (i != -1 && i <= this.f1013a && this.f1024l.f194691c[i] != null) {
                return solverVariableM962g;
            }
            if (i != -1) {
                solverVariableM962g.m881d();
            }
            int i2 = this.f1013a + 1;
            this.f1013a = i2;
            this.f1021i++;
            solverVariableM962g.f986b = i2;
            solverVariableM962g.f991g = SolverVariable.Type.UNRESTRICTED;
            this.f1024l.f194691c[i2] = solverVariableM962g;
        }
        return solverVariableM962g;
    }

    /* JADX INFO: renamed from: s */
    public C0206b m950s() {
        C0206b c0206bAcquire = this.f1024l.f194689a.acquire();
        if (c0206bAcquire == null) {
            c0206bAcquire = new C0206b(this.f1024l);
        } else {
            c0206bAcquire.m921w();
        }
        SolverVariable.m878b();
        return c0206bAcquire;
    }

    /* JADX INFO: renamed from: u */
    public SolverVariable m951u() {
        s100 s100Var = f1012r;
        if (s100Var != null) {
            s100Var.f161846n++;
        }
        if (this.f1021i + 1 >= this.f1017e) {
            m925A();
        }
        SolverVariable solverVariableM932a = m932a(SolverVariable.Type.SLACK, null);
        int i = this.f1013a + 1;
        this.f1013a = i;
        this.f1021i++;
        solverVariableM932a.f986b = i;
        this.f1024l.f194691c[i] = solverVariableM932a;
        return solverVariableM932a;
    }

    /* JADX INFO: renamed from: v */
    public final int m952v(a aVar) throws Exception {
        for (int i = 0; i < this.f1022j; i++) {
            C0206b c0206b = this.f1018f[i];
            if (c0206b.f1006a.f991g != SolverVariable.Type.UNRESTRICTED) {
                float f = 0.0f;
                if (c0206b.f1007b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        s100 s100Var = f1012r;
                        long j = 1;
                        if (s100Var != null) {
                            s100Var.f161843k++;
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
                            C0206b c0206b2 = this.f1018f[i5];
                            if (c0206b2.f1006a.f991g != SolverVariable.Type.UNRESTRICTED && !c0206b2.f1010e && c0206b2.f1007b < f) {
                                while (i7 < this.f1021i) {
                                    SolverVariable solverVariable = this.f1024l.f194691c[i7];
                                    float fM889f = c0206b2.f1009d.m889f(solverVariable);
                                    if (fM889f > f) {
                                        for (int i8 = 0; i8 < 7; i8++) {
                                            float f3 = solverVariable.f990f[i8] / fM889f;
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
                            C0206b c0206b3 = this.f1018f[i3];
                            c0206b3.f1006a.f987c = -1;
                            s100 s100Var2 = f1012r;
                            if (s100Var2 != null) {
                                s100Var2.f161842j += j2;
                            }
                            c0206b3.m920v(this.f1024l.f194691c[i4]);
                            SolverVariable solverVariable2 = c0206b3.f1006a;
                            solverVariable2.f987c = i3;
                            solverVariable2.m883f(c0206b3);
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
    public void m953w(s100 s100Var) {
        f1012r = s100Var;
    }

    /* JADX INFO: renamed from: x */
    public xw3 m954x() {
        return this.f1024l;
    }

    /* JADX INFO: renamed from: z */
    public int m955z(Object obj) {
        SolverVariable solverVariableM962g = ((ConstraintAnchor) obj).m962g();
        if (solverVariableM962g != null) {
            return (int) (solverVariableM962g.f989e + 0.5f);
        }
        return 0;
    }
}
