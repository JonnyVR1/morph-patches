package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final AbstractC1857c0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(AbstractC1857c0 abstractC1857c0, int i, long j) {
        this.timeline = abstractC1857c0;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
