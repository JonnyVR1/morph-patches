package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class RecordingInfo {
    public String filePath;
    public int height;
    public VideoCodecType videoCodecType;
    public int width;

    public RecordingInfo(String str, VideoCodecType videoCodecType, int i, int i2) {
        this.filePath = str;
        this.videoCodecType = videoCodecType;
        this.width = i;
        this.height = i2;
    }

    @CalledByNative
    public static RecordingInfo create(String str, VideoCodecType videoCodecType, int i, int i2) {
        return new RecordingInfo(str, videoCodecType, i, i2);
    }
}
