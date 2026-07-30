package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class h13 {

    /* JADX INFO: renamed from: a */
    public final byte[] f107399a;

    /* JADX INFO: renamed from: b */
    public int f107400b;

    /* JADX INFO: renamed from: c */
    public int f107401c;

    public h13(byte[] bArr) {
        this.f107399a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public int m133269a() {
        return ((this.f107399a.length - this.f107400b) * 8) - this.f107401c;
    }

    /* JADX INFO: renamed from: b */
    public int m133270b() {
        return this.f107401c;
    }

    /* JADX INFO: renamed from: c */
    public int m133271c() {
        return this.f107400b;
    }

    /* JADX INFO: renamed from: d */
    public int m133272d(int i) {
        if (i <= 0 || i > 32 || i > m133269a()) {
            wg3.m206174a(String.valueOf(i));
            return 0;
        }
        int i2 = this.f107401c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            byte[] bArr = this.f107399a;
            int i7 = this.f107400b;
            int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
            i -= i5;
            int i9 = i2 + i5;
            this.f107401c = i9;
            if (i9 == 8) {
                this.f107401c = 0;
                this.f107400b = i7 + 1;
            }
            i3 = i8;
        }
        if (i > 0) {
            while (i >= 8) {
                int i10 = i3 << 8;
                byte[] bArr2 = this.f107399a;
                int i11 = this.f107400b;
                i3 = (bArr2[i11] & 255) | i10;
                this.f107400b = i11 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i12 = 8 - i;
                int i13 = ((((255 >> i12) << i12) & this.f107399a[this.f107400b]) >> i12) | (i3 << i);
                this.f107401c += i;
                return i13;
            }
        }
        return i3;
    }
}
