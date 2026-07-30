package com.momo.xengine.media;

/* JADX INFO: loaded from: classes8.dex */
public interface IEncodeTimestampCalculator {
    long calculateTimestamp(long j, float f);

    boolean init(long j);

    boolean isInit();

    void release();
}
