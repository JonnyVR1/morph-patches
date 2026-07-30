package com.p046p1.mobile.putong.core.newui.home.card.expanded.anim;

/* JADX INFO: loaded from: classes11.dex */
public enum ExpandedCardClipStatus {
    UNKNOWN("非初始化状态"),
    EXPANDED_CARD("默认展开状态-卡片下的样式"),
    EXPANDED_PROFILE("默认展开状态-卡片上平滑切换到详情的样式"),
    SWIPE_CLIP("划卡的裁剪"),
    SWIPE_CLIP_PROFILE("划卡的裁剪-卡片上平滑切换到详情的样式"),
    SWIPE_CLIP_ANCHOR("划卡的裁剪-锚点"),
    SCROLL_CLIP("上下滑动的裁剪-顶部裁剪留白顶部认证位置"),
    FLING_CLIP("卡片飞出的裁剪-缩成一个圆形");

    private String des;

    ExpandedCardClipStatus(String str) {
        this.des = str;
    }
}
