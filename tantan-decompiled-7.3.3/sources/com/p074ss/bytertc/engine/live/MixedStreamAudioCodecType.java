package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public enum MixedStreamAudioCodecType {
    MIXED_STREAM_AUDIO_CODEC_TYPE_AAC("AAC");

    private String audioCodecType;

    MixedStreamAudioCodecType(String str) {
        this.audioCodecType = str;
    }

    public String getValue() {
        return this.audioCodecType;
    }
}
