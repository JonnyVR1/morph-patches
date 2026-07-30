package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class AudioContentTypeConfig {
    public boolean hasMediaPlayer;
    public boolean hasMic;
    public boolean hasScreenAudio;

    public AudioContentTypeConfig() {
        this.hasMic = false;
        this.hasScreenAudio = false;
        this.hasMediaPlayer = false;
    }

    public String toString() {
        return "AudioContentTypeConfig{hasMic='" + this.hasMic + "', hasScreenAudio='" + this.hasScreenAudio + "', hasMediaPlayer='" + this.hasMediaPlayer + "'}";
    }

    public AudioContentTypeConfig(boolean z, boolean z2, boolean z3) {
        this.hasMic = z;
        this.hasScreenAudio = z2;
        this.hasMediaPlayer = z3;
    }
}
