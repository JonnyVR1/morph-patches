package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b4\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0002\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0002\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0002\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0002\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0002\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0002\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0002\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0002\"\u0014\u00101\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0002\"\u0014\u00103\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0002¨\u00064"}, m87232d2 = {"", "a", "Ljava/lang/String;", "CREATE_EVENTS_TABLE", "b", "CREATE_USER_EVENT_LOGS_TABLE", "c", "CREATE_DELAYED_LEGACY_INAPPS_TABLE", Constants.INAPP_DATA_TAG, "CREATE_INBOX_PENDING_DELETES_TABLE", "e", "CREATE_INBOX_PENDING_READS_TABLE", "f", "CREATE_PROFILE_EVENTS_TABLE", "g", "CREATE_INBOX_MESSAGES_TABLE", "h", "ALTER_INBOX_MESSAGES_ADD_SOURCE", RXScreenCaptureService.KEY_INDEX, "ALTER_INBOX_MESSAGES_ADD_INDEX_STATE", "j", "INBOX_MESSAGES_COMP_ID_USERID_INDEX", "k", "EVENTS_TIME_INDEX", BLiveStormDanmakuGiftResourceType.f44444l, "PROFILE_EVENTS_TIME_INDEX", "m", "CREATE_PUSH_NOTIFICATIONS_TABLE", "n", "PUSH_NOTIFICATIONS_TIME_INDEX", "o", "CREATE_UNINSTALL_TS_TABLE", "p", "UNINSTALL_TS_INDEX", "q", "CREATE_NOTIFICATION_VIEWED_TABLE", "r", "NOTIFICATION_VIEWED_INDEX", BLiveStormDanmakuGiftResourceType.f44446s, "DROP_TABLE_UNINSTALL_TS", Constants.KEY_T, "DROP_TABLE_INBOX_MESSAGES", "u", "DROP_TABLE_PUSH_NOTIFICATION_VIEWED", ResourceDirection.f38808v, "CREATE_USER_PROFILES_TABLE", "w", "CREATE_TEMP_USER_PROFILES_TABLE", BaseSei.f13930X, "DROP_USER_PROFILES_TABLE", BaseSei.f13931Y, "RENAME_USER_PROFILES_TABLE", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class owb {

    /* JADX INFO: renamed from: a */
    @NotNull
    private static final String f145975a;

    /* JADX INFO: renamed from: b */
    @NotNull
    private static final String f145976b;

    /* JADX INFO: renamed from: c */
    @NotNull
    private static final String f145977c;

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final String f145978d;

    /* JADX INFO: renamed from: e */
    @NotNull
    private static final String f145979e;

    /* JADX INFO: renamed from: f */
    @NotNull
    private static final String f145980f;

    /* JADX INFO: renamed from: g */
    @NotNull
    private static final String f145981g;

    /* JADX INFO: renamed from: h */
    @NotNull
    private static final String f145982h;

    /* JADX INFO: renamed from: i */
    @NotNull
    private static final String f145983i;

    /* JADX INFO: renamed from: j */
    @NotNull
    private static final String f145984j;

    /* JADX INFO: renamed from: k */
    @NotNull
    private static final String f145985k;

    /* JADX INFO: renamed from: l */
    @NotNull
    private static final String f145986l;

    /* JADX INFO: renamed from: m */
    @NotNull
    private static final String f145987m;

    /* JADX INFO: renamed from: n */
    @NotNull
    private static final String f145988n;

    /* JADX INFO: renamed from: o */
    @NotNull
    private static final String f145989o;

    /* JADX INFO: renamed from: p */
    @NotNull
    private static final String f145990p;

    /* JADX INFO: renamed from: q */
    @NotNull
    private static final String f145991q;

    /* JADX INFO: renamed from: r */
    @NotNull
    private static final String f145992r;

    /* JADX INFO: renamed from: s */
    @NotNull
    private static final String f145993s;

    /* JADX INFO: renamed from: t */
    @NotNull
    private static final String f145994t;

    /* JADX INFO: renamed from: u */
    @NotNull
    private static final String f145995u;

    /* JADX INFO: renamed from: v */
    @NotNull
    private static final String f145996v;

    /* JADX INFO: renamed from: w */
    @NotNull
    private static final String f145997w;

    /* JADX INFO: renamed from: x */
    @NotNull
    private static final String f145998x;

    /* JADX INFO: renamed from: y */
    @NotNull
    private static final String f145999y;

    static {
        StringBuilder sb = new StringBuilder("\n    CREATE TABLE ");
        Table table = Table.EVENTS;
        sb.append(table.getTableName());
        sb.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        f145975a = sb.toString();
        f145976b = "\n    CREATE TABLE " + Table.USER_EVENT_LOGS_TABLE.getTableName() + " (\n        deviceID STRING NOT NULL,\n        eventName STRING NOT NULL,\n        normalizedEventName STRING NOT NULL,\n        firstTs INTEGER NOT NULL,\n        lastTs INTEGER NOT NULL,\n        count INTEGER NOT NULL,\n        PRIMARY KEY (deviceID, normalizedEventName)\n    );\n";
        f145977c = "\n    CREATE TABLE " + Table.DELAYED_LEGACY_INAPPS.getTableName() + " (\n        inAppId STRING PRIMARY KEY,\n        delay INTEGER NOT NULL,\n        data TEXT NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n";
        f145978d = "\n    CREATE TABLE " + Table.INBOX_PENDING_DELETES.getTableName() + " (\n        messageUser STRING NOT NULL,\n        _id STRING NOT NULL,\n        wzrkParams TEXT,\n        state TEXT NOT NULL DEFAULT 'PENDING_SEND',\n        expires INTEGER NOT NULL,\n        created_at INTEGER NOT NULL,\n        PRIMARY KEY (messageUser, _id)\n    );\n";
        f145979e = "\n    CREATE TABLE " + Table.INBOX_PENDING_READS.getTableName() + " (\n        messageUser STRING NOT NULL,\n        _id STRING NOT NULL,\n        expires INTEGER NOT NULL,\n        created_at INTEGER NOT NULL,\n        PRIMARY KEY (messageUser, _id)\n    );\n";
        StringBuilder sb2 = new StringBuilder("\n    CREATE TABLE ");
        Table table2 = Table.PROFILE_EVENTS;
        sb2.append(table2.getTableName());
        sb2.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        f145980f = sb2.toString();
        StringBuilder sb3 = new StringBuilder("\n    CREATE TABLE ");
        Table table3 = Table.INBOX_MESSAGES;
        sb3.append(table3.getTableName());
        sb3.append(" (\n        _id STRING NOT NULL,\n        data TEXT NOT NULL,\n        wzrkParams TEXT NOT NULL,\n        campaignId STRING NOT NULL,\n        tags TEXT NOT NULL,\n        isRead INTEGER NOT NULL DEFAULT 0,\n        expires INTEGER NOT NULL,\n        created_at INTEGER NOT NULL,\n        messageUser STRING NOT NULL,\n        source TEXT NOT NULL DEFAULT 'V1',\n        index_state TEXT NOT NULL DEFAULT 'PENDING_INDEXING'\n    );\n");
        f145981g = sb3.toString();
        f145982h = "\n    ALTER TABLE " + table3.getTableName() + "\n    ADD COLUMN source TEXT NOT NULL DEFAULT 'V1';\n";
        f145983i = "\n    ALTER TABLE " + table3.getTableName() + "\n    ADD COLUMN index_state TEXT NOT NULL DEFAULT 'PENDING_INDEXING';\n";
        f145984j = "\n    CREATE UNIQUE INDEX IF NOT EXISTS userid_id_idx ON " + table3.getTableName() + " (\n        messageUser,\n        _id\n    );\n";
        f145985k = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table.getTableName() + " (created_at);\n";
        f145986l = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table2.getTableName() + " ( created_at);\n";
        StringBuilder sb4 = new StringBuilder("\n    CREATE TABLE ");
        Table table4 = Table.PUSH_NOTIFICATIONS;
        sb4.append(table4.getTableName());
        sb4.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL,\n        isRead INTEGER NOT NULL\n    );\n");
        f145987m = sb4.toString();
        f145988n = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table4.getTableName() + " (created_at);\n";
        StringBuilder sb5 = new StringBuilder("\n    CREATE TABLE ");
        Table table5 = Table.UNINSTALL_TS;
        sb5.append(table5.getTableName());
        sb5.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        created_at INTEGER NOT NULL\n    );\n");
        f145989o = sb5.toString();
        f145990p = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table5.getTableName() + " (created_at);\n";
        StringBuilder sb6 = new StringBuilder("\n    CREATE TABLE ");
        Table table6 = Table.PUSH_NOTIFICATION_VIEWED;
        sb6.append(table6.getTableName());
        sb6.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        f145991q = sb6.toString();
        f145992r = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table6.getTableName() + " (created_at);\n";
        StringBuilder sb7 = new StringBuilder("DROP TABLE IF EXISTS ");
        sb7.append(table5.getTableName());
        f145993s = sb7.toString();
        f145994t = "DROP TABLE IF EXISTS " + table3.getTableName();
        f145995u = "DROP TABLE IF EXISTS " + table6.getTableName();
        StringBuilder sb8 = new StringBuilder("\n    CREATE TABLE ");
        Table table7 = Table.USER_PROFILES;
        sb8.append(table7.getTableName());
        sb8.append(" (\n        deviceID STRING NOT NULL,\n        _id STRING NOT NULL,\n        data STRING NOT NULL,\n        PRIMARY KEY (_id, deviceID)\n    );\n");
        f145996v = sb8.toString();
        f145997w = "\n    CREATE TABLE temp_" + table7.getTableName() + " (\n        _id STRING NOT NULL,\n        deviceID STRING NOT NULL,\n        data STRING NOT NULL,\n        PRIMARY KEY (_id, deviceID)\n    );\n";
        f145998x = "\n    DROP TABLE " + table7.getTableName() + ";\n";
        f145999y = "\n    ALTER TABLE temp_" + table7.getTableName() + " RENAME TO " + table7.getTableName() + ";\n";
    }
}
