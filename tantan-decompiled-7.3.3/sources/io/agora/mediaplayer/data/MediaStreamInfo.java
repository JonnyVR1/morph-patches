package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class MediaStreamInfo {
    private int audioBytesPerSample;
    private int audioChannels;
    private int audioSampleRate;
    private String codecName;
    private long duration;
    private String language;
    private int mediaStreamType;
    private int streamIndex;
    private int videoBitRate;
    private int videoFrameRate;
    private int videoHeight;
    private int videoRotation;
    private int videoWidth;

    @CalledByNative
    public MediaStreamInfo(int i, int i2, String str, String str2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j) {
        this.streamIndex = i;
        this.mediaStreamType = i2;
        this.codecName = str;
        this.language = str2;
        this.videoFrameRate = i3;
        this.videoBitRate = i4;
        this.videoWidth = i5;
        this.videoHeight = i6;
        this.videoRotation = i7;
        this.audioSampleRate = i8;
        this.audioChannels = i9;
        this.duration = j;
    }

    @CalledByNative
    public int getAudioBytesPerSample() {
        return this.audioBytesPerSample;
    }

    @CalledByNative
    public int getAudioChannels() {
        return this.audioChannels;
    }

    @CalledByNative
    public int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @CalledByNative
    public String getCodecName() {
        return this.codecName;
    }

    @CalledByNative
    public long getDuration() {
        return this.duration;
    }

    @CalledByNative
    public String getLanguage() {
        return this.language;
    }

    @CalledByNative
    public int getMediaStreamType() {
        return this.mediaStreamType;
    }

    @CalledByNative
    public int getStreamIndex() {
        return this.streamIndex;
    }

    @CalledByNative
    public int getVideoBitRate() {
        return this.videoBitRate;
    }

    @CalledByNative
    public int getVideoFrameRate() {
        return this.videoFrameRate;
    }

    @CalledByNative
    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoRotation() {
        return this.videoRotation;
    }

    @CalledByNative
    public int getVideoWidth() {
        return this.videoWidth;
    }

    public void setAudioBytesPerSample(int i) {
        this.audioBytesPerSample = i;
    }

    public void setAudioChannels(int i) {
        this.audioChannels = i;
    }

    public void setAudioSampleRate(int i) {
        this.audioSampleRate = i;
    }

    public void setCodecName(String str) {
        this.codecName = str;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMediaStreamType(int i) {
        this.mediaStreamType = i;
    }

    public void setStreamIndex(int i) {
        this.streamIndex = i;
    }

    public void setVideoBitRate(int i) {
        this.videoBitRate = i;
    }

    public void setVideoFrameRate(int i) {
        this.videoFrameRate = i;
    }

    public void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public void setVideoRotation(int i) {
        this.videoRotation = i;
    }

    public void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public String toString() {
        return "MediaStreamInfo{streamIndex=" + this.streamIndex + ", mediaStreamType=" + this.mediaStreamType + ", codecName='" + this.codecName + "', language='" + this.language + "', videoFrameRate=" + this.videoFrameRate + ", videoBitRate=" + this.videoBitRate + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", audioSampleRate=" + this.audioSampleRate + ", videoRotation=" + this.videoRotation + ", audioChannels=" + this.audioChannels + ", duration=" + this.duration + '}';
    }

    public MediaStreamInfo() {
    }
}
