package com.immomo.mediacore.strinf;

/* JADX INFO: loaded from: classes7.dex */
public class VideoQuality {
    public static final VideoQuality DEFAULT_VIDEO_QUALITY = new VideoQuality(480, 854, 20, 500000);
    public int bitrate;
    public int framerate;
    public int orientation;
    public int resX;
    public int resY;

    public VideoQuality() {
        this.framerate = 0;
        this.bitrate = 0;
        this.resX = 0;
        this.resY = 0;
        this.orientation = 90;
    }

    public static VideoQuality merge(VideoQuality videoQuality, VideoQuality videoQuality2) {
        if (videoQuality2 != null && videoQuality != null) {
            if (videoQuality.resX == 0) {
                videoQuality.resX = videoQuality2.resX;
            }
            if (videoQuality.resY == 0) {
                videoQuality.resY = videoQuality2.resY;
            }
            if (videoQuality.framerate == 0) {
                videoQuality.framerate = videoQuality2.framerate;
            }
            if (videoQuality.bitrate == 0) {
                videoQuality.bitrate = videoQuality2.bitrate;
            }
            if (videoQuality.orientation == 90) {
                videoQuality.orientation = videoQuality2.orientation;
            }
        }
        return videoQuality;
    }

    public static VideoQuality parseQuality(String str) {
        VideoQuality videoQuality = new VideoQuality(0, 0, 0, 0);
        if (str != null) {
            String[] strArrSplit = str.split("-");
            try {
                videoQuality.bitrate = Integer.parseInt(strArrSplit[0]) * 1000;
                videoQuality.framerate = Integer.parseInt(strArrSplit[1]);
                videoQuality.resX = Integer.parseInt(strArrSplit[2]);
                videoQuality.resY = Integer.parseInt(strArrSplit[3]);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return videoQuality;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VideoQuality m225057clone() {
        return new VideoQuality(this.resX, this.resY, this.framerate, this.bitrate, this.orientation);
    }

    public boolean equals(VideoQuality videoQuality) {
        if (videoQuality == null) {
            return false;
        }
        return (videoQuality.resX == this.resX) & (videoQuality.resY == this.resY) & (videoQuality.framerate == this.framerate) & (videoQuality.bitrate == this.bitrate) & (videoQuality.orientation == this.orientation);
    }

    public VideoQuality(int i, int i2, int i3, int i4, int i5) {
        this.framerate = i3;
        this.bitrate = i4;
        this.resX = i;
        this.resY = i2;
        this.orientation = i5;
    }

    public VideoQuality(int i, int i2, int i3, int i4) {
        this.orientation = 90;
        this.framerate = i3;
        this.bitrate = i4;
        this.resX = i;
        this.resY = i2;
    }
}
