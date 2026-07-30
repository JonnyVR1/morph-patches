package com.immomo.moment.mediautils.cmds;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class TimeRangeScale implements Serializable {
    public static final float TIME_FAST = 0.25f;
    public static final float TIME_SLOW = 5.0f;
    public static final long TIME_SPACER_FAST = 500;
    public static final long TIME_SPACER_SLOW = 200;
    private long end;
    private float speed;
    private long start;

    public TimeRangeScale(long j, long j2, float f) {
        this.start = j;
        this.end = j2;
        this.speed = f;
    }

    public long getEnd() {
        return this.end;
    }

    public float getSpeed() {
        return this.speed;
    }

    public long getStart() {
        return this.start;
    }

    public void setEnd(long j) {
        this.end = j;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public TimeRangeScale() {
    }
}
