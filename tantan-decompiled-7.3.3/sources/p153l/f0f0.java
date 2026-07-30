package p153l;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class f0f0 {
    /* JADX INFO: renamed from: a */
    public static void m123482a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, str + ": glError " + iGlGetError);
        y3k.m214151a(str, ": glError ", iGlGetError);
    }

    /* JADX INFO: renamed from: b */
    public static int m123483b(String str, String str2) {
        int iM123484c;
        int iM123484c2 = m123484c(35633, str);
        if (iM123484c2 == 0 || (iM123484c = m123484c(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iM123484c2);
            m123482a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iM123484c);
            m123482a("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Could not link program: ");
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    /* JADX INFO: renamed from: c */
    private static int m123484c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Could not compile shader " + i + ":");
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }
}
