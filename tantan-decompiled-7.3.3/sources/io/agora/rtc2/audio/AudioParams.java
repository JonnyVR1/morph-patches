package io.agora.rtc2.audio;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class AudioParams {
    public int channel;
    public int mode;
    public int sampleRate;
    public int samplesPerCall;

    @CalledByNative
    public AudioParams(int i, int i2, int i3, int i4) {
        this.sampleRate = i;
        this.channel = i2;
        this.mode = i3;
        this.samplesPerCall = i4;
    }

    @CalledByNative
    public int getChannel() {
        return this.channel;
    }

    @CalledByNative
    public int getMode() {
        return this.mode;
    }

    @CalledByNative
    public int getSampleRate() {
        return this.sampleRate;
    }

    @CalledByNative
    public int getSamplesPerCall() {
        return this.samplesPerCall;
    }

    public String toString() {
        return "AudioParams{sampleRate=" + this.sampleRate + ", channel=" + this.channel + ", mode=" + this.mode + ", samplesPerCall=" + this.samplesPerCall + '}';
    }
}
