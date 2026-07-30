package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class dfw0 {

    /* JADX INFO: renamed from: a */
    public byte[] f88231a;

    /* JADX INFO: renamed from: b */
    public int f88232b;

    /* JADX INFO: renamed from: c */
    public int f88233c;

    /* JADX INFO: renamed from: d */
    public int f88234d;

    public dfw0(byte[] bArr, int i) {
        this.f88231a = bArr;
        this.f88234d = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m115549a() {
        return ((this.f88234d - this.f88232b) * 8) - this.f88233c;
    }

    /* JADX INFO: renamed from: b */
    public final int m115550b() {
        lev0.m153958f(this.f88233c == 0);
        return this.f88232b;
    }

    /* JADX INFO: renamed from: c */
    public final int m115551c() {
        return (this.f88232b * 8) + this.f88233c;
    }

    /* JADX INFO: renamed from: d */
    public final int m115552d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f88233c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f88233c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f88233c = i4;
            byte[] bArr = this.f88231a;
            int i5 = this.f88232b;
            this.f88232b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f88231a;
        int i6 = this.f88232b;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.f88233c = 0;
            this.f88232b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        m115564p();
        return i9;
    }

    /* JADX INFO: renamed from: e */
    public final void m115553e() {
        if (this.f88233c == 0) {
            return;
        }
        this.f88233c = 0;
        this.f88232b++;
        m115564p();
    }

    /* JADX INFO: renamed from: f */
    public final void m115554f(int i, int i2) {
        int iMin = Math.min(8 - this.f88233c, 14);
        int i3 = this.f88233c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f88231a;
        int i5 = this.f88232b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        int i7 = i & 16383;
        bArr[i5] = (byte) (b | ((i7 >>> i6) << i4));
        int i8 = i5 + 1;
        while (true) {
            byte[] bArr2 = this.f88231a;
            if (i6 <= 8) {
                int i9 = 8 - i6;
                byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b2;
                bArr2[i8] = (byte) (((i7 & ((1 << i6) - 1)) << i9) | b2);
                m115561m(14);
                m115564p();
                return;
            }
            i6 -= 8;
            bArr2[i8] = (byte) (i7 >>> i6);
            i8++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m115555g(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.f88231a;
            int i5 = this.f88232b;
            int i6 = i5 + 1;
            this.f88232b = i6;
            byte b = bArr2[i5];
            int i7 = this.f88233c;
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
        int i9 = this.f88233c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f88231a;
            int i10 = this.f88232b;
            this.f88232b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.f88233c = i11;
        byte[] bArr4 = this.f88231a;
        int i12 = this.f88232b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.f88233c = 0;
            this.f88232b = i12 + 1;
        }
        m115564p();
    }

    /* JADX INFO: renamed from: h */
    public final void m115556h(byte[] bArr, int i, int i2) {
        lev0.m153958f(this.f88233c == 0);
        System.arraycopy(this.f88231a, this.f88232b, bArr, 0, i2);
        this.f88232b += i2;
        m115564p();
    }

    /* JADX INFO: renamed from: i */
    public final void m115557i(bgw0 bgw0Var) {
        m115558j(bgw0Var.m104271m(), bgw0Var.m104278t());
        m115559k(bgw0Var.m104277s() * 8);
    }

    /* JADX INFO: renamed from: j */
    public final void m115558j(byte[] bArr, int i) {
        this.f88231a = bArr;
        this.f88232b = 0;
        this.f88233c = 0;
        this.f88234d = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m115559k(int i) {
        int i2 = i / 8;
        this.f88232b = i2;
        this.f88233c = i - (i2 * 8);
        m115564p();
    }

    /* JADX INFO: renamed from: l */
    public final void m115560l() {
        int i = this.f88233c + 1;
        this.f88233c = i;
        if (i == 8) {
            this.f88233c = 0;
            this.f88232b++;
        }
        m115564p();
    }

    /* JADX INFO: renamed from: m */
    public final void m115561m(int i) {
        int i2 = i / 8;
        int i3 = this.f88232b + i2;
        this.f88232b = i3;
        int i4 = this.f88233c + (i - (i2 * 8));
        this.f88233c = i4;
        if (i4 > 7) {
            this.f88232b = i3 + 1;
            this.f88233c = i4 - 8;
        }
        m115564p();
    }

    /* JADX INFO: renamed from: n */
    public final void m115562n(int i) {
        lev0.m153958f(this.f88233c == 0);
        this.f88232b += i;
        m115564p();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m115563o() {
        int i = this.f88231a[this.f88232b] & (128 >> this.f88233c);
        m115560l();
        return i != 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m115564p() {
        int i;
        int i2 = this.f88232b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f88234d) || (i2 == i && this.f88233c == 0))) {
            z = true;
        }
        lev0.m153958f(z);
    }

    public dfw0() {
        this.f88231a = mpw0.f137962f;
    }
}
