package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0207c;
import androidx.constraintlayout.solver.SolverVariable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import p149l.ovc0;
import p149l.xw3;
import p149l.y9g0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: u0 */
    public static float f1040u0 = 0.5f;

    /* JADX INFO: renamed from: B */
    public ConstraintAnchor f1042B;

    /* JADX INFO: renamed from: C */
    public ConstraintAnchor[] f1043C;

    /* JADX INFO: renamed from: D */
    public ArrayList<ConstraintAnchor> f1044D;

    /* JADX INFO: renamed from: E */
    public DimensionBehaviour[] f1045E;

    /* JADX INFO: renamed from: F */
    public ConstraintWidget f1046F;

    /* JADX INFO: renamed from: G */
    public int f1047G;

    /* JADX INFO: renamed from: H */
    public int f1048H;

    /* JADX INFO: renamed from: I */
    public float f1049I;

    /* JADX INFO: renamed from: J */
    public int f1050J;

    /* JADX INFO: renamed from: K */
    public int f1051K;

    /* JADX INFO: renamed from: L */
    public int f1052L;

    /* JADX INFO: renamed from: M */
    public int f1053M;

    /* JADX INFO: renamed from: N */
    public int f1054N;

    /* JADX INFO: renamed from: O */
    public int f1055O;

    /* JADX INFO: renamed from: P */
    public int f1056P;

    /* JADX INFO: renamed from: Q */
    public int f1057Q;

    /* JADX INFO: renamed from: R */
    public int f1058R;

    /* JADX INFO: renamed from: S */
    public int f1059S;

    /* JADX INFO: renamed from: T */
    public int f1060T;

    /* JADX INFO: renamed from: U */
    public int f1061U;

    /* JADX INFO: renamed from: V */
    public int f1062V;

    /* JADX INFO: renamed from: W */
    public int f1063W;

    /* JADX INFO: renamed from: X */
    public int f1064X;

    /* JADX INFO: renamed from: Y */
    public int f1065Y;

    /* JADX INFO: renamed from: Z */
    public float f1066Z;

    /* JADX INFO: renamed from: a0 */
    public float f1068a0;

    /* JADX INFO: renamed from: b0 */
    public Object f1070b0;

    /* JADX INFO: renamed from: c */
    public ovc0 f1071c;

    /* JADX INFO: renamed from: c0 */
    public int f1072c0;

    /* JADX INFO: renamed from: d */
    public ovc0 f1073d;

    /* JADX INFO: renamed from: d0 */
    public int f1074d0;

    /* JADX INFO: renamed from: e0 */
    public String f1076e0;

    /* JADX INFO: renamed from: f0 */
    public String f1078f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f1080g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f1082h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f1084i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f1086j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f1088k0;

    /* JADX INFO: renamed from: l0 */
    public int f1090l0;

    /* JADX INFO: renamed from: m0 */
    public int f1092m0;

    /* JADX INFO: renamed from: n */
    public boolean f1093n;

    /* JADX INFO: renamed from: n0 */
    public boolean f1094n0;

    /* JADX INFO: renamed from: o */
    public boolean f1095o;

    /* JADX INFO: renamed from: o0 */
    public boolean f1096o0;

    /* JADX INFO: renamed from: p0 */
    public float[] f1098p0;

    /* JADX INFO: renamed from: q0 */
    public ConstraintWidget[] f1100q0;

    /* JADX INFO: renamed from: r0 */
    public ConstraintWidget[] f1102r0;

    /* JADX INFO: renamed from: s0 */
    public ConstraintWidget f1104s0;

    /* JADX INFO: renamed from: t0 */
    public ConstraintWidget f1106t0;

    /* JADX INFO: renamed from: a */
    public int f1067a = -1;

    /* JADX INFO: renamed from: b */
    public int f1069b = -1;

    /* JADX INFO: renamed from: e */
    public int f1075e = 0;

    /* JADX INFO: renamed from: f */
    public int f1077f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f1079g = new int[2];

    /* JADX INFO: renamed from: h */
    public int f1081h = 0;

    /* JADX INFO: renamed from: i */
    public int f1083i = 0;

    /* JADX INFO: renamed from: j */
    public float f1085j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f1087k = 0;

    /* JADX INFO: renamed from: l */
    public int f1089l = 0;

    /* JADX INFO: renamed from: m */
    public float f1091m = 1.0f;

    /* JADX INFO: renamed from: p */
    public int f1097p = -1;

    /* JADX INFO: renamed from: q */
    public float f1099q = 1.0f;

    /* JADX INFO: renamed from: r */
    public C0215f f1101r = null;

    /* JADX INFO: renamed from: s */
    public int[] f1103s = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: t */
    public float f1105t = 0.0f;

    /* JADX INFO: renamed from: u */
    public ConstraintAnchor f1107u = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);

    /* JADX INFO: renamed from: v */
    public ConstraintAnchor f1108v = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);

    /* JADX INFO: renamed from: w */
    public ConstraintAnchor f1109w = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);

    /* JADX INFO: renamed from: x */
    public ConstraintAnchor f1110x = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);

    /* JADX INFO: renamed from: y */
    public ConstraintAnchor f1111y = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);

    /* JADX INFO: renamed from: z */
    public ConstraintAnchor f1112z = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);

    /* JADX INFO: renamed from: A */
    public ConstraintAnchor f1041A = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$a */
    public static /* synthetic */ class C0209a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1113a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f1114b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f1114b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1114b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1114b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1114b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f1113a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1113a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1113a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1113a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1113a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1113a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1113a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1113a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1113a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f1042B = constraintAnchor;
        this.f1043C = new ConstraintAnchor[]{this.f1107u, this.f1109w, this.f1108v, this.f1110x, this.f1111y, constraintAnchor};
        this.f1044D = new ArrayList<>();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f1045E = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f1046F = null;
        this.f1047G = 0;
        this.f1048H = 0;
        this.f1049I = 0.0f;
        this.f1050J = -1;
        this.f1051K = 0;
        this.f1052L = 0;
        this.f1053M = 0;
        this.f1054N = 0;
        this.f1055O = 0;
        this.f1056P = 0;
        this.f1057Q = 0;
        this.f1058R = 0;
        this.f1059S = 0;
        this.f1060T = 0;
        this.f1061U = 0;
        float f = f1040u0;
        this.f1066Z = f;
        this.f1068a0 = f;
        this.f1072c0 = 0;
        this.f1074d0 = 0;
        this.f1076e0 = null;
        this.f1078f0 = null;
        this.f1084i0 = false;
        this.f1086j0 = false;
        this.f1088k0 = false;
        this.f1090l0 = 0;
        this.f1092m0 = 0;
        this.f1098p0 = new float[]{-1.0f, -1.0f};
        this.f1100q0 = new ConstraintWidget[]{null, null};
        this.f1102r0 = new ConstraintWidget[]{null, null};
        this.f1104s0 = null;
        this.f1106t0 = null;
        m1004a();
    }

    /* JADX INFO: renamed from: A */
    public int m970A() {
        return this.f1052L + this.f1060T;
    }

    /* JADX INFO: renamed from: A0 */
    public void m971A0(int i) {
        this.f1065Y = i;
    }

    /* JADX INFO: renamed from: B */
    public DimensionBehaviour m972B() {
        return this.f1045E[1];
    }

    /* JADX INFO: renamed from: B0 */
    public void m973B0(int i) {
        this.f1064X = i;
    }

    /* JADX INFO: renamed from: C */
    public int m974C() {
        return this.f1074d0;
    }

    /* JADX INFO: renamed from: C0 */
    public void m975C0(int i) {
        this.f1051K = i;
    }

    /* JADX INFO: renamed from: D */
    public int m976D() {
        if (this.f1074d0 == 8) {
            return 0;
        }
        return this.f1047G;
    }

    /* JADX INFO: renamed from: D0 */
    public void m977D0(int i) {
        this.f1052L = i;
    }

    /* JADX INFO: renamed from: E */
    public int m978E() {
        return this.f1065Y;
    }

    /* JADX INFO: renamed from: E0 */
    public void m979E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f1097p == -1) {
            if (z3 && !z4) {
                this.f1097p = 0;
            } else if (!z3 && z4) {
                this.f1097p = 1;
                if (this.f1050J == -1) {
                    this.f1099q = 1.0f / this.f1099q;
                }
            }
        }
        if (this.f1097p == 0 && (!this.f1108v.m966k() || !this.f1110x.m966k())) {
            this.f1097p = 1;
        } else if (this.f1097p == 1 && (!this.f1107u.m966k() || !this.f1109w.m966k())) {
            this.f1097p = 0;
        }
        if (this.f1097p == -1 && (!this.f1108v.m966k() || !this.f1110x.m966k() || !this.f1107u.m966k() || !this.f1109w.m966k())) {
            if (this.f1108v.m966k() && this.f1110x.m966k()) {
                this.f1097p = 0;
            } else if (this.f1107u.m966k() && this.f1109w.m966k()) {
                this.f1099q = 1.0f / this.f1099q;
                this.f1097p = 1;
            }
        }
        if (this.f1097p == -1) {
            if (z && !z2) {
                this.f1097p = 0;
            } else if (!z && z2) {
                this.f1099q = 1.0f / this.f1099q;
                this.f1097p = 1;
            }
        }
        if (this.f1097p == -1) {
            int i = this.f1081h;
            if (i > 0 && this.f1087k == 0) {
                this.f1097p = 0;
            } else if (i == 0 && this.f1087k > 0) {
                this.f1099q = 1.0f / this.f1099q;
                this.f1097p = 1;
            }
        }
        if (this.f1097p == -1 && z && z2) {
            this.f1099q = 1.0f / this.f1099q;
            this.f1097p = 1;
        }
    }

    /* JADX INFO: renamed from: F */
    public int m980F() {
        return this.f1064X;
    }

    /* JADX INFO: renamed from: F0 */
    public void mo981F0() {
        int i = this.f1051K;
        int i2 = this.f1052L;
        int i3 = this.f1047G + i;
        int i4 = this.f1048H + i2;
        this.f1055O = i;
        this.f1056P = i2;
        this.f1057Q = i3 - i;
        this.f1058R = i4 - i2;
    }

    /* JADX INFO: renamed from: G */
    public int m982G() {
        return this.f1051K;
    }

    /* JADX INFO: renamed from: G0 */
    public void mo983G0(C0207c c0207c) {
        int iM955z = c0207c.m955z(this.f1107u);
        int iM955z2 = c0207c.m955z(this.f1108v);
        int iM955z3 = c0207c.m955z(this.f1109w);
        int iM955z4 = c0207c.m955z(this.f1110x);
        int i = iM955z4 - iM955z2;
        if (iM955z3 - iM955z < 0 || i < 0 || iM955z == Integer.MIN_VALUE || iM955z == Integer.MAX_VALUE || iM955z2 == Integer.MIN_VALUE || iM955z2 == Integer.MAX_VALUE || iM955z3 == Integer.MIN_VALUE || iM955z3 == Integer.MAX_VALUE || iM955z4 == Integer.MIN_VALUE || iM955z4 == Integer.MAX_VALUE) {
            iM955z = 0;
            iM955z4 = 0;
            iM955z2 = 0;
            iM955z3 = 0;
        }
        m1005a0(iM955z, iM955z2, iM955z3, iM955z4);
    }

    /* JADX INFO: renamed from: H */
    public int m984H() {
        return this.f1052L;
    }

    /* JADX INFO: renamed from: H0 */
    public void m985H0() {
        for (int i = 0; i < 6; i++) {
            this.f1043C[i].m961f().m1126q();
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m986I() {
        return this.f1061U > 0;
    }

    /* JADX INFO: renamed from: J */
    public void m987J(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo1018h(type).m956a(constraintWidget.mo1018h(type2), i, i2, ConstraintAnchor.Strength.STRONG, 0, true);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m988K(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f1043C;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1032d;
        return (constraintAnchor4 == null || constraintAnchor4.f1032d == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f1032d) == null || constraintAnchor2.f1032d != constraintAnchor) ? false : true;
    }

    /* JADX INFO: renamed from: L */
    public boolean m989L() {
        return this.f1107u.m961f().f151444b == 1 && this.f1109w.m961f().f151444b == 1 && this.f1108v.m961f().f151444b == 1 && this.f1110x.m961f().f151444b == 1;
    }

    /* JADX INFO: renamed from: M */
    public boolean m990M() {
        ConstraintAnchor constraintAnchor = this.f1107u;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1032d;
        if (constraintAnchor2 != null && constraintAnchor2.f1032d == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f1109w;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1032d;
        return constraintAnchor4 != null && constraintAnchor4.f1032d == constraintAnchor3;
    }

    /* JADX INFO: renamed from: N */
    public boolean m991N() {
        ConstraintAnchor constraintAnchor = this.f1108v;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1032d;
        if (constraintAnchor2 != null && constraintAnchor2.f1032d == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f1110x;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1032d;
        return constraintAnchor4 != null && constraintAnchor4.f1032d == constraintAnchor3;
    }

    /* JADX INFO: renamed from: O */
    public boolean m992O() {
        return this.f1077f == 0 && this.f1049I == 0.0f && this.f1087k == 0 && this.f1089l == 0 && this.f1045E[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* JADX INFO: renamed from: P */
    public boolean m993P() {
        return this.f1075e == 0 && this.f1049I == 0.0f && this.f1081h == 0 && this.f1083i == 0 && this.f1045E[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* JADX INFO: renamed from: Q */
    public void mo994Q() {
        this.f1107u.m968m();
        this.f1108v.m968m();
        this.f1109w.m968m();
        this.f1110x.m968m();
        this.f1111y.m968m();
        this.f1112z.m968m();
        this.f1041A.m968m();
        this.f1042B.m968m();
        this.f1046F = null;
        this.f1105t = 0.0f;
        this.f1047G = 0;
        this.f1048H = 0;
        this.f1049I = 0.0f;
        this.f1050J = -1;
        this.f1051K = 0;
        this.f1052L = 0;
        this.f1055O = 0;
        this.f1056P = 0;
        this.f1057Q = 0;
        this.f1058R = 0;
        this.f1059S = 0;
        this.f1060T = 0;
        this.f1061U = 0;
        this.f1062V = 0;
        this.f1063W = 0;
        this.f1064X = 0;
        this.f1065Y = 0;
        float f = f1040u0;
        this.f1066Z = f;
        this.f1068a0 = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f1045E;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f1070b0 = null;
        this.f1072c0 = 0;
        this.f1074d0 = 0;
        this.f1078f0 = null;
        this.f1080g0 = false;
        this.f1082h0 = false;
        this.f1090l0 = 0;
        this.f1092m0 = 0;
        this.f1094n0 = false;
        this.f1096o0 = false;
        float[] fArr = this.f1098p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1067a = -1;
        this.f1069b = -1;
        int[] iArr = this.f1103s;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1075e = 0;
        this.f1077f = 0;
        this.f1085j = 1.0f;
        this.f1091m = 1.0f;
        this.f1083i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1089l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1081h = 0;
        this.f1087k = 0;
        this.f1097p = -1;
        this.f1099q = 1.0f;
        ovc0 ovc0Var = this.f1071c;
        if (ovc0Var != null) {
            ovc0Var.mo1114e();
        }
        ovc0 ovc0Var2 = this.f1073d;
        if (ovc0Var2 != null) {
            ovc0Var2.mo1114e();
        }
        this.f1101r = null;
        this.f1084i0 = false;
        this.f1086j0 = false;
        this.f1088k0 = false;
    }

    /* JADX INFO: renamed from: R */
    public void m995R() {
        ConstraintWidget constraintWidgetM1044u = m1044u();
        if (constraintWidgetM1044u != null && (constraintWidgetM1044u instanceof C0214e) && ((C0214e) m1044u()).m1083T0()) {
            return;
        }
        int size = this.f1044D.size();
        for (int i = 0; i < size; i++) {
            this.f1044D.get(i).m968m();
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo996S() {
        for (int i = 0; i < 6; i++) {
            this.f1043C[i].m961f().mo1114e();
        }
    }

    /* JADX INFO: renamed from: T */
    public void mo997T(xw3 xw3Var) {
        this.f1107u.m969n(xw3Var);
        this.f1108v.m969n(xw3Var);
        this.f1109w.m969n(xw3Var);
        this.f1110x.m969n(xw3Var);
        this.f1111y.m969n(xw3Var);
        this.f1042B.m969n(xw3Var);
        this.f1112z.m969n(xw3Var);
        this.f1041A.m969n(xw3Var);
    }

    /* JADX INFO: renamed from: U */
    public void mo998U() {
    }

    /* JADX INFO: renamed from: V */
    public void m999V(int i) {
        this.f1061U = i;
    }

    /* JADX INFO: renamed from: W */
    public void m1000W(Object obj) {
        this.f1070b0 = obj;
    }

    /* JADX INFO: renamed from: X */
    public void m1001X(String str) {
        this.f1076e0 = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: Y */
    public void m1002Y(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f1049I = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f1049I = fAbs;
            this.f1050J = i3;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m1003Z(int i, int i2, int i3) {
        if (i3 == 0) {
            m1015f0(i, i2);
        } else if (i3 == 1) {
            m1043t0(i, i2);
        }
        this.f1086j0 = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m1004a() {
        this.f1044D.add(this.f1107u);
        this.f1044D.add(this.f1108v);
        this.f1044D.add(this.f1109w);
        this.f1044D.add(this.f1110x);
        this.f1044D.add(this.f1112z);
        this.f1044D.add(this.f1041A);
        this.f1044D.add(this.f1042B);
        this.f1044D.add(this.f1111y);
    }

    /* JADX INFO: renamed from: a0 */
    public void m1005a0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f1051K = i;
        this.f1052L = i2;
        if (this.f1074d0 == 8) {
            this.f1047G = 0;
            this.f1048H = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f1045E;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.f1047G)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.f1048H)) {
            i8 = i5;
        }
        this.f1047G = i7;
        this.f1048H = i8;
        int i9 = this.f1063W;
        if (i8 < i9) {
            this.f1048H = i9;
        }
        int i10 = this.f1062V;
        if (i7 < i10) {
            this.f1047G = i10;
        }
        this.f1086j0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0196  */
    /* JADX WARN: Code duplicated, block: B:107:0x019f  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x024a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0250  */
    /* JADX WARN: Code duplicated, block: B:137:0x0253  */
    /* JADX WARN: Code duplicated, block: B:142:0x025c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:147:0x026b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0274  */
    /* JADX WARN: Code duplicated, block: B:149:0x0277  */
    /* JADX WARN: Code duplicated, block: B:151:0x0289  */
    /* JADX WARN: Code duplicated, block: B:154:0x0297  */
    /* JADX WARN: Code duplicated, block: B:155:0x029f  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x030a  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public void mo1006b(C0207c c0207c) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5;
        int i4;
        byte b;
        boolean z6;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z7;
        boolean z8;
        DimensionBehaviour dimensionBehaviour3;
        SolverVariable solverVariable;
        boolean z9;
        boolean z10;
        boolean z11;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariableM949r;
        SolverVariable solverVariable3;
        C0207c c0207c2;
        int i5;
        float f;
        ConstraintAnchor constraintAnchor;
        int i6;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariableM949r2;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariableM949r3;
        int i7;
        int i8;
        boolean zM990M;
        boolean zM991N;
        C0207c c0207c3 = c0207c;
        SolverVariable solverVariableM949r4 = c0207c3.m949r(this.f1107u);
        SolverVariable solverVariableM949r5 = c0207c3.m949r(this.f1109w);
        SolverVariable solverVariableM949r6 = c0207c3.m949r(this.f1108v);
        SolverVariable solverVariableM949r7 = c0207c3.m949r(this.f1110x);
        SolverVariable solverVariableM949r8 = c0207c3.m949r(this.f1111y);
        ConstraintWidget constraintWidget4 = this.f1046F;
        if (constraintWidget4 != null) {
            z2 = constraintWidget4 != null && constraintWidget4.f1045E[0] == DimensionBehaviour.WRAP_CONTENT;
            z = constraintWidget4 != null && constraintWidget4.f1045E[1] == DimensionBehaviour.WRAP_CONTENT;
            if (m988K(0)) {
                ((C0214e) this.f1046F).m1077N0(this, 0);
                zM990M = true;
            } else {
                zM990M = m990M();
            }
            if (m988K(1)) {
                ((C0214e) this.f1046F).m1077N0(this, 1);
                zM991N = true;
            } else {
                zM991N = m991N();
            }
            if (z2 && this.f1074d0 != 8 && this.f1107u.f1032d == null && this.f1109w.f1032d == null) {
                c0207c3.m940i(c0207c3.m949r(this.f1046F.f1109w), solverVariableM949r5, 0, 1);
            }
            if (z && this.f1074d0 != 8 && this.f1108v.f1032d == null && this.f1110x.f1032d == null && this.f1111y == null) {
                c0207c3.m940i(c0207c3.m949r(this.f1046F.f1110x), solverVariableM949r7, 0, 1);
            }
            z3 = zM990M;
            z4 = zM991N;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i9 = this.f1047G;
        int i10 = this.f1062V;
        if (i9 >= i10) {
            i10 = i9;
        }
        int i11 = this.f1048H;
        int i12 = this.f1063W;
        if (i11 >= i12) {
            i12 = i11;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f1045E;
        DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z12 = dimensionBehaviour4 != dimensionBehaviour5;
        DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
        boolean z13 = dimensionBehaviour6 != dimensionBehaviour5;
        int i13 = this.f1050J;
        this.f1097p = i13;
        float f2 = this.f1049I;
        this.f1099q = f2;
        int i14 = this.f1075e;
        int i15 = this.f1077f;
        if (f2 > 0.0f) {
            i = i10;
            if (this.f1074d0 != 8) {
                i2 = (dimensionBehaviour4 == dimensionBehaviour5 && i14 == 0) ? 3 : i14;
                int i16 = (dimensionBehaviour6 == dimensionBehaviour5 && i15 == 0) ? 3 : i15;
                if (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour6 == dimensionBehaviour5 && i2 == 3) {
                    i7 = i12;
                    i8 = i16;
                    if (i8 == 3) {
                        m979E0(z2, z, z12, z13);
                    }
                    i15 = i8;
                    i4 = i7;
                    i3 = i;
                    z5 = true;
                } else {
                    i7 = i12;
                    i8 = i16;
                }
                if (dimensionBehaviour4 == dimensionBehaviour5 && i2 == 3) {
                    this.f1097p = 0;
                    int i17 = (int) (f2 * i11);
                    if (dimensionBehaviour6 != dimensionBehaviour5) {
                        i2 = 4;
                        i3 = i17;
                        i15 = i8;
                        i4 = i7;
                    } else {
                        i2 = i2;
                        i15 = i8;
                        z5 = true;
                        i4 = i7;
                        i3 = i17;
                    }
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour5 && i8 == 3) {
                        this.f1097p = 1;
                        if (i13 == -1) {
                            this.f1099q = 1.0f / f2;
                        }
                        int i18 = (int) (this.f1099q * i9);
                        if (dimensionBehaviour4 != dimensionBehaviour5) {
                            i15 = 4;
                            i4 = i18;
                            i2 = i2;
                            i3 = i;
                        } else {
                            i4 = i18;
                            i15 = i8;
                        }
                    } else {
                        i15 = i8;
                        i4 = i7;
                    }
                    i3 = i;
                    z5 = true;
                }
                z5 = false;
            }
            int[] iArr = this.f1079g;
            iArr[0] = i2;
            iArr[1] = i15;
            if (z5) {
                int i19 = this.f1097p;
                b = -1;
                z6 = i19 != 0 || i19 == -1;
                dimensionBehaviour = this.f1045E[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof C0214e)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                z8 = !this.f1042B.m966k();
                if (this.f1067a != 2) {
                    constraintWidget2 = this.f1046F;
                    if (constraintWidget2 != null) {
                        solverVariableM949r2 = c0207c3.m949r(constraintWidget2.f1109w);
                    } else {
                        solverVariableM949r2 = null;
                    }
                    constraintWidget3 = this.f1046F;
                    if (constraintWidget3 != null) {
                        solverVariableM949r3 = c0207c3.m949r(constraintWidget3.f1107u);
                    } else {
                        solverVariableM949r3 = null;
                    }
                    z9 = z8;
                    dimensionBehaviour3 = dimensionBehaviour2;
                    solverVariable = solverVariableM949r7;
                    c0207c3 = c0207c;
                    m1012e(c0207c3, z2, solverVariableM949r3, solverVariableM949r2, this.f1045E[0], z7, this.f1107u, this.f1109w, this.f1051K, i3, this.f1062V, this.f1103s[0], this.f1066Z, z6, z3, i2, this.f1081h, this.f1083i, this.f1085j, z9);
                } else {
                    dimensionBehaviour3 = dimensionBehaviour2;
                    solverVariable = solverVariableM949r7;
                    z9 = z8;
                }
                if (this.f1069b == 2) {
                    return;
                }
                if (this.f1045E[1] == dimensionBehaviour3 || !(this instanceof C0214e)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z5 || !((i6 = this.f1097p) == 1 || i6 == -1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (this.f1061U <= 0) {
                    solverVariable2 = r23;
                } else if (this.f1111y.m961f().f151444b == 1) {
                    this.f1111y.m961f().m1116g(c0207c3);
                    solverVariable2 = r23;
                } else {
                    solverVariable2 = solverVariableM949r6;
                    c0207c3.m936e(solverVariableM949r8, solverVariable2, m1022j(), 6);
                    constraintAnchor = this.f1111y.f1032d;
                    if (constraintAnchor != null) {
                        c0207c3.m936e(solverVariableM949r8, c0207c3.m949r(constraintAnchor), 0, 6);
                        z9 = false;
                    }
                }
                constraintWidget = this.f1046F;
                if (constraintWidget != null) {
                    solverVariableM949r = c0207c3.m949r(constraintWidget.f1110x);
                } else {
                    solverVariableM949r = null;
                }
                ConstraintWidget constraintWidget5 = this.f1046F;
                solverVariable3 = solverVariable2;
                m1012e(c0207c3, z, constraintWidget5 != null ? c0207c3.m949r(constraintWidget5.f1108v) : null, solverVariableM949r, this.f1045E[1], z10, this.f1108v, this.f1110x, this.f1052L, i4, this.f1063W, this.f1103s[1], this.f1068a0, z11, z4, i15, this.f1087k, this.f1089l, this.f1091m, z9);
                if (z5) {
                    i5 = this.f1097p;
                    f = this.f1099q;
                    if (i5 == 1) {
                        c0207c.m943l(solverVariable, solverVariable3, solverVariableM949r5, solverVariableM949r4, f, 6);
                        c0207c2 = c0207c;
                    } else {
                        c0207c.m943l(r19, solverVariableM949r4, solverVariable, solverVariable3, f, 6);
                        c0207c2 = c0207c;
                    }
                } else {
                    c0207c2 = c0207c;
                }
                if (this.f1042B.m966k()) {
                    c0207c2.m933b(this, this.f1042B.m964i().m960e(), (float) Math.toRadians(this.f1105t + 90.0f), this.f1042B.m959d());
                }
            }
            b = -1;
            dimensionBehaviour = this.f1045E[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z7 = false;
            } else {
                z7 = false;
            }
            z8 = !this.f1042B.m966k();
            if (this.f1067a != 2) {
                constraintWidget2 = this.f1046F;
                if (constraintWidget2 != null) {
                    solverVariableM949r2 = c0207c3.m949r(constraintWidget2.f1109w);
                } else {
                    solverVariableM949r2 = null;
                }
                constraintWidget3 = this.f1046F;
                if (constraintWidget3 != null) {
                    solverVariableM949r3 = c0207c3.m949r(constraintWidget3.f1107u);
                } else {
                    solverVariableM949r3 = null;
                }
                z9 = z8;
                dimensionBehaviour3 = dimensionBehaviour2;
                solverVariable = solverVariableM949r7;
                c0207c3 = c0207c;
                m1012e(c0207c3, z2, solverVariableM949r3, solverVariableM949r2, this.f1045E[0], z7, this.f1107u, this.f1109w, this.f1051K, i3, this.f1062V, this.f1103s[0], this.f1066Z, z6, z3, i2, this.f1081h, this.f1083i, this.f1085j, z9);
            } else {
                dimensionBehaviour3 = dimensionBehaviour2;
                solverVariable = solverVariableM949r7;
                z9 = z8;
            }
            if (this.f1069b == 2) {
                return;
            }
            if (this.f1045E[1] == dimensionBehaviour3) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z5) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (this.f1061U <= 0) {
                solverVariable2 = r23;
            } else if (this.f1111y.m961f().f151444b == 1) {
                this.f1111y.m961f().m1116g(c0207c3);
                solverVariable2 = r23;
            } else {
                solverVariable2 = solverVariableM949r6;
                c0207c3.m936e(solverVariableM949r8, solverVariable2, m1022j(), 6);
                constraintAnchor = this.f1111y.f1032d;
                if (constraintAnchor != null) {
                    c0207c3.m936e(solverVariableM949r8, c0207c3.m949r(constraintAnchor), 0, 6);
                    z9 = false;
                }
            }
            constraintWidget = this.f1046F;
            if (constraintWidget != null) {
                solverVariableM949r = c0207c3.m949r(constraintWidget.f1110x);
            } else {
                solverVariableM949r = null;
            }
            ConstraintWidget constraintWidget6 = this.f1046F;
            solverVariable3 = solverVariable2;
            m1012e(c0207c3, z, constraintWidget6 != null ? c0207c3.m949r(constraintWidget6.f1108v) : null, solverVariableM949r, this.f1045E[1], z10, this.f1108v, this.f1110x, this.f1052L, i4, this.f1063W, this.f1103s[1], this.f1068a0, z11, z4, i15, this.f1087k, this.f1089l, this.f1091m, z9);
            if (z5) {
                i5 = this.f1097p;
                f = this.f1099q;
                if (i5 == 1) {
                    c0207c.m943l(solverVariable, solverVariable3, solverVariableM949r5, solverVariableM949r4, f, 6);
                    c0207c2 = c0207c;
                } else {
                    c0207c.m943l(r19, solverVariableM949r4, solverVariable, solverVariable3, f, 6);
                    c0207c2 = c0207c;
                }
            } else {
                c0207c2 = c0207c;
            }
            if (this.f1042B.m966k()) {
                c0207c2.m933b(this, this.f1042B.m964i().m960e(), (float) Math.toRadians(this.f1105t + 90.0f), this.f1042B.m959d());
            }
        }
        i = i10;
        i2 = i14;
        i3 = i;
        z5 = false;
        i4 = i12;
        int[] iArr2 = this.f1079g;
        iArr2[0] = i2;
        iArr2[1] = i15;
        if (z5) {
            int i110 = this.f1097p;
            b = -1;
            if (i110 != 0) {
            }
            dimensionBehaviour = this.f1045E[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z7 = false;
            } else {
                z7 = false;
            }
            z8 = !this.f1042B.m966k();
            if (this.f1067a != 2) {
                constraintWidget2 = this.f1046F;
                if (constraintWidget2 != null) {
                    solverVariableM949r2 = c0207c3.m949r(constraintWidget2.f1109w);
                } else {
                    solverVariableM949r2 = null;
                }
                constraintWidget3 = this.f1046F;
                if (constraintWidget3 != null) {
                    solverVariableM949r3 = c0207c3.m949r(constraintWidget3.f1107u);
                } else {
                    solverVariableM949r3 = null;
                }
                z9 = z8;
                dimensionBehaviour3 = dimensionBehaviour2;
                solverVariable = solverVariableM949r7;
                c0207c3 = c0207c;
                m1012e(c0207c3, z2, solverVariableM949r3, solverVariableM949r2, this.f1045E[0], z7, this.f1107u, this.f1109w, this.f1051K, i3, this.f1062V, this.f1103s[0], this.f1066Z, z6, z3, i2, this.f1081h, this.f1083i, this.f1085j, z9);
            } else {
                dimensionBehaviour3 = dimensionBehaviour2;
                solverVariable = solverVariableM949r7;
                z9 = z8;
            }
            if (this.f1069b == 2) {
                return;
            }
            if (this.f1045E[1] == dimensionBehaviour3) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z5) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (this.f1061U <= 0) {
                solverVariable2 = r23;
            } else if (this.f1111y.m961f().f151444b == 1) {
                this.f1111y.m961f().m1116g(c0207c3);
                solverVariable2 = r23;
            } else {
                solverVariable2 = solverVariableM949r6;
                c0207c3.m936e(solverVariableM949r8, solverVariable2, m1022j(), 6);
                constraintAnchor = this.f1111y.f1032d;
                if (constraintAnchor != null) {
                    c0207c3.m936e(solverVariableM949r8, c0207c3.m949r(constraintAnchor), 0, 6);
                    z9 = false;
                }
            }
            constraintWidget = this.f1046F;
            if (constraintWidget != null) {
                solverVariableM949r = c0207c3.m949r(constraintWidget.f1110x);
            } else {
                solverVariableM949r = null;
            }
            ConstraintWidget constraintWidget7 = this.f1046F;
            solverVariable3 = solverVariable2;
            m1012e(c0207c3, z, constraintWidget7 != null ? c0207c3.m949r(constraintWidget7.f1108v) : null, solverVariableM949r, this.f1045E[1], z10, this.f1108v, this.f1110x, this.f1052L, i4, this.f1063W, this.f1103s[1], this.f1068a0, z11, z4, i15, this.f1087k, this.f1089l, this.f1091m, z9);
            if (z5) {
                i5 = this.f1097p;
                f = this.f1099q;
                if (i5 == 1) {
                    c0207c.m943l(solverVariable, solverVariable3, solverVariableM949r5, solverVariableM949r4, f, 6);
                    c0207c2 = c0207c;
                } else {
                    c0207c.m943l(r19, solverVariableM949r4, solverVariable, solverVariable3, f, 6);
                    c0207c2 = c0207c;
                }
            } else {
                c0207c2 = c0207c;
            }
            if (this.f1042B.m966k()) {
                c0207c2.m933b(this, this.f1042B.m964i().m960e(), (float) Math.toRadians(this.f1105t + 90.0f), this.f1042B.m959d());
            }
        }
        b = -1;
        dimensionBehaviour = this.f1045E[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z7 = false;
        } else {
            z7 = false;
        }
        z8 = !this.f1042B.m966k();
        if (this.f1067a != 2) {
            constraintWidget2 = this.f1046F;
            if (constraintWidget2 != null) {
                solverVariableM949r2 = c0207c3.m949r(constraintWidget2.f1109w);
            } else {
                solverVariableM949r2 = null;
            }
            constraintWidget3 = this.f1046F;
            if (constraintWidget3 != null) {
                solverVariableM949r3 = c0207c3.m949r(constraintWidget3.f1107u);
            } else {
                solverVariableM949r3 = null;
            }
            z9 = z8;
            dimensionBehaviour3 = dimensionBehaviour2;
            solverVariable = solverVariableM949r7;
            c0207c3 = c0207c;
            m1012e(c0207c3, z2, solverVariableM949r3, solverVariableM949r2, this.f1045E[0], z7, this.f1107u, this.f1109w, this.f1051K, i3, this.f1062V, this.f1103s[0], this.f1066Z, z6, z3, i2, this.f1081h, this.f1083i, this.f1085j, z9);
        } else {
            dimensionBehaviour3 = dimensionBehaviour2;
            solverVariable = solverVariableM949r7;
            z9 = z8;
        }
        if (this.f1069b == 2) {
            return;
        }
        if (this.f1045E[1] == dimensionBehaviour3) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z5) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (this.f1061U <= 0) {
            solverVariable2 = r23;
        } else if (this.f1111y.m961f().f151444b == 1) {
            this.f1111y.m961f().m1116g(c0207c3);
            solverVariable2 = r23;
        } else {
            solverVariable2 = solverVariableM949r6;
            c0207c3.m936e(solverVariableM949r8, solverVariable2, m1022j(), 6);
            constraintAnchor = this.f1111y.f1032d;
            if (constraintAnchor != null) {
                c0207c3.m936e(solverVariableM949r8, c0207c3.m949r(constraintAnchor), 0, 6);
                z9 = false;
            }
        }
        constraintWidget = this.f1046F;
        if (constraintWidget != null) {
            solverVariableM949r = c0207c3.m949r(constraintWidget.f1110x);
        } else {
            solverVariableM949r = null;
        }
        ConstraintWidget constraintWidget8 = this.f1046F;
        solverVariable3 = solverVariable2;
        m1012e(c0207c3, z, constraintWidget8 != null ? c0207c3.m949r(constraintWidget8.f1108v) : null, solverVariableM949r, this.f1045E[1], z10, this.f1108v, this.f1110x, this.f1052L, i4, this.f1063W, this.f1103s[1], this.f1068a0, z11, z4, i15, this.f1087k, this.f1089l, this.f1091m, z9);
        if (z5) {
            i5 = this.f1097p;
            f = this.f1099q;
            if (i5 == 1) {
                c0207c.m943l(solverVariable, solverVariable3, solverVariableM949r5, solverVariableM949r4, f, 6);
                c0207c2 = c0207c;
            } else {
                c0207c.m943l(r19, solverVariableM949r4, solverVariable, solverVariable3, f, 6);
                c0207c2 = c0207c;
            }
        } else {
            c0207c2 = c0207c;
        }
        if (this.f1042B.m966k()) {
            c0207c2.m933b(this, this.f1042B.m964i().m960e(), (float) Math.toRadians(this.f1105t + 90.0f), this.f1042B.m959d());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m1007b0(int i) {
        this.f1048H = i;
        int i2 = this.f1063W;
        if (i < i2) {
            this.f1048H = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo1008c() {
        return this.f1074d0 != 8;
    }

    /* JADX INFO: renamed from: c0 */
    public void m1009c0(boolean z) {
        this.f1095o = z;
    }

    /* JADX INFO: renamed from: d */
    public void mo1010d(int i) {
        C0217h.m1109a(i, this);
    }

    /* JADX INFO: renamed from: d0 */
    public void m1011d0(float f) {
        this.f1066Z = f;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01ea A[PHI: r1 r4
      0x01ea: PHI (r1v5 androidx.constraintlayout.solver.c) = (r1v2 androidx.constraintlayout.solver.c), (r1v0 androidx.constraintlayout.solver.c) binds: [B:179:0x02dc, B:111:0x01e1] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r4v5 androidx.constraintlayout.solver.SolverVariable) = (r4v2 androidx.constraintlayout.solver.SolverVariable), (r4v0 androidx.constraintlayout.solver.SolverVariable) binds: [B:179:0x02dc, B:111:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x0279  */
    /* JADX WARN: Code duplicated, block: B:164:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x02de  */
    /* JADX INFO: renamed from: e */
    public final void m1012e(C0207c c0207c, boolean z, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7, float f2, boolean z5) {
        long j;
        int iMin;
        int i8;
        int i9;
        int i10;
        boolean z6;
        char c;
        SolverVariable solverVariableM949r;
        SolverVariable solverVariableM949r2;
        int i11;
        boolean z7;
        int i12;
        boolean z8;
        boolean z9;
        boolean z10;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int i13;
        ConstraintAnchor constraintAnchor4;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        int i16;
        boolean z13;
        C0207c c0207c2 = c0207c;
        SolverVariable solverVariableM949r3 = c0207c2.m949r(constraintAnchor);
        SolverVariable solverVariableM949r4 = c0207c2.m949r(constraintAnchor2);
        SolverVariable solverVariableM949r5 = c0207c2.m949r(constraintAnchor.m964i());
        SolverVariable solverVariableM949r6 = c0207c2.m949r(constraintAnchor2.m964i());
        if (c0207c2.f1019g) {
            j = 1;
            if (constraintAnchor.m961f().f151444b == 1 && constraintAnchor2.m961f().f151444b == 1) {
                if (C0207c.m924y() != null) {
                    C0207c.m924y().f161851s++;
                }
                constraintAnchor.m961f().m1116g(c0207c2);
                constraintAnchor2.m961f().m1116g(c0207c2);
                if (z4 || !z) {
                    return;
                }
                c0207c2.m940i(solverVariable2, solverVariableM949r4, 0, 6);
                return;
            }
        } else {
            j = 1;
        }
        if (C0207c.m924y() != null) {
            C0207c.m924y().f161830B += j;
        }
        boolean zM966k = constraintAnchor.m966k();
        boolean zM966k2 = constraintAnchor2.m966k();
        boolean zM966k3 = this.f1042B.m966k();
        int i17 = zM966k2 ? (zM966k ? 1 : 0) + 1 : zM966k ? 1 : 0;
        if (zM966k3) {
            i17++;
        }
        int i18 = z3 ? 3 : i5;
        int i19 = C0209a.f1114b[dimensionBehaviour.ordinal()];
        boolean z14 = (i19 == 1 || i19 == 2 || i19 == 3 || i19 != 4 || i18 == 4) ? false : true;
        if (this.f1074d0 == 8) {
            iMin = 0;
            z14 = false;
        } else {
            iMin = i2;
        }
        if (z5) {
            if (!zM966k && !zM966k2 && !zM966k3) {
                c0207c2.m937f(solverVariableM949r3, i);
            } else if (zM966k && !zM966k2) {
                i8 = 6;
                c0207c2.m936e(solverVariableM949r3, solverVariableM949r5, constraintAnchor.m959d(), 6);
            }
            i8 = 6;
        } else {
            i8 = 6;
        }
        if (z14) {
            i9 = i6;
            if (i9 == -2) {
                i9 = iMin;
            }
            i10 = i7 == -2 ? iMin : i7;
            if (i9 > 0) {
                c0207c2.m940i(solverVariableM949r4, solverVariableM949r3, i9, 6);
                iMin = Math.max(iMin, i9);
            }
            if (i10 > 0) {
                c0207c2.m942k(solverVariableM949r4, solverVariableM949r3, i10, 6);
                iMin = Math.min(iMin, i10);
            }
            if (i18 == 1) {
                if (z) {
                    c0207c2.m936e(solverVariableM949r4, solverVariableM949r3, iMin, 6);
                } else if (z4) {
                    c0207c2.m936e(solverVariableM949r4, solverVariableM949r3, iMin, 4);
                    boolean z15 = z14;
                    i10 = i10;
                    z6 = z15;
                    i11 = 4;
                    iMin = iMin;
                    i18 = i18;
                    i17 = i17;
                    c = 2;
                } else {
                    c0207c2.m936e(solverVariableM949r4, solverVariableM949r3, iMin, 1);
                }
                z6 = z14;
                c = 2;
                i11 = 4;
            } else if (i18 == 2) {
                ConstraintAnchor.Type typeM965j = constraintAnchor.m965j();
                ConstraintAnchor.Type type = ConstraintAnchor.Type.TOP;
                if (typeM965j == type || constraintAnchor.m965j() == ConstraintAnchor.Type.BOTTOM) {
                    solverVariableM949r = c0207c2.m949r(this.f1046F.mo1018h(type));
                    solverVariableM949r2 = c0207c2.m949r(this.f1046F.mo1018h(ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableM949r = c0207c2.m949r(this.f1046F.mo1018h(ConstraintAnchor.Type.LEFT));
                    solverVariableM949r2 = c0207c2.m949r(this.f1046F.mo1018h(ConstraintAnchor.Type.RIGHT));
                }
                i10 = i10;
                iMin = iMin;
                c = 2;
                i11 = 4;
                SolverVariable solverVariable5 = solverVariableM949r;
                i17 = i17;
                c0207c2.m935d(c0207c2.m950s().m908j(solverVariableM949r4, solverVariableM949r3, solverVariableM949r2, solverVariable5, f2));
                i18 = i18;
                z6 = false;
            } else {
                z6 = z14;
                c = 2;
                i11 = 4;
            }
            if (!z6 || i17 == c || z3) {
                z7 = z6;
            } else {
                int iMax = Math.max(i9, iMin);
                if (i10 > 0) {
                    iMax = Math.min(i10, iMax);
                }
                c0207c2.m936e(solverVariableM949r4, solverVariableM949r3, iMax, 6);
                z7 = false;
            }
        } else {
            if (z2) {
                c0207c2.m936e(solverVariableM949r4, solverVariableM949r3, 0, 3);
                if (i3 > 0) {
                    c0207c2.m940i(solverVariableM949r4, solverVariableM949r3, i3, 6);
                }
                if (i4 < Integer.MAX_VALUE) {
                    c0207c2.m942k(solverVariableM949r4, solverVariableM949r3, i4, 6);
                }
            } else {
                c0207c2.m936e(solverVariableM949r4, solverVariableM949r3, iMin, i8);
            }
            i9 = i6;
            i18 = i18;
            z7 = z14;
            i17 = i17;
            c = 2;
            i11 = 4;
            i10 = i7;
        }
        if (!z5 || z4) {
            if (i17 >= c || !z) {
                return;
            }
            c0207c2.m940i(solverVariableM949r3, solverVariable, 0, 6);
            c0207c2.m940i(solverVariable2, solverVariableM949r4, 0, 6);
            return;
        }
        int i20 = 5;
        if (zM966k || zM966k2 || zM966k3) {
            i12 = 0;
            if (!zM966k || zM966k2) {
                if (!zM966k && zM966k2) {
                    c0207c2.m936e(solverVariableM949r4, solverVariableM949r6, -constraintAnchor2.m959d(), 6);
                    if (z) {
                        c0207c2.m940i(solverVariableM949r3, solverVariable, 0, 5);
                    }
                } else if (zM966k && zM966k2) {
                    if (z7) {
                        if (z && i3 == 0) {
                            c0207c2.m940i(solverVariableM949r4, solverVariableM949r3, 0, 6);
                        }
                        if (i18 == 0) {
                            if (i10 > 0 || i9 > 0) {
                                i16 = i11;
                                z13 = true;
                            } else {
                                i16 = 6;
                                z13 = false;
                            }
                            c0207c2.m936e(solverVariableM949r3, solverVariableM949r5, constraintAnchor.m959d(), i16);
                            c0207c2.m936e(solverVariableM949r4, solverVariableM949r6, -constraintAnchor2.m959d(), i16);
                            boolean z16 = i10 > 0 || i9 > 0;
                            i20 = 5;
                            z10 = z13;
                            z8 = true;
                            z9 = z16;
                        } else {
                            z8 = true;
                            if (i18 == 1) {
                                z9 = true;
                                z10 = true;
                                i20 = 6;
                            } else if (i18 == 3) {
                                int i21 = (z3 || this.f1097p == -1 || i10 > 0) ? i11 : 6;
                                c0207c2.m936e(solverVariableM949r3, solverVariableM949r5, constraintAnchor.m959d(), i21);
                                c0207c2.m936e(solverVariableM949r4, solverVariableM949r6, -constraintAnchor2.m959d(), i21);
                                i20 = 5;
                                z9 = true;
                                z10 = true;
                            } else {
                                z9 = false;
                            }
                        }
                        if (z9) {
                            solverVariable3 = solverVariableM949r5;
                            i13 = 5;
                            c0207c2.m934c(solverVariableM949r3, solverVariable3, constraintAnchor.m959d(), f, solverVariableM949r6, solverVariableM949r4, constraintAnchor2.m959d(), i20);
                            solverVariable4 = solverVariableM949r6;
                            constraintAnchor4 = constraintAnchor;
                            z12 = constraintAnchor4.f1032d.f1030b instanceof C0211b;
                            constraintAnchor3 = constraintAnchor2;
                            boolean z17 = constraintAnchor3.f1032d.f1030b instanceof C0211b;
                            if (!z12 && !z17) {
                                i14 = 5;
                                z11 = z8;
                                i13 = 6;
                                z8 = z;
                            } else if (z12 && z17) {
                                z11 = z;
                                i14 = 6;
                            }
                            if (z10) {
                                i14 = 6;
                                i13 = 6;
                            }
                            if ((z7 && z8) || z10) {
                                c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                            }
                            if ((z7 && z11) || z10) {
                                c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                            }
                            if (z) {
                                i15 = 6;
                                i12 = 0;
                                c0207c2.m940i(solverVariableM949r3, solverVariable, 0, 6);
                            } else {
                                i15 = 6;
                                i12 = 0;
                            }
                        } else {
                            constraintAnchor3 = constraintAnchor2;
                            solverVariable3 = solverVariableM949r5;
                            solverVariable4 = solverVariableM949r6;
                            i13 = 5;
                            constraintAnchor4 = constraintAnchor;
                        }
                        z11 = z;
                        z8 = z11;
                        i14 = i13;
                        if (z10) {
                            i14 = 6;
                            i13 = 6;
                        }
                        if (z7) {
                            c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                        } else {
                            c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                        }
                        if (z7) {
                            c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                        } else {
                            c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                        }
                        if (z) {
                            i15 = 6;
                            i12 = 0;
                            c0207c2.m940i(solverVariableM949r3, solverVariable, 0, 6);
                        } else {
                            i15 = 6;
                            i12 = 0;
                        }
                    } else {
                        z8 = true;
                        z9 = true;
                    }
                    z10 = false;
                    if (z9) {
                        solverVariable3 = solverVariableM949r5;
                        i13 = 5;
                        c0207c2.m934c(solverVariableM949r3, solverVariable3, constraintAnchor.m959d(), f, solverVariableM949r6, solverVariableM949r4, constraintAnchor2.m959d(), i20);
                        solverVariable4 = solverVariableM949r6;
                        constraintAnchor4 = constraintAnchor;
                        z12 = constraintAnchor4.f1032d.f1030b instanceof C0211b;
                        constraintAnchor3 = constraintAnchor2;
                        boolean z18 = constraintAnchor3.f1032d.f1030b instanceof C0211b;
                        if (!z12) {
                            if (z12) {
                            }
                        } else if (z12) {
                        }
                        if (z10) {
                            i14 = 6;
                            i13 = 6;
                        }
                        if (z7) {
                            c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                        } else {
                            c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                        }
                        if (z7) {
                            c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                        } else {
                            c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                        }
                        if (z) {
                            i15 = 6;
                            i12 = 0;
                            c0207c2.m940i(solverVariableM949r3, solverVariable, 0, 6);
                        } else {
                            i15 = 6;
                            i12 = 0;
                        }
                    } else {
                        constraintAnchor3 = constraintAnchor2;
                        solverVariable3 = solverVariableM949r5;
                        solverVariable4 = solverVariableM949r6;
                        i13 = 5;
                        constraintAnchor4 = constraintAnchor;
                    }
                    z11 = z;
                    z8 = z11;
                    i14 = i13;
                    if (z10) {
                        i14 = 6;
                        i13 = 6;
                    }
                    if (z7) {
                        c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                    } else {
                        c0207c2.m940i(solverVariableM949r3, solverVariable3, constraintAnchor4.m959d(), i14);
                    }
                    if (z7) {
                        c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                    } else {
                        c0207c2.m942k(solverVariableM949r4, solverVariable4, -constraintAnchor3.m959d(), i13);
                    }
                    if (z) {
                        i15 = 6;
                        i12 = 0;
                        c0207c2.m940i(solverVariableM949r3, solverVariable, 0, 6);
                    } else {
                        i15 = 6;
                        i12 = 0;
                    }
                }
            } else if (z) {
                c0207c2.m940i(solverVariable2, solverVariableM949r4, 0, 5);
            }
            i15 = 6;
        } else if (z) {
            i12 = 0;
            c0207c2.m940i(solverVariable2, solverVariableM949r4, 0, 5);
            i15 = 6;
        } else {
            i15 = 6;
            i12 = 0;
        }
        if (z) {
            c0207c2.m940i(solverVariable2, solverVariableM949r4, i12, i15);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m1013e0(int i) {
        this.f1090l0 = i;
    }

    /* JADX INFO: renamed from: f */
    public void m1014f(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        m987J(type, constraintWidget, type, i, 0);
        this.f1105t = f;
    }

    /* JADX INFO: renamed from: f0 */
    public void m1015f0(int i, int i2) {
        this.f1051K = i;
        int i3 = i2 - i;
        this.f1047G = i3;
        int i4 = this.f1062V;
        if (i3 < i4) {
            this.f1047G = i4;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1016g(C0207c c0207c) {
        c0207c.m949r(this.f1107u);
        c0207c.m949r(this.f1108v);
        c0207c.m949r(this.f1109w);
        c0207c.m949r(this.f1110x);
        if (this.f1061U > 0) {
            c0207c.m949r(this.f1111y);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m1017g0(DimensionBehaviour dimensionBehaviour) {
        this.f1045E[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            m1053y0(this.f1064X);
        }
    }

    /* JADX INFO: renamed from: h */
    public ConstraintAnchor mo1018h(ConstraintAnchor.Type type) {
        switch (C0209a.f1113a[type.ordinal()]) {
            case 1:
                return this.f1107u;
            case 2:
                return this.f1108v;
            case 3:
                return this.f1109w;
            case 4:
                return this.f1110x;
            case 5:
                return this.f1111y;
            case 6:
                return this.f1042B;
            case 7:
                return this.f1112z;
            case 8:
                return this.f1041A;
            default:
                y9g0.m213537a(type.name());
            case 9:
                return null;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m1019h0(int i, int i2, int i3, float f) {
        this.f1075e = i;
        this.f1081h = i2;
        this.f1083i = i3;
        this.f1085j = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f1075e = 2;
    }

    /* JADX INFO: renamed from: i */
    public ArrayList<ConstraintAnchor> mo1020i() {
        return this.f1044D;
    }

    /* JADX INFO: renamed from: i0 */
    public void m1021i0(float f) {
        this.f1098p0[0] = f;
    }

    /* JADX INFO: renamed from: j */
    public int m1022j() {
        return this.f1061U;
    }

    /* JADX INFO: renamed from: j0 */
    public void m1023j0(int i) {
        this.f1103s[1] = i;
    }

    /* JADX INFO: renamed from: k */
    public float m1024k(int i) {
        if (i == 0) {
            return this.f1066Z;
        }
        if (i == 1) {
            return this.f1068a0;
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: k0 */
    public void m1025k0(int i) {
        this.f1103s[0] = i;
    }

    /* JADX INFO: renamed from: l */
    public int m1026l() {
        return m984H() + this.f1048H;
    }

    /* JADX INFO: renamed from: l0 */
    public void m1027l0(int i) {
        if (i < 0) {
            this.f1063W = 0;
        } else {
            this.f1063W = i;
        }
    }

    /* JADX INFO: renamed from: m */
    public Object m1028m() {
        return this.f1070b0;
    }

    /* JADX INFO: renamed from: m0 */
    public void m1029m0(int i) {
        if (i < 0) {
            this.f1062V = 0;
        } else {
            this.f1062V = i;
        }
    }

    /* JADX INFO: renamed from: n */
    public String m1030n() {
        return this.f1076e0;
    }

    /* JADX INFO: renamed from: n0 */
    public void mo1031n0(int i, int i2) {
        this.f1059S = i;
        this.f1060T = i2;
    }

    /* JADX INFO: renamed from: o */
    public DimensionBehaviour m1032o(int i) {
        if (i == 0) {
            return m1040s();
        }
        if (i == 1) {
            return m972B();
        }
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public void m1033o0(int i, int i2) {
        this.f1051K = i;
        this.f1052L = i2;
    }

    /* JADX INFO: renamed from: p */
    public int m1034p() {
        return this.f1055O + this.f1059S;
    }

    /* JADX INFO: renamed from: p0 */
    public void m1035p0(ConstraintWidget constraintWidget) {
        this.f1046F = constraintWidget;
    }

    /* JADX INFO: renamed from: q */
    public int m1036q() {
        return this.f1056P + this.f1060T;
    }

    /* JADX INFO: renamed from: q0 */
    public void m1037q0(int i, int i2) {
        if (i2 == 0) {
            this.f1053M = i;
        } else if (i2 == 1) {
            this.f1054N = i;
        }
    }

    /* JADX INFO: renamed from: r */
    public int m1038r() {
        if (this.f1074d0 == 8) {
            return 0;
        }
        return this.f1048H;
    }

    /* JADX INFO: renamed from: r0 */
    public void m1039r0(float f) {
        this.f1068a0 = f;
    }

    /* JADX INFO: renamed from: s */
    public DimensionBehaviour m1040s() {
        return this.f1045E[0];
    }

    /* JADX INFO: renamed from: s0 */
    public void m1041s0(int i) {
        this.f1092m0 = i;
    }

    /* JADX INFO: renamed from: t */
    public int m1042t(int i) {
        if (i == 0) {
            return m976D();
        }
        if (i == 1) {
            return m1038r();
        }
        return 0;
    }

    /* JADX INFO: renamed from: t0 */
    public void m1043t0(int i, int i2) {
        this.f1052L = i;
        int i3 = i2 - i;
        this.f1048H = i3;
        int i4 = this.f1063W;
        if (i3 < i4) {
            this.f1048H = i4;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f1078f0 != null) {
            str = "type: " + this.f1078f0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1076e0 != null) {
            str2 = "id: " + this.f1076e0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f1051K);
        sb.append(", ");
        sb.append(this.f1052L);
        sb.append(") - (");
        sb.append(this.f1047G);
        sb.append(" x ");
        sb.append(this.f1048H);
        sb.append(") wrap: (");
        sb.append(this.f1064X);
        sb.append(" x ");
        sb.append(this.f1065Y);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public ConstraintWidget m1044u() {
        return this.f1046F;
    }

    /* JADX INFO: renamed from: u0 */
    public void m1045u0(DimensionBehaviour dimensionBehaviour) {
        this.f1045E[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            m1007b0(this.f1065Y);
        }
    }

    /* JADX INFO: renamed from: v */
    public int m1046v(int i) {
        if (i == 0) {
            return this.f1053M;
        }
        if (i == 1) {
            return this.f1054N;
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public void m1047v0(int i, int i2, int i3, float f) {
        this.f1077f = i;
        this.f1087k = i2;
        this.f1089l = i3;
        this.f1091m = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f1077f = 2;
    }

    /* JADX INFO: renamed from: w */
    public ovc0 m1048w() {
        if (this.f1073d == null) {
            this.f1073d = new ovc0();
        }
        return this.f1073d;
    }

    /* JADX INFO: renamed from: w0 */
    public void m1049w0(float f) {
        this.f1098p0[1] = f;
    }

    /* JADX INFO: renamed from: x */
    public ovc0 m1050x() {
        if (this.f1071c == null) {
            this.f1071c = new ovc0();
        }
        return this.f1071c;
    }

    /* JADX INFO: renamed from: x0 */
    public void m1051x0(int i) {
        this.f1074d0 = i;
    }

    /* JADX INFO: renamed from: y */
    public int m1052y() {
        return m982G() + this.f1047G;
    }

    /* JADX INFO: renamed from: y0 */
    public void m1053y0(int i) {
        this.f1047G = i;
        int i2 = this.f1062V;
        if (i < i2) {
            this.f1047G = i2;
        }
    }

    /* JADX INFO: renamed from: z */
    public int m1054z() {
        return this.f1051K + this.f1059S;
    }

    /* JADX INFO: renamed from: z0 */
    public void m1055z0(boolean z) {
        this.f1093n = z;
    }
}
