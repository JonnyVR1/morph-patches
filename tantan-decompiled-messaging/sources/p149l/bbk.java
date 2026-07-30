package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bbk {

    /* JADX INFO: renamed from: a */
    public static bbk f74850a = new tnd();

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:55:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m100978a(o03 o03Var, float[] fArr) throws NotFoundException {
        int iM162116m = o03Var.m162116m();
        int iM162113j = o03Var.m162113j();
        boolean z = true;
        for (int i = 0; i < fArr.length && z; i += 2) {
            int i2 = (int) fArr[i];
            int i3 = i + 1;
            int i4 = (int) fArr[i3];
            if (i2 < -1 || i2 > iM162116m || i4 < -1 || i4 > iM162113j) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i2 == -1) {
                fArr[i] = 0.0f;
            } else {
                if (i2 == iM162116m) {
                    fArr[i] = iM162116m - 1;
                } else {
                    z = false;
                }
                if (i4 == -1) {
                    fArr[i3] = 0.0f;
                } else {
                    if (i4 == iM162113j) {
                        fArr[i3] = iM162113j - 1;
                    }
                }
                z = true;
            }
            z = true;
            if (i4 == -1) {
                fArr[i3] = 0.0f;
            } else {
                if (i4 == iM162113j) {
                    fArr[i3] = iM162113j - 1;
                }
            }
            z = true;
        }
        boolean z2 = true;
        for (int length = fArr.length - 2; length >= 0 && z2; length -= 2) {
            int i5 = (int) fArr[length];
            int i6 = length + 1;
            int i7 = (int) fArr[i6];
            if (i5 < -1 || i5 > iM162116m || i7 < -1 || i7 > iM162113j) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i5 == -1) {
                fArr[length] = 0.0f;
            } else {
                if (i5 == iM162116m) {
                    fArr[length] = iM162116m - 1;
                } else {
                    z2 = false;
                }
                if (i7 == -1) {
                    fArr[i6] = 0.0f;
                } else {
                    if (i7 == iM162113j) {
                        fArr[i6] = iM162113j - 1;
                    }
                }
                z2 = true;
            }
            z2 = true;
            if (i7 == -1) {
                fArr[i6] = 0.0f;
            } else {
                if (i7 == iM162113j) {
                    fArr[i6] = iM162113j - 1;
                }
            }
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static bbk m100979b() {
        return f74850a;
    }

    /* JADX INFO: renamed from: c */
    public abstract o03 mo100980c(o03 o03Var, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    /* JADX INFO: renamed from: d */
    public abstract o03 mo100981d(o03 o03Var, int i, int i2, ro60 ro60Var) throws NotFoundException;
}
