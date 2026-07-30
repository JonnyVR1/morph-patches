package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p153l.gjx0;
import p153l.tgx0;
import p153l.wgx0;
import p153l.xlx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2205k5 extends wgx0 {

    /* JADX INFO: renamed from: e */
    public final Iterable f9993e;

    /* JADX INFO: renamed from: f */
    public final Iterator f9994f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f9995g;

    /* JADX INFO: renamed from: h */
    public int f9996h;

    /* JADX INFO: renamed from: i */
    public int f9997i;

    /* JADX INFO: renamed from: j */
    public int f9998j;

    /* JADX INFO: renamed from: k */
    public int f9999k;

    /* JADX INFO: renamed from: l */
    public int f10000l;

    /* JADX INFO: renamed from: m */
    public long f10001m;

    /* JADX INFO: renamed from: n */
    public long f10002n;

    /* JADX INFO: renamed from: o */
    public long f10003o;

    public /* synthetic */ C2205k5(Iterable iterable, int i, boolean z, tgx0 tgx0Var) {
        super(null);
        this.f9998j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f9996h = i;
        this.f9993e = iterable;
        this.f9994f = iterable.iterator();
        this.f10000l = 0;
        if (i != 0) {
            m12886H();
            return;
        }
        this.f9995g = gjx0.f104692e;
        this.f10001m = 0L;
        this.f10002n = 0L;
        this.f10003o = 0L;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: A */
    public final String mo12835A() throws IOException {
        int iM12889K = m12889K();
        if (iM12889K > 0) {
            long j = this.f10003o;
            long j2 = this.f10001m;
            long j3 = iM12889K;
            if (j3 <= j - j2) {
                String strM13553g = C2317y5.m13553g(this.f9995g, (int) (j2 - this.f10002n), iM12889K);
                this.f10001m += j3;
                return strM13553g;
            }
        }
        if (iM12889K >= 0 && iM12889K <= m12882D()) {
            byte[] bArr = new byte[iM12889K];
            m12884F(bArr, 0, iM12889K);
            return C2317y5.m13554h(bArr, 0, iM12889K);
        }
        if (iM12889K == 0) {
            return "";
        }
        if (iM12889K <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: B */
    public final void mo12836B(int i) throws zzhag {
        if (this.f9999k != i) {
            throw zzhag.zzb();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12881C(int i) throws IOException {
        if (i >= 0) {
            if (i <= (((long) (this.f9996h - this.f10000l)) - this.f10001m) + this.f10002n) {
                while (i > 0) {
                    if (this.f10003o - this.f10001m == 0) {
                        m12883E();
                    }
                    int iMin = Math.min(i, (int) (this.f10003o - this.f10001m));
                    i -= iMin;
                    this.f10001m += (long) iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw zzhag.zzj();
        }
        throw zzhag.zzf();
    }

    /* JADX INFO: renamed from: D */
    public final int m12882D() {
        return (int) ((((long) (this.f9996h - this.f10000l)) - this.f10001m) + this.f10002n);
    }

    /* JADX INFO: renamed from: E */
    public final void m12883E() throws zzhag {
        if (!this.f9994f.hasNext()) {
            throw zzhag.zzj();
        }
        m12886H();
    }

    /* JADX INFO: renamed from: F */
    public final void m12884F(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > m12882D()) {
            if (i2 > 0) {
                throw zzhag.zzj();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.f10003o - this.f10001m == 0) {
                m12883E();
            }
            int iMin = Math.min(i3, (int) (this.f10003o - this.f10001m));
            long j = iMin;
            xlx0.m211710w(this.f10001m, bArr, i2 - i3, j);
            i3 -= iMin;
            this.f10001m += j;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m12885G() {
        int i = this.f9996h + this.f9997i;
        this.f9996h = i;
        int i2 = this.f9998j;
        if (i <= i2) {
            this.f9997i = 0;
            return;
        }
        int i3 = i - i2;
        this.f9997i = i3;
        this.f9996h = i - i3;
    }

    /* JADX INFO: renamed from: H */
    public final void m12886H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f9994f.next();
        this.f9995g = byteBuffer;
        this.f10000l += (int) (this.f10001m - this.f10002n);
        long jPosition = byteBuffer.position();
        this.f10001m = jPosition;
        this.f10002n = jPosition;
        this.f10003o = this.f9995g.limit();
        long jM211700m = xlx0.m211700m(this.f9995g);
        this.f10001m += jM211700m;
        this.f10002n += jM211700m;
        this.f10003o += jM211700m;
    }

    /* JADX INFO: renamed from: I */
    public final byte m12887I() throws IOException {
        if (this.f10003o - this.f10001m == 0) {
            m12883E();
        }
        long j = this.f10001m;
        this.f10001m = 1 + j;
        return xlx0.m211696i(j);
    }

    /* JADX INFO: renamed from: J */
    public final int m12888J() throws IOException {
        long j = this.f10003o;
        long j2 = this.f10001m;
        if (j - j2 < 4) {
            int iM12887I = m12887I() & 255;
            int iM12887I2 = (m12887I() & 255) << 8;
            return ((m12887I() & 255) << 24) | iM12887I | iM12887I2 | ((m12887I() & 255) << 16);
        }
        this.f10001m = 4 + j2;
        int iM211696i = xlx0.m211696i(j2) & 255;
        int iM211696i2 = (xlx0.m211696i(1 + j2) & 255) << 8;
        return iM211696i | iM211696i2 | ((xlx0.m211696i(2 + j2) & 255) << 16) | ((xlx0.m211696i(j2 + 3) & 255) << 24);
    }

    /* JADX INFO: renamed from: K */
    public final int m12889K() throws IOException {
        int i;
        long j = this.f10001m;
        if (this.f10003o != j) {
            long j2 = j + 1;
            byte bM211696i = xlx0.m211696i(j);
            if (bM211696i >= 0) {
                this.f10001m++;
                return bM211696i;
            }
            if (this.f10003o - this.f10001m >= 10) {
                long j3 = 2 + j;
                int iM211696i = (xlx0.m211696i(j2) << 7) ^ bM211696i;
                if (iM211696i < 0) {
                    i = iM211696i ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iM211696i2 = (xlx0.m211696i(j3) << 14) ^ iM211696i;
                    if (iM211696i2 >= 0) {
                        i = iM211696i2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iM211696i3 = iM211696i2 ^ (xlx0.m211696i(j4) << 21);
                        if (iM211696i3 < 0) {
                            i = (-2080896) ^ iM211696i3;
                        } else {
                            j4 = 5 + j;
                            byte bM211696i2 = xlx0.m211696i(j5);
                            int i2 = (iM211696i3 ^ (bM211696i2 << 28)) ^ 266354560;
                            if (bM211696i2 < 0) {
                                j5 = 6 + j;
                                if (xlx0.m211696i(j4) < 0) {
                                    j4 = 7 + j;
                                    if (xlx0.m211696i(j5) < 0) {
                                        j5 = 8 + j;
                                        if (xlx0.m211696i(j4) < 0) {
                                            j4 = 9 + j;
                                            if (xlx0.m211696i(j5) < 0) {
                                                long j6 = j + 10;
                                                if (xlx0.m211696i(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.f10001m = j3;
                return i;
            }
        }
        return (int) m12892N();
    }

    /* JADX INFO: renamed from: L */
    public final long m12890L() throws IOException {
        long j = this.f10003o;
        long j2 = this.f10001m;
        if (j - j2 < 8) {
            long jM12887I = ((long) m12887I()) & 255;
            long jM12887I2 = (((long) m12887I()) & 255) << 8;
            long jM12887I3 = (((long) m12887I()) & 255) << 16;
            long jM12887I4 = (((long) m12887I()) & 255) << 24;
            long jM12887I5 = (((long) m12887I()) & 255) << 32;
            long jM12887I6 = (((long) m12887I()) & 255) << 40;
            return ((((long) m12887I()) & 255) << 56) | jM12887I | jM12887I2 | jM12887I3 | jM12887I4 | jM12887I5 | jM12887I6 | ((((long) m12887I()) & 255) << 48);
        }
        this.f10001m = 8 + j2;
        long jM211696i = ((long) xlx0.m211696i(j2)) & 255;
        long jM211696i2 = (((long) xlx0.m211696i(1 + j2)) & 255) << 8;
        long jM211696i3 = (((long) xlx0.m211696i(2 + j2)) & 255) << 16;
        long jM211696i4 = (((long) xlx0.m211696i(3 + j2)) & 255) << 24;
        long jM211696i5 = (((long) xlx0.m211696i(j2 + 4)) & 255) << 32;
        long jM211696i6 = (((long) xlx0.m211696i(j2 + 5)) & 255) << 40;
        return jM211696i | jM211696i2 | jM211696i3 | jM211696i4 | jM211696i5 | jM211696i6 | ((((long) xlx0.m211696i(6 + j2)) & 255) << 48) | ((((long) xlx0.m211696i(j2 + 7)) & 255) << 56);
    }

    /* JADX INFO: renamed from: M */
    public final long m12891M() throws IOException {
        long j;
        long j2;
        long j3 = this.f10001m;
        if (this.f10003o != j3) {
            long j4 = j3 + 1;
            byte bM211696i = xlx0.m211696i(j3);
            if (bM211696i >= 0) {
                this.f10001m++;
                return bM211696i;
            }
            if (this.f10003o - this.f10001m >= 10) {
                long j5 = 2 + j3;
                int iM211696i = (xlx0.m211696i(j4) << 7) ^ bM211696i;
                if (iM211696i < 0) {
                    j = iM211696i ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iM211696i2 = (xlx0.m211696i(j5) << 14) ^ iM211696i;
                    if (iM211696i2 >= 0) {
                        j = iM211696i2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iM211696i3 = iM211696i2 ^ (xlx0.m211696i(j6) << 21);
                        if (iM211696i3 < 0) {
                            j = (-2080896) ^ iM211696i3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jM211696i = (((long) xlx0.m211696i(j7)) << 28) ^ ((long) iM211696i3);
                            if (jM211696i >= 0) {
                                j = 266354560 ^ jM211696i;
                            } else {
                                long j8 = 6 + j3;
                                long jM211696i2 = jM211696i ^ (((long) xlx0.m211696i(j6)) << 35);
                                if (jM211696i2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jM211696i3 = jM211696i2 ^ (((long) xlx0.m211696i(j8)) << 42);
                                    if (jM211696i3 >= 0) {
                                        j = 4363953127296L ^ jM211696i3;
                                    } else {
                                        j8 = 8 + j3;
                                        jM211696i2 = jM211696i3 ^ (((long) xlx0.m211696i(j9)) << 49);
                                        if (jM211696i2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jM211696i4 = (jM211696i2 ^ (((long) xlx0.m211696i(j8)) << 56)) ^ 71499008037633920L;
                                            if (jM211696i4 < 0) {
                                                long j10 = j3 + 10;
                                                if (xlx0.m211696i(j9) >= 0) {
                                                    j5 = j10;
                                                    j = jM211696i4;
                                                }
                                            } else {
                                                j = jM211696i4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jM211696i2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.f10001m = j5;
                return j;
            }
        }
        return m12892N();
    }

    /* JADX INFO: renamed from: N */
    public final long m12892N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM12887I = m12887I();
            j |= ((long) (bM12887I & 127)) << i;
            if ((bM12887I & 128) == 0) {
                return j;
            }
        }
        throw zzhag.zze();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: a */
    public final void mo12845a(int i) {
        this.f9998j = i;
        m12885G();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: b */
    public final boolean mo12846b() throws IOException {
        return (((long) this.f10000l) + this.f10001m) - this.f10002n == ((long) this.f9996h);
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: c */
    public final boolean mo12847c() throws IOException {
        return m12891M() != 0;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: d */
    public final boolean mo12848d(int i) throws IOException {
        int iMo12858r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (m12887I() >= 0) {
                    return true;
                }
            }
            throw zzhag.zze();
        }
        if (i2 == 1) {
            m12881C(8);
            return true;
        }
        if (i2 == 2) {
            m12881C(m12889K());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            m12881C(4);
            return true;
        }
        do {
            iMo12858r = mo12858r();
            if (iMo12858r == 0) {
                break;
            }
        } while (mo12848d(iMo12858r));
        mo12836B(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: i */
    public final double mo12849i() throws IOException {
        return Double.longBitsToDouble(m12890L());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: j */
    public final float mo12850j() throws IOException {
        return Float.intBitsToFloat(m12888J());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: k */
    public final int mo12851k() {
        return (int) ((((long) this.f10000l) + this.f10001m) - this.f10002n);
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: l */
    public final int mo12852l(int i) throws zzhag {
        if (i < 0) {
            throw zzhag.zzf();
        }
        int iMo12851k = i + mo12851k();
        int i2 = this.f9998j;
        if (iMo12851k > i2) {
            throw zzhag.zzj();
        }
        this.f9998j = iMo12851k;
        m12885G();
        return i2;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: m */
    public final int mo12853m() throws IOException {
        return m12889K();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: n */
    public final int mo12854n() throws IOException {
        return m12888J();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: o */
    public final int mo12855o() throws IOException {
        return m12889K();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: p */
    public final int mo12856p() throws IOException {
        return m12888J();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: q */
    public final int mo12857q() throws IOException {
        return wgx0.m206326e(m12889K());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: r */
    public final int mo12858r() throws IOException {
        if (mo12846b()) {
            this.f9999k = 0;
            return 0;
        }
        int iM12889K = m12889K();
        this.f9999k = iM12889K;
        if ((iM12889K >>> 3) != 0) {
            return iM12889K;
        }
        throw zzhag.zzc();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: s */
    public final int mo12859s() throws IOException {
        return m12889K();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: t */
    public final long mo12860t() throws IOException {
        return m12890L();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: u */
    public final long mo12861u() throws IOException {
        return m12891M();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: v */
    public final long mo12862v() throws IOException {
        return m12890L();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: w */
    public final long mo12863w() throws IOException {
        return wgx0.m206327f(m12891M());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: x */
    public final long mo12864x() throws IOException {
        return m12891M();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: y */
    public final zzgyl mo12865y() throws IOException {
        int iM12889K = m12889K();
        if (iM12889K > 0) {
            long j = this.f10003o;
            long j2 = this.f10001m;
            long j3 = iM12889K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iM12889K];
                xlx0.m211710w(j2, bArr, 0L, j3);
                this.f10001m += j3;
                return new zzgyh(bArr);
            }
        }
        if (iM12889K > 0 && iM12889K <= m12882D()) {
            byte[] bArr2 = new byte[iM12889K];
            m12884F(bArr2, 0, iM12889K);
            return new zzgyh(bArr2);
        }
        if (iM12889K == 0) {
            return zzgyl.zzb;
        }
        if (iM12889K < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: z */
    public final String mo12866z() throws IOException {
        int iM12889K = m12889K();
        if (iM12889K > 0) {
            long j = this.f10003o;
            long j2 = this.f10001m;
            long j3 = iM12889K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iM12889K];
                xlx0.m211710w(j2, bArr, 0L, j3);
                String str = new String(bArr, gjx0.f104689b);
                this.f10001m += j3;
                return str;
            }
        }
        if (iM12889K > 0 && iM12889K <= m12882D()) {
            byte[] bArr2 = new byte[iM12889K];
            m12884F(bArr2, 0, iM12889K);
            return new String(bArr2, gjx0.f104689b);
        }
        if (iM12889K == 0) {
            return "";
        }
        if (iM12889K < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }
}
