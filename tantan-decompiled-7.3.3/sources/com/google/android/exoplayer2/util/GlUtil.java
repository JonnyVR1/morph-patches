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
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class GlUtil {

    /* JADX INFO: renamed from: a */
    public static final int[] f9567a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: b */
    public static final int[] f9568b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: c */
    public static final int[] f9569c = {EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};

    /* JADX INFO: renamed from: d */
    public static final int[] f9570d = {12344};

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12182a(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        m12183b();
        GLES20.glTexParameteri(i, 10240, 9729);
        m12183b();
        GLES20.glTexParameteri(i, 10241, 9729);
        m12183b();
        GLES20.glTexParameteri(i, 10242, 33071);
        m12183b();
        GLES20.glTexParameteri(i, 10243, 33071);
        m12183b();
    }

    /* JADX INFO: renamed from: b */
    public static void m12183b() throws GlException {
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
    public static void m12184c(boolean z, String str) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static FloatBuffer m12185d(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* JADX INFO: renamed from: e */
    public static FloatBuffer m12186e(float[] fArr) {
        return (FloatBuffer) m12185d(fArr.length).put(fArr).flip();
    }

    /* JADX INFO: renamed from: f */
    public static int m12187f() throws GlException {
        int iM12188g = m12188g();
        m12182a(36197, iM12188g);
        return iM12188g;
    }

    /* JADX INFO: renamed from: g */
    public static int m12188g() throws GlException {
        m12184c(!bmk0.m105123c(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m12183b();
        return iArr[0];
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12189h(Context context) {
        String strEglQueryString;
        int i = bmk0.f77313a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(bmk0.f77315c) || "XT1650".equals(bmk0.f77316d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12190i() {
        String strEglQueryString;
        return bmk0.f77313a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    /* JADX INFO: renamed from: j */
    public static void m12191j(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }
}
