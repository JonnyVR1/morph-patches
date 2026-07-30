package com.momo.xengine.media;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioSamples {
    private byte[] data = null;
    private int samples;
    private long timestamp;

    public byte[] getData() {
        return this.data;
    }

    public int getSamples() {
        return this.samples;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setSamples(int i) {
        this.samples = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
