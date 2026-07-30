package com.core.glcore.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import p149l.o5d0;
import p149l.upk0;

/* JADX INFO: loaded from: classes.dex */
public class GLESTools {
    public static int FLOAT_SIZE_BYTES = 4;
    public static final int NO_TEXTURE = -1;
    public static int SHORT_SIZE_BYTES = 2;

    public static void checkGlError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(iGlGetError);
        MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, str2);
        upk0.m194883a(str2);
    }

    public static void createFrameBuff(int[] iArr, int[] iArr2, int i, int i2) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        checkGlError("createCamFrameBuff");
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        checkGlError("createCamFrameBuff");
    }

    public static int createProgram(String str, String str2) {
        if (str == null || str2 == null) {
            upk0.m194883a("invalid shader code");
            return 0;
        }
        int iGlCreateShader = GLES20.glCreateShader(35633);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        int[] iArr = new int[1];
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            o5d0.m162778a("vertext shader compile,failed:", GLES20.glGetShaderInfoLog(iGlCreateShader));
            return 0;
        }
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
        if (iArr[0] == 0) {
            o5d0.m162778a("fragment shader compile,failed:", GLES20.glGetShaderInfoLog(iGlCreateShader2));
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateProgram;
        }
        o5d0.m162778a("link program,failed:", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        return 0;
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glBindTexture(3553, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i;
        }
        return iArr[0];
    }

    public static String readTextFile(Resources resources, int i) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
                sb.append(SignParameters.NEW_LINE);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static int createProgram(Resources resources, int i, int i2) {
        return createProgram(readTextFile(resources, i), readTextFile(resources, i2));
    }
}
