package com.bytedance.realx.video;

import android.opengl.GLES20;
import android.util.Log;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.y3k;

/* JADX INFO: loaded from: classes.dex */
public class GlUtil {
    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("checkNoGLES2Error", str + "error: " + iGlGetError);
            RXLogging.m5742e("checkNoGLES2Error", str + "error: " + iGlGetError);
            if (iGlGetError == 1285) {
                return;
            }
            y3k.m214151a(str, ": GLES20 error: ", iGlGetError);
        }
    }

    public static void clearGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            RXLogging.m5746w("clearGLES2Error", str + "clear opengl error: " + iGlGetError);
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }
}
