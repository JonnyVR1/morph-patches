package com.p046p1.mobile.putong.core.p053ui.report;

import com.p046p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: classes9.dex */
enum ReportCategory {
    FAKE_ACCOUNT(R$string.f18218Vl),
    SPAM(R$string.f18400bm),
    FRAUD(R$string.f18248Wl),
    EXPLICIT(R$string.f18188Ul),
    PROFANITY(R$string.f18338Zl),
    YOUNGER(R$string.f18278Xl),
    VIOLENCE(R$string.f18431cm),
    RECOMMEND(R$string.f18369am),
    OTHER(R$string.f18308Yl);

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
