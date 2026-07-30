package com.momo.xeengine.widget;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface IXUIVideoPlayer {
    int getCurrentTexture();

    float getCurrentTime();

    float getTotalDuration();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    String loadVideoAsset(String str, int i);

    boolean pause();

    String play();

    void release();

    boolean resume();

    void setEnableTimeout(boolean z);

    boolean setMute(boolean z);

    boolean setVolume(float f);

    boolean stop();
}
