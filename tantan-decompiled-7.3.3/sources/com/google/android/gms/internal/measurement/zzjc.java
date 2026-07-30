package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.gzi0;
import p153l.i2y0;
import p153l.kfy0;
import p153l.m9y0;
import p153l.mnd0;
import p153l.ocy0;
import p153l.s5y0;
import p153l.szx0;
import p153l.vvx0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzjc extends vvx0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f10332b = Logger.getLogger(zzjc.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f10333c = kfy0.m149660w();

    /* JADX INFO: renamed from: a */
    public szx0 f10334a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzjc$a */
    public static class C2392a extends zzjc {

        /* JADX INFO: renamed from: d */
        public final byte[] f10335d;

        /* JADX INFO: renamed from: e */
        public final int f10336e;

        /* JADX INFO: renamed from: f */
        public int f10337f;

        public C2392a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                mnd0.m159157a("buffer");
                throw null;
            }
            if (((bArr.length - i2) | i2) < 0) {
                gzi0.m133102a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)});
                throw null;
            }
            this.f10335d = bArr;
            this.f10337f = 0;
            this.f10336e = i2;
        }

        /* JADX INFO: renamed from: E0 */
        public final void m14766E0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f10335d, this.f10337f, i2);
                this.f10337f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: L */
        public final void mo14738L(int i) throws IOException {
            if (i >= 0) {
                mo14746Y(i);
            } else {
                mo14744R(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: O */
        public final void mo14741O(int i, int i2) throws IOException {
            mo14747Z(i, 0);
            mo14738L(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: P */
        public final void mo14742P(int i, long j) throws IOException {
            mo14747Z(i, 0);
            mo14744R(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: Q */
        public final void mo14743Q(int i, zzik zzikVar) throws IOException {
            mo14747Z(1, 3);
            mo14749f0(2, i);
            mo14754p(3, zzikVar);
            mo14747Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: R */
        public final void mo14744R(long j) throws IOException {
            if (!zzjc.f10333c || mo14748b() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    byte[] bArr = this.f10335d;
                    if (j2 == 0) {
                        int i = this.f10337f;
                        this.f10337f = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            int i2 = this.f10337f;
                            this.f10337f = i2 + 1;
                            bArr[i2] = (byte) (((int) j) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), 1), e);
                        }
                    }
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                byte[] bArr2 = this.f10335d;
                if (j3 == 0) {
                    int i3 = this.f10337f;
                    this.f10337f = i3 + 1;
                    kfy0.m149650m(bArr2, i3, (byte) j);
                    return;
                } else {
                    int i4 = this.f10337f;
                    this.f10337f = i4 + 1;
                    kfy0.m149650m(bArr2, i4, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: Y */
        public final void mo14746Y(int i) throws IOException {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.f10335d;
                if (i2 == 0) {
                    int i3 = this.f10337f;
                    this.f10337f = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.f10337f;
                        this.f10337f = i4 + 1;
                        bArr[i4] = (byte) (i | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), 1), e);
                    }
                }
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: Z */
        public final void mo14747Z(int i, int i2) throws IOException {
            mo14746Y((i << 3) | i2);
        }

        @Override // p153l.vvx0
        /* JADX INFO: renamed from: a */
        public final void mo14767a(byte[] bArr, int i, int i2) throws IOException {
            m14766E0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: b */
        public final int mo14748b() {
            return this.f10336e - this.f10337f;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: f0 */
        public final void mo14749f0(int i, int i2) throws IOException {
            mo14747Z(i, 0);
            mo14746Y(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: l */
        public final void mo14750l(byte b) throws IOException {
            int i = this.f10337f;
            try {
                int i2 = i + 1;
                try {
                    this.f10335d[i] = b;
                    this.f10337f = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i2;
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i), Integer.valueOf(this.f10336e), 1), e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: m */
        public final void mo14751m(int i) throws IOException {
            try {
                byte[] bArr = this.f10335d;
                int i2 = this.f10337f;
                int i3 = i2 + 1;
                this.f10337f = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.f10337f = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.f10337f = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f10337f = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: n */
        public final void mo14752n(int i, int i2) throws IOException {
            mo14747Z(i, 5);
            mo14751m(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: o */
        public final void mo14753o(int i, long j) throws IOException {
            mo14747Z(i, 1);
            mo14759u(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: p */
        public final void mo14754p(int i, zzik zzikVar) throws IOException {
            mo14747Z(i, 2);
            mo14761v(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: q */
        public final void mo14755q(int i, String str) throws IOException {
            mo14747Z(i, 2);
            mo14763w(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: r */
        public final void mo14756r(int i, m9y0 m9y0Var) throws IOException {
            mo14747Z(1, 3);
            mo14749f0(2, i);
            mo14747Z(3, 2);
            mo14765y(m9y0Var);
            mo14747Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: s */
        public final void mo14757s(int i, m9y0 m9y0Var, ocy0 ocy0Var) throws IOException {
            mo14747Z(i, 2);
            mo14746Y(((AbstractC2360o0) m9y0Var).mo14305c(ocy0Var));
            ocy0Var.mo14510a(m9y0Var, this.f10334a);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: t */
        public final void mo14758t(int i, boolean z) throws IOException {
            mo14747Z(i, 0);
            mo14750l(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: u */
        public final void mo14759u(long j) throws IOException {
            try {
                byte[] bArr = this.f10335d;
                int i = this.f10337f;
                int i2 = i + 1;
                this.f10337f = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.f10337f = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.f10337f = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.f10337f = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.f10337f = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.f10337f = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.f10337f = i8;
                bArr[i7] = (byte) (j >> 48);
                this.f10337f = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10337f), Integer.valueOf(this.f10336e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: v */
        public final void mo14761v(zzik zzikVar) throws IOException {
            mo14746Y(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: w */
        public final void mo14763w(String str) throws IOException {
            int i = this.f10337f;
            try {
                int iM14732z0 = zzjc.m14732z0(str.length() * 3);
                int iM14732z1 = zzjc.m14732z0(str.length());
                if (iM14732z1 != iM14732z0) {
                    mo14746Y(C2382z0.m14603a(str));
                    this.f10337f = C2382z0.m14604b(str, this.f10335d, this.f10337f, mo14748b());
                    return;
                }
                int i2 = i + iM14732z1;
                this.f10337f = i2;
                int iM14604b = C2382z0.m14604b(str, this.f10335d, i2, mo14748b());
                this.f10337f = i;
                mo14746Y((iM14604b - i) - iM14732z1);
                this.f10337f = iM14604b;
            } catch (zzmt e) {
                this.f10337f = i;
                m14764x(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        /* JADX INFO: renamed from: y */
        public final void mo14765y(m9y0 m9y0Var) throws IOException {
            mo14746Y(m9y0Var.mo14408P());
            m9y0Var.mo14411S(this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m14685A(int i, s5y0 s5y0Var) {
        int iM14732z0 = m14732z0(i << 3);
        int iM184831a = s5y0Var.m184831a();
        return iM14732z0 + m14732z0(iM184831a) + iM184831a;
    }

    /* JADX INFO: renamed from: A0 */
    public static int m14686A0(int i, int i2) {
        return m14732z0(i << 3) + m14732z0(i2);
    }

    /* JADX INFO: renamed from: B */
    public static int m14687B(int i, m9y0 m9y0Var) {
        return (m14732z0(8) << 1) + m14686A0(2, i) + m14732z0(24) + m14699X(m9y0Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    public static int m14688C(int i, m9y0 m9y0Var, ocy0 ocy0Var) {
        return (m14732z0(i << 3) << 1) + ((AbstractC2360o0) m9y0Var).mo14305c(ocy0Var);
    }

    /* JADX INFO: renamed from: D */
    public static int m14689D(int i, boolean z) {
        return m14732z0(i << 3) + 1;
    }

    /* JADX INFO: renamed from: D0 */
    public static int m14690D0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: E */
    public static int m14691E(zzik zzikVar) {
        int iZzb = zzikVar.zzb();
        return m14732z0(iZzb) + iZzb;
    }

    /* JADX INFO: renamed from: F */
    public static int m14692F(String str) {
        int length;
        try {
            length = C2382z0.m14603a(str);
        } catch (zzmt unused) {
            length = str.getBytes(i2y0.f112678a).length;
        }
        return m14732z0(length) + length;
    }

    @Deprecated
    /* JADX INFO: renamed from: G */
    public static int m14693G(m9y0 m9y0Var) {
        return m9y0Var.mo14408P();
    }

    /* JADX INFO: renamed from: H */
    public static zzjc m14694H(byte[] bArr) {
        return new C2392a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: T */
    public static int m14695T(int i, long j) {
        return m14732z0(i << 3) + 8;
    }

    /* JADX INFO: renamed from: U */
    public static int m14696U(int i, zzik zzikVar) {
        int iM14732z0 = m14732z0(i << 3);
        int iZzb = zzikVar.zzb();
        return iM14732z0 + m14732z0(iZzb) + iZzb;
    }

    /* JADX INFO: renamed from: V */
    public static int m14697V(int i, m9y0 m9y0Var, ocy0 ocy0Var) {
        return m14732z0(i << 3) + m14713i(m9y0Var, ocy0Var);
    }

    /* JADX INFO: renamed from: W */
    public static int m14698W(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: X */
    public static int m14699X(m9y0 m9y0Var) {
        int iMo14408P = m9y0Var.mo14408P();
        return m14732z0(iMo14408P) + iMo14408P;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m14701b0(int i) {
        return m14725r0(i);
    }

    /* JADX INFO: renamed from: c */
    public static int m14702c(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: c0 */
    public static int m14703c0(int i, long j) {
        return m14732z0(i << 3) + m14725r0(j);
    }

    /* JADX INFO: renamed from: d */
    public static int m14704d(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m14705d0(int i, zzik zzikVar) {
        return (m14732z0(8) << 1) + m14686A0(2, i) + m14696U(3, zzikVar);
    }

    /* JADX INFO: renamed from: e */
    public static int m14706e(int i, double d) {
        return m14732z0(i << 3) + 8;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m14707e0(long j) {
        return m14725r0(j);
    }

    /* JADX INFO: renamed from: f */
    public static int m14708f(int i, float f) {
        return m14732z0(i << 3) + 4;
    }

    /* JADX INFO: renamed from: g */
    public static int m14709g(int i, s5y0 s5y0Var) {
        return (m14732z0(8) << 1) + m14686A0(2, i) + m14685A(3, s5y0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public static int m14710g0(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m14711h(s5y0 s5y0Var) {
        int iM184831a = s5y0Var.m184831a();
        return m14732z0(iM184831a) + iM184831a;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m14712h0(int i, int i2) {
        return m14732z0(i << 3) + m14725r0(i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m14713i(m9y0 m9y0Var, ocy0 ocy0Var) {
        int iMo14305c = ((AbstractC2360o0) m9y0Var).mo14305c(ocy0Var);
        return m14732z0(iMo14305c) + iMo14305c;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m14714i0(int i, long j) {
        return m14732z0(i << 3) + 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m14715j(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m14716j0(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m14717k(byte[] bArr) {
        int length = bArr.length;
        return m14732z0(length) + length;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m14718k0(int i) {
        return m14725r0(i);
    }

    /* JADX INFO: renamed from: l0 */
    public static int m14719l0(int i, int i2) {
        return m14732z0(i << 3) + 4;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m14720m0(int i, long j) {
        return m14732z0(i << 3) + m14725r0(m14730y0(j));
    }

    /* JADX INFO: renamed from: n0 */
    public static int m14721n0(long j) {
        return m14725r0(m14730y0(j));
    }

    /* JADX INFO: renamed from: o0 */
    public static int m14722o0(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m14723p0(int i, int i2) {
        return m14732z0(i << 3) + m14725r0(i2);
    }

    /* JADX INFO: renamed from: q0 */
    public static int m14724q0(int i, long j) {
        return m14732z0(i << 3) + m14725r0(j);
    }

    /* JADX INFO: renamed from: r0 */
    public static int m14725r0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: s0 */
    public static int m14726s0(int i) {
        return m14732z0(m14690D0(i));
    }

    /* JADX INFO: renamed from: t0 */
    public static int m14727t0(int i, int i2) {
        return m14732z0(i << 3) + 4;
    }

    /* JADX INFO: renamed from: w0 */
    public static int m14728w0(int i) {
        return m14732z0(i << 3);
    }

    /* JADX INFO: renamed from: x0 */
    public static int m14729x0(int i, int i2) {
        return m14732z0(i << 3) + m14732z0(m14690D0(i2));
    }

    /* JADX INFO: renamed from: y0 */
    public static long m14730y0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: z */
    public static int m14731z(int i, String str) {
        return m14732z0(i << 3) + m14692F(str);
    }

    /* JADX INFO: renamed from: z0 */
    public static int m14732z0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m14733B0(int i) throws IOException {
        mo14746Y(m14690D0(i));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m14734C0(int i, int i2) throws IOException {
        mo14749f0(i, m14690D0(i2));
    }

    /* JADX INFO: renamed from: I */
    public final void m14735I() {
        if (mo14748b() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: J */
    public final void m14736J(double d) throws IOException {
        mo14759u(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: K */
    public final void m14737K(float f) throws IOException {
        mo14751m(Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo14738L(int i) throws IOException;

    /* JADX INFO: renamed from: M */
    public final void m14739M(int i, double d) throws IOException {
        mo14753o(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: N */
    public final void m14740N(int i, float f) throws IOException {
        mo14752n(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo14741O(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: P */
    public abstract void mo14742P(int i, long j) throws IOException;

    /* JADX INFO: renamed from: Q */
    public abstract void mo14743Q(int i, zzik zzikVar) throws IOException;

    /* JADX INFO: renamed from: R */
    public abstract void mo14744R(long j) throws IOException;

    /* JADX INFO: renamed from: S */
    public final void m14745S(boolean z) throws IOException {
        mo14750l(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: Y */
    public abstract void mo14746Y(int i) throws IOException;

    /* JADX INFO: renamed from: Z */
    public abstract void mo14747Z(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract int mo14748b();

    /* JADX INFO: renamed from: f0 */
    public abstract void mo14749f0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo14750l(byte b) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo14751m(int i) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo14752n(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo14753o(int i, long j) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo14754p(int i, zzik zzikVar) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo14755q(int i, String str) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo14756r(int i, m9y0 m9y0Var) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo14757s(int i, m9y0 m9y0Var, ocy0 ocy0Var) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo14758t(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract void mo14759u(long j) throws IOException;

    /* JADX INFO: renamed from: u0 */
    public final void m14760u0(int i, long j) throws IOException {
        mo14742P(i, m14730y0(j));
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo14761v(zzik zzikVar) throws IOException;

    /* JADX INFO: renamed from: v0 */
    public final void m14762v0(long j) throws IOException {
        mo14744R(m14730y0(j));
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo14763w(String str) throws IOException;

    /* JADX INFO: renamed from: x */
    public final void m14764x(String str, zzmt zzmtVar) throws IOException {
        f10332b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(i2y0.f112678a);
        try {
            mo14746Y(bytes.length);
            mo14767a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo14765y(m9y0 m9y0Var) throws IOException;

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
