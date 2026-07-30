package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final AbstractC1834c0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(AbstractC1834c0 abstractC1834c0, int i, long j) {
        this.timeline = abstractC1834c0;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
