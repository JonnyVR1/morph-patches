package com.bytedance.realx.video;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;

/* JADX INFO: loaded from: classes.dex */
enum RXVideoCodecStandard {
    H264(0),
    ByteVC1(1),
    Unknown(2),
    VP8(8),
    VP9(9);

    private final int value;

    RXVideoCodecStandard(int i) {
        this.value = i;
    }

    public static RXVideoCodecStandard fromValue(int i) {
        if (i == 0) {
            return H264;
        }
        if (i != 1) {
            return i != 8 ? H264 : VP8;
        }
        return ByteVC1;
    }

    public String mimeType() {
        int i = this.value;
        if (i != 1) {
            return i != 8 ? YtVideoEncoder.MIME_TYPE : "video/x-vnd.on2.vp8";
        }
        return "video/hevc";
    }

    public int toInt() {
        return this.value;
    }
}
