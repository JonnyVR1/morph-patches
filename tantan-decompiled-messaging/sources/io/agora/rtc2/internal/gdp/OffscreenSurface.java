package io.agora.rtc2.internal.gdp;

/* JADX INFO: loaded from: classes2.dex */
public class OffscreenSurface extends EglSurfaceBase {
    public OffscreenSurface(EglCore eglCore, int i, int i2) {
        super(eglCore);
        createOffscreenSurface(i, i2);
    }

    public void release() {
        releaseEglSurface();
    }
}
