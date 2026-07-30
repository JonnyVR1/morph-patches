package com.p074ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoDecoderConfig {
    VIDEO_DECODER_CONFIG_RAW(0),
    VIDEO_DECODER_CONFIG_ENCODE(1),
    VIDEO_DECODER_CONFIG_BOTH(2);

    private int value;

    VideoDecoderConfig(int i) {
        this.value = i;
    }

    public static VideoDecoderConfig fromId(int i) {
        for (VideoDecoderConfig videoDecoderConfig : values()) {
            if (videoDecoderConfig.value() == i) {
                return videoDecoderConfig;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
