package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ugr0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f178926a;

    /* JADX INFO: renamed from: b */
    public final int f178927b;

    /* JADX INFO: renamed from: c */
    public int f178928c;

    /* JADX INFO: renamed from: d */
    public int f178929d;

    public ugr0(byte[] bArr) {
        this.f178926a = bArr;
        this.f178927b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m195935a() {
        return (this.f178928c * 8) + this.f178929d;
    }

    /* JADX INFO: renamed from: b */
    public final int m195936b(int i) {
        int i2 = this.f178928c;
        int i3 = 8 - this.f178929d;
        int i4 = i2 + 1;
        byte[] bArr = this.f178926a;
        int iMin = Math.min(i, i3);
        int i5 = ((bArr[i2] & 255) >> this.f178929d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i5 |= (this.f178926a[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        m195937c(i);
        return i6;
    }

    /* JADX INFO: renamed from: c */
    public final void m195937c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f178928c + i3;
        this.f178928c = i4;
        int i5 = this.f178929d + (i - (i3 * 8));
        this.f178929d = i5;
        if (i5 > 7) {
            i4++;
            this.f178928c = i4;
            i5 -= 8;
            this.f178929d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f178927b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        lev0.m153958f(z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m195938d() {
        int i = (this.f178926a[this.f178928c] & 255) >> this.f178929d;
        m195937c(1);
        return 1 == (i & 1);
    }
}
