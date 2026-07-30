package io.agora.rtc2;

/* JADX INFO: loaded from: classes2.dex */
public interface IAudioEffectManager {
    double getEffectsVolume();

    int pauseAllEffects();

    int pauseEffect(int i);

    int playEffect(int i, String str, int i2, double d, double d2, double d3);

    int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z);

    int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z, int i3);

    int preloadEffect(int i, String str);

    int preloadEffect(int i, String str, int i2);

    int resumeAllEffects();

    int resumeEffect(int i);

    int setEffectsVolume(double d);

    int setVolumeOfEffect(int i, double d);

    int stopAllEffects();

    int stopEffect(int i);

    int unloadEffect(int i);
}
