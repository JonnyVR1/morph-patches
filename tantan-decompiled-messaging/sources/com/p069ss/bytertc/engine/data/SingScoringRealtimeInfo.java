package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class SingScoringRealtimeInfo {
    public int averageScore;
    public int currentPosition;
    public int sentenceIndex;
    public int sentenceScore;
    public int standardPitch;
    public int totalScore;
    public int userPitch;

    public SingScoringRealtimeInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.currentPosition = i;
        this.userPitch = i2;
        this.standardPitch = i3;
        this.sentenceIndex = i4;
        this.sentenceScore = i5;
        this.totalScore = i6;
        this.averageScore = i7;
    }

    @CalledByNative
    private static SingScoringRealtimeInfo create(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new SingScoringRealtimeInfo(i, i2, i3, i4, i5, i6, i7);
    }

    public String toString() {
        return "SingScoringRealtimeInfo{currentPosition='" + this.currentPosition + "'userPitch='" + this.userPitch + "'standardPitch='" + this.standardPitch + "'sentenceIndex='" + this.sentenceIndex + "'sentenceScore='" + this.sentenceScore + "'totalScore='" + this.totalScore + "'averageScore='" + this.averageScore + "'}";
    }
}
