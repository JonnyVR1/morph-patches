package com.p074ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p074ss.bytertc.engine.utils.LogUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class MixedStreamConfig {
    private static final String TAG = "MixedStreamConfig";
    public MixedStreamAudioConfig audioConfig;
    public MixedStreamControlConfig controlConfig;
    public MixedStreamSpatialAudioConfig spatialAudioConfig;
    public MixedStreamSyncControlConfig syncControlConfig;
    public MixedStreamVideoConfig videoConfig;
    public MixedStreamLayoutRegionConfig[] regions = null;
    public String userConfigExtraInfo = "";
    public String backgroundColor = Constants.BLACK;
    public String backgroundImageURL = "";
    public JSONObject advancedConfig = null;
    public String roomID = "";
    public String userID = "";
    public JSONObject authInfo = null;
    public InterpolationMode interpolationMode = InterpolationMode.LAST_FRAME_FILL;
    public StreamLayoutMode layoutMode = StreamLayoutMode.AUTO;

    public static MixedStreamConfig defaultMixedStreamConfig() {
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        mixedStreamVideoConfig.fps = 15;
        mixedStreamVideoConfig.gop = 2;
        mixedStreamVideoConfig.enableBframe = false;
        mixedStreamVideoConfig.height = 640;
        mixedStreamVideoConfig.width = 360;
        mixedStreamVideoConfig.bitrate = 500;
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.audioCodec = MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.bitrate = 64;
        mixedStreamAudioConfig.sampleRate = 48000;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        MixedStreamControlConfig mixedStreamControlConfig = new MixedStreamControlConfig();
        mixedStreamControlConfig.enableVolumeIndication = false;
        mixedStreamControlConfig.seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        mixedStreamControlConfig.isAddVolumeValue = false;
        mixedStreamControlConfig.talkVolume = 0;
        mixedStreamControlConfig.volumeIndicationInterval = 2.0f;
        mixedStreamControlConfig.seiPayloadType = 100;
        mixedStreamControlConfig.seiPayloadUuid = "";
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = new MixedStreamSyncControlConfig();
        mixedStreamSyncControlConfig.baseUserID = "";
        mixedStreamSyncControlConfig.syncStrategy = MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC;
        mixedStreamSyncControlConfig.maxCacheTimeMs = 2000;
        mixedStreamSyncControlConfig.videoNeedSdkMix = true;
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = new MixedStreamSpatialAudioConfig();
        mixedStreamSpatialAudioConfig.enableSpatialRender = false;
        MixedStreamConfig mixedStreamConfig = new MixedStreamConfig();
        mixedStreamConfig.audioConfig = mixedStreamAudioConfig;
        mixedStreamConfig.videoConfig = mixedStreamVideoConfig;
        mixedStreamConfig.controlConfig = mixedStreamControlConfig;
        mixedStreamConfig.syncControlConfig = mixedStreamSyncControlConfig;
        mixedStreamConfig.spatialAudioConfig = mixedStreamSpatialAudioConfig;
        mixedStreamConfig.backgroundColor = Constants.BLACK;
        mixedStreamConfig.userConfigExtraInfo = "";
        return mixedStreamConfig;
    }

    @CalledByNative
    public String getMixedStreamAdvancedConfig() {
        JSONObject jSONObject = this.advancedConfig;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    @CalledByNative
    public String getMixedStreamAudioConfigAudioProfile() {
        MixedStreamAudioProfile mixedStreamAudioProfile;
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        return (mixedStreamAudioConfig == null || (mixedStreamAudioProfile = mixedStreamAudioConfig.audioProfile) == null) ? "" : mixedStreamAudioProfile.getValue();
    }

    @CalledByNative
    public int getMixedStreamAudioConfigChannels() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.channels;
    }

    @CalledByNative
    public String getMixedStreamAudioConfigCodec() {
        MixedStreamAudioCodecType mixedStreamAudioCodecType;
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        return (mixedStreamAudioConfig == null || (mixedStreamAudioCodecType = mixedStreamAudioConfig.audioCodec) == null) ? "" : mixedStreamAudioCodecType.getValue();
    }

    @CalledByNative
    public int getMixedStreamAudioConfigSampleRate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.sampleRate;
    }

    @CalledByNative
    public String getMixedStreamAuthInfo() {
        JSONObject jSONObject = this.authInfo;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    @CalledByNative
    public String getMixedStreamBackgroundColor() {
        String str = this.backgroundColor;
        return str == null ? "" : str;
    }

    @CalledByNative
    public String getMixedStreamBackgroundImageURL() {
        String str = this.backgroundImageURL;
        return str == null ? "" : str;
    }

    @CalledByNative
    public int getMixedStreamInterpolationMode() {
        return this.interpolationMode.value();
    }

    @CalledByNative
    public int getMixedStreamLayoutMode() {
        return this.layoutMode.value();
    }

    @CalledByNative
    public double getMixedStreamLayoutRegionAlpha(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : mixedStreamLayoutRegionConfig.alpha;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionAlternateImageFillMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? MixedStreamAlternateImageFillMode.FIT.getValue() : mixedStreamLayoutRegionConfig.alternateImageFillMode.getValue();
    }

    @CalledByNative
    public String getMixedStreamLayoutRegionAlternateImageURL(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? "" : mixedStreamLayoutRegionConfig.alternateImageURL;
    }

    @CalledByNative
    public boolean getMixedStreamLayoutRegionApplySpatialAudio(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return true;
        }
        return mixedStreamLayoutRegionConfig.applySpatialAudio;
    }

    @CalledByNative
    public MixedStreamLayoutRegionConfig[] getMixedStreamLayoutRegionConfigs() {
        return this.regions;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionContentType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.regionContentType.getValue();
    }

    @CalledByNative
    public double getMixedStreamLayoutRegionCornerRadius(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : mixedStreamLayoutRegionConfig.cornerRadius;
    }

    @CalledByNative
    public byte[] getMixedStreamLayoutRegionData(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return null;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMark;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionDataParamImageHeight(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageHeight;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionDataParamImageWidth(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageWidth;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionH(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.height;
    }

    @CalledByNative
    public boolean getMixedStreamLayoutRegionLocalUser(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return false;
        }
        return mixedStreamLayoutRegionConfig.isLocalUser;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionMediaType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.mediaType.getValue();
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionRenderMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.renderMode.getValue();
    }

    @CalledByNative
    public String getMixedStreamLayoutRegionRoomID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        String str;
        return (mixedStreamLayoutRegionConfig == null || (str = mixedStreamLayoutRegionConfig.roomID) == null) ? "" : str;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionScreenStream(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.streamType.getValue();
    }

    @CalledByNative
    public float getMixedStreamLayoutRegionSpatialPositionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.f56469x;
    }

    @CalledByNative
    public float getMixedStreamLayoutRegionSpatialPositionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.f56470y;
    }

    @CalledByNative
    public float getMixedStreamLayoutRegionSpatialPositionZ(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.f56471z;
    }

    @CalledByNative
    public String getMixedStreamLayoutRegionUserID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        String str;
        return (mixedStreamLayoutRegionConfig == null || (str = mixedStreamLayoutRegionConfig.userID) == null) ? "" : str;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionW(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.width;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.locationX;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.locationY;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionZOrder(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.zOrder;
    }

    @CalledByNative
    public double getMixedStreamLayoutSourceCropH(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : mixedStreamLayoutRegionConfig.sourceCrop.heightProportion;
    }

    @CalledByNative
    public double getMixedStreamLayoutSourceCropW(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : mixedStreamLayoutRegionConfig.sourceCrop.widthProportion;
    }

    @CalledByNative
    public double getMixedStreamLayoutSourceCropX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : mixedStreamLayoutRegionConfig.sourceCrop.locationX;
    }

    @CalledByNative
    public double getMixedStreamLayoutSourceCropY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : mixedStreamLayoutRegionConfig.sourceCrop.locationY;
    }

    @CalledByNative
    public int getMixedStreamLayoutmode() {
        return this.layoutMode.value();
    }

    @CalledByNative
    public String getMixedStreamRoomID() {
        String str = this.roomID;
        return str == null ? "" : str;
    }

    @CalledByNative
    public boolean getMixedStreamServerControlConfigEnableVolumeIndication() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        if (mixedStreamControlConfig == null) {
            return false;
        }
        return mixedStreamControlConfig.enableVolumeIndication;
    }

    @CalledByNative
    public boolean getMixedStreamServerControlConfigIsAddVolumeValue() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        if (mixedStreamControlConfig == null) {
            return false;
        }
        return mixedStreamControlConfig.isAddVolumeValue;
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigMediaType() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        return (mixedStreamControlConfig == null ? MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO : mixedStreamControlConfig.mediaType).getValue();
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigPushStreamMode() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        return (mixedStreamControlConfig == null ? MixedStreamPushMode.ON_STREAM : mixedStreamControlConfig.pushStreamMode).getValue();
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigSeiContentMode() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        return (mixedStreamControlConfig == null ? MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT : mixedStreamControlConfig.seiContentMode).getValue();
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigSeiPayloadType() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        if (mixedStreamControlConfig == null) {
            return 0;
        }
        return mixedStreamControlConfig.seiPayloadType;
    }

    @CalledByNative
    public String getMixedStreamServerControlConfigSeiPayloadUuid() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        return mixedStreamControlConfig == null ? "" : mixedStreamControlConfig.seiPayloadUuid;
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigTalkVolume() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        if (mixedStreamControlConfig == null) {
            return 0;
        }
        return mixedStreamControlConfig.talkVolume;
    }

    @CalledByNative
    public float getMixedStreamServerControlConfigVolumeIndicationInterval() {
        MixedStreamControlConfig mixedStreamControlConfig = this.controlConfig;
        if (mixedStreamControlConfig == null) {
            return 2.0f;
        }
        return mixedStreamControlConfig.volumeIndicationInterval;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardX() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.forward.f56465x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardY() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.forward.f56466y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardZ() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.forward.f56467z;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightX() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.right.f56465x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightY() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.right.f56466y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightZ() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.right.f56467z;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpX() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.f56461up.f56465x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpY() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.f56461up.f56466y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpZ() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialOrientation.f56461up.f56467z;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialPositionX() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialPosition.f56469x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialPositionY() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialPosition.f56470y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialPositionZ() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialAudioConfig.audienceSpatialPosition.f56471z;
    }

    @CalledByNative
    public boolean getMixedStreamSpatialConfigEnableSpatialRender() {
        MixedStreamSpatialAudioConfig mixedStreamSpatialAudioConfig = this.spatialAudioConfig;
        if (mixedStreamSpatialAudioConfig == null) {
            return false;
        }
        return mixedStreamSpatialAudioConfig.enableSpatialRender;
    }

    @CalledByNative
    public String getMixedStreamSyncControlConfigBaseUser() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        return mixedStreamSyncControlConfig == null ? "" : mixedStreamSyncControlConfig.baseUserID;
    }

    @CalledByNative
    public int getMixedStreamSyncControlConfigQueueLength() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return 0;
        }
        return mixedStreamSyncControlConfig.maxCacheTimeMs;
    }

    @CalledByNative
    public int getMixedStreamSyncControlConfigSyncStrategy() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        return (mixedStreamSyncControlConfig == null ? MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC : mixedStreamSyncControlConfig.syncStrategy).getValue();
    }

    @CalledByNative
    public boolean getMixedStreamSyncControlConfigVideoNeedMix() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return false;
        }
        return mixedStreamSyncControlConfig.videoNeedSdkMix;
    }

    @CalledByNative
    public String getMixedStreamUserConfigExtraInfo() {
        String str = this.userConfigExtraInfo;
        return str == null ? "" : str;
    }

    @CalledByNative
    public String getMixedStreamUserID() {
        String str = this.userID;
        return str == null ? "" : str;
    }

    @CalledByNative
    public boolean getMixedStreamVideoConfigBFrame() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return false;
        }
        return mixedStreamVideoConfig.enableBframe;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigBitrate() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.bitrate;
    }

    @CalledByNative
    public String getMixedStreamVideoConfigCodec() {
        MixedStreamVideoCodecType mixedStreamVideoCodecType;
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        return (mixedStreamVideoConfig == null || (mixedStreamVideoCodecType = mixedStreamVideoConfig.videoCodec) == null) ? "" : mixedStreamVideoCodecType.getValue();
    }

    @CalledByNative
    public int getMixedStreamVideoConfigFps() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.fps;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigGop() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.gop;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigHeight() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.height;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigWidth() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.width;
    }

    @CalledByNative
    public int getMixedStreamaudioConfigBitrate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.bitrate;
    }

    public JSONObject getTranscodeMessage() {
        String str = "height";
        String str2 = "width";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject.put("videoCodec", this.videoConfig.videoCodec);
            jSONObject.put("fps", this.videoConfig.fps);
            jSONObject.put("gop", this.videoConfig.gop);
            jSONObject.put("bitrate", this.videoConfig.bitrate);
            jSONObject.put("width", this.videoConfig.width);
            jSONObject.put("height", this.videoConfig.height);
            jSONObject.put("enableBframe", this.videoConfig.enableBframe);
            jSONObject2.put("audioCodec", this.audioConfig.audioCodec);
            jSONObject2.put("bitrate", this.audioConfig.bitrate);
            jSONObject2.put("sampleRate", this.audioConfig.sampleRate);
            jSONObject2.put("channels", this.audioConfig.channels);
            jSONObject2.put("audioProfile", this.audioConfig.audioProfile);
            jSONObject3.put("enableVolumeIndication", this.controlConfig.enableVolumeIndication);
            jSONObject3.put("talkVolume", this.controlConfig.talkVolume);
            jSONObject3.put("isAddVolumeValue", this.controlConfig.isAddVolumeValue);
            JSONObject jSONObject10 = jSONObject;
            jSONObject3.put("volumeIndicationInterval", this.controlConfig.volumeIndicationInterval);
            jSONObject3.put("seiContentMode", this.controlConfig.seiContentMode);
            jSONObject3.put("seiPayloadType", this.controlConfig.seiPayloadType);
            jSONObject3.put("seiPayloadUuid", this.controlConfig.seiPayloadUuid);
            jSONObject3.put("mediaType", this.controlConfig.mediaType);
            jSONObject3.put("pushStreamMode", this.controlConfig.pushStreamMode);
            jSONObject5.put("syncStrategy", this.syncControlConfig.syncStrategy);
            jSONObject5.put("maxCacheTimeMs", this.syncControlConfig.maxCacheTimeMs);
            jSONObject5.put("videoNeedSdkMix", this.syncControlConfig.videoNeedSdkMix);
            jSONObject5.put("baseuserID", this.syncControlConfig.baseUserID);
            jSONObject8.put("backgroundColor", this.backgroundColor);
            jSONObject8.put("backgroundImageURL", this.backgroundImageURL);
            MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.regions;
            String str3 = "roomID";
            String str4 = "userID";
            if (mixedStreamLayoutRegionConfigArr != null) {
                int length = mixedStreamLayoutRegionConfigArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i;
                    MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig = mixedStreamLayoutRegionConfigArr[i2];
                    int i3 = length;
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put(str4, mixedStreamLayoutRegionConfig.userID);
                    jSONObject11.put(str3, mixedStreamLayoutRegionConfig.roomID);
                    jSONObject11.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                    jSONObject11.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                    jSONObject11.put(str2, mixedStreamLayoutRegionConfig.width);
                    jSONObject11.put(str, mixedStreamLayoutRegionConfig.height);
                    jSONObject11.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                    jSONObject11.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                    jSONObject11.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                    jSONObject11.put("mediaType", mixedStreamLayoutRegionConfig.mediaType);
                    jSONObject11.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                    jSONObject11.put("isLocalUser", mixedStreamLayoutRegionConfig.isLocalUser);
                    jSONObject11.put("streamType", mixedStreamLayoutRegionConfig.streamType);
                    jSONObject11.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                    jSONObject11.put("alternateImageFillMode", mixedStreamLayoutRegionConfig.alternateImageFillMode);
                    jSONObject11.put("alternateImageURL", mixedStreamLayoutRegionConfig.alternateImageURL);
                    jSONObject11.put("sourceCropX", mixedStreamLayoutRegionConfig.sourceCrop.locationX);
                    jSONObject11.put("sourceCropY", mixedStreamLayoutRegionConfig.sourceCrop.locationY);
                    jSONObject11.put("sourceCropW", mixedStreamLayoutRegionConfig.sourceCrop.widthProportion);
                    jSONObject11.put("sourceCropH", mixedStreamLayoutRegionConfig.sourceCrop.heightProportion);
                    jSONArray.put(jSONObject11);
                    i = i2 + 1;
                    str3 = str3;
                    str = str;
                    length = i3;
                    jSONObject10 = jSONObject10;
                    str4 = str4;
                    str2 = str2;
                }
            }
            String str5 = str3;
            String str6 = str4;
            jSONObject8.put("regions", jSONArray);
            jSONObject8.put("userConfigExtraInfo", this.userConfigExtraInfo);
            jSONObject8.put("transcode", jSONObject7);
            jSONObject8.put("video", jSONObject10);
            jSONObject8.put("audio", jSONObject2);
            jSONObject8.put("serverControl", jSONObject3);
            jSONObject8.put("clientMix", jSONObject4);
            jSONObject8.put("syncControl", jSONObject5);
            jSONObject8.put("layout", jSONObject6);
            JSONObject jSONObject12 = this.advancedConfig;
            if (jSONObject12 != null) {
                jSONObject8.put("advancedConfig", jSONObject12);
            }
            JSONObject jSONObject13 = this.authInfo;
            if (jSONObject13 != null) {
                jSONObject8.put("authInfo", jSONObject13);
            }
            jSONObject9.put("type", "transcode");
            jSONObject9.put(str5, this.roomID);
            jSONObject9.put(str6, this.userID);
            jSONObject9.put("transcodeMeta", jSONObject8);
            jSONObject9.put("layoutMode", this.layoutMode);
            jSONObject9.put("interpolationMode", this.interpolationMode);
            return jSONObject9;
        } catch (Exception e) {
            LogUtil.m82088w(TAG, "get json message happen exception", e);
            return null;
        }
    }
}
