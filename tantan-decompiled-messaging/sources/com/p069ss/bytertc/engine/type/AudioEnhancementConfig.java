package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public class AudioEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceSignaling;

    public AudioEnhancementConfig() {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
    }

    public AudioEnhancementConfig(boolean z, boolean z2) {
        this.enhanceSignaling = z;
        this.enhanceAudio = z2;
    }
}
