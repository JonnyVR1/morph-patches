package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0207c;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import p149l.y9g0;
import p149l.zic0;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.g */
/* JADX INFO: loaded from: classes.dex */
public class C0216g extends ConstraintWidget {

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
    public zic0 f1170C0 = new zic0();

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

    public C0216g() {
        this.f1044D.clear();
        this.f1044D.add(this.f1175y0);
        int length = this.f1043C.length;
        for (int i = 0; i < length; i++) {
            this.f1043C[i] = this.f1175y0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: G0 */
    public void mo983G0(C0207c c0207c) {
        if (m1044u() == null) {
            return;
        }
        int iM955z = c0207c.m955z(this.f1175y0);
        if (this.f1176z0 == 1) {
            m975C0(iM955z);
            m977D0(0);
            m1007b0(m1044u().m1038r());
            m1053y0(0);
            return;
        }
        m975C0(0);
        m977D0(iM955z);
        m1053y0(m1044u().m976D());
        m1007b0(0);
    }

    /* JADX INFO: renamed from: I0 */
    public int m1104I0() {
        return this.f1176z0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m1105J0(int i) {
        if (i > -1) {
            this.f1172v0 = -1.0f;
            this.f1173w0 = i;
            this.f1174x0 = -1;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m1106K0(int i) {
        if (i > -1) {
            this.f1172v0 = -1.0f;
            this.f1173w0 = -1;
            this.f1174x0 = i;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m1107L0(float f) {
        if (f > -1.0f) {
            this.f1172v0 = f;
            this.f1173w0 = -1;
            this.f1174x0 = -1;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m1108M0(int i) {
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
    public void mo1006b(C0207c c0207c) {
        C0214e c0214e = (C0214e) m1044u();
        if (c0214e == null) {
            return;
        }
        ConstraintAnchor constraintAnchorMo1018h = c0214e.mo1018h(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorMo1018h2 = c0214e.mo1018h(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f1046F;
        boolean z = constraintWidget != null && constraintWidget.f1045E[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f1176z0 == 0) {
            constraintAnchorMo1018h = c0214e.mo1018h(ConstraintAnchor.Type.TOP);
            constraintAnchorMo1018h2 = c0214e.mo1018h(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f1046F;
            z = constraintWidget2 != null && constraintWidget2.f1045E[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f1173w0 != -1) {
            SolverVariable solverVariableM949r = c0207c.m949r(this.f1175y0);
            c0207c.m936e(solverVariableM949r, c0207c.m949r(constraintAnchorMo1018h), this.f1173w0, 6);
            if (z) {
                c0207c.m940i(c0207c.m949r(constraintAnchorMo1018h2), solverVariableM949r, 0, 5);
                return;
            }
            return;
        }
        if (this.f1174x0 == -1) {
            if (this.f1172v0 != -1.0f) {
                c0207c.m935d(C0207c.m923t(c0207c, c0207c.m949r(this.f1175y0), c0207c.m949r(constraintAnchorMo1018h), c0207c.m949r(constraintAnchorMo1018h2), this.f1172v0, this.f1168A0));
                return;
            }
            return;
        }
        SolverVariable solverVariableM949r2 = c0207c.m949r(this.f1175y0);
        SolverVariable solverVariableM949r3 = c0207c.m949r(constraintAnchorMo1018h2);
        c0207c.m936e(solverVariableM949r2, solverVariableM949r3, -this.f1174x0, 6);
        if (z) {
            c0207c.m940i(solverVariableM949r2, c0207c.m949r(constraintAnchorMo1018h), 0, 5);
            c0207c.m940i(solverVariableM949r3, solverVariableM949r2, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: c */
    public boolean mo1008c() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: d */
    public void mo1010d(int i) {
        ConstraintWidget constraintWidgetM1044u = m1044u();
        if (constraintWidgetM1044u == null) {
            return;
        }
        if (m1104I0() == 1) {
            this.f1108v.m961f().m1117h(1, constraintWidgetM1044u.f1108v.m961f(), 0);
            this.f1110x.m961f().m1117h(1, constraintWidgetM1044u.f1108v.m961f(), 0);
            if (this.f1173w0 != -1) {
                this.f1107u.m961f().m1117h(1, constraintWidgetM1044u.f1107u.m961f(), this.f1173w0);
                this.f1109w.m961f().m1117h(1, constraintWidgetM1044u.f1107u.m961f(), this.f1173w0);
                return;
            } else if (this.f1174x0 != -1) {
                this.f1107u.m961f().m1117h(1, constraintWidgetM1044u.f1109w.m961f(), -this.f1174x0);
                this.f1109w.m961f().m1117h(1, constraintWidgetM1044u.f1109w.m961f(), -this.f1174x0);
                return;
            } else {
                if (this.f1172v0 == -1.0f || constraintWidgetM1044u.m1040s() != ConstraintWidget.DimensionBehaviour.FIXED) {
                    return;
                }
                int i2 = (int) (constraintWidgetM1044u.f1047G * this.f1172v0);
                this.f1107u.m961f().m1117h(1, constraintWidgetM1044u.f1107u.m961f(), i2);
                this.f1109w.m961f().m1117h(1, constraintWidgetM1044u.f1107u.m961f(), i2);
                return;
            }
        }
        this.f1107u.m961f().m1117h(1, constraintWidgetM1044u.f1107u.m961f(), 0);
        this.f1109w.m961f().m1117h(1, constraintWidgetM1044u.f1107u.m961f(), 0);
        if (this.f1173w0 != -1) {
            this.f1108v.m961f().m1117h(1, constraintWidgetM1044u.f1108v.m961f(), this.f1173w0);
            this.f1110x.m961f().m1117h(1, constraintWidgetM1044u.f1108v.m961f(), this.f1173w0);
        } else if (this.f1174x0 != -1) {
            this.f1108v.m961f().m1117h(1, constraintWidgetM1044u.f1110x.m961f(), -this.f1174x0);
            this.f1110x.m961f().m1117h(1, constraintWidgetM1044u.f1110x.m961f(), -this.f1174x0);
        } else {
            if (this.f1172v0 == -1.0f || constraintWidgetM1044u.m972B() != ConstraintWidget.DimensionBehaviour.FIXED) {
                return;
            }
            int i3 = (int) (constraintWidgetM1044u.f1048H * this.f1172v0);
            this.f1108v.m961f().m1117h(1, constraintWidgetM1044u.f1108v.m961f(), i3);
            this.f1110x.m961f().m1117h(1, constraintWidgetM1044u.f1108v.m961f(), i3);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: h */
    public ConstraintAnchor mo1018h(ConstraintAnchor.Type type) {
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
        y9g0.m213537a(type.name());
        return null;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: i */
    public ArrayList<ConstraintAnchor> mo1020i() {
        return this.f1044D;
    }
}
