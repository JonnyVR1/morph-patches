package com.momo.xengine.media;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioTrackDesc {
    private String path;
    private long start_time = 0;
    private long duration = 0;
    private float speed = 1.0f;
    private int volumedB = 0;
    private long fade_in = 0;
    private long fade_out = 0;
    private long track_duration = 0;
    private long offset = 0;
    private long track_time = 0;
    private long track_end_time = 0;
    private int track_index = 0;
    private Map<Float, Float> speedNodes = null;

    public long getDuration() {
        return this.duration;
    }

    public long getFade_in() {
        return this.fade_in;
    }

    public long getFade_out() {
        return this.fade_out;
    }

    public long getOffset() {
        return this.offset;
    }

    public String getPath() {
        return this.path;
    }

    public float getSpeed() {
        return this.speed;
    }

    public Map<Float, Float> getSpeedNodes() {
        return this.speedNodes;
    }

    public float[] getSpeedNodesFloatArray() {
        Map<Float, Float> map = this.speedNodes;
        if (map == null || map.size() == 0 || this.speedNodes.size() % 2 != 0) {
            return null;
        }
        float[] fArr = new float[this.speedNodes.size() * 2];
        int i = 0;
        for (Float f : this.speedNodes.keySet()) {
            int i2 = i * 2;
            fArr[i2] = f.floatValue();
            fArr[i2 + 1] = this.speedNodes.get(f).floatValue();
            i++;
        }
        return fArr;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public long getTrack_duration() {
        return this.track_duration;
    }

    public long getTrack_end_time() {
        return this.track_end_time;
    }

    public int getTrack_index() {
        return this.track_index;
    }

    public long getTrack_time() {
        return this.track_time;
    }

    public int getVolumedB() {
        return this.volumedB;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setFade_in(long j) {
        this.fade_in = j;
    }

    public void setFade_out(long j) {
        this.fade_out = j;
    }

    public void setOffset(long j) {
        this.offset = j;
    }

    public void setPath(@Nullable String str) {
        this.path = str;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setSpeedNodes(Map<Float, Float> map) {
        this.speedNodes = map;
    }

    public void setStart_time(long j) {
        this.start_time = j;
    }

    public void setTrack_duration(long j) {
        this.track_duration = j;
    }

    public void setTrack_end_time(long j) {
        this.track_end_time = j;
    }

    public void setTrack_index(int i) {
        this.track_index = i;
    }

    public void setTrack_time(long j) {
        this.track_time = j;
    }

    public void setVolumedB(int i) {
        this.volumedB = i;
    }
}
