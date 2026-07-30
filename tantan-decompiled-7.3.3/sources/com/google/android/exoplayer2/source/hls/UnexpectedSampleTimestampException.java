package com.google.android.exoplayer2.source.hls;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import p153l.bmk0;
import p153l.crx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final crx mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(crx crxVar, long j, long j2) {
        super("Unexpected sample timestamp: " + bmk0.m105152l1(j2) + " in chunk [" + crxVar.f144932g + ", " + crxVar.f144933h + Constants.AES_SUFFIX);
        this.mediaChunk = crxVar;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j2;
    }
}
