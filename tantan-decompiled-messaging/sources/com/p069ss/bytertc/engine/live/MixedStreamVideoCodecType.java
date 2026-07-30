package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamVideoCodecType {
    MIXED_STREAM_VIDEO_CODEC_TYPE_H264("H264"),
    MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1("ByteVC1");

    private String videoCodecType;

    MixedStreamVideoCodecType(String str) {
        this.videoCodecType = str;
    }

    public String getValue() {
        return this.videoCodecType;
    }
}
