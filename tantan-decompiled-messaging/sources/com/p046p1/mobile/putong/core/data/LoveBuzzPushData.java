package com.p046p1.mobile.putong.core.data;

import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes10.dex */
public class LoveBuzzPushData {
    private static final String TAG = "LoveBuzzPushUser";
    public String appId;
    public String biz;
    public String buzzIntent;
    public String buzzToken;
    public String channelKey;
    public String channelToken;
    public String contentId;
    public int frozenDuration;
    public int initialDuration;
    public int memojiDuration;
    public String mode;
    public boolean needReact;
    public String otherUsers;
    public int prolongCount;
    public String reaction;
    public int resolutionHeight;
    public int resolutionWidth;
    public String subType;
    public int totalDuration;
    public String userId;
    public int vendor;

    public String toString() {
        return "LoveBuzzPushData{userId='" + this.userId + "', biz='" + this.biz + "', buzzToken='" + this.buzzToken + "', buzzIntent='" + this.buzzIntent + "', contentId='" + this.contentId + "', channelToken='" + this.channelToken + "', channelKey='" + this.channelKey + "', initialDuration=" + this.initialDuration + ", prolongCount=" + this.prolongCount + ", appId='" + this.appId + "', vendor=" + this.vendor + '}';
    }

    public void transDataFromPush(PushMessage pushMessage) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.userId = pushMessageCustom.otherUserId;
        this.biz = pushMessageCustom.biz;
        this.buzzToken = pushMessageCustom.buzzToken;
        this.buzzIntent = pushMessage.intent;
        this.contentId = pushMessage.content.f38804id;
        this.channelToken = pushMessageCustom.channelToken;
        this.channelKey = pushMessageCustom.channelKey;
        this.vendor = pushMessageCustom.vendor;
        this.appId = pushMessageCustom.appId;
        this.initialDuration = pushMessageCustom.initialDuration;
        this.prolongCount = pushMessageCustom.prolongCount;
        this.totalDuration = pushMessageCustom.totalDuration;
        this.frozenDuration = pushMessageCustom.frozenDuration;
        this.resolutionWidth = pushMessageCustom.resolutionWidth;
        this.resolutionHeight = pushMessageCustom.resolutionHeight;
        this.mode = pushMessageCustom.mode;
        this.needReact = pushMessageCustom.needReact;
        this.reaction = pushMessageCustom.reaction;
        this.subType = pushMessageCustom.type;
        this.otherUsers = pushMessageCustom.otherUsers;
        this.memojiDuration = pushMessageCustom.memojiDuration;
    }
}
