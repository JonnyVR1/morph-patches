package com.clevertap.android.sdk.profile.traversal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.eclipse.jetty.http.HttpMethods;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, m88121d2 = {"Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATE", "INCREMENT", "DECREMENT", HttpMethods.DELETE, "ARRAY_ADD", "ARRAY_REMOVE", "GET", "isNumericOperation", "", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum ProfileOperation {
    UPDATE,
    INCREMENT,
    DECREMENT,
    DELETE,
    ARRAY_ADD,
    ARRAY_REMOVE,
    GET;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    public static EnumEntries<ProfileOperation> getEntries() {
        return $ENTRIES;
    }

    public final boolean isNumericOperation() {
        return this == INCREMENT || this == DECREMENT;
    }
}
