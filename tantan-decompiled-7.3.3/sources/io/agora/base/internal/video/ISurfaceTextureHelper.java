package io.agora.base.internal.video;

import android.graphics.SurfaceTexture;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public interface ISurfaceTextureHelper {
    void dispose();

    Handler getHandler();

    SurfaceTexture getSurfaceTexture();

    boolean isOesTextureInUse();

    void setFrameRotation(int i);

    void setTextureSize(int i, int i2);

    void startListening(VideoSink videoSink);

    void stopListening();
}
