package com.p046p1.mobile.putong.util.audio;

import com.p046p1.mobile.putong.common.R$string;
import p149l.hvc0;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioBusinessType {
    NORMAL(""),
    CHAT_ROOM_WINDOW(hvc0.m133156c(R$string.f17314D0)),
    PHONE(hvc0.m133156c(R$string.f17431f0)),
    QUICK_CHAT("正在语音闪聊匹配中"),
    BUZZ(hvc0.m133156c(R$string.f17436g0)),
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
