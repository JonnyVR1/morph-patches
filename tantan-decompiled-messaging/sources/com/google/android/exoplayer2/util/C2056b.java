package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2056b {

    /* JADX INFO: renamed from: a */
    public final int f9551a;

    /* JADX INFO: renamed from: b */
    public final a[] f9552b;

    /* JADX INFO: renamed from: c */
    public final b[] f9553c;

    /* JADX INFO: renamed from: d */
    public final Map<String, a> f9554d;

    /* JADX INFO: renamed from: e */
    public final Map<String, b> f9555e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f9556a;

        /* JADX INFO: renamed from: b */
        public final int f9557b;

        /* JADX INFO: renamed from: c */
        public final int f9558c;

        public a(String str, int i, int i2) {
            this.f9556a = str;
            this.f9557b = i;
            this.f9558c = i2;
        }

        /* JADX INFO: renamed from: a */
        public static a m12171a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C2056b.m12166h(bArr));
            return new a(str, i2, C2056b.m12165f(i, str));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f9559a;

        /* JADX INFO: renamed from: b */
        public final int f9560b;

        /* JADX INFO: renamed from: c */
        public final int f9561c;

        /* JADX INFO: renamed from: d */
        public final float[] f9562d = new float[16];

        public b(String str, int i, int i2) {
            this.f9559a = str;
            this.f9560b = i;
            this.f9561c = i2;
        }

        /* JADX INFO: renamed from: a */
        public static b m12172a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C2056b.m12166h(bArr));
            return new b(str, C2056b.m12167i(i, str), iArr2[0]);
        }
    }

    public C2056b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f9551a = iGlCreateProgram;
        GlUtil.m12129b();
        m12164d(iGlCreateProgram, 35633, str);
        m12164d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.m12130c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f9554d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f9552b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a aVarM12171a = a.m12171a(this.f9551a, i);
            this.f9552b[i] = aVarM12171a;
            this.f9554d.put(aVarM12171a.f9556a, aVarM12171a);
        }
        this.f9555e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f9551a, 35718, iArr3, 0);
        this.f9553c = new b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            b bVarM12172a = b.m12172a(this.f9551a, i2);
            this.f9553c[i2] = bVarM12172a;
            this.f9555e.put(bVarM12172a.f9559a, bVarM12172a);
        }
        GlUtil.m12129b();
    }

    /* JADX INFO: renamed from: d */
    public static void m12164d(int i, int i2, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.m12130c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.m12129b();
    }

    /* JADX INFO: renamed from: f */
    public static int m12165f(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: renamed from: h */
    public static int m12166h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: i */
    public static int m12167i(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    /* JADX INFO: renamed from: e */
    public int m12168e(String str) throws GlUtil.GlException {
        int iM12169g = m12169g(str);
        GLES20.glEnableVertexAttribArray(iM12169g);
        GlUtil.m12129b();
        return iM12169g;
    }

    /* JADX INFO: renamed from: g */
    public final int m12169g(String str) {
        return m12165f(this.f9551a, str);
    }

    /* JADX INFO: renamed from: j */
    public int m12170j(String str) {
        return m12167i(this.f9551a, str);
    }
}
