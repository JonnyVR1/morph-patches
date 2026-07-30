package com.momocv;

import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes8.dex */
public class GpuUtils {
    public static String getGpuInfo() {
        int[] iArr = new int[2];
        int[] iArr2 = {12375, 100, 12374, 100, 12344};
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, iArr);
            int[] iArr3 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
            int[] iArr4 = new int[1];
            egl10.eglChooseConfig(eGLDisplayEglGetDisplay, iArr3, null, 0, iArr4);
            int i = iArr4[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplayEglGetDisplay, iArr3, eGLConfigArr, i, iArr4);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, iArr2);
            egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
            return GLES20.glGetString(7937) + ", " + GLES20.glGetString(7936) + ", " + GLES20.glGetString(7938);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
