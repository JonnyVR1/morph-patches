package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.d */
/* JADX INFO: loaded from: classes.dex */
public class C0214d {

    /* JADX INFO: renamed from: a */
    public ConstraintWidget f1118a;

    /* JADX INFO: renamed from: b */
    public ConstraintWidget f1119b;

    /* JADX INFO: renamed from: c */
    public ConstraintWidget f1120c;

    /* JADX INFO: renamed from: d */
    public ConstraintWidget f1121d;

    /* JADX INFO: renamed from: e */
    public ConstraintWidget f1122e;

    /* JADX INFO: renamed from: f */
    public ConstraintWidget f1123f;

    /* JADX INFO: renamed from: g */
    public ConstraintWidget f1124g;

    /* JADX INFO: renamed from: h */
    public ArrayList<ConstraintWidget> f1125h;

    /* JADX INFO: renamed from: i */
    public int f1126i;

    /* JADX INFO: renamed from: j */
    public int f1127j;

    /* JADX INFO: renamed from: k */
    public float f1128k = 0.0f;

    /* JADX INFO: renamed from: l */
    public int f1129l;

    /* JADX INFO: renamed from: m */
    public boolean f1130m;

    /* JADX INFO: renamed from: n */
    public boolean f1131n;

    /* JADX INFO: renamed from: o */
    public boolean f1132o;

    /* JADX INFO: renamed from: p */
    public boolean f1133p;

    /* JADX INFO: renamed from: q */
    public boolean f1134q;

    public C0214d(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f1118a = constraintWidget;
        this.f1129l = i;
        this.f1130m = z;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1074c(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.m975C() == 8 || constraintWidget.f1045E[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = constraintWidget.f1079g[i];
        return i2 == 0 || i2 == 3;
    }

    /* JADX INFO: renamed from: a */
    public void m1075a() {
        if (!this.f1134q) {
            m1076b();
        }
        this.f1134q = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1076b() {
        int i;
        int i2 = this.f1129l * 2;
        ConstraintWidget constraintWidget = this.f1118a;
        boolean z = false;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.f1126i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f1102r0;
            int i3 = this.f1129l;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i3] = null;
            constraintWidget.f1100q0[i3] = null;
            if (constraintWidget.m975C() != 8) {
                if (this.f1119b == null) {
                    this.f1119b = constraintWidget;
                }
                this.f1121d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1045E;
                int i4 = this.f1129l;
                if (dimensionBehaviourArr[i4] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i = constraintWidget.f1079g[i4]) == 0 || i == 3 || i == 2)) {
                    this.f1127j++;
                    float f = constraintWidget.f1098p0[i4];
                    if (f > 0.0f) {
                        this.f1128k += f;
                    }
                    if (m1074c(constraintWidget, i4)) {
                        if (f < 0.0f) {
                            this.f1131n = true;
                        } else {
                            this.f1132o = true;
                        }
                        if (this.f1125h == null) {
                            this.f1125h = new ArrayList<>();
                        }
                        this.f1125h.add(constraintWidget);
                    }
                    if (this.f1123f == null) {
                        this.f1123f = constraintWidget;
                    }
                    ConstraintWidget constraintWidget4 = this.f1124g;
                    if (constraintWidget4 != null) {
                        constraintWidget4.f1100q0[this.f1129l] = constraintWidget;
                    }
                    this.f1124g = constraintWidget;
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f1102r0[this.f1129l] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f1043C[i2 + 1].f1032d;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f1030b;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f1043C[i2].f1032d;
                if (constraintAnchor2 != null && constraintAnchor2.f1030b == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        this.f1120c = constraintWidget;
        if (this.f1129l == 0 && this.f1130m) {
            this.f1122e = constraintWidget;
        } else {
            this.f1122e = this.f1118a;
        }
        if (this.f1132o && this.f1131n) {
            z = true;
        }
        this.f1133p = z;
    }
}
