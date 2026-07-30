package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public enum MixedStreamClientMixVideoFormat {
    MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420(0),
    MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_TEXTURE_2D(1),
    MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_CVPIXEL_BUFFER_BGRA(2),
    MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_NV12(3);

    private int videoFormat;

    MixedStreamClientMixVideoFormat(int i) {
        this.videoFormat = i;
    }

    public int getValue() {
        return this.videoFormat;
    }
}
