package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import io.agora.base.internal.video.EglBase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class GlUtil {

    /* JADX INFO: renamed from: a */
    public static final int[] f9530a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: b */
    public static final int[] f9531b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: c */
    public static final int[] f9532c = {EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};

    /* JADX INFO: renamed from: d */
    public static final int[] f9533d = {12344};

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12128a(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        m12129b();
        GLES20.glTexParameteri(i, 10240, 9729);
        m12129b();
        GLES20.glTexParameteri(i, 10241, 9729);
        m12129b();
        GLES20.glTexParameteri(i, 10242, 33071);
        m12129b();
        GLES20.glTexParameteri(i, 10243, 33071);
        m12129b();
    }

    /* JADX INFO: renamed from: b */
    public static void m12129b() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12130c(boolean z, String str) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static FloatBuffer m12131d(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* JADX INFO: renamed from: e */
    public static FloatBuffer m12132e(float[] fArr) {
        return (FloatBuffer) m12131d(fArr.length).put(fArr).flip();
    }

    /* JADX INFO: renamed from: f */
    public static int m12133f() throws GlException {
        int iM12134g = m12134g();
        m12128a(36197, iM12134g);
        return iM12134g;
    }

    /* JADX INFO: renamed from: g */
    public static int m12134g() throws GlException {
        m12130c(!vck0.m197845c(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m12129b();
        return iArr[0];
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12135h(Context context) {
        String strEglQueryString;
        int i = vck0.f180948a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(vck0.f180950c) || "XT1650".equals(vck0.f180951d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12136i() {
        String strEglQueryString;
        return vck0.f180948a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    /* JADX INFO: renamed from: j */
    public static void m12137j(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }
}
