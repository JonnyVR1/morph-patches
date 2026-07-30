package com.p000p1.mobile.putong.core.message.inner.data;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public enum MsgIcebreakType {
    ALL("全部执行", "all"),
    NONE("都不执行", "none"),
    TEXT_BREAK("触发文字破冰", "text"),
    STICKER_BREAK("触发动图表情破冰", "sticker");

    String describe;
    String value;

    MsgIcebreakType(String str, String str2) {
        this.describe = str;
        this.value = str2;
    }

    public String getValue() {
        return this.value;
    }
}
