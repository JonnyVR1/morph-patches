package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.type.ChannelProfile;

/* JADX INFO: loaded from: classes13.dex */
public class RTCRoomConfig {
    public boolean isAutoSubscribeAudio;
    public boolean isAutoSubscribeVideo;
    public boolean isPublishAudio;
    public boolean isPublishVideo;
    public ChannelProfile profile;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.RTCRoomConfig$1 */
    public static /* synthetic */ class C134021 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile;

        static {
            int[] iArr = new int[ChannelProfile.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile = iArr;
            try {
                iArr[ChannelProfile.CHANNEL_PROFILE_COMMUNICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LOW_LATENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT_ROOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_INTERACTIVE_PODCAST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHORUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_STREAMING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_MEETING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_MEETING_ROOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLASSROOM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CALL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LIVE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public RTCRoomConfig(ChannelProfile channelProfile, boolean z, boolean z2, boolean z3, boolean z4) {
        this.profile = channelProfile;
        this.isPublishAudio = z;
        this.isPublishVideo = z2;
        this.isAutoSubscribeAudio = z3;
        this.isAutoSubscribeVideo = z4;
    }

    @CalledByNative
    public int getProfile() {
        switch (C134021.$SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[this.profile.ordinal()]) {
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 14;
            case 9:
                return 16;
            case 10:
                return 17;
            case 11:
                return 18;
            case 12:
                return 19;
            case 13:
                return 20;
            default:
                return 0;
        }
    }

    @CalledByNative
    public boolean isAutoSubscribeAudio() {
        return this.isAutoSubscribeAudio;
    }

    @CalledByNative
    public boolean isAutoSubscribeVideo() {
        return this.isAutoSubscribeVideo;
    }

    @CalledByNative
    public boolean isPublishAudio() {
        return this.isPublishAudio;
    }

    @CalledByNative
    public boolean isPublishVideo() {
        return this.isPublishVideo;
    }

    public String toString() {
        return "RTCRoomConfig{profile=" + this.profile + ", isPublishAudio=" + this.isPublishAudio + ", isPublishVideo=" + this.isPublishVideo + ", isAutoSubscribeAudio=" + this.isAutoSubscribeAudio + ", isAutoSubscribeVideo=" + this.isAutoSubscribeVideo + '}';
    }
}
