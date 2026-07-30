package com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "", "<init>", "(Ljava/lang/String;I)V", "page_privilege", "pop_one", "pop_two", "page_fullscreen_one", "page_fullscreen_two", "page_coin", "page_discount_trial", "page_discount_callback", "page_discount_12m", "page_discount_custom", "page_svip_upgrade", "page_odiamond_upgrade", "page_discount_trial_vip", "page_discount_6m", "page_discount_trial_see", "none", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public enum PurchaseTrackPageType {
    page_privilege,
    pop_one,
    pop_two,
    page_fullscreen_one,
    page_fullscreen_two,
    page_coin,
    page_discount_trial,
    page_discount_callback,
    page_discount_12m,
    page_discount_custom,
    page_svip_upgrade,
    page_odiamond_upgrade,
    page_discount_trial_vip,
    page_discount_6m,
    page_discount_trial_see,
    none;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    public static EnumEntries<PurchaseTrackPageType> getEntries() {
        return $ENTRIES;
    }
}
