package com.momo.momortc;

/* JADX INFO: loaded from: classes6.dex */
public interface IAudioEffectManager {
    float getEffectsVolume();

    int getSabineEnable();

    int pauseAllEffects();

    int pauseEffect(int i);

    int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z);

    int preloadEffect(int i, String str);

    int resumeAllEffects();

    int resumeEffect(int i);

    int setEffectsVolume(float f);

    int setVolumeOfEffect(int i, float f);

    int stopAllEffects();

    int stopEffect(int i);

    int unloadEffect(int i);
}
