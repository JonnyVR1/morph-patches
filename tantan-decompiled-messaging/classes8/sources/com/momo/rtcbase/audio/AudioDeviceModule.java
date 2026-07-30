package com.momo.rtcbase.audio;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z);

    void setSpeakerMute(boolean z);
}
