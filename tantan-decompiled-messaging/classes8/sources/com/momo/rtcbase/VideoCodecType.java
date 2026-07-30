package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
enum VideoCodecType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc");

    private final String mimeType;

    VideoCodecType(String str) {
        this.mimeType = str;
    }

    public String mimeType() {
        return this.mimeType;
    }
}
