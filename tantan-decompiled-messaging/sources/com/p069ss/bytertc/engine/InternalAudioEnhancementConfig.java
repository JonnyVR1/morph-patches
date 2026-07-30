package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.type.AudioEnhancementConfig;

/* JADX INFO: loaded from: classes13.dex */
public class InternalAudioEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceSignaling;

    public InternalAudioEnhancementConfig(AudioEnhancementConfig audioEnhancementConfig) {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
        this.enhanceSignaling = audioEnhancementConfig.enhanceSignaling;
        this.enhanceAudio = audioEnhancementConfig.enhanceAudio;
    }

    @CalledByNative
    public boolean getAudioEnhance() {
        return this.enhanceAudio;
    }

    @CalledByNative
    public boolean getSignalingEnhance() {
        return this.enhanceSignaling;
    }
}
