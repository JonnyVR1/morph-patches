package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.C2359z0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class yox0 extends hox0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f199365e;

    /* JADX INFO: renamed from: f */
    public int f199366f;

    /* JADX INFO: renamed from: g */
    public int f199367g;

    /* JADX INFO: renamed from: h */
    public int f199368h;

    /* JADX INFO: renamed from: i */
    public int f199369i;

    /* JADX INFO: renamed from: j */
    public int f199370j;

    /* JADX INFO: renamed from: k */
    public int f199371k;

    public yox0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f199371k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f199365e = bArr;
        this.f199366f = i2 + i;
        this.f199368h = i;
        this.f199369i = i;
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: A */
    public final boolean mo132292A() throws IOException {
        return this.f199368h == this.f199366f;
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: B */
    public final boolean mo132293B() throws IOException {
        return m215560I() != 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m215554C() {
        int i = this.f199366f + this.f199367g;
        this.f199366f = i;
        int i2 = i - this.f199369i;
        int i3 = this.f199371k;
        if (i2 <= i3) {
            this.f199367g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f199367g = i4;
        this.f199366f = i - i4;
    }

    /* JADX INFO: renamed from: D */
    public final void m215555D(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f199366f;
            int i3 = this.f199368h;
            if (i <= i2 - i3) {
                this.f199368h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzkb.zzi();
        }
        throw zzkb.zzf();
    }

    /* JADX INFO: renamed from: E */
    public final byte m215556E() throws IOException {
        int i = this.f199368h;
        if (i == this.f199366f) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.f199365e;
        this.f199368h = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: F */
    public final int m215557F() throws IOException {
        int i = this.f199368h;
        if (this.f199366f - i < 4) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.f199365e;
        this.f199368h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: G */
    public final int m215558G() throws IOException {
        int i;
        int i2 = this.f199368h;
        int i3 = this.f199366f;
        if (i3 != i2) {
            byte[] bArr = this.f199365e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f199368h = i4;
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
                this.f199368h = i5;
                return i;
            }
        }
        return (int) mo132310t();
    }

    /* JADX INFO: renamed from: H */
    public final long m215559H() throws IOException {
        int i = this.f199368h;
        if (this.f199366f - i < 8) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.f199365e;
        this.f199368h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: I */
    public final long m215560I() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f199368h;
        int i2 = this.f199366f;
        if (i2 != i) {
            byte[] bArr = this.f199365e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f199368h = i3;
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
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                                i4 = i10;
                            }
                            j = j6 ^ j3;
                        }
                    }
                }
                this.f199368h = i4;
                return j;
            }
        }
        return mo132310t();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: a */
    public final double mo132294a() throws IOException {
        return Double.longBitsToDouble(m215559H());
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: e */
    public final float mo132295e() throws IOException {
        return Float.intBitsToFloat(m215557F());
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: f */
    public final int mo132296f(int i) throws zzkb {
        if (i < 0) {
            throw zzkb.zzf();
        }
        int iMo132297g = i + mo132297g();
        if (iMo132297g < 0) {
            throw zzkb.zzg();
        }
        int i2 = this.f199371k;
        if (iMo132297g > i2) {
            throw zzkb.zzi();
        }
        this.f199371k = iMo132297g;
        m215554C();
        return i2;
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: g */
    public final int mo132297g() {
        return this.f199368h - this.f199369i;
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: h */
    public final void mo132298h(int i) throws zzkb {
        if (this.f199370j != i) {
            throw zzkb.zzb();
        }
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: i */
    public final int mo132299i() throws IOException {
        return m215558G();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: j */
    public final void mo132300j(int i) {
        this.f199371k = i;
        m215554C();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: k */
    public final int mo132301k() throws IOException {
        return m215557F();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: l */
    public final boolean mo132302l(int i) throws IOException {
        boolean zMo132302l;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f199366f - this.f199368h < 10) {
                while (i3 < 10) {
                    if (m215556E() < 0) {
                        i3++;
                    }
                }
                throw zzkb.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.f199365e;
                int i4 = this.f199368h;
                this.f199368h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzkb.zze();
            return true;
        }
        if (i2 == 1) {
            m215555D(8);
            return true;
        }
        if (i2 == 2) {
            m215555D(m215558G());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            m215555D(4);
            return true;
        }
        do {
            int iMo132306p = mo132306p();
            if (iMo132306p == 0) {
                break;
            }
            int i5 = this.f108872a;
            if (i5 >= this.f108873b) {
                throw zzkb.zzh();
            }
            this.f108872a = i5 + 1;
            zMo132302l = mo132302l(iMo132306p);
            this.f108872a--;
        } while (zMo132302l);
        mo132298h(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: m */
    public final int mo132303m() throws IOException {
        return m215558G();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: n */
    public final int mo132304n() throws IOException {
        return m215557F();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: o */
    public final int mo132305o() throws IOException {
        return hox0.m132289b(m215558G());
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: p */
    public final int mo132306p() throws IOException {
        if (mo132292A()) {
            this.f199370j = 0;
            return 0;
        }
        int iM215558G = m215558G();
        this.f199370j = iM215558G;
        if ((iM215558G >>> 3) != 0) {
            return iM215558G;
        }
        throw zzkb.zzc();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: q */
    public final int mo132307q() throws IOException {
        return m215558G();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: r */
    public final long mo132308r() throws IOException {
        return m215559H();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: s */
    public final long mo132309s() throws IOException {
        return m215560I();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: t */
    public final long mo132310t() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM215556E = m215556E();
            j |= ((long) (bM215556E & 127)) << i;
            if ((bM215556E & 128) == 0) {
                return j;
            }
        }
        throw zzkb.zze();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: u */
    public final long mo132311u() throws IOException {
        return m215559H();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: v */
    public final long mo132312v() throws IOException {
        return hox0.m132290c(m215560I());
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: w */
    public final long mo132313w() throws IOException {
        return m215560I();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // p149l.hox0
    /* JADX INFO: renamed from: x */
    public final zzik mo132314x() throws IOException {
        byte[] bArrCopyOfRange;
        int iM215558G = m215558G();
        if (iM215558G > 0) {
            int i = this.f199366f;
            int i2 = this.f199368h;
            if (iM215558G <= i - i2) {
                zzik zzikVarZza = zzik.zza(this.f199365e, i2, iM215558G);
                this.f199368h += iM215558G;
                return zzikVarZza;
            }
        }
        if (iM215558G == 0) {
            return zzik.zza;
        }
        if (iM215558G > 0) {
            int i3 = this.f199366f;
            int i4 = this.f199368h;
            if (iM215558G <= i3 - i4) {
                int i5 = iM215558G + i4;
                this.f199368h = i5;
                bArrCopyOfRange = Arrays.copyOfRange(this.f199365e, i4, i5);
            } else {
                if (iM215558G <= 0) {
                    throw zzkb.zzi();
                }
                if (iM215558G == 0) {
                    throw zzkb.zzf();
                }
                bArrCopyOfRange = ctx0.f82512b;
            }
        } else {
            if (iM215558G <= 0) {
                throw zzkb.zzi();
            }
            if (iM215558G == 0) {
                throw zzkb.zzf();
            }
            bArrCopyOfRange = ctx0.f82512b;
        }
        return zzik.zzb(bArrCopyOfRange);
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: y */
    public final String mo132315y() throws IOException {
        int iM215558G = m215558G();
        if (iM215558G > 0) {
            int i = this.f199366f;
            int i2 = this.f199368h;
            if (iM215558G <= i - i2) {
                String str = new String(this.f199365e, i2, iM215558G, ctx0.f82511a);
                this.f199368h += iM215558G;
                return str;
            }
        }
        if (iM215558G == 0) {
            return "";
        }
        if (iM215558G < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // p149l.hox0
    /* JADX INFO: renamed from: z */
    public final String mo132316z() throws IOException {
        int iM215558G = m215558G();
        if (iM215558G > 0) {
            int i = this.f199366f;
            int i2 = this.f199368h;
            if (iM215558G <= i - i2) {
                String strM14552d = C2359z0.m14552d(this.f199365e, i2, iM215558G);
                this.f199368h += iM215558G;
                return strM14552d;
            }
        }
        if (iM215558G == 0) {
            return "";
        }
        if (iM215558G <= 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }
}
