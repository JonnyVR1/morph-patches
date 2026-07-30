package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0208c;
import androidx.constraintlayout.solver.SolverVariable;
import p153l.r3d0;
import p153l.s3d0;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.i */
/* JADX INFO: loaded from: classes.dex */
public class C0219i extends s3d0 {

    /* JADX INFO: renamed from: c */
    public ConstraintAnchor f1179c;

    /* JADX INFO: renamed from: d */
    public float f1180d;

    /* JADX INFO: renamed from: e */
    public C0219i f1181e;

    /* JADX INFO: renamed from: f */
    public float f1182f;

    /* JADX INFO: renamed from: g */
    public C0219i f1183g;

    /* JADX INFO: renamed from: h */
    public float f1184h;

    /* JADX INFO: renamed from: j */
    public C0219i f1186j;

    /* JADX INFO: renamed from: k */
    public float f1187k;

    /* JADX INFO: renamed from: i */
    public int f1185i = 0;

    /* JADX INFO: renamed from: l */
    public r3d0 f1188l = null;

    /* JADX INFO: renamed from: m */
    public int f1189m = 1;

    /* JADX INFO: renamed from: n */
    public r3d0 f1190n = null;

    /* JADX INFO: renamed from: o */
    public int f1191o = 1;

    public C0219i(ConstraintAnchor constraintAnchor) {
        this.f1179c = constraintAnchor;
    }

    @Override // p153l.s3d0
    /* JADX INFO: renamed from: e */
    public void mo1115e() {
        super.mo1115e();
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

    @Override // p153l.s3d0
    /* JADX INFO: renamed from: f */
    public void mo1116f() {
        int i;
        C0219i c0219i;
        C0219i c0219i2;
        C0219i c0219i3;
        C0219i c0219i4;
        C0219i c0219i5;
        C0219i c0219i6;
        float fM977D;
        float f;
        C0219i c0219i7;
        boolean z = true;
        if (this.f165995b == 1 || (i = this.f1185i) == 4) {
            return;
        }
        r3d0 r3d0Var = this.f1188l;
        if (r3d0Var != null) {
            if (r3d0Var.f165995b != 1) {
                return;
            } else {
                this.f1182f = this.f1189m * r3d0Var.f161032c;
            }
        }
        r3d0 r3d0Var2 = this.f1190n;
        if (r3d0Var2 != null) {
            if (r3d0Var2.f165995b != 1) {
                return;
            } else {
                this.f1187k = this.f1191o * r3d0Var2.f161032c;
            }
        }
        if (i == 1 && ((c0219i7 = this.f1181e) == null || c0219i7.f165995b == 1)) {
            if (c0219i7 == null) {
                this.f1183g = this;
                this.f1184h = this.f1182f;
            } else {
                this.f1183g = c0219i7.f1183g;
                this.f1184h = c0219i7.f1184h + this.f1182f;
            }
            m184233b();
            return;
        }
        if (i != 2 || (c0219i4 = this.f1181e) == null || c0219i4.f165995b != 1 || (c0219i5 = this.f1186j) == null || (c0219i6 = c0219i5.f1181e) == null || c0219i6.f165995b != 1) {
            if (i != 3 || (c0219i = this.f1181e) == null || c0219i.f165995b != 1 || (c0219i2 = this.f1186j) == null || (c0219i3 = c0219i2.f1181e) == null || c0219i3.f165995b != 1) {
                if (i == 5) {
                    this.f1179c.f1030b.mo999U();
                    return;
                }
                return;
            }
            if (C0208c.m925y() != null) {
                C0208c.m925y().f151227x++;
            }
            C0219i c0219i8 = this.f1181e;
            this.f1183g = c0219i8.f1183g;
            C0219i c0219i9 = this.f1186j;
            C0219i c0219i10 = c0219i9.f1181e;
            c0219i9.f1183g = c0219i10.f1183g;
            this.f1184h = c0219i8.f1184h + this.f1182f;
            c0219i9.f1184h = c0219i10.f1184h + c0219i9.f1182f;
            m184233b();
            this.f1186j.m184233b();
            return;
        }
        if (C0208c.m925y() != null) {
            C0208c.m925y().f151226w++;
        }
        C0219i c0219i11 = this.f1181e;
        this.f1183g = c0219i11.f1183g;
        C0219i c0219i12 = this.f1186j;
        C0219i c0219i13 = c0219i12.f1181e;
        c0219i12.f1183g = c0219i13.f1183g;
        ConstraintAnchor constraintAnchor = this.f1179c;
        ConstraintAnchor.Type type = constraintAnchor.f1031c;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
        int i2 = 0;
        if (type != type2 && type != ConstraintAnchor.Type.BOTTOM) {
            z = false;
        }
        float f2 = z ? c0219i11.f1184h - c0219i13.f1184h : c0219i13.f1184h - c0219i11.f1184h;
        if (type == ConstraintAnchor.Type.LEFT || type == type2) {
            fM977D = f2 - constraintAnchor.f1030b.m977D();
            f = this.f1179c.f1030b.f1066Z;
        } else {
            fM977D = f2 - constraintAnchor.f1030b.m1039r();
            f = this.f1179c.f1030b.f1068a0;
        }
        int iM960d = this.f1179c.m960d();
        int iM960d2 = this.f1186j.f1179c.m960d();
        if (this.f1179c.m965i() == this.f1186j.f1179c.m965i()) {
            f = 0.5f;
            iM960d2 = 0;
        } else {
            i2 = iM960d;
        }
        float f3 = i2;
        float f4 = iM960d2;
        float f5 = (fM977D - f3) - f4;
        if (z) {
            C0219i c0219i14 = this.f1186j;
            c0219i14.f1184h = c0219i14.f1181e.f1184h + f4 + (f5 * f);
            this.f1184h = (this.f1181e.f1184h - f3) - (f5 * (1.0f - f));
        } else {
            this.f1184h = this.f1181e.f1184h + f3 + (f5 * f);
            C0219i c0219i15 = this.f1186j;
            c0219i15.f1184h = (c0219i15.f1181e.f1184h - f4) - (f5 * (1.0f - f));
        }
        m184233b();
        this.f1186j.m184233b();
    }

    /* JADX INFO: renamed from: g */
    public void m1117g(C0208c c0208c) {
        SolverVariable solverVariableM963g = this.f1179c.m963g();
        C0219i c0219i = this.f1183g;
        if (c0219i == null) {
            c0208c.m938f(solverVariableM963g, (int) (this.f1184h + 0.5f));
        } else {
            c0208c.m937e(solverVariableM963g, c0208c.m950r(c0219i.f1179c), (int) (this.f1184h + 0.5f), 6);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1118h(int i, C0219i c0219i, int i2) {
        this.f1185i = i;
        this.f1181e = c0219i;
        this.f1182f = i2;
        c0219i.m184232a(this);
    }

    /* JADX INFO: renamed from: i */
    public void m1119i(C0219i c0219i, int i) {
        this.f1181e = c0219i;
        this.f1182f = i;
        c0219i.m184232a(this);
    }

    /* JADX INFO: renamed from: j */
    public void m1120j(C0219i c0219i, int i, r3d0 r3d0Var) {
        this.f1181e = c0219i;
        c0219i.m184232a(this);
        this.f1188l = r3d0Var;
        this.f1189m = i;
        r3d0Var.m184232a(this);
    }

    /* JADX INFO: renamed from: k */
    public float m1121k() {
        return this.f1184h;
    }

    /* JADX INFO: renamed from: l */
    public void m1122l(C0219i c0219i, float f) {
        int i = this.f165995b;
        if (i == 0 || !(this.f1183g == c0219i || this.f1184h == f)) {
            this.f1183g = c0219i;
            this.f1184h = f;
            if (i == 1) {
                m184234c();
            }
            m184233b();
        }
    }

    /* JADX INFO: renamed from: m */
    public String m1123m(int i) {
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
    public void m1124n(C0219i c0219i, float f) {
        this.f1186j = c0219i;
        this.f1187k = f;
    }

    /* JADX INFO: renamed from: o */
    public void m1125o(C0219i c0219i, int i, r3d0 r3d0Var) {
        this.f1186j = c0219i;
        this.f1190n = r3d0Var;
        this.f1191o = i;
    }

    /* JADX INFO: renamed from: p */
    public void m1126p(int i) {
        this.f1185i = i;
    }

    /* JADX INFO: renamed from: q */
    public void m1127q() {
        ConstraintAnchor constraintAnchorM965i = this.f1179c.m965i();
        if (constraintAnchorM965i == null) {
            return;
        }
        if (constraintAnchorM965i.m965i() == this.f1179c) {
            this.f1185i = 4;
            constraintAnchorM965i.m962f().f1185i = 4;
        }
        int iM960d = this.f1179c.m960d();
        ConstraintAnchor.Type type = this.f1179c.f1031c;
        if (type == ConstraintAnchor.Type.RIGHT || type == ConstraintAnchor.Type.BOTTOM) {
            iM960d = -iM960d;
        }
        m1119i(constraintAnchorM965i.m962f(), iM960d);
    }

    public String toString() {
        if (this.f165995b != 1) {
            return "{ " + this.f1179c + " UNRESOLVED} type: " + m1123m(this.f1185i);
        }
        C0219i c0219i = this.f1183g;
        ConstraintAnchor constraintAnchor = this.f1179c;
        if (c0219i == this) {
            return "[" + constraintAnchor + ", RESOLVED: " + this.f1184h + "]  type: " + m1123m(this.f1185i);
        }
        return "[" + constraintAnchor + ", RESOLVED: " + this.f1183g + ":" + this.f1184h + "] type: " + m1123m(this.f1185i);
    }
}
