package com.tencent.iliveroom;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TXILiveRoomDefine {
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_1280_720 = 5;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_160_160 = 19;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_180_320 = 7;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_240_320 = 11;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_270_270 = 18;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_270_480 = 8;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_320_180 = 9;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_320_240 = 14;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_320_480 = 6;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_360_480 = 12;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_360_640 = 0;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_480_270 = 10;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_480_360 = 15;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_480_480 = 17;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_480_640 = 13;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_540_960 = 1;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_640_360 = 3;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_640_480 = 16;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_720_1280 = 2;
    public static final int TXILIVEROOM_VIDEO_RESOLUTION_TYPE_960_540 = 4;
    public static final int TXILiveRoomAudioEncQualityMusicHigh = 3;
    public static final int TXILiveRoomAudioEncQualityMusicStandard = 2;
    public static final int TXILiveRoomAudioEncQualitySpeechStandard = 1;
    public static final int TXILiveRoomAudioModeEarpiece = 1;
    public static final int TXILiveRoomAudioModeSpeakerphone = 0;
    public static final int TXILiveRoomAudioSampleRate16000 = 16000;
    public static final int TXILiveRoomAudioSampleRate32000 = 32000;
    public static final int TXILiveRoomAudioSampleRate44100 = 44100;
    public static final int TXILiveRoomAudioSampleRate48000 = 48000;
    public static final int TXILiveRoomBeautyStyleNature = 1;
    public static final int TXILiveRoomBeautyStyleSmooth = 0;
    public static final int TXILiveRoomCustomModeTypeAudio = 1;
    public static final int TXILiveRoomCustomModeTypeNone = 0;
    public static final int TXILiveRoomCustomModeTypeVideo = 2;
    public static final int TXILiveRoomErrorAudioPlayEngineNotStart = 11201;
    public static final int TXILiveRoomErrorConnReachMaxRetryTimes = -102033;
    public static final int TXILiveRoomErrorConnRoomFailed = -102044;
    public static final int TXILiveRoomErrorConnRoomNotExist = -102046;
    public static final int TXILiveRoomErrorConnRoomTimeout = -102034;
    public static final int TXILiveRoomErrorConnUserNotExist = -102048;
    public static final int TXILiveRoomErrorDisconnect = 11002;
    public static final int TXILiveRoomErrorEffectInvalid = 11204;
    public static final int TXILiveRoomErrorEffectNotSupportSampleRate = 11205;
    public static final int TXILiveRoomErrorLoadLiteAVSDKSOFail = 11301;
    public static final int TXILiveRoomErrorMusicInvalid = 11202;
    public static final int TXILiveRoomErrorMusicNotSupportSampleRate = 11203;
    public static final int TXILiveRoomErrorNone = 0;
    public static final int TXILiveRoomErrorOpenCameraFailed = 11003;
    public static final int TXILiveRoomErrorOpenMicFailed = 11004;
    public static final int TXILiveRoomErrorSigExpired = 11102;
    public static final int TXILiveRoomErrorSigFailed = 11103;
    public static final int TXILiveRoomErrorSwitchRoleFailed = 11101;
    public static final int TXILiveRoomErrorTimeout = 11100;
    public static final int TXILiveRoomErrorUnsupportResolution = 11005;
    public static final int TXILiveRoomErrorUnsupportSamplerate = 11006;
    public static final int TXILiveRoomErrorUpVideoAuthFailed = 11001;
    public static final int TXILiveRoomEventConnectSucc = 13001;
    public static final int TXILiveRoomEventOpenCameraSucc = 13002;
    public static final int TXILiveRoomEventOpenMicSucc = 13015;
    public static final int TXILiveRoomEventRenderFirstFrame = 13010;
    public static final int TXILiveRoomEventReqVideoAuthSucc = 13007;
    public static final int TXILiveRoomEventResolutionChanged = 13008;
    public static final int TXILiveRoomEventServerAddrChanged = 13013;
    public static final int TXILiveRoomEventServerTypeChanged = 13014;
    public static final int TXILiveRoomEventStartPlayAudioFrame = 13011;
    public static final int TXILiveRoomEventStartVideoHardWareDecoder = 13005;
    public static final int TXILiveRoomEventStartVideoHardWareEncoder = 13003;
    public static final int TXILiveRoomEventStartVideoSoftWareDecoder = 13006;
    public static final int TXILiveRoomEventStartVideoSoftWareEncoder = 13004;
    public static final int TXILiveRoomEventVideoBitrateChanged = 13009;
    public static final int TXILiveRoomEventVideoPlayLag = 13012;
    public static final int TXILiveRoomHomeOrientationDown = 1;
    public static final int TXILiveRoomHomeOrientationLeft = 2;
    public static final int TXILiveRoomHomeOrientationRight = 0;
    public static final int TXILiveRoomHomeOrientationUp = 3;
    public static final int TXILiveRoomMixOutputVideoCodecTypeDefault = 0;
    public static final int TXILiveRoomMixOutputVideoCodecTypeH264 = 1;
    public static final int TXILiveRoomMixOutputVideoCodecTypeH265 = 2;
    public static final int TXILiveRoomOfflineReasonDropped = 1;
    public static final int TXILiveRoomOfflineReasonKicked = 2;
    public static final int TXILiveRoomOfflineReasonQuit = 0;
    public static final int TXILiveRoomRoleAudience = 2;
    public static final int TXILiveRoomRoleBroadcaster = 1;
    public static final int TXILiveRoomScenarioChat = 1;
    public static final int TXILiveRoomScenarioLive = 2;
    public static final int TXILiveRoomVideoForamt_Texture_2D = 0;
    public static final int TXILiveRoomVideoForamt_Texture_OES = 0;
    public static final int TXILiveRoomVideoRenderModeFit = 1;
    public static final int TXILiveRoomVideoRenderModeHidden = 0;
    public static final int TXILiveRoomVideoStreamBig = 0;
    public static final int TXILiveRoomVideoStreamSmall = 1;
    public static final int TXILiveRoomVolumeTypeAuto = 0;
    public static final int TXILiveRoomVolumeTypeMedia = 1;
    public static final int TXILiveRoomWarningAudioDecodeFailed = 12007;
    public static final int TXILiveRoomWarningAudioEncodeFailed = 12005;
    public static final int TXILiveRoomWarningCameraNotAuthorized = 12008;
    public static final int TXILiveRoomWarningCameraOccupy = 12009;
    public static final int TXILiveRoomWarningHWAcceFailed = 12003;
    public static final int TXILiveRoomWarningInternalError = 12012;
    public static final int TXILiveRoomWarningMICNotAuthorized = 12010;
    public static final int TXILiveRoomWarningMICOccupy = 12011;
    public static final int TXILiveRoomWarningNetBusy = 12002;
    public static final int TXILiveRoomWarningNone = 0;
    public static final int TXILiveRoomWarningReconnect = 12001;
    public static final int TXILiveRoomWarningVideoDecodeFailed = 12006;
    public static final int TXILiveRoomWarningVideoEncodeFailed = 12004;
    public static final int TXIliveRoomAuthBitsCreateRoom = 1;
    public static final int TXIliveRoomAuthBitsDefault = -1;
    public static final int TXIliveRoomAuthBitsJoinRoom = 2;
    public static final int TXIliveRoomAuthBitsRecvAudio = 8;
    public static final int TXIliveRoomAuthBitsRecvCameraVideo = 32;
    public static final int TXIliveRoomAuthBitsRecvScreenVideo = 128;
    public static final int TXIliveRoomAuthBitsSendAudio = 4;
    public static final int TXIliveRoomAuthBitsSendCameraVideo = 16;
    public static final int TXIliveRoomAuthBitsSendScreenVideo = 64;

    public static class TXILiveConfig {
        public long sdkAppId;
        public long userId;

        public TXILiveConfig(long j, long j2) {
            this.sdkAppId = j;
            this.userId = j2;
        }
    }

    public static class TXILiveRoomAVStatistic {
        public long audioCapTotalBytes;
        public long audioEncTotalBytes;
        public List<TXUserAVStatistic> userAVStatistics = new ArrayList();
        public long videoEncFrameTotalCount;
        public long videoEncTotalBytes;

        public static class TXUserAVStatistic {
            public long audioTotalBytes;
            public long userId;
            public long videoTotalBytes;
        }
    }

    public static class TXILiveRoomAudioFrame {
        public int audioChannels;
        public byte[] audioData;
        public int audioSampleRate;
        public long timestamp;
    }

    public static class TXILiveRoomConfig {
        public int cdnVideoCodecType;
        public TXILiveSize sampleBufferSize;
        public int customModeType = 0;
        public boolean autoSampleBufferSize = false;
        public int homeOrientation = 1;
        public int renderMode = 0;
        public int videoFps = 15;
        public int videoBitrate = 600;
        public int videoResolution = 1;
        public int audioEncQuality = 2;
        public int pauseFps = 5;
        public Bitmap pauseImg = null;

        public String toString() {
            return "TXILiveRoomConfig{customModeType=" + this.customModeType + ", sampleBufferSize=" + this.sampleBufferSize + ", autoSampleBufferSize=" + this.autoSampleBufferSize + ", homeOrientation=" + this.homeOrientation + ", renderMode=" + this.renderMode + ", videoFps=" + this.videoFps + ", videoBitrate=" + this.videoBitrate + ", videoResolution=" + this.videoResolution + ", audioEncQuality=" + this.audioEncQuality + ", pauseFps=" + this.pauseFps + ", pauseImg=" + this.pauseImg + '}';
        }
    }

    public static class TXILiveRoomLocalMixConfig {
        public List<TXILiveRoomLocalMixUser> mixUsers = new ArrayList();
        public boolean onlyMixAudio;
        public int videoHeight;
        public int videoWidth;

        public String toString() {
            return "TXILiveRoomLocalMixConfig{onlyMixAudio=" + this.onlyMixAudio + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", mixUsers=" + this.mixUsers + '}';
        }
    }

    public static class TXILiveRoomLocalMixUser {
        public int height;
        public long userId;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f58438x;

        /* JADX INFO: renamed from: y */
        public int f58439y;

        public String toString() {
            return "TXILiveRoomLocalMixUser{userId=" + this.userId + ", x=" + this.f58438x + ", y=" + this.f58439y + ", width=" + this.width + ", height=" + this.height + '}';
        }
    }

    public static class TXILiveRoomParams {
        public byte[] privateMapKey;
        public String roomName;
        public int privateMap = -1;
        public int roomScenario = 2;
        public int roomRole = 2;
    }

    public static class TXILiveRoomStatus {
        public String serverAddr;
        public long userId = 0;
        public int appCpu = 0;
        public int sysCpu = 0;
        public int rtt = 0;
        public int videoFps = 0;
        public int videoWidth = 0;
        public int videoHeight = 0;
        public int videoGop = 0;
        public int netSpeed = 0;
        public int videoBitrate = 0;
        public int audioBitrate = 0;
        public long audioTotalBytes = 0;
        public long videoTotalBytes = 0;
        public long audioCaptureBytes = 0;
        public long audioEncodeBytes = 0;
        public long videoEncodeBytes = 0;
        public int videoCacheDuration = 0;
        public int audioCacheDuration = 0;
        public int videoJitterCacheFrames = 0;
        public int videoDecoderCacheFrames = 0;
        public int avRecvTimeInterval = 0;
        public int avPlayTimeInterval = 0;
        public int videoUpCacheFrames = 0;
        public int audioUpCacheFrames = 0;
        public int audioBlockCount = 0;
        public int audioExpandCnt = 0;
        public int audioExpandBlockCnt = 0;
        public int audioLossRate = 0;
        public int videoLossRate = 0;
        public int upLossRate = 0;
        public int audioFecRatio = 0;
        public int videoFecRatio = 0;
        public int videoRecvFPS = 0;
        public int videoFramesDrop = 0;
        public int point2PointDelay = 0;
    }

    public static class TXILiveSize {
        public int height;
        public int width;

        public TXILiveSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public String toString() {
            return "TXILiveSize{width=" + this.width + ", height=" + this.height + '}';
        }
    }

    public static class TXILiveRoomMixUser {
        public int height;
        public boolean isMuteAudio;
        public String roomId;
        public long userId;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f58440x;

        /* JADX INFO: renamed from: y */
        public int f58441y;
        public int zOrder;

        public TXILiveRoomMixUser(TXILiveRoomMixUser tXILiveRoomMixUser) {
            if (tXILiveRoomMixUser != null) {
                this.roomId = tXILiveRoomMixUser.roomId;
                this.userId = tXILiveRoomMixUser.userId;
                this.f58440x = tXILiveRoomMixUser.f58440x;
                this.f58441y = tXILiveRoomMixUser.f58441y;
                this.width = tXILiveRoomMixUser.width;
                this.height = tXILiveRoomMixUser.height;
                this.zOrder = tXILiveRoomMixUser.zOrder;
                this.isMuteAudio = tXILiveRoomMixUser.isMuteAudio;
            }
        }

        public String toString() {
            return "TXILiveRoomMixUser{userId='" + this.userId + "', x=" + this.f58440x + ", y=" + this.f58441y + ", width=" + this.width + ", height=" + this.height + ", zOrder=" + this.zOrder + ", isMuteAudio=" + this.isMuteAudio + '}';
        }

        public TXILiveRoomMixUser(String str, long j, int i, int i2, int i3, int i4, int i5) {
            this.roomId = str;
            this.userId = j;
            this.f58440x = i;
            this.f58441y = i2;
            this.width = i3;
            this.height = i4;
            this.zOrder = i5;
            this.isMuteAudio = false;
        }

        public TXILiveRoomMixUser() {
            this.userId = 0L;
            this.f58440x = 0;
            this.f58441y = 0;
            this.width = 0;
            this.height = 0;
            this.zOrder = 0;
            this.isMuteAudio = false;
        }
    }

    public static class TXILiveRoomTranscodingConfig {
        public int audioBitrate;
        public int audioChannels;
        public int audioSampleRate;
        public String backgroundPicUrl;
        public boolean enableBFrame;
        public String mixExtraInfo;
        public ArrayList<TXILiveRoomMixUser> mixUsers;
        public int videoBitrate;
        public int videoCodecType;
        public int videoFramerate;
        public int videoGOP;
        public int videoHeight;
        public int videoWidth;

        public TXILiveRoomTranscodingConfig(TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig) {
            if (tXILiveRoomTranscodingConfig != null) {
                this.videoWidth = tXILiveRoomTranscodingConfig.videoWidth;
                this.videoHeight = tXILiveRoomTranscodingConfig.videoHeight;
                this.videoBitrate = tXILiveRoomTranscodingConfig.videoBitrate;
                this.videoFramerate = tXILiveRoomTranscodingConfig.videoFramerate;
                this.videoGOP = tXILiveRoomTranscodingConfig.videoGOP;
                this.videoCodecType = tXILiveRoomTranscodingConfig.videoCodecType;
                this.enableBFrame = tXILiveRoomTranscodingConfig.enableBFrame;
                this.audioSampleRate = tXILiveRoomTranscodingConfig.audioSampleRate;
                this.audioBitrate = tXILiveRoomTranscodingConfig.audioBitrate;
                this.audioChannels = tXILiveRoomTranscodingConfig.audioChannels;
                this.backgroundPicUrl = tXILiveRoomTranscodingConfig.backgroundPicUrl;
                this.mixExtraInfo = tXILiveRoomTranscodingConfig.mixExtraInfo;
                this.mixUsers = new ArrayList<>();
                ArrayList<TXILiveRoomMixUser> arrayList = tXILiveRoomTranscodingConfig.mixUsers;
                if (arrayList != null) {
                    Iterator<TXILiveRoomMixUser> it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.mixUsers.add(new TXILiveRoomMixUser(it.next()));
                    }
                }
            }
        }

        public String toString() {
            return "TXILiveRoomTranscodingConfig{videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", videoBitrate=" + this.videoBitrate + ", videoFramerate=" + this.videoFramerate + ", videoGOP=" + this.videoGOP + ", videoCodecType=" + this.videoCodecType + ", enableBFrame=" + this.enableBFrame + ", audioSampleRate=" + this.audioSampleRate + ", audioBitrate=" + this.audioBitrate + ", audioChannels=" + this.audioChannels + ", backgroundPicUrl='" + this.backgroundPicUrl + "', mixExtraInfo='" + this.mixExtraInfo + "', mixUsers=" + this.mixUsers + '}';
        }

        public TXILiveRoomTranscodingConfig() {
        }
    }
}
