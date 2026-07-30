package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaf;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class bgw0 {

    /* JADX INFO: renamed from: d */
    public static final char[] f76693d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f76694e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final zzgaf f76695f = zzgaf.zzr(cow0.f82929a, cow0.f82931c, cow0.f82934f, cow0.f82932d, cow0.f82933e);

    /* JADX INFO: renamed from: a */
    public byte[] f76696a;

    /* JADX INFO: renamed from: b */
    public int f76697b;

    /* JADX INFO: renamed from: c */
    public int f76698c;

    public bgw0(int i) {
        this.f76696a = new byte[i];
        this.f76698c = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m104244A() {
        return m104245B() | (m104245B() << 21) | (m104245B() << 14) | (m104245B() << 7);
    }

    /* JADX INFO: renamed from: B */
    public final int m104245B() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        this.f76697b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: C */
    public final int m104246C() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        this.f76697b = i + 2;
        int i4 = bArr[i2] & 255;
        this.f76697b = i + 4;
        return (i3 << 8) | i4;
    }

    /* JADX INFO: renamed from: D */
    public final int m104247D() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f76697b = i4;
        int i5 = bArr[i2] & 255;
        this.f76697b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    /* JADX INFO: renamed from: E */
    public final int m104248E() {
        int iM104280v = m104280v();
        if (iM104280v >= 0) {
            return iM104280v;
        }
        o4c.m165980a("Top bit not zero: ", iM104280v);
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public final int m104249F() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        this.f76697b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    /* JADX INFO: renamed from: G */
    public final long m104250G() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f76697b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f76697b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.f76697b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.f76697b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.f76697b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.f76697b = i8;
        long j7 = bArr[i7];
        this.f76697b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48);
    }

    /* JADX INFO: renamed from: H */
    public final long m104251H() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f76697b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f76697b = i4;
        long j3 = bArr[i3];
        this.f76697b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    /* JADX INFO: renamed from: I */
    public final long m104252I() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f76697b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f76697b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.f76697b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.f76697b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.f76697b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.f76697b = i8;
        long j7 = bArr[i7];
        this.f76697b = i + 8;
        return (((long) bArr[i8]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    /* JADX INFO: renamed from: J */
    public final long m104253J() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f76697b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f76697b = i4;
        long j3 = bArr[i3];
        this.f76697b = i + 4;
        return (((long) bArr[i4]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    /* JADX INFO: renamed from: K */
    public final long m104254K() {
        long jM104252I = m104252I();
        if (jM104252I >= 0) {
            return jM104252I;
        }
        qc2.m176107a("Top bit not zero: ", jM104252I);
        return 0L;
    }

    /* JADX INFO: renamed from: L */
    public final long m104255L() {
        int i;
        int i2;
        long j = this.f76696a[this.f76697b];
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
            byte b = this.f76696a[this.f76697b + i2];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & Utf8.REPLACEMENT_BYTE));
        }
        this.f76697b += i;
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final String m104256M(char c) {
        int i = this.f76698c;
        int i2 = this.f76697b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f76698c && this.f76696a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f76696a;
        int i3 = this.f76697b;
        String strM159403a = mpw0.m159403a(bArr, i3, i2 - i3);
        this.f76697b = i2;
        if (i2 < this.f76698c) {
            this.f76697b = i2 + 1;
        }
        return strM159403a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: N */
    public final String m104257N(Charset charset) {
        byte[] bArr;
        lev0.m153957e(f76695f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.f76698c - this.f76697b == 0) {
            return null;
        }
        Charset charset2 = cow0.f82929a;
        if (!charset.equals(charset2)) {
            m104260b();
        }
        int i = 1;
        if (!charset.equals(cow0.f82931c) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(cow0.f82934f) && !charset.equals(cow0.f82933e) && !charset.equals(cow0.f82932d)) {
                wg3.m206174a("Unsupported charset: ".concat(String.valueOf(charset)));
                return null;
            }
        }
        int i2 = this.f76697b;
        while (true) {
            int i3 = this.f76698c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(cow0.f82931c) || charset.equals(cow0.f82929a)) && mpw0.m159411i(this.f76696a[i2])) {
                break;
            }
            if (charset.equals(cow0.f82934f) || charset.equals(cow0.f82932d)) {
                byte[] bArr2 = this.f76696a;
                if (bArr2[i2] == 0 && mpw0.m159411i(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(cow0.f82933e)) {
                    bArr = this.f76696a;
                    if (bArr[i2 + 1] == 0 && mpw0.m159411i(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(cow0.f82933e)) {
                    bArr = this.f76696a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM104259a = m104259a(i2 - this.f76697b, charset);
        if (this.f76697b != this.f76698c && m104272n(charset, f76693d) == '\r') {
            m104272n(charset, f76694e);
        }
        return strM104259a;
    }

    /* JADX INFO: renamed from: O */
    public final String m104258O(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f76697b;
        int i3 = (i2 + i) - 1;
        String strM159403a = mpw0.m159403a(this.f76696a, i2, (i3 >= this.f76698c || this.f76696a[i3] != 0) ? i : i - 1);
        this.f76697b += i;
        return strM159403a;
    }

    /* JADX INFO: renamed from: a */
    public final String m104259a(int i, Charset charset) {
        byte[] bArr = this.f76696a;
        int i2 = this.f76697b;
        String str = new String(bArr, i2, i, charset);
        this.f76697b = i2 + i;
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Charset m104260b() {
        int i = this.f76698c;
        int i2 = this.f76697b;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.f76696a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f76697b = i2 + 3;
                return cow0.f82931c;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.f76696a;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.f76697b = i2 + 2;
            return cow0.f82932d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f76697b = i2 + 2;
        return cow0.f82933e;
    }

    /* JADX INFO: renamed from: c */
    public final short m104261c() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        this.f76697b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: d */
    public final short m104262d() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        this.f76697b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    /* JADX INFO: renamed from: e */
    public final void m104263e(int i) {
        byte[] bArr = this.f76696a;
        if (i > bArr.length) {
            this.f76696a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m104264f(dfw0 dfw0Var, int i) {
        m104265g(dfw0Var.f88231a, 0, i);
        dfw0Var.m115559k(0);
    }

    /* JADX INFO: renamed from: g */
    public final void m104265g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f76696a, this.f76697b, bArr, i, i2);
        this.f76697b += i2;
    }

    /* JADX INFO: renamed from: h */
    public final void m104266h(int i) {
        byte[] bArr = this.f76696a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m104267i(bArr, i);
    }

    /* JADX INFO: renamed from: i */
    public final void m104267i(byte[] bArr, int i) {
        this.f76696a = bArr;
        this.f76698c = i;
        this.f76697b = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m104268j(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f76696a.length) {
            z = true;
        }
        lev0.m153956d(z);
        this.f76698c = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m104269k(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f76698c) {
            z = true;
        }
        lev0.m153956d(z);
        this.f76697b = i;
    }

    /* JADX INFO: renamed from: l */
    public final void m104270l(int i) {
        m104269k(this.f76697b + i);
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m104271m() {
        return this.f76696a;
    }

    /* JADX INFO: renamed from: n */
    public final char m104272n(Charset charset, char[] cArr) {
        int iM104273o = m104273o(charset);
        if (iM104273o != 0) {
            int i = iM104273o >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.f76697b += (char) iM104273o;
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
    public final int m104273o(Charset charset) {
        byte bM192696a;
        int i;
        int i2;
        char cM192697b;
        int i3;
        int i4;
        int i5 = 1;
        if (charset.equals(cow0.f82931c) || charset.equals(cow0.f82929a)) {
            int i6 = this.f76698c;
            int i7 = this.f76697b;
            if (i6 - i7 > 0) {
                bM192696a = (byte) ttw0.m192696a(this.f76696a[i7] & 255);
            } else {
                if (!charset.equals(cow0.f82934f) || charset.equals(cow0.f82932d)) {
                    i = this.f76698c;
                    i2 = this.f76697b;
                    if (i - i2 >= 2) {
                        byte[] bArr = this.f76696a;
                        cM192697b = ttw0.m192697b(bArr[i2], bArr[i2 + 1]);
                    } else {
                        if (charset.equals(cow0.f82933e)) {
                            return 0;
                        }
                        i3 = this.f76698c;
                        i4 = this.f76697b;
                        if (i3 - i4 >= 2) {
                            return 0;
                        }
                        byte[] bArr2 = this.f76696a;
                        cM192697b = ttw0.m192697b(bArr2[i4 + 1], bArr2[i4]);
                    }
                } else {
                    if (charset.equals(cow0.f82933e)) {
                        return 0;
                    }
                    i3 = this.f76698c;
                    i4 = this.f76697b;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr3 = this.f76696a;
                    cM192697b = ttw0.m192697b(bArr3[i4 + 1], bArr3[i4]);
                }
                bM192696a = (byte) cM192697b;
                i5 = 2;
            }
        } else {
            if (charset.equals(cow0.f82934f)) {
                i = this.f76698c;
                i2 = this.f76697b;
                if (i - i2 >= 2) {
                    byte[] bArr4 = this.f76696a;
                    cM192697b = ttw0.m192697b(bArr4[i2], bArr4[i2 + 1]);
                } else {
                    if (charset.equals(cow0.f82933e)) {
                        return 0;
                    }
                    i3 = this.f76698c;
                    i4 = this.f76697b;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr5 = this.f76696a;
                    cM192697b = ttw0.m192697b(bArr5[i4 + 1], bArr5[i4]);
                }
            } else {
                i = this.f76698c;
                i2 = this.f76697b;
                if (i - i2 >= 2) {
                    byte[] bArr6 = this.f76696a;
                    cM192697b = ttw0.m192697b(bArr6[i2], bArr6[i2 + 1]);
                } else {
                    if (charset.equals(cow0.f82933e)) {
                        return 0;
                    }
                    i3 = this.f76698c;
                    i4 = this.f76697b;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr7 = this.f76696a;
                    cM192697b = ttw0.m192697b(bArr7[i4 + 1], bArr7[i4]);
                }
            }
            bM192696a = (byte) cM192697b;
            i5 = 2;
        }
        return (ttw0.m192696a(bM192696a) << 16) + i5;
    }

    /* JADX INFO: renamed from: p */
    public final char m104274p(Charset charset) {
        lev0.m153957e(f76695f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (m104273o(charset) >> 16);
    }

    /* JADX INFO: renamed from: q */
    public final int m104275q() {
        return this.f76698c - this.f76697b;
    }

    /* JADX INFO: renamed from: r */
    public final int m104276r() {
        return this.f76696a.length;
    }

    /* JADX INFO: renamed from: s */
    public final int m104277s() {
        return this.f76697b;
    }

    /* JADX INFO: renamed from: t */
    public final int m104278t() {
        return this.f76698c;
    }

    /* JADX INFO: renamed from: u */
    public final int m104279u() {
        return this.f76696a[this.f76697b] & 255;
    }

    /* JADX INFO: renamed from: v */
    public final int m104280v() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f76697b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.f76697b = i6;
        int i7 = bArr[i4] & 255;
        this.f76697b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    /* JADX INFO: renamed from: w */
    public final int m104281w() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f76697b = i4;
        int i5 = bArr[i2] & 255;
        this.f76697b = i + 3;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    /* JADX INFO: renamed from: x */
    public final int m104282x() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f76697b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.f76697b = i6;
        int i7 = bArr[i4] & 255;
        this.f76697b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    /* JADX INFO: renamed from: y */
    public final int m104283y() {
        int iM104282x = m104282x();
        if (iM104282x >= 0) {
            return iM104282x;
        }
        o4c.m165980a("Top bit not zero: ", iM104282x);
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m104284z() {
        byte[] bArr = this.f76696a;
        int i = this.f76697b;
        int i2 = i + 1;
        this.f76697b = i2;
        int i3 = bArr[i] & 255;
        this.f76697b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public bgw0() {
        this.f76696a = mpw0.f137962f;
    }

    public bgw0(byte[] bArr, int i) {
        this.f76696a = bArr;
        this.f76698c = i;
    }

    public bgw0(byte[] bArr) {
        this.f76696a = bArr;
        this.f76698c = bArr.length;
    }
}
