package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.ctx0;
import p149l.dqi0;
import p149l.e6y0;
import p149l.g0y0;
import p149l.i3y0;
import p149l.jfd0;
import p149l.mqx0;
import p149l.mwx0;
import p149l.pmx0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzjc extends pmx0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f10295b = Logger.getLogger(zzjc.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f10296c = e6y0.m115150w();

    /* JADX INFO: renamed from: a */
    public mqx0 f10297a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzjc$a */
    public static class C2369a extends zzjc {

        /* JADX INFO: renamed from: d */
        public final byte[] f10298d;

        /* JADX INFO: renamed from: e */
        public final int f10299e;

        /* JADX INFO: renamed from: f */
        public int f10300f;

        public C2369a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                jfd0.m141176a("buffer");
                throw null;
            }
            if (((bArr.length - i2) | i2) < 0) {
                dqi0.m113073a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)});
                throw null;
            }
            this.f10298d = bArr;
            this.f10300f = 0;
            this.f10299e = i2;
        }

        /* JADX INFO: renamed from: E0 */
        public final void m14712E0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f10298d, this.f10300f, i2);
                this.f10300f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: L */
        public final void mo14684L(int i) throws IOException {
            if (i >= 0) {
                mo14692Y(i);
            } else {
                mo14690R(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: O */
        public final void mo14687O(int i, int i2) throws IOException {
            mo14693Z(i, 0);
            mo14684L(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: P */
        public final void mo14688P(int i, long j) throws IOException {
            mo14693Z(i, 0);
            mo14690R(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: Q */
        public final void mo14689Q(int i, zzik zzikVar) throws IOException {
            mo14693Z(1, 3);
            mo14695f0(2, i);
            mo14700p(3, zzikVar);
            mo14693Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: R */
        public final void mo14690R(long j) throws IOException {
            if (!zzjc.f10296c || mo14694b() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    byte[] bArr = this.f10298d;
                    if (j2 == 0) {
                        int i = this.f10300f;
                        this.f10300f = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            int i2 = this.f10300f;
                            this.f10300f = i2 + 1;
                            bArr[i2] = (byte) (((int) j) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), 1), e);
                        }
                    }
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                byte[] bArr2 = this.f10298d;
                if (j3 == 0) {
                    int i3 = this.f10300f;
                    this.f10300f = i3 + 1;
                    e6y0.m115140m(bArr2, i3, (byte) j);
                    return;
                } else {
                    int i4 = this.f10300f;
                    this.f10300f = i4 + 1;
                    e6y0.m115140m(bArr2, i4, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: Y */
        public final void mo14692Y(int i) throws IOException {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.f10298d;
                if (i2 == 0) {
                    int i3 = this.f10300f;
                    this.f10300f = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.f10300f;
                        this.f10300f = i4 + 1;
                        bArr[i4] = (byte) (i | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), 1), e);
                    }
                }
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: Z */
        public final void mo14693Z(int i, int i2) throws IOException {
            mo14692Y((i << 3) | i2);
        }

        @Override // p149l.pmx0
        /* JADX INFO: renamed from: a */
        public final void mo14713a(byte[] bArr, int i, int i2) throws IOException {
            m14712E0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: b */
        public final int mo14694b() {
            return this.f10299e - this.f10300f;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: f0 */
        public final void mo14695f0(int i, int i2) throws IOException {
            mo14693Z(i, 0);
            mo14692Y(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: l */
        public final void mo14696l(byte b) throws IOException {
            int i = this.f10300f;
            try {
                int i2 = i + 1;
                try {
                    this.f10298d[i] = b;
                    this.f10300f = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i2;
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i), Integer.valueOf(this.f10299e), 1), e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: m */
        public final void mo14697m(int i) throws IOException {
            try {
                byte[] bArr = this.f10298d;
                int i2 = this.f10300f;
                int i3 = i2 + 1;
                this.f10300f = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.f10300f = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.f10300f = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f10300f = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: n */
        public final void mo14698n(int i, int i2) throws IOException {
            mo14693Z(i, 5);
            mo14697m(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: o */
        public final void mo14699o(int i, long j) throws IOException {
            mo14693Z(i, 1);
            mo14705u(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: p */
        public final void mo14700p(int i, zzik zzikVar) throws IOException {
            mo14693Z(i, 2);
            mo14707v(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: q */
        public final void mo14701q(int i, String str) throws IOException {
            mo14693Z(i, 2);
            mo14709w(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: r */
        public final void mo14702r(int i, g0y0 g0y0Var) throws IOException {
            mo14693Z(1, 3);
            mo14695f0(2, i);
            mo14693Z(3, 2);
            mo14711y(g0y0Var);
            mo14693Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: s */
        public final void mo14703s(int i, g0y0 g0y0Var, i3y0 i3y0Var) throws IOException {
            mo14693Z(i, 2);
            mo14692Y(((AbstractC2337o0) g0y0Var).mo14251c(i3y0Var));
            i3y0Var.mo14456a(g0y0Var, this.f10297a);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: t */
        public final void mo14704t(int i, boolean z) throws IOException {
            mo14693Z(i, 0);
            mo14696l(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: u */
        public final void mo14705u(long j) throws IOException {
            try {
                byte[] bArr = this.f10298d;
                int i = this.f10300f;
                int i2 = i + 1;
                this.f10300f = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.f10300f = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.f10300f = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.f10300f = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.f10300f = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.f10300f = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.f10300f = i8;
                bArr[i7] = (byte) (j >> 48);
                this.f10300f = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10300f), Integer.valueOf(this.f10299e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: v */
        public final void mo14707v(zzik zzikVar) throws IOException {
            mo14692Y(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: w */
        public final void mo14709w(String str) throws IOException {
            int i = this.f10300f;
            try {
                int iM14678z0 = zzjc.m14678z0(str.length() * 3);
                int iM14678z1 = zzjc.m14678z0(str.length());
                if (iM14678z1 != iM14678z0) {
                    mo14692Y(C2359z0.m14549a(str));
                    this.f10300f = C2359z0.m14550b(str, this.f10298d, this.f10300f, mo14694b());
                    return;
                }
                int i2 = i + iM14678z1;
                this.f10300f = i2;
                int iM14550b = C2359z0.m14550b(str, this.f10298d, i2, mo14694b());
                this.f10300f = i;
                mo14692Y((iM14550b - i) - iM14678z1);
                this.f10300f = iM14550b;
            } catch (zzmt e) {
                this.f10300f = i;
                m14710x(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: y */
        public final void mo14711y(g0y0 g0y0Var) throws IOException {
            mo14692Y(g0y0Var.mo14354P());
            g0y0Var.mo14357S(this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m14631A(int i, mwx0 mwx0Var) {
        int iM14678z0 = m14678z0(i << 3);
        int iM156776a = mwx0Var.m156776a();
        return iM14678z0 + m14678z0(iM156776a) + iM156776a;
    }

    /* JADX INFO: renamed from: A0 */
    public static int m14632A0(int i, int i2) {
        return m14678z0(i << 3) + m14678z0(i2);
    }

    /* JADX INFO: renamed from: B */
    public static int m14633B(int i, g0y0 g0y0Var) {
        return (m14678z0(8) << 1) + m14632A0(2, i) + m14678z0(24) + m14645X(g0y0Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    public static int m14634C(int i, g0y0 g0y0Var, i3y0 i3y0Var) {
        return (m14678z0(i << 3) << 1) + ((AbstractC2337o0) g0y0Var).mo14251c(i3y0Var);
    }

    /* JADX INFO: renamed from: D */
    public static int m14635D(int i, boolean z) {
        return m14678z0(i << 3) + 1;
    }

    /* JADX INFO: renamed from: D0 */
    public static int m14636D0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: E */
    public static int m14637E(zzik zzikVar) {
        int iZzb = zzikVar.zzb();
        return m14678z0(iZzb) + iZzb;
    }

    /* JADX INFO: renamed from: F */
    public static int m14638F(String str) {
        int length;
        try {
            length = C2359z0.m14549a(str);
        } catch (zzmt unused) {
            length = str.getBytes(ctx0.f82511a).length;
        }
        return m14678z0(length) + length;
    }

    @Deprecated
    /* JADX INFO: renamed from: G */
    public static int m14639G(g0y0 g0y0Var) {
        return g0y0Var.mo14354P();
    }

    /* JADX INFO: renamed from: H */
    public static zzjc m14640H(byte[] bArr) {
        return new C2369a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: T */
    public static int m14641T(int i, long j) {
        return m14678z0(i << 3) + 8;
    }

    /* JADX INFO: renamed from: U */
    public static int m14642U(int i, zzik zzikVar) {
        int iM14678z0 = m14678z0(i << 3);
        int iZzb = zzikVar.zzb();
        return iM14678z0 + m14678z0(iZzb) + iZzb;
    }

    /* JADX INFO: renamed from: V */
    public static int m14643V(int i, g0y0 g0y0Var, i3y0 i3y0Var) {
        return m14678z0(i << 3) + m14659i(g0y0Var, i3y0Var);
    }

    /* JADX INFO: renamed from: W */
    public static int m14644W(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: X */
    public static int m14645X(g0y0 g0y0Var) {
        int iMo14354P = g0y0Var.mo14354P();
        return m14678z0(iMo14354P) + iMo14354P;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m14647b0(int i) {
        return m14671r0(i);
    }

    /* JADX INFO: renamed from: c */
    public static int m14648c(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: c0 */
    public static int m14649c0(int i, long j) {
        return m14678z0(i << 3) + m14671r0(j);
    }

    /* JADX INFO: renamed from: d */
    public static int m14650d(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m14651d0(int i, zzik zzikVar) {
        return (m14678z0(8) << 1) + m14632A0(2, i) + m14642U(3, zzikVar);
    }

    /* JADX INFO: renamed from: e */
    public static int m14652e(int i, double d) {
        return m14678z0(i << 3) + 8;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m14653e0(long j) {
        return m14671r0(j);
    }

    /* JADX INFO: renamed from: f */
    public static int m14654f(int i, float f) {
        return m14678z0(i << 3) + 4;
    }

    /* JADX INFO: renamed from: g */
    public static int m14655g(int i, mwx0 mwx0Var) {
        return (m14678z0(8) << 1) + m14632A0(2, i) + m14631A(3, mwx0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public static int m14656g0(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m14657h(mwx0 mwx0Var) {
        int iM156776a = mwx0Var.m156776a();
        return m14678z0(iM156776a) + iM156776a;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m14658h0(int i, int i2) {
        return m14678z0(i << 3) + m14671r0(i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m14659i(g0y0 g0y0Var, i3y0 i3y0Var) {
        int iMo14251c = ((AbstractC2337o0) g0y0Var).mo14251c(i3y0Var);
        return m14678z0(iMo14251c) + iMo14251c;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m14660i0(int i, long j) {
        return m14678z0(i << 3) + 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m14661j(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m14662j0(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m14663k(byte[] bArr) {
        int length = bArr.length;
        return m14678z0(length) + length;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m14664k0(int i) {
        return m14671r0(i);
    }

    /* JADX INFO: renamed from: l0 */
    public static int m14665l0(int i, int i2) {
        return m14678z0(i << 3) + 4;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m14666m0(int i, long j) {
        return m14678z0(i << 3) + m14671r0(m14676y0(j));
    }

    /* JADX INFO: renamed from: n0 */
    public static int m14667n0(long j) {
        return m14671r0(m14676y0(j));
    }

    /* JADX INFO: renamed from: o0 */
    public static int m14668o0(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m14669p0(int i, int i2) {
        return m14678z0(i << 3) + m14671r0(i2);
    }

    /* JADX INFO: renamed from: q0 */
    public static int m14670q0(int i, long j) {
        return m14678z0(i << 3) + m14671r0(j);
    }

    /* JADX INFO: renamed from: r0 */
    public static int m14671r0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: s0 */
    public static int m14672s0(int i) {
        return m14678z0(m14636D0(i));
    }

    /* JADX INFO: renamed from: t0 */
    public static int m14673t0(int i, int i2) {
        return m14678z0(i << 3) + 4;
    }

    /* JADX INFO: renamed from: w0 */
    public static int m14674w0(int i) {
        return m14678z0(i << 3);
    }

    /* JADX INFO: renamed from: x0 */
    public static int m14675x0(int i, int i2) {
        return m14678z0(i << 3) + m14678z0(m14636D0(i2));
    }

    /* JADX INFO: renamed from: y0 */
    public static long m14676y0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: z */
    public static int m14677z(int i, String str) {
        return m14678z0(i << 3) + m14638F(str);
    }

    /* JADX INFO: renamed from: z0 */
    public static int m14678z0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m14679B0(int i) throws IOException {
        mo14692Y(m14636D0(i));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m14680C0(int i, int i2) throws IOException {
        mo14695f0(i, m14636D0(i2));
    }

    /* JADX INFO: renamed from: I */
    public final void m14681I() {
        if (mo14694b() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: J */
    public final void m14682J(double d) throws IOException {
        mo14705u(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: K */
    public final void m14683K(float f) throws IOException {
        mo14697m(Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo14684L(int i) throws IOException;

    /* JADX INFO: renamed from: M */
    public final void m14685M(int i, double d) throws IOException {
        mo14699o(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: N */
    public final void m14686N(int i, float f) throws IOException {
        mo14698n(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo14687O(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: P */
    public abstract void mo14688P(int i, long j) throws IOException;

    /* JADX INFO: renamed from: Q */
    public abstract void mo14689Q(int i, zzik zzikVar) throws IOException;

    /* JADX INFO: renamed from: R */
    public abstract void mo14690R(long j) throws IOException;

    /* JADX INFO: renamed from: S */
    public final void m14691S(boolean z) throws IOException {
        mo14696l(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: Y */
    public abstract void mo14692Y(int i) throws IOException;

    /* JADX INFO: renamed from: Z */
    public abstract void mo14693Z(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract int mo14694b();

    /* JADX INFO: renamed from: f0 */
    public abstract void mo14695f0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo14696l(byte b) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo14697m(int i) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo14698n(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo14699o(int i, long j) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo14700p(int i, zzik zzikVar) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo14701q(int i, String str) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo14702r(int i, g0y0 g0y0Var) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo14703s(int i, g0y0 g0y0Var, i3y0 i3y0Var) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo14704t(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract void mo14705u(long j) throws IOException;

    /* JADX INFO: renamed from: u0 */
    public final void m14706u0(int i, long j) throws IOException {
        mo14688P(i, m14676y0(j));
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo14707v(zzik zzikVar) throws IOException;

    /* JADX INFO: renamed from: v0 */
    public final void m14708v0(long j) throws IOException {
        mo14690R(m14676y0(j));
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo14709w(String str) throws IOException;

    /* JADX INFO: renamed from: x */
    public final void m14710x(String str, zzmt zzmtVar) throws IOException {
        f10295b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(ctx0.f82511a);
        try {
            mo14692Y(bytes.length);
            mo14713a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo14711y(g0y0 g0y0Var) throws IOException;

    public zzjc() {
    }

    public static class zzb extends IOException {
        public zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }
}
