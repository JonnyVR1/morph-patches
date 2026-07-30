package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0207c;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import p149l.dzk;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.b */
/* JADX INFO: loaded from: classes.dex */
public class C0211b extends dzk {

    /* JADX INFO: renamed from: x0 */
    public int f1115x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public ArrayList<C0218i> f1116y0 = new ArrayList<>(4);

    /* JADX INFO: renamed from: z0 */
    public boolean f1117z0 = true;

    /* JADX INFO: renamed from: K0 */
    public boolean m1068K0() {
        return this.f1117z0;
    }

    /* JADX INFO: renamed from: L0 */
    public void m1069L0(boolean z) {
        this.f1117z0 = z;
    }

    /* JADX INFO: renamed from: M0 */
    public void m1070M0(int i) {
        this.f1115x0 = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: S */
    public void mo996S() {
        super.mo996S();
        this.f1116y0.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: U */
    public void mo998U() {
        C0218i c0218iM961f;
        float f;
        C0218i c0218i;
        int i = this.f1115x0;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                c0218iM961f = this.f1109w.m961f();
            } else if (i == 2) {
                c0218iM961f = this.f1108v.m961f();
            } else if (i != 3) {
                return;
            } else {
                c0218iM961f = this.f1110x.m961f();
            }
            f2 = 0.0f;
        } else {
            c0218iM961f = this.f1107u.m961f();
        }
        int size = this.f1116y0.size();
        C0218i c0218i2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0218i c0218i3 = this.f1116y0.get(i2);
            if (c0218i3.f151444b != 1) {
                return;
            }
            int i3 = this.f1115x0;
            if (i3 == 0 || i3 == 2) {
                f = c0218i3.f1184h;
                if (f < f2) {
                    c0218i = c0218i3.f1183g;
                    c0218i2 = c0218i;
                    f2 = f;
                }
            } else {
                f = c0218i3.f1184h;
                if (f > f2) {
                    c0218i = c0218i3.f1183g;
                    c0218i2 = c0218i;
                    f2 = f;
                }
            }
        }
        if (C0207c.m924y() != null) {
            C0207c.m924y().f161858z++;
        }
        c0218iM961f.f1183g = c0218i2;
        c0218iM961f.f1184h = f2;
        c0218iM961f.m171617b();
        int i4 = this.f1115x0;
        if (i4 == 0) {
            this.f1109w.m961f().m1121l(c0218i2, f2);
            return;
        }
        if (i4 == 1) {
            this.f1107u.m961f().m1121l(c0218i2, f2);
        } else if (i4 == 2) {
            this.f1110x.m961f().m1121l(c0218i2, f2);
        } else {
            if (i4 != 3) {
                return;
            }
            this.f1108v.m961f().m1121l(c0218i2, f2);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: b */
    public void mo1006b(C0207c c0207c) {
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
            constraintAnchor.f1038j = c0207c.m949r(constraintAnchor);
            i3++;
        }
        int i4 = this.f1115x0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= this.f88489w0) {
                z = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f88488v0[i5];
            if ((this.f1117z0 || constraintWidget.mo1008c()) && ((((i = this.f1115x0) == 0 || i == 1) && constraintWidget.m1040s() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || (((i2 = this.f1115x0) == 2 || i2 == 3) && constraintWidget.m972B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
            i5++;
        }
        int i6 = this.f1115x0;
        if (i6 == 0 || i6 == 1 ? m1044u().m1040s() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : m1044u().m972B() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            z = false;
        }
        for (int i7 = 0; i7 < this.f88489w0; i7++) {
            ConstraintWidget constraintWidget2 = this.f88488v0[i7];
            if (this.f1117z0 || constraintWidget2.mo1008c()) {
                SolverVariable solverVariableM949r = c0207c.m949r(constraintWidget2.f1043C[this.f1115x0]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f1043C;
                int i8 = this.f1115x0;
                constraintAnchorArr3[i8].f1038j = solverVariableM949r;
                if (i8 == 0 || i8 == 2) {
                    c0207c.m941j(constraintAnchor2.f1038j, solverVariableM949r, z);
                } else {
                    c0207c.m939h(constraintAnchor2.f1038j, solverVariableM949r, z);
                }
            }
        }
        int i9 = this.f1115x0;
        if (i9 == 0) {
            c0207c.m936e(this.f1109w.f1038j, this.f1107u.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0207c.m936e(this.f1107u.f1038j, this.f1046F.f1109w.f1038j, 0, 5);
            return;
        }
        if (i9 == 1) {
            c0207c.m936e(this.f1107u.f1038j, this.f1109w.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0207c.m936e(this.f1107u.f1038j, this.f1046F.f1107u.f1038j, 0, 5);
            return;
        }
        if (i9 == 2) {
            c0207c.m936e(this.f1110x.f1038j, this.f1108v.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0207c.m936e(this.f1108v.f1038j, this.f1046F.f1110x.f1038j, 0, 5);
            return;
        }
        if (i9 == 3) {
            c0207c.m936e(this.f1108v.f1038j, this.f1110x.f1038j, 0, 6);
            if (z) {
                return;
            }
            c0207c.m936e(this.f1108v.f1038j, this.f1046F.f1108v.f1038j, 0, 5);
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
        C0218i c0218iM961f;
        C0218i c0218iM961f2;
        ConstraintWidget constraintWidget = this.f1046F;
        if (constraintWidget != null && ((C0214e) constraintWidget).m1088Y0(2)) {
            int i2 = this.f1115x0;
            if (i2 == 0) {
                c0218iM961f = this.f1107u.m961f();
            } else if (i2 == 1) {
                c0218iM961f = this.f1109w.m961f();
            } else if (i2 == 2) {
                c0218iM961f = this.f1108v.m961f();
            } else if (i2 != 3) {
                return;
            } else {
                c0218iM961f = this.f1110x.m961f();
            }
            c0218iM961f.m1125p(5);
            int i3 = this.f1115x0;
            if (i3 == 0 || i3 == 1) {
                this.f1108v.m961f().m1121l(null, 0.0f);
                this.f1110x.m961f().m1121l(null, 0.0f);
            } else {
                this.f1107u.m961f().m1121l(null, 0.0f);
                this.f1109w.m961f().m1121l(null, 0.0f);
            }
            this.f1116y0.clear();
            for (int i4 = 0; i4 < this.f88489w0; i4++) {
                ConstraintWidget constraintWidget2 = this.f88488v0[i4];
                if (this.f1117z0 || constraintWidget2.mo1008c()) {
                    int i5 = this.f1115x0;
                    if (i5 == 0) {
                        c0218iM961f2 = constraintWidget2.f1107u.m961f();
                    } else if (i5 == 1) {
                        c0218iM961f2 = constraintWidget2.f1109w.m961f();
                    } else if (i5 != 2) {
                        c0218iM961f2 = i5 != 3 ? null : constraintWidget2.f1110x.m961f();
                    } else {
                        c0218iM961f2 = constraintWidget2.f1108v.m961f();
                    }
                    if (c0218iM961f2 != null) {
                        this.f1116y0.add(c0218iM961f2);
                        c0218iM961f2.m171616a(c0218iM961f);
                    }
                }
            }
        }
    }
}
