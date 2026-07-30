package com.immomo.momomediaext.utils;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveRoomParams {
    public String channel;
    public String channelKey;
    public String confId;
    public boolean isHost;
    public MMLiveClientRole role;
    public String userId;
    public String userSig;
    public MMLivePushType linkType = MMLivePushType.MMLiveTypeConfNONE;
    public int degradationPrefer = 0;
    public MMRenderViewType renderViewType = MMRenderViewType.SurfaceViewOut;
    public int blueToothType = 0;
    public MMLiveAudioScenario audioScenario = MMLiveAudioScenario.MMLiveAudioScenarioNone;
    public MMLiveAudioProfile audioProfile = MMLiveAudioProfile.MMLiveAudioProfileNone;
    public boolean onlyAudio = false;
    public boolean enableFullTimeMode = false;
    public boolean enableConferenceReconnect = true;
    public String sourceLanguage = "";
    public int agoraRtcKeepAlive = -1;
    public int volcRtcKeepAlive = -1;
    public boolean enableRtcPlaybackCallback = true;

    public enum MMLiveAudioProfile {
        MMLiveAudioProfileNone(-1),
        MMLiveAudioProfileLow(0),
        MMLiveAudioProfileStandard(1),
        MMLiveAudioProfileHigh(2);

        private int value;

        MMLiveAudioProfile(int i) {
            this.value = i;
        }

        public static MMLiveAudioProfile fromId(int i) {
            for (MMLiveAudioProfile mMLiveAudioProfile : values()) {
                if (mMLiveAudioProfile.value() == i) {
                    return mMLiveAudioProfile;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public enum MMLiveAudioScenario {
        MMLiveAudioScenarioNone(-1),
        MMLiveAudioScenarioMedia(0),
        MMLiveAudioScenarioCommunication(1);

        private int value;

        MMLiveAudioScenario(int i) {
            this.value = i;
        }

        public static MMLiveAudioScenario fromId(int i) {
            for (MMLiveAudioScenario mMLiveAudioScenario : values()) {
                if (mMLiveAudioScenario.value() == i) {
                    return mMLiveAudioScenario;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public enum MMLiveClientRole {
        MMLiveRTCClientRoleBroadcaster,
        MMLiveRTCClientRoleAudience
    }

    public enum MMLivePushType {
        MMLiveTypeDefault(-1),
        MMLiveTypeConfNONE(0),
        MMLiveTypeConfAG(1),
        MMLiveTypeConfWL(2),
        MMLiveTypeConfTX(3),
        MMLiveTypeConfMM(4),
        MMLiveTypeConfVolc(5),
        MMLiveTypeAid(20);

        private int value;

        MMLivePushType(int i) {
            this.value = i;
        }

        public static MMLivePushType fromId(int i) {
            for (MMLivePushType mMLivePushType : values()) {
                if (mMLivePushType.value() == i) {
                    return mMLivePushType;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public enum MMLiveRoomMode {
        MMLIVEROOMMODELIVE,
        MMLIVEROOMMODECOMMUNICATION
    }

    public enum MMRenderViewType {
        SurfaceViewOut(1),
        TextureViewOut(2),
        SurfaceTextureOut(3);

        private int value;

        MMRenderViewType(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public String toString() {
        return "<type:" + this.linkType + ",appid:" + this.confId + Constants.SEPARATOR_COMMA + this.role + ",isHost:" + this.isHost + ",userid" + this.userId + ",roomid:" + this.channel + ",token:" + this.channelKey + Constants.SEPARATOR_COMMA + this.userSig + ",blueTooth:" + this.blueToothType + ",renderMode:" + this.renderViewType.value() + ",audioProfile" + this.audioProfile.value() + ",audioScenario:" + this.audioScenario.value() + "audioOnly:" + this.onlyAudio + "fullTimeMode" + this.enableFullTimeMode + "degradationPrefer:" + this.degradationPrefer + "agoraRtcKeepAlive:" + this.agoraRtcKeepAlive + "volcRtcKeepAlive:" + this.volcRtcKeepAlive + "enableRtcPlaybackCallback:" + this.enableRtcPlaybackCallback + '>';
    }
}
