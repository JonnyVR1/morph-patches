package com.p074ss.bytertc.engine.utils;

import com.p074ss.bytertc.engine.data.AudioChannel;
import com.p074ss.bytertc.engine.data.AudioSampleRate;
import com.p074ss.bytertc.engine.type.AudioCodecType;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class EncodedAudioFrameData {
    public AudioChannel channelNum;
    public AudioCodecType codecType;
    public ByteBuffer data;
    public ByteBuffer extraInfo;
    public int frameSizeMs;
    public AudioSampleRate sampleRate;
    public int size;
    public long timestampUs;

    public EncodedAudioFrameData(AudioCodecType audioCodecType, ByteBuffer byteBuffer, int i, long j, AudioSampleRate audioSampleRate, AudioChannel audioChannel, int i2) {
        this.codecType = audioCodecType;
        this.data = byteBuffer;
        this.size = i;
        this.timestampUs = j;
        this.sampleRate = audioSampleRate;
        this.channelNum = audioChannel;
        this.frameSizeMs = i2;
        this.extraInfo = null;
    }

    public EncodedAudioFrameData(AudioCodecType audioCodecType, ByteBuffer byteBuffer, int i, long j, AudioSampleRate audioSampleRate, AudioChannel audioChannel, int i2, ByteBuffer byteBuffer2) {
        this.codecType = audioCodecType;
        this.data = byteBuffer;
        this.size = i;
        this.timestampUs = j;
        this.sampleRate = audioSampleRate;
        this.channelNum = audioChannel;
        this.frameSizeMs = i2;
        this.extraInfo = byteBuffer2;
    }
}
