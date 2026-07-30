package com.momo.xengine.media;

/* JADX INFO: loaded from: classes8.dex */
public class EncodeTimestampCalculator implements IEncodeTimestampCalculator {
    long pointer = 0;

    private native long nativeCalculateTimestamp(long j, long j2, float f);

    private native long nativeInit(long j);

    private native void nativeRelease(long j);

    @Override // com.momo.xengine.media.IEncodeTimestampCalculator
    public long calculateTimestamp(long j, float f) {
        return nativeCalculateTimestamp(this.pointer, j, f);
    }

    @Override // com.momo.xengine.media.IEncodeTimestampCalculator
    public boolean init(long j) {
        long jNativeInit = nativeInit(j);
        this.pointer = jNativeInit;
        return jNativeInit != 0;
    }

    @Override // com.momo.xengine.media.IEncodeTimestampCalculator
    public boolean isInit() {
        return this.pointer != 0;
    }

    @Override // com.momo.xengine.media.IEncodeTimestampCalculator
    public void release() {
        long j = this.pointer;
        if (j != 0) {
            nativeRelease(j);
            this.pointer = 0L;
        }
    }
}
