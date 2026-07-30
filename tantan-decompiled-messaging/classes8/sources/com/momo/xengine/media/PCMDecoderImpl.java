package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioChannelLayout;
import com.momo.xengine.media.types.AudioFrame;
import com.momo.xengine.media.types.SampleFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class PCMDecoderImpl implements IPCMDecoder {
    private long pointer = 0;

    private native void nativeAddSupportChannels(long j, int i);

    private native void nativeAddSupportFormat(long j, int i);

    private native boolean nativeDecodeAudioFile(long j, String str, AudioFrame audioFrame);

    private native long nativeInit();

    @Override // com.momo.xengine.media.IPCMDecoder
    public AudioFrame DecodeAudioFile(@NotNull String str) {
        if (this.pointer == 0) {
            return null;
        }
        AudioFrame audioFrame = new AudioFrame();
        if (nativeDecodeAudioFile(this.pointer, str, audioFrame)) {
            return audioFrame;
        }
        return null;
    }

    @Override // com.momo.xengine.media.IPCMDecoder
    public void addSupportChannels(@NotNull AudioChannelLayout audioChannelLayout) {
        long j = this.pointer;
        if (j != 0) {
            nativeAddSupportChannels(j, audioChannelLayout.getValue());
        }
    }

    @Override // com.momo.xengine.media.IPCMDecoder
    public void addSupportFormat(@NotNull SampleFormat sampleFormat) {
        long j = this.pointer;
        if (j != 0) {
            nativeAddSupportFormat(j, sampleFormat.getValue());
        }
    }

    @Override // com.momo.xengine.media.IPCMDecoder
    public void init() {
        this.pointer = nativeInit();
    }
}
