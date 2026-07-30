package com.p051p1.mobile.putong.core.newui.rewardscard;

import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;

/* JADX INFO: loaded from: classes11.dex */
public enum RewardType {
    SUPERLIKE("superLike"),
    UNDO("undo"),
    ROAMING("roaming"),
    BOOST("boost"),
    ADVANCE(SummarizedPrivilegesId.advancedSearch),
    NOTHING("nothing");

    public final String text;

    RewardType(String str) {
        this.text = str;
    }
}
