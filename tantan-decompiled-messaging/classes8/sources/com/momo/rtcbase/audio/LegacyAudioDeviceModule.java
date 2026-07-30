package com.momo.rtcbase.audio;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Deprecated
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public void release() {
    }

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
    }

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
    }
}
