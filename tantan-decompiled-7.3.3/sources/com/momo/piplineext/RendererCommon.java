package com.momo.piplineext;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes8.dex */
public class RendererCommon {

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* JADX INFO: renamed from: a */
    public static Matrix m20766a(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }
}
