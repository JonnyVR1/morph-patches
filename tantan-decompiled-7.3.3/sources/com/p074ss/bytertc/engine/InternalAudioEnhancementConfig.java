package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.type.AudioEnhancementConfig;

/* JADX INFO: loaded from: classes11.dex */
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
