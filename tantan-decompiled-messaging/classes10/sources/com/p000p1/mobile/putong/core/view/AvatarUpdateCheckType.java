package com.p000p1.mobile.putong.core.view;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public enum AvatarUpdateCheckType {
    LOCAL_CHECK("本地的模型识别：二维码，涉政，黄图", true),
    REMOTE_CHECK("后端模型检测", false);

    boolean beforeCheck;
    String desc;

    AvatarUpdateCheckType(String str, boolean z) {
        this.desc = str;
        this.beforeCheck = z;
    }

    public boolean isBeforeCheck() {
        return this.beforeCheck;
    }
}
