package com.momo.xengine.media;

import android.view.Surface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IMediacodecSurfaceEncoder {
    Surface getEncoderSurface();

    boolean init(@NotNull EncodeConfig encodeConfig);

    void putAudioData(@NotNull AudioSamples audioSamples);

    void release();

    boolean start();

    void stop();
}
