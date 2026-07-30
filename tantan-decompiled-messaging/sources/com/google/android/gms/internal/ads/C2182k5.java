package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p149l.aax0;
import p149l.n7x0;
import p149l.q7x0;
import p149l.rcx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2182k5 extends q7x0 {

    /* JADX INFO: renamed from: e */
    public final Iterable f9956e;

    /* JADX INFO: renamed from: f */
    public final Iterator f9957f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f9958g;

    /* JADX INFO: renamed from: h */
    public int f9959h;

    /* JADX INFO: renamed from: i */
    public int f9960i;

    /* JADX INFO: renamed from: j */
    public int f9961j;

    /* JADX INFO: renamed from: k */
    public int f9962k;

    /* JADX INFO: renamed from: l */
    public int f9963l;

    /* JADX INFO: renamed from: m */
    public long f9964m;

    /* JADX INFO: renamed from: n */
    public long f9965n;

    /* JADX INFO: renamed from: o */
    public long f9966o;

    public /* synthetic */ C2182k5(Iterable iterable, int i, boolean z, n7x0 n7x0Var) {
        super(null);
        this.f9961j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f9959h = i;
        this.f9956e = iterable;
        this.f9957f = iterable.iterator();
        this.f9963l = 0;
        if (i != 0) {
            m12832H();
            return;
        }
        this.f9958g = aax0.f68611e;
        this.f9964m = 0L;
        this.f9965n = 0L;
        this.f9966o = 0L;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: A */
    public final String mo12781A() throws IOException {
        int iM12835K = m12835K();
        if (iM12835K > 0) {
            long j = this.f9966o;
            long j2 = this.f9964m;
            long j3 = iM12835K;
            if (j3 <= j - j2) {
                String strM13499g = C2294y5.m13499g(this.f9958g, (int) (j2 - this.f9965n), iM12835K);
                this.f9964m += j3;
                return strM13499g;
            }
        }
        if (iM12835K >= 0 && iM12835K <= m12828D()) {
            byte[] bArr = new byte[iM12835K];
            m12830F(bArr, 0, iM12835K);
            return C2294y5.m13500h(bArr, 0, iM12835K);
        }
        if (iM12835K == 0) {
            return "";
        }
        if (iM12835K <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: B */
    public final void mo12782B(int i) throws zzhag {
        if (this.f9962k != i) {
            throw zzhag.zzb();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12827C(int i) throws IOException {
        if (i >= 0) {
            if (i <= (((long) (this.f9959h - this.f9963l)) - this.f9964m) + this.f9965n) {
                while (i > 0) {
                    if (this.f9966o - this.f9964m == 0) {
                        m12829E();
                    }
                    int iMin = Math.min(i, (int) (this.f9966o - this.f9964m));
                    i -= iMin;
                    this.f9964m += (long) iMin;
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
    public final int m12828D() {
        return (int) ((((long) (this.f9959h - this.f9963l)) - this.f9964m) + this.f9965n);
    }

    /* JADX INFO: renamed from: E */
    public final void m12829E() throws zzhag {
        if (!this.f9957f.hasNext()) {
            throw zzhag.zzj();
        }
        m12832H();
    }

    /* JADX INFO: renamed from: F */
    public final void m12830F(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > m12828D()) {
            if (i2 > 0) {
                throw zzhag.zzj();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.f9966o - this.f9964m == 0) {
                m12829E();
            }
            int iMin = Math.min(i3, (int) (this.f9966o - this.f9964m));
            long j = iMin;
            rcx0.m178845w(this.f9964m, bArr, i2 - i3, j);
            i3 -= iMin;
            this.f9964m += j;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m12831G() {
        int i = this.f9959h + this.f9960i;
        this.f9959h = i;
        int i2 = this.f9961j;
        if (i <= i2) {
            this.f9960i = 0;
            return;
        }
        int i3 = i - i2;
        this.f9960i = i3;
        this.f9959h = i - i3;
    }

    /* JADX INFO: renamed from: H */
    public final void m12832H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f9957f.next();
        this.f9958g = byteBuffer;
        this.f9963l += (int) (this.f9964m - this.f9965n);
        long jPosition = byteBuffer.position();
        this.f9964m = jPosition;
        this.f9965n = jPosition;
        this.f9966o = this.f9958g.limit();
        long jM178835m = rcx0.m178835m(this.f9958g);
        this.f9964m += jM178835m;
        this.f9965n += jM178835m;
        this.f9966o += jM178835m;
    }

    /* JADX INFO: renamed from: I */
    public final byte m12833I() throws IOException {
        if (this.f9966o - this.f9964m == 0) {
            m12829E();
        }
        long j = this.f9964m;
        this.f9964m = 1 + j;
        return rcx0.m178831i(j);
    }

    /* JADX INFO: renamed from: J */
    public final int m12834J() throws IOException {
        long j = this.f9966o;
        long j2 = this.f9964m;
        if (j - j2 < 4) {
            int iM12833I = m12833I() & 255;
            int iM12833I2 = (m12833I() & 255) << 8;
            return ((m12833I() & 255) << 24) | iM12833I | iM12833I2 | ((m12833I() & 255) << 16);
        }
        this.f9964m = 4 + j2;
        int iM178831i = rcx0.m178831i(j2) & 255;
        int iM178831i2 = (rcx0.m178831i(1 + j2) & 255) << 8;
        return iM178831i | iM178831i2 | ((rcx0.m178831i(2 + j2) & 255) << 16) | ((rcx0.m178831i(j2 + 3) & 255) << 24);
    }

    /* JADX INFO: renamed from: K */
    public final int m12835K() throws IOException {
        int i;
        long j = this.f9964m;
        if (this.f9966o != j) {
            long j2 = j + 1;
            byte bM178831i = rcx0.m178831i(j);
            if (bM178831i >= 0) {
                this.f9964m++;
                return bM178831i;
            }
            if (this.f9966o - this.f9964m >= 10) {
                long j3 = 2 + j;
                int iM178831i = (rcx0.m178831i(j2) << 7) ^ bM178831i;
                if (iM178831i < 0) {
                    i = iM178831i ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iM178831i2 = (rcx0.m178831i(j3) << 14) ^ iM178831i;
                    if (iM178831i2 >= 0) {
                        i = iM178831i2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iM178831i3 = iM178831i2 ^ (rcx0.m178831i(j4) << 21);
                        if (iM178831i3 < 0) {
                            i = (-2080896) ^ iM178831i3;
                        } else {
                            j4 = 5 + j;
                            byte bM178831i2 = rcx0.m178831i(j5);
                            int i2 = (iM178831i3 ^ (bM178831i2 << 28)) ^ 266354560;
                            if (bM178831i2 < 0) {
                                j5 = 6 + j;
                                if (rcx0.m178831i(j4) < 0) {
                                    j4 = 7 + j;
                                    if (rcx0.m178831i(j5) < 0) {
                                        j5 = 8 + j;
                                        if (rcx0.m178831i(j4) < 0) {
                                            j4 = 9 + j;
                                            if (rcx0.m178831i(j5) < 0) {
                                                long j6 = j + 10;
                                                if (rcx0.m178831i(j4) >= 0) {
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
                this.f9964m = j3;
                return i;
            }
        }
        return (int) m12838N();
    }

    /* JADX INFO: renamed from: L */
    public final long m12836L() throws IOException {
        long j = this.f9966o;
        long j2 = this.f9964m;
        if (j - j2 < 8) {
            long jM12833I = ((long) m12833I()) & 255;
            long jM12833I2 = (((long) m12833I()) & 255) << 8;
            long jM12833I3 = (((long) m12833I()) & 255) << 16;
            long jM12833I4 = (((long) m12833I()) & 255) << 24;
            long jM12833I5 = (((long) m12833I()) & 255) << 32;
            long jM12833I6 = (((long) m12833I()) & 255) << 40;
            return ((((long) m12833I()) & 255) << 56) | jM12833I | jM12833I2 | jM12833I3 | jM12833I4 | jM12833I5 | jM12833I6 | ((((long) m12833I()) & 255) << 48);
        }
        this.f9964m = 8 + j2;
        long jM178831i = ((long) rcx0.m178831i(j2)) & 255;
        long jM178831i2 = (((long) rcx0.m178831i(1 + j2)) & 255) << 8;
        long jM178831i3 = (((long) rcx0.m178831i(2 + j2)) & 255) << 16;
        long jM178831i4 = (((long) rcx0.m178831i(3 + j2)) & 255) << 24;
        long jM178831i5 = (((long) rcx0.m178831i(j2 + 4)) & 255) << 32;
        long jM178831i6 = (((long) rcx0.m178831i(j2 + 5)) & 255) << 40;
        return jM178831i | jM178831i2 | jM178831i3 | jM178831i4 | jM178831i5 | jM178831i6 | ((((long) rcx0.m178831i(6 + j2)) & 255) << 48) | ((((long) rcx0.m178831i(j2 + 7)) & 255) << 56);
    }

    /* JADX INFO: renamed from: M */
    public final long m12837M() throws IOException {
        long j;
        long j2;
        long j3 = this.f9964m;
        if (this.f9966o != j3) {
            long j4 = j3 + 1;
            byte bM178831i = rcx0.m178831i(j3);
            if (bM178831i >= 0) {
                this.f9964m++;
                return bM178831i;
            }
            if (this.f9966o - this.f9964m >= 10) {
                long j5 = 2 + j3;
                int iM178831i = (rcx0.m178831i(j4) << 7) ^ bM178831i;
                if (iM178831i < 0) {
                    j = iM178831i ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iM178831i2 = (rcx0.m178831i(j5) << 14) ^ iM178831i;
                    if (iM178831i2 >= 0) {
                        j = iM178831i2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iM178831i3 = iM178831i2 ^ (rcx0.m178831i(j6) << 21);
                        if (iM178831i3 < 0) {
                            j = (-2080896) ^ iM178831i3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jM178831i = (((long) rcx0.m178831i(j7)) << 28) ^ ((long) iM178831i3);
                            if (jM178831i >= 0) {
                                j = 266354560 ^ jM178831i;
                            } else {
                                long j8 = 6 + j3;
                                long jM178831i2 = jM178831i ^ (((long) rcx0.m178831i(j6)) << 35);
                                if (jM178831i2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jM178831i3 = jM178831i2 ^ (((long) rcx0.m178831i(j8)) << 42);
                                    if (jM178831i3 >= 0) {
                                        j = 4363953127296L ^ jM178831i3;
                                    } else {
                                        j8 = 8 + j3;
                                        jM178831i2 = jM178831i3 ^ (((long) rcx0.m178831i(j9)) << 49);
                                        if (jM178831i2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jM178831i4 = (jM178831i2 ^ (((long) rcx0.m178831i(j8)) << 56)) ^ 71499008037633920L;
                                            if (jM178831i4 < 0) {
                                                long j10 = j3 + 10;
                                                if (rcx0.m178831i(j9) >= 0) {
                                                    j5 = j10;
                                                    j = jM178831i4;
                                                }
                                            } else {
                                                j = jM178831i4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jM178831i2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.f9964m = j5;
                return j;
            }
        }
        return m12838N();
    }

    /* JADX INFO: renamed from: N */
    public final long m12838N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM12833I = m12833I();
            j |= ((long) (bM12833I & 127)) << i;
            if ((bM12833I & 128) == 0) {
                return j;
            }
        }
        throw zzhag.zze();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: a */
    public final void mo12791a(int i) {
        this.f9961j = i;
        m12831G();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: b */
    public final boolean mo12792b() throws IOException {
        return (((long) this.f9963l) + this.f9964m) - this.f9965n == ((long) this.f9959h);
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: c */
    public final boolean mo12793c() throws IOException {
        return m12837M() != 0;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: d */
    public final boolean mo12794d(int i) throws IOException {
        int iMo12804r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (m12833I() >= 0) {
                    return true;
                }
            }
            throw zzhag.zze();
        }
        if (i2 == 1) {
            m12827C(8);
            return true;
        }
        if (i2 == 2) {
            m12827C(m12835K());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            m12827C(4);
            return true;
        }
        do {
            iMo12804r = mo12804r();
            if (iMo12804r == 0) {
                break;
            }
        } while (mo12794d(iMo12804r));
        mo12782B(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: i */
    public final double mo12795i() throws IOException {
        return Double.longBitsToDouble(m12836L());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: j */
    public final float mo12796j() throws IOException {
        return Float.intBitsToFloat(m12834J());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: k */
    public final int mo12797k() {
        return (int) ((((long) this.f9963l) + this.f9964m) - this.f9965n);
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: l */
    public final int mo12798l(int i) throws zzhag {
        if (i < 0) {
            throw zzhag.zzf();
        }
        int iMo12797k = i + mo12797k();
        int i2 = this.f9961j;
        if (iMo12797k > i2) {
            throw zzhag.zzj();
        }
        this.f9961j = iMo12797k;
        m12831G();
        return i2;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: m */
    public final int mo12799m() throws IOException {
        return m12835K();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: n */
    public final int mo12800n() throws IOException {
        return m12834J();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: o */
    public final int mo12801o() throws IOException {
        return m12835K();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: p */
    public final int mo12802p() throws IOException {
        return m12834J();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: q */
    public final int mo12803q() throws IOException {
        return q7x0.m173312e(m12835K());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: r */
    public final int mo12804r() throws IOException {
        if (mo12792b()) {
            this.f9962k = 0;
            return 0;
        }
        int iM12835K = m12835K();
        this.f9962k = iM12835K;
        if ((iM12835K >>> 3) != 0) {
            return iM12835K;
        }
        throw zzhag.zzc();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: s */
    public final int mo12805s() throws IOException {
        return m12835K();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: t */
    public final long mo12806t() throws IOException {
        return m12836L();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: u */
    public final long mo12807u() throws IOException {
        return m12837M();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: v */
    public final long mo12808v() throws IOException {
        return m12836L();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: w */
    public final long mo12809w() throws IOException {
        return q7x0.m173313f(m12837M());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: x */
    public final long mo12810x() throws IOException {
        return m12837M();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: y */
    public final zzgyl mo12811y() throws IOException {
        int iM12835K = m12835K();
        if (iM12835K > 0) {
            long j = this.f9966o;
            long j2 = this.f9964m;
            long j3 = iM12835K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iM12835K];
                rcx0.m178845w(j2, bArr, 0L, j3);
                this.f9964m += j3;
                return new zzgyh(bArr);
            }
        }
        if (iM12835K > 0 && iM12835K <= m12828D()) {
            byte[] bArr2 = new byte[iM12835K];
            m12830F(bArr2, 0, iM12835K);
            return new zzgyh(bArr2);
        }
        if (iM12835K == 0) {
            return zzgyl.zzb;
        }
        if (iM12835K < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: z */
    public final String mo12812z() throws IOException {
        int iM12835K = m12835K();
        if (iM12835K > 0) {
            long j = this.f9966o;
            long j2 = this.f9964m;
            long j3 = iM12835K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iM12835K];
                rcx0.m178845w(j2, bArr, 0L, j3);
                String str = new String(bArr, aax0.f68608b);
                this.f9964m += j3;
                return str;
            }
        }
        if (iM12835K > 0 && iM12835K <= m12828D()) {
            byte[] bArr2 = new byte[iM12835K];
            m12830F(bArr2, 0, iM12835K);
            return new String(bArr2, aax0.f68608b);
        }
        if (iM12835K == 0) {
            return "";
        }
        if (iM12835K < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }
}
