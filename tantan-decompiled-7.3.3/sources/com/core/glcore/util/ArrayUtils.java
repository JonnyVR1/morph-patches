package com.core.glcore.util;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class ArrayUtils {
    public static float[][] bunshin(float[][] fArr) {
        if (fArr == null || fArr.length == 0) {
            return null;
        }
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr.length, fArr[0].length);
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = bunshin(fArr[i]);
        }
        return fArr2;
    }

    public static float[][] bunshin(float[][] fArr, int i) {
        if (fArr == null || fArr.length == 0) {
            return null;
        }
        int[] iArr = {fArr.length, i};
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, iArr);
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = bunshin(fArr[i2]);
        }
        return fArr2;
    }

    public static byte[] bunshin(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static float[] bunshin(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        float[] fArr2 = new float[fArr.length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        return fArr2;
    }

    public static int[] bunshin(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }
}
