package com.immomo.moment.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class VideoFragment implements Serializable {
    private String videoPath = null;
    private String fragmentName = null;
    private long fragmentDuration = 0;
    private float speed = 1.0f;

    public long getDuration() {
        return this.fragmentDuration;
    }

    public String getFragmentName() {
        return this.fragmentName;
    }

    public float getSpeed() {
        return this.speed;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public void setDuration(long j) {
        this.fragmentDuration = j;
    }

    public void setFragmentName(String str) {
        this.fragmentName = str;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }
}
