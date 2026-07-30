package com.momo.mcamera.util;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes7.dex */
public class ImageProcessUtil {
    public static void transformLandMark104Points(float[] fArr, float[] fArr2) {
        float f;
        float f2;
        if (fArr2 == null || fArr2.length == 0) {
            return;
        }
        PointF pointF = new PointF(fArr2[0], fArr2[104]);
        PointF pointF2 = new PointF(fArr2[18], fArr2[122]);
        PointF pointF3 = new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        for (int i = 0; i < 18; i++) {
            int i2 = i + 104;
            PointF pointF4 = new PointF(fArr2[i], fArr2[i2]);
            if (i < 9) {
                f2 = i;
            } else {
                if (i > 9) {
                    f2 = 18.0f - i;
                } else {
                    f = 1.0f;
                }
                float f3 = 1.0f - f;
                fArr[i] = (pointF3.x * f3) + (pointF4.x * f);
                fArr[i2] = (f3 * pointF3.y) + (f * pointF4.y);
            }
            f = ((1.0f - (f2 / 8.0f)) * 0.12f) + 1.0f;
            float f4 = 1.0f - f;
            fArr[i] = (pointF3.x * f4) + (pointF4.x * f);
            fArr[i2] = (f4 * pointF3.y) + (f * pointF4.y);
        }
    }
}
