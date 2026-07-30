package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class s03 {

    /* JADX INFO: renamed from: a */
    public final byte[] f161716a;

    /* JADX INFO: renamed from: b */
    public int f161717b;

    /* JADX INFO: renamed from: c */
    public int f161718c;

    public s03(byte[] bArr) {
        this.f161716a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public int m181813a() {
        return ((this.f161716a.length - this.f161717b) * 8) - this.f161718c;
    }

    /* JADX INFO: renamed from: b */
    public int m181814b() {
        return this.f161718c;
    }

    /* JADX INFO: renamed from: c */
    public int m181815c() {
        return this.f161717b;
    }

    /* JADX INFO: renamed from: d */
    public int m181816d(int i) {
        if (i <= 0 || i > 32 || i > m181813a()) {
            ig3.m135964a(String.valueOf(i));
            return 0;
        }
        int i2 = this.f161718c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            byte[] bArr = this.f161716a;
            int i7 = this.f161717b;
            int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
            i -= i5;
            int i9 = i2 + i5;
            this.f161718c = i9;
            if (i9 == 8) {
                this.f161718c = 0;
                this.f161717b = i7 + 1;
            }
            i3 = i8;
        }
        if (i > 0) {
            while (i >= 8) {
                int i10 = i3 << 8;
                byte[] bArr2 = this.f161716a;
                int i11 = this.f161717b;
                i3 = (bArr2[i11] & 255) | i10;
                this.f161717b = i11 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i12 = 8 - i;
                int i13 = ((((255 >> i12) << i12) & this.f161716a[this.f161717b]) >> i12) | (i3 << i);
                this.f161718c += i;
                return i13;
            }
        }
        return i3;
    }
}
