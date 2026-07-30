package com.momo.xeengine.audio;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface IXAudioPlayer {
    void end();

    int getBackgroundMusicCurrentPosition();

    int getBackgroundMusicDuration();

    float getBackgroundMusicVolume();

    float getEffectsVolume();

    boolean isBackgroundMusicPlaying();

    void pauseAllEffects();

    void pauseBackgroundMusic();

    void pauseEffect(int i);

    void playBackgroundMusic(String str, boolean z);

    int playEffect(String str, boolean z, float f);

    void resumeAllEffects();

    void resumeBackgroundMusic();

    void resumeEffect(int i);

    void rewindBackgroundMusic();

    void setBackgroundMusicCurrentPosition(int i);

    void setBackgroundMusicVolume(float f);

    void setEffectsVolume(float f);

    void stopAllEffects();

    void stopBackgroundMusic();

    void stopEffect(int i);
}
