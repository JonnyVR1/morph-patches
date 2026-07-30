package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class anp0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f72371a;

    /* JADX INFO: renamed from: b */
    public final int f72372b;

    /* JADX INFO: renamed from: c */
    public int f72373c;

    /* JADX INFO: renamed from: d */
    public int f72374d;

    public anp0(byte[] bArr) {
        this.f72371a = bArr;
        this.f72372b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final void m99022a() {
        int i;
        int i2 = this.f72373c;
        w11.m204371g(i2 >= 0 && (i2 < (i = this.f72372b) || (i2 == i && this.f72374d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m99023b() {
        return (this.f72373c * 8) + this.f72374d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m99024c() {
        boolean z = (((this.f72371a[this.f72373c] & 255) >> this.f72374d) & 1) == 1;
        m99026e(1);
        return z;
    }

    /* JADX INFO: renamed from: d */
    public int m99025d(int i) {
        int i2 = this.f72373c;
        int iMin = Math.min(i, 8 - this.f72374d);
        int i3 = i2 + 1;
        int i4 = ((this.f72371a[i2] & 255) >> this.f72374d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f72371a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m99026e(i);
        return i5;
    }

    /* JADX INFO: renamed from: e */
    public void m99026e(int i) {
        int i2 = i / 8;
        int i3 = this.f72373c + i2;
        this.f72373c = i3;
        int i4 = this.f72374d + (i - (i2 * 8));
        this.f72374d = i4;
        if (i4 > 7) {
            this.f72373c = i3 + 1;
            this.f72374d = i4 - 8;
        }
        m99022a();
    }
}
