package com.p046p1.mobile.putong.live.base.apibean;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class LiveClientSwitchesBean extends BaseLiveBean {

    @SerializedName("switches")
    public LiveClientSwitchesGroup switches;

    public static class ExpireLogEnable {

        @SerializedName("expireTime")
        public int expireTime;

        /* JADX INFO: renamed from: on */
        @SerializedName("on")
        public boolean f44236on;
    }

    public static class LiveClientSwitchesGroup {

        @SerializedName("androidMaskLimit")
        public LiveMaskLimitConfig androidMaskLimit;

        @SerializedName("clientMonitor")
        public LiveSwitch clientMonitor;

        @SerializedName("disableStoragePermissionAndroid")
        public LiveSwitch disableStoragePermissionAndroid;

        @SerializedName("fakeRewardPoint")
        public LiveSwitch fakeRewardPoint;

        @SerializedName("happyEyeballsEnable")
        public LiveSwitch happyEyeballsEnable;

        @SerializedName("intlAudioProcessSoHookEnable")
        public LiveSwitch intlAudioProcessSoHookEnable;

        @SerializedName("intlComboNewUISwitch")
        public LiveSwitch intlComboNewUISwitch;

        @SerializedName("intlFixMultiFragmentEnable")
        public LiveSwitch intlFixMultiFragmentEnable;

        @SerializedName("intlLiveClearScreen")
        public LiveSwitch intlLiveClearScreen;

        @SerializedName("intlLiveFeed")
        public LiveSwitch intlLiveFeed;

        @SerializedName("intlLiveSquareNewEnable")
        public LiveSwitch intlLiveSquareNewEnable;

        @SerializedName("intlLowEndSvga")
        public LiveSwitch intlLowEndSvga;

        @SerializedName("intlMLN")
        public LiveSwitch intlMLN;

        @SerializedName("intlRtcPullConfig")
        public LiveSwitch intlRtcPullConfig;

        @SerializedName("intlVoiceFeed")
        public LiveSwitch intlVoiceFeed;

        @SerializedName("intlVoiceSquareNewEnable")
        public LiveSwitch intlVoiceSquareNewEnable;

        @SerializedName("isOpenLiveStatus")
        public LiveSwitch isOpenLiveStatus;

        @SerializedName("isOpenVoiceLiveStatus")
        public LiveSwitch isOpenVoiceLiveStatus;

        @SerializedName("liveSuperAdmin")
        public LiveSwitch liveSuperAdmin;

        @SerializedName("momoBeauty")
        public LiveSwitch momoBeauty;

        @SerializedName("newLayoutFile")
        public LiveSwitch newLayoutFile;

        @SerializedName("officialAccountFollow")
        public LiveSwitch officialAccountFollow;

        @SerializedName("operatorWindowHangUp")
        public LiveSwitch operatorWindowHangUp;

        @SerializedName("overseaChineseLiveExp")
        public LiveSwitch overseaChineseLiveExp;

        @SerializedName("overseaChineseVoiceExp")
        public LiveSwitch overseaChineseVoiceExp;

        @SerializedName("pkAcrossRoomOptimization")
        public LiveSwitch pkAcrossRoomOptimization;

        @SerializedName("pkOptimization")
        public LiveSwitch pkOptimization;

        @SerializedName("promptlyRegisterEnable")
        public LiveSwitch promptlyRegisterEnable;

        @SerializedName("realtime")
        public LiveSwitch realtime;

        @SerializedName("removeVirtualAnchor")
        public LiveSwitch removeVirtualAnchor;

        @SerializedName("removeVoiceCdn")
        public LiveSwitch removeVoiceCdn;

        @SerializedName("showLeaderboardScore")
        public LiveSwitch showLeaderboardScore;

        @SerializedName("socketIM")
        public LiveSwitch socketIM;

        @SerializedName("userGoActionSwitch")
        public LiveSwitch userGoActionSwitch;

        @SerializedName("voiceChatLimit")
        public LiveSwitch voiceChatLimit;

        @SerializedName("voiceDemotionLimit")
        public LiveSwitch voiceDemotionLimit;

        @SerializedName("voiceInterShowSearch")
        public LiveSwitch voiceInterShowSearch;

        @SerializedName("voiceMultiAvatar")
        public LiveSwitch voiceMultiAvatar;

        @SerializedName("xeGiftPlayerEnable")
        public LiveSwitch xeGiftPlayerEnable;
    }

    public static class LiveMaskLimitConfig {

        @SerializedName("maskLimit")
        public int maskLimit;
    }

    public static class LiveSwitch {

        @SerializedName(Constants.KEY_CONFIG)
        public LiveSwitchConfig config;

        /* JADX INFO: renamed from: on */
        @SerializedName("on")
        public boolean f44237on;
    }

    public static class LiveSwitchConfig {

        @SerializedName("chatHallDemotionLimit")
        public int chatHallDemotionLimit;

        @SerializedName("delExpireLogEnable")
        public ExpireLogEnable delExpireLogEnable = new ExpireLogEnable();

        @SerializedName("frequency")
        public int frequency;

        @SerializedName("liveLogOn")
        public boolean liveLogOn;

        @SerializedName("logFileMaxSize")
        public int logFileMaxSize;

        @SerializedName("logWriteWindowTime")
        public int logWriteWindowTime;

        @SerializedName("openMutliCallLog")
        public boolean openMutliCallLog;

        @SerializedName("openPkLog")
        public boolean openPkLog;

        @SerializedName("pullRtcFailOverCnt")
        public int pullRtcFailOverCnt;

        @SerializedName("quickChatLogOn")
        public boolean quickChatLogOn;

        @SerializedName("unitIntervalMaxRow")
        public int unitIntervalMaxRow;

        @SerializedName("uploadMaxInterval")
        public int uploadMaxInterval;

        @SerializedName("url")
        public String url;

        @SerializedName("voiceChatCount")
        public int voiceChatCount;

        @SerializedName("voiceChatLength")
        public int voiceChatLength;
    }
}
