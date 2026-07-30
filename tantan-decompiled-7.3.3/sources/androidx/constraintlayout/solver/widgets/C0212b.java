package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0208c;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import p153l.t1l;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.b */
/* JADX INFO: loaded from: classes.dex */
public class C0212b extends t1l {

    /* JADX INFO: renamed from: x0 */
    public int f1115x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public ArrayList<C0219i> f1116y0 = new ArrayList<>(4);

    /* JADX INFO: renamed from: z0 */
    public boolean f1117z0 = true;

    /* JADX INFO: renamed from: K0 */
    public boolean m1069K0() {
        return this.f1117z0;
    }

    /* JADX INFO: renamed from: L0 */
    public void m1070L0(boolean z) {
        this.f1117z0 = z;
    }

    /* JADX INFO: renamed from: M0 */
    public void m1071M0(int i) {
        this.f1115x0 = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: S */
    public void mo997S() {
        super.mo997S();
        this.f1116y0.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: U */
    public void mo999U() {
        C0219i c0219iM962f;
        float f;
        C0219i c0219i;
        int i = this.f1115x0;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                c0219iM962f = this.f1109w.m962f();
            } else if (i == 2) {
                c0219iM962f = this.f1108v.m962f();
            } else if (i != 3) {
                return;
            } else {
                c0219iM962f = this.f1110x.m962f();
            }
            f2 = 0.0f;
        } else {
            c0219iM962f = this.f1107u.m962f();
        }
        int size = this.f1116y0.size();
        C0219i c0219i2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0219i c0219i3 = this.f1116y0.get(i2);
            if (c0219i3.f165995b != 1) {
                return;
            }
            int i3 = this.f1115x0;
            if (i3 == 0 || i3 == 2) {
                f = c0219i3.f1184h;
                if (f < f2) {
                    c0219i = c0219i3.f1183g;
                    c0219i2 = c0219i;
                    f2 = f;
                }
            } else {
                f = c0219i3.f1184h;
                if (f > f2) {
                    c0219i = c0219i3.f1183g;
                    c0219i2 = c0219i;
                    f2 = f;
                }
            }
        }
        if (C0208c.m925y() != null) {
            C0208c.m925y().f151229z++;
        }
        c0219iM962f.f1183g = c0219i2;
        c0219iM962f.f1184h = f2;
        c0219iM962f.m184233b();
        int i4 = this.f1115x0;
        if (i4 == 0) {
            this.f1109w.m962f().m1122l(c0219i2, f2);
            return;
        }
        if (i4 == 1) {
            this.f1107u.m962f().m1122l(c0219i2, f2);
        } else if (i4 == 2) {
            this.f1110x.m962f().m1122l(c0219i2, f2);
        } else {
            if (i4 != 3) {
                return;
            }
            this.f1108v.m962f().m1122l(c0219i2, f2);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: b */
    public void mo1007b(C0208c c0208c) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z;
        int i;
        int i2;
        ConstraintAnchor[] constraintAnchorArr2 = this.f1043C;
        constraintAnchorArr2[0] = this.f1107u;
        constraintAnchorArr2[2] = this.f1108v;
        constraintAnchorArr2[1] = this.f1109w;
        constraintAnchorArr2[3] = this.f1110x;
        int i3 = 0;
        while (true) {
            constraintAnchorArr = this.f1043C;
            if (i3 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i3];
            constraintAnchor.f1038j = c0208c.m950r(constraintAnchor);
            i3++;
        }
        int i4 = this.f1115x0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= this.f171682w0) {
                z = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f171681v0[i5];
            if ((this.f1117z0 || constraintWidget.mo1009c()) && ((((i = this.f1115x0) == 0 || i == 1) && constraintWidget.m1041s() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || (((i2 = this.f1115x0) == 2 || i2 == 3) && constraintWidget.m973B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
            i5++;
        }
        int i6 = this.f1115x0;
        if (i6 == 0 || i6 == 1 ? m1045u().m1041s() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : m1045u().m973B() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            z = false;
        }
        for (int i7 = 0; i7 < this.f171682w0; i7++) {
            ConstraintWidget constraintWidget2 = this.f171681v0[i7];
            if (this.f1117z0 || constraintWidget2.mo1009c()) {
                SolverVariable solverVariableM950r = c0208c.m950r(constraintWidget2.f1043C[this.f1115x0]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f1043C;
                int i8 = this.f1115x0;
                constraintAnchorArr3[i8].f1038j = solverVariableM950r;
                if (i8 == 0 || i8 == 2) {
                    c0208c.m942j(constraintAnchor2.f1038j, solverVariableM950r, z);
                } else {
                    c0208c.m940h(constraintAnchor2.f1038j, solverVariableM950r, z);
                }
            }
        }
        int i9 = this.f1115x0;
        if (i9 == 0) {
            c0208c.m937e(this.f1109w.f1038j, this.f1107u.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0208c.m937e(this.f1107u.f1038j, this.f1046F.f1109w.f1038j, 0, 5);
            return;
        }
        if (i9 == 1) {
            c0208c.m937e(this.f1107u.f1038j, this.f1109w.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0208c.m937e(this.f1107u.f1038j, this.f1046F.f1107u.f1038j, 0, 5);
            return;
        }
        if (i9 == 2) {
            c0208c.m937e(this.f1110x.f1038j, this.f1108v.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0208c.m937e(this.f1108v.f1038j, this.f1046F.f1110x.f1038j, 0, 5);
            return;
        }
        if (i9 == 3) {
            c0208c.m937e(this.f1108v.f1038j, this.f1110x.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0208c.m937e(this.f1108v.f1038j, this.f1046F.f1108v.f1038j, 0, 5);
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
        C0219i c0219iM962f;
        C0219i c0219iM962f2;
        ConstraintWidget constraintWidget = this.f1046F;
        if (constraintWidget != null && ((C0215e) constraintWidget).m1089Y0(2)) {
            int i2 = this.f1115x0;
            if (i2 == 0) {
                c0219iM962f = this.f1107u.m962f();
            } else if (i2 == 1) {
                c0219iM962f = this.f1109w.m962f();
            } else if (i2 == 2) {
                c0219iM962f = this.f1108v.m962f();
            } else if (i2 != 3) {
                return;
            } else {
                c0219iM962f = this.f1110x.m962f();
            }
            c0219iM962f.m1126p(5);
            int i3 = this.f1115x0;
            if (i3 == 0 || i3 == 1) {
                this.f1108v.m962f().m1122l(null, 0.0f);
                this.f1110x.m962f().m1122l(null, 0.0f);
            } else {
                this.f1107u.m962f().m1122l(null, 0.0f);
                this.f1109w.m962f().m1122l(null, 0.0f);
            }
            this.f1116y0.clear();
            for (int i4 = 0; i4 < this.f171682w0; i4++) {
                ConstraintWidget constraintWidget2 = this.f171681v0[i4];
                if (this.f1117z0 || constraintWidget2.mo1009c()) {
                    int i5 = this.f1115x0;
                    if (i5 == 0) {
                        c0219iM962f2 = constraintWidget2.f1107u.m962f();
                    } else if (i5 == 1) {
                        c0219iM962f2 = constraintWidget2.f1109w.m962f();
                    } else if (i5 != 2) {
                        c0219iM962f2 = i5 != 3 ? null : constraintWidget2.f1110x.m962f();
                    } else {
                        c0219iM962f2 = constraintWidget2.f1108v.m962f();
                    }
                    if (c0219iM962f2 != null) {
                        this.f1116y0.add(c0219iM962f2);
                        c0219iM962f2.m184232a(c0219iM962f);
                    }
                }
            }
        }
    }
}
