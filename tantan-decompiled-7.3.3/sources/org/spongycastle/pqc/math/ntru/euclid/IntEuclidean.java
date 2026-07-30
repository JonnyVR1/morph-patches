package org.spongycastle.pqc.math.ntru.euclid;

/* JADX INFO: loaded from: classes3.dex */
public class IntEuclidean {
    public int gcd;

    /* JADX INFO: renamed from: x */
    public int f207931x;

    /* JADX INFO: renamed from: y */
    public int f207932y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i, int i2) {
        int i3 = 0;
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        int i7 = 1;
        int i8 = 0;
        while (i5 != 0) {
            int i9 = i4 / i5;
            int i10 = i4 % i5;
            int i11 = i7 - (i9 * i8);
            i4 = i5;
            i5 = i10;
            int i12 = i6;
            i6 = i3 - (i9 * i6);
            i3 = i12;
            i7 = i8;
            i8 = i11;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.f207931x = i7;
        intEuclidean.f207932y = i3;
        intEuclidean.gcd = i4;
        return intEuclidean;
    }
}
