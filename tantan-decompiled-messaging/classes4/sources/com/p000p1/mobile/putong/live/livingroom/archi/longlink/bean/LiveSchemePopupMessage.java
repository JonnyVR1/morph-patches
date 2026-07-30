package com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSchemePopupMessage {
    private long delay;
    private LongLinkLiveMessage.SchemePopup popup;
    private String scheme;
    private String uniqueId;

    public LiveSchemePopupMessage(String str, long j, String str2) {
        this.scheme = str;
        this.delay = j;
        this.uniqueId = str2;
    }

    public long getDelay() {
        return this.delay;
    }

    public String getScheme() {
        return this.scheme;
    }

    public LiveSchemePopupMessage setResultMessage(LongLinkLiveMessage.SchemePopup schemePopup) {
        this.popup = schemePopup;
        return this;
    }
}
