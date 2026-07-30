package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gkj0 {

    /* JADX INFO: renamed from: a */
    public final int f104738a;

    /* JADX INFO: renamed from: d */
    public boolean f104741d;

    /* JADX INFO: renamed from: e */
    public boolean f104742e;

    /* JADX INFO: renamed from: f */
    public boolean f104743f;

    /* JADX INFO: renamed from: b */
    public final h0j0 f104739b = new h0j0(0);

    /* JADX INFO: renamed from: g */
    public long f104744g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f104745h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f104746i = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ig60 f104740c = new ig60();

    public gkj0(int i) {
        this.f104738a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m130577a(asf asfVar) {
        this.f104740c.m139805R(bmk0.f77318f);
        this.f104741d = true;
        asfVar.mo99902h();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public long m130578b() {
        return this.f104746i;
    }

    /* JADX INFO: renamed from: c */
    public h0j0 m130579c() {
        return this.f104739b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m130580d() {
        return this.f104741d;
    }

    /* JADX INFO: renamed from: e */
    public int m130581e(asf asfVar, ll80 ll80Var, int i) throws IOException {
        if (i <= 0) {
            return m130577a(asfVar);
        }
        if (!this.f104743f) {
            return m130584h(asfVar, ll80Var, i);
        }
        if (this.f104745h == -9223372036854775807L) {
            return m130577a(asfVar);
        }
        if (!this.f104742e) {
            return m130582f(asfVar, ll80Var, i);
        }
        long j = this.f104744g;
        if (j == -9223372036854775807L) {
            return m130577a(asfVar);
        }
        long jM133174b = this.f104739b.m133174b(this.f104745h) - this.f104739b.m133174b(j);
        this.f104746i = jM133174b;
        if (jM133174b < 0) {
            kyv.m152151i("TsDurationReader", "Invalid duration: " + this.f104746i + ". Using TIME_UNSET instead.");
            this.f104746i = -9223372036854775807L;
        }
        return m130577a(asfVar);
    }

    /* JADX INFO: renamed from: f */
    public final int m130582f(asf asfVar, ll80 ll80Var, int i) throws IOException {
        int iMin = (int) Math.min(this.f104738a, asfVar.getLength());
        if (asfVar.getPosition() != 0) {
            ll80Var.f132534a = 0L;
            return 1;
        }
        this.f104740c.m139804Q(iMin);
        asfVar.mo99902h();
        asfVar.mo99900f(this.f104740c.m139815e(), 0, iMin);
        this.f104744g = m130583g(this.f104740c, i);
        this.f104742e = true;
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final long m130583g(ig60 ig60Var, int i) {
        int iM139817g = ig60Var.m139817g();
        for (int iM139816f = ig60Var.m139816f(); iM139816f < iM139817g; iM139816f++) {
            if (ig60Var.m139815e()[iM139816f] == 71) {
                long jM150107c = kkj0.m150107c(ig60Var, iM139816f, i);
                if (jM150107c != -9223372036854775807L) {
                    return jM150107c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public final int m130584h(asf asfVar, ll80 ll80Var, int i) throws IOException {
        long length = asfVar.getLength();
        int iMin = (int) Math.min(this.f104738a, length);
        long j = length - ((long) iMin);
        if (asfVar.getPosition() != j) {
            ll80Var.f132534a = j;
            return 1;
        }
        this.f104740c.m139804Q(iMin);
        asfVar.mo99902h();
        asfVar.mo99900f(this.f104740c.m139815e(), 0, iMin);
        this.f104745h = m130585i(this.f104740c, i);
        this.f104743f = true;
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final long m130585i(ig60 ig60Var, int i) {
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        for (int i2 = iM139817g - 188; i2 >= iM139816f; i2--) {
            if (kkj0.m150106b(ig60Var.m139815e(), iM139816f, iM139817g, i2)) {
                long jM150107c = kkj0.m150107c(ig60Var, i2, i);
                if (jM150107c != -9223372036854775807L) {
                    return jM150107c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
