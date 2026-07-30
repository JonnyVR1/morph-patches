package p153l;

import com.google.common.base.C2677a;

/* JADX INFO: loaded from: classes7.dex */
public final class hy3 {

    /* JADX INFO: renamed from: a */
    public final long f112091a;

    /* JADX INFO: renamed from: b */
    public final long f112092b;

    /* JADX INFO: renamed from: c */
    public final long f112093c;

    /* JADX INFO: renamed from: d */
    public final long f112094d;

    /* JADX INFO: renamed from: e */
    public final long f112095e;

    /* JADX INFO: renamed from: f */
    public final long f112096f;

    public hy3(long j, long j2, long j3, long j4, long j5, long j6) {
        xn80.m212099d(j >= 0);
        xn80.m212099d(j2 >= 0);
        xn80.m212099d(j3 >= 0);
        xn80.m212099d(j4 >= 0);
        xn80.m212099d(j5 >= 0);
        xn80.m212099d(j6 >= 0);
        this.f112091a = j;
        this.f112092b = j2;
        this.f112093c = j3;
        this.f112094d = j4;
        this.f112095e = j5;
        this.f112096f = j6;
    }

    /* JADX INFO: renamed from: a */
    public long m137706a() {
        return this.f112096f;
    }

    /* JADX INFO: renamed from: b */
    public long m137707b() {
        return this.f112091a;
    }

    /* JADX INFO: renamed from: c */
    public long m137708c() {
        return this.f112094d;
    }

    /* JADX INFO: renamed from: d */
    public long m137709d() {
        return this.f112093c;
    }

    /* JADX INFO: renamed from: e */
    public long m137710e() {
        return this.f112092b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof hy3) {
            hy3 hy3Var = (hy3) obj;
            if (this.f112091a == hy3Var.f112091a && this.f112092b == hy3Var.f112092b && this.f112093c == hy3Var.f112093c && this.f112094d == hy3Var.f112094d && this.f112095e == hy3Var.f112095e && this.f112096f == hy3Var.f112096f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long m137711f() {
        return this.f112095e;
    }

    public int hashCode() {
        return k950.m148864b(Long.valueOf(this.f112091a), Long.valueOf(this.f112092b), Long.valueOf(this.f112093c), Long.valueOf(this.f112094d), Long.valueOf(this.f112095e), Long.valueOf(this.f112096f));
    }

    public String toString() {
        return C2677a.m15481b(this).m15485c("hitCount", this.f112091a).m15485c("missCount", this.f112092b).m15485c("loadSuccessCount", this.f112093c).m15485c("loadExceptionCount", this.f112094d).m15485c("totalLoadTime", this.f112095e).m15485c("evictionCount", this.f112096f).toString();
    }
}
