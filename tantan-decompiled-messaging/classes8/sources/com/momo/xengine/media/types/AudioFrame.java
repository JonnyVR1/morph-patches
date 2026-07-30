package com.momo.xengine.media.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioFrame {
    private byte[] data = null;
    private long samples = 0;
    private long timestamp = 0;
    private int samplesRate = 44100;
    private SampleFormat sampleFormat = SampleFormat.AUDIO_FORMAT_FLOAT_PLANAR;
    private AudioChannelLayout channelLayout = AudioChannelLayout.CHANNELS_STEREO;

    @NotNull
    public AudioChannelLayout getChannelLayout() {
        return this.channelLayout;
    }

    @Nullable
    public byte[] getData() {
        return this.data;
    }

    @NotNull
    public SampleFormat getSampleFormat() {
        return this.sampleFormat;
    }

    public long getSamples() {
        return this.samples;
    }

    public int getSamplesRate() {
        return this.samplesRate;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setChannelLayout(int i) {
        this.channelLayout = AudioChannelLayout.valueOf(i);
    }

    public void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public void setSampleFormat(int i) {
        this.sampleFormat = SampleFormat.getAudioFormat(i);
    }

    public void setSamples(long j) {
        this.samples = j;
    }

    public void setSamplesRate(int i) {
        this.samplesRate = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setChannelLayout(AudioChannelLayout audioChannelLayout) {
        this.channelLayout = audioChannelLayout;
    }

    public void setSampleFormat(SampleFormat sampleFormat) {
        this.sampleFormat = sampleFormat;
    }
}
