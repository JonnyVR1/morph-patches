package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0207c;
import androidx.constraintlayout.solver.SolverVariable;
import p149l.ovc0;
import p149l.pvc0;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.i */
/* JADX INFO: loaded from: classes.dex */
public class C0218i extends pvc0 {

    /* JADX INFO: renamed from: c */
    public ConstraintAnchor f1179c;

    /* JADX INFO: renamed from: d */
    public float f1180d;

    /* JADX INFO: renamed from: e */
    public C0218i f1181e;

    /* JADX INFO: renamed from: f */
    public float f1182f;

    /* JADX INFO: renamed from: g */
    public C0218i f1183g;

    /* JADX INFO: renamed from: h */
    public float f1184h;

    /* JADX INFO: renamed from: j */
    public C0218i f1186j;

    /* JADX INFO: renamed from: k */
    public float f1187k;

    /* JADX INFO: renamed from: i */
    public int f1185i = 0;

    /* JADX INFO: renamed from: l */
    public ovc0 f1188l = null;

    /* JADX INFO: renamed from: m */
    public int f1189m = 1;

    /* JADX INFO: renamed from: n */
    public ovc0 f1190n = null;

    /* JADX INFO: renamed from: o */
    public int f1191o = 1;

    public C0218i(ConstraintAnchor constraintAnchor) {
        this.f1179c = constraintAnchor;
    }

    @Override // p149l.pvc0
    /* JADX INFO: renamed from: e */
    public void mo1114e() {
        super.mo1114e();
        this.f1181e = null;
        this.f1182f = 0.0f;
        this.f1188l = null;
        this.f1189m = 1;
        this.f1190n = null;
        this.f1191o = 1;
        this.f1183g = null;
        this.f1184h = 0.0f;
        this.f1180d = 0.0f;
        this.f1186j = null;
        this.f1187k = 0.0f;
        this.f1185i = 0;
    }

    @Override // p149l.pvc0
    /* JADX INFO: renamed from: f */
    public void mo1115f() {
        int i;
        C0218i c0218i;
        C0218i c0218i2;
        C0218i c0218i3;
        C0218i c0218i4;
        C0218i c0218i5;
        C0218i c0218i6;
        float fM976D;
        float f;
        C0218i c0218i7;
        boolean z = true;
        if (this.f151444b == 1 || (i = this.f1185i) == 4) {
            return;
        }
        ovc0 ovc0Var = this.f1188l;
        if (ovc0Var != null) {
            if (ovc0Var.f151444b != 1) {
                return;
            } else {
                this.f1182f = this.f1189m * ovc0Var.f145796c;
            }
        }
        ovc0 ovc0Var2 = this.f1190n;
        if (ovc0Var2 != null) {
            if (ovc0Var2.f151444b != 1) {
                return;
            } else {
                this.f1187k = this.f1191o * ovc0Var2.f145796c;
            }
        }
        if (i == 1 && ((c0218i7 = this.f1181e) == null || c0218i7.f151444b == 1)) {
            if (c0218i7 == null) {
                this.f1183g = this;
                this.f1184h = this.f1182f;
            } else {
                this.f1183g = c0218i7.f1183g;
                this.f1184h = c0218i7.f1184h + this.f1182f;
            }
            m171617b();
            return;
        }
        if (i != 2 || (c0218i4 = this.f1181e) == null || c0218i4.f151444b != 1 || (c0218i5 = this.f1186j) == null || (c0218i6 = c0218i5.f1181e) == null || c0218i6.f151444b != 1) {
            if (i != 3 || (c0218i = this.f1181e) == null || c0218i.f151444b != 1 || (c0218i2 = this.f1186j) == null || (c0218i3 = c0218i2.f1181e) == null || c0218i3.f151444b != 1) {
                if (i == 5) {
                    this.f1179c.f1030b.mo998U();
                    return;
                }
                return;
            }
            if (C0207c.m924y() != null) {
                C0207c.m924y().f161856x++;
            }
            C0218i c0218i8 = this.f1181e;
            this.f1183g = c0218i8.f1183g;
            C0218i c0218i9 = this.f1186j;
            C0218i c0218i10 = c0218i9.f1181e;
            c0218i9.f1183g = c0218i10.f1183g;
            this.f1184h = c0218i8.f1184h + this.f1182f;
            c0218i9.f1184h = c0218i10.f1184h + c0218i9.f1182f;
            m171617b();
            this.f1186j.m171617b();
            return;
        }
        if (C0207c.m924y() != null) {
            C0207c.m924y().f161855w++;
        }
        C0218i c0218i11 = this.f1181e;
        this.f1183g = c0218i11.f1183g;
        C0218i c0218i12 = this.f1186j;
        C0218i c0218i13 = c0218i12.f1181e;
        c0218i12.f1183g = c0218i13.f1183g;
        ConstraintAnchor constraintAnchor = this.f1179c;
        ConstraintAnchor.Type type = constraintAnchor.f1031c;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
        int i2 = 0;
        if (type != type2 && type != ConstraintAnchor.Type.BOTTOM) {
            z = false;
        }
        float f2 = z ? c0218i11.f1184h - c0218i13.f1184h : c0218i13.f1184h - c0218i11.f1184h;
        if (type == ConstraintAnchor.Type.LEFT || type == type2) {
            fM976D = f2 - constraintAnchor.f1030b.m976D();
            f = this.f1179c.f1030b.f1066Z;
        } else {
            fM976D = f2 - constraintAnchor.f1030b.m1038r();
            f = this.f1179c.f1030b.f1068a0;
        }
        int iM959d = this.f1179c.m959d();
        int iM959d2 = this.f1186j.f1179c.m959d();
        if (this.f1179c.m964i() == this.f1186j.f1179c.m964i()) {
            f = 0.5f;
            iM959d2 = 0;
        } else {
            i2 = iM959d;
        }
        float f3 = i2;
        float f4 = iM959d2;
        float f5 = (fM976D - f3) - f4;
        if (z) {
            C0218i c0218i14 = this.f1186j;
            c0218i14.f1184h = c0218i14.f1181e.f1184h + f4 + (f5 * f);
            this.f1184h = (this.f1181e.f1184h - f3) - (f5 * (1.0f - f));
        } else {
            this.f1184h = this.f1181e.f1184h + f3 + (f5 * f);
            C0218i c0218i15 = this.f1186j;
            c0218i15.f1184h = (c0218i15.f1181e.f1184h - f4) - (f5 * (1.0f - f));
        }
        m171617b();
        this.f1186j.m171617b();
    }

    /* JADX INFO: renamed from: g */
    public void m1116g(C0207c c0207c) {
        SolverVariable solverVariableM962g = this.f1179c.m962g();
        C0218i c0218i = this.f1183g;
        if (c0218i == null) {
            c0207c.m937f(solverVariableM962g, (int) (this.f1184h + 0.5f));
        } else {
            c0207c.m936e(solverVariableM962g, c0207c.m949r(c0218i.f1179c), (int) (this.f1184h + 0.5f), 6);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1117h(int i, C0218i c0218i, int i2) {
        this.f1185i = i;
        this.f1181e = c0218i;
        this.f1182f = i2;
        c0218i.m171616a(this);
    }

    /* JADX INFO: renamed from: i */
    public void m1118i(C0218i c0218i, int i) {
        this.f1181e = c0218i;
        this.f1182f = i;
        c0218i.m171616a(this);
    }

    /* JADX INFO: renamed from: j */
    public void m1119j(C0218i c0218i, int i, ovc0 ovc0Var) {
        this.f1181e = c0218i;
        c0218i.m171616a(this);
        this.f1188l = ovc0Var;
        this.f1189m = i;
        ovc0Var.m171616a(this);
    }

    /* JADX INFO: renamed from: k */
    public float m1120k() {
        return this.f1184h;
    }

    /* JADX INFO: renamed from: l */
    public void m1121l(C0218i c0218i, float f) {
        int i = this.f151444b;
        if (i == 0 || !(this.f1183g == c0218i || this.f1184h == f)) {
            this.f1183g = c0218i;
            this.f1184h = f;
            if (i == 1) {
                m171618c();
            }
            m171617b();
        }
    }

    /* JADX INFO: renamed from: m */
    public String m1122m(int i) {
        if (i == 1) {
            return "DIRECT";
        }
        if (i == 2) {
            return "CENTER";
        }
        if (i == 3) {
            return "MATCH";
        }
        if (i == 4) {
            return "CHAIN";
        }
        return i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* JADX INFO: renamed from: n */
    public void m1123n(C0218i c0218i, float f) {
        this.f1186j = c0218i;
        this.f1187k = f;
    }

    /* JADX INFO: renamed from: o */
    public void m1124o(C0218i c0218i, int i, ovc0 ovc0Var) {
        this.f1186j = c0218i;
        this.f1190n = ovc0Var;
        this.f1191o = i;
    }

    /* JADX INFO: renamed from: p */
    public void m1125p(int i) {
        this.f1185i = i;
    }

    /* JADX INFO: renamed from: q */
    public void m1126q() {
        ConstraintAnchor constraintAnchorM964i = this.f1179c.m964i();
        if (constraintAnchorM964i == null) {
            return;
        }
        if (constraintAnchorM964i.m964i() == this.f1179c) {
            this.f1185i = 4;
            constraintAnchorM964i.m961f().f1185i = 4;
        }
        int iM959d = this.f1179c.m959d();
        ConstraintAnchor.Type type = this.f1179c.f1031c;
        if (type == ConstraintAnchor.Type.RIGHT || type == ConstraintAnchor.Type.BOTTOM) {
            iM959d = -iM959d;
        }
        m1118i(constraintAnchorM964i.m961f(), iM959d);
    }

    public String toString() {
        if (this.f151444b != 1) {
            return "{ " + this.f1179c + " UNRESOLVED} type: " + m1122m(this.f1185i);
        }
        C0218i c0218i = this.f1183g;
        ConstraintAnchor constraintAnchor = this.f1179c;
        if (c0218i == this) {
            return "[" + constraintAnchor + ", RESOLVED: " + this.f1184h + "]  type: " + m1122m(this.f1185i);
        }
        return "[" + constraintAnchor + ", RESOLVED: " + this.f1183g + ":" + this.f1184h + "] type: " + m1122m(this.f1185i);
    }
}
