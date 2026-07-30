package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioSpeedNode extends TimeRange {
    private float speed;

    public AudioSpeedNode(long j, long j2) {
        super(j, j2);
        this.speed = 1.0f;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public AudioSpeedNode(long j, long j2, float f) {
        super(j, j2);
        this.speed = f;
    }
}
