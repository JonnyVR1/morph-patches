package com.immomo.moment.mediautils.cmds;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class AudioBackground implements Serializable {

    @SerializedName("path")
    private String bgPath;
    private long end;

    @SerializedName("cycle")
    private boolean isCycle;
    private float ratio;
    private long start;

    public AudioBackground(String str, float f, long j, long j2, boolean z) {
        this.bgPath = str;
        this.ratio = f;
        this.start = j;
        this.end = j2;
        this.isCycle = z;
    }

    public String getBgPath() {
        return this.bgPath;
    }

    public long getEnd() {
        return this.end;
    }

    public float getRatio() {
        return this.ratio;
    }

    public long getStart() {
        return this.start;
    }

    public boolean isCycle() {
        return this.isCycle;
    }

    public void setBgPath(String str) {
        this.bgPath = str;
    }

    public void setCycle(boolean z) {
        this.isCycle = z;
    }

    public void setEnd(long j) {
        this.end = j;
    }

    public void setRatio(float f) {
        this.ratio = f;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public AudioBackground() {
    }
}
