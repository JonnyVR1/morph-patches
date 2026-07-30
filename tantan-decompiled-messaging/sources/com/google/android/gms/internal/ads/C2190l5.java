package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p149l.aax0;
import p149l.o7x0;
import p149l.ob5;
import p149l.q7x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2190l5 extends q7x0 {

    /* JADX INFO: renamed from: e */
    public final InputStream f9979e;

    /* JADX INFO: renamed from: f */
    public final byte[] f9980f;

    /* JADX INFO: renamed from: g */
    public int f9981g;

    /* JADX INFO: renamed from: h */
    public int f9982h;

    /* JADX INFO: renamed from: i */
    public int f9983i;

    /* JADX INFO: renamed from: j */
    public int f9984j;

    /* JADX INFO: renamed from: k */
    public int f9985k;

    /* JADX INFO: renamed from: l */
    public int f9986l;

    public /* synthetic */ C2190l5(InputStream inputStream, int i, o7x0 o7x0Var) {
        super(null);
        this.f9986l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Charset charset = aax0.f68607a;
        this.f9979e = inputStream;
        this.f9980f = new byte[4096];
        this.f9981g = 0;
        this.f9983i = 0;
        this.f9985k = 0;
    }

    /* JADX INFO: renamed from: E */
    private final void m12872E() {
        int i = this.f9981g + this.f9982h;
        this.f9981g = i;
        int i2 = this.f9985k + i;
        int i3 = this.f9986l;
        if (i2 <= i3) {
            this.f9982h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f9982h = i4;
        this.f9981g = i - i4;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: A */
    public final String mo12781A() throws IOException {
        byte[] bArrM12877H;
        int iM12881L = m12881L();
        int i = this.f9983i;
        int i2 = this.f9981g;
        if (iM12881L <= i2 - i && iM12881L > 0) {
            bArrM12877H = this.f9980f;
            this.f9983i = i + iM12881L;
        } else {
            if (iM12881L == 0) {
                return "";
            }
            i = 0;
            if (iM12881L <= i2) {
                m12875F(iM12881L);
                bArrM12877H = this.f9980f;
                this.f9983i = iM12881L;
            } else {
                bArrM12877H = m12877H(iM12881L, false);
            }
        }
        return C2294y5.m13500h(bArrM12877H, i, iM12881L);
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: B */
    public final void mo12782B(int i) throws zzhag {
        if (this.f9984j != i) {
            throw zzhag.zzb();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12873C(int i) throws IOException {
        int i2 = this.f9981g;
        int i3 = this.f9983i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f9983i = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i5 = this.f9985k;
        int i6 = i5 + i3;
        int i7 = this.f9986l;
        if (i6 + i > i7) {
            m12873C((i7 - i5) - i3);
            throw zzhag.zzj();
        }
        this.f9985k = i6;
        this.f9981g = 0;
        this.f9983i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.f9979e.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.f9979e.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzhag e) {
                    e.zzk();
                    throw e;
                }
            } catch (Throwable th) {
                this.f9985k += i4;
                m12872E();
                throw th;
            }
        }
        this.f9985k += i4;
        m12872E();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f9981g;
        int i9 = i8 - this.f9983i;
        this.f9983i = i8;
        m12875F(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f9981g;
            if (i10 <= i11) {
                this.f9983i = i10;
                return;
            } else {
                i9 += i11;
                this.f9983i = i11;
                m12875F(1);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final List m12874D(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f9979e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw zzhag.zzj();
                }
                this.f9985k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final void m12875F(int i) throws IOException {
        if (m12876G(i)) {
            return;
        }
        if (i <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f9985k) - this.f9983i) {
            throw zzhag.zzj();
        }
        throw zzhag.zzi();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12876G(int i) throws IOException {
        int i2 = this.f9983i;
        int i3 = i2 + i;
        int i4 = this.f9981g;
        if (i3 <= i4) {
            ob5.m163410a("refillBuffer() called when ", i, " bytes were already available in buffer");
            return false;
        }
        int i5 = this.f9985k;
        if (i > (Api.BaseClientBuilder.API_PRIORITY_OTHER - i5) - i2 || i5 + i2 + i > this.f9986l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.f9980f;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.f9985k + i2;
            this.f9985k = i5;
            i4 = this.f9981g - i2;
            this.f9981g = i4;
            this.f9983i = 0;
        }
        try {
            int i6 = this.f9979e.read(this.f9980f, i4, Math.min(4096 - i4, (Api.BaseClientBuilder.API_PRIORITY_OTHER - i5) - i4));
            if (i6 == 0 || i6 < -1 || i6 > 4096) {
                throw new IllegalStateException(String.valueOf(this.f9979e.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 <= 0) {
                return false;
            }
            this.f9981g += i6;
            m12872E();
            if (this.f9981g >= i) {
                return true;
            }
            return m12876G(i);
        } catch (zzhag e) {
            e.zzk();
            throw e;
        }
    }

    /* JADX INFO: renamed from: H */
    public final byte[] m12877H(int i, boolean z) throws IOException {
        byte[] bArrM12878I = m12878I(i);
        if (bArrM12878I != null) {
            return bArrM12878I;
        }
        int i2 = this.f9983i;
        int i3 = this.f9981g;
        int i4 = i3 - i2;
        this.f9985k += i3;
        this.f9983i = 0;
        this.f9981g = 0;
        List<byte[]> listM12874D = m12874D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f9980f, i2, bArr, 0, i4);
        for (byte[] bArr2 : listM12874D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: I */
    public final byte[] m12878I(int i) throws IOException {
        if (i == 0) {
            return aax0.f68610d;
        }
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i2 = this.f9985k;
        int i3 = this.f9983i;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw zzhag.zzi();
        }
        int i5 = this.f9986l;
        if (i4 > i5) {
            m12873C((i5 - i2) - i3);
            throw zzhag.zzj();
        }
        int i6 = this.f9981g - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.f9979e.available()) {
                    return null;
                }
            } catch (zzhag e) {
                e.zzk();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f9980f, this.f9983i, bArr, 0, i6);
        this.f9985k += this.f9981g;
        this.f9983i = 0;
        this.f9981g = 0;
        while (i6 < i) {
            try {
                int i8 = this.f9979e.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw zzhag.zzj();
                }
                this.f9985k += i8;
                i6 += i8;
            } catch (zzhag e2) {
                e2.zzk();
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: J */
    public final byte m12879J() throws IOException {
        if (this.f9983i == this.f9981g) {
            m12875F(1);
        }
        byte[] bArr = this.f9980f;
        int i = this.f9983i;
        this.f9983i = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: K */
    public final int m12880K() throws IOException {
        int i = this.f9983i;
        if (this.f9981g - i < 4) {
            m12875F(4);
            i = this.f9983i;
        }
        byte[] bArr = this.f9980f;
        this.f9983i = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: L */
    public final int m12881L() throws IOException {
        int i;
        int i2 = this.f9983i;
        int i3 = this.f9981g;
        if (i3 != i2) {
            byte[] bArr = this.f9980f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f9983i = i4;
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
                this.f9983i = i5;
                return i;
            }
        }
        return (int) m12884O();
    }

    /* JADX INFO: renamed from: M */
    public final long m12882M() throws IOException {
        int i = this.f9983i;
        if (this.f9981g - i < 8) {
            m12875F(8);
            i = this.f9983i;
        }
        byte[] bArr = this.f9980f;
        this.f9983i = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: N */
    public final long m12883N() throws IOException {
        long j;
        long j2;
        int i = this.f9983i;
        int i2 = this.f9981g;
        if (i2 != i) {
            byte[] bArr = this.f9980f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f9983i = i3;
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
                this.f9983i = i4;
                return j;
            }
        }
        return m12884O();
    }

    /* JADX INFO: renamed from: O */
    public final long m12884O() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM12879J = m12879J();
            j |= ((long) (bM12879J & 127)) << i;
            if ((bM12879J & 128) == 0) {
                return j;
            }
        }
        throw zzhag.zze();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: a */
    public final void mo12791a(int i) {
        this.f9986l = i;
        m12872E();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: b */
    public final boolean mo12792b() throws IOException {
        return this.f9983i == this.f9981g && !m12876G(1);
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: c */
    public final boolean mo12793c() throws IOException {
        return m12883N() != 0;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: d */
    public final boolean mo12794d(int i) throws IOException {
        int iMo12804r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f9981g - this.f9983i < 10) {
                while (i3 < 10) {
                    if (m12879J() < 0) {
                        i3++;
                    }
                }
                throw zzhag.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.f9980f;
                int i4 = this.f9983i;
                this.f9983i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzhag.zze();
            return true;
        }
        if (i2 == 1) {
            m12873C(8);
            return true;
        }
        if (i2 == 2) {
            m12873C(m12881L());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            m12873C(4);
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
        return Double.longBitsToDouble(m12882M());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: j */
    public final float mo12796j() throws IOException {
        return Float.intBitsToFloat(m12880K());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: k */
    public final int mo12797k() {
        return this.f9985k + this.f9983i;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: l */
    public final int mo12798l(int i) throws zzhag {
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i2 = this.f9985k + this.f9983i;
        int i3 = this.f9986l;
        int i4 = i + i2;
        if (i4 > i3) {
            throw zzhag.zzj();
        }
        this.f9986l = i4;
        m12872E();
        return i3;
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: m */
    public final int mo12799m() throws IOException {
        return m12881L();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: n */
    public final int mo12800n() throws IOException {
        return m12880K();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: o */
    public final int mo12801o() throws IOException {
        return m12881L();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: p */
    public final int mo12802p() throws IOException {
        return m12880K();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: q */
    public final int mo12803q() throws IOException {
        return q7x0.m173312e(m12881L());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: r */
    public final int mo12804r() throws IOException {
        if (mo12792b()) {
            this.f9984j = 0;
            return 0;
        }
        int iM12881L = m12881L();
        this.f9984j = iM12881L;
        if ((iM12881L >>> 3) != 0) {
            return iM12881L;
        }
        throw zzhag.zzc();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: s */
    public final int mo12805s() throws IOException {
        return m12881L();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: t */
    public final long mo12806t() throws IOException {
        return m12882M();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: u */
    public final long mo12807u() throws IOException {
        return m12883N();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: v */
    public final long mo12808v() throws IOException {
        return m12882M();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: w */
    public final long mo12809w() throws IOException {
        return q7x0.m173313f(m12883N());
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: x */
    public final long mo12810x() throws IOException {
        return m12883N();
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: y */
    public final zzgyl mo12811y() throws IOException {
        int iM12881L = m12881L();
        int i = this.f9981g;
        int i2 = this.f9983i;
        if (iM12881L <= i - i2 && iM12881L > 0) {
            zzgyl zzgylVarZzv = zzgyl.zzv(this.f9980f, i2, iM12881L);
            this.f9983i += iM12881L;
            return zzgylVarZzv;
        }
        if (iM12881L == 0) {
            return zzgyl.zzb;
        }
        byte[] bArrM12878I = m12878I(iM12881L);
        if (bArrM12878I != null) {
            return zzgyl.zzv(bArrM12878I, 0, bArrM12878I.length);
        }
        int i3 = this.f9983i;
        int i4 = this.f9981g;
        int i5 = i4 - i3;
        this.f9985k += i4;
        this.f9983i = 0;
        this.f9981g = 0;
        List<byte[]> listM12874D = m12874D(iM12881L - i5);
        byte[] bArr = new byte[iM12881L];
        System.arraycopy(this.f9980f, i3, bArr, 0, i5);
        for (byte[] bArr2 : listM12874D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new zzgyh(bArr);
    }

    @Override // p149l.q7x0
    /* JADX INFO: renamed from: z */
    public final String mo12812z() throws IOException {
        int iM12881L = m12881L();
        if (iM12881L > 0) {
            int i = this.f9981g;
            int i2 = this.f9983i;
            if (iM12881L <= i - i2) {
                String str = new String(this.f9980f, i2, iM12881L, aax0.f68608b);
                this.f9983i += iM12881L;
                return str;
            }
        }
        if (iM12881L == 0) {
            return "";
        }
        if (iM12881L > this.f9981g) {
            return new String(m12877H(iM12881L, false), aax0.f68608b);
        }
        m12875F(iM12881L);
        String str2 = new String(this.f9980f, this.f9983i, iM12881L, aax0.f68608b);
        this.f9983i += iM12881L;
        return str2;
    }
}
