package com.momo.xengine.media;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IEncodeTimestampCalculator {
    long calculateTimestamp(long j, float f);

    boolean init(long j);

    boolean isInit();

    void release();
}
