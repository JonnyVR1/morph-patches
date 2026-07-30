package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public class AudioFormat {
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samplesPerCall;

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.samplesPerCall = 0;
    }

    public String toString() {
        return "AudioFormat{sampleRate='" + this.sampleRate + "', channel='" + this.channel + "', samplesPerCall=" + this.samplesPerCall + '}';
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel, int i) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.samplesPerCall = i;
    }
}
