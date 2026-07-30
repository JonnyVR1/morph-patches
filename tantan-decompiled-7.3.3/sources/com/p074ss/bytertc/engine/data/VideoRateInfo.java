package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class VideoRateInfo {
    public int bitrateKbps;
    public int fps;

    public VideoRateInfo(int i, int i2) {
        this.fps = i;
        this.bitrateKbps = i2;
    }

    public String toString() {
        return "VideoRateInfo{fps='" + this.fps + "', bitrateKbps='" + this.bitrateKbps + "'}";
    }
}
