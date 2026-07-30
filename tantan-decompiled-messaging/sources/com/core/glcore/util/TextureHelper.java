package com.core.glcore.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import p149l.vjw;

/* JADX INFO: loaded from: classes.dex */
public class TextureHelper {
    public static int bitmapToTexture(vjw vjwVar) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (vjwVar != null && vjwVar.m198688a() != null) {
            GLES20.glTexImage2D(3553, 0, 6408, vjwVar.m198692e(), vjwVar.m198690c(), 0, 6408, 5121, ByteBuffer.wrap(vjwVar.m198688a()));
        }
        return iArr[0];
    }

    public static int byteToLuminanceTexture(byte[] bArr, int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, ByteBuffer.wrap(bArr));
        return iArr[0];
    }

    public static int byteToLuminanceTextureBytextureId(int i, byte[] bArr, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, ByteBuffer.wrap(bArr));
        return i;
    }

    public static int byteToTexture(byte[] bArr, int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, ByteBuffer.wrap(bArr));
        return iArr[0];
    }

    public static Bitmap captureTextureToBitmap(int i, int i2, int i3, int i4) {
        GLES20.glBindFramebuffer(36160, 0);
        if (i4 <= 0 || i3 <= 0) {
            return null;
        }
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            return null;
        }
        IntBuffer intBufferAllocate = IntBuffer.allocate(i3 * i4);
        GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, intBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(intBufferAllocate);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i3, i4, matrix, true);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return bitmapCreateBitmap2;
    }

    public static void destroyTexture(int[] iArr) {
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
        }
    }

    public static int etc1ToTexture(ETC1Util.ETC1Texture eTC1Texture) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glCompressedTexImage2D(3553, 0, 36196, eTC1Texture.getWidth(), eTC1Texture.getHeight(), 0, eTC1Texture.getData().remaining(), eTC1Texture.getData());
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        return iArr[0];
    }

    public static int loadDataToTexture(int i, vjw vjwVar) {
        GLES20.glBindTexture(3553, new int[]{i}[0]);
        if (vjwVar != null && vjwVar.m198688a() != null) {
            GLES20.glTexImage2D(3553, 0, 6408, vjwVar.m198692e(), vjwVar.m198690c(), 0, 6408, 5121, ByteBuffer.wrap(vjwVar.m198688a()));
        }
        return i;
    }

    public static Bitmap snapPicture(int i, int i2, int i3, int i4) {
        if (i4 != -1) {
            GLES20.glBindFramebuffer(36160, i4);
        }
        if (i3 <= 0 || i2 <= 0) {
            return null;
        }
        IntBuffer intBufferAllocate = IntBuffer.allocate(i2 * i3);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, intBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(intBufferAllocate);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i2, i3, matrix, true);
    }

    public static void updateBitmap(vjw vjwVar, int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (vjwVar == null || vjwVar.m198688a() == null) {
            return;
        }
        GLES20.glTexSubImage2D(3553, 0, 6408, vjwVar.m198692e(), vjwVar.m198690c(), 0, 6408, 5121, ByteBuffer.wrap(vjwVar.m198688a()));
    }

    public static int byteToTexture(ByteBuffer byteBuffer, int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, byteBuffer);
        return iArr[0];
    }

    public static int byteToLuminanceTexture(byte[] bArr, int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, ByteBuffer.wrap(bArr));
        return iArr[0];
    }

    public static Bitmap snapPicture(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, 0);
        if (i3 <= 0 || i2 <= 0) {
            return null;
        }
        IntBuffer intBufferAllocate = IntBuffer.allocate(i2 * i3);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, intBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(intBufferAllocate);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i2, i3, matrix, true);
    }

    public static void updateBitmap(Bitmap bitmap, int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null) {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
        }
    }

    public static int bitmapToTexture(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return iArr[0];
    }
}
