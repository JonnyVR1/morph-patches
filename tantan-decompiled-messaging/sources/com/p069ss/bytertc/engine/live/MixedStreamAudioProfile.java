package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamAudioProfile {
    MIXED_STREAM_AUDIO_PROFILE_LC("LC"),
    MIXED_STREAM_AUDIO_PROFILE_HEV1("HEv1"),
    MIXED_STREAM_AUDIO_PROFILE_HEV2("HEv2");

    private String aacProfile;

    MixedStreamAudioProfile(String str) {
        this.aacProfile = str;
    }

    public String getValue() {
        return this.aacProfile;
    }
}
