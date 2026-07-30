package p153l;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hg60 {

    /* JADX INFO: renamed from: a */
    public byte[] f109369a;

    /* JADX INFO: renamed from: b */
    public int f109370b;

    /* JADX INFO: renamed from: c */
    public int f109371c;

    /* JADX INFO: renamed from: d */
    public int f109372d;

    public hg60() {
        this.f109369a = bmk0.f77318f;
    }

    /* JADX INFO: renamed from: a */
    public final void m134898a() {
        int i;
        int i2 = this.f109370b;
        w11.m204371g(i2 >= 0 && (i2 < (i = this.f109372d) || (i2 == i && this.f109371c == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m134899b() {
        return ((this.f109372d - this.f109370b) * 8) - this.f109371c;
    }

    /* JADX INFO: renamed from: c */
    public void m134900c() {
        if (this.f109371c == 0) {
            return;
        }
        this.f109371c = 0;
        this.f109370b++;
        m134898a();
    }

    /* JADX INFO: renamed from: d */
    public int m134901d() {
        w11.m204371g(this.f109371c == 0);
        return this.f109370b;
    }

    /* JADX INFO: renamed from: e */
    public int m134902e() {
        return (this.f109370b * 8) + this.f109371c;
    }

    /* JADX INFO: renamed from: f */
    public void m134903f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.f109371c, i2);
        int i3 = this.f109371c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f109369a;
        int i5 = this.f109370b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (true) {
            byte[] bArr2 = this.f109369a;
            if (i6 <= 8) {
                int i8 = 8 - i6;
                byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
                bArr2[i7] = b2;
                bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
                m134915r(i2);
                m134898a();
                return;
            }
            bArr2[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m134904g() {
        boolean z = (this.f109369a[this.f109370b] & (128 >> this.f109371c)) != 0;
        m134914q();
        return z;
    }

    /* JADX INFO: renamed from: h */
    public int m134905h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f109371c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f109371c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f109371c = i4;
            byte[] bArr = this.f109369a;
            int i5 = this.f109370b;
            this.f109370b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f109369a;
        int i6 = this.f109370b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f109371c = 0;
            this.f109370b = i6 + 1;
        }
        m134898a();
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public void m134906i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f109369a;
            int i4 = this.f109370b;
            int i5 = i4 + 1;
            this.f109370b = i5;
            byte b = bArr2[i4];
            int i6 = this.f109371c;
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
        int i8 = this.f109371c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f109369a;
            int i9 = this.f109370b;
            this.f109370b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f109371c = i8 - 8;
        }
        int i10 = this.f109371c + i7;
        this.f109371c = i10;
        byte[] bArr4 = this.f109369a;
        int i11 = this.f109370b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f109371c = 0;
            this.f109370b = i11 + 1;
        }
        m134898a();
    }

    /* JADX INFO: renamed from: j */
    public long m134907j(int i) {
        return i <= 32 ? bmk0.m105149k1(m134905h(i)) : bmk0.m105146j1(m134905h(i - 32), m134905h(32));
    }

    /* JADX INFO: renamed from: k */
    public void m134908k(byte[] bArr, int i, int i2) {
        w11.m204371g(this.f109371c == 0);
        System.arraycopy(this.f109369a, this.f109370b, bArr, i, i2);
        this.f109370b += i2;
        m134898a();
    }

    /* JADX INFO: renamed from: l */
    public String m134909l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m134908k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: m */
    public void m134910m(ig60 ig60Var) {
        m134912o(ig60Var.m139815e(), ig60Var.m139817g());
        m134913p(ig60Var.m139816f() * 8);
    }

    /* JADX INFO: renamed from: n */
    public void m134911n(byte[] bArr) {
        m134912o(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: o */
    public void m134912o(byte[] bArr, int i) {
        this.f109369a = bArr;
        this.f109370b = 0;
        this.f109371c = 0;
        this.f109372d = i;
    }

    /* JADX INFO: renamed from: p */
    public void m134913p(int i) {
        int i2 = i / 8;
        this.f109370b = i2;
        this.f109371c = i - (i2 * 8);
        m134898a();
    }

    /* JADX INFO: renamed from: q */
    public void m134914q() {
        int i = this.f109371c + 1;
        this.f109371c = i;
        if (i == 8) {
            this.f109371c = 0;
            this.f109370b++;
        }
        m134898a();
    }

    /* JADX INFO: renamed from: r */
    public void m134915r(int i) {
        int i2 = i / 8;
        int i3 = this.f109370b + i2;
        this.f109370b = i3;
        int i4 = this.f109371c + (i - (i2 * 8));
        this.f109371c = i4;
        if (i4 > 7) {
            this.f109370b = i3 + 1;
            this.f109371c = i4 - 8;
        }
        m134898a();
    }

    /* JADX INFO: renamed from: s */
    public void m134916s(int i) {
        w11.m204371g(this.f109371c == 0);
        this.f109370b += i;
        m134898a();
    }

    public hg60(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public hg60(byte[] bArr, int i) {
        this.f109369a = bArr;
        this.f109372d = i;
    }
}
