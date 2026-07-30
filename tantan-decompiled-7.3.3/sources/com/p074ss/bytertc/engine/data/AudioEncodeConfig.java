package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class AudioEncodeConfig {
    public int channelNum;
    public int codecType;
    public int encBitrate;
    public int encMode;
    public int packetSize;
    public int sampleRate;
    public int useDtx;
    public int useInbandfec;

    public AudioEncodeConfig() {
        this.codecType = -1;
        this.encMode = -1;
        this.channelNum = -1;
        this.encBitrate = -1;
        this.useDtx = -1;
        this.useInbandfec = -1;
        this.sampleRate = -1;
        this.packetSize = -1;
    }

    public String toString() {
        return "AudioEncodeConfig{codecType='" + this.codecType + "'encMode='" + this.encMode + "', channelNum='" + this.channelNum + "', encBitrate='" + this.encBitrate + "', useDtx='" + this.useDtx + "', useInbandfec='" + this.useInbandfec + "', sampleRate='" + this.sampleRate + "', packetSize='" + this.packetSize + "'}";
    }

    public AudioEncodeConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.codecType = i;
        this.encMode = i2;
        this.channelNum = i3;
        this.encBitrate = i4;
        this.useDtx = i5;
        this.useInbandfec = i6;
        this.sampleRate = i7;
        this.packetSize = i8;
    }
}
