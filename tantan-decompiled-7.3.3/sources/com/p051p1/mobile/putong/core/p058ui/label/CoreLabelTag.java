package com.p051p1.mobile.putong.core.p058ui.label;

import p153l.zvl;

/* JADX INFO: loaded from: classes3.dex */
public enum CoreLabelTag implements zvl {
    INTEREST_SUGGEST("根据爱好推荐", 0),
    WAIT_CHAT("等人聊天", 1),
    SETTING_SUGGEST("偏好推荐", 2),
    LIVING("直播中", 3),
    GENDER_AGE("性别年龄", 4),
    AVATAR_VERIFIED("头像认证", 5),
    HEART_SIGNAL("心动信号", 6),
    VOICING("语聊中", 7),
    QUICK_CHAT("闪聊匹配", 8),
    ID_VERIFIED("实名.头像本人", 9),
    CHOICENESS("精选", 10),
    LIKE_ME("TA喜欢了你", 11),
    STUDENT("学生", 12),
    VIP("VIP", 12),
    SVIP("SVIP", 14),
    PLATINUM("白金", 15),
    DIAMOND("黑金", 16),
    NEW("New", 17),
    AVATAR_ICON("头像认真-仅图标", 18),
    OLD_VERIFIED_ICON("旧版实名认真-仅图标", 19),
    OLD_AVATAR_ICON("旧版头像认真-仅图标", 20);

    private final int index;
    private final String tag;

    CoreLabelTag(String str, int i) {
        this.tag = str;
        this.index = i;
    }

    public String getLabelTag() {
        return this.tag;
    }

    @Override // p153l.zvl
    public int labelIndex() {
        return this.index;
    }
}
