package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceSquareSpecChannelPopupBean extends BaseLiveBean {

    @SerializedName("buttonText")
    private String buttonText;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("icon")
    private String icon = "";

    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    @SerializedName("type")
    private String type;

    @SerializedName("userInfo")
    private UserInfoBean userInfo;

    public static class UserInfoBean {

        @SerializedName(SeeTextDynamicParam.age)
        public int age;

        @SerializedName("gender")
        public String gender;

        @SerializedName(ProfileLikeCategoryType.zodiac)
        public String zodiac;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public LiveGoAction getGoAction() {
        return this.goAction;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public LiveCardTrackData getTrackData() {
        return this.trackData;
    }

    public String getType() {
        return this.type;
    }

    public UserInfoBean getUserInfo() {
        return this.userInfo;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setGoAction(LiveGoAction liveGoAction) {
        this.goAction = liveGoAction;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackData(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserInfo(UserInfoBean userInfoBean) {
        this.userInfo = userInfoBean;
    }
}
