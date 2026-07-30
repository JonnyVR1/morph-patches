package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p153l.gjx0;
import p153l.oc5;
import p153l.ugx0;
import p153l.wgx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2213l5 extends wgx0 {

    /* JADX INFO: renamed from: e */
    public final InputStream f10016e;

    /* JADX INFO: renamed from: f */
    public final byte[] f10017f;

    /* JADX INFO: renamed from: g */
    public int f10018g;

    /* JADX INFO: renamed from: h */
    public int f10019h;

    /* JADX INFO: renamed from: i */
    public int f10020i;

    /* JADX INFO: renamed from: j */
    public int f10021j;

    /* JADX INFO: renamed from: k */
    public int f10022k;

    /* JADX INFO: renamed from: l */
    public int f10023l;

    public /* synthetic */ C2213l5(InputStream inputStream, int i, ugx0 ugx0Var) {
        super(null);
        this.f10023l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Charset charset = gjx0.f104688a;
        this.f10016e = inputStream;
        this.f10017f = new byte[4096];
        this.f10018g = 0;
        this.f10020i = 0;
        this.f10022k = 0;
    }

    /* JADX INFO: renamed from: E */
    private final void m12926E() {
        int i = this.f10018g + this.f10019h;
        this.f10018g = i;
        int i2 = this.f10022k + i;
        int i3 = this.f10023l;
        if (i2 <= i3) {
            this.f10019h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f10019h = i4;
        this.f10018g = i - i4;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: A */
    public final String mo12835A() throws IOException {
        byte[] bArrM12931H;
        int iM12935L = m12935L();
        int i = this.f10020i;
        int i2 = this.f10018g;
        if (iM12935L <= i2 - i && iM12935L > 0) {
            bArrM12931H = this.f10017f;
            this.f10020i = i + iM12935L;
        } else {
            if (iM12935L == 0) {
                return "";
            }
            i = 0;
            if (iM12935L <= i2) {
                m12929F(iM12935L);
                bArrM12931H = this.f10017f;
                this.f10020i = iM12935L;
            } else {
                bArrM12931H = m12931H(iM12935L, false);
            }
        }
        return C2317y5.m13554h(bArrM12931H, i, iM12935L);
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: B */
    public final void mo12836B(int i) throws zzhag {
        if (this.f10021j != i) {
            throw zzhag.zzb();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12927C(int i) throws IOException {
        int i2 = this.f10018g;
        int i3 = this.f10020i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f10020i = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i5 = this.f10022k;
        int i6 = i5 + i3;
        int i7 = this.f10023l;
        if (i6 + i > i7) {
            m12927C((i7 - i5) - i3);
            throw zzhag.zzj();
        }
        this.f10022k = i6;
        this.f10018g = 0;
        this.f10020i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.f10016e.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.f10016e.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
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
                this.f10022k += i4;
                m12926E();
                throw th;
            }
        }
        this.f10022k += i4;
        m12926E();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f10018g;
        int i9 = i8 - this.f10020i;
        this.f10020i = i8;
        m12929F(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f10018g;
            if (i10 <= i11) {
                this.f10020i = i10;
                return;
            } else {
                i9 += i11;
                this.f10020i = i11;
                m12929F(1);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final List m12928D(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f10016e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw zzhag.zzj();
                }
                this.f10022k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final void m12929F(int i) throws IOException {
        if (m12930G(i)) {
            return;
        }
        if (i <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f10022k) - this.f10020i) {
            throw zzhag.zzj();
        }
        throw zzhag.zzi();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12930G(int i) throws IOException {
        int i2 = this.f10020i;
        int i3 = i2 + i;
        int i4 = this.f10018g;
        if (i3 <= i4) {
            oc5.m167139a("refillBuffer() called when ", i, " bytes were already available in buffer");
            return false;
        }
        int i5 = this.f10022k;
        if (i > (Api.BaseClientBuilder.API_PRIORITY_OTHER - i5) - i2 || i5 + i2 + i > this.f10023l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.f10017f;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.f10022k + i2;
            this.f10022k = i5;
            i4 = this.f10018g - i2;
            this.f10018g = i4;
            this.f10020i = 0;
        }
        try {
            int i6 = this.f10016e.read(this.f10017f, i4, Math.min(4096 - i4, (Api.BaseClientBuilder.API_PRIORITY_OTHER - i5) - i4));
            if (i6 == 0 || i6 < -1 || i6 > 4096) {
                throw new IllegalStateException(String.valueOf(this.f10016e.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 <= 0) {
                return false;
            }
            this.f10018g += i6;
            m12926E();
            if (this.f10018g >= i) {
                return true;
            }
            return m12930G(i);
        } catch (zzhag e) {
            e.zzk();
            throw e;
        }
    }

    /* JADX INFO: renamed from: H */
    public final byte[] m12931H(int i, boolean z) throws IOException {
        byte[] bArrM12932I = m12932I(i);
        if (bArrM12932I != null) {
            return bArrM12932I;
        }
        int i2 = this.f10020i;
        int i3 = this.f10018g;
        int i4 = i3 - i2;
        this.f10022k += i3;
        this.f10020i = 0;
        this.f10018g = 0;
        List<byte[]> listM12928D = m12928D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f10017f, i2, bArr, 0, i4);
        for (byte[] bArr2 : listM12928D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: I */
    public final byte[] m12932I(int i) throws IOException {
        if (i == 0) {
            return gjx0.f104691d;
        }
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i2 = this.f10022k;
        int i3 = this.f10020i;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw zzhag.zzi();
        }
        int i5 = this.f10023l;
        if (i4 > i5) {
            m12927C((i5 - i2) - i3);
            throw zzhag.zzj();
        }
        int i6 = this.f10018g - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.f10016e.available()) {
                    return null;
                }
            } catch (zzhag e) {
                e.zzk();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f10017f, this.f10020i, bArr, 0, i6);
        this.f10022k += this.f10018g;
        this.f10020i = 0;
        this.f10018g = 0;
        while (i6 < i) {
            try {
                int i8 = this.f10016e.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw zzhag.zzj();
                }
                this.f10022k += i8;
                i6 += i8;
            } catch (zzhag e2) {
                e2.zzk();
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: J */
    public final byte m12933J() throws IOException {
        if (this.f10020i == this.f10018g) {
            m12929F(1);
        }
        byte[] bArr = this.f10017f;
        int i = this.f10020i;
        this.f10020i = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: K */
    public final int m12934K() throws IOException {
        int i = this.f10020i;
        if (this.f10018g - i < 4) {
            m12929F(4);
            i = this.f10020i;
        }
        byte[] bArr = this.f10017f;
        this.f10020i = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: L */
    public final int m12935L() throws IOException {
        int i;
        int i2 = this.f10020i;
        int i3 = this.f10018g;
        if (i3 != i2) {
            byte[] bArr = this.f10017f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f10020i = i4;
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
                this.f10020i = i5;
                return i;
            }
        }
        return (int) m12938O();
    }

    /* JADX INFO: renamed from: M */
    public final long m12936M() throws IOException {
        int i = this.f10020i;
        if (this.f10018g - i < 8) {
            m12929F(8);
            i = this.f10020i;
        }
        byte[] bArr = this.f10017f;
        this.f10020i = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: N */
    public final long m12937N() throws IOException {
        long j;
        long j2;
        int i = this.f10020i;
        int i2 = this.f10018g;
        if (i2 != i) {
            byte[] bArr = this.f10017f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f10020i = i3;
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
                this.f10020i = i4;
                return j;
            }
        }
        return m12938O();
    }

    /* JADX INFO: renamed from: O */
    public final long m12938O() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM12933J = m12933J();
            j |= ((long) (bM12933J & 127)) << i;
            if ((bM12933J & 128) == 0) {
                return j;
            }
        }
        throw zzhag.zze();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: a */
    public final void mo12845a(int i) {
        this.f10023l = i;
        m12926E();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: b */
    public final boolean mo12846b() throws IOException {
        return this.f10020i == this.f10018g && !m12930G(1);
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: c */
    public final boolean mo12847c() throws IOException {
        return m12937N() != 0;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: d */
    public final boolean mo12848d(int i) throws IOException {
        int iMo12858r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f10018g - this.f10020i < 10) {
                while (i3 < 10) {
                    if (m12933J() < 0) {
                        i3++;
                    }
                }
                throw zzhag.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.f10017f;
                int i4 = this.f10020i;
                this.f10020i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzhag.zze();
            return true;
        }
        if (i2 == 1) {
            m12927C(8);
            return true;
        }
        if (i2 == 2) {
            m12927C(m12935L());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            m12927C(4);
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
        return Double.longBitsToDouble(m12936M());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: j */
    public final float mo12850j() throws IOException {
        return Float.intBitsToFloat(m12934K());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: k */
    public final int mo12851k() {
        return this.f10022k + this.f10020i;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: l */
    public final int mo12852l(int i) throws zzhag {
        if (i < 0) {
            throw zzhag.zzf();
        }
        int i2 = this.f10022k + this.f10020i;
        int i3 = this.f10023l;
        int i4 = i + i2;
        if (i4 > i3) {
            throw zzhag.zzj();
        }
        this.f10023l = i4;
        m12926E();
        return i3;
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: m */
    public final int mo12853m() throws IOException {
        return m12935L();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: n */
    public final int mo12854n() throws IOException {
        return m12934K();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: o */
    public final int mo12855o() throws IOException {
        return m12935L();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: p */
    public final int mo12856p() throws IOException {
        return m12934K();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: q */
    public final int mo12857q() throws IOException {
        return wgx0.m206326e(m12935L());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: r */
    public final int mo12858r() throws IOException {
        if (mo12846b()) {
            this.f10021j = 0;
            return 0;
        }
        int iM12935L = m12935L();
        this.f10021j = iM12935L;
        if ((iM12935L >>> 3) != 0) {
            return iM12935L;
        }
        throw zzhag.zzc();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: s */
    public final int mo12859s() throws IOException {
        return m12935L();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: t */
    public final long mo12860t() throws IOException {
        return m12936M();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: u */
    public final long mo12861u() throws IOException {
        return m12937N();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: v */
    public final long mo12862v() throws IOException {
        return m12936M();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: w */
    public final long mo12863w() throws IOException {
        return wgx0.m206327f(m12937N());
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: x */
    public final long mo12864x() throws IOException {
        return m12937N();
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: y */
    public final zzgyl mo12865y() throws IOException {
        int iM12935L = m12935L();
        int i = this.f10018g;
        int i2 = this.f10020i;
        if (iM12935L <= i - i2 && iM12935L > 0) {
            zzgyl zzgylVarZzv = zzgyl.zzv(this.f10017f, i2, iM12935L);
            this.f10020i += iM12935L;
            return zzgylVarZzv;
        }
        if (iM12935L == 0) {
            return zzgyl.zzb;
        }
        byte[] bArrM12932I = m12932I(iM12935L);
        if (bArrM12932I != null) {
            return zzgyl.zzv(bArrM12932I, 0, bArrM12932I.length);
        }
        int i3 = this.f10020i;
        int i4 = this.f10018g;
        int i5 = i4 - i3;
        this.f10022k += i4;
        this.f10020i = 0;
        this.f10018g = 0;
        List<byte[]> listM12928D = m12928D(iM12935L - i5);
        byte[] bArr = new byte[iM12935L];
        System.arraycopy(this.f10017f, i3, bArr, 0, i5);
        for (byte[] bArr2 : listM12928D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new zzgyh(bArr);
    }

    @Override // p153l.wgx0
    /* JADX INFO: renamed from: z */
    public final String mo12866z() throws IOException {
        int iM12935L = m12935L();
        if (iM12935L > 0) {
            int i = this.f10018g;
            int i2 = this.f10020i;
            if (iM12935L <= i - i2) {
                String str = new String(this.f10017f, i2, iM12935L, gjx0.f104689b);
                this.f10020i += iM12935L;
                return str;
            }
        }
        if (iM12935L == 0) {
            return "";
        }
        if (iM12935L > this.f10018g) {
            return new String(m12931H(iM12935L, false), gjx0.f104689b);
        }
        m12929F(iM12935L);
        String str2 = new String(this.f10017f, this.f10020i, iM12935L, gjx0.f104689b);
        this.f10020i += iM12935L;
        return str2;
    }
}
