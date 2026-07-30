package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioSpeedNode;
import com.momo.xengine.media.types.TimeRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioTrack {
    private String audioSource;
    private TimeRange effectiveRange;
    private List<AudioSpeedNode> speedNodes = new ArrayList();
    private int trackID = hashCode();
    private long startTime = 0;
    private long endTime = -1;
    private int pitch = 0;
    private float gain = 1.0f;
    private boolean repeat = false;

    public String getAudioSource() {
        return this.audioSource;
    }

    public TimeRange getEffectiveRange() {
        return this.effectiveRange;
    }

    public long getEffectiveRangeBeginning() {
        TimeRange timeRange = this.effectiveRange;
        if (timeRange != null) {
            return timeRange.getBeginning();
        }
        return 0L;
    }

    public long getEffectiveRangeEnd() {
        TimeRange timeRange = this.effectiveRange;
        if (timeRange != null) {
            return timeRange.getEnd();
        }
        return -1L;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public float getGain() {
        return this.gain;
    }

    public int getPitch() {
        return this.pitch;
    }

    public List<AudioSpeedNode> getSpeedNodes() {
        return this.speedNodes;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public boolean isRepeat() {
        return this.repeat;
    }

    public void setAudioSource(String str) {
        this.audioSource = str;
    }

    public void setEffectiveRange(TimeRange timeRange) {
        this.effectiveRange = timeRange;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setGain(float f) {
        this.gain = f;
    }

    public void setPitch(int i) {
        this.pitch = i;
    }

    public void setRepeat(boolean z) {
        this.repeat = z;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setTrackID(int i) {
        this.trackID = i;
    }
}
