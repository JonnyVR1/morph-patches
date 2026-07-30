package com.p051p1.mobile.putong.core.p058ui;

import com.p051p1.mobile.putong.core.data.ProfileEditInfo;

/* JADX INFO: loaded from: classes6.dex */
public class ProfileEditInfoException extends RuntimeException {
    private ProfileEditInfo editInfo;

    public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
        this.editInfo = profileEditInfo;
    }

    public ProfileEditInfo getEditInfo() {
        return this.editInfo;
    }
}
