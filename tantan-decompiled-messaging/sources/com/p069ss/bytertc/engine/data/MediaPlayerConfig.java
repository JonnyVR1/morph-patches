package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public class MediaPlayerConfig {
    public boolean autoPlay;
    public long callbackOnProgressInterval;
    public int playCount;
    public int startPos;
    public boolean syncProgressToRecordFrame;
    public AudioMixingType type;

    public MediaPlayerConfig() {
        this.type = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.playCount = 1;
        this.startPos = 0;
        this.callbackOnProgressInterval = 0L;
        this.syncProgressToRecordFrame = false;
        this.autoPlay = true;
    }

    public String toString() {
        return "MediaPlayerConfig{type='" + this.type + "', playCount='" + this.playCount + "', startPos='" + this.startPos + "', autoPlay='" + this.autoPlay + "', syncProgressToRecordFrame='" + this.syncProgressToRecordFrame + "', callbackOnProgressInterval='" + this.callbackOnProgressInterval + "'}";
    }

    public MediaPlayerConfig(AudioMixingType audioMixingType, int i) {
        this(audioMixingType, i, 0, true, 0L, false);
    }

    public MediaPlayerConfig(AudioMixingType audioMixingType, int i, int i2, boolean z, long j, boolean z2) {
        AudioMixingType audioMixingType2 = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
        this.type = audioMixingType;
        this.playCount = i;
        this.startPos = i2;
        this.autoPlay = z;
        this.syncProgressToRecordFrame = z2;
        this.callbackOnProgressInterval = j;
    }
}
