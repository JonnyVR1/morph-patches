package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inbox.InboxMessageSource;
import com.clevertap.android.sdk.p014db.Table;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlin.text.C15491b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a2\u0006\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0004\b)\u0010%J%\u0010*\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0004\b*\u0010(J%\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110-2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102¨\u00063"}, m88121d2 = {"Ll/ysm;", "Ll/xsm;", "Ll/z6c;", "dbHelper", "Ll/axl;", "logger", "Ll/j1c;", "dbEncryptionHandler", "<init>", "(Ll/z6c;Ll/axl;Ll/j1c;)V", "Landroid/database/Cursor;", "cursor", "", "columnIndex", "Lcom/clevertap/android/sdk/inbox/InboxMessageSource;", "j", "(Landroid/database/Cursor;I)Lcom/clevertap/android/sdk/inbox/InboxMessageSource;", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/database/Cursor;I)Ljava/lang/String;", "count", "h", "(I)Ljava/lang/String;", "userId", "Ljava/util/ArrayList;", "Ll/ow3;", "Lkotlin/collections/ArrayList;", "g", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "inboxMessages", "", "e", "(Ljava/util/List;)V", "messageId", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", "messageIds", "b", "(Ljava/util/List;Ljava/lang/String;)Z", "a", "f", "", "staleCutoffSeconds", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;J)Ljava/util/Set;", "Ll/z6c;", "Ll/axl;", "Ll/j1c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ysm implements xsm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final z6c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final j1c dbEncryptionHandler;

    public ysm(@NotNull z6c z6cVar, @NotNull axl axlVar, @NotNull j1c j1cVar) {
        z6cVar.getClass();
        axlVar.getClass();
        j1cVar.getClass();
        this.dbHelper = z6cVar;
        this.logger = axlVar;
        this.dbEncryptionHandler = j1cVar;
    }

    /* JADX INFO: renamed from: h */
    private final String m217258h(int count) {
        StringBuilder sb = new StringBuilder();
        if (count > 0) {
            sb.append("?");
            int i = count - 1;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(", ?");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    private final String m217259i(Cursor cursor, int columnIndex) {
        String string;
        if (columnIndex >= 0 && (string = cursor.getString(columnIndex)) != null) {
            return (Intrinsics.m88377d(string, "PENDING_INDEXING") || Intrinsics.m88377d(string, "INDEXED")) ? string : "PENDING_INDEXING";
        }
        return "PENDING_INDEXING";
    }

    /* JADX INFO: renamed from: j */
    private final InboxMessageSource m217260j(Cursor cursor, int columnIndex) {
        if (columnIndex < 0) {
            return InboxMessageSource.V1;
        }
        String string = cursor.getString(columnIndex);
        if (string == null) {
            return InboxMessageSource.V1;
        }
        try {
            return InboxMessageSource.valueOf(string);
        } catch (IllegalArgumentException unused) {
            return InboxMessageSource.V1;
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public boolean mo212989a(@NotNull String messageId, @NotNull String userId) {
        messageId.getClass();
        userId.getClass();
        String tableName = Table.INBOX_MESSAGES.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", (Integer) 1);
        try {
            this.dbHelper.getWritableDatabase().update(tableName, contentValues, "_id = ? AND messageUser = ?", new String[]{messageId, userId});
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error updating record in " + tableName, e);
            return false;
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public boolean mo212990b(@NotNull List<String> messageIds, @NotNull String userId) {
        messageIds.getClass();
        userId.getClass();
        if (messageIds.isEmpty()) {
            this.logger.verbose("messageIds list is empty, nothing to delete.");
            return true;
        }
        String tableName = Table.INBOX_MESSAGES.getTableName();
        String strM217258h = m217258h(messageIds.size());
        List mutableList = CollectionsKt.toMutableList((Collection) messageIds);
        mutableList.add(userId);
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id IN (" + strM217258h + ") AND messageUser = ?", (String[]) mutableList.toArray(new String[0]));
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale records from " + tableName, e);
            return false;
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public boolean mo212991c(@NotNull String messageId, @NotNull String userId) {
        messageId.getClass();
        userId.getClass();
        String tableName = Table.INBOX_MESSAGES.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id = ? AND messageUser = ?", new String[]{messageId, userId});
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale records from " + tableName, e);
            return false;
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<String> mo212992d(@NotNull String userId, long staleCutoffSeconds) {
        userId.getClass();
        String tableName = Table.INBOX_MESSAGES.getTableName();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, new String[]{"_id"}, "messageUser = ? AND source = ? AND expires != 0 AND (index_state = ? OR (index_state = ? AND created_at < ?))", new String[]{userId, "V2", "INDEXED", "PENDING_INDEXING", String.valueOf(staleCutoffSeconds)}, null, null, null);
            if (cursorQuery == null) {
                return linkedHashSet;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                while (cursor2.moveToNext()) {
                    String string = cursor2.getString(columnIndexOrThrow);
                    if (string != null) {
                        linkedHashSet.add(string);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(cursor, null);
                return linkedHashSet;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursor, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Error querying sweepable V2 ids from " + tableName, e);
            return linkedHashSet;
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public void mo212993e(@NotNull List<? extends ow3> inboxMessages) {
        inboxMessages.getClass();
        if (!this.dbHelper.m218782k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return;
        }
        String strM94361i = C15491b.m94361i("\n            INSERT INTO " + Table.INBOX_MESSAGES.getTableName() + " (\n                _id,\n                data,\n                wzrkParams,\n                campaignId,\n                tags,\n                isRead,\n                expires,\n                created_at,\n                messageUser,\n                source,\n                index_state\n            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n            ON CONFLICT(messageUser, _id) DO UPDATE SET\n                data = excluded.data,\n                wzrkParams = excluded.wzrkParams,\n                campaignId = excluded.campaignId,\n                tags = excluded.tags,\n                isRead = excluded.isRead,\n                expires = excluded.expires,\n                created_at = excluded.created_at,\n                source = excluded.source\n        ");
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        for (ow3 ow3Var : inboxMessages) {
            try {
                j1c j1cVar = this.dbEncryptionHandler;
                String string = ow3Var.m169498g().toString();
                string.getClass();
                String strM143114c = j1cVar.m143114c(string);
                String strM169496e = ow3Var.m169496e();
                String string2 = ow3Var.m169502l().toString();
                String strM169493b = ow3Var.m169493b();
                String strM169500i = ow3Var.m169500i();
                Integer numValueOf = Integer.valueOf(ow3Var.m169503n());
                Long lValueOf = Long.valueOf(ow3Var.m169495d());
                Long lValueOf2 = Long.valueOf(ow3Var.m169494c());
                String strM169501j = ow3Var.m169501j();
                InboxMessageSource inboxMessageSourceM169499h = ow3Var.m169499h();
                if (inboxMessageSourceM169499h == null) {
                    inboxMessageSourceM169499h = InboxMessageSource.V1;
                }
                String strName = inboxMessageSourceM169499h.name();
                String strM169497f = ow3Var.m169497f();
                if (strM169497f == null) {
                    strM169497f = "PENDING_INDEXING";
                }
                writableDatabase.execSQL(strM94361i, new Object[]{strM169496e, strM143114c, string2, strM169493b, strM169500i, numValueOf, lValueOf, lValueOf2, strM169501j, strName, strM169497f});
            } catch (SQLiteException e) {
                this.logger.verbose("Error adding data to table " + Table.INBOX_MESSAGES.getTableName(), e);
            }
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public boolean mo212994f(@NotNull List<String> messageIds, @NotNull String userId) {
        messageIds.getClass();
        userId.getClass();
        if (messageIds.isEmpty()) {
            return true;
        }
        String tableName = Table.INBOX_MESSAGES.getTableName();
        String strM217258h = m217258h(messageIds.size());
        List mutableList = CollectionsKt.toMutableList((Collection) messageIds);
        mutableList.add(userId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("index_state", "INDEXED");
        try {
            this.dbHelper.getWritableDatabase().update(tableName, contentValues, "_id IN (" + strM217258h + ") AND messageUser = ?", (String[]) mutableList.toArray(new String[0]));
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error marking inbox rows indexed in " + tableName, e);
            return false;
        }
    }

    @Override // p153l.xsm
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: g */
    public ArrayList<ow3> mo212995g(@NotNull String userId) {
        Throwable th;
        userId.getClass();
        String tableName = Table.INBOX_MESSAGES.getTableName();
        ArrayList<ow3> arrayList = new ArrayList<>();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, null, "messageUser = ?", new String[]{userId}, null, null, "created_at DESC");
            if (cursorQuery == null) {
                return arrayList;
            }
            try {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("data");
                    int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow(Constants.KEY_WZRK_PARAMS);
                    int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("created_at");
                    int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("expires");
                    int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("isRead");
                    int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("messageUser");
                    int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("tags");
                    int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("campaignId");
                    int columnIndex = cursor2.getColumnIndex("source");
                    int columnIndex2 = cursor2.getColumnIndex("index_state");
                    while (cursor2.moveToNext()) {
                        tableName = tableName;
                        try {
                            cursor = cursor;
                            try {
                                String strM143113b = this.dbEncryptionHandler.m143113b(cursor2.getString(columnIndexOrThrow2));
                                if (strM143113b == null) {
                                    this.logger.debug("There was some problem in loading inbox message from DB");
                                } else {
                                    ow3 ow3Var = new ow3();
                                    ow3Var.m169507r(cursor2.getString(columnIndexOrThrow));
                                    ow3Var.m169509t(new JSONObject(strM143113b));
                                    ow3Var.m169514y(new JSONObject(cursor2.getString(columnIndexOrThrow3)));
                                    ow3Var.m169505p(cursor2.getLong(columnIndexOrThrow4));
                                    ow3Var.m169506q(cursor2.getLong(columnIndexOrThrow5));
                                    ow3Var.m169510u(cursor2.getInt(columnIndexOrThrow6));
                                    ow3Var.m169513x(cursor2.getString(columnIndexOrThrow7));
                                    ow3Var.m169512w(cursor2.getString(columnIndexOrThrow8));
                                    ow3Var.m169504o(cursor2.getString(columnIndexOrThrow9));
                                    ow3Var.m169511v(m217260j(cursor2, columnIndex));
                                    ow3Var.m169508s(m217259i(cursor2, columnIndex2));
                                    arrayList.add(ow3Var);
                                    columnIndexOrThrow = columnIndexOrThrow;
                                    columnIndexOrThrow2 = columnIndexOrThrow2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursor;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.m88293a(cursor, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                    cursor = cursor;
                    tableName = tableName;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.m88293a(cursor, null);
                    return arrayList;
                } catch (Throwable th5) {
                    th = th5;
                    tableName = tableName;
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            tableName = tableName;
        }
        this.logger.verbose("Error retrieving records from " + tableName, e);
        return arrayList;
    }
}
