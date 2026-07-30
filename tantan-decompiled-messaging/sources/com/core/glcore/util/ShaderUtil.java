package com.core.glcore.util;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p149l.i1k;

/* JADX INFO: loaded from: classes.dex */
public class ShaderUtil {
    public static void checkGlError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, str + ": glError " + iGlGetError);
        i1k.m133996a(str, ": glError ", iGlGetError);
    }

    public static int createProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, str);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
            checkGlError("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            checkGlError("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Could not link program: ");
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    public static String loadFromAssetsFile(String str, Resources resources) {
        String str2 = null;
        try {
            InputStream inputStreamOpen = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStreamOpen.read();
                if (i != -1) {
                    byteArrayOutputStream.write(i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStreamOpen.close();
                    String str3 = new String(byteArray, "UTF-8");
                    try {
                        return str3.replaceAll("\\r\\n", SignParameters.NEW_LINE);
                    } catch (Exception e) {
                        str2 = str3;
                        e = e;
                    }
                }
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Could not compile shader " + i + ":");
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }
}
