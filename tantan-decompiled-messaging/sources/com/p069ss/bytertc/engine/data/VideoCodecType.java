package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoCodecType {
    VIDEO_CODEC_TYPE_UNKNOWN(0),
    VIDEO_CODEC_TYPE_H264(1),
    VIDEO_CODEC_TYPE_BYTEVC1(2);

    int value;

    VideoCodecType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoCodecType fromId(int i) {
        for (VideoCodecType videoCodecType : values()) {
            if (videoCodecType.value() == i) {
                return videoCodecType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
