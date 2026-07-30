package p153l;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z3k {

    /* JADX INFO: renamed from: a */
    public static final String f202834a = "z3k";

    /* JADX INFO: renamed from: b */
    public static final float[] f202835b;

    static {
        float[] fArr = new float[16];
        f202835b = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m218483a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e(f202834a, str + ": glError 0x" + Integer.toHexString(iGlGetError));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m218484b(int i, String str) {
        if (i < 0) {
            Log.e(f202834a, "Unable to locate '" + str + "' in program");
        }
    }

    /* JADX INFO: renamed from: c */
    public static FloatBuffer m218485c(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: d */
    public static int m218486d(String str, String str2) {
        int iM218487e;
        int iM218487e2 = m218487e(35633, str);
        if (iM218487e2 == 0 || (iM218487e = m218487e(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m218483a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e(f202834a, "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM218487e2);
        m218483a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM218487e);
        m218483a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        String str3 = f202834a;
        Log.e(str3, "Could not link program: ");
        Log.e(str3, GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m218487e(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m218483a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String str2 = f202834a;
        Log.e(str2, "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e(str2, sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
