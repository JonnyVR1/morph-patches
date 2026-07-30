package com.immomo.mediacore.audio;

/* JADX INFO: loaded from: classes7.dex */
public class AudioQuality {
    public static final AudioQuality DEFAULT_AUDIO_QUALITY = new AudioQuality(44100, 96000);
    public int bitRate;
    public int channelNum;
    public int samplingRate;

    public AudioQuality() {
        this.samplingRate = 0;
        this.bitRate = 0;
        this.channelNum = 2;
    }

    public static AudioQuality merge(AudioQuality audioQuality, AudioQuality audioQuality2) {
        if (audioQuality2 != null && audioQuality != null) {
            if (audioQuality.samplingRate == 0) {
                audioQuality.samplingRate = audioQuality2.samplingRate;
            }
            if (audioQuality.bitRate == 0) {
                audioQuality.bitRate = audioQuality2.bitRate;
            }
        }
        return audioQuality;
    }

    public static AudioQuality parseQuality(String str) {
        AudioQuality audioQuality = new AudioQuality(0, 0);
        if (str != null) {
            String[] strArrSplit = str.split("-");
            try {
                audioQuality.bitRate = Integer.parseInt(strArrSplit[0]) * 1000;
                audioQuality.samplingRate = Integer.parseInt(strArrSplit[1]);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return audioQuality;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AudioQuality m225056clone() {
        return new AudioQuality(this.samplingRate, this.bitRate);
    }

    public boolean equals(AudioQuality audioQuality) {
        if (audioQuality == null) {
            return false;
        }
        return (audioQuality.samplingRate == this.samplingRate) & (audioQuality.bitRate == this.bitRate);
    }

    public AudioQuality(int i, int i2) {
        this.channelNum = 2;
        this.samplingRate = i;
        this.bitRate = i2;
    }
}
