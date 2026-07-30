package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e860 {

    /* JADX INFO: renamed from: a */
    public byte[] f89805a;

    /* JADX INFO: renamed from: b */
    public int f89806b;

    /* JADX INFO: renamed from: c */
    public int f89807c;

    /* JADX INFO: renamed from: d */
    public int f89808d;

    public e860(byte[] bArr, int i, int i2) {
        m115251i(bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m115243a() {
        int i;
        int i2 = this.f89807c;
        p11.m167013g(i2 >= 0 && (i2 < (i = this.f89806b) || (i2 == i && this.f89808d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public boolean m115244b(int i) {
        int i2 = this.f89807c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f89808d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f89806b) {
                break;
            }
            if (m115252j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f89806b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    /* JADX INFO: renamed from: c */
    public boolean m115245c() {
        int i = this.f89807c;
        int i2 = this.f89808d;
        int i3 = 0;
        while (this.f89807c < this.f89806b && !m115246d()) {
            i3++;
        }
        boolean z = this.f89807c == this.f89806b;
        this.f89807c = i;
        this.f89808d = i2;
        return !z && m115244b((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: d */
    public boolean m115246d() {
        boolean z = (this.f89805a[this.f89807c] & (128 >> this.f89808d)) != 0;
        m115253k();
        return z;
    }

    /* JADX INFO: renamed from: e */
    public int m115247e(int i) {
        int i2;
        this.f89808d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f89808d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f89808d = i5;
            byte[] bArr = this.f89805a;
            int i6 = this.f89807c;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m115252j(i6 + 1)) {
                i4 = 1;
            }
            this.f89807c = i6 + i4;
        }
        byte[] bArr2 = this.f89805a;
        int i7 = this.f89807c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f89808d = 0;
            this.f89807c = i7 + (m115252j(i7 + 1) ? 2 : 1);
        }
        m115243a();
        return i8;
    }

    /* JADX INFO: renamed from: f */
    public final int m115248f() {
        int i = 0;
        while (!m115246d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m115247e(i) : 0);
    }

    /* JADX INFO: renamed from: g */
    public int m115249g() {
        int iM115248f = m115248f();
        return (iM115248f % 2 == 0 ? -1 : 1) * ((iM115248f + 1) / 2);
    }

    /* JADX INFO: renamed from: h */
    public int m115250h() {
        return m115248f();
    }

    /* JADX INFO: renamed from: i */
    public void m115251i(byte[] bArr, int i, int i2) {
        this.f89805a = bArr;
        this.f89807c = i;
        this.f89806b = i2;
        this.f89808d = 0;
        m115243a();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m115252j(int i) {
        if (2 > i || i >= this.f89806b) {
            return false;
        }
        byte[] bArr = this.f89805a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: k */
    public void m115253k() {
        int i = this.f89808d + 1;
        this.f89808d = i;
        if (i == 8) {
            this.f89808d = 0;
            int i2 = this.f89807c;
            this.f89807c = i2 + (m115252j(i2 + 1) ? 2 : 1);
        }
        m115243a();
    }

    /* JADX INFO: renamed from: l */
    public void m115254l(int i) {
        int i2 = this.f89807c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f89807c = i4;
        int i5 = this.f89808d + (i - (i3 * 8));
        this.f89808d = i5;
        if (i5 > 7) {
            this.f89807c = i4 + 1;
            this.f89808d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f89807c) {
                m115243a();
                return;
            } else if (m115252j(i2)) {
                this.f89807c++;
                i2 += 2;
            }
        }
    }
}
