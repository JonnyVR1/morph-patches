package com.immomo.mediabase;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AudioProcessor {
    protected int mSampleBits;
    protected int mSampleChannels;
    protected int mSampleRate;

    public boolean prepare() {
        return true;
    }

    public abstract PacketData processAudioFrame(PacketData packetData, int i, long j);

    public abstract void release();

    public boolean reset() {
        return true;
    }

    public void setAudioInfo(int i, int i2, int i3) {
        this.mSampleRate = i;
        this.mSampleBits = i2;
        this.mSampleChannels = i3;
    }
}
