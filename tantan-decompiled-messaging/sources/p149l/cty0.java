package p149l;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class cty0 {

    /* JADX INFO: renamed from: a */
    public final Random f82514a;

    /* JADX INFO: renamed from: b */
    public final int[] f82515b;

    /* JADX INFO: renamed from: c */
    public final int[] f82516c;

    public cty0(int[] iArr, Random random) {
        this.f82515b = iArr;
        this.f82514a = random;
        this.f82516c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f82516c[iArr[i]] = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m108710a() {
        int[] iArr = this.f82515b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m108711b() {
        int[] iArr = this.f82515b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m108712c() {
        return this.f82515b.length;
    }

    /* JADX INFO: renamed from: d */
    public final int m108713d(int i) {
        int i2 = this.f82516c[i] + 1;
        int[] iArr = this.f82515b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m108714e(int i) {
        int i2 = this.f82516c[i] - 1;
        if (i2 >= 0) {
            return this.f82515b[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final cty0 m108715f() {
        return new cty0(0, new Random(this.f82514a.nextLong()));
    }

    /* JADX INFO: renamed from: g */
    public final cty0 m108716g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f82514a.nextInt(this.f82515b.length + 1);
            int i5 = i4 + 1;
            int iNextInt = this.f82514a.nextInt(i5);
            iArr2[i4] = iArr2[iNextInt];
            iArr2[iNextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f82515b.length + i2];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f82515b;
            if (i3 >= iArr4.length + i2) {
                return new cty0(iArr3, new Random(this.f82514a.nextLong()));
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
    public final cty0 m108717h(int i, int i2) {
        int[] iArr = new int[this.f82515b.length - i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f82515b;
            if (i3 >= iArr2.length) {
                return new cty0(iArr, new Random(this.f82514a.nextLong()));
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

    public cty0(int i, Random random) {
        this(new int[0], random);
    }

    public cty0(int i) {
        this(0, new Random());
    }
}
