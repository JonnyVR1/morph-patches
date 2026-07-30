package p149l;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class yre0 {
    /* JADX INFO: renamed from: a */
    public static void m215834a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, str + ": glError " + iGlGetError);
        i1k.m133996a(str, ": glError ", iGlGetError);
    }

    /* JADX INFO: renamed from: b */
    public static int m215835b(String str, String str2) {
        int iM215836c;
        int iM215836c2 = m215836c(35633, str);
        if (iM215836c2 == 0 || (iM215836c = m215836c(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iM215836c2);
            m215834a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iM215836c);
            m215834a("glAttachShader");
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

    /* JADX INFO: renamed from: c */
    private static int m215836c(int i, String str) {
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
