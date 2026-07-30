package com.momo.mcamera.util;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public enum GpuUtils {
    ;

    public static int createGLProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, str);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                glError(1, "Could not link program:" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    public static int createGLProgramByAssetsFile(Resources resources, String str, String str2) {
        return createGLProgram(readText(resources, str), readText(resources, str2));
    }

    public static int createTextureID(boolean z) {
        int i = z ? 36197 : 3553;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i, iArr[0]);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        return iArr[0];
    }

    private static void glError(int i, Object obj) {
    }

    public static int loadShader(int i, String str) {
        if (str == null) {
            glError(1, "Shader source ==null : shaderType =" + i);
            return 0;
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                glError(1, "Could not compile shader:" + i);
                glError(1, "GLES20 Error:" + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public static String readText(Resources resources, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = resources.getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (-1 == i) {
                    return sb.toString().replaceAll("\\r\\n", SignParameters.NEW_LINE);
                }
                sb.append(new String(bArr, 0, i));
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
