package p153l;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ig60 {

    /* JADX INFO: renamed from: d */
    public static final char[] f114751d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f114752e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet<Charset> f114753f = ImmutableSet.m15827of(et4.f95687a, et4.f95689c, et4.f95692f, et4.f95690d, et4.f95691e);

    /* JADX INFO: renamed from: a */
    public byte[] f114754a;

    /* JADX INFO: renamed from: b */
    public int f114755b;

    /* JADX INFO: renamed from: c */
    public int f114756c;

    public ig60(int i) {
        this.f114754a = new byte[i];
        this.f114756c = i;
    }

    /* JADX INFO: renamed from: A */
    public long m139788A() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f114755b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f114755b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f114755b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f114755b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f114755b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f114755b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f114755b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public String m139789B() {
        return m139824n((char) 0);
    }

    /* JADX INFO: renamed from: C */
    public String m139790C(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f114755b;
        int i3 = (i2 + i) - 1;
        String strM105075F = bmk0.m105075F(this.f114754a, i2, (i3 >= this.f114756c || this.f114754a[i3] != 0) ? i : i - 1);
        this.f114755b += i;
        return strM105075F;
    }

    /* JADX INFO: renamed from: D */
    public short m139791D() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f114755b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: E */
    public String m139792E(int i) {
        return m139793F(i, et4.f95689c);
    }

    /* JADX INFO: renamed from: F */
    public String m139793F(int i, Charset charset) {
        String str = new String(this.f114754a, this.f114755b, i, charset);
        this.f114755b += i;
        return str;
    }

    /* JADX INFO: renamed from: G */
    public int m139794G() {
        return m139795H() | (m139795H() << 21) | (m139795H() << 14) | (m139795H() << 7);
    }

    /* JADX INFO: renamed from: H */
    public int m139795H() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        this.f114755b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: I */
    public int m139796I() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f114755b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f114755b = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: J */
    public long m139797J() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f114755b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f114755b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f114755b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: K */
    public int m139798K() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f114755b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f114755b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: L */
    public int m139799L() {
        int iM139827q = m139827q();
        if (iM139827q >= 0) {
            return iM139827q;
        }
        o4c.m165980a("Top bit not zero: ", iM139827q);
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public long m139800M() {
        long jM139788A = m139788A();
        if (jM139788A >= 0) {
            return jM139788A;
        }
        qc2.m176107a("Top bit not zero: ", jM139788A);
        return 0L;
    }

    /* JADX INFO: renamed from: N */
    public int m139801N() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f114755b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: O */
    public long m139802O() {
        int i;
        int i2;
        long j = this.f114754a[this.f114755b];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f114754a[this.f114755b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & Utf8.REPLACEMENT_BYTE));
        }
        this.f114755b += i2;
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public Charset m139803P() {
        if (m139811a() >= 3) {
            byte[] bArr = this.f114754a;
            int i = this.f114755b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f114755b = i + 3;
                return et4.f95689c;
            }
        }
        if (m139811a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f114754a;
        int i2 = this.f114755b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f114755b = i2 + 2;
            return et4.f95690d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f114755b = i2 + 2;
        return et4.f95691e;
    }

    /* JADX INFO: renamed from: Q */
    public void m139804Q(int i) {
        m139806S(m139812b() < i ? new byte[i] : this.f114754a, i);
    }

    /* JADX INFO: renamed from: R */
    public void m139805R(byte[] bArr) {
        m139806S(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: S */
    public void m139806S(byte[] bArr, int i) {
        this.f114754a = bArr;
        this.f114756c = i;
        this.f114755b = 0;
    }

    /* JADX INFO: renamed from: T */
    public void m139807T(int i) {
        w11.m204365a(i >= 0 && i <= this.f114754a.length);
        this.f114756c = i;
    }

    /* JADX INFO: renamed from: U */
    public void m139808U(int i) {
        w11.m204365a(i >= 0 && i <= this.f114756c);
        this.f114755b = i;
    }

    /* JADX INFO: renamed from: V */
    public void m139809V(int i) {
        m139808U(this.f114755b + i);
    }

    /* JADX INFO: renamed from: W */
    public final void m139810W(Charset charset) {
        if (m139823m(charset, f114751d) == '\r') {
            m139823m(charset, f114752e);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m139811a() {
        return this.f114756c - this.f114755b;
    }

    /* JADX INFO: renamed from: b */
    public int m139812b() {
        return this.f114754a.length;
    }

    /* JADX INFO: renamed from: c */
    public void m139813c(int i) {
        if (i > m139812b()) {
            this.f114754a = Arrays.copyOf(this.f114754a, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final int m139814d(Charset charset) {
        int i;
        byte[] bArr;
        if (charset.equals(et4.f95689c) || charset.equals(et4.f95687a)) {
            i = 1;
        } else {
            if (!charset.equals(et4.f95692f) && !charset.equals(et4.f95691e) && !charset.equals(et4.f95690d)) {
                ypg0.m217021a("Unsupported charset: ", charset);
                return 0;
            }
            i = 2;
        }
        int i2 = this.f114755b;
        while (true) {
            int i3 = this.f114756c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((!charset.equals(et4.f95689c) && !charset.equals(et4.f95687a)) || !bmk0.m105072D0(this.f114754a[i2])) {
                if (charset.equals(et4.f95692f) || charset.equals(et4.f95690d)) {
                    byte[] bArr2 = this.f114754a;
                    if (bArr2[i2] != 0 || !bmk0.m105072D0(bArr2[i2 + 1])) {
                        if (charset.equals(et4.f95691e)) {
                            bArr = this.f114754a;
                            if (bArr[i2 + 1] != 0 || !bmk0.m105072D0(bArr[i2])) {
                            }
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(et4.f95691e)) {
                        bArr = this.f114754a;
                        if (bArr[i2 + 1] != 0) {
                            continue;
                        }
                    }
                    i2 += i;
                }
            }
            return i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public byte[] m139815e() {
        return this.f114754a;
    }

    /* JADX INFO: renamed from: f */
    public int m139816f() {
        return this.f114755b;
    }

    /* JADX INFO: renamed from: g */
    public int m139817g() {
        return this.f114756c;
    }

    /* JADX INFO: renamed from: h */
    public char m139818h(Charset charset) {
        w11.m204366b(f114753f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m139819i(charset) >> 16);
    }

    /* JADX INFO: renamed from: i */
    public final int m139819i(Charset charset) {
        byte bM16449c;
        char cM16452f;
        int i = 1;
        if ((charset.equals(et4.f95689c) || charset.equals(et4.f95687a)) && m139811a() >= 1) {
            bM16449c = (byte) Chars.m16449c(myj0.m160799c(this.f114754a[this.f114755b]));
        } else {
            if ((charset.equals(et4.f95692f) || charset.equals(et4.f95690d)) && m139811a() >= 2) {
                byte[] bArr = this.f114754a;
                int i2 = this.f114755b;
                cM16452f = Chars.m16452f(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(et4.f95691e) || m139811a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f114754a;
                int i3 = this.f114755b;
                cM16452f = Chars.m16452f(bArr2[i3 + 1], bArr2[i3]);
            }
            bM16449c = (byte) cM16452f;
            i = 2;
        }
        return (Chars.m16449c(bM16449c) << 16) + i;
    }

    /* JADX INFO: renamed from: j */
    public int m139820j() {
        return this.f114754a[this.f114755b] & 255;
    }

    /* JADX INFO: renamed from: k */
    public void m139821k(hg60 hg60Var, int i) {
        m139822l(hg60Var.f109369a, 0, i);
        hg60Var.m134913p(0);
    }

    /* JADX INFO: renamed from: l */
    public void m139822l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f114754a, this.f114755b, bArr, i, i2);
        this.f114755b += i2;
    }

    /* JADX INFO: renamed from: m */
    public final char m139823m(Charset charset, char[] cArr) {
        int iM139819i = m139819i(charset);
        if (iM139819i == 0) {
            return (char) 0;
        }
        char c = (char) (iM139819i >> 16);
        if (!Chars.m16451e(cArr, c)) {
            return (char) 0;
        }
        this.f114755b += iM139819i & p7f.COLOR_SPACE_UNCALIBRATED;
        return c;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public String m139824n(char c) {
        if (m139811a() == 0) {
            return null;
        }
        int i = this.f114755b;
        while (i < this.f114756c && this.f114754a[i] != c) {
            i++;
        }
        byte[] bArr = this.f114754a;
        int i2 = this.f114755b;
        String strM105075F = bmk0.m105075F(bArr, i2, i - i2);
        this.f114755b = i;
        if (i < this.f114756c) {
            this.f114755b = i + 1;
        }
        return strM105075F;
    }

    /* JADX INFO: renamed from: o */
    public double m139825o() {
        return Double.longBitsToDouble(m139788A());
    }

    /* JADX INFO: renamed from: p */
    public float m139826p() {
        return Float.intBitsToFloat(m139827q());
    }

    /* JADX INFO: renamed from: q */
    public int m139827q() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f114755b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f114755b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f114755b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: r */
    public int m139828r() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f114755b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f114755b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public String m139829s() {
        return m139830t(et4.f95689c);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public String m139830t(Charset charset) {
        w11.m204366b(f114753f.contains(charset), "Unsupported charset: " + charset);
        if (m139811a() == 0) {
            return null;
        }
        if (!charset.equals(et4.f95687a)) {
            m139803P();
        }
        String strM139793F = m139793F(m139814d(charset) - this.f114755b, charset);
        if (this.f114755b == this.f114756c) {
            return strM139793F;
        }
        m139810W(charset);
        return strM139793F;
    }

    /* JADX INFO: renamed from: u */
    public int m139831u() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f114755b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f114755b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f114755b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: v */
    public long m139832v() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f114755b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f114755b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f114755b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f114755b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f114755b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f114755b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f114755b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: w */
    public short m139833w() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = bArr[i] & 255;
        this.f114755b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: x */
    public long m139834x() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f114755b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f114755b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f114755b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: y */
    public int m139835y() {
        int iM139831u = m139831u();
        if (iM139831u >= 0) {
            return iM139831u;
        }
        o4c.m165980a("Top bit not zero: ", iM139831u);
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public int m139836z() {
        byte[] bArr = this.f114754a;
        int i = this.f114755b;
        int i2 = i + 1;
        this.f114755b = i2;
        int i3 = bArr[i] & 255;
        this.f114755b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public ig60() {
        this.f114754a = bmk0.f77318f;
    }

    public ig60(byte[] bArr) {
        this.f114754a = bArr;
        this.f114756c = bArr.length;
    }

    public ig60(byte[] bArr, int i) {
        this.f114754a = bArr;
        this.f114756c = i;
    }
}
