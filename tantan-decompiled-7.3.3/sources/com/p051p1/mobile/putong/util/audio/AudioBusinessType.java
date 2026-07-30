package com.p051p1.mobile.putong.util.audio;

import com.p051p1.mobile.putong.common.R$string;
import p153l.k3d0;

/* JADX INFO: loaded from: classes10.dex */
public enum AudioBusinessType {
    NORMAL(""),
    CHAT_ROOM_WINDOW(k3d0.m148007c(R$string.f18033D0)),
    PHONE(k3d0.m148007c(R$string.f18150f0)),
    QUICK_CHAT("正在语音闪聊匹配中"),
    BUZZ(k3d0.m148007c(R$string.f18155g0)),
    LIVE_IN_ROOM("当前正在观看直播，无法进行该操作"),
    VIDEO_CHAT("当前正在视频聊天，无法进行该操作");

    private String businessMsg;

    AudioBusinessType(String str) {
        this.businessMsg = str;
    }

    public String getBusinessMsg() {
        return this.businessMsg;
    }

    public boolean isHighLevelBusiness() {
        return this != NORMAL;
    }

    public AudioBusinessType setBusinessMsg(String str) {
        this.businessMsg = str;
        return this;
    }
}
