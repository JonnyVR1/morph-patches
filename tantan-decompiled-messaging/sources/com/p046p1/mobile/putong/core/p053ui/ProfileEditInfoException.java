package com.p046p1.mobile.putong.core.p053ui;

import com.p046p1.mobile.putong.core.data.ProfileEditInfo;

/* JADX INFO: loaded from: classes8.dex */
public class ProfileEditInfoException extends RuntimeException {
    private ProfileEditInfo editInfo;

    public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
        this.editInfo = profileEditInfo;
    }

    public ProfileEditInfo getEditInfo() {
        return this.editInfo;
    }
}
