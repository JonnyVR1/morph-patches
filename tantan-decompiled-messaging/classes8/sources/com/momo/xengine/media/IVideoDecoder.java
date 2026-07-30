package com.momo.xengine.media;

import com.momo.xengine.media.types.VideoFrame;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IVideoDecoder {
    VideoFrame getFrameAt(long j, int i);

    VideoFrame getFrameInMicrosecond(long j);

    void init(@NotNull DecodeConfig decodeConfig);

    void release();
}
