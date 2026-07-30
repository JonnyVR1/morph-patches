package com.p000p1.mobile.putong.core.p004ui.report;

import com.p000p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
enum ReportCategory {
    FAKE_ACCOUNT(R$string.f2207Vl),
    SPAM(R$string.f2389bm),
    FRAUD(R$string.f2237Wl),
    EXPLICIT(R$string.f2177Ul),
    PROFANITY(R$string.f2327Zl),
    YOUNGER(R$string.f2267Xl),
    VIOLENCE(R$string.f2420cm),
    RECOMMEND(R$string.f2358am),
    OTHER(R$string.f2297Yl);

    public final int resId;

    ReportCategory(int i) {
        this.resId = i;
    }

    public boolean isCategorised() {
        return this != OTHER;
    }

    public boolean isGP() {
        return true;
    }
}
