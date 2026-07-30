package com.p000p1.mobile.putong.core.p004ui.purchase.mediator.agreement;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN_", "CHECKED", "UNCHECKED", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum PurchaseAgreementState {
    UNKNOWN_,
    CHECKED,
    UNCHECKED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    @NotNull
    public static EnumEntries<PurchaseAgreementState> getEntries() {
        return $ENTRIES;
    }
}
