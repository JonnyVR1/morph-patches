package com.p000p1.mobile.putong.core.data;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public enum SuggesterReason {
    INTERNATIONAL("international"),
    BOTTOM_WINDOW("bottom_window"),
    SENCE("sence"),
    NO_HOME("no_home"),
    WEAK_NETWORK("weak_network");

    final String reason;

    SuggesterReason(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
