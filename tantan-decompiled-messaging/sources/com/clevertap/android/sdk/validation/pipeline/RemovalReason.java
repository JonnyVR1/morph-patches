package com.clevertap.android.sdk.validation.pipeline;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m87232d2 = {"Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", "", "<init>", "(Ljava/lang/String;I)V", "NULL_VALUE", "EMPTY_VALUE", "EMPTY_KEY", "NON_PRIMITIVE_VALUE", "INVALID_PHONE_NUMBER", "INVALID_COUNTRY_CODE", "RESTRICTED_KEY_NESTED_VALUE", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum RemovalReason {
    NULL_VALUE,
    EMPTY_VALUE,
    EMPTY_KEY,
    NON_PRIMITIVE_VALUE,
    INVALID_PHONE_NUMBER,
    INVALID_COUNTRY_CODE,
    RESTRICTED_KEY_NESTED_VALUE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    public static EnumEntries<RemovalReason> getEntries() {
        return $ENTRIES;
    }
}
