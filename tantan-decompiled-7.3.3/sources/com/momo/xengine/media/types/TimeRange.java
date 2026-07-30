package com.momo.xengine.media.types;

/* JADX INFO: loaded from: classes8.dex */
public class TimeRange {
    public static final long MEDIA_END = -1;
    long beginning;
    long end;

    public TimeRange(long j, long j2) {
        this.beginning = j;
        this.end = j2;
    }

    public long getBeginning() {
        return this.beginning;
    }

    public long getEnd() {
        return this.end;
    }

    public void setBeginning(long j) {
        this.beginning = j;
    }

    public void setEnd(long j) {
        this.end = j;
    }
}
