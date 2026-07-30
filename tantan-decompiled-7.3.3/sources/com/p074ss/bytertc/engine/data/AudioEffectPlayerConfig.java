package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class AudioEffectPlayerConfig {
    public int pitch;
    public int playCount;
    public int startPos;
    public AudioMixingType type;

    public AudioEffectPlayerConfig() {
        this.type = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.playCount = 1;
        this.startPos = 0;
        this.pitch = 0;
    }

    public String toString() {
        return "AudioEffectPlayerConfig{type='" + this.type + "', playCount='" + this.playCount + "', startPos='" + this.startPos + "', pitch='" + this.pitch + "'}";
    }

    public AudioEffectPlayerConfig(AudioMixingType audioMixingType, int i, int i2, int i3) {
        AudioMixingType audioMixingType2 = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
        this.type = audioMixingType;
        this.playCount = i;
        this.startPos = i2;
        this.pitch = i3;
    }
}
