package com.momo.rtcbase;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;

/* JADX INFO: loaded from: classes8.dex */
enum VideoCodecType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264(YtVideoEncoder.MIME_TYPE);

    private final String mimeType;

    VideoCodecType(String str) {
        this.mimeType = str;
    }

    public String mimeType() {
        return this.mimeType;
    }
}
