package com.p051p1.mobile.putong.core.p058ui.verification;

import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes12.dex */
public enum CertPrivilege {
    more_swipe("swipe"),
    priority_recommend("recommend"),
    cert_logo("logo"),
    high_privacy_setting("privacy"),
    only_look_cert(SocialConstants.PARAM_ONLY);

    private final String trackName;

    CertPrivilege(String str) {
        this.trackName = str;
    }

    public String getTrackName() {
        return this.trackName;
    }
}
