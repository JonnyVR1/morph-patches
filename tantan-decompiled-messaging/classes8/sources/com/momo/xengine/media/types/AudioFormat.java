package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioFormat {
    private AudioChannelLayout channelLayout = AudioChannelLayout.CHANNELS_STEREO;
    private int sampleRate = 44100;
    private SampleFormat sampleFormat = SampleFormat.AUDIO_FORMAT_16BIT;

    public AudioChannelLayout getChannelLayout() {
        return this.channelLayout;
    }

    public SampleFormat getSampleFormat() {
        return this.sampleFormat;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getSamplesSize(int i) {
        return i * this.channelLayout.getChannelNum() * this.sampleFormat.getSampleBit();
    }

    public void setChannelLayout(AudioChannelLayout audioChannelLayout) {
        this.channelLayout = audioChannelLayout;
    }

    public void setSampleFormat(SampleFormat sampleFormat) {
        this.sampleFormat = sampleFormat;
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }
}
