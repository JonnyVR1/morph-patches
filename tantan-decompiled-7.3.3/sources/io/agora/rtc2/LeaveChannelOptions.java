package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class LeaveChannelOptions {
    public boolean stopAudioMixing = true;
    public boolean stopAllEffect = true;
    public boolean stopMicrophoneRecording = true;

    @CalledByNative
    public boolean isStopAllEffect() {
        return this.stopAllEffect;
    }

    @CalledByNative
    public boolean isStopAudioMixing() {
        return this.stopAudioMixing;
    }

    @CalledByNative
    public boolean isStopMicrophoneRecording() {
        return this.stopMicrophoneRecording;
    }

    public String toString() {
        return "stopAudioMixing=" + this.stopAudioMixing + "stopAllEffect=" + this.stopAllEffect + "stopMicrophoneRecording=" + this.stopMicrophoneRecording;
    }
}
