package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0208c;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import p153l.gig0;
import p153l.grc0;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.g */
/* JADX INFO: loaded from: classes.dex */
public class C0217g extends ConstraintWidget {

    /* JADX INFO: renamed from: v0 */
    public float f1172v0 = -1.0f;

    /* JADX INFO: renamed from: w0 */
    public int f1173w0 = -1;

    /* JADX INFO: renamed from: x0 */
    public int f1174x0 = -1;

    /* JADX INFO: renamed from: y0 */
    public ConstraintAnchor f1175y0 = this.f1108v;

    /* JADX INFO: renamed from: z0 */
    public int f1176z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public boolean f1168A0 = false;

    /* JADX INFO: renamed from: B0 */
    public int f1169B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public grc0 f1170C0 = new grc0();

    /* JADX INFO: renamed from: D0 */
    public int f1171D0 = 8;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.g$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1177a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f1177a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1177a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1177a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1177a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1177a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1177a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1177a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1177a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1177a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0217g() {
        this.f1044D.clear();
        this.f1044D.add(this.f1175y0);
        int length = this.f1043C.length;
        for (int i = 0; i < length; i++) {
            this.f1043C[i] = this.f1175y0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: G0 */
    public void mo984G0(C0208c c0208c) {
        if (m1045u() == null) {
            return;
        }
        int iM956z = c0208c.m956z(this.f1175y0);
        if (this.f1176z0 == 1) {
            m976C0(iM956z);
            m978D0(0);
            m1008b0(m1045u().m1039r());
            m1054y0(0);
            return;
        }
        m976C0(0);
        m978D0(iM956z);
        m1054y0(m1045u().m977D());
        m1008b0(0);
    }

    /* JADX INFO: renamed from: I0 */
    public int m1105I0() {
        return this.f1176z0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m1106J0(int i) {
        if (i > -1) {
            this.f1172v0 = -1.0f;
            this.f1173w0 = i;
            this.f1174x0 = -1;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m1107K0(int i) {
        if (i > -1) {
            this.f1172v0 = -1.0f;
            this.f1173w0 = -1;
            this.f1174x0 = i;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m1108L0(float f) {
        if (f > -1.0f) {
            this.f1172v0 = f;
            this.f1173w0 = -1;
            this.f1174x0 = -1;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m1109M0(int i) {
        if (this.f1176z0 == i) {
            return;
        }
        this.f1176z0 = i;
        this.f1044D.clear();
        if (this.f1176z0 == 1) {
            this.f1175y0 = this.f1107u;
        } else {
            this.f1175y0 = this.f1108v;
        }
        this.f1044D.add(this.f1175y0);
        int length = this.f1043C.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f1043C[i2] = this.f1175y0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: b */
    public void mo1007b(C0208c c0208c) {
        C0215e c0215e = (C0215e) m1045u();
        if (c0215e == null) {
            return;
        }
        ConstraintAnchor constraintAnchorMo1019h = c0215e.mo1019h(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorMo1019h2 = c0215e.mo1019h(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f1046F;
        boolean z = constraintWidget != null && constraintWidget.f1045E[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f1176z0 == 0) {
            constraintAnchorMo1019h = c0215e.mo1019h(ConstraintAnchor.Type.TOP);
            constraintAnchorMo1019h2 = c0215e.mo1019h(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f1046F;
            z = constraintWidget2 != null && constraintWidget2.f1045E[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f1173w0 != -1) {
            SolverVariable solverVariableM950r = c0208c.m950r(this.f1175y0);
            c0208c.m937e(solverVariableM950r, c0208c.m950r(constraintAnchorMo1019h), this.f1173w0, 6);
            if (z) {
                c0208c.m941i(c0208c.m950r(constraintAnchorMo1019h2), solverVariableM950r, 0, 5);
                return;
            }
            return;
        }
        if (this.f1174x0 == -1) {
            if (this.f1172v0 != -1.0f) {
                c0208c.m936d(C0208c.m924t(c0208c, c0208c.m950r(this.f1175y0), c0208c.m950r(constraintAnchorMo1019h), c0208c.m950r(constraintAnchorMo1019h2), this.f1172v0, this.f1168A0));
                return;
            }
            return;
        }
        SolverVariable solverVariableM950r2 = c0208c.m950r(this.f1175y0);
        SolverVariable solverVariableM950r3 = c0208c.m950r(constraintAnchorMo1019h2);
        c0208c.m937e(solverVariableM950r2, solverVariableM950r3, -this.f1174x0, 6);
        if (z) {
            c0208c.m941i(solverVariableM950r2, c0208c.m950r(constraintAnchorMo1019h), 0, 5);
            c0208c.m941i(solverVariableM950r3, solverVariableM950r2, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: c */
    public boolean mo1009c() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: d */
    public void mo1011d(int i) {
        ConstraintWidget constraintWidgetM1045u = m1045u();
        if (constraintWidgetM1045u == null) {
            return;
        }
        if (m1105I0() == 1) {
            this.f1108v.m962f().m1118h(1, constraintWidgetM1045u.f1108v.m962f(), 0);
            this.f1110x.m962f().m1118h(1, constraintWidgetM1045u.f1108v.m962f(), 0);
            if (this.f1173w0 != -1) {
                this.f1107u.m962f().m1118h(1, constraintWidgetM1045u.f1107u.m962f(), this.f1173w0);
                this.f1109w.m962f().m1118h(1, constraintWidgetM1045u.f1107u.m962f(), this.f1173w0);
                return;
            } else if (this.f1174x0 != -1) {
                this.f1107u.m962f().m1118h(1, constraintWidgetM1045u.f1109w.m962f(), -this.f1174x0);
                this.f1109w.m962f().m1118h(1, constraintWidgetM1045u.f1109w.m962f(), -this.f1174x0);
                return;
            } else {
                if (this.f1172v0 == -1.0f || constraintWidgetM1045u.m1041s() != ConstraintWidget.DimensionBehaviour.FIXED) {
                    return;
                }
                int i2 = (int) (constraintWidgetM1045u.f1047G * this.f1172v0);
                this.f1107u.m962f().m1118h(1, constraintWidgetM1045u.f1107u.m962f(), i2);
                this.f1109w.m962f().m1118h(1, constraintWidgetM1045u.f1107u.m962f(), i2);
                return;
            }
        }
        this.f1107u.m962f().m1118h(1, constraintWidgetM1045u.f1107u.m962f(), 0);
        this.f1109w.m962f().m1118h(1, constraintWidgetM1045u.f1107u.m962f(), 0);
        if (this.f1173w0 != -1) {
            this.f1108v.m962f().m1118h(1, constraintWidgetM1045u.f1108v.m962f(), this.f1173w0);
            this.f1110x.m962f().m1118h(1, constraintWidgetM1045u.f1108v.m962f(), this.f1173w0);
        } else if (this.f1174x0 != -1) {
            this.f1108v.m962f().m1118h(1, constraintWidgetM1045u.f1110x.m962f(), -this.f1174x0);
            this.f1110x.m962f().m1118h(1, constraintWidgetM1045u.f1110x.m962f(), -this.f1174x0);
        } else {
            if (this.f1172v0 == -1.0f || constraintWidgetM1045u.m973B() != ConstraintWidget.DimensionBehaviour.FIXED) {
                return;
            }
            int i3 = (int) (constraintWidgetM1045u.f1048H * this.f1172v0);
            this.f1108v.m962f().m1118h(1, constraintWidgetM1045u.f1108v.m962f(), i3);
            this.f1110x.m962f().m1118h(1, constraintWidgetM1045u.f1108v.m962f(), i3);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: h */
    public ConstraintAnchor mo1019h(ConstraintAnchor.Type type) {
        switch (a.f1177a[type.ordinal()]) {
            case 1:
            case 2:
                if (this.f1176z0 == 1) {
                    return this.f1175y0;
                }
                break;
            case 3:
            case 4:
                if (this.f1176z0 == 0) {
                    return this.f1175y0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        gig0.m130323a(type.name());
        return null;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: i */
    public ArrayList<ConstraintAnchor> mo1021i() {
        return this.f1044D;
    }
}
