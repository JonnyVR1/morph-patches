package io.agora.base;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class AudioFrame {
    public ByteBuffer buffer;
    public int bytesPerSample;
    public int channelNums;
    public int sampleRataHz;
    public int samplesPerChannel;
    public long timestamp;

    @CalledByNative
    public AudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        this.sampleRataHz = i;
        this.bytesPerSample = i2;
        this.channelNums = i3;
        this.samplesPerChannel = i4;
        this.timestamp = j;
        this.buffer = byteBuffer;
    }

    @CalledByNative
    public ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public int getBytesPerSample() {
        return this.bytesPerSample;
    }

    @CalledByNative
    public int getChannelNums() {
        return this.channelNums;
    }

    @CalledByNative
    public int getSampleRataHz() {
        return this.sampleRataHz;
    }

    @CalledByNative
    public int getSamplesPerChannel() {
        return this.samplesPerChannel;
    }

    @CalledByNative
    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "AudioFrame{sampleRataHz=" + this.sampleRataHz + ", bytesPerSample=" + this.bytesPerSample + ", channelNums=" + this.channelNums + ", samplesPerChannel=" + this.samplesPerChannel + ", timestamp=" + this.timestamp + '}';
    }
}
