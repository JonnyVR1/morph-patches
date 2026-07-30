package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rdk {

    /* JADX INFO: renamed from: a */
    public static rdk f162316a = new yod();

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:55:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m180859a(d13 d13Var, float[] fArr) throws NotFoundException {
        int iM113486m = d13Var.m113486m();
        int iM113483j = d13Var.m113483j();
        boolean z = true;
        for (int i = 0; i < fArr.length && z; i += 2) {
            int i2 = (int) fArr[i];
            int i3 = i + 1;
            int i4 = (int) fArr[i3];
            if (i2 < -1 || i2 > iM113486m || i4 < -1 || i4 > iM113483j) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i2 == -1) {
                fArr[i] = 0.0f;
            } else {
                if (i2 == iM113486m) {
                    fArr[i] = iM113486m - 1;
                } else {
                    z = false;
                }
                if (i4 == -1) {
                    fArr[i3] = 0.0f;
                } else {
                    if (i4 == iM113483j) {
                        fArr[i3] = iM113483j - 1;
                    }
                }
                z = true;
            }
            z = true;
            if (i4 == -1) {
                fArr[i3] = 0.0f;
            } else {
                if (i4 == iM113483j) {
                    fArr[i3] = iM113483j - 1;
                }
            }
            z = true;
        }
        boolean z2 = true;
        for (int length = fArr.length - 2; length >= 0 && z2; length -= 2) {
            int i5 = (int) fArr[length];
            int i6 = length + 1;
            int i7 = (int) fArr[i6];
            if (i5 < -1 || i5 > iM113486m || i7 < -1 || i7 > iM113483j) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i5 == -1) {
                fArr[length] = 0.0f;
            } else {
                if (i5 == iM113486m) {
                    fArr[length] = iM113486m - 1;
                } else {
                    z2 = false;
                }
                if (i7 == -1) {
                    fArr[i6] = 0.0f;
                } else {
                    if (i7 == iM113483j) {
                        fArr[i6] = iM113483j - 1;
                    }
                }
                z2 = true;
            }
            z2 = true;
            if (i7 == -1) {
                fArr[i6] = 0.0f;
            } else {
                if (i7 == iM113483j) {
                    fArr[i6] = iM113483j - 1;
                }
            }
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static rdk m180860b() {
        return f162316a;
    }

    /* JADX INFO: renamed from: c */
    public abstract d13 mo180861c(d13 d13Var, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    /* JADX INFO: renamed from: d */
    public abstract d13 mo180862d(d13 d13Var, int i, int i2, xw60 xw60Var) throws NotFoundException;
}
