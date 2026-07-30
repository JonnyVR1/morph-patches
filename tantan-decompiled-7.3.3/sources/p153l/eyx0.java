package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.C2382z0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class eyx0 extends nxx0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f96537e;

    /* JADX INFO: renamed from: f */
    public int f96538f;

    /* JADX INFO: renamed from: g */
    public int f96539g;

    /* JADX INFO: renamed from: h */
    public int f96540h;

    /* JADX INFO: renamed from: i */
    public int f96541i;

    /* JADX INFO: renamed from: j */
    public int f96542j;

    /* JADX INFO: renamed from: k */
    public int f96543k;

    public eyx0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f96543k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f96537e = bArr;
        this.f96538f = i2 + i;
        this.f96540h = i;
        this.f96541i = i;
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: A */
    public final boolean mo123300A() throws IOException {
        return this.f96540h == this.f96538f;
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: B */
    public final boolean mo123301B() throws IOException {
        return m123308I() != 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m123302C() {
        int i = this.f96538f + this.f96539g;
        this.f96538f = i;
        int i2 = i - this.f96541i;
        int i3 = this.f96543k;
        if (i2 <= i3) {
            this.f96539g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f96539g = i4;
        this.f96538f = i - i4;
    }

    /* JADX INFO: renamed from: D */
    public final void m123303D(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f96538f;
            int i3 = this.f96540h;
            if (i <= i2 - i3) {
                this.f96540h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzkb.zzi();
        }
        throw zzkb.zzf();
    }

    /* JADX INFO: renamed from: E */
    public final byte m123304E() throws IOException {
        int i = this.f96540h;
        if (i == this.f96538f) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.f96537e;
        this.f96540h = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: F */
    public final int m123305F() throws IOException {
        int i = this.f96540h;
        if (this.f96538f - i < 4) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.f96537e;
        this.f96540h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: G */
    public final int m123306G() throws IOException {
        int i;
        int i2 = this.f96540h;
        int i3 = this.f96538f;
        if (i3 != i2) {
            byte[] bArr = this.f96537e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f96540h = i4;
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
                this.f96540h = i5;
                return i;
            }
        }
        return (int) mo123325t();
    }

    /* JADX INFO: renamed from: H */
    public final long m123307H() throws IOException {
        int i = this.f96540h;
        if (this.f96538f - i < 8) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.f96537e;
        this.f96540h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: I */
    public final long m123308I() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f96540h;
        int i2 = this.f96538f;
        if (i2 != i) {
            byte[] bArr = this.f96537e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f96540h = i3;
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
                this.f96540h = i4;
                return j;
            }
        }
        return mo123325t();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: a */
    public final double mo123309a() throws IOException {
        return Double.longBitsToDouble(m123307H());
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: e */
    public final float mo123310e() throws IOException {
        return Float.intBitsToFloat(m123305F());
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: f */
    public final int mo123311f(int i) throws zzkb {
        if (i < 0) {
            throw zzkb.zzf();
        }
        int iMo123312g = i + mo123312g();
        if (iMo123312g < 0) {
            throw zzkb.zzg();
        }
        int i2 = this.f96543k;
        if (iMo123312g > i2) {
            throw zzkb.zzi();
        }
        this.f96543k = iMo123312g;
        m123302C();
        return i2;
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: g */
    public final int mo123312g() {
        return this.f96540h - this.f96541i;
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: h */
    public final void mo123313h(int i) throws zzkb {
        if (this.f96542j != i) {
            throw zzkb.zzb();
        }
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: i */
    public final int mo123314i() throws IOException {
        return m123306G();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: j */
    public final void mo123315j(int i) {
        this.f96543k = i;
        m123302C();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: k */
    public final int mo123316k() throws IOException {
        return m123305F();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: l */
    public final boolean mo123317l(int i) throws IOException {
        boolean zMo123317l;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f96538f - this.f96540h < 10) {
                while (i3 < 10) {
                    if (m123304E() < 0) {
                        i3++;
                    }
                }
                throw zzkb.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.f96537e;
                int i4 = this.f96540h;
                this.f96540h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzkb.zze();
            return true;
        }
        if (i2 == 1) {
            m123303D(8);
            return true;
        }
        if (i2 == 2) {
            m123303D(m123306G());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            m123303D(4);
            return true;
        }
        do {
            int iMo123321p = mo123321p();
            if (iMo123321p == 0) {
                break;
            }
            int i5 = this.f144275a;
            if (i5 >= this.f144276b) {
                throw zzkb.zzh();
            }
            this.f144275a = i5 + 1;
            zMo123317l = mo123317l(iMo123321p);
            this.f144275a--;
        } while (zMo123317l);
        mo123313h(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: m */
    public final int mo123318m() throws IOException {
        return m123306G();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: n */
    public final int mo123319n() throws IOException {
        return m123305F();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: o */
    public final int mo123320o() throws IOException {
        return nxx0.m165303b(m123306G());
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: p */
    public final int mo123321p() throws IOException {
        if (mo123300A()) {
            this.f96542j = 0;
            return 0;
        }
        int iM123306G = m123306G();
        this.f96542j = iM123306G;
        if ((iM123306G >>> 3) != 0) {
            return iM123306G;
        }
        throw zzkb.zzc();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: q */
    public final int mo123322q() throws IOException {
        return m123306G();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: r */
    public final long mo123323r() throws IOException {
        return m123307H();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: s */
    public final long mo123324s() throws IOException {
        return m123308I();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: t */
    public final long mo123325t() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM123304E = m123304E();
            j |= ((long) (bM123304E & 127)) << i;
            if ((bM123304E & 128) == 0) {
                return j;
            }
        }
        throw zzkb.zze();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: u */
    public final long mo123326u() throws IOException {
        return m123307H();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: v */
    public final long mo123327v() throws IOException {
        return nxx0.m165304c(m123308I());
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: w */
    public final long mo123328w() throws IOException {
        return m123308I();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // p153l.nxx0
    /* JADX INFO: renamed from: x */
    public final zzik mo123329x() throws IOException {
        byte[] bArrCopyOfRange;
        int iM123306G = m123306G();
        if (iM123306G > 0) {
            int i = this.f96538f;
            int i2 = this.f96540h;
            if (iM123306G <= i - i2) {
                zzik zzikVarZza = zzik.zza(this.f96537e, i2, iM123306G);
                this.f96540h += iM123306G;
                return zzikVarZza;
            }
        }
        if (iM123306G == 0) {
            return zzik.zza;
        }
        if (iM123306G > 0) {
            int i3 = this.f96538f;
            int i4 = this.f96540h;
            if (iM123306G <= i3 - i4) {
                int i5 = iM123306G + i4;
                this.f96540h = i5;
                bArrCopyOfRange = Arrays.copyOfRange(this.f96537e, i4, i5);
            } else {
                if (iM123306G <= 0) {
                    throw zzkb.zzi();
                }
                if (iM123306G == 0) {
                    throw zzkb.zzf();
                }
                bArrCopyOfRange = i2y0.f112679b;
            }
        } else {
            if (iM123306G <= 0) {
                throw zzkb.zzi();
            }
            if (iM123306G == 0) {
                throw zzkb.zzf();
            }
            bArrCopyOfRange = i2y0.f112679b;
        }
        return zzik.zzb(bArrCopyOfRange);
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: y */
    public final String mo123330y() throws IOException {
        int iM123306G = m123306G();
        if (iM123306G > 0) {
            int i = this.f96538f;
            int i2 = this.f96540h;
            if (iM123306G <= i - i2) {
                String str = new String(this.f96537e, i2, iM123306G, i2y0.f112678a);
                this.f96540h += iM123306G;
                return str;
            }
        }
        if (iM123306G == 0) {
            return "";
        }
        if (iM123306G < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // p153l.nxx0
    /* JADX INFO: renamed from: z */
    public final String mo123331z() throws IOException {
        int iM123306G = m123306G();
        if (iM123306G > 0) {
            int i = this.f96538f;
            int i2 = this.f96540h;
            if (iM123306G <= i - i2) {
                String strM14606d = C2382z0.m14606d(this.f96537e, i2, iM123306G);
                this.f96540h += iM123306G;
                return strM14606d;
            }
        }
        if (iM123306G == 0) {
            return "";
        }
        if (iM123306G <= 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }
}
