package com.bef.effectsdk.game;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class RenderTextureUtils {
    public static final String renderFS = "precision highp float;\n\nuniform sampler2D uTexture;\nvarying vec2 textureCoord;\nvoid main() {\n    gl_FragColor = texture2D(uTexture, textureCoord);\n}\n";
    public static final String renderVS = "attribute vec2 attUV;\nattribute vec2 attPosition;\nvarying vec2 textureCoord;\nuniform mat4 mvpMatrix;\n\nvoid main() {\n    gl_Position  = mvpMatrix * vec4(attPosition, 0.,1.);\n    textureCoord = attUV;\n}\n";
    private static float[] vertexArray = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    private static float[] uvArray = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private static float[] flipY_uvArray = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    public static int generateBlankTexture(int i, int i2) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(0.0f);
        floatBufferAsFloatBuffer.position(0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, floatBufferAsFloatBuffer);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static FloatBuffer getFlipY_uvBuffer() {
        return getFloatBuffer(flipY_uvArray);
    }

    public static FloatBuffer getFloatBuffer(float[] fArr) {
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        floatBufferPut.position(0);
        return floatBufferPut;
    }

    public static FloatBuffer getUVBuffer() {
        return getFloatBuffer(uvArray);
    }

    public static FloatBuffer getUVBufferWithParams(float f, float f2, float f3, float f4) {
        return getFloatBuffer(new float[]{f, f3, f2, f3, f, f4, f2, f4});
    }

    public static FloatBuffer getVertexBuffer() {
        return getFloatBuffer(vertexArray);
    }

    public static FloatBuffer getVertexBufferWithParams(float f, float f2, float f3, float f4) {
        return getFloatBuffer(new float[]{f, f3, f2, f3, f, f4, f2, f4});
    }
}
