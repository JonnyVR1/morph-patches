package com.momo.mcamera.mask;

import android.opengl.GLES10;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class Sphere {
    public void draw() {
        char c = 2;
        char c2 = 1;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 32, 3);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * fArr[0].length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        int i = 32884;
        GLES10.glEnableClientState(32884);
        int i2 = 32885;
        GLES10.glEnableClientState(32885);
        float f = -90.0f;
        while (f < 90.0f) {
            double d = 3.141592653589793d;
            double d2 = 180.0d;
            double d3 = (((double) f) * 3.141592653589793d) / 180.0d;
            char c3 = c;
            float[][] fArr2 = fArr;
            float fCos = (float) Math.cos(d3);
            f += 30.0f;
            char c4 = c2;
            double d4 = (((double) f) * 3.141592653589793d) / 180.0d;
            int i3 = i;
            int i4 = i2;
            float fCos2 = (float) Math.cos(d4);
            float fSin = (float) Math.sin(d3);
            float fSin2 = (float) Math.sin(d4);
            float f2 = 0.0f;
            int i5 = 0;
            while (true) {
                double d5 = d;
                if (f2 <= 360.0f) {
                    double d6 = d2;
                    double d7 = (((double) f2) * d5) / d6;
                    float fCos3 = (float) Math.cos(d7);
                    float f3 = -((float) Math.sin(d7));
                    float[] fArr3 = fArr2[i5];
                    fArr3[0] = fCos2 * fCos3;
                    fArr3[c4] = fSin2;
                    fArr3[c3] = fCos2 * f3;
                    int i6 = i5 + 1;
                    float[] fArr4 = fArr2[i6];
                    fArr4[0] = fCos3 * fCos;
                    fArr4[c4] = fSin;
                    fArr4[c3] = f3 * fCos;
                    floatBufferAsFloatBuffer.put(fArr3);
                    floatBufferAsFloatBuffer.put(fArr2[i6]);
                    i5 += 2;
                    if (i5 > 31) {
                        floatBufferAsFloatBuffer.position(0);
                        GLES10.glVertexPointer(3, 5126, 0, floatBufferAsFloatBuffer);
                        GLES10.glNormalPointer(5126, 0, floatBufferAsFloatBuffer);
                        GLES10.glDrawArrays(5, 0, i5);
                        f2 -= 30.0f;
                        i5 = 0;
                    }
                    f2 += 30.0f;
                    d = d5;
                    d2 = d6;
                }
            }
            floatBufferAsFloatBuffer.position(0);
            GLES10.glVertexPointer(3, 5126, 0, floatBufferAsFloatBuffer);
            GLES10.glNormalPointer(5126, 0, floatBufferAsFloatBuffer);
            GLES10.glDrawArrays(5, 0, i5);
            c = c3;
            fArr = fArr2;
            c2 = c4;
            i = i3;
            i2 = i4;
        }
        GLES10.glDisableClientState(i);
        GLES10.glDisableClientState(i2);
    }
}
