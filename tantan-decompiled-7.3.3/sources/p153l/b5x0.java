package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class b5x0 {

    /* JADX INFO: renamed from: a */
    public byte[] f75113a;

    /* JADX INFO: renamed from: b */
    public int f75114b;

    /* JADX INFO: renamed from: c */
    public int f75115c;

    /* JADX INFO: renamed from: d */
    public int f75116d = 0;

    public b5x0(byte[] bArr, int i, int i2) {
        this.f75113a = bArr;
        this.f75115c = i;
        this.f75114b = i2;
        m102674h();
    }

    /* JADX INFO: renamed from: a */
    public final int m102667a(int i) {
        int i2;
        this.f75116d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f75116d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f75116d = i5;
            byte[] bArr = this.f75113a;
            int i6 = this.f75115c;
            i3 |= (bArr[i6] & 255) << i5;
            if (true != m102675i(i6 + 1)) {
                i4 = 1;
            }
            this.f75115c = i6 + i4;
        }
        byte[] bArr2 = this.f75113a;
        int i7 = this.f75115c;
        int i8 = i3 | ((bArr2[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.f75116d = 0;
            this.f75115c = i7 + (true != m102675i(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        m102674h();
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public final int m102668b() {
        int iM102673g = m102673g();
        return (iM102673g % 2 == 0 ? -1 : 1) * ((iM102673g + 1) / 2);
    }

    /* JADX INFO: renamed from: c */
    public final int m102669c() {
        return m102673g();
    }

    /* JADX INFO: renamed from: d */
    public final void m102670d() {
        int i = this.f75116d + 1;
        this.f75116d = i;
        if (i == 8) {
            this.f75116d = 0;
            int i2 = this.f75115c;
            this.f75115c = i2 + (true == m102675i(i2 + 1) ? 2 : 1);
        }
        m102674h();
    }

    /* JADX INFO: renamed from: e */
    public final void m102671e(int i) {
        int i2 = this.f75115c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f75115c = i4;
        int i5 = this.f75116d + (i - (i3 * 8));
        this.f75116d = i5;
        if (i5 > 7) {
            this.f75115c = i4 + 1;
            this.f75116d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f75115c) {
                m102674h();
                return;
            } else if (m102675i(i2)) {
                this.f75115c++;
                i2 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m102672f() {
        int i = this.f75113a[this.f75115c] & (128 >> this.f75116d);
        m102670d();
        return i != 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m102673g() {
        int i = 0;
        while (!m102672f()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m102667a(i) : 0);
    }

    /* JADX INFO: renamed from: h */
    public final void m102674h() {
        int i;
        int i2 = this.f75115c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f75114b) || (i2 == i && this.f75116d == 0))) {
            z = true;
        }
        lev0.m153958f(z);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m102675i(int i) {
        if (i < 2 || i >= this.f75114b) {
            return false;
        }
        byte[] bArr = this.f75113a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }
}
