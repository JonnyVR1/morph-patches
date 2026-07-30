package com.core.glcore.util;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class GLSurface {
    public static final int TYPE_PBUFFER_SURFACE = 1;
    public static final int TYPE_PIXMAP_SURFACE = 2;
    public static final int TYPE_WINDOW_SURFACE = 0;
    protected EGLSurface eglSurface;
    protected Object surface;
    protected final int type;
    protected Viewport viewport;

    public static class Viewport {
        public int height;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f5770x;

        /* JADX INFO: renamed from: y */
        public int f5771y;
    }

    public GLSurface(int i, int i2) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.viewport = new Viewport();
        setViewport(0, 0, i, i2);
        this.surface = null;
        this.type = 1;
    }

    public Viewport getViewport() {
        return this.viewport;
    }

    public void setViewport(int i, int i2, int i3, int i4) {
        Viewport viewport = this.viewport;
        viewport.f5770x = i;
        viewport.f5771y = i2;
        viewport.width = i3;
        viewport.height = i4;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public GLSurface(Surface surface, int i, int i2) {
        this(surface, 0, 0, i, i2);
    }

    public GLSurface(Surface surface, int i, int i2, int i3, int i4) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.viewport = new Viewport();
        setViewport(i, i2, i3, i4);
        this.surface = surface;
        this.type = 0;
    }
}
