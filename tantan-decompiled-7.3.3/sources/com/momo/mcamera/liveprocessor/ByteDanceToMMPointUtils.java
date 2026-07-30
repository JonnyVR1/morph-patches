package com.momo.mcamera.liveprocessor;

/* JADX INFO: loaded from: classes6.dex */
public class ByteDanceToMMPointUtils {
    static int[] LANDMARK_ORDER_96 = {18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 34, 33, 32, 31, 30, 29, 38, 37, 36, 35, 24, 23, 22, 21, 20, 19, 28, 27, 26, 25, 57, 56, 55, 54, 53, 52, 51, 62, 61, 60, 59, 58, 45, 44, 43, 42, 41, 40, 39, 50, 49, 48, 47, 46, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 75, 82, 81, 80, 79, 78, 77, 76, 87, 86, 85, 84, 83, 92, 91, 90, 89, 88, 95, 94, 93};

    private static float[] rotationFlip(float[] fArr, float f, boolean z, float f2, float f3, float f4) {
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length / 2;
        for (int i = 0; i < length; i++) {
            float f5 = fArr[i] / f4;
            int i2 = i + length;
            float f6 = fArr[i2] / f4;
            if (z) {
                f5 = f3 - f5;
            }
            if (f == 90.0f) {
                fArr2[i] = f2 - f6;
                fArr2[i2] = f5;
            } else if (f == 180.0f) {
                fArr2[i] = f2 - f5;
                fArr2[i2] = f3 - f6;
            } else if (f == 270.0f) {
                fArr2[i] = f6;
                fArr2[i2] = f3 - f5;
            }
        }
        return fArr2;
    }

    public static float[] transByteFaceRectToOriginFaceRect(float[] fArr, int i, boolean z, int i2, int i3, float f) {
        float[] fArrRotationFlip = rotationFlip(fArr, i, z, i2, i3, f);
        if (z) {
            float f2 = fArrRotationFlip[0];
            fArrRotationFlip[0] = fArrRotationFlip[2];
            fArrRotationFlip[2] = f2;
        }
        return fArrRotationFlip;
    }

    public static float[] transBytePoint96ToOriginal96(float[] fArr, int i, boolean z, int i2, int i3, float f) {
        int length = fArr.length / 2;
        float[] fArrRotationFlip = rotationFlip(fArr, i, z, i2, i3, f);
        if (!z) {
            return fArrRotationFlip;
        }
        float[] fArr2 = new float[length * 2];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = LANDMARK_ORDER_96[i4];
            fArr2[i4] = fArrRotationFlip[i5];
            fArr2[i4 + length] = fArrRotationFlip[i5 + length];
        }
        return fArr2;
    }
}
