package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMediaOptions {
    public Integer audienceLatencyLevel;
    public Integer audioDelayMs;
    public Boolean autoSubscribeAudio;
    public Boolean autoSubscribeVideo;
    public Integer channelProfile;
    public Integer clientRoleType;
    public Integer customVideoTrackId;
    public Integer defaultVideoStreamType;
    public Boolean enableAudioRecordingOrPlayout;
    public Boolean enableBuiltInMediaEncryption;
    public Boolean isAudioFilterable;
    public Boolean isInteractiveAudience;
    public Integer mediaPlayerAudioDelayMs;
    public String parameters;
    public Boolean publishCameraTrack;
    public Boolean publishCustomAudioTrack;
    public Integer publishCustomAudioTrackId;
    public Boolean publishCustomVideoTrack;
    public Boolean publishEncodedVideoTrack;
    public Boolean publishFourthCameraTrack;
    public Boolean publishLipSyncTrack;
    public Boolean publishMediaPlayerAudioTrack;
    public Integer publishMediaPlayerId;
    public Boolean publishMediaPlayerVideoTrack;
    public Boolean publishMicrophoneTrack;
    public Boolean publishMixedAudioTrack;
    public Boolean publishRhythmPlayerTrack;
    public Boolean publishScreenCaptureAudio;
    public Boolean publishScreenCaptureVideo;
    public Boolean publishSecondaryCameraTrack;
    public Boolean publishThirdCameraTrack;
    public Boolean publishTranscodedVideoTrack;
    public Boolean startPreview;
    public String token;

    public ChannelMediaOptions(Integer num) {
        this.clientRoleType = num;
    }

    @CalledByNative
    public Integer getAudienceLatencyLevel() {
        return this.audienceLatencyLevel;
    }

    @CalledByNative
    public Integer getAudioDelayMs() {
        return this.audioDelayMs;
    }

    @CalledByNative
    public Integer getChannelProfile() {
        return this.channelProfile;
    }

    @CalledByNative
    public Integer getClientRoleType() {
        return this.clientRoleType;
    }

    @CalledByNative
    public Integer getCustomVideoTrackId() {
        return this.customVideoTrackId;
    }

    @CalledByNative
    public Integer getDefaultVideoStreamType() {
        return this.defaultVideoStreamType;
    }

    @CalledByNative
    public Boolean getIsAudioFilterable() {
        return this.isAudioFilterable;
    }

    @CalledByNative
    public Integer getMediaPlayerAudioDelayMs() {
        return this.mediaPlayerAudioDelayMs;
    }

    @CalledByNative
    public String getParameters() {
        return this.parameters;
    }

    @CalledByNative
    public Integer getPublishCustomAudioTrackId() {
        return this.publishCustomAudioTrackId;
    }

    @CalledByNative
    public Integer getPublishMediaPlayerId() {
        return this.publishMediaPlayerId;
    }

    @CalledByNative
    public Boolean getPublishRhythmPlayerTrack() {
        return this.publishRhythmPlayerTrack;
    }

    @CalledByNative
    public String getToken() {
        return this.token;
    }

    @CalledByNative
    public Boolean isAutoSubscribeAudio() {
        return this.autoSubscribeAudio;
    }

    @CalledByNative
    public Boolean isAutoSubscribeVideo() {
        return this.autoSubscribeVideo;
    }

    @CalledByNative
    public Boolean isEnableAudioRecordingOrPlayout() {
        return this.enableAudioRecordingOrPlayout;
    }

    @CalledByNative
    public Boolean isEnableBuiltInMediaEncryption() {
        return this.enableBuiltInMediaEncryption;
    }

    @CalledByNative
    public Boolean isInteractiveAudience() {
        return this.isInteractiveAudience;
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
    public Boolean isPublishEncodedVideoTrack() {
        return this.publishEncodedVideoTrack;
    }

    @CalledByNative
    public Boolean isPublishFourthCameraTrack() {
        return this.publishFourthCameraTrack;
    }

    @CalledByNative
    public Boolean isPublishLipSyncTrack() {
        return this.publishLipSyncTrack;
    }

    @CalledByNative
    public Boolean isPublishMediaPlayerAudioTrack() {
        return this.publishMediaPlayerAudioTrack;
    }

    @CalledByNative
    public Boolean isPublishMediaPlayerVideoTrack() {
        return this.publishMediaPlayerVideoTrack;
    }

    @CalledByNative
    public Boolean isPublishMicrophoneTrack() {
        return this.publishMicrophoneTrack;
    }

    @CalledByNative
    public Boolean isPublishMixedAudioTrack() {
        return this.publishMixedAudioTrack;
    }

    @CalledByNative
    public Boolean isPublishScreenCaptureAudio() {
        return this.publishScreenCaptureAudio;
    }

    @CalledByNative
    public Boolean isPublishScreenCaptureVideo() {
        return this.publishScreenCaptureVideo;
    }

    @CalledByNative
    public Boolean isPublishSecondaryCameraTrack() {
        return this.publishSecondaryCameraTrack;
    }

    @CalledByNative
    public Boolean isPublishThirdCameraTrack() {
        return this.publishThirdCameraTrack;
    }

    @CalledByNative
    public Boolean isPublishTranscodedVideoTrack() {
        return this.publishTranscodedVideoTrack;
    }

    @CalledByNative
    public Boolean isStartPreview() {
        return this.startPreview;
    }

    public String toString() {
        return "publishCameraTrack=" + this.publishCameraTrack + " publishSecondaryCameraTrack=" + this.publishSecondaryCameraTrack + " publishThirdCameraTrack=" + this.publishThirdCameraTrack + " publishFourthCameraTrack=" + this.publishFourthCameraTrack + " publishScreenCaptureVideo=" + this.publishScreenCaptureVideo + " publishScreenCaptureAudio=" + this.publishScreenCaptureAudio + " publishCustomAudioTrack=" + this.publishCustomAudioTrack + " publishCustomAudioTrackId=" + this.publishCustomAudioTrackId + " publishCustomVideoTrack=" + this.publishCustomVideoTrack + " publishEncodedVideoTrack=" + this.publishEncodedVideoTrack + " publishMediaPlayerAudioTrack=" + this.publishMediaPlayerAudioTrack + " publishMediaPlayerVideoTrack=" + this.publishMediaPlayerVideoTrack + " publishMixedAudioTrack=" + this.publishMixedAudioTrack + " publishTranscodedVideoTrack=" + this.publishTranscodedVideoTrack + " publishLipSyncdVideoTrack=" + this.publishLipSyncTrack + " publishMediaPlayerId=" + this.publishMediaPlayerId + " publishMicrophoneTrack=" + this.publishMicrophoneTrack + " autoSubscribeAudio=" + this.autoSubscribeAudio + " autoSubscribeVideo=" + this.autoSubscribeVideo + " startPrevie=" + this.startPreview + " clientRoleType=" + this.clientRoleType + " audienceLatencyLevel=" + this.audienceLatencyLevel + " defaultVideoStreamType=" + this.defaultVideoStreamType + " channelProfile=" + this.channelProfile + " audioDelayMs=" + this.audioDelayMs + " enableBuiltInMediaEncryption=" + this.enableBuiltInMediaEncryption + " publishRhythmPlayerTrack=" + this.publishRhythmPlayerTrack + " isAudioFilterable=" + this.isAudioFilterable + " mediaPlayerAudioDelayMs=" + this.mediaPlayerAudioDelayMs + " customVideoTrackId=" + this.customVideoTrackId + " isInteractiveAudience=" + this.isInteractiveAudience + " parameters=" + this.parameters;
    }

    public ChannelMediaOptions() {
    }
}
