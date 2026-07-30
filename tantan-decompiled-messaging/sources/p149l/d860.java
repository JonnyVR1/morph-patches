package p149l;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class d860 {

    /* JADX INFO: renamed from: d */
    public static final char[] f84828d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f84829e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet<Charset> f84830f = ImmutableSet.m15773of(fs4.f99034a, fs4.f99036c, fs4.f99039f, fs4.f99037d, fs4.f99038e);

    /* JADX INFO: renamed from: a */
    public byte[] f84831a;

    /* JADX INFO: renamed from: b */
    public int f84832b;

    /* JADX INFO: renamed from: c */
    public int f84833c;

    public d860(int i) {
        this.f84831a = new byte[i];
        this.f84833c = i;
    }

    /* JADX INFO: renamed from: A */
    public long m110272A() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f84832b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f84832b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f84832b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f84832b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f84832b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f84832b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f84832b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public String m110273B() {
        return m110308n((char) 0);
    }

    /* JADX INFO: renamed from: C */
    public String m110274C(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f84832b;
        int i3 = (i2 + i) - 1;
        String strM197797F = vck0.m197797F(this.f84831a, i2, (i3 >= this.f84833c || this.f84831a[i3] != 0) ? i : i - 1);
        this.f84832b += i;
        return strM197797F;
    }

    /* JADX INFO: renamed from: D */
    public short m110275D() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f84832b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: E */
    public String m110276E(int i) {
        return m110277F(i, fs4.f99036c);
    }

    /* JADX INFO: renamed from: F */
    public String m110277F(int i, Charset charset) {
        String str = new String(this.f84831a, this.f84832b, i, charset);
        this.f84832b += i;
        return str;
    }

    /* JADX INFO: renamed from: G */
    public int m110278G() {
        return m110279H() | (m110279H() << 21) | (m110279H() << 14) | (m110279H() << 7);
    }

    /* JADX INFO: renamed from: H */
    public int m110279H() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        this.f84832b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: I */
    public int m110280I() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f84832b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f84832b = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: J */
    public long m110281J() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f84832b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f84832b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f84832b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: K */
    public int m110282K() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f84832b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f84832b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: L */
    public int m110283L() {
        int iM110311q = m110311q();
        if (iM110311q >= 0) {
            return iM110311q;
        }
        f3c.m119257a("Top bit not zero: ", iM110311q);
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public long m110284M() {
        long jM110272A = m110272A();
        if (jM110272A >= 0) {
            return jM110272A;
        }
        jc2.m140849a("Top bit not zero: ", jM110272A);
        return 0L;
    }

    /* JADX INFO: renamed from: N */
    public int m110285N() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f84832b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: O */
    public long m110286O() {
        int i;
        int i2;
        long j = this.f84831a[this.f84832b];
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
            byte b = this.f84831a[this.f84832b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & Utf8.REPLACEMENT_BYTE));
        }
        this.f84832b += i2;
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public Charset m110287P() {
        if (m110295a() >= 3) {
            byte[] bArr = this.f84831a;
            int i = this.f84832b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f84832b = i + 3;
                return fs4.f99036c;
            }
        }
        if (m110295a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f84831a;
        int i2 = this.f84832b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f84832b = i2 + 2;
            return fs4.f99037d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f84832b = i2 + 2;
        return fs4.f99038e;
    }

    /* JADX INFO: renamed from: Q */
    public void m110288Q(int i) {
        m110290S(m110296b() < i ? new byte[i] : this.f84831a, i);
    }

    /* JADX INFO: renamed from: R */
    public void m110289R(byte[] bArr) {
        m110290S(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: S */
    public void m110290S(byte[] bArr, int i) {
        this.f84831a = bArr;
        this.f84833c = i;
        this.f84832b = 0;
    }

    /* JADX INFO: renamed from: T */
    public void m110291T(int i) {
        p11.m167007a(i >= 0 && i <= this.f84831a.length);
        this.f84833c = i;
    }

    /* JADX INFO: renamed from: U */
    public void m110292U(int i) {
        p11.m167007a(i >= 0 && i <= this.f84833c);
        this.f84832b = i;
    }

    /* JADX INFO: renamed from: V */
    public void m110293V(int i) {
        m110292U(this.f84832b + i);
    }

    /* JADX INFO: renamed from: W */
    public final void m110294W(Charset charset) {
        if (m110307m(charset, f84828d) == '\r') {
            m110307m(charset, f84829e);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m110295a() {
        return this.f84833c - this.f84832b;
    }

    /* JADX INFO: renamed from: b */
    public int m110296b() {
        return this.f84831a.length;
    }

    /* JADX INFO: renamed from: c */
    public void m110297c(int i) {
        if (i > m110296b()) {
            this.f84831a = Arrays.copyOf(this.f84831a, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final int m110298d(Charset charset) {
        int i;
        byte[] bArr;
        if (charset.equals(fs4.f99036c) || charset.equals(fs4.f99034a)) {
            i = 1;
        } else {
            if (!charset.equals(fs4.f99039f) && !charset.equals(fs4.f99038e) && !charset.equals(fs4.f99037d)) {
                qhg0.m174539a("Unsupported charset: ", charset);
                return 0;
            }
            i = 2;
        }
        int i2 = this.f84832b;
        while (true) {
            int i3 = this.f84833c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((!charset.equals(fs4.f99036c) && !charset.equals(fs4.f99034a)) || !vck0.m197794D0(this.f84831a[i2])) {
                if (charset.equals(fs4.f99039f) || charset.equals(fs4.f99037d)) {
                    byte[] bArr2 = this.f84831a;
                    if (bArr2[i2] != 0 || !vck0.m197794D0(bArr2[i2 + 1])) {
                        if (charset.equals(fs4.f99038e)) {
                            bArr = this.f84831a;
                            if (bArr[i2 + 1] != 0 || !vck0.m197794D0(bArr[i2])) {
                            }
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(fs4.f99038e)) {
                        bArr = this.f84831a;
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
    public byte[] m110299e() {
        return this.f84831a;
    }

    /* JADX INFO: renamed from: f */
    public int m110300f() {
        return this.f84832b;
    }

    /* JADX INFO: renamed from: g */
    public int m110301g() {
        return this.f84833c;
    }

    /* JADX INFO: renamed from: h */
    public char m110302h(Charset charset) {
        p11.m167008b(f84830f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m110303i(charset) >> 16);
    }

    /* JADX INFO: renamed from: i */
    public final int m110303i(Charset charset) {
        byte bM16394c;
        char cM16397f;
        int i = 1;
        if ((charset.equals(fs4.f99036c) || charset.equals(fs4.f99034a)) && m110295a() >= 1) {
            bM16394c = (byte) Chars.m16394c(jpj0.m142746c(this.f84831a[this.f84832b]));
        } else {
            if ((charset.equals(fs4.f99039f) || charset.equals(fs4.f99037d)) && m110295a() >= 2) {
                byte[] bArr = this.f84831a;
                int i2 = this.f84832b;
                cM16397f = Chars.m16397f(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(fs4.f99038e) || m110295a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f84831a;
                int i3 = this.f84832b;
                cM16397f = Chars.m16397f(bArr2[i3 + 1], bArr2[i3]);
            }
            bM16394c = (byte) cM16397f;
            i = 2;
        }
        return (Chars.m16394c(bM16394c) << 16) + i;
    }

    /* JADX INFO: renamed from: j */
    public int m110304j() {
        return this.f84831a[this.f84832b] & 255;
    }

    /* JADX INFO: renamed from: k */
    public void m110305k(c860 c860Var, int i) {
        m110306l(c860Var.f79701a, 0, i);
        c860Var.m105672p(0);
    }

    /* JADX INFO: renamed from: l */
    public void m110306l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f84831a, this.f84832b, bArr, i, i2);
        this.f84832b += i2;
    }

    /* JADX INFO: renamed from: m */
    public final char m110307m(Charset charset, char[] cArr) {
        int iM110303i = m110303i(charset);
        if (iM110303i == 0) {
            return (char) 0;
        }
        char c = (char) (iM110303i >> 16);
        if (!Chars.m16396e(cArr, c)) {
            return (char) 0;
        }
        this.f84832b += iM110303i & j6f.COLOR_SPACE_UNCALIBRATED;
        return c;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public String m110308n(char c) {
        if (m110295a() == 0) {
            return null;
        }
        int i = this.f84832b;
        while (i < this.f84833c && this.f84831a[i] != c) {
            i++;
        }
        byte[] bArr = this.f84831a;
        int i2 = this.f84832b;
        String strM197797F = vck0.m197797F(bArr, i2, i - i2);
        this.f84832b = i;
        if (i < this.f84833c) {
            this.f84832b = i + 1;
        }
        return strM197797F;
    }

    /* JADX INFO: renamed from: o */
    public double m110309o() {
        return Double.longBitsToDouble(m110272A());
    }

    /* JADX INFO: renamed from: p */
    public float m110310p() {
        return Float.intBitsToFloat(m110311q());
    }

    /* JADX INFO: renamed from: q */
    public int m110311q() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f84832b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f84832b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f84832b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: r */
    public int m110312r() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f84832b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f84832b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public String m110313s() {
        return m110314t(fs4.f99036c);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public String m110314t(Charset charset) {
        p11.m167008b(f84830f.contains(charset), "Unsupported charset: " + charset);
        if (m110295a() == 0) {
            return null;
        }
        if (!charset.equals(fs4.f99034a)) {
            m110287P();
        }
        String strM110277F = m110277F(m110298d(charset) - this.f84832b, charset);
        if (this.f84832b == this.f84833c) {
            return strM110277F;
        }
        m110294W(charset);
        return strM110277F;
    }

    /* JADX INFO: renamed from: u */
    public int m110315u() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f84832b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f84832b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f84832b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: v */
    public long m110316v() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f84832b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f84832b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f84832b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f84832b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f84832b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f84832b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f84832b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: w */
    public short m110317w() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = bArr[i] & 255;
        this.f84832b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: x */
    public long m110318x() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f84832b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f84832b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f84832b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: y */
    public int m110319y() {
        int iM110315u = m110315u();
        if (iM110315u >= 0) {
            return iM110315u;
        }
        f3c.m119257a("Top bit not zero: ", iM110315u);
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public int m110320z() {
        byte[] bArr = this.f84831a;
        int i = this.f84832b;
        int i2 = i + 1;
        this.f84832b = i2;
        int i3 = bArr[i] & 255;
        this.f84832b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public d860() {
        this.f84831a = vck0.f180953f;
    }

    public d860(byte[] bArr) {
        this.f84831a = bArr;
        this.f84833c = bArr.length;
    }

    public d860(byte[] bArr, int i) {
        this.f84831a = bArr;
        this.f84833c = i;
    }
}
