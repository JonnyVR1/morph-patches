package com.bef.effectsdk;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.amazing.annotation.EffectKeep;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import p149l.upk0;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class OpenGLUtils {
    private static final String HEIGHT = "\"height\"";
    public static final int NOT_INIT = -1;
    public static final int NO_TEXTURE = -1;
    public static final int ON_DRAWN = 1;
    private static final String TEXTURE_ID = "\"textureId\"";
    private static final String WIDTH = "\"width\"";
    private static final String RES = "\"res\"";
    private static final String FAIL_RES = String.format(Locale.US, "{%s: false}", RES);

    @EffectKeep
    public static void byte2Bitmap(byte[] bArr, int i, int i2, String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-16776961);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        saveBitmap(bitmapCreateBitmap, str);
    }

    public static void checkGlError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(iGlGetError);
        Log.e("GLES", str2);
        upk0.m194883a(str2);
    }

    public static int getExternalOESTextureID() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static int initEffectTexture(int i, int i2, int[] iArr, int i3) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i3, iArr[0]);
        GLES20.glTexParameterf(i3, 10240, 9729.0f);
        GLES20.glTexParameterf(i3, 10241, 9729.0f);
        GLES20.glTexParameterf(i3, 10242, 33071.0f);
        GLES20.glTexParameterf(i3, 10243, 33071.0f);
        GLES20.glTexImage2D(i3, 0, 6408, i, i2, 0, 6408, 5121, null);
        return iArr[0];
    }

    @EffectKeep
    public static Bitmap loadBitmap(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int loadProgram(String str, String str2) {
        int iLoadShader;
        int[] iArr = new int[1];
        int iLoadShader2 = loadShader(str, 35633);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(str2, 35632)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            return 0;
        }
        GLES20.glDeleteShader(iLoadShader2);
        GLES20.glDeleteShader(iLoadShader);
        return iGlCreateProgram;
    }

    private static int loadShader(String str, int i) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(iGlCreateShader));
        return 0;
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void saveBitmap(Bitmap bitmap, String str) {
    }

    @EffectKeep
    public static Bitmap loadBitmap(FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        FileInputStream fileInputStreamCreateInputStream = new AssetFileDescriptor(ParcelFileDescriptor.dup(fileDescriptor), j, j2).createInputStream();
        try {
            return BitmapFactory.decodeStream(fileInputStreamCreateInputStream);
        } finally {
            fileInputStreamCreateInputStream.close();
        }
    }

    @EffectKeep
    public static Bitmap loadBitmap(byte[] bArr, int i, int i2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = z;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        if (bitmapDecodeByteArray == null) {
            return bitmapDecodeByteArray;
        }
        Bitmap.Config config = bitmapDecodeByteArray.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        return config != config2 ? bitmapDecodeByteArray.copy(config2, true) : bitmapDecodeByteArray;
    }

    public static int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        return loadTexture(bitmap, i, false);
    }

    @EffectKeep
    public static String loadTexture(String str) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            return FAIL_RES;
        }
        return String.format(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", RES, WIDTH, Integer.valueOf(bitmapDecodeFile.getWidth()), HEIGHT, Integer.valueOf(bitmapDecodeFile.getHeight()), TEXTURE_ID, Integer.valueOf(loadTexture(bitmapDecodeFile, -1, false)));
    }
}
