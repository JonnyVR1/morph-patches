package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class tnd extends bbk {
    @Override // p149l.bbk
    /* JADX INFO: renamed from: c */
    public o03 mo100980c(o03 o03Var, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return mo100981d(o03Var, i, i2, ro60.m180234b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p149l.bbk
    /* JADX INFO: renamed from: d */
    public o03 mo100981d(o03 o03Var, int i, int i2, ro60 ro60Var) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        o03 o03Var2 = new o03(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            ro60Var.m180239f(fArr);
            bbk.m100978a(o03Var, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (o03Var.m162110d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        o03Var2.m162118o(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return o03Var2;
    }
}
