package com.p069ss.bytertc.engine.video;

import com.p069ss.bytertc.engine.data.VideoPixelFormat;

/* JADX INFO: loaded from: classes13.dex */
public class RemoteVideoSinkConfig {
    public RemoteVideoSinkPosition position = RemoteVideoSinkPosition.AFTER_POST_PROCESS;
    public VideoPixelFormat pixelFormat = VideoPixelFormat.UNKNOWN;
    public VideoApplyRotation applyRotation = VideoApplyRotation.DEFAULT;
    public VideoSinkMirrorType mirrorType = VideoSinkMirrorType.OFF;
}
