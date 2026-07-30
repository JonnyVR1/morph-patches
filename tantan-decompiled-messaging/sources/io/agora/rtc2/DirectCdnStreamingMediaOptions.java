package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class DirectCdnStreamingMediaOptions {
    public Integer customVideoTrackId;
    public Boolean publishCameraTrack;
    public Boolean publishCustomAudioTrack;
    public Boolean publishCustomVideoTrack;
    public Boolean publishMediaPlayerAudioTrack;
    public Integer publishMediaPlayerId;
    public Boolean publishMicrophoneTrack;

    public DirectCdnStreamingMediaOptions() {
        Boolean bool = Boolean.FALSE;
        this.publishCameraTrack = bool;
        this.publishMicrophoneTrack = bool;
        this.publishCustomAudioTrack = bool;
        this.publishCustomVideoTrack = bool;
        this.publishMediaPlayerAudioTrack = bool;
        this.publishMediaPlayerId = 0;
        this.customVideoTrackId = 0;
    }

    @CalledByNative
    public Integer getCustomVideoTrackId() {
        return this.customVideoTrackId;
    }

    @CalledByNative
    public Integer getPublishMediaPlayerId() {
        return this.publishMediaPlayerId;
    }

    @CalledByNative
    public Boolean isPublishCameraTrack() {
        return this.publishCameraTrack;
    }

    @CalledByNative
    public Boolean isPublishCustomAudioTrack() {
        return this.publishCustomAudioTrack;
    }

    @CalledByNative
    public Boolean isPublishCustomVideoTrack() {
        return this.publishCustomVideoTrack;
    }

    @CalledByNative
    public Boolean isPublishMediaPlayerAudioTrack() {
        return this.publishMediaPlayerAudioTrack;
    }

    @CalledByNative
    public Boolean isPublishMicrophoneTrack() {
        return this.publishMicrophoneTrack;
    }

    public String toString() {
        return "publishCameraTrack=" + this.publishCameraTrack + " publishMicrophoneTrack=" + this.publishMicrophoneTrack + " publishCustomAudioTrack=" + this.publishCustomAudioTrack + " publishCustomVideoTrack=" + this.publishCustomVideoTrack + " publishMediaPlayerAudioTrack=" + this.publishMediaPlayerAudioTrack + " publishMediaPlayerId=" + this.publishMediaPlayerId + " customVideoTrackId=" + this.customVideoTrackId;
    }
}
