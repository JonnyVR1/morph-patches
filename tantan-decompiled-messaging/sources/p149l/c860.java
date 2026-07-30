package p149l;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c860 {

    /* JADX INFO: renamed from: a */
    public byte[] f79701a;

    /* JADX INFO: renamed from: b */
    public int f79702b;

    /* JADX INFO: renamed from: c */
    public int f79703c;

    /* JADX INFO: renamed from: d */
    public int f79704d;

    public c860() {
        this.f79701a = vck0.f180953f;
    }

    /* JADX INFO: renamed from: a */
    public final void m105657a() {
        int i;
        int i2 = this.f79702b;
        p11.m167013g(i2 >= 0 && (i2 < (i = this.f79704d) || (i2 == i && this.f79703c == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m105658b() {
        return ((this.f79704d - this.f79702b) * 8) - this.f79703c;
    }

    /* JADX INFO: renamed from: c */
    public void m105659c() {
        if (this.f79703c == 0) {
            return;
        }
        this.f79703c = 0;
        this.f79702b++;
        m105657a();
    }

    /* JADX INFO: renamed from: d */
    public int m105660d() {
        p11.m167013g(this.f79703c == 0);
        return this.f79702b;
    }

    /* JADX INFO: renamed from: e */
    public int m105661e() {
        return (this.f79702b * 8) + this.f79703c;
    }

    /* JADX INFO: renamed from: f */
    public void m105662f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.f79703c, i2);
        int i3 = this.f79703c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f79701a;
        int i5 = this.f79702b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (true) {
            byte[] bArr2 = this.f79701a;
            if (i6 <= 8) {
                int i8 = 8 - i6;
                byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
                bArr2[i7] = b2;
                bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
                m105674r(i2);
                m105657a();
                return;
            }
            bArr2[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m105663g() {
        boolean z = (this.f79701a[this.f79702b] & (128 >> this.f79703c)) != 0;
        m105673q();
        return z;
    }

    /* JADX INFO: renamed from: h */
    public int m105664h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f79703c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f79703c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f79703c = i4;
            byte[] bArr = this.f79701a;
            int i5 = this.f79702b;
            this.f79702b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f79701a;
        int i6 = this.f79702b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f79703c = 0;
            this.f79702b = i6 + 1;
        }
        m105657a();
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public void m105665i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f79701a;
            int i4 = this.f79702b;
            int i5 = i4 + 1;
            this.f79702b = i5;
            byte b = bArr2[i4];
            int i6 = this.f79703c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.f79703c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f79701a;
            int i9 = this.f79702b;
            this.f79702b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f79703c = i8 - 8;
        }
        int i10 = this.f79703c + i7;
        this.f79703c = i10;
        byte[] bArr4 = this.f79701a;
        int i11 = this.f79702b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f79703c = 0;
            this.f79702b = i11 + 1;
        }
        m105657a();
    }

    /* JADX INFO: renamed from: j */
    public long m105666j(int i) {
        return i <= 32 ? vck0.m197871k1(m105664h(i)) : vck0.m197868j1(m105664h(i - 32), m105664h(32));
    }

    /* JADX INFO: renamed from: k */
    public void m105667k(byte[] bArr, int i, int i2) {
        p11.m167013g(this.f79703c == 0);
        System.arraycopy(this.f79701a, this.f79702b, bArr, i, i2);
        this.f79702b += i2;
        m105657a();
    }

    /* JADX INFO: renamed from: l */
    public String m105668l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m105667k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: m */
    public void m105669m(d860 d860Var) {
        m105671o(d860Var.m110299e(), d860Var.m110301g());
        m105672p(d860Var.m110300f() * 8);
    }

    /* JADX INFO: renamed from: n */
    public void m105670n(byte[] bArr) {
        m105671o(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: o */
    public void m105671o(byte[] bArr, int i) {
        this.f79701a = bArr;
        this.f79702b = 0;
        this.f79703c = 0;
        this.f79704d = i;
    }

    /* JADX INFO: renamed from: p */
    public void m105672p(int i) {
        int i2 = i / 8;
        this.f79702b = i2;
        this.f79703c = i - (i2 * 8);
        m105657a();
    }

    /* JADX INFO: renamed from: q */
    public void m105673q() {
        int i = this.f79703c + 1;
        this.f79703c = i;
        if (i == 8) {
            this.f79703c = 0;
            this.f79702b++;
        }
        m105657a();
    }

    /* JADX INFO: renamed from: r */
    public void m105674r(int i) {
        int i2 = i / 8;
        int i3 = this.f79702b + i2;
        this.f79702b = i3;
        int i4 = this.f79703c + (i - (i2 * 8));
        this.f79703c = i4;
        if (i4 > 7) {
            this.f79702b = i3 + 1;
            this.f79703c = i4 - 8;
        }
        m105657a();
    }

    /* JADX INFO: renamed from: s */
    public void m105675s(int i) {
        p11.m167013g(this.f79703c == 0);
        this.f79702b += i;
        m105657a();
    }

    public c860(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public c860(byte[] bArr, int i) {
        this.f79701a = bArr;
        this.f79704d = i;
    }
}
