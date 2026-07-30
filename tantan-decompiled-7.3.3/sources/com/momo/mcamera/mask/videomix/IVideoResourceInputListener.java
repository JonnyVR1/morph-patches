package com.momo.mcamera.mask.videomix;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public interface IVideoResourceInputListener {

    public interface OnCompletionListener {
        void onCompletion(MediaPlayer mediaPlayer);
    }

    public interface OnPreparedListener {
        void onPrepared(MediaPlayer mediaPlayer);
    }

    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2, int i3, int i4);
    }

    public interface RenderTimestampListener {
        void onRenderTimestampChanged(long j);
    }
}
