package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class o7r0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f142532a;

    /* JADX INFO: renamed from: b */
    public final int f142533b;

    /* JADX INFO: renamed from: c */
    public int f142534c;

    /* JADX INFO: renamed from: d */
    public int f142535d;

    public o7r0(byte[] bArr) {
        this.f142532a = bArr;
        this.f142533b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m163038a() {
        return (this.f142534c * 8) + this.f142535d;
    }

    /* JADX INFO: renamed from: b */
    public final int m163039b(int i) {
        int i2 = this.f142534c;
        int i3 = 8 - this.f142535d;
        int i4 = i2 + 1;
        byte[] bArr = this.f142532a;
        int iMin = Math.min(i, i3);
        int i5 = ((bArr[i2] & 255) >> this.f142535d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i5 |= (this.f142532a[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        m163040c(i);
        return i6;
    }

    /* JADX INFO: renamed from: c */
    public final void m163040c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f142534c + i3;
        this.f142534c = i4;
        int i5 = this.f142535d + (i - (i3 * 8));
        this.f142535d = i5;
        if (i5 > 7) {
            i4++;
            this.f142534c = i4;
            i5 -= 8;
            this.f142535d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f142533b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        f5v0.m119535f(z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m163041d() {
        int i = (this.f142532a[this.f142534c] & 255) >> this.f142535d;
        m163040c(1);
        return 1 == (i & 1);
    }
}
