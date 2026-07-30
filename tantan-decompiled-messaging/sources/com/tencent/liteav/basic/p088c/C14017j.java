package com.tencent.liteav.basic.p088c;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14017j {

    /* JADX INFO: renamed from: a */
    public static FloatBuffer f58209a;

    /* JADX INFO: renamed from: f */
    private static float[] f58214f;

    /* JADX INFO: renamed from: g */
    private static float[] f58215g = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: h */
    private static float[] f58216h = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: i */
    private static float[] f58217i = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    private static float[] f58218j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public static FloatBuffer f58210b = m82829a(f58215g);

    /* JADX INFO: renamed from: c */
    public static FloatBuffer f58211c = m82829a(f58216h);

    /* JADX INFO: renamed from: d */
    public static FloatBuffer f58212d = m82829a(f58217i);

    /* JADX INFO: renamed from: e */
    public static FloatBuffer f58213e = m82829a(f58218j);

    /* JADX INFO: renamed from: k */
    private static int f58219k = 2;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int[] f58220a = null;

        /* JADX INFO: renamed from: b */
        public int[] f58221b = null;

        /* JADX INFO: renamed from: c */
        public int f58222c = -1;

        /* JADX INFO: renamed from: d */
        public int f58223d = -1;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.j$b */
    public interface b {
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f58214f = fArr;
        f58209a = m82829a(fArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m82826a(String str, String str2) {
        int[] iArr = new int[1];
        int iM82825a = m82825a(str, 35633);
        if (iM82825a == 0) {
            TXCLog.m82973w("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int iM82825a2 = m82825a(str2, 35632);
        if (iM82825a2 == 0) {
            TXCLog.m82973w("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM82825a);
        GLES20.glAttachShader(iGlCreateProgram, iM82825a2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            TXCLog.m82973w("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(iM82825a);
        GLES20.glDeleteShader(iM82825a2);
        return iGlCreateProgram;
    }

    /* JADX INFO: renamed from: b */
    public static int m82834b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    /* JADX INFO: renamed from: c */
    public static int m82835c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: a */
    public static final int m82819a() {
        return f58219k;
    }

    /* JADX INFO: renamed from: a */
    public static void m82832a(a[] aVarArr) {
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    m82827a(aVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static a[] m82833a(a[] aVarArr, int i, int i2, int i3) {
        if (aVarArr == null) {
            aVarArr = new a[i];
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            aVarArr[i4] = m82828a(aVarArr[i4], i2, i3);
        }
        return aVarArr;
    }

    /* JADX INFO: renamed from: a */
    public static a m82828a(a aVar, int i, int i2) {
        if (aVar == null) {
            aVar = new a();
        }
        if (aVar.f58220a == null) {
            aVar.f58220a = new int[1];
        }
        if (aVar.f58221b == null) {
            aVar.f58221b = new int[1];
        }
        aVar.f58222c = i;
        aVar.f58223d = i2;
        m82831a(aVar.f58220a, aVar.f58221b, i, i2);
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public static a m82827a(a aVar) {
        if (aVar == null) {
            return aVar;
        }
        int[] iArr = aVar.f58220a;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            aVar.f58220a = null;
        }
        int[] iArr2 = aVar.f58221b;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            aVar.f58221b = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static int m82822a(int i, int i2, int i3, int i4, int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i4, 5121, null);
        return iArr[0];
    }

    /* JADX INFO: renamed from: a */
    public static FloatBuffer m82829a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: a */
    public static int m82821a(int i, int i2, int i3, int i4, IntBuffer intBuffer) {
        int iM82835c = m82835c();
        GLES20.glBindTexture(3553, iM82835c);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i4, 5121, intBuffer);
        GLES20.glBindTexture(3553, 0);
        return iM82835c;
    }

    /* JADX INFO: renamed from: a */
    public static int m82820a(int i, int i2, int i3, int i4) {
        return m82821a(i, i2, i3, i4, (IntBuffer) null);
    }

    /* JADX INFO: renamed from: a */
    public static int m82824a(Bitmap bitmap, int i, boolean z) {
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
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: a */
    public static int m82823a(int i, int i2, int[] iArr) {
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(35051, iArr[0]);
        GLES20.glBufferData(35051, i * i2 * 4, null, 35049);
        GLES20.glBindBuffer(35051, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: a */
    public static void m82831a(int[] iArr, int[] iArr2, int i, int i2) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        iArr2[0] = m82822a(i, i2, 6408, 6408, iArr2);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m82825a(String str, int i) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m82973w("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(iGlCreateShader));
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m82830a(int i) {
        f58219k = i;
    }
}
