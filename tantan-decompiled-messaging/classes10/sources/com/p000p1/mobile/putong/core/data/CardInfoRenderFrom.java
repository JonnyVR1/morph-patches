package com.p000p1.mobile.putong.core.data;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public enum CardInfoRenderFrom {
    UNKNOWN("未知"),
    CARD("卡牌渲染"),
    PROFILE("资料页渲染"),
    PROFILE_PREVIEW("资料页预览"),
    OLD_TRANS_PROFILE("资料转换");

    private String desc;

    CardInfoRenderFrom(String str) {
        this.desc = str;
    }
}
