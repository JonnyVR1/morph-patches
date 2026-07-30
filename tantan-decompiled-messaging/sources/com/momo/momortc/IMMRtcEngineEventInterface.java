package com.momo.momortc;

import android.graphics.Rect;
import com.momo.momortc.live.MMRtcStats;
import com.momo.rtcbase.VideoFrame;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public interface IMMRtcEngineEventInterface {

    public static class ClientRole {
        public static final int CLIENT_ROLE_AUDIENCE = 2;
        public static final int CLIENT_ROLE_BROADCASTER = 1;
    }

    public static class ErrorCode {
        public static final int ERR_ADM_GENERAL_ERROR = 1005;
        public static final int ERR_ADM_INIT_LOOPBACK = 1022;
        public static final int ERR_ADM_INIT_PLAYOUT = 1008;
        public static final int ERR_ADM_INIT_RECORDING = 1011;
        public static final int ERR_ADM_JAVA_RESOURCE = 1006;
        public static final int ERR_ADM_RECORD_AUDIO_FAILED = 1018;
        public static final int ERR_ADM_RUNTIME_PLAYOUT_ERROR = 1015;
        public static final int ERR_ADM_RUNTIME_RECORDING_ERROR = 1017;
        public static final int ERR_ADM_SAMPLE_RATE = 1007;
        public static final int ERR_ADM_START_LOOPBACK = 1023;
        public static final int ERR_ADM_START_PLAYOUT = 1009;
        public static final int ERR_ADM_START_RECORDING = 1012;
        public static final int ERR_ADM_STOP_PLAYOUT = 1010;
        public static final int ERR_ADM_STOP_RECORDING = 1013;
        public static final int ERR_BIND_SOCKET = 13;
        public static final int ERR_BITRATE_LIMIT = 115;
        public static final int ERR_BUFFER_TOO_SMALL = 6;
        public static final int ERR_CANCELED = 11;
        public static final int ERR_CLIENT_IS_BANNED_BY_SERVER = 123;
        public static final int ERR_CONNECTION_INTERRUPTED = 111;
        public static final int ERR_CONNECTION_LOST = 112;
        public static final int ERR_DECRYPTION_FAILED = 120;
        public static final int ERR_FAILED = 1;
        public static final int ERR_INVALID_APP_ID = 101;
        public static final int ERR_INVALID_ARGUMENT = 2;
        public static final int ERR_INVALID_CHANNEL_NAME = 102;
        public static final int ERR_INVALID_TOKEN = 110;
        public static final int ERR_JOIN_CHANNEL_REJECTED = 17;
        public static final int ERR_LEAVE_CHANNEL_REJECTED = 18;
        public static final int ERR_LOAD_MEDIA_ENGINE = 1001;
        public static final int ERR_NET_DOWN = 14;
        public static final int ERR_NET_NOBUFS = 15;
        public static final int ERR_NOT_INITIALIZED = 7;
        public static final int ERR_NOT_IN_CHANNEL = 113;
        public static final int ERR_NOT_READY = 3;
        public static final int ERR_NOT_SUPPORTED = 4;
        public static final int ERR_NO_PERMISSION = 9;
        public static final int ERR_OK = 0;
        public static final int ERR_REFUSED = 5;
        public static final int ERR_SIZE_TOO_LARGE = 114;
        public static final int ERR_START_CALL = 1002;
        public static final int ERR_START_CAMERA = 1003;
        public static final int ERR_START_VIDEO_RENDER = 1004;
        public static final int ERR_TIMEDOUT = 10;
        public static final int ERR_TOKEN_EXPIRED = 109;
        public static final int ERR_TOO_MANY_DATA_STREAMS = 116;
        public static final int ERR_TOO_OFTEN = 12;
        public static final int ERR_VDM_CAMERA_NOT_AUTHORIZED = 1501;
        public static final int WARN_INIT_VIDEO = 16;
        public static final int WARN_INVALID_VIEW = 8;
    }

    public static class LocalVideoStats {
        public int reason;
        public int sentBitrate;
        public int sentFrameRate;
        public int targetBitrate;
        public int targetFrameRate;
    }

    public static class Quality {
        public static final int BAD = 4;
        public static final int DOWN = 6;
        public static final int EXCELLENT = 1;
        public static final int GOOD = 2;
        public static final int POOR = 3;
        public static final int UNKNOWN = 0;
        public static final int VBAD = 5;
    }

    public enum QualityLimitationReason {
        LIMITATION_REASON_NONE(0),
        LIMITATION_REASON_BANDWIDTH(1);

        private int value;

        QualityLimitationReason(int i) {
            this.value = i;
        }

        public static int getValue(QualityLimitationReason qualityLimitationReason) {
            return qualityLimitationReason.value;
        }
    }

    public static class RemoteVideoStats {
        public int delay;
        public int height;
        public int receivedBitrate;
        public int receivedFrameRate;
        public int rxStreamType;
        public int uid;
        public int width;
    }

    public static class RtcStats {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int rxAudioKBitRate;
        public int rxBytes;
        public int rxKBitRate;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioKBitRate;
        public int txBytes;
        public int txKBitRate;
        public int txVideoKBitRate;
        public int users;
    }

    public static class UserOfflineReason {
        public static final int USER_OFFLINE_DROPPED = 1;
        public static final int USER_OFFLINE_QUIT = 0;
    }

    public static class VideoProfile {
        public static final int VIDEO_PROFILE_120P = 0;
        public static final int VIDEO_PROFILE_120P_3 = 2;
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
        public static final int VIDEO_PROFILE_720P = 50;
        public static final int VIDEO_PROFILE_720P_3 = 52;
        public static final int VIDEO_PROFILE_720P_5 = 54;
        public static final int VIDEO_PROFILE_720P_6 = 55;
        public static final int VIDEO_PROFILE_DEFAULT = 30;
    }

    public static class WarnCode {
        public static final int WARN_ADM_RECORD_AUDIO_SILENCE = 1019;
        public static final int WARN_ADM_RECORD_IS_OCCUPIED = 1033;
        public static final int WARN_ADM_RUNTIME_PLAYOUT_WARNING = 1014;
        public static final int WARN_ADM_RUNTIME_RECORDING_WARNING = 1016;
        public static final int WARN_APM_HOWLING = 1051;
        public static final int WARN_AUDIO_MIXING_OPEN_ERROR = 701;
        public static final int WARN_LOOKUP_CHANNEL_REJECTED = 105;
        public static final int WARN_LOOKUP_CHANNEL_TIMEOUT = 104;
        public static final int WARN_NO_AVAILABLE_CHANNEL = 103;
        public static final int WARN_OPEN_CHANNEL_INVALID_TICKET = 121;
        public static final int WARN_OPEN_CHANNEL_REJECTED = 107;
        public static final int WARN_OPEN_CHANNEL_TIMEOUT = 106;
        public static final int WARN_OPEN_CHANNEL_TRY_NEXT_VOS = 122;
        public static final int WARN_PENDING = 20;
    }

    void didOnKickedOut(String str, int i, int i2, int i3);

    void onActiveSpeaker(int i);

    void onApiCallExecuted(int i, String str, String str2);

    void onAudioEffectFinished(int i);

    void onAudioMixingBegin();

    void onAudioMixingError();

    void onAudioMixingFinished();

    void onAudioQuality(int i, int i2, short s, short s2);

    void onAudioRouteChanged(int i);

    void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i);

    void onCameraFocusAreaChanged(Rect rect);

    void onCameraReady();

    void onChannelList(ArrayList<String> arrayList);

    void onClientRoleChanged(int i, int i2);

    void onConnectionBanned();

    void onConnectionInterrupted();

    void onConnectionLost();

    void onError(int i);

    void onFirstLocalAudioFrame(int i);

    void onFirstLocalVideoFrame(int i, int i2, int i3);

    void onFirstRemoteAudioFrame(int i, int i2);

    void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4);

    void onFirstRemoteVideoFrame(int i, int i2, int i3, int i4);

    void onHttpError(int i, String str);

    void onJoinChannelSuccess(String str, int i, int i2);

    void onLastmileQuality(int i);

    void onLeaveChannel(MMRtcStats mMRtcStats);

    void onLocalVideoQualityLimited(LocalVideoStats localVideoStats, QualityLimitationReason qualityLimitationReason);

    void onLog(int i, String str);

    void onMediaEngineLoadSuccess();

    void onMediaEngineStartCallSuccess();

    void onMicrophoneEnabled(boolean z);

    void onNetworkQuality(int i, int i2, int i3);

    void onReceiveSEI(int i, String str);

    void onRefreshRecordingServiceStatus(int i);

    void onRejoinChannelSuccess(String str, int i, int i2);

    void onRemoteVideoFrame(int i, VideoFrame videoFrame);

    void onRemoteVideoStateChanged(int i, int i2);

    void onRequestToken();

    void onRtcStats(MMRtcStats mMRtcStats);

    void onStreamInjectedStatus(String str, int i, int i2);

    void onStreamMessage(int i, int i2, String str);

    void onStreamMessageError(int i, int i2, int i3, int i4, int i5);

    void onStreamPublished(String str, int i);

    void onStreamUnpublished(String str);

    void onTokenPrivilegeWillExpire(String str);

    void onTranscodingUpdated();

    void onUserEnableLocalVideo(int i, boolean z);

    void onUserEnableVideo(int i, boolean z);

    void onUserJoined(int i, int i2);

    void onUserMuteAudio(int i, boolean z);

    void onUserMuteVideo(int i, boolean z);

    void onUserOffline(int i, int i2);

    void onVideoSizeChanged(int i, int i2, int i3);

    void onVideoStopped();

    void onWarning(int i);
}
