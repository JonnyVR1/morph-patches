package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import p149l.xw3;
import p149l.y9g0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: b */
    public final ConstraintWidget f1030b;

    /* JADX INFO: renamed from: c */
    public final Type f1031c;

    /* JADX INFO: renamed from: d */
    public ConstraintAnchor f1032d;

    /* JADX INFO: renamed from: j */
    public SolverVariable f1038j;

    /* JADX INFO: renamed from: a */
    public C0218i f1029a = new C0218i(this);

    /* JADX INFO: renamed from: e */
    public int f1033e = 0;

    /* JADX INFO: renamed from: f */
    public int f1034f = -1;

    /* JADX INFO: renamed from: g */
    public Strength f1035g = Strength.NONE;

    /* JADX INFO: renamed from: h */
    public ConnectionType f1036h = ConnectionType.RELAXED;

    /* JADX INFO: renamed from: i */
    public int f1037i = 0;

    public enum ConnectionType {
        RELAXED,
        STRICT
    }

    public enum Strength {
        NONE,
        STRONG,
        WEAK
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$a */
    public static /* synthetic */ class C0208a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1039a;

        static {
            int[] iArr = new int[Type.values().length];
            f1039a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1039a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1039a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1039a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1039a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1039a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1039a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1039a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1039a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f1030b = constraintWidget;
        this.f1031c = type;
    }

    /* JADX INFO: renamed from: a */
    public boolean m956a(ConstraintAnchor constraintAnchor, int i, int i2, Strength strength, int i3, boolean z) {
        if (constraintAnchor == null) {
            this.f1032d = null;
            this.f1033e = 0;
            this.f1034f = -1;
            this.f1035g = Strength.NONE;
            this.f1037i = 2;
            return true;
        }
        if (!z && !m967l(constraintAnchor)) {
            return false;
        }
        this.f1032d = constraintAnchor;
        if (i > 0) {
            this.f1033e = i;
        } else {
            this.f1033e = 0;
        }
        this.f1034f = i2;
        this.f1035g = strength;
        this.f1037i = i3;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m957b(ConstraintAnchor constraintAnchor, int i, Strength strength, int i2) {
        return m956a(constraintAnchor, i, -1, strength, i2, false);
    }

    /* JADX INFO: renamed from: c */
    public int m958c() {
        return this.f1037i;
    }

    /* JADX INFO: renamed from: d */
    public int m959d() {
        ConstraintAnchor constraintAnchor;
        if (this.f1030b.m974C() == 8) {
            return 0;
        }
        return (this.f1034f <= -1 || (constraintAnchor = this.f1032d) == null || constraintAnchor.f1030b.m974C() != 8) ? this.f1033e : this.f1034f;
    }

    /* JADX INFO: renamed from: e */
    public ConstraintWidget m960e() {
        return this.f1030b;
    }

    /* JADX INFO: renamed from: f */
    public C0218i m961f() {
        return this.f1029a;
    }

    /* JADX INFO: renamed from: g */
    public SolverVariable m962g() {
        return this.f1038j;
    }

    /* JADX INFO: renamed from: h */
    public Strength m963h() {
        return this.f1035g;
    }

    /* JADX INFO: renamed from: i */
    public ConstraintAnchor m964i() {
        return this.f1032d;
    }

    /* JADX INFO: renamed from: j */
    public Type m965j() {
        return this.f1031c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m966k() {
        return this.f1032d != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m967l(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeM965j = constraintAnchor.m965j();
        Type type = this.f1031c;
        if (typeM965j == type) {
            return type != Type.BASELINE || (constraintAnchor.m960e().m986I() && m960e().m986I());
        }
        switch (C0208a.f1039a[type.ordinal()]) {
            case 1:
                return (typeM965j == Type.BASELINE || typeM965j == Type.CENTER_X || typeM965j == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = typeM965j == Type.LEFT || typeM965j == Type.RIGHT;
                if (constraintAnchor.m960e() instanceof C0216g) {
                    return z || typeM965j == Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = typeM965j == Type.TOP || typeM965j == Type.BOTTOM;
                if (constraintAnchor.m960e() instanceof C0216g) {
                    return z2 || typeM965j == Type.CENTER_Y;
                }
                return z2;
            default:
                y9g0.m213537a(this.f1031c.name());
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m968m() {
        this.f1032d = null;
        this.f1033e = 0;
        this.f1034f = -1;
        this.f1035g = Strength.STRONG;
        this.f1037i = 0;
        this.f1036h = ConnectionType.RELAXED;
        this.f1029a.mo1114e();
    }

    /* JADX INFO: renamed from: n */
    public void m969n(xw3 xw3Var) {
        SolverVariable solverVariable = this.f1038j;
        if (solverVariable == null) {
            this.f1038j = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.m881d();
        }
    }

    public String toString() {
        return this.f1030b.m1030n() + ":" + this.f1031c.toString();
    }
}
