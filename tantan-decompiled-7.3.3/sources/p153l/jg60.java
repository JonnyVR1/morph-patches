package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jg60 {

    /* JADX INFO: renamed from: a */
    public byte[] f120676a;

    /* JADX INFO: renamed from: b */
    public int f120677b;

    /* JADX INFO: renamed from: c */
    public int f120678c;

    /* JADX INFO: renamed from: d */
    public int f120679d;

    public jg60(byte[] bArr, int i, int i2) {
        m144767i(bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m144759a() {
        int i;
        int i2 = this.f120678c;
        w11.m204371g(i2 >= 0 && (i2 < (i = this.f120677b) || (i2 == i && this.f120679d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public boolean m144760b(int i) {
        int i2 = this.f120678c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f120679d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f120677b) {
                break;
            }
            if (m144768j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f120677b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    /* JADX INFO: renamed from: c */
    public boolean m144761c() {
        int i = this.f120678c;
        int i2 = this.f120679d;
        int i3 = 0;
        while (this.f120678c < this.f120677b && !m144762d()) {
            i3++;
        }
        boolean z = this.f120678c == this.f120677b;
        this.f120678c = i;
        this.f120679d = i2;
        return !z && m144760b((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: d */
    public boolean m144762d() {
        boolean z = (this.f120676a[this.f120678c] & (128 >> this.f120679d)) != 0;
        m144769k();
        return z;
    }

    /* JADX INFO: renamed from: e */
    public int m144763e(int i) {
        int i2;
        this.f120679d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f120679d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f120679d = i5;
            byte[] bArr = this.f120676a;
            int i6 = this.f120678c;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m144768j(i6 + 1)) {
                i4 = 1;
            }
            this.f120678c = i6 + i4;
        }
        byte[] bArr2 = this.f120676a;
        int i7 = this.f120678c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f120679d = 0;
            this.f120678c = i7 + (m144768j(i7 + 1) ? 2 : 1);
        }
        m144759a();
        return i8;
    }

    /* JADX INFO: renamed from: f */
    public final int m144764f() {
        int i = 0;
        while (!m144762d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m144763e(i) : 0);
    }

    /* JADX INFO: renamed from: g */
    public int m144765g() {
        int iM144764f = m144764f();
        return (iM144764f % 2 == 0 ? -1 : 1) * ((iM144764f + 1) / 2);
    }

    /* JADX INFO: renamed from: h */
    public int m144766h() {
        return m144764f();
    }

    /* JADX INFO: renamed from: i */
    public void m144767i(byte[] bArr, int i, int i2) {
        this.f120676a = bArr;
        this.f120678c = i;
        this.f120677b = i2;
        this.f120679d = 0;
        m144759a();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m144768j(int i) {
        if (2 > i || i >= this.f120677b) {
            return false;
        }
        byte[] bArr = this.f120676a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: k */
    public void m144769k() {
        int i = this.f120679d + 1;
        this.f120679d = i;
        if (i == 8) {
            this.f120679d = 0;
            int i2 = this.f120678c;
            this.f120678c = i2 + (m144768j(i2 + 1) ? 2 : 1);
        }
        m144759a();
    }

    /* JADX INFO: renamed from: l */
    public void m144770l(int i) {
        int i2 = this.f120678c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f120678c = i4;
        int i5 = this.f120679d + (i - (i3 * 8));
        this.f120679d = i5;
        if (i5 > 7) {
            this.f120678c = i4 + 1;
            this.f120679d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f120678c) {
                m144759a();
                return;
            } else if (m144768j(i2)) {
                this.f120678c++;
                i2 += 2;
            }
        }
    }
}
