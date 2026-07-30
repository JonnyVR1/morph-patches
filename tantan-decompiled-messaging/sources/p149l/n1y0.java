package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class n1y0 {

    /* JADX INFO: renamed from: a */
    public final eqy0 f136736a;

    /* JADX INFO: renamed from: b */
    public final long f136737b;

    /* JADX INFO: renamed from: c */
    public final long f136738c;

    /* JADX INFO: renamed from: d */
    public final long f136739d;

    /* JADX INFO: renamed from: e */
    public final long f136740e;

    /* JADX INFO: renamed from: f */
    public final boolean f136741f;

    /* JADX INFO: renamed from: g */
    public final boolean f136742g;

    /* JADX INFO: renamed from: h */
    public final boolean f136743h;

    /* JADX INFO: renamed from: i */
    public final boolean f136744i;

    public n1y0(eqy0 eqy0Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        f5v0.m119533d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        f5v0.m119533d(z5);
        this.f136736a = eqy0Var;
        this.f136737b = j;
        this.f136738c = j2;
        this.f136739d = j3;
        this.f136740e = j4;
        this.f136741f = false;
        this.f136742g = z2;
        this.f136743h = z3;
        this.f136744i = z4;
    }

    /* JADX INFO: renamed from: a */
    public final n1y0 m157517a(long j) {
        return j == this.f136738c ? this : new n1y0(this.f136736a, this.f136737b, j, this.f136739d, this.f136740e, false, this.f136742g, this.f136743h, this.f136744i);
    }

    /* JADX INFO: renamed from: b */
    public final n1y0 m157518b(long j) {
        return j == this.f136737b ? this : new n1y0(this.f136736a, j, this.f136738c, this.f136739d, this.f136740e, false, this.f136742g, this.f136743h, this.f136744i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1y0.class == obj.getClass()) {
            n1y0 n1y0Var = (n1y0) obj;
            if (this.f136737b == n1y0Var.f136737b && this.f136738c == n1y0Var.f136738c && this.f136739d == n1y0Var.f136739d && this.f136740e == n1y0Var.f136740e && this.f136742g == n1y0Var.f136742g && this.f136743h == n1y0Var.f136743h && this.f136744i == n1y0Var.f136744i && ggw0.m126064f(this.f136736a, n1y0Var.f136736a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f136736a.hashCode() + 527;
        long j = this.f136740e;
        long j2 = this.f136739d;
        return (((((((((((((iHashCode * 31) + ((int) this.f136737b)) * 31) + ((int) this.f136738c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.f136742g ? 1 : 0)) * 31) + (this.f136743h ? 1 : 0)) * 31) + (this.f136744i ? 1 : 0);
    }
}
