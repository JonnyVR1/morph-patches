package com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import p153l.kec0;

/* JADX INFO: loaded from: classes11.dex */
public enum CardBottomFrame {
    DEFAULT("默认帧", kec0.f125889j0, 0),
    BOOK_MOVIE_DREAM("书影剧", kec0.f125856h0, 1),
    LETTER("私信", kec0.f126025r0, 3),
    LIKE_STYLE_COMP_DEFAULT("默认帧兼容特殊喜欢", kec0.f125889j0, 4),
    LITERATURE_DEFAULT("书影剧兼容首帧", kec0.f125889j0, 5),
    LITERATURE_MESSAGE("书影剧私信", kec0.f126042s0, 6),
    LIVE("划卡展示语音房内容", kec0.f126127x0, 7),
    MOMENT_CARD("动态卡", kec0.f126144y0, 9),
    MOMENT_GREET("动态打招呼", kec0.f126161z0, 10),
    MOMENT("最近动态", kec0.f125316A0, 11),
    TAG("标签", kec0.f125873i0, 14),
    THEME_CARD("主题卡", kec0.f125333B0, 15),
    INTL_LIVE_CARD("国际化直播", kec0.f125613S4, 16),
    INTL_VOICE_CARD("国际化语音房", kec0.f125760b6, 17),
    INTL_FIREND_PURPOSE("国际化交友目的", kec0.f126008q0, 18),
    INTL_COMPLIMENT_RECEIVED("被称赞条", kec0.f125991p0, 19),
    EXPANDED_DEFAULT("默认帧", kec0.f125923l0, 100),
    EXPANDED_PROFILE("profile资料", kec0.f125957n0, 101),
    EXPANDED_TAG("标签", kec0.f125974o0, 102),
    EXPANDED_LAST_MOMENT("最近动态", kec0.f125940m0, 103),
    EXPANDED_CARD_MOMENT("动态卡底部UI", kec0.f125906k0, 104);

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
