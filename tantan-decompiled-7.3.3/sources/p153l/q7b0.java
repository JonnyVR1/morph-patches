package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class q7b0 {

    /* JADX INFO: renamed from: c */
    public boolean f155945c;

    /* JADX INFO: renamed from: d */
    public boolean f155946d;

    /* JADX INFO: renamed from: e */
    public boolean f155947e;

    /* JADX INFO: renamed from: a */
    public final h0j0 f155943a = new h0j0(0);

    /* JADX INFO: renamed from: f */
    public long f155948f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f155949g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f155950h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final ig60 f155944b = new ig60();

    /* JADX INFO: renamed from: a */
    public static boolean m175640a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* JADX INFO: renamed from: l */
    public static long m175641l(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f();
        if (ig60Var.m139811a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ig60Var.m139822l(bArr, 0, 9);
        ig60Var.m139808U(iM139816f);
        if (m175640a(bArr)) {
            return m175642m(bArr);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: m */
    public static long m175642m(byte[] bArr) {
        byte b = bArr[0];
        long j = (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b2 = bArr[2];
        return j | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* JADX INFO: renamed from: b */
    public final int m175643b(asf asfVar) {
        this.f155944b.m139805R(bmk0.f77318f);
        this.f155945c = true;
        asfVar.mo99902h();
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public long m175644c() {
        return this.f155950h;
    }

    /* JADX INFO: renamed from: d */
    public h0j0 m175645d() {
        return this.f155943a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m175646e() {
        return this.f155945c;
    }

    /* JADX INFO: renamed from: f */
    public final int m175647f(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: g */
    public int m175648g(asf asfVar, ll80 ll80Var) throws IOException {
        if (!this.f155947e) {
            return m175651j(asfVar, ll80Var);
        }
        if (this.f155949g == -9223372036854775807L) {
            return m175643b(asfVar);
        }
        if (!this.f155946d) {
            return m175649h(asfVar, ll80Var);
        }
        long j = this.f155948f;
        if (j == -9223372036854775807L) {
            return m175643b(asfVar);
        }
        long jM133174b = this.f155943a.m133174b(this.f155949g) - this.f155943a.m133174b(j);
        this.f155950h = jM133174b;
        if (jM133174b < 0) {
            kyv.m152151i("PsDurationReader", "Invalid duration: " + this.f155950h + ". Using TIME_UNSET instead.");
            this.f155950h = -9223372036854775807L;
        }
        return m175643b(asfVar);
    }

    /* JADX INFO: renamed from: h */
    public final int m175649h(asf asfVar, ll80 ll80Var) throws IOException {
        int iMin = (int) Math.min(20000L, asfVar.getLength());
        if (asfVar.getPosition() != 0) {
            ll80Var.f132534a = 0L;
            return 1;
        }
        this.f155944b.m139804Q(iMin);
        asfVar.mo99902h();
        asfVar.mo99900f(this.f155944b.m139815e(), 0, iMin);
        this.f155948f = m175650i(this.f155944b);
        this.f155946d = true;
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final long m175650i(ig60 ig60Var) {
        int iM139817g = ig60Var.m139817g();
        for (int iM139816f = ig60Var.m139816f(); iM139816f < iM139817g - 3; iM139816f++) {
            if (m175647f(ig60Var.m139815e(), iM139816f) == 442) {
                ig60Var.m139808U(iM139816f + 4);
                long jM175641l = m175641l(ig60Var);
                if (jM175641l != -9223372036854775807L) {
                    return jM175641l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: j */
    public final int m175651j(asf asfVar, ll80 ll80Var) throws IOException {
        long length = asfVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (asfVar.getPosition() != j) {
            ll80Var.f132534a = j;
            return 1;
        }
        this.f155944b.m139804Q(iMin);
        asfVar.mo99902h();
        asfVar.mo99900f(this.f155944b.m139815e(), 0, iMin);
        this.f155949g = m175652k(this.f155944b);
        this.f155947e = true;
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final long m175652k(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f();
        for (int iM139817g = ig60Var.m139817g() - 4; iM139817g >= iM139816f; iM139817g--) {
            if (m175647f(ig60Var.m139815e(), iM139817g) == 442) {
                ig60Var.m139808U(iM139817g + 4);
                long jM175641l = m175641l(ig60Var);
                if (jM175641l != -9223372036854775807L) {
                    return jM175641l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
