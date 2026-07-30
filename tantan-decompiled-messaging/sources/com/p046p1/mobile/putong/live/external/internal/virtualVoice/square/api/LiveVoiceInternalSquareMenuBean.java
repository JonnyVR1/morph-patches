package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareMenuBean {
    public static final int BUTTON_CREATE_TYPE = 0;
    public static final int BUTTON_RANDOM_ENTER_TYPE = 1;

    @SerializedName("buttonIconUrl")
    private String buttonIconUrl;

    @SerializedName("buttonName")
    private String buttonName;

    @SerializedName("buttonType")
    private int buttonType;

    public String getButtonIconUrl() {
        return this.buttonIconUrl;
    }

    public String getButtonName() {
        return this.buttonName;
    }

    public int getButtonType() {
        return this.buttonType;
    }

    public void setButtonIconUrl(String str) {
        this.buttonIconUrl = str;
    }

    public void setButtonName(String str) {
        this.buttonName = str;
    }

    public void setButtonType(int i) {
        this.buttonType = i;
    }
}
