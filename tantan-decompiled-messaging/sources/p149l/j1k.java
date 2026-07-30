package p149l;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j1k {

    /* JADX INFO: renamed from: a */
    public static final String f115819a = "j1k";

    /* JADX INFO: renamed from: b */
    public static final float[] f115820b;

    static {
        float[] fArr = new float[16];
        f115820b = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m139324a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e(f115819a, str + ": glError 0x" + Integer.toHexString(iGlGetError));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m139325b(int i, String str) {
        if (i < 0) {
            Log.e(f115819a, "Unable to locate '" + str + "' in program");
        }
    }

    /* JADX INFO: renamed from: c */
    public static FloatBuffer m139326c(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: d */
    public static int m139327d(String str, String str2) {
        int iM139328e;
        int iM139328e2 = m139328e(35633, str);
        if (iM139328e2 == 0 || (iM139328e = m139328e(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m139324a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e(f115819a, "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM139328e2);
        m139324a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM139328e);
        m139324a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        String str3 = f115819a;
        Log.e(str3, "Could not link program: ");
        Log.e(str3, GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m139328e(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m139324a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String str2 = f115819a;
        Log.e(str2, "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e(str2, sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
