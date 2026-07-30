package io.agora.rtc2;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IRtcEngineEventHandler {

    public static class AgoraFacePositionInfo {
        public int distance;
        public int height;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f64021x;

        /* JADX INFO: renamed from: y */
        public int f64022y;
    }

    public static class AudioVolumeInfo {
        public int uid;
        public int vad;
        public double voicePitch;
        public int volume;
    }

    @Deprecated
    public static class ClientRole {
        public static final int CLIENT_ROLE_AUDIENCE = 2;
        public static final int CLIENT_ROLE_BROADCASTER = 1;
    }

    public static class DownlinkNetworkInfo {
        public int bandwidth_estimation_bps;
        public int lastmile_buffer_delay_time_ms;
    }

    public static class ErrorCode {
        public static final int ERR_ABORTED = 20;
        public static final int ERR_ADM_GENERAL_ERROR = 1005;
        public static final int ERR_ADM_INIT_PLAYOUT = 1008;
        public static final int ERR_ADM_INIT_RECORDING = 1011;
        public static final int ERR_ADM_START_PLAYOUT = 1009;
        public static final int ERR_ADM_START_RECORDING = 1012;
        public static final int ERR_ADM_STOP_PLAYOUT = 1010;
        public static final int ERR_ADM_STOP_RECORDING = 1013;
        public static final int ERR_ALREADY_IN_USE = 19;
        public static final int ERR_BIND_SOCKET = 13;
        public static final int ERR_BITRATE_LIMIT = 115;
        public static final int ERR_BUFFER_TOO_SMALL = 6;
        public static final int ERR_CANCELED = 11;
        public static final int ERR_CLIENT_IS_BANNED_BY_SERVER = 123;
        public static final int ERR_CONNECTION_INTERRUPTED = 111;
        public static final int ERR_CONNECTION_LOST = 112;
        public static final int ERR_DATASTREAM_DECRYPTION_FAILED = 122;
        public static final int ERR_DECRYPTION_FAILED = 120;
        public static final int ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISH = 130;
        public static final int ERR_FAILED = 1;
        public static final int ERR_INIT_NET_ENGINE = 21;
        public static final int ERR_INVALID_APP_ID = 101;
        public static final int ERR_INVALID_ARGUMENT = 2;
        public static final int ERR_INVALID_CHANNEL_NAME = 102;
        public static final int ERR_INVALID_TOKEN = 110;
        public static final int ERR_INVALID_USER_ACCOUNT = 134;
        public static final int ERR_INVALID_USER_ID = 121;
        public static final int ERR_JOIN_CHANNEL_REJECTED = 17;
        public static final int ERR_LEAVE_CHANNEL_REJECTED = 18;
        public static final int ERR_LICENSE_CREDENTIAL_INVALID = 131;
        public static final int ERR_LOAD_MEDIA_ENGINE = 1001;
        public static final int ERR_MODULE_NOT_FOUND = 157;
        public static final int ERR_NET_DOWN = 14;
        public static final int ERR_NOT_INITIALIZED = 7;
        public static final int ERR_NOT_IN_CHANNEL = 113;
        public static final int ERR_NOT_READY = 3;
        public static final int ERR_NOT_SUPPORTED = 4;
        public static final int ERR_NO_PERMISSION = 9;
        public static final int ERR_NO_SERVER_RESOURCES = 103;
        public static final int ERR_OK = 0;
        public static final int ERR_REFUSED = 5;
        public static final int ERR_RESOURCE_LIMITED = 22;
        public static final int ERR_SET_CLIENT_ROLE_NOT_AUTHORIZED = 119;
        public static final int ERR_SIZE_TOO_LARGE = 114;
        public static final int ERR_STREAM_MESSAGE_TIMEOUT = 117;
        public static final int ERR_TIMEDOUT = 10;
        public static final int ERR_TOKEN_EXPIRED = 109;
        public static final int ERR_TOO_MANY_DATA_STREAMS = 116;
        public static final int ERR_TOO_OFTEN = 12;
        public static final int ERR_VDM_CAMERA_NOT_AUTHORIZED = 1501;
    }

    public static class LastmileProbeResult {
        public int rtt;
        public short state;
        public LastmileProbeOneWayResult uplinkReport = new LastmileProbeOneWayResult();
        public LastmileProbeOneWayResult downlinkReport = new LastmileProbeOneWayResult();

        public static class LastmileProbeOneWayResult {
            public int availableBandwidth;
            public int jitter;
            public int packetLossRate;
        }
    }

    public static class LocalAudioStats {
        public int aecEstimatedDelay;
        public int audioDeviceDelay;
        public int audioPlayoutDelay;
        public int earMonitorDelay;
        public int internalCodec;
        public int numChannels;
        public int sentBitrate;
        public int sentSampleRate;
        public int txPacketLossRate;
    }

    public static class LocalVideoStats {
        public int captureBrightnessLevel;
        public int captureFrameHeight;
        public int captureFrameRate;
        public int captureFrameWidth;
        public int codecType;
        public boolean dualStreamEnabled;
        public int encodedBitrate;
        public int encodedFrameCount;
        public int encodedFrameHeight;
        public int encodedFrameWidth;
        public int encoderOutputFrameRate;
        public int hwEncoderAccelerating;
        public int qualityAdaptIndication;
        public int regulatedCaptureFrameHeight;
        public int regulatedCaptureFrameRate;
        public int regulatedCaptureFrameWidth;
        public int rendererOutputFrameRate;
        public int sentBitrate;
        public int sentFrameRate;
        public int targetBitrate;
        public int targetFrameRate;
        public int txPacketLossRate;
        public int uid;
    }

    @Deprecated
    public static class Quality {
        public static final int BAD = 4;
        public static final int DOWN = 6;
        public static final int EXCELLENT = 1;
        public static final int GOOD = 2;
        public static final int POOR = 3;
        public static final int UNKNOWN = 0;
        public static final int VBAD = 5;
    }

    public static class RemoteAudioStats {
        public int audioLossRate;
        public int e2eDelay;
        public int frozenCntByCustom;
        public int frozenRate;
        public int frozenRateByCustomPlcCount;
        public int frozenTimeByCustom;
        public int jitterBufferDelay;
        public int mosValue;
        public int networkTransportDelay;
        public int numChannels;
        public int plcCount;
        public long publishDuration;
        public int qoeQuality;
        public int quality;
        public int qualityChangedReason;
        public int receivedBitrate;
        public int receivedSampleRate;
        public int rxAudioBytes;
        public long totalActiveTime;
        public int totalFrozenTime;
        public int uid;
    }

    public static class RemoteVideoStats {
        public int avSyncTimeMs;
        public int decoderOutputFrameRate;
        public int delay;
        public int e2eDelay;
        public int frameLossRate;
        public int frozenRate;
        public int height;
        public int mosValue;
        public int packetLossRate;
        public long publishDuration;
        public int receivedBitrate;
        public int rendererOutputFrameRate;
        public int rxStreamType;
        public int rxVideoBytes;
        public long totalActiveTime;
        public int totalFrozenTime;
        public int uid;
        public int width;
    }

    public static class RtcStats {
        public int connectTimeMs;
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int gatewayRtt;
        public int lastmileDelay;
        public int memoryAppUsageInKbytes;
        public double memoryAppUsageRatio;
        public double memoryTotalUsageRatio;
        public int rxAudioBytes;
        public int rxAudioKBitRate;
        public int rxBytes;
        public int rxKBitRate;
        public int rxPacketLossRate;
        public int rxVideoBytes;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioBytes;
        public int txAudioKBitRate;
        public int txBytes;
        public int txKBitRate;
        public int txPacketLossRate;
        public int txVideoBytes;
        public int txVideoKBitRate;
        public int users;
    }

    public static class UplinkNetworkInfo {
        public int video_encoder_target_bitrate_bps;
    }

    @Deprecated
    public static class UserOfflineReason {
        public static final int USER_OFFLINE_DROPPED = 1;
        public static final int USER_OFFLINE_QUIT = 0;
    }

    public static class VideoLayout {
        public String channelId;
        public int height;
        public String strUid;
        public int uid;
        public int videoState;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f64023x;

        /* JADX INFO: renamed from: y */
        public int f64024y;

        public String toString() {
            return "VideoLayout{channelId='" + this.channelId + "', uid=" + this.uid + ", strUid='" + this.strUid + "', videoState=" + this.videoState + ", x=" + this.f64023x + ", y=" + this.f64024y + ", width=" + this.width + ", height=" + this.height + '}';
        }
    }

    public static class VideoLayoutInfo {
        public int height;
        public int layoutCount;
        public VideoLayout[] layoutList;
        public int width;

        public String toString() {
            return "VideoLayoutInfo{width=" + this.width + ", height=" + this.height + ", layoutCount=" + this.layoutCount + ", layoutList=" + Arrays.toString(this.layoutList) + '}';
        }
    }

    @Deprecated
    public static class VideoProfile {
        public static final int VIDEO_PROFILE_1080P = 60;
        public static final int VIDEO_PROFILE_1080P_3 = 62;
        public static final int VIDEO_PROFILE_1080P_5 = 64;
        public static final int VIDEO_PROFILE_120P = 0;
        public static final int VIDEO_PROFILE_120P_3 = 2;
        public static final int VIDEO_PROFILE_1440P = 66;
        public static final int VIDEO_PROFILE_1440P_2 = 67;
        public static final int VIDEO_PROFILE_180P = 10;
        public static final int VIDEO_PROFILE_180P_3 = 12;
        public static final int VIDEO_PROFILE_180P_4 = 13;
        public static final int VIDEO_PROFILE_240P = 20;
        public static final int VIDEO_PROFILE_240P_3 = 22;
        public static final int VIDEO_PROFILE_240P_4 = 23;
        public static final int VIDEO_PROFILE_360P = 30;
        public static final int VIDEO_PROFILE_360P_3 = 32;
        public static final int VIDEO_PROFILE_360P_4 = 33;
        public static final int VIDEO_PROFILE_360P_6 = 35;
        public static final int VIDEO_PROFILE_360P_7 = 36;
        public static final int VIDEO_PROFILE_360P_8 = 37;
        public static final int VIDEO_PROFILE_480P = 40;
        public static final int VIDEO_PROFILE_480P_3 = 42;
        public static final int VIDEO_PROFILE_480P_4 = 43;
        public static final int VIDEO_PROFILE_480P_6 = 45;
        public static final int VIDEO_PROFILE_480P_8 = 47;
        public static final int VIDEO_PROFILE_480P_9 = 48;
        public static final int VIDEO_PROFILE_4K = 70;
        public static final int VIDEO_PROFILE_4K_3 = 72;
        public static final int VIDEO_PROFILE_720P = 50;
        public static final int VIDEO_PROFILE_720P_3 = 52;
        public static final int VIDEO_PROFILE_720P_5 = 54;
        public static final int VIDEO_PROFILE_720P_6 = 55;
        public static final int VIDEO_PROFILE_DEFAULT = 30;
    }

    public static class VideoRenderingTracingInfo {
        public int elapsedTime;
        public int join2JoinSuccess;
        public int joinSuccess2RemoteJoined;
        public int remoteJoined2PacketReceived;
        public int remoteJoined2SetView;
        public int remoteJoined2UnmuteVideo;
        public int start2JoinChannel;
    }

    public static class WarnCode {
        public static final int WARN_ADM_RECORD_AUDIO_SILENCE = 1019;
        public static final int WARN_ADM_RECORD_IS_OCCUPIED = 1033;
        public static final int WARN_ADM_RUNTIME_PLAYOUT_WARNING = 1014;
        public static final int WARN_ADM_RUNTIME_RECORDING_WARNING = 1016;
        public static final int WARN_APM_HOWLING = 1051;
        public static final int WARN_AUDIO_MIXING_OPEN_ERROR = 701;
        public static final int WARN_INIT_VIDEO = 16;
        public static final int WARN_INVALID_VIEW = 8;
        public static final int WARN_LOOKUP_CHANNEL_REJECTED = 105;
        public static final int WARN_LOOKUP_CHANNEL_TIMEOUT = 104;
        public static final int WARN_NO_AVAILABLE_CHANNEL = 103;
        public static final int WARN_OPEN_CHANNEL_INVALID_TICKET = 121;
        public static final int WARN_OPEN_CHANNEL_REJECTED = 107;
        public static final int WARN_OPEN_CHANNEL_TIMEOUT = 106;
        public static final int WARN_OPEN_CHANNEL_TRY_NEXT_VOS = 122;
        public static final int WARN_PENDING = 20;
    }

    public static class WlAccStats {
        public int e2eDelayPercent;
        public int frozenRatioPercent;
        public int lossRatePercent;
    }

    public void onActiveSpeaker(int i) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioMetadataReceived(int i, byte[] bArr) {
    }

    @Deprecated
    public void onAudioMixingFinished() {
    }

    public void onAudioMixingPositionChanged(long j) {
    }

    public void onAudioMixingStateChanged(int i, int i2) {
    }

    public void onAudioPublishStateChanged(String str, int i, int i2, int i3) {
    }

    public void onAudioQuality(int i, int i2, short s, short s2) {
    }

    public void onAudioRouteChanged(int i) {
    }

    public void onAudioSubscribeStateChanged(String str, int i, int i2, int i3, int i4) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onCameraExposureAreaChanged(Rect rect) {
    }

    public void onCameraFocusAreaChanged(Rect rect) {
    }

    @Deprecated
    public void onCameraReady() {
    }

    public void onChannelMediaRelayStateChanged(int i, int i2) {
    }

    public void onClientRoleChangeFailed(int i, int i2) {
    }

    public void onClientRoleChanged(int i, int i2, ClientRoleOptions clientRoleOptions) {
    }

    public void onConnectionBanned() {
    }

    public void onConnectionInterrupted() {
    }

    public void onConnectionLost() {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onContentInspectResult(int i) {
    }

    public void onDownlinkNetworkInfoUpdated(DownlinkNetworkInfo downlinkNetworkInfo) {
    }

    public void onEncryptionError(int i) {
    }

    public void onError(int i) {
    }

    public void onFacePositionChanged(int i, int i2, AgoraFacePositionInfo[] agoraFacePositionInfoArr) {
    }

    public void onFirstLocalAudioFramePublished(int i) {
    }

    public void onFirstLocalVideoFrame(Constants.VideoSourceType videoSourceType, int i, int i2, int i3) {
    }

    public void onFirstLocalVideoFramePublished(Constants.VideoSourceType videoSourceType, int i) {
    }

    public void onFirstRemoteAudioDecoded(int i, int i2) {
    }

    public void onFirstRemoteAudioFrame(int i, int i2) {
    }

    public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
    }

    public void onFirstRemoteVideoFrame(int i, int i2, int i3, int i4) {
    }

    public void onIntraRequestReceived() {
    }

    public void onJoinChannelSuccess(String str, int i, int i2) {
    }

    public void onLastmileProbeResult(LastmileProbeResult lastmileProbeResult) {
    }

    public void onLastmileQuality(int i) {
    }

    public void onLeaveChannel(RtcStats rtcStats) {
    }

    public void onLicenseValidationFailure(int i) {
    }

    public void onLocalAudioStateChanged(int i, int i2) {
    }

    public void onLocalAudioStats(LocalAudioStats localAudioStats) {
    }

    public void onLocalPublishFallbackToAudioOnly(boolean z) {
    }

    public void onLocalUserRegistered(int i, String str) {
    }

    public void onLocalVideoStat(int i, int i2) {
    }

    public void onLocalVideoStateChanged(Constants.VideoSourceType videoSourceType, int i, int i2) {
    }

    public void onLocalVideoStats(Constants.VideoSourceType videoSourceType, LocalVideoStats localVideoStats) {
    }

    public void onLocalVideoTranscoderError(LocalTranscoderConfiguration.TranscodingVideoStream transcodingVideoStream, int i) {
    }

    public void onMediaEngineLoadSuccess() {
    }

    public void onMediaEngineStartCallSuccess() {
    }

    public void onNetworkQuality(int i, int i2, int i3) {
    }

    public void onNetworkTypeChanged(int i) {
    }

    public void onPermissionError(int i) {
    }

    public void onProxyConnected(String str, int i, int i2, String str2, int i3) {
    }

    public void onRejoinChannelSuccess(String str, int i, int i2) {
    }

    public void onRemoteAudioStateChanged(int i, int i2, int i3, int i4) {
    }

    public void onRemoteAudioStats(RemoteAudioStats remoteAudioStats) {
    }

    @Deprecated
    public void onRemoteAudioTransportStats(int i, int i2, int i3, int i4) {
    }

    public void onRemoteSubscribeFallbackToAudioOnly(int i, boolean z) {
    }

    public void onRemoteVideoStat(int i, int i2, int i3, int i4) {
    }

    public void onRemoteVideoStateChanged(int i, int i2, int i3, int i4) {
    }

    public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
    }

    @Deprecated
    public void onRemoteVideoTransportStats(int i, int i2, int i3, int i4) {
    }

    public void onRequestToken() {
    }

    public void onRhythmPlayerStateChanged(int i, int i2) {
    }

    public void onRtcStats(RtcStats rtcStats) {
    }

    public void onRtmpStreamingEvent(String str, int i) {
    }

    public void onRtmpStreamingStateChanged(String str, int i, int i2) {
    }

    public void onSnapshotTaken(int i, String str, int i2, int i3, int i4) {
    }

    public void onStreamMessage(int i, int i2, byte[] bArr) {
    }

    public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
    }

    public void onTokenPrivilegeWillExpire(String str) {
    }

    public void onTranscodedStreamLayoutInfo(int i, VideoLayoutInfo videoLayoutInfo) {
    }

    public void onTranscodingUpdated() {
    }

    public void onUplinkNetworkInfoUpdated(UplinkNetworkInfo uplinkNetworkInfo) {
    }

    public void onUploadLogResult(String str, boolean z, int i) {
    }

    @Deprecated
    public void onUserEnableLocalVideo(int i, boolean z) {
    }

    public void onUserEnableVideo(int i, boolean z) {
    }

    public void onUserInfoUpdated(int i, UserInfo userInfo) {
    }

    public void onUserJoined(int i, int i2) {
    }

    public void onUserMuteAudio(int i, boolean z) {
    }

    public void onUserMuteVideo(int i, boolean z) {
    }

    public void onUserOffline(int i, int i2) {
    }

    public void onUserStateChanged(int i, int i2) {
    }

    public void onVideoPublishStateChanged(Constants.VideoSourceType videoSourceType, String str, int i, int i2, int i3) {
    }

    public void onVideoRenderingTracingResult(int i, Constants.MEDIA_TRACE_EVENT media_trace_event, VideoRenderingTracingInfo videoRenderingTracingInfo) {
    }

    public void onVideoSizeChanged(Constants.VideoSourceType videoSourceType, int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public void onVideoStopped() {
    }

    public void onVideoSubscribeStateChanged(String str, int i, int i2, int i3, int i4) {
    }

    public void onWlAccMessage(int i, int i2, String str) {
    }

    public void onWlAccStats(WlAccStats wlAccStats, WlAccStats wlAccStats2) {
    }
}
