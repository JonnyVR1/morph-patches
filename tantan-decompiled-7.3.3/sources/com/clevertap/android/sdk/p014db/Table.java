package com.clevertap.android.sdk.p014db;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/clevertap/android/sdk/db/Table;", "", "tableName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTableName", "()Ljava/lang/String;", "EVENTS", "PROFILE_EVENTS", "USER_PROFILES", "INBOX_MESSAGES", "PUSH_NOTIFICATIONS", "UNINSTALL_TS", "PUSH_NOTIFICATION_VIEWED", "USER_EVENT_LOGS_TABLE", "DELAYED_LEGACY_INAPPS", "INBOX_PENDING_DELETES", "INBOX_PENDING_READS", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum Table {
    EVENTS("events"),
    PROFILE_EVENTS("profileEvents"),
    USER_PROFILES("userProfiles"),
    INBOX_MESSAGES("inboxMessages"),
    PUSH_NOTIFICATIONS("pushNotifications"),
    UNINSTALL_TS("uninstallTimestamp"),
    PUSH_NOTIFICATION_VIEWED("notificationViewed"),
    USER_EVENT_LOGS_TABLE("userEventLogs"),
    DELAYED_LEGACY_INAPPS("delayedLegacyInApps"),
    INBOX_PENDING_DELETES("inbox_pending_deletes"),
    INBOX_PENDING_READS("inbox_pending_reads");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    private final String tableName;

    Table(String str) {
        this.tableName = str;
    }

    @NotNull
    public static EnumEntries<Table> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getTableName() {
        return this.tableName;
    }
}
