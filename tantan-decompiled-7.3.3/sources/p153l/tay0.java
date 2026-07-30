package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class tay0 {

    /* JADX INFO: renamed from: a */
    public final kzy0 f172814a;

    /* JADX INFO: renamed from: b */
    public final long f172815b;

    /* JADX INFO: renamed from: c */
    public final long f172816c;

    /* JADX INFO: renamed from: d */
    public final long f172817d;

    /* JADX INFO: renamed from: e */
    public final long f172818e;

    /* JADX INFO: renamed from: f */
    public final boolean f172819f;

    /* JADX INFO: renamed from: g */
    public final boolean f172820g;

    /* JADX INFO: renamed from: h */
    public final boolean f172821h;

    /* JADX INFO: renamed from: i */
    public final boolean f172822i;

    public tay0(kzy0 kzy0Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        lev0.m153956d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        lev0.m153956d(z5);
        this.f172814a = kzy0Var;
        this.f172815b = j;
        this.f172816c = j2;
        this.f172817d = j3;
        this.f172818e = j4;
        this.f172819f = false;
        this.f172820g = z2;
        this.f172821h = z3;
        this.f172822i = z4;
    }

    /* JADX INFO: renamed from: a */
    public final tay0 m189962a(long j) {
        return j == this.f172816c ? this : new tay0(this.f172814a, this.f172815b, j, this.f172817d, this.f172818e, false, this.f172820g, this.f172821h, this.f172822i);
    }

    /* JADX INFO: renamed from: b */
    public final tay0 m189963b(long j) {
        return j == this.f172815b ? this : new tay0(this.f172814a, j, this.f172816c, this.f172817d, this.f172818e, false, this.f172820g, this.f172821h, this.f172822i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tay0.class == obj.getClass()) {
            tay0 tay0Var = (tay0) obj;
            if (this.f172815b == tay0Var.f172815b && this.f172816c == tay0Var.f172816c && this.f172817d == tay0Var.f172817d && this.f172818e == tay0Var.f172818e && this.f172820g == tay0Var.f172820g && this.f172821h == tay0Var.f172821h && this.f172822i == tay0Var.f172822i && mpw0.m159408f(this.f172814a, tay0Var.f172814a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f172814a.hashCode() + 527;
        long j = this.f172818e;
        long j2 = this.f172817d;
        return (((((((((((((iHashCode * 31) + ((int) this.f172815b)) * 31) + ((int) this.f172816c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.f172820g ? 1 : 0)) * 31) + (this.f172821h ? 1 : 0)) * 31) + (this.f172822i ? 1 : 0);
    }
}
