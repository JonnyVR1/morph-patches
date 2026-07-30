package com.google.android.exoplayer2.source.hls;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import p149l.fix;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final fix mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(fix fixVar, long j, long j2) {
        super("Unexpected sample timestamp: " + vck0.m197874l1(j2) + " in chunk [" + fixVar.f136917g + ", " + fixVar.f136918h + Constants.AES_SUFFIX);
        this.mediaChunk = fixVar;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j2;
    }
}
