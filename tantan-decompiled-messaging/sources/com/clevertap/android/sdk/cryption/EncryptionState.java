package com.clevertap.android.sdk.cryption;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionState;", "", "<init>", "(Ljava/lang/String;I)V", "ENCRYPTED_AES", "ENCRYPTED_AES_GCM", "PLAIN_TEXT", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum EncryptionState {
    ENCRYPTED_AES,
    ENCRYPTED_AES_GCM,
    PLAIN_TEXT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    public static EnumEntries<EncryptionState> getEntries() {
        return $ENTRIES;
    }
}
