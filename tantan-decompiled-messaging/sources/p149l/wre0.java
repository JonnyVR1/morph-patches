package p149l;

import android.opengl.GLES20;
import android.util.Log;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class wre0 {
    /* JADX INFO: renamed from: a */
    public static int m205175a(String str, String str2) {
        int iM205179e = m205179e(m205178d(str), m205176b(str2));
        m205180f(iM205179e);
        return iM205179e;
    }

    /* JADX INFO: renamed from: b */
    private static int m205176b(String str) {
        return m205177c(35632, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: c */
    private static int m205177c(int i, String str) {
        String strGlGetShaderInfoLog;
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader);
            } else {
                strGlGetShaderInfoLog = "none";
            }
        } else {
            strGlGetShaderInfoLog = "none";
        }
        if (iGlCreateShader == 0) {
            Log.e(MDLogTag.MOMENT_RENDER_TAG, "could not create new shader. Reason : \n" + strGlGetShaderInfoLog);
        }
        return iGlCreateShader;
    }

    /* JADX INFO: renamed from: d */
    private static int m205178d(String str) {
        return m205177c(35633, str);
    }

    /* JADX INFO: renamed from: e */
    private static int m205179e(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, i);
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(iGlCreateProgram);
            Log.e(MDLogTag.MOMENT_RENDER_TAG, "Linking of program failed. Reason : \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        return iGlCreateProgram;
    }

    /* JADX INFO: renamed from: f */
    private static void m205180f(int i) {
        GLES20.glValidateProgram(i);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35715, iArr, 0);
        if (iArr[0] == 0) {
            Log.e(MDLogTag.MOMENT_RENDER_TAG, "Results of validating program : " + iArr[0] + "\n Log : " + GLES20.glGetProgramInfoLog(i));
        }
    }
}
