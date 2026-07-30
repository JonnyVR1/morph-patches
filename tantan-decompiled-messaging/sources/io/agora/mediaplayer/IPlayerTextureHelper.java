package io.agora.mediaplayer;

import android.view.Surface;
import io.agora.base.VideoFrame;

/* JADX INFO: loaded from: classes2.dex */
public interface IPlayerTextureHelper {
    void dispose();

    VideoFrame getAvailableTextureInfo(int i);

    long getEglContextHandler();

    VideoFrame getFakeTextureInfo();

    Surface getRenderGlSurface();

    void releaseRenderedTextureInfo(VideoFrame videoFrame);

    void resetTextureBufferQueue();

    void setTextureSize(int i, int i2);
}
