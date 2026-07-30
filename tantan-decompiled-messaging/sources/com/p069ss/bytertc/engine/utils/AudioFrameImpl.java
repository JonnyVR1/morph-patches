package com.p069ss.bytertc.engine.utils;

import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioFrameType;
import com.p069ss.bytertc.engine.data.AudioSampleRate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class AudioFrameImpl implements IAudioFrame {
    private ByteBuffer byteBuffer;
    private AudioChannel channel;
    private ByteBuffer extraBuffer;
    private AudioFrameType frameType;
    private AudioSampleRate sampleRate;
    private int samplesPerChannel;
    private long timestamp;

    public AudioFrameImpl(ByteBuffer byteBuffer, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel, ByteBuffer byteBuffer2) {
        this.byteBuffer = null;
        this.samplesPerChannel = 0;
        this.frameType = AudioFrameType.FRAME_TYPE_PCM16;
        this.timestamp = 0L;
        this.byteBuffer = byteBuffer;
        this.samplesPerChannel = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.extraBuffer = byteBuffer2;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public AudioChannel channel() {
        return this.channel;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public int data_size() {
        return this.samplesPerChannel * this.channel.value() * 2;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public int extraInfoSize() {
        ByteBuffer byteBuffer = this.extraBuffer;
        if (byteBuffer != null) {
            return byteBuffer.capacity();
        }
        return 0;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public AudioFrameType frame_type() {
        return this.frameType;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public ByteBuffer getDataBuffer() {
        return this.byteBuffer;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public ByteBuffer getExtraInfo() {
        return this.extraBuffer;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public void release() {
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public AudioSampleRate sample_rate() {
        return this.sampleRate;
    }

    @Override // com.p069ss.bytertc.engine.utils.IAudioFrame
    public long timestamp_us() {
        return this.timestamp;
    }

    public AudioFrameImpl(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel, byte[] bArr2) {
        this(ByteBuffer.wrap(bArr), i, audioSampleRate, audioChannel, ByteBuffer.wrap(bArr2));
    }

    public AudioFrameImpl() {
        this.byteBuffer = null;
        this.samplesPerChannel = 0;
        this.frameType = AudioFrameType.FRAME_TYPE_PCM16;
        this.timestamp = 0L;
        this.extraBuffer = null;
    }

    public AudioFrameImpl(ByteBuffer byteBuffer, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.byteBuffer = null;
        this.samplesPerChannel = 0;
        this.frameType = AudioFrameType.FRAME_TYPE_PCM16;
        this.timestamp = 0L;
        this.byteBuffer = byteBuffer;
        this.samplesPerChannel = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.extraBuffer = null;
    }
}
