package com.p074ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes11.dex */
public class ScreenSharingParameters {
    public int bitrate;
    public int frameRate;
    public int maxHeight;
    public int maxWidth;
    public int minBitrate;

    public ScreenSharingParameters() {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.frameRate = 15;
        this.bitrate = -1;
        this.minBitrate = 0;
    }

    public ScreenSharingParameters(int i, int i2, int i3, int i4, int i5) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
        this.minBitrate = i5;
    }
}
