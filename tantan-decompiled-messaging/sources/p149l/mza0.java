package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mza0 {

    /* JADX INFO: renamed from: c */
    public boolean f136359c;

    /* JADX INFO: renamed from: d */
    public boolean f136360d;

    /* JADX INFO: renamed from: e */
    public boolean f136361e;

    /* JADX INFO: renamed from: a */
    public final eri0 f136357a = new eri0(0);

    /* JADX INFO: renamed from: f */
    public long f136362f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f136363g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f136364h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final d860 f136358b = new d860();

    /* JADX INFO: renamed from: a */
    public static boolean m157106a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* JADX INFO: renamed from: l */
    public static long m157107l(d860 d860Var) {
        int iM110300f = d860Var.m110300f();
        if (d860Var.m110295a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d860Var.m110306l(bArr, 0, 9);
        d860Var.m110292U(iM110300f);
        if (m157106a(bArr)) {
            return m157108m(bArr);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: m */
    public static long m157108m(byte[] bArr) {
        byte b = bArr[0];
        long j = (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b2 = bArr[2];
        return j | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* JADX INFO: renamed from: b */
    public final int m157109b(tqf tqfVar) {
        this.f136358b.m110289R(vck0.f180953f);
        this.f136359c = true;
        tqfVar.mo150657h();
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public long m157110c() {
        return this.f136364h;
    }

    /* JADX INFO: renamed from: d */
    public eri0 m157111d() {
        return this.f136357a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m157112e() {
        return this.f136359c;
    }

    /* JADX INFO: renamed from: f */
    public final int m157113f(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: g */
    public int m157114g(tqf tqfVar, fd80 fd80Var) throws IOException {
        if (!this.f136361e) {
            return m157117j(tqfVar, fd80Var);
        }
        if (this.f136363g == -9223372036854775807L) {
            return m157109b(tqfVar);
        }
        if (!this.f136360d) {
            return m157115h(tqfVar, fd80Var);
        }
        long j = this.f136362f;
        if (j == -9223372036854775807L) {
            return m157109b(tqfVar);
        }
        long jM117837b = this.f136357a.m117837b(this.f136363g) - this.f136357a.m117837b(j);
        this.f136364h = jM117837b;
        if (jM117837b < 0) {
            jwv.m143689i("PsDurationReader", "Invalid duration: " + this.f136364h + ". Using TIME_UNSET instead.");
            this.f136364h = -9223372036854775807L;
        }
        return m157109b(tqfVar);
    }

    /* JADX INFO: renamed from: h */
    public final int m157115h(tqf tqfVar, fd80 fd80Var) throws IOException {
        int iMin = (int) Math.min(20000L, tqfVar.getLength());
        if (tqfVar.getPosition() != 0) {
            fd80Var.f97018a = 0L;
            return 1;
        }
        this.f136358b.m110288Q(iMin);
        tqfVar.mo150657h();
        tqfVar.mo150655f(this.f136358b.m110299e(), 0, iMin);
        this.f136362f = m157116i(this.f136358b);
        this.f136360d = true;
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final long m157116i(d860 d860Var) {
        int iM110301g = d860Var.m110301g();
        for (int iM110300f = d860Var.m110300f(); iM110300f < iM110301g - 3; iM110300f++) {
            if (m157113f(d860Var.m110299e(), iM110300f) == 442) {
                d860Var.m110292U(iM110300f + 4);
                long jM157107l = m157107l(d860Var);
                if (jM157107l != -9223372036854775807L) {
                    return jM157107l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: j */
    public final int m157117j(tqf tqfVar, fd80 fd80Var) throws IOException {
        long length = tqfVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (tqfVar.getPosition() != j) {
            fd80Var.f97018a = j;
            return 1;
        }
        this.f136358b.m110288Q(iMin);
        tqfVar.mo150657h();
        tqfVar.mo150655f(this.f136358b.m110299e(), 0, iMin);
        this.f136363g = m157118k(this.f136358b);
        this.f136361e = true;
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final long m157118k(d860 d860Var) {
        int iM110300f = d860Var.m110300f();
        for (int iM110301g = d860Var.m110301g() - 4; iM110301g >= iM110300f; iM110301g--) {
            if (m157113f(d860Var.m110299e(), iM110301g) == 442) {
                d860Var.m110292U(iM110301g + 4);
                long jM157107l = m157107l(d860Var);
                if (jM157107l != -9223372036854775807L) {
                    return jM157107l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
