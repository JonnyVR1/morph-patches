package com.momo.xeengine.game;

import javax.microedition.khronos.egl.EGL10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IXRender {
    void onBackgroundFrame();

    boolean onGLDrawFrame(EGL10 egl10);

    void onGLEnvCreated();

    void onGLEnvCreatedFailed(String str);

    void onGLEnvRelease();

    void onGLRenderSizeChanged(int i, int i2);
}
