package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import p153l.gig0;
import p153l.wx3;

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
    public C0219i f1029a = new C0219i(this);

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
    public static /* synthetic */ class C0209a {

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
    public boolean m957a(ConstraintAnchor constraintAnchor, int i, int i2, Strength strength, int i3, boolean z) {
        if (constraintAnchor == null) {
            this.f1032d = null;
            this.f1033e = 0;
            this.f1034f = -1;
            this.f1035g = Strength.NONE;
            this.f1037i = 2;
            return true;
        }
        if (!z && !m968l(constraintAnchor)) {
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
    public boolean m958b(ConstraintAnchor constraintAnchor, int i, Strength strength, int i2) {
        return m957a(constraintAnchor, i, -1, strength, i2, false);
    }

    /* JADX INFO: renamed from: c */
    public int m959c() {
        return this.f1037i;
    }

    /* JADX INFO: renamed from: d */
    public int m960d() {
        ConstraintAnchor constraintAnchor;
        if (this.f1030b.m975C() == 8) {
            return 0;
        }
        return (this.f1034f <= -1 || (constraintAnchor = this.f1032d) == null || constraintAnchor.f1030b.m975C() != 8) ? this.f1033e : this.f1034f;
    }

    /* JADX INFO: renamed from: e */
    public ConstraintWidget m961e() {
        return this.f1030b;
    }

    /* JADX INFO: renamed from: f */
    public C0219i m962f() {
        return this.f1029a;
    }

    /* JADX INFO: renamed from: g */
    public SolverVariable m963g() {
        return this.f1038j;
    }

    /* JADX INFO: renamed from: h */
    public Strength m964h() {
        return this.f1035g;
    }

    /* JADX INFO: renamed from: i */
    public ConstraintAnchor m965i() {
        return this.f1032d;
    }

    /* JADX INFO: renamed from: j */
    public Type m966j() {
        return this.f1031c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m967k() {
        return this.f1032d != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m968l(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeM966j = constraintAnchor.m966j();
        Type type = this.f1031c;
        if (typeM966j == type) {
            return type != Type.BASELINE || (constraintAnchor.m961e().m987I() && m961e().m987I());
        }
        switch (C0209a.f1039a[type.ordinal()]) {
            case 1:
                return (typeM966j == Type.BASELINE || typeM966j == Type.CENTER_X || typeM966j == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = typeM966j == Type.LEFT || typeM966j == Type.RIGHT;
                if (constraintAnchor.m961e() instanceof C0217g) {
                    return z || typeM966j == Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = typeM966j == Type.TOP || typeM966j == Type.BOTTOM;
                if (constraintAnchor.m961e() instanceof C0217g) {
                    return z2 || typeM966j == Type.CENTER_Y;
                }
                return z2;
            default:
                gig0.m130323a(this.f1031c.name());
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m969m() {
        this.f1032d = null;
        this.f1033e = 0;
        this.f1034f = -1;
        this.f1035g = Strength.STRONG;
        this.f1037i = 0;
        this.f1036h = ConnectionType.RELAXED;
        this.f1029a.mo1115e();
    }

    /* JADX INFO: renamed from: n */
    public void m970n(wx3 wx3Var) {
        SolverVariable solverVariable = this.f1038j;
        if (solverVariable == null) {
            this.f1038j = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.m882d();
        }
    }

    public String toString() {
        return this.f1030b.m1031n() + ":" + this.f1031c.toString();
    }
}
