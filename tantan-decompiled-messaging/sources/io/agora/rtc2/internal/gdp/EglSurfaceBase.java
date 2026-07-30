package io.agora.rtc2.internal.gdp;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public class EglSurfaceBase {
    protected static final String TAG = "EglSurfaceBase";
    private EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    protected EglCore mEglCore;

    public EglSurfaceBase(EglCore eglCore) {
        this.mEglCore = eglCore;
    }

    public void createOffscreenSurface(int i, int i2) {
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            this.mEGLSurface = this.mEglCore.createOffscreenSurface(i, i2);
        } else {
            qkq0.m175383a("surface already created");
        }
    }

    public void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
    }
}
