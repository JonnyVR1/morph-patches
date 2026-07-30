package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class rpd {

    /* JADX INFO: renamed from: a */
    public final CharSequence f160492a;

    /* JADX INFO: renamed from: b */
    public final int f160493b;

    /* JADX INFO: renamed from: c */
    public final int f160494c;

    /* JADX INFO: renamed from: d */
    public final byte[] f160495d;

    public rpd(CharSequence charSequence, int i, int i2) {
        this.f160492a = charSequence;
        this.f160494c = i;
        this.f160493b = i2;
        byte[] bArr = new byte[i * i2];
        this.f160495d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* JADX INFO: renamed from: a */
    public final void m180316a(int i) {
        m180322g(this.f160493b - 1, 0, i, 1);
        m180322g(this.f160493b - 1, 1, i, 2);
        m180322g(this.f160493b - 1, 2, i, 3);
        m180322g(0, this.f160494c - 2, i, 4);
        m180322g(0, this.f160494c - 1, i, 5);
        m180322g(1, this.f160494c - 1, i, 6);
        m180322g(2, this.f160494c - 1, i, 7);
        m180322g(3, this.f160494c - 1, i, 8);
    }

    /* JADX INFO: renamed from: b */
    public final void m180317b(int i) {
        m180322g(this.f160493b - 3, 0, i, 1);
        m180322g(this.f160493b - 2, 0, i, 2);
        m180322g(this.f160493b - 1, 0, i, 3);
        m180322g(0, this.f160494c - 4, i, 4);
        m180322g(0, this.f160494c - 3, i, 5);
        m180322g(0, this.f160494c - 2, i, 6);
        m180322g(0, this.f160494c - 1, i, 7);
        m180322g(1, this.f160494c - 1, i, 8);
    }

    /* JADX INFO: renamed from: c */
    public final void m180318c(int i) {
        m180322g(this.f160493b - 3, 0, i, 1);
        m180322g(this.f160493b - 2, 0, i, 2);
        m180322g(this.f160493b - 1, 0, i, 3);
        m180322g(0, this.f160494c - 2, i, 4);
        m180322g(0, this.f160494c - 1, i, 5);
        m180322g(1, this.f160494c - 1, i, 6);
        m180322g(2, this.f160494c - 1, i, 7);
        m180322g(3, this.f160494c - 1, i, 8);
    }

    /* JADX INFO: renamed from: d */
    public final void m180319d(int i) {
        m180322g(this.f160493b - 1, 0, i, 1);
        m180322g(this.f160493b - 1, this.f160494c - 1, i, 2);
        m180322g(0, this.f160494c - 3, i, 3);
        m180322g(0, this.f160494c - 2, i, 4);
        m180322g(0, this.f160494c - 1, i, 5);
        m180322g(1, this.f160494c - 3, i, 6);
        m180322g(1, this.f160494c - 2, i, 7);
        m180322g(1, this.f160494c - 1, i, 8);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m180320e(int i, int i2) {
        return this.f160495d[(i2 * this.f160494c) + i] == 1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m180321f(int i, int i2) {
        return this.f160495d[(i2 * this.f160494c) + i] >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m180322g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f160493b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f160494c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        m180324i(i2, i, (this.f160492a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    /* JADX INFO: renamed from: h */
    public final void m180323h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f160493b && i3 == 0) {
                m180316a(i4);
                i4++;
            }
            if (i5 == this.f160493b - 2 && i3 == 0 && this.f160494c % 4 != 0) {
                m180317b(i4);
                i4++;
            }
            if (i5 == this.f160493b - 2 && i3 == 0 && this.f160494c % 8 == 4) {
                m180318c(i4);
                i4++;
            }
            if (i5 == this.f160493b + 4 && i3 == 2 && this.f160494c % 8 == 0) {
                m180319d(i4);
                i4++;
            }
            while (true) {
                if (i5 < this.f160493b && i3 >= 0 && !m180321f(i3, i5)) {
                    m180325j(i5, i3, i4);
                    i4++;
                }
                int i6 = i5 - 2;
                int i7 = i3 + 2;
                if (i6 < 0 || i7 >= this.f160494c) {
                    break;
                }
                i5 = i6;
                i3 = i7;
            }
            int i8 = i5 - 1;
            int i9 = i3 + 5;
            while (true) {
                if (i8 >= 0 && i9 < this.f160494c && !m180321f(i9, i8)) {
                    m180325j(i8, i9, i4);
                    i4++;
                }
                int i10 = i8 + 2;
                int i11 = i9 - 2;
                i = this.f160493b;
                if (i10 >= i || i11 < 0) {
                    break;
                }
                i8 = i10;
                i9 = i11;
            }
            i5 = i8 + 5;
            i3 = i9 - 1;
            if (i5 >= i && i3 >= (i2 = this.f160494c)) {
                break;
            }
        }
        if (m180321f(i2 - 1, i - 1)) {
            return;
        }
        m180324i(this.f160494c - 1, this.f160493b - 1, true);
        m180324i(this.f160494c - 2, this.f160493b - 2, true);
    }

    /* JADX INFO: renamed from: i */
    public final void m180324i(int i, int i2, boolean z) {
        this.f160495d[(i2 * this.f160494c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m180325j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m180322g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m180322g(i4, i6, i3, 2);
        int i7 = i - 1;
        m180322g(i7, i5, i3, 3);
        m180322g(i7, i6, i3, 4);
        m180322g(i7, i2, i3, 5);
        m180322g(i, i5, i3, 6);
        m180322g(i, i6, i3, 7);
        m180322g(i, i2, i3, 8);
    }
}
