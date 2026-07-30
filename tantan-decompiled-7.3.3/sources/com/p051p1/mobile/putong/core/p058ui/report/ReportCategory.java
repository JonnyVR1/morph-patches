package com.p051p1.mobile.putong.core.p058ui.report;

import com.p051p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: classes12.dex */
enum ReportCategory {
    FAKE_ACCOUNT(R$string.f19623rm),
    SPAM(R$string.f19809xm),
    FRAUD(R$string.f19654sm),
    EXPLICIT(R$string.f19592qm),
    PROFANITY(R$string.f19747vm),
    YOUNGER(R$string.f19685tm),
    VIOLENCE(R$string.f19840ym),
    RECOMMEND(R$string.f19778wm),
    OTHER(R$string.f19716um);

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
