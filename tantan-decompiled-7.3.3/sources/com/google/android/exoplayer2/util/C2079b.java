package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2079b {

    /* JADX INFO: renamed from: a */
    public final int f9588a;

    /* JADX INFO: renamed from: b */
    public final a[] f9589b;

    /* JADX INFO: renamed from: c */
    public final b[] f9590c;

    /* JADX INFO: renamed from: d */
    public final Map<String, a> f9591d;

    /* JADX INFO: renamed from: e */
    public final Map<String, b> f9592e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f9593a;

        /* JADX INFO: renamed from: b */
        public final int f9594b;

        /* JADX INFO: renamed from: c */
        public final int f9595c;

        public a(String str, int i, int i2) {
            this.f9593a = str;
            this.f9594b = i;
            this.f9595c = i2;
        }

        /* JADX INFO: renamed from: a */
        public static a m12225a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C2079b.m12220h(bArr));
            return new a(str, i2, C2079b.m12219f(i, str));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f9596a;

        /* JADX INFO: renamed from: b */
        public final int f9597b;

        /* JADX INFO: renamed from: c */
        public final int f9598c;

        /* JADX INFO: renamed from: d */
        public final float[] f9599d = new float[16];

        public b(String str, int i, int i2) {
            this.f9596a = str;
            this.f9597b = i;
            this.f9598c = i2;
        }

        /* JADX INFO: renamed from: a */
        public static b m12226a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C2079b.m12220h(bArr));
            return new b(str, C2079b.m12221i(i, str), iArr2[0]);
        }
    }

    public C2079b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f9588a = iGlCreateProgram;
        GlUtil.m12183b();
        m12218d(iGlCreateProgram, 35633, str);
        m12218d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.m12184c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f9591d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f9589b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a aVarM12225a = a.m12225a(this.f9588a, i);
            this.f9589b[i] = aVarM12225a;
            this.f9591d.put(aVarM12225a.f9593a, aVarM12225a);
        }
        this.f9592e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f9588a, 35718, iArr3, 0);
        this.f9590c = new b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            b bVarM12226a = b.m12226a(this.f9588a, i2);
            this.f9590c[i2] = bVarM12226a;
            this.f9592e.put(bVarM12226a.f9596a, bVarM12226a);
        }
        GlUtil.m12183b();
    }

    /* JADX INFO: renamed from: d */
    public static void m12218d(int i, int i2, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.m12184c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.m12183b();
    }

    /* JADX INFO: renamed from: f */
    public static int m12219f(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: renamed from: h */
    public static int m12220h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: i */
    public static int m12221i(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    /* JADX INFO: renamed from: e */
    public int m12222e(String str) throws GlUtil.GlException {
        int iM12223g = m12223g(str);
        GLES20.glEnableVertexAttribArray(iM12223g);
        GlUtil.m12183b();
        return iM12223g;
    }

    /* JADX INFO: renamed from: g */
    public final int m12223g(String str) {
        return m12219f(this.f9588a, str);
    }

    /* JADX INFO: renamed from: j */
    public int m12224j(String str) {
        return m12221i(this.f9588a, str);
    }
}
