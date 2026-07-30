package p149l;

import com.google.common.base.C2654a;

/* JADX INFO: loaded from: classes7.dex */
public final class ix3 {

    /* JADX INFO: renamed from: a */
    public final long f115321a;

    /* JADX INFO: renamed from: b */
    public final long f115322b;

    /* JADX INFO: renamed from: c */
    public final long f115323c;

    /* JADX INFO: renamed from: d */
    public final long f115324d;

    /* JADX INFO: renamed from: e */
    public final long f115325e;

    /* JADX INFO: renamed from: f */
    public final long f115326f;

    public ix3(long j, long j2, long j3, long j4, long j5, long j6) {
        sf80.m183882d(j >= 0);
        sf80.m183882d(j2 >= 0);
        sf80.m183882d(j3 >= 0);
        sf80.m183882d(j4 >= 0);
        sf80.m183882d(j5 >= 0);
        sf80.m183882d(j6 >= 0);
        this.f115321a = j;
        this.f115322b = j2;
        this.f115323c = j3;
        this.f115324d = j4;
        this.f115325e = j5;
        this.f115326f = j6;
    }

    /* JADX INFO: renamed from: a */
    public long m138784a() {
        return this.f115326f;
    }

    /* JADX INFO: renamed from: b */
    public long m138785b() {
        return this.f115321a;
    }

    /* JADX INFO: renamed from: c */
    public long m138786c() {
        return this.f115324d;
    }

    /* JADX INFO: renamed from: d */
    public long m138787d() {
        return this.f115323c;
    }

    /* JADX INFO: renamed from: e */
    public long m138788e() {
        return this.f115322b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ix3) {
            ix3 ix3Var = (ix3) obj;
            if (this.f115321a == ix3Var.f115321a && this.f115322b == ix3Var.f115322b && this.f115323c == ix3Var.f115323c && this.f115324d == ix3Var.f115324d && this.f115325e == ix3Var.f115325e && this.f115326f == ix3Var.f115326f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long m138789f() {
        return this.f115325e;
    }

    public int hashCode() {
        return v050.m196471b(Long.valueOf(this.f115321a), Long.valueOf(this.f115322b), Long.valueOf(this.f115323c), Long.valueOf(this.f115324d), Long.valueOf(this.f115325e), Long.valueOf(this.f115326f));
    }

    public String toString() {
        return C2654a.m15427b(this).m15431c("hitCount", this.f115321a).m15431c("missCount", this.f115322b).m15431c("loadSuccessCount", this.f115323c).m15431c("loadExceptionCount", this.f115324d).m15431c("totalLoadTime", this.f115325e).m15431c("evictionCount", this.f115326f).toString();
    }
}
