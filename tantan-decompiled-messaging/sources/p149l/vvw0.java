package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class vvw0 {

    /* JADX INFO: renamed from: a */
    public byte[] f183272a;

    /* JADX INFO: renamed from: b */
    public int f183273b;

    /* JADX INFO: renamed from: c */
    public int f183274c;

    /* JADX INFO: renamed from: d */
    public int f183275d = 0;

    public vvw0(byte[] bArr, int i, int i2) {
        this.f183272a = bArr;
        this.f183274c = i;
        this.f183273b = i2;
        m200219h();
    }

    /* JADX INFO: renamed from: a */
    public final int m200212a(int i) {
        int i2;
        this.f183275d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f183275d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f183275d = i5;
            byte[] bArr = this.f183272a;
            int i6 = this.f183274c;
            i3 |= (bArr[i6] & 255) << i5;
            if (true != m200220i(i6 + 1)) {
                i4 = 1;
            }
            this.f183274c = i6 + i4;
        }
        byte[] bArr2 = this.f183272a;
        int i7 = this.f183274c;
        int i8 = i3 | ((bArr2[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.f183275d = 0;
            this.f183274c = i7 + (true != m200220i(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        m200219h();
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public final int m200213b() {
        int iM200218g = m200218g();
        return (iM200218g % 2 == 0 ? -1 : 1) * ((iM200218g + 1) / 2);
    }

    /* JADX INFO: renamed from: c */
    public final int m200214c() {
        return m200218g();
    }

    /* JADX INFO: renamed from: d */
    public final void m200215d() {
        int i = this.f183275d + 1;
        this.f183275d = i;
        if (i == 8) {
            this.f183275d = 0;
            int i2 = this.f183274c;
            this.f183274c = i2 + (true == m200220i(i2 + 1) ? 2 : 1);
        }
        m200219h();
    }

    /* JADX INFO: renamed from: e */
    public final void m200216e(int i) {
        int i2 = this.f183274c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f183274c = i4;
        int i5 = this.f183275d + (i - (i3 * 8));
        this.f183275d = i5;
        if (i5 > 7) {
            this.f183274c = i4 + 1;
            this.f183275d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f183274c) {
                m200219h();
                return;
            } else if (m200220i(i2)) {
                this.f183274c++;
                i2 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m200217f() {
        int i = this.f183272a[this.f183274c] & (128 >> this.f183275d);
        m200215d();
        return i != 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m200218g() {
        int i = 0;
        while (!m200217f()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m200212a(i) : 0);
    }

    /* JADX INFO: renamed from: h */
    public final void m200219h() {
        int i;
        int i2 = this.f183274c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f183273b) || (i2 == i && this.f183275d == 0))) {
            z = true;
        }
        f5v0.m119535f(z);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m200220i(int i) {
        if (i < 2 || i >= this.f183273b) {
            return false;
        }
        byte[] bArr = this.f183272a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }
}
