package com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import p149l.f6c0;

/* JADX INFO: loaded from: classes11.dex */
public enum CardBottomFrame {
    DEFAULT("默认帧", f6c0.f95835j0, 0),
    BOOK_MOVIE_DREAM("书影剧", f6c0.f95802h0, 1),
    LETTER("私信", f6c0.f95971r0, 3),
    LIKE_STYLE_COMP_DEFAULT("默认帧兼容特殊喜欢", f6c0.f95835j0, 4),
    LITERATURE_DEFAULT("书影剧兼容首帧", f6c0.f95835j0, 5),
    LITERATURE_MESSAGE("书影剧私信", f6c0.f95988s0, 6),
    LIVE("划卡展示语音房内容", f6c0.f96073x0, 7),
    MOMENT_CARD("动态卡", f6c0.f96090y0, 9),
    MOMENT_GREET("动态打招呼", f6c0.f96106z0, 10),
    MOMENT("最近动态", f6c0.f95267A0, 11),
    TAG("标签", f6c0.f95819i0, 14),
    THEME_CARD("主题卡", f6c0.f95283B0, 15),
    INTL_LIVE_CARD("国际化直播", f6c0.f95559S4, 16),
    INTL_VOICE_CARD("国际化语音房", f6c0.f95689a6, 17),
    INTL_FIREND_PURPOSE("国际化交友目的", f6c0.f95954q0, 18),
    INTL_COMPLIMENT_RECEIVED("被称赞条", f6c0.f95937p0, 19),
    EXPANDED_DEFAULT("默认帧", f6c0.f95869l0, 100),
    EXPANDED_PROFILE("profile资料", f6c0.f95903n0, 101),
    EXPANDED_TAG("标签", f6c0.f95920o0, 102),
    EXPANDED_LAST_MOMENT("最近动态", f6c0.f95886m0, 103),
    EXPANDED_CARD_MOMENT("动态卡底部UI", f6c0.f95852k0, 104);

    String explain;
    int frameId;
    int frameLayoutId;

    CardBottomFrame(String str, int i, int i2) {
        this.explain = str;
        this.frameLayoutId = i;
        this.frameId = i2;
    }

    public String getDes() {
        return this.explain;
    }

    public int getFrameId() {
        return this.frameId;
    }

    public int getFrameLayoutId() {
        return this.frameLayoutId;
    }
}
