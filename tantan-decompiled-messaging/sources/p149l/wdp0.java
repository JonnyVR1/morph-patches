package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wdp0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f185824a;

    /* JADX INFO: renamed from: b */
    public final int f185825b;

    /* JADX INFO: renamed from: c */
    public int f185826c;

    /* JADX INFO: renamed from: d */
    public int f185827d;

    public wdp0(byte[] bArr) {
        this.f185824a = bArr;
        this.f185825b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final void m202777a() {
        int i;
        int i2 = this.f185826c;
        p11.m167013g(i2 >= 0 && (i2 < (i = this.f185825b) || (i2 == i && this.f185827d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m202778b() {
        return (this.f185826c * 8) + this.f185827d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m202779c() {
        boolean z = (((this.f185824a[this.f185826c] & 255) >> this.f185827d) & 1) == 1;
        m202781e(1);
        return z;
    }

    /* JADX INFO: renamed from: d */
    public int m202780d(int i) {
        int i2 = this.f185826c;
        int iMin = Math.min(i, 8 - this.f185827d);
        int i3 = i2 + 1;
        int i4 = ((this.f185824a[i2] & 255) >> this.f185827d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f185824a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m202781e(i);
        return i5;
    }

    /* JADX INFO: renamed from: e */
    public void m202781e(int i) {
        int i2 = i / 8;
        int i3 = this.f185826c + i2;
        this.f185826c = i3;
        int i4 = this.f185827d + (i - (i2 * 8));
        this.f185827d = i4;
        if (i4 > 7) {
            this.f185826c = i3 + 1;
            this.f185827d = i4 - 8;
        }
        m202777a();
    }
}
