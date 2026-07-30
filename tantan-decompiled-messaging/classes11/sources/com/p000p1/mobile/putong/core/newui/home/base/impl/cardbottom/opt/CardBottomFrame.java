package com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum CardBottomFrame {
    DEFAULT("默认帧", f6c0.j0, 0),
    BOOK_MOVIE_DREAM("书影剧", f6c0.h0, 1),
    LETTER("私信", f6c0.r0, 3),
    LIKE_STYLE_COMP_DEFAULT("默认帧兼容特殊喜欢", f6c0.j0, 4),
    LITERATURE_DEFAULT("书影剧兼容首帧", f6c0.j0, 5),
    LITERATURE_MESSAGE("书影剧私信", f6c0.s0, 6),
    LIVE("划卡展示语音房内容", f6c0.x0, 7),
    MOMENT_CARD("动态卡", f6c0.y0, 9),
    MOMENT_GREET("动态打招呼", f6c0.z0, 10),
    MOMENT("最近动态", f6c0.A0, 11),
    TAG("标签", f6c0.i0, 14),
    THEME_CARD("主题卡", f6c0.B0, 15),
    INTL_LIVE_CARD("国际化直播", f6c0.S4, 16),
    INTL_VOICE_CARD("国际化语音房", f6c0.a6, 17),
    INTL_FIREND_PURPOSE("国际化交友目的", f6c0.q0, 18),
    INTL_COMPLIMENT_RECEIVED("被称赞条", f6c0.p0, 19),
    EXPANDED_DEFAULT("默认帧", f6c0.l0, 100),
    EXPANDED_PROFILE("profile资料", f6c0.n0, 101),
    EXPANDED_TAG("标签", f6c0.o0, 102),
    EXPANDED_LAST_MOMENT("最近动态", f6c0.m0, 103),
    EXPANDED_CARD_MOMENT("动态卡底部UI", f6c0.k0, 104);

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
