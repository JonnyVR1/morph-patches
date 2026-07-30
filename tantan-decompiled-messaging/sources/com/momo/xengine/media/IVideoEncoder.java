package com.momo.xengine.media;

import com.momo.xengine.media.types.VideoFrame;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IVideoEncoder {
    boolean appendAudioSamples(@NotNull AudioSamples audioSamples);

    boolean appendVideoFrame(@NotNull VideoFrame videoFrame);

    void init(@NotNull EncodeConfig encodeConfig);

    void release();

    boolean start();

    boolean stop();
}
