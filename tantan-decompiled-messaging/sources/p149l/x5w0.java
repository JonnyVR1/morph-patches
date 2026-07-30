package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class x5w0 {

    /* JADX INFO: renamed from: a */
    public byte[] f191198a;

    /* JADX INFO: renamed from: b */
    public int f191199b;

    /* JADX INFO: renamed from: c */
    public int f191200c;

    /* JADX INFO: renamed from: d */
    public int f191201d;

    public x5w0(byte[] bArr, int i) {
        this.f191198a = bArr;
        this.f191201d = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m207147a() {
        return ((this.f191201d - this.f191199b) * 8) - this.f191200c;
    }

    /* JADX INFO: renamed from: b */
    public final int m207148b() {
        f5v0.m119535f(this.f191200c == 0);
        return this.f191199b;
    }

    /* JADX INFO: renamed from: c */
    public final int m207149c() {
        return (this.f191199b * 8) + this.f191200c;
    }

    /* JADX INFO: renamed from: d */
    public final int m207150d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f191200c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f191200c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f191200c = i4;
            byte[] bArr = this.f191198a;
            int i5 = this.f191199b;
            this.f191199b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f191198a;
        int i6 = this.f191199b;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.f191200c = 0;
            this.f191199b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        m207162p();
        return i9;
    }

    /* JADX INFO: renamed from: e */
    public final void m207151e() {
        if (this.f191200c == 0) {
            return;
        }
        this.f191200c = 0;
        this.f191199b++;
        m207162p();
    }

    /* JADX INFO: renamed from: f */
    public final void m207152f(int i, int i2) {
        int iMin = Math.min(8 - this.f191200c, 14);
        int i3 = this.f191200c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f191198a;
        int i5 = this.f191199b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        int i7 = i & 16383;
        bArr[i5] = (byte) (b | ((i7 >>> i6) << i4));
        int i8 = i5 + 1;
        while (true) {
            byte[] bArr2 = this.f191198a;
            if (i6 <= 8) {
                int i9 = 8 - i6;
                byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b2;
                bArr2[i8] = (byte) (((i7 & ((1 << i6) - 1)) << i9) | b2);
                m207159m(14);
                m207162p();
                return;
            }
            i6 -= 8;
            bArr2[i8] = (byte) (i7 >>> i6);
            i8++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m207153g(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.f191198a;
            int i5 = this.f191199b;
            int i6 = i5 + 1;
            this.f191199b = i6;
            byte b = bArr2[i5];
            int i7 = this.f191200c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b2);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.f191200c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f191198a;
            int i10 = this.f191199b;
            this.f191199b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.f191200c = i11;
        byte[] bArr4 = this.f191198a;
        int i12 = this.f191199b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.f191200c = 0;
            this.f191199b = i12 + 1;
        }
        m207162p();
    }

    /* JADX INFO: renamed from: h */
    public final void m207154h(byte[] bArr, int i, int i2) {
        f5v0.m119535f(this.f191200c == 0);
        System.arraycopy(this.f191198a, this.f191199b, bArr, 0, i2);
        this.f191199b += i2;
        m207162p();
    }

    /* JADX INFO: renamed from: i */
    public final void m207155i(v6w0 v6w0Var) {
        m207156j(v6w0Var.m197264m(), v6w0Var.m197271t());
        m207157k(v6w0Var.m197270s() * 8);
    }

    /* JADX INFO: renamed from: j */
    public final void m207156j(byte[] bArr, int i) {
        this.f191198a = bArr;
        this.f191199b = 0;
        this.f191200c = 0;
        this.f191201d = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m207157k(int i) {
        int i2 = i / 8;
        this.f191199b = i2;
        this.f191200c = i - (i2 * 8);
        m207162p();
    }

    /* JADX INFO: renamed from: l */
    public final void m207158l() {
        int i = this.f191200c + 1;
        this.f191200c = i;
        if (i == 8) {
            this.f191200c = 0;
            this.f191199b++;
        }
        m207162p();
    }

    /* JADX INFO: renamed from: m */
    public final void m207159m(int i) {
        int i2 = i / 8;
        int i3 = this.f191199b + i2;
        this.f191199b = i3;
        int i4 = this.f191200c + (i - (i2 * 8));
        this.f191200c = i4;
        if (i4 > 7) {
            this.f191199b = i3 + 1;
            this.f191200c = i4 - 8;
        }
        m207162p();
    }

    /* JADX INFO: renamed from: n */
    public final void m207160n(int i) {
        f5v0.m119535f(this.f191200c == 0);
        this.f191199b += i;
        m207162p();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m207161o() {
        int i = this.f191198a[this.f191199b] & (128 >> this.f191200c);
        m207158l();
        return i != 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m207162p() {
        int i;
        int i2 = this.f191199b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f191201d) || (i2 == i && this.f191200c == 0))) {
            z = true;
        }
        f5v0.m119535f(z);
    }

    public x5w0() {
        this.f191198a = ggw0.f102573f;
    }
}
