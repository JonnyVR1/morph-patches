package tech.sud.runtime.core;

import android.opengl.GLSurfaceView;

/* JADX INFO: renamed from: tech.sud.runtime.core.c */
/* JADX INFO: loaded from: classes3.dex */
interface InterfaceC22559c {
    /* JADX INFO: renamed from: a */
    C22560d mo223206a();

    void onPause();

    void onResume();

    void queueEvent(Runnable runnable);

    void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6);

    void setEGLContextClientVersion(int i);

    void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory);

    void setRenderMode(int i);

    void setRenderer(GLSurfaceView.Renderer renderer);
}
