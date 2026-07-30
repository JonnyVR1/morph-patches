package com.p000p1.mobile.putong.core.p004ui.verification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public enum CertPrivilege {
    more_swipe("swipe"),
    priority_recommend("recommend"),
    cert_logo("logo"),
    high_privacy_setting("privacy"),
    only_look_cert("only");

    private final String trackName;

    CertPrivilege(String str) {
        this.trackName = str;
    }

    public String getTrackName() {
        return this.trackName;
    }
}
