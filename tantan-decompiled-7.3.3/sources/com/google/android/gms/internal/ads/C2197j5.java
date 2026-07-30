package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.Arrays;
import p153l.gjx0;
import p153l.sgx0;
import p153l.wgx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2197j5 extends wgx0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f9981e;

    /* JADX INFO: renamed from: f */
    public int f9982f;

    /* JADX INFO: renamed from: g */
    public int f9983g;

    /* JADX INFO: renamed from: h */
    public int f9984h;

    /* JADX INFO: renamed from: i */
    public final int f9985i;

    /* JADX INFO: renamed from: j */
    public int f9986j;

    /* JADX INFO: renamed from: k */
    public int f9987k;

    public /* synthetic */ C2197j5(byte[] bArr, int i, int i2, boolean z, sgx0 sgx0Var) {
        super(null);
        this.f9987k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f9981e = bArr;
        this.f9982f = i2 + i;
        this.f9984h = i;
        this.f9985i = i;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: A */
    public final String mo12835A() throws IOException {
        int iM12841G = m12841G();
        if (iM12841G > 0) {
            int i = this.f9982f;
            int i2 = this.f9984h;
            if (iM12841G <= i - i2) {
                String strM13554h = C2317y5.m13554h(this.f9981e, i2, iM12841G);
                this.f9984h += iM12841G;
                return strM13554h;
            }
        }
        if (iM12841G == 0) {
            return "";
        }
        if (iM12841G <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: B */
    public final void mo12836B(int i) throws zzhag {
        if (this.f9986j != i) {
            throw zzhag.zzb();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12837C(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f9982f;
            int i3 = this.f9984h;
            if (i <= i2 - i3) {
                this.f9984h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzhag.zzj();
        }
        throw zzhag.zzf();
    }

    /* JADX INFO: renamed from: D */
    public final void m12838D() {
        int i = this.f9982f + this.f9983g;
        this.f9982f = i;
        int i2 = i - this.f9985i;
        int i3 = this.f9987k;
        if (i2 <= i3) {
            this.f9983g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f9983g = i4;
        this.f9982f = i - i4;
    }

    /* JADX INFO: renamed from: E */
    public final byte m12839E() throws IOException {
        int i = this.f9984h;
        if (i == this.f9982f) {
            throw zzhag.zzj();
        }
        byte[] bArr = this.f9981e;
        this.f9984h = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: F */
    public final int m12840F() throws IOException {
        int i = this.f9984h;
        if (this.f9982f - i < 4) {
            throw zzhag.zzj();
        }
        byte[] bArr = this.f9981e;
        this.f9984h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: G */
    public final int m12841G() throws IOException {
        int i;
        int i2 = this.f9984h;
        int i3 = this.f9982f;
        if (i3 != i2) {
            byte[] bArr = this.f9981e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f9984h = i4;
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
                this.f9984h = i5;
                return i;
            }
        }
        return (int) m12844J();
    }

    /* JADX INFO: renamed from: H */
    public final long m12842H() throws IOException {
        int i = this.f9984h;
        if (this.f9982f - i < 8) {
            throw zzhag.zzj();
        }
        byte[] bArr = this.f9981e;
        this.f9984h = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: I */
    public final long m12843I() throws IOException {
        long j;
        long j2;
        int i = this.f9984h;
        int i2 = this.f9982f;
        if (i2 != i) {
            byte[] bArr = this.f9981e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f9984h = i3;
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
                this.f9984h = i4;
                return j;
            }
        }
        return m12844J();
    }

    /* JADX INFO: renamed from: J */
    public final long m12844J() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM12839E = m12839E();
            j |= ((long) (bM12839E & 127)) << i;
            if ((bM12839E & 128) == 0) {
                return j;
            }
        }
        throw zzhag.zze();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: a */
    public final void mo12845a(int i) {
        this.f9987k = i;
        m12838D();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: b */
    public final boolean mo12846b() throws IOException {
        return this.f9984h == this.f9982f;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: c */
    public final boolean mo12847c() throws IOException {
        return m12843I() != 0;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: d */
    public final boolean mo12848d(int i) throws IOException {
        int iMo12858r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f9982f - this.f9984h < 10) {
                while (i3 < 10) {
                    if (m12839E() < 0) {
                        i3++;
                    }
                }
                throw zzhag.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.f9981e;
                int i4 = this.f9984h;
                this.f9984h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzhag.zze();
            return true;
        }
        if (i2 == 1) {
            m12837C(8);
            return true;
        }
        if (i2 == 2) {
            m12837C(m12841G());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            m12837C(4);
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
        return Double.longBitsToDouble(m12842H());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: j */
    public final float mo12850j() throws IOException {
        return Float.intBitsToFloat(m12840F());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: k */
    public final int mo12851k() {
        return this.f9984h - this.f9985i;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: l */
    public final int mo12852l(int i) throws zzhag {
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i2 = i + (this.f9984h - this.f9985i);
        if (i2 < 0) {
            throw zzhag.zzg();
        }
        int i3 = this.f9987k;
        if (i2 > i3) {
            throw zzhag.zzj();
        }
        this.f9987k = i2;
        m12838D();
        return i3;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: m */
    public final int mo12853m() throws IOException {
        return m12841G();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: n */
    public final int mo12854n() throws IOException {
        return m12840F();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: o */
    public final int mo12855o() throws IOException {
        return m12841G();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: p */
    public final int mo12856p() throws IOException {
        return m12840F();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: q */
    public final int mo12857q() throws IOException {
        return wgx0.m206326e(m12841G());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: r */
    public final int mo12858r() throws IOException {
        if (mo12846b()) {
            this.f9986j = 0;
            return 0;
        }
        int iM12841G = m12841G();
        this.f9986j = iM12841G;
        if ((iM12841G >>> 3) != 0) {
            return iM12841G;
        }
        throw zzhag.zzc();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: s */
    public final int mo12859s() throws IOException {
        return m12841G();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: t */
    public final long mo12860t() throws IOException {
        return m12842H();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: u */
    public final long mo12861u() throws IOException {
        return m12843I();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: v */
    public final long mo12862v() throws IOException {
        return m12842H();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: w */
    public final long mo12863w() throws IOException {
        return wgx0.m206327f(m12843I());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: x */
    public final long mo12864x() throws IOException {
        return m12843I();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: y */
    public final zzgyl mo12865y() throws IOException {
        int iM12841G = m12841G();
        if (iM12841G > 0) {
            int i = this.f9982f;
            int i2 = this.f9984h;
            if (iM12841G <= i - i2) {
                zzgyl zzgylVarZzv = zzgyl.zzv(this.f9981e, i2, iM12841G);
                this.f9984h += iM12841G;
                return zzgylVarZzv;
            }
        }
        if (iM12841G == 0) {
            return zzgyl.zzb;
        }
        if (iM12841G > 0) {
            int i3 = this.f9982f;
            int i4 = this.f9984h;
            if (iM12841G <= i3 - i4) {
                int i5 = iM12841G + i4;
                this.f9984h = i5;
                return new zzgyh(Arrays.copyOfRange(this.f9981e, i4, i5));
            }
        }
        if (iM12841G <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: z */
    public final String mo12866z() throws IOException {
        int iM12841G = m12841G();
        if (iM12841G > 0) {
            int i = this.f9982f;
            int i2 = this.f9984h;
            if (iM12841G <= i - i2) {
                String str = new String(this.f9981e, i2, iM12841G, gjx0.f104689b);
                this.f9984h += iM12841G;
                return str;
            }
        }
        if (iM12841G == 0) {
            return "";
        }
        if (iM12841G < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }
}
