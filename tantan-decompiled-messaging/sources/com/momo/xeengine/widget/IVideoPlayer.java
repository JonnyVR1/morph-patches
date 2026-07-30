package com.momo.xeengine.widget;

import android.view.Surface;
import androidx.annotation.Keep;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface IVideoPlayer {
    long getCurrentPosition();

    long getDuration();

    String getErrorMessage();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    boolean pause();

    void prepare() throws IOException;

    void quickStart();

    void release();

    boolean resume();

    void seekTo(int i);

    void setMute(boolean z);

    void setSurface(Surface surface);

    void setVideo(String str) throws IOException;

    void setVolume(float f);

    boolean start();

    boolean stop();
}
