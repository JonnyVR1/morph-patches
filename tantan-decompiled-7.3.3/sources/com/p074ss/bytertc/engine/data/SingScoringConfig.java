package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class SingScoringConfig {
    public String lyricsFilepath;
    public String midiFilepath;
    public MulDimSingScoringMode mode;
    public AudioSampleRate sampleRate;

    public SingScoringConfig(AudioSampleRate audioSampleRate, MulDimSingScoringMode mulDimSingScoringMode, String str, String str2) {
        this.sampleRate = audioSampleRate;
        this.mode = mulDimSingScoringMode;
        this.lyricsFilepath = str;
        this.midiFilepath = str2;
    }
}
