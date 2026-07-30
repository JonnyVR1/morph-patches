package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.VideoRotation;

/* JADX INFO: loaded from: classes11.dex */
public class RemoteVideoRenderConfig {
    public int renderMode = 1;
    public int backgroundColor = 0;
    public VideoRotation renderRotation = VideoRotation.VIDEO_ROTATION_0;

    public String toString() {
        return "RemoteVideoRenderConfig{, renderMode=" + this.renderMode + ", background_color=" + this.backgroundColor + ", renderRotation=" + this.renderRotation.value() + '}';
    }
}
