package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class yod extends rdk {
    @Override // p153l.rdk
    /* JADX INFO: renamed from: c */
    public d13 mo180861c(d13 d13Var, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return mo180862d(d13Var, i, i2, xw60.m213293b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p153l.rdk
    /* JADX INFO: renamed from: d */
    public d13 mo180862d(d13 d13Var, int i, int i2, xw60 xw60Var) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        d13 d13Var2 = new d13(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            xw60Var.m213298f(fArr);
            rdk.m180859a(d13Var, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (d13Var.m113480d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        d13Var2.m113488o(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return d13Var2;
    }
}
