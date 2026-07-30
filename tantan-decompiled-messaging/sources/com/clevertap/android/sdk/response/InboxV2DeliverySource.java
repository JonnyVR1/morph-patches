package com.clevertap.android.sdk.response;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;", "", "<init>", "(Ljava/lang/String;I)V", "FETCH", "A1", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public enum InboxV2DeliverySource {
    FETCH,
    A1;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    public static EnumEntries<InboxV2DeliverySource> getEntries() {
        return $ENTRIES;
    }
}
