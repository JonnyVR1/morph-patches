package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceReverbConfig {
    public float damping;
    public float decayTime;
    public float dryGain;
    public float preDelay;
    public float roomSize;
    public float wetGain;

    public VoiceReverbConfig(float f, float f2, float f3, float f4, float f5, float f6) {
        this.roomSize = f;
        this.decayTime = f2;
        this.damping = f3;
        this.wetGain = f4;
        this.dryGain = f5;
        this.preDelay = f6;
    }

    public String toString() {
        return "VoiceReverbConfig, room_size: " + this.roomSize + ", decay_time: " + this.decayTime + ", damping: " + this.damping + ", wet_gain: " + this.wetGain + ", dry_gain: " + this.dryGain + ", pre_delay: " + this.preDelay;
    }
}
