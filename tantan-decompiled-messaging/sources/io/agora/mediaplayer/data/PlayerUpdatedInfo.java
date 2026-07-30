package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerUpdatedInfo {
    private long audioBitsPerSample;
    private long audioChannels;
    private long audioSampleRate;
    private String deviceId;
    private String internalPlayerUuid;
    private long videoHeight;
    private long videoWidth;

    @CalledByNative
    public PlayerUpdatedInfo(String str, String str2, long j, long j2, long j3, long j4, long j5) {
        this.internalPlayerUuid = str;
        this.deviceId = str2;
        this.videoHeight = j;
        this.videoWidth = j2;
        this.audioSampleRate = j3;
        this.audioChannels = j4;
        this.audioBitsPerSample = j5;
    }

    public long getAudioBitsPerSample() {
        return this.audioBitsPerSample;
    }

    public long getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @CalledByNative
    public String getDeviceId() {
        return this.deviceId;
    }

    @CalledByNative
    public String getInternalPlayerUuid() {
        return this.internalPlayerUuid;
    }

    public long getVideoHeight() {
        return this.videoHeight;
    }

    public long getVideoWidth() {
        return this.videoWidth;
    }

    public long getaudioChannels() {
        return this.audioChannels;
    }

    @CalledByNative
    public void setAudioBitsPerSample(long j) {
        this.audioBitsPerSample = j;
    }

    @CalledByNative
    public void setAudioChannels(long j) {
        this.audioChannels = j;
    }

    @CalledByNative
    public void setAudioSampleRate(long j) {
        this.audioSampleRate = j;
    }

    @CalledByNative
    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    @CalledByNative
    public void setInternalPlayerUuid(String str) {
        this.internalPlayerUuid = str;
    }

    @CalledByNative
    public void setVideoHeight(long j) {
        this.videoHeight = j;
    }

    @CalledByNative
    public void setVideoWidth(long j) {
        this.videoWidth = j;
    }

    public String toString() {
        return "PlayerUpdatedInfo{internalPlayerUuid=" + this.internalPlayerUuid + ", deviceId=" + this.deviceId + "videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", audioSampleRate=" + this.audioSampleRate + "audioChannels=" + this.audioChannels + "audioBitsPerSample=" + this.audioBitsPerSample + '}';
    }

    @CalledByNative
    public PlayerUpdatedInfo(String str, String str2) {
        this.internalPlayerUuid = str;
        this.deviceId = str2;
    }

    public PlayerUpdatedInfo() {
        this.internalPlayerUuid = null;
        this.deviceId = null;
    }
}
