package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class skr0 {

    /* JADX INFO: renamed from: c */
    public boolean f165006c;

    /* JADX INFO: renamed from: d */
    public boolean f165007d;

    /* JADX INFO: renamed from: e */
    public boolean f165008e;

    /* JADX INFO: renamed from: a */
    public final hew0 f165004a = new hew0(0);

    /* JADX INFO: renamed from: f */
    public long f165009f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f165010g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f165011h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final v6w0 f165005b = new v6w0();

    public skr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final int m184610a(k5r0 k5r0Var, s6r0 s6r0Var, int i) throws IOException {
        if (i <= 0) {
            m184614e(k5r0Var);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.f165008e) {
            if (this.f165010g == -9223372036854775807L) {
                m184614e(k5r0Var);
                return 0;
            }
            if (this.f165007d) {
                long j2 = this.f165009f;
                if (j2 == -9223372036854775807L) {
                    m184614e(k5r0Var);
                    return 0;
                }
                hew0 hew0Var = this.f165004a;
                this.f165011h = hew0Var.m130705c(this.f165010g) - hew0Var.m130704b(j2);
                m184614e(k5r0Var);
                return 0;
            }
            int iMin = (int) Math.min(112800L, k5r0Var.zzd());
            if (k5r0Var.zzf() != 0) {
                s6r0Var.f162847a = 0L;
                return 1;
            }
            this.f165005b.m197259h(iMin);
            k5r0Var.zzj();
            ((z4r0) k5r0Var).mo140051c(this.f165005b.m197264m(), 0, iMin, false);
            v6w0 v6w0Var = this.f165005b;
            int iM197271t = v6w0Var.m197271t();
            for (int iM197270s = v6w0Var.m197270s(); iM197270s < iM197271t; iM197270s++) {
                if (v6w0Var.m197264m()[iM197270s] == 71) {
                    long jM107579b = clr0.m107579b(v6w0Var, iM197270s, i);
                    if (jM107579b != -9223372036854775807L) {
                        j = jM107579b;
                        break;
                    }
                }
            }
            this.f165009f = j;
            this.f165007d = true;
            return 0;
        }
        long jZzd = k5r0Var.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j3 = jZzd - ((long) iMin2);
        if (k5r0Var.zzf() != j3) {
            s6r0Var.f162847a = j3;
            return 1;
        }
        this.f165005b.m197259h(iMin2);
        k5r0Var.zzj();
        ((z4r0) k5r0Var).mo140051c(this.f165005b.m197264m(), 0, iMin2, false);
        v6w0 v6w0Var2 = this.f165005b;
        int iM197270s2 = v6w0Var2.m197270s();
        int iM197271t2 = v6w0Var2.m197271t();
        for (int i2 = iM197271t2 - 188; i2 >= iM197270s2; i2--) {
            byte[] bArrM197264m = v6w0Var2.m197264m();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iM197270s2 && i5 < iM197271t2 && bArrM197264m[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jM107579b2 = clr0.m107579b(v6w0Var2, i2, i);
                        if (jM107579b2 == -9223372036854775807L) {
                            break;
                        }
                        j = jM107579b2;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.f165010g = j;
        this.f165008e = true;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final long m184611b() {
        return this.f165011h;
    }

    /* JADX INFO: renamed from: c */
    public final hew0 m184612c() {
        return this.f165004a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m184613d() {
        return this.f165006c;
    }

    /* JADX INFO: renamed from: e */
    public final int m184614e(k5r0 k5r0Var) {
        byte[] bArr = ggw0.f102573f;
        int length = bArr.length;
        this.f165005b.m197260i(bArr, 0);
        this.f165006c = true;
        k5r0Var.zzj();
        return 0;
    }
}
