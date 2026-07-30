package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class hwt0 {

    /* JADX INFO: renamed from: h */
    public static final String f111922h = Integer.toString(0, 36);

    /* JADX INFO: renamed from: i */
    public static final String f111923i = Integer.toString(1, 36);

    /* JADX INFO: renamed from: j */
    public static final String f111924j = Integer.toString(2, 36);

    /* JADX INFO: renamed from: k */
    public static final String f111925k = Integer.toString(3, 36);

    /* JADX INFO: renamed from: l */
    public static final String f111926l = Integer.toString(4, 36);

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final mhy0 f111927m = new mhy0() { // from class: l.zut0
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public Object f111928a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Object f111929b;

    /* JADX INFO: renamed from: c */
    public int f111930c;

    /* JADX INFO: renamed from: d */
    public long f111931d;

    /* JADX INFO: renamed from: e */
    public long f111932e;

    /* JADX INFO: renamed from: f */
    public boolean f111933f;

    /* JADX INFO: renamed from: g */
    public e4u0 f111934g = e4u0.f92149e;

    /* JADX INFO: renamed from: a */
    public final int m137505a(int i) {
        return this.f111934g.m119483a(i).f150686b;
    }

    /* JADX INFO: renamed from: b */
    public final int m137506b() {
        int i = this.f111934g.f92156a;
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m137507c(long j) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m137508d(long j) {
        this.f111934g.m119484b(-1);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m137509e(int i) {
        return this.f111934g.m119483a(i).m170680a(-1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hwt0.class.equals(obj.getClass())) {
            hwt0 hwt0Var = (hwt0) obj;
            if (mpw0.m159408f(this.f111928a, hwt0Var.f111928a) && mpw0.m159408f(this.f111929b, hwt0Var.f111929b) && this.f111930c == hwt0Var.f111930c && this.f111931d == hwt0Var.f111931d && this.f111933f == hwt0Var.f111933f && mpw0.m159408f(this.f111934g, hwt0Var.f111934g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m137510f(int i, int i2) {
        return this.f111934g.m119483a(i).m170680a(i2);
    }

    /* JADX INFO: renamed from: g */
    public final int m137511g() {
        int i = this.f111934g.f92158c;
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final long m137512h(int i, int i2) {
        p5t0 p5t0VarM119483a = this.f111934g.m119483a(i);
        if (p5t0VarM119483a.f150686b != -1) {
            return p5t0VarM119483a.f150690f[i2];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.f111928a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f111929b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f111930c;
        long j = this.f111931d;
        return (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.f111933f ? 1 : 0)) * 31) + this.f111934g.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final long m137513i(int i) {
        long j = this.f111934g.m119483a(i).f150685a;
        return 0L;
    }

    /* JADX INFO: renamed from: j */
    public final long m137514j() {
        long j = this.f111934g.f92157b;
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public final long m137515k(int i) {
        long j = this.f111934g.m119483a(i).f150691g;
        return 0L;
    }

    /* JADX INFO: renamed from: l */
    public final hwt0 m137516l(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, e4u0 e4u0Var, boolean z) {
        this.f111928a = obj;
        this.f111929b = obj2;
        this.f111930c = i;
        this.f111931d = j;
        this.f111932e = 0L;
        this.f111934g = e4u0Var;
        this.f111933f = z;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m137517m(int i) {
        m137506b();
        if (i != -1) {
            return false;
        }
        this.f111934g.m119484b(-1);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m137518n(int i) {
        boolean z = this.f111934g.m119483a(i).f150692h;
        return false;
    }
}
