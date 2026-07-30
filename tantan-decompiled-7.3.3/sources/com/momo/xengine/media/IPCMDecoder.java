package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioChannelLayout;
import com.momo.xengine.media.types.AudioFrame;
import com.momo.xengine.media.types.SampleFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IPCMDecoder {
    AudioFrame DecodeAudioFile(@NotNull String str);

    void addSupportChannels(@NotNull AudioChannelLayout audioChannelLayout);

    void addSupportFormat(@NotNull SampleFormat sampleFormat);

    void init();
}
