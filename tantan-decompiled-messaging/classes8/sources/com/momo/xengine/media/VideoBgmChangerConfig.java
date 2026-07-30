package com.momo.xengine.media;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class VideoBgmChangerConfig {
    private String bgmPath;
    private String outputPath;
    private String videoPath;
    private float volume_rate = 1.0f;

    public String getBgmPath() {
        return this.bgmPath;
    }

    public String getOutputPath() {
        return this.outputPath;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public float getVolumeRate() {
        return this.volume_rate;
    }

    public void setBgmPath(String str) {
        this.bgmPath = str;
    }

    public void setOutputPath(String str) {
        this.outputPath = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVolumeRate(float f) {
        this.volume_rate = f;
    }
}
