package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.type.MediaTypeEnhancementConfig;

/* JADX INFO: loaded from: classes13.dex */
public class InternalMediaTypeEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceScreenAudio;
    public boolean enhanceScreenVideo;
    public boolean enhanceSignaling;
    public boolean enhanceVideo;

    public InternalMediaTypeEnhancementConfig(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
        this.enhanceVideo = false;
        this.enhanceScreenAudio = false;
        this.enhanceScreenVideo = false;
        this.enhanceSignaling = mediaTypeEnhancementConfig.enhanceSignaling;
        this.enhanceAudio = mediaTypeEnhancementConfig.enhanceAudio;
        this.enhanceVideo = mediaTypeEnhancementConfig.enhanceVideo;
        this.enhanceScreenAudio = mediaTypeEnhancementConfig.enhanceScreenAudio;
        this.enhanceScreenVideo = mediaTypeEnhancementConfig.enhanceScreenVideo;
    }

    @CalledByNative
    public boolean getAudioEnhance() {
        return this.enhanceAudio;
    }

    @CalledByNative
    public boolean getScreenAudioEnhance() {
        return this.enhanceScreenAudio;
    }

    @CalledByNative
    public boolean getScreenVideoEnhance() {
        return this.enhanceScreenVideo;
    }

    @CalledByNative
    public boolean getSignalingEnhance() {
        return this.enhanceSignaling;
    }

    @CalledByNative
    public boolean getVideoEnhance() {
        return this.enhanceVideo;
    }
}
