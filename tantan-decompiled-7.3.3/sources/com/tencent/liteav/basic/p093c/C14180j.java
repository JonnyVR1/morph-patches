package com.tencent.liteav.basic.p093c;

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
public class C14180j {

    /* JADX INFO: renamed from: a */
    public static FloatBuffer f59057a;

    /* JADX INFO: renamed from: f */
    private static float[] f59062f;

    /* JADX INFO: renamed from: g */
    private static float[] f59063g = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: h */
    private static float[] f59064h = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: i */
    private static float[] f59065i = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    private static float[] f59066j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public static FloatBuffer f59058b = m84012a(f59063g);

    /* JADX INFO: renamed from: c */
    public static FloatBuffer f59059c = m84012a(f59064h);

    /* JADX INFO: renamed from: d */
    public static FloatBuffer f59060d = m84012a(f59065i);

    /* JADX INFO: renamed from: e */
    public static FloatBuffer f59061e = m84012a(f59066j);

    /* JADX INFO: renamed from: k */
    private static int f59067k = 2;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int[] f59068a = null;

        /* JADX INFO: renamed from: b */
        public int[] f59069b = null;

        /* JADX INFO: renamed from: c */
        public int f59070c = -1;

        /* JADX INFO: renamed from: d */
        public int f59071d = -1;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.j$b */
    public interface b {
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f59062f = fArr;
        f59057a = m84012a(fArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m84009a(String str, String str2) {
        int[] iArr = new int[1];
        int iM84008a = m84008a(str, 35633);
        if (iM84008a == 0) {
            TXCLog.m84156w("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int iM84008a2 = m84008a(str2, 35632);
        if (iM84008a2 == 0) {
            TXCLog.m84156w("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM84008a);
        GLES20.glAttachShader(iGlCreateProgram, iM84008a2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            TXCLog.m84156w("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(iM84008a);
        GLES20.glDeleteShader(iM84008a2);
        return iGlCreateProgram;
    }

    /* JADX INFO: renamed from: b */
    public static int m84017b() {
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
    public static int m84018c() {
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
    public static final int m84002a() {
        return f59067k;
    }

    /* JADX INFO: renamed from: a */
    public static void m84015a(a[] aVarArr) {
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    m84010a(aVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static a[] m84016a(a[] aVarArr, int i, int i2, int i3) {
        if (aVarArr == null) {
            aVarArr = new a[i];
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            aVarArr[i4] = m84011a(aVarArr[i4], i2, i3);
        }
        return aVarArr;
    }

    /* JADX INFO: renamed from: a */
    public static a m84011a(a aVar, int i, int i2) {
        if (aVar == null) {
            aVar = new a();
        }
        if (aVar.f59068a == null) {
            aVar.f59068a = new int[1];
        }
        if (aVar.f59069b == null) {
            aVar.f59069b = new int[1];
        }
        aVar.f59070c = i;
        aVar.f59071d = i2;
        m84014a(aVar.f59068a, aVar.f59069b, i, i2);
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public static a m84010a(a aVar) {
        if (aVar == null) {
            return aVar;
        }
        int[] iArr = aVar.f59068a;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            aVar.f59068a = null;
        }
        int[] iArr2 = aVar.f59069b;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            aVar.f59069b = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static int m84005a(int i, int i2, int i3, int i4, int[] iArr) {
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
    public static FloatBuffer m84012a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: a */
    public static int m84004a(int i, int i2, int i3, int i4, IntBuffer intBuffer) {
        int iM84018c = m84018c();
        GLES20.glBindTexture(3553, iM84018c);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i4, 5121, intBuffer);
        GLES20.glBindTexture(3553, 0);
        return iM84018c;
    }

    /* JADX INFO: renamed from: a */
    public static int m84003a(int i, int i2, int i3, int i4) {
        return m84004a(i, i2, i3, i4, (IntBuffer) null);
    }

    /* JADX INFO: renamed from: a */
    public static int m84007a(Bitmap bitmap, int i, boolean z) {
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
    public static int m84006a(int i, int i2, int[] iArr) {
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(35051, iArr[0]);
        GLES20.glBufferData(35051, i * i2 * 4, null, 35049);
        GLES20.glBindBuffer(35051, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: a */
    public static void m84014a(int[] iArr, int[] iArr2, int i, int i2) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        iArr2[0] = m84005a(i, i2, 6408, 6408, iArr2);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m84008a(String str, int i) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m84156w("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(iGlCreateShader));
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m84013a(int i) {
        f59067k = i;
    }
}
