package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaf;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class v6w0 {

    /* JADX INFO: renamed from: d */
    public static final char[] f180235d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f180236e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final zzgaf f180237f = zzgaf.zzr(wew0.f185988a, wew0.f185990c, wew0.f185993f, wew0.f185991d, wew0.f185992e);

    /* JADX INFO: renamed from: a */
    public byte[] f180238a;

    /* JADX INFO: renamed from: b */
    public int f180239b;

    /* JADX INFO: renamed from: c */
    public int f180240c;

    public v6w0(int i) {
        this.f180238a = new byte[i];
        this.f180240c = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m197237A() {
        return m197238B() | (m197238B() << 21) | (m197238B() << 14) | (m197238B() << 7);
    }

    /* JADX INFO: renamed from: B */
    public final int m197238B() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        this.f180239b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: C */
    public final int m197239C() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        this.f180239b = i + 2;
        int i4 = bArr[i2] & 255;
        this.f180239b = i + 4;
        return (i3 << 8) | i4;
    }

    /* JADX INFO: renamed from: D */
    public final int m197240D() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f180239b = i4;
        int i5 = bArr[i2] & 255;
        this.f180239b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    /* JADX INFO: renamed from: E */
    public final int m197241E() {
        int iM197273v = m197273v();
        if (iM197273v >= 0) {
            return iM197273v;
        }
        f3c.m119257a("Top bit not zero: ", iM197273v);
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public final int m197242F() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        this.f180239b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    /* JADX INFO: renamed from: G */
    public final long m197243G() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f180239b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f180239b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.f180239b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.f180239b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.f180239b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.f180239b = i8;
        long j7 = bArr[i7];
        this.f180239b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48);
    }

    /* JADX INFO: renamed from: H */
    public final long m197244H() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f180239b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f180239b = i4;
        long j3 = bArr[i3];
        this.f180239b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    /* JADX INFO: renamed from: I */
    public final long m197245I() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f180239b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f180239b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.f180239b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.f180239b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.f180239b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.f180239b = i8;
        long j7 = bArr[i7];
        this.f180239b = i + 8;
        return (((long) bArr[i8]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    /* JADX INFO: renamed from: J */
    public final long m197246J() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f180239b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f180239b = i4;
        long j3 = bArr[i3];
        this.f180239b = i + 4;
        return (((long) bArr[i4]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    /* JADX INFO: renamed from: K */
    public final long m197247K() {
        long jM197245I = m197245I();
        if (jM197245I >= 0) {
            return jM197245I;
        }
        jc2.m140849a("Top bit not zero: ", jM197245I);
        return 0L;
    }

    /* JADX INFO: renamed from: L */
    public final long m197248L() {
        int i;
        int i2;
        long j = this.f180238a[this.f180239b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i4 - 1);
                i = 7 - i3;
                break;
            }
            i3--;
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.f180238a[this.f180239b + i2];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & Utf8.REPLACEMENT_BYTE));
        }
        this.f180239b += i;
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final String m197249M(char c) {
        int i = this.f180240c;
        int i2 = this.f180239b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f180240c && this.f180238a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f180238a;
        int i3 = this.f180239b;
        String strM126059a = ggw0.m126059a(bArr, i3, i2 - i3);
        this.f180239b = i2;
        if (i2 < this.f180240c) {
            this.f180239b = i2 + 1;
        }
        return strM126059a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: N */
    public final String m197250N(Charset charset) {
        byte[] bArr;
        f5v0.m119534e(f180237f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.f180240c - this.f180239b == 0) {
            return null;
        }
        Charset charset2 = wew0.f185988a;
        if (!charset.equals(charset2)) {
            m197253b();
        }
        int i = 1;
        if (!charset.equals(wew0.f185990c) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(wew0.f185993f) && !charset.equals(wew0.f185992e) && !charset.equals(wew0.f185991d)) {
                ig3.m135964a("Unsupported charset: ".concat(String.valueOf(charset)));
                return null;
            }
        }
        int i2 = this.f180239b;
        while (true) {
            int i3 = this.f180240c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(wew0.f185990c) || charset.equals(wew0.f185988a)) && ggw0.m126067i(this.f180238a[i2])) {
                break;
            }
            if (charset.equals(wew0.f185993f) || charset.equals(wew0.f185991d)) {
                byte[] bArr2 = this.f180238a;
                if (bArr2[i2] == 0 && ggw0.m126067i(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(wew0.f185992e)) {
                    bArr = this.f180238a;
                    if (bArr[i2 + 1] == 0 && ggw0.m126067i(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(wew0.f185992e)) {
                    bArr = this.f180238a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM197252a = m197252a(i2 - this.f180239b, charset);
        if (this.f180239b != this.f180240c && m197265n(charset, f180235d) == '\r') {
            m197265n(charset, f180236e);
        }
        return strM197252a;
    }

    /* JADX INFO: renamed from: O */
    public final String m197251O(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f180239b;
        int i3 = (i2 + i) - 1;
        String strM126059a = ggw0.m126059a(this.f180238a, i2, (i3 >= this.f180240c || this.f180238a[i3] != 0) ? i : i - 1);
        this.f180239b += i;
        return strM126059a;
    }

    /* JADX INFO: renamed from: a */
    public final String m197252a(int i, Charset charset) {
        byte[] bArr = this.f180238a;
        int i2 = this.f180239b;
        String str = new String(bArr, i2, i, charset);
        this.f180239b = i2 + i;
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Charset m197253b() {
        int i = this.f180240c;
        int i2 = this.f180239b;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.f180238a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f180239b = i2 + 3;
                return wew0.f185990c;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.f180238a;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.f180239b = i2 + 2;
            return wew0.f185991d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f180239b = i2 + 2;
        return wew0.f185992e;
    }

    /* JADX INFO: renamed from: c */
    public final short m197254c() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        this.f180239b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: d */
    public final short m197255d() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        this.f180239b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    /* JADX INFO: renamed from: e */
    public final void m197256e(int i) {
        byte[] bArr = this.f180238a;
        if (i > bArr.length) {
            this.f180238a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m197257f(x5w0 x5w0Var, int i) {
        m197258g(x5w0Var.f191198a, 0, i);
        x5w0Var.m207157k(0);
    }

    /* JADX INFO: renamed from: g */
    public final void m197258g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f180238a, this.f180239b, bArr, i, i2);
        this.f180239b += i2;
    }

    /* JADX INFO: renamed from: h */
    public final void m197259h(int i) {
        byte[] bArr = this.f180238a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m197260i(bArr, i);
    }

    /* JADX INFO: renamed from: i */
    public final void m197260i(byte[] bArr, int i) {
        this.f180238a = bArr;
        this.f180240c = i;
        this.f180239b = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m197261j(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f180238a.length) {
            z = true;
        }
        f5v0.m119533d(z);
        this.f180240c = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m197262k(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f180240c) {
            z = true;
        }
        f5v0.m119533d(z);
        this.f180239b = i;
    }

    /* JADX INFO: renamed from: l */
    public final void m197263l(int i) {
        m197262k(this.f180239b + i);
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m197264m() {
        return this.f180238a;
    }

    /* JADX INFO: renamed from: n */
    public final char m197265n(Charset charset, char[] cArr) {
        int iM197266o = m197266o(charset);
        if (iM197266o != 0) {
            int i = iM197266o >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.f180239b += (char) iM197266o;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX INFO: renamed from: o */
    public final int m197266o(Charset charset) {
        byte bM160008a;
        int i;
        int i2;
        char cM160009b;
        int i3;
        int i4;
        int i5 = 1;
        if (charset.equals(wew0.f185990c) || charset.equals(wew0.f185988a)) {
            int i6 = this.f180240c;
            int i7 = this.f180239b;
            if (i6 - i7 > 0) {
                bM160008a = (byte) nkw0.m160008a(this.f180238a[i7] & 255);
            } else {
                if (!charset.equals(wew0.f185993f) || charset.equals(wew0.f185991d)) {
                    i = this.f180240c;
                    i2 = this.f180239b;
                    if (i - i2 >= 2) {
                        byte[] bArr = this.f180238a;
                        cM160009b = nkw0.m160009b(bArr[i2], bArr[i2 + 1]);
                    } else {
                        if (charset.equals(wew0.f185992e)) {
                            return 0;
                        }
                        i3 = this.f180240c;
                        i4 = this.f180239b;
                        if (i3 - i4 >= 2) {
                            return 0;
                        }
                        byte[] bArr2 = this.f180238a;
                        cM160009b = nkw0.m160009b(bArr2[i4 + 1], bArr2[i4]);
                    }
                } else {
                    if (charset.equals(wew0.f185992e)) {
                        return 0;
                    }
                    i3 = this.f180240c;
                    i4 = this.f180239b;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr3 = this.f180238a;
                    cM160009b = nkw0.m160009b(bArr3[i4 + 1], bArr3[i4]);
                }
                bM160008a = (byte) cM160009b;
                i5 = 2;
            }
        } else {
            if (charset.equals(wew0.f185993f)) {
                i = this.f180240c;
                i2 = this.f180239b;
                if (i - i2 >= 2) {
                    byte[] bArr4 = this.f180238a;
                    cM160009b = nkw0.m160009b(bArr4[i2], bArr4[i2 + 1]);
                } else {
                    if (charset.equals(wew0.f185992e)) {
                        return 0;
                    }
                    i3 = this.f180240c;
                    i4 = this.f180239b;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr5 = this.f180238a;
                    cM160009b = nkw0.m160009b(bArr5[i4 + 1], bArr5[i4]);
                }
            } else {
                i = this.f180240c;
                i2 = this.f180239b;
                if (i - i2 >= 2) {
                    byte[] bArr6 = this.f180238a;
                    cM160009b = nkw0.m160009b(bArr6[i2], bArr6[i2 + 1]);
                } else {
                    if (charset.equals(wew0.f185992e)) {
                        return 0;
                    }
                    i3 = this.f180240c;
                    i4 = this.f180239b;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr7 = this.f180238a;
                    cM160009b = nkw0.m160009b(bArr7[i4 + 1], bArr7[i4]);
                }
            }
            bM160008a = (byte) cM160009b;
            i5 = 2;
        }
        return (nkw0.m160008a(bM160008a) << 16) + i5;
    }

    /* JADX INFO: renamed from: p */
    public final char m197267p(Charset charset) {
        f5v0.m119534e(f180237f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (m197266o(charset) >> 16);
    }

    /* JADX INFO: renamed from: q */
    public final int m197268q() {
        return this.f180240c - this.f180239b;
    }

    /* JADX INFO: renamed from: r */
    public final int m197269r() {
        return this.f180238a.length;
    }

    /* JADX INFO: renamed from: s */
    public final int m197270s() {
        return this.f180239b;
    }

    /* JADX INFO: renamed from: t */
    public final int m197271t() {
        return this.f180240c;
    }

    /* JADX INFO: renamed from: u */
    public final int m197272u() {
        return this.f180238a[this.f180239b] & 255;
    }

    /* JADX INFO: renamed from: v */
    public final int m197273v() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f180239b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.f180239b = i6;
        int i7 = bArr[i4] & 255;
        this.f180239b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    /* JADX INFO: renamed from: w */
    public final int m197274w() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f180239b = i4;
        int i5 = bArr[i2] & 255;
        this.f180239b = i + 3;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    /* JADX INFO: renamed from: x */
    public final int m197275x() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f180239b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.f180239b = i6;
        int i7 = bArr[i4] & 255;
        this.f180239b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    /* JADX INFO: renamed from: y */
    public final int m197276y() {
        int iM197275x = m197275x();
        if (iM197275x >= 0) {
            return iM197275x;
        }
        f3c.m119257a("Top bit not zero: ", iM197275x);
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m197277z() {
        byte[] bArr = this.f180238a;
        int i = this.f180239b;
        int i2 = i + 1;
        this.f180239b = i2;
        int i3 = bArr[i] & 255;
        this.f180239b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public v6w0() {
        this.f180238a = ggw0.f102573f;
    }

    public v6w0(byte[] bArr, int i) {
        this.f180238a = bArr;
        this.f180240c = i;
    }

    public v6w0(byte[] bArr) {
        this.f180238a = bArr;
        this.f180240c = bArr.length;
    }
}
