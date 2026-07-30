package com.p046p1.mobile.putong.core.data;

import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: classes10.dex */
public enum CardInfoRenderFrom {
    UNKNOWN(MusicContent.UNKNOWN_STRING),
    CARD("卡牌渲染"),
    PROFILE("资料页渲染"),
    PROFILE_PREVIEW("资料页预览"),
    OLD_TRANS_PROFILE("资料转换");

    private String desc;

    CardInfoRenderFrom(String str) {
        this.desc = str;
    }
}
