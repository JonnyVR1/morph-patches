package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cbj0 {

    /* JADX INFO: renamed from: a */
    public final int f80153a;

    /* JADX INFO: renamed from: d */
    public boolean f80156d;

    /* JADX INFO: renamed from: e */
    public boolean f80157e;

    /* JADX INFO: renamed from: f */
    public boolean f80158f;

    /* JADX INFO: renamed from: b */
    public final eri0 f80154b = new eri0(0);

    /* JADX INFO: renamed from: g */
    public long f80159g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f80160h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f80161i = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final d860 f80155c = new d860();

    public cbj0(int i) {
        this.f80153a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m106008a(tqf tqfVar) {
        this.f80155c.m110289R(vck0.f180953f);
        this.f80156d = true;
        tqfVar.mo150657h();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public long m106009b() {
        return this.f80161i;
    }

    /* JADX INFO: renamed from: c */
    public eri0 m106010c() {
        return this.f80154b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m106011d() {
        return this.f80156d;
    }

    /* JADX INFO: renamed from: e */
    public int m106012e(tqf tqfVar, fd80 fd80Var, int i) throws IOException {
        if (i <= 0) {
            return m106008a(tqfVar);
        }
        if (!this.f80158f) {
            return m106015h(tqfVar, fd80Var, i);
        }
        if (this.f80160h == -9223372036854775807L) {
            return m106008a(tqfVar);
        }
        if (!this.f80157e) {
            return m106013f(tqfVar, fd80Var, i);
        }
        long j = this.f80159g;
        if (j == -9223372036854775807L) {
            return m106008a(tqfVar);
        }
        long jM117837b = this.f80154b.m117837b(this.f80160h) - this.f80154b.m117837b(j);
        this.f80161i = jM117837b;
        if (jM117837b < 0) {
            jwv.m143689i("TsDurationReader", "Invalid duration: " + this.f80161i + ". Using TIME_UNSET instead.");
            this.f80161i = -9223372036854775807L;
        }
        return m106008a(tqfVar);
    }

    /* JADX INFO: renamed from: f */
    public final int m106013f(tqf tqfVar, fd80 fd80Var, int i) throws IOException {
        int iMin = (int) Math.min(this.f80153a, tqfVar.getLength());
        if (tqfVar.getPosition() != 0) {
            fd80Var.f97018a = 0L;
            return 1;
        }
        this.f80155c.m110288Q(iMin);
        tqfVar.mo150657h();
        tqfVar.mo150655f(this.f80155c.m110299e(), 0, iMin);
        this.f80159g = m106014g(this.f80155c, i);
        this.f80157e = true;
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final long m106014g(d860 d860Var, int i) {
        int iM110301g = d860Var.m110301g();
        for (int iM110300f = d860Var.m110300f(); iM110300f < iM110301g; iM110300f++) {
            if (d860Var.m110299e()[iM110300f] == 71) {
                long jM125144c = gbj0.m125144c(d860Var, iM110300f, i);
                if (jM125144c != -9223372036854775807L) {
                    return jM125144c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public final int m106015h(tqf tqfVar, fd80 fd80Var, int i) throws IOException {
        long length = tqfVar.getLength();
        int iMin = (int) Math.min(this.f80153a, length);
        long j = length - ((long) iMin);
        if (tqfVar.getPosition() != j) {
            fd80Var.f97018a = j;
            return 1;
        }
        this.f80155c.m110288Q(iMin);
        tqfVar.mo150657h();
        tqfVar.mo150655f(this.f80155c.m110299e(), 0, iMin);
        this.f80160h = m106016i(this.f80155c, i);
        this.f80158f = true;
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final long m106016i(d860 d860Var, int i) {
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        for (int i2 = iM110301g - 188; i2 >= iM110300f; i2--) {
            if (gbj0.m125143b(d860Var.m110299e(), iM110300f, iM110301g, i2)) {
                long jM125144c = gbj0.m125144c(d860Var, i2, i);
                if (jM125144c != -9223372036854775807L) {
                    return jM125144c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
