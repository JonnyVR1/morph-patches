package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.Arrays;
import p149l.aax0;
import p149l.m7x0;
import p149l.q7x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2174j5 extends q7x0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f9944e;

    /* JADX INFO: renamed from: f */
    public int f9945f;

    /* JADX INFO: renamed from: g */
    public int f9946g;

    /* JADX INFO: renamed from: h */
    public int f9947h;

    /* JADX INFO: renamed from: i */
    public final int f9948i;

    /* JADX INFO: renamed from: j */
    public int f9949j;

    /* JADX INFO: renamed from: k */
    public int f9950k;

    public /* synthetic */ C2174j5(byte[] bArr, int i, int i2, boolean z, m7x0 m7x0Var) {
        super(null);
        this.f9950k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f9944e = bArr;
        this.f9945f = i2 + i;
        this.f9947h = i;
        this.f9948i = i;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: A */
    public final String mo12781A() throws IOException {
        int iM12787G = m12787G();
        if (iM12787G > 0) {
            int i = this.f9945f;
            int i2 = this.f9947h;
            if (iM12787G <= i - i2) {
                String strM13500h = C2294y5.m13500h(this.f9944e, i2, iM12787G);
                this.f9947h += iM12787G;
                return strM13500h;
            }
        }
        if (iM12787G == 0) {
            return "";
        }
        if (iM12787G <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: B */
    public final void mo12782B(int i) throws zzhag {
        if (this.f9949j != i) {
            throw zzhag.zzb();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12783C(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f9945f;
            int i3 = this.f9947h;
            if (i <= i2 - i3) {
                this.f9947h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzhag.zzj();
        }
        throw zzhag.zzf();
    }

    /* JADX INFO: renamed from: D */
    public final void m12784D() {
        int i = this.f9945f + this.f9946g;
        this.f9945f = i;
        int i2 = i - this.f9948i;
        int i3 = this.f9950k;
        if (i2 <= i3) {
            this.f9946g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f9946g = i4;
        this.f9945f = i - i4;
    }

    /* JADX INFO: renamed from: E */
    public final byte m12785E() throws IOException {
        int i = this.f9947h;
        if (i == this.f9945f) {
            throw zzhag.zzj();
        }
        byte[] bArr = this.f9944e;
        this.f9947h = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: F */
    public final int m12786F() throws IOException {
        int i = this.f9947h;
        if (this.f9945f - i < 4) {
            throw zzhag.zzj();
        }
        byte[] bArr = this.f9944e;
        this.f9947h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: G */
    public final int m12787G() throws IOException {
        int i;
        int i2 = this.f9947h;
        int i3 = this.f9945f;
        if (i3 != i2) {
            byte[] bArr = this.f9944e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f9947h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f9947h = i5;
                return i;
            }
        }
        return (int) m12790J();
    }

    /* JADX INFO: renamed from: H */
    public final long m12788H() throws IOException {
        int i = this.f9947h;
        if (this.f9945f - i < 8) {
            throw zzhag.zzj();
        }
        byte[] bArr = this.f9944e;
        this.f9947h = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: I */
    public final long m12789I() throws IOException {
        long j;
        long j2;
        int i = this.f9947h;
        int i2 = this.f9945f;
        if (i2 != i) {
            byte[] bArr = this.f9944e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f9947h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (((long) bArr[i6]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.f9947h = i4;
                return j;
            }
        }
        return m12790J();
    }

    /* JADX INFO: renamed from: J */
    public final long m12790J() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM12785E = m12785E();
            j |= ((long) (bM12785E & 127)) << i;
            if ((bM12785E & 128) == 0) {
                return j;
            }
        }
        throw zzhag.zze();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: a */
    public final void mo12791a(int i) {
        this.f9950k = i;
        m12784D();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: b */
    public final boolean mo12792b() throws IOException {
        return this.f9947h == this.f9945f;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: c */
    public final boolean mo12793c() throws IOException {
        return m12789I() != 0;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: d */
    public final boolean mo12794d(int i) throws IOException {
        int iMo12804r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f9945f - this.f9947h < 10) {
                while (i3 < 10) {
                    if (m12785E() < 0) {
                        i3++;
                    }
                }
                throw zzhag.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.f9944e;
                int i4 = this.f9947h;
                this.f9947h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzhag.zze();
            return true;
        }
        if (i2 == 1) {
            m12783C(8);
            return true;
        }
        if (i2 == 2) {
            m12783C(m12787G());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            m12783C(4);
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
        return Double.longBitsToDouble(m12788H());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: j */
    public final float mo12796j() throws IOException {
        return Float.intBitsToFloat(m12786F());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: k */
    public final int mo12797k() {
        return this.f9947h - this.f9948i;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: l */
    public final int mo12798l(int i) throws zzhag {
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i2 = i + (this.f9947h - this.f9948i);
        if (i2 < 0) {
            throw zzhag.zzg();
        }
        int i3 = this.f9950k;
        if (i2 > i3) {
            throw zzhag.zzj();
        }
        this.f9950k = i2;
        m12784D();
        return i3;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: m */
    public final int mo12799m() throws IOException {
        return m12787G();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: n */
    public final int mo12800n() throws IOException {
        return m12786F();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: o */
    public final int mo12801o() throws IOException {
        return m12787G();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: p */
    public final int mo12802p() throws IOException {
        return m12786F();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: q */
    public final int mo12803q() throws IOException {
        return q7x0.m173312e(m12787G());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: r */
    public final int mo12804r() throws IOException {
        if (mo12792b()) {
            this.f9949j = 0;
            return 0;
        }
        int iM12787G = m12787G();
        this.f9949j = iM12787G;
        if ((iM12787G >>> 3) != 0) {
            return iM12787G;
        }
        throw zzhag.zzc();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: s */
    public final int mo12805s() throws IOException {
        return m12787G();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: t */
    public final long mo12806t() throws IOException {
        return m12788H();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: u */
    public final long mo12807u() throws IOException {
        return m12789I();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: v */
    public final long mo12808v() throws IOException {
        return m12788H();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: w */
    public final long mo12809w() throws IOException {
        return q7x0.m173313f(m12789I());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: x */
    public final long mo12810x() throws IOException {
        return m12789I();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: y */
    public final zzgyl mo12811y() throws IOException {
        int iM12787G = m12787G();
        if (iM12787G > 0) {
            int i = this.f9945f;
            int i2 = this.f9947h;
            if (iM12787G <= i - i2) {
                zzgyl zzgylVarZzv = zzgyl.zzv(this.f9944e, i2, iM12787G);
                this.f9947h += iM12787G;
                return zzgylVarZzv;
            }
        }
        if (iM12787G == 0) {
            return zzgyl.zzb;
        }
        if (iM12787G > 0) {
            int i3 = this.f9945f;
            int i4 = this.f9947h;
            if (iM12787G <= i3 - i4) {
                int i5 = iM12787G + i4;
                this.f9947h = i5;
                return new zzgyh(Arrays.copyOfRange(this.f9944e, i4, i5));
            }
        }
        if (iM12787G <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: z */
    public final String mo12812z() throws IOException {
        int iM12787G = m12787G();
        if (iM12787G > 0) {
            int i = this.f9945f;
            int i2 = this.f9947h;
            if (iM12787G <= i - i2) {
                String str = new String(this.f9944e, i2, iM12787G, aax0.f68608b);
                this.f9947h += iM12787G;
                return str;
            }
        }
        if (iM12787G == 0) {
            return "";
        }
        if (iM12787G < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }
}
