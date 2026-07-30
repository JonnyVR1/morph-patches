package p153l;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class i2z0 {

    /* JADX INFO: renamed from: a */
    public final Random f112681a;

    /* JADX INFO: renamed from: b */
    public final int[] f112682b;

    /* JADX INFO: renamed from: c */
    public final int[] f112683c;

    public i2z0(int[] iArr, Random random) {
        this.f112682b = iArr;
        this.f112681a = random;
        this.f112683c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f112683c[iArr[i]] = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m138256a() {
        int[] iArr = this.f112682b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m138257b() {
        int[] iArr = this.f112682b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m138258c() {
        return this.f112682b.length;
    }

    /* JADX INFO: renamed from: d */
    public final int m138259d(int i) {
        int i2 = this.f112683c[i] + 1;
        int[] iArr = this.f112682b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m138260e(int i) {
        int i2 = this.f112683c[i] - 1;
        if (i2 >= 0) {
            return this.f112682b[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final i2z0 m138261f() {
        return new i2z0(0, new Random(this.f112681a.nextLong()));
    }

    /* JADX INFO: renamed from: g */
    public final i2z0 m138262g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f112681a.nextInt(this.f112682b.length + 1);
            int i5 = i4 + 1;
            int iNextInt = this.f112681a.nextInt(i5);
            iArr2[i4] = iArr2[iNextInt];
            iArr2[iNextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f112682b.length + i2];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f112682b;
            if (i3 >= iArr4.length + i2) {
                return new i2z0(iArr3, new Random(this.f112681a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= 0) {
                    iArr3[i3] = i9 + i2;
                }
                i7 = i8;
            } else {
                iArr3[i3] = iArr2[i6];
                i6++;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final i2z0 m138263h(int i, int i2) {
        int[] iArr = new int[this.f112682b.length - i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f112682b;
            if (i3 >= iArr2.length) {
                return new i2z0(iArr, new Random(this.f112681a.nextLong()));
            }
            int i5 = iArr2[i3];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i3 - i4;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr[i6] = i5;
            } else {
                i4++;
            }
            i3++;
        }
    }

    public i2z0(int i, Random random) {
        this(new int[0], random);
    }

    public i2z0(int i) {
        this(0, new Random());
    }
}
