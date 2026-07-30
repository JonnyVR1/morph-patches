package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yjr0 {

    /* JADX INFO: renamed from: c */
    public boolean f198679c;

    /* JADX INFO: renamed from: d */
    public boolean f198680d;

    /* JADX INFO: renamed from: e */
    public boolean f198681e;

    /* JADX INFO: renamed from: a */
    public final hew0 f198677a = new hew0(0);

    /* JADX INFO: renamed from: f */
    public long f198682f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f198683g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f198684h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final v6w0 f198678b = new v6w0();

    /* JADX INFO: renamed from: c */
    public static long m215090c(v6w0 v6w0Var) {
        int iM197270s = v6w0Var.m197270s();
        if (v6w0Var.m197268q() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        v6w0Var.m197258g(bArr, 0, 9);
        v6w0Var.m197262k(iM197270s);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    /* JADX INFO: renamed from: g */
    public static final int m215091g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public final int m215092a(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        long j = -9223372036854775807L;
        if (!this.f198681e) {
            long jZzd = k5r0Var.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (k5r0Var.zzf() != j2) {
                s6r0Var.f162847a = j2;
                return 1;
            }
            this.f198678b.m197259h(iMin);
            k5r0Var.zzj();
            ((z4r0) k5r0Var).mo140051c(this.f198678b.m197264m(), 0, iMin, false);
            v6w0 v6w0Var = this.f198678b;
            int iM197270s = v6w0Var.m197270s();
            for (int iM197271t = v6w0Var.m197271t() - 4; iM197271t >= iM197270s; iM197271t--) {
                if (m215091g(v6w0Var.m197264m(), iM197271t) == 442) {
                    v6w0Var.m197262k(iM197271t + 4);
                    long jM215090c = m215090c(v6w0Var);
                    if (jM215090c != -9223372036854775807L) {
                        j = jM215090c;
                        break;
                    }
                }
            }
            this.f198683g = j;
            this.f198681e = true;
            return 0;
        }
        if (this.f198683g == -9223372036854775807L) {
            m215096f(k5r0Var);
            return 0;
        }
        if (this.f198680d) {
            long j3 = this.f198682f;
            if (j3 == -9223372036854775807L) {
                m215096f(k5r0Var);
                return 0;
            }
            hew0 hew0Var = this.f198677a;
            this.f198684h = hew0Var.m130705c(this.f198683g) - hew0Var.m130704b(j3);
            m215096f(k5r0Var);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, k5r0Var.zzd());
        if (k5r0Var.zzf() != 0) {
            s6r0Var.f162847a = 0L;
            return 1;
        }
        this.f198678b.m197259h(iMin2);
        k5r0Var.zzj();
        ((z4r0) k5r0Var).mo140051c(this.f198678b.m197264m(), 0, iMin2, false);
        v6w0 v6w0Var2 = this.f198678b;
        int iM197271t2 = v6w0Var2.m197271t();
        for (int iM197270s2 = v6w0Var2.m197270s(); iM197270s2 < iM197271t2 - 3; iM197270s2++) {
            if (m215091g(v6w0Var2.m197264m(), iM197270s2) == 442) {
                v6w0Var2.m197262k(iM197270s2 + 4);
                long jM215090c2 = m215090c(v6w0Var2);
                if (jM215090c2 != -9223372036854775807L) {
                    j = jM215090c2;
                    break;
                }
            }
        }
        this.f198682f = j;
        this.f198680d = true;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final long m215093b() {
        return this.f198684h;
    }

    /* JADX INFO: renamed from: d */
    public final hew0 m215094d() {
        return this.f198677a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m215095e() {
        return this.f198679c;
    }

    /* JADX INFO: renamed from: f */
    public final int m215096f(k5r0 k5r0Var) {
        byte[] bArr = ggw0.f102573f;
        int length = bArr.length;
        this.f198678b.m197260i(bArr, 0);
        this.f198679c = true;
        k5r0Var.zzj();
        return 0;
    }
}
