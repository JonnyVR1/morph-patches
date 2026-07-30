package com.p046p1.mobile.putong.live.base.apibean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class LivePushNoticeItemBean extends BaseListItemBean {

    @SerializedName("anchorAvatar")
    public String anchorAvatar;

    @SerializedName("anchorId")
    public String anchorId;

    @SerializedName("anchorName")
    public String anchorName;

    @SerializedName("pushStatus")
    public String pushStatus;

    public LivePushNoticeItemBean(String str, String str2) {
        this.anchorId = str;
        this.pushStatus = str2;
    }

    public static LivePushNoticeItemBean disable(String str) {
        return new LivePushNoticeItemBean(str, "hide");
    }

    public static LivePushNoticeItemBean enable(String str) {
        return new LivePushNoticeItemBean(str, "default");
    }

    public boolean isPushEnabled() {
        return "default".equals(this.pushStatus);
    }

    public void setPushEnabled(boolean z) {
        this.pushStatus = z ? "default" : "hide";
    }
}
