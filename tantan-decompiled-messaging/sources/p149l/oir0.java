package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class oir0 implements sir0 {

    /* JADX INFO: renamed from: v */
    public static final byte[] f144151v = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f144152a;

    /* JADX INFO: renamed from: b */
    public final x5w0 f144153b = new x5w0(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final v6w0 f144154c = new v6w0(Arrays.copyOf(f144151v, 10));

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f144155d;

    /* JADX INFO: renamed from: e */
    public String f144156e;

    /* JADX INFO: renamed from: f */
    public m7r0 f144157f;

    /* JADX INFO: renamed from: g */
    public m7r0 f144158g;

    /* JADX INFO: renamed from: h */
    public int f144159h;

    /* JADX INFO: renamed from: i */
    public int f144160i;

    /* JADX INFO: renamed from: j */
    public int f144161j;

    /* JADX INFO: renamed from: k */
    public boolean f144162k;

    /* JADX INFO: renamed from: l */
    public boolean f144163l;

    /* JADX INFO: renamed from: m */
    public int f144164m;

    /* JADX INFO: renamed from: n */
    public int f144165n;

    /* JADX INFO: renamed from: o */
    public int f144166o;

    /* JADX INFO: renamed from: p */
    public boolean f144167p;

    /* JADX INFO: renamed from: q */
    public long f144168q;

    /* JADX INFO: renamed from: r */
    public int f144169r;

    /* JADX INFO: renamed from: s */
    public long f144170s;

    /* JADX INFO: renamed from: t */
    public m7r0 f144171t;

    /* JADX INFO: renamed from: u */
    public long f144172u;

    public oir0(boolean z, @Nullable String str) {
        m164552g();
        this.f144164m = -1;
        this.f144165n = -1;
        this.f144168q = -9223372036854775807L;
        this.f144170s = -9223372036854775807L;
        this.f144152a = z;
        this.f144155d = str;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m164548e(int i) {
        return (i & 65526) == 65520;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m164549k(byte b, byte b2) {
        return m164548e((b2 & 255) | 65280);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m164550l(v6w0 v6w0Var, byte[] bArr, int i) {
        if (v6w0Var.m197268q() < i) {
            return false;
        }
        v6w0Var.m197258g(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x027f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:113:0x028b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x021b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0226  */
    /* JADX WARN: Code duplicated, block: B:79:0x022a  */
    /* JADX WARN: Code duplicated, block: B:81:0x022e  */
    /* JADX WARN: Code duplicated, block: B:86:0x023d  */
    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) throws zzcc {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int iM207150d;
        byte[] bArrM197264m;
        int iM197271t;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        byte b2;
        this.f144157f.getClass();
        int i9 = ggw0.f102568a;
        while (v6w0Var.m197268q() > 0) {
            int i10 = this.f144159h;
            int i11 = 13;
            char c = 7;
            int i12 = 3;
            int i13 = 2;
            if (i10 == 0) {
                byte[] bArrM197264m2 = v6w0Var.m197264m();
                int iM197270s = v6w0Var.m197270s();
                int iM197271t2 = v6w0Var.m197271t();
                while (true) {
                    if (iM197270s < iM197271t2) {
                        int i14 = iM197270s + 1;
                        byte b3 = bArrM197264m2[iM197270s];
                        int i15 = b3 & 255;
                        int i16 = i12;
                        if (this.f144161j == 512 && m164549k((byte) -1, (byte) i15)) {
                            if (!this.f144163l) {
                                int i17 = iM197270s - 1;
                                v6w0Var.m197262k(iM197270s);
                                if (m164550l(v6w0Var, this.f144153b.f191198a, 1)) {
                                    this.f144153b.m207157k(4);
                                    int iM207150d2 = this.f144153b.m207150d(1);
                                    int i18 = this.f144164m;
                                    if (i18 != -1 && iM207150d2 != i18) {
                                        c = 7;
                                    } else if (this.f144165n == -1) {
                                        if (m164550l(v6w0Var, this.f144153b.f191198a, 4)) {
                                            this.f144153b.m207157k(14);
                                            iM207150d = this.f144153b.m207150d(i11);
                                            c = 7;
                                            if (iM207150d >= 7) {
                                                bArrM197264m = v6w0Var.m197264m();
                                                iM197271t = v6w0Var.m197271t();
                                                i5 = i17 + iM207150d;
                                                if (i5 >= iM197271t) {
                                                    b = bArrM197264m[i5];
                                                    if (b == -1) {
                                                        i8 = i5 + 1;
                                                        if (i8 != iM197271t) {
                                                            b2 = bArrM197264m[i8];
                                                            if (m164549k((byte) -1, b2) || ((b2 & 8) >> 3) != iM207150d2) {
                                                            }
                                                        }
                                                    } else if (b == 73 || ((i6 = i5 + 1) != iM197271t && (bArrM197264m[i6] != 68 || ((i7 = i5 + 2) != iM197271t && bArrM197264m[i7] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (m164550l(v6w0Var, this.f144153b.f191198a, 1)) {
                                        this.f144153b.m207157k(i13);
                                        if (this.f144153b.m207150d(4) == this.f144165n) {
                                            v6w0Var.m197262k(iM197270s + 1);
                                            if (m164550l(v6w0Var, this.f144153b.f191198a, 4)) {
                                                this.f144153b.m207157k(14);
                                                iM207150d = this.f144153b.m207150d(i11);
                                                c = 7;
                                                if (iM207150d >= 7) {
                                                    bArrM197264m = v6w0Var.m197264m();
                                                    iM197271t = v6w0Var.m197271t();
                                                    i5 = i17 + iM207150d;
                                                    if (i5 >= iM197271t) {
                                                        b = bArrM197264m[i5];
                                                        if (b == -1) {
                                                            i8 = i5 + 1;
                                                            if (i8 != iM197271t) {
                                                                b2 = bArrM197264m[i8];
                                                                if (m164549k((byte) -1, b2)) {
                                                                }
                                                            }
                                                        } else if (b == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c = 7;
                                        }
                                    }
                                } else {
                                    c = c;
                                }
                                i = this.f144161j;
                                i2 = i | i15;
                                if (i2 != 329) {
                                    i3 = 2;
                                    z = false;
                                    i4 = 768;
                                } else if (i2 != 511) {
                                    i3 = 2;
                                    z = false;
                                    i4 = 512;
                                } else if (i2 != 836) {
                                    i3 = 2;
                                    z = false;
                                    i4 = 1024;
                                } else if (i2 != 1075) {
                                    this.f144159h = 2;
                                    this.f144160i = i16;
                                    this.f144169r = 0;
                                    this.f144154c.m197262k(0);
                                    v6w0Var.m197262k(i14);
                                } else if (i != 256) {
                                    this.f144161j = 256;
                                    i12 = i16;
                                    i11 = 13;
                                    i13 = 2;
                                } else {
                                    i16 = i16;
                                    i3 = 2;
                                    z = false;
                                    iM197270s = i14;
                                    i12 = i16;
                                    i13 = i3;
                                    i11 = 13;
                                }
                                this.f144161j = i4;
                                iM197270s = i14;
                                i12 = i16;
                                i13 = i3;
                                i11 = 13;
                            }
                            this.f144166o = (b3 & 8) >> 3;
                            this.f144162k = 1 == ((b3 & 1) ^ 1);
                            if (this.f144163l) {
                                m164553h();
                            } else {
                                this.f144159h = 1;
                                this.f144160i = 0;
                            }
                            v6w0Var.m197262k(i14);
                        } else {
                            c = c;
                            i = this.f144161j;
                            i2 = i | i15;
                            if (i2 != 329) {
                                i3 = 2;
                                z = false;
                                i4 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                z = false;
                                i4 = 512;
                            } else if (i2 != 836) {
                                i3 = 2;
                                z = false;
                                i4 = 1024;
                            } else if (i2 != 1075) {
                                this.f144159h = 2;
                                this.f144160i = i16;
                                this.f144169r = 0;
                                this.f144154c.m197262k(0);
                                v6w0Var.m197262k(i14);
                            } else if (i != 256) {
                                this.f144161j = 256;
                                i12 = i16;
                                i11 = 13;
                                i13 = 2;
                            } else {
                                i16 = i16;
                                i3 = 2;
                                z = false;
                                iM197270s = i14;
                                i12 = i16;
                                i13 = i3;
                                i11 = 13;
                            }
                            this.f144161j = i4;
                            iM197270s = i14;
                            i12 = i16;
                            i13 = i3;
                            i11 = 13;
                        }
                    } else {
                        v6w0Var.m197262k(iM197270s);
                    }
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        int iMin = Math.min(v6w0Var.m197268q(), this.f144169r - this.f144160i);
                        this.f144171t.mo134533f(v6w0Var, iMin);
                        int i19 = this.f144160i + iMin;
                        this.f144160i = i19;
                        if (i19 == this.f144169r) {
                            f5v0.m119535f(this.f144170s != -9223372036854775807L);
                            this.f144171t.mo134530c(this.f144170s, 1, this.f144169r, 0, null);
                            this.f144170s += this.f144172u;
                            m164552g();
                        }
                    } else {
                        if (m164555j(v6w0Var, this.f144153b.f191198a, true != this.f144162k ? 5 : 7)) {
                            this.f144153b.m207157k(0);
                            boolean z2 = this.f144167p;
                            x5w0 x5w0Var = this.f144153b;
                            if (z2) {
                                x5w0Var.m207159m(10);
                            } else {
                                int iM207150d3 = x5w0Var.m207150d(2) + 1;
                                if (iM207150d3 != 2) {
                                    svv0.m186111f("AdtsReader", "Detected audio object type: " + iM207150d3 + ", but assuming AAC LC.");
                                }
                                this.f144153b.m207159m(5);
                                int iM207150d4 = this.f144153b.m207150d(3);
                                int i20 = this.f144165n;
                                byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((iM207150d4 << 3) & 120) | ((i20 << 7) & 128))};
                                v3r0 v3r0VarM201388a = w3r0.m201388a(bArr);
                                ter0 ter0Var = new ter0();
                                ter0Var.m188604k(this.f144156e);
                                ter0Var.m188618w("audio/mp4a-latm");
                                ter0Var.m188607l0(v3r0VarM201388a.f179842c);
                                ter0Var.m188605k0(v3r0VarM201388a.f179841b);
                                ter0Var.m188619x(v3r0VarM201388a.f179840a);
                                ter0Var.m188606l(Collections.singletonList(bArr));
                                ter0Var.m188609n(this.f144155d);
                                mhr0 mhr0VarM188591D = ter0Var.m188591D();
                                this.f144168q = 1024000000 / ((long) mhr0VarM188591D.f133906z);
                                this.f144157f.mo134531d(mhr0VarM188591D);
                                this.f144167p = true;
                            }
                            this.f144153b.m207159m(4);
                            int iM207150d5 = this.f144153b.m207150d(13);
                            int i21 = iM207150d5 - 7;
                            if (this.f144162k) {
                                i21 = iM207150d5 - 9;
                            }
                            m164554i(this.f144157f, this.f144168q, 0, i21);
                        }
                    }
                } else if (m164555j(v6w0Var, this.f144154c.m197264m(), 10)) {
                    this.f144158g.mo134533f(this.f144154c, 10);
                    this.f144154c.m197262k(6);
                    m164554i(this.f144158g, 0L, 10, this.f144154c.m197237A() + 10);
                }
            } else if (v6w0Var.m197268q() != 0) {
                x5w0 x5w0Var2 = this.f144153b;
                x5w0Var2.f191198a[0] = v6w0Var.m197264m()[v6w0Var.m197270s()];
                x5w0Var2.m207157k(2);
                int iM207150d6 = this.f144153b.m207150d(4);
                int i22 = this.f144165n;
                if (i22 == -1 || iM207150d6 == i22) {
                    if (!this.f144163l) {
                        this.f144163l = true;
                        this.f144164m = this.f144166o;
                        this.f144165n = iM207150d6;
                    }
                    m164553h();
                } else {
                    m164551f();
                }
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f144170s = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f144156e = alr0Var.m97443b();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 1);
        this.f144157f = m7r0VarMo129454i;
        this.f144171t = m7r0VarMo129454i;
        if (!this.f144152a) {
            this.f144158g = new i5r0();
            return;
        }
        alr0Var.m97444c();
        m7r0 m7r0VarMo129454i2 = m5r0Var.mo129454i(alr0Var.m97442a(), 5);
        this.f144158g = m7r0VarMo129454i2;
        ter0 ter0Var = new ter0();
        ter0Var.m188604k(alr0Var.m97443b());
        ter0Var.m188618w("application/id3");
        m7r0VarMo129454i2.mo134531d(ter0Var.m188591D());
    }

    /* JADX INFO: renamed from: f */
    public final void m164551f() {
        this.f144163l = false;
        m164552g();
    }

    /* JADX INFO: renamed from: g */
    public final void m164552g() {
        this.f144159h = 0;
        this.f144160i = 0;
        this.f144161j = 256;
    }

    /* JADX INFO: renamed from: h */
    public final void m164553h() {
        this.f144159h = 3;
        this.f144160i = 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m164554i(m7r0 m7r0Var, long j, int i, int i2) {
        this.f144159h = 4;
        this.f144160i = i;
        this.f144171t = m7r0Var;
        this.f144172u = j;
        this.f144169r = i2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m164555j(v6w0 v6w0Var, byte[] bArr, int i) {
        int iMin = Math.min(v6w0Var.m197268q(), i - this.f144160i);
        v6w0Var.m197258g(bArr, this.f144160i, iMin);
        int i2 = this.f144160i + iMin;
        this.f144160i = i2;
        return i2 == i;
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f144170s = -9223372036854775807L;
        m164551f();
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
    }
}
