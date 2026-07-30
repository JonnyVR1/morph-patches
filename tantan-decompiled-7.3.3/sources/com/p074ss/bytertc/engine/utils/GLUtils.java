package com.p074ss.bytertc.engine.utils;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p153l.azk0;
import p153l.rdd0;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 17)
public class GLUtils {
    private static int[] defaultEGLConfAttr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    private static int[] ctxAttr = {12440, 2, 12344};

    @Nullable
    public static EGLContext createEglContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, ctxAttr, 0);
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            rdd0.m180845a("eglChooseConfig failed: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        if (iArr2[0] <= 0) {
            azk0.m101074a("Unable to find any matching EGL config");
            return null;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        azk0.m101074a("eglChooseConfig returned null");
        return null;
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            rdd0.m180845a("Unable to get EGL14 display: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        rdd0.m180845a("Unable to initialize EGL14: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    public static int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay) {
        return getEglConfig(eGLDisplay, defaultEGLConfAttr);
    }
}
