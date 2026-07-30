package com.p003p1.mobile.putong.core.p006ui;

import com.p1.mobile.putong.core.data.ProfileEditInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ProfileEditInfoException extends RuntimeException {
    private ProfileEditInfo editInfo;

    public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
        this.editInfo = profileEditInfo;
    }

    public ProfileEditInfo getEditInfo() {
        return this.editInfo;
    }
}
