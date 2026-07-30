package com.p069ss.bytertc.engine.utils;

import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioSampleRate;

/* JADX INFO: loaded from: classes13.dex */
public class AudioFrame {
    public byte[] buffer;
    public AudioChannel channel;
    public byte[] extraInfo;
    public AudioSampleRate sampleRate;
    public int samples;

    public AudioFrame(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.extraInfo = null;
    }

    public AudioFrame() {
    }

    public AudioFrame(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel, byte[] bArr2) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.extraInfo = bArr2;
    }
}
