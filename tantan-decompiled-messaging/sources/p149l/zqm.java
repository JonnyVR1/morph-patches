package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u000e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001aH\u0017¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0017¢\u0006\u0004\b$\u0010\u001fJ\u001f\u0010%\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001aH\u0017¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(¨\u0006)"}, m87232d2 = {"Ll/zqm;", "Ll/yqm;", "Ll/t5c;", "dbHelper", "Ll/nul;", "logger", "Ll/n95;", "clock", "<init>", "(Ll/t5c;Ll/nul;Ll/n95;)V", "", "table", "", "messageIds", "userId", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z", "", "a", "(Ljava/lang/String;)Ljava/util/Set;", "Ll/oi60;", "g", "(Ljava/lang/String;)Ljava/util/List;", "c", "messageId", "", "expiresAt", "f", "(Ljava/lang/String;Ljava/lang/String;J)Z", "h", "(Ljava/util/List;Ljava/lang/String;)Z", "nowSeconds", "", "b", "(Ljava/lang/String;J)I", Constants.INAPP_DATA_TAG, "e", "Ll/t5c;", "Ll/nul;", "Ll/n95;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class zqm implements yqm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final t5c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    public zqm(@NotNull t5c t5cVar, @NotNull nul nulVar, @NotNull n95 n95Var) {
        t5cVar.getClass();
        nulVar.getClass();
        n95Var.getClass();
        this.dbHelper = t5cVar;
        this.logger = nulVar;
        this.clock = n95Var;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m219856i(String table, List<String> messageIds, String userId) {
        if (messageIds.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("?");
        int size = messageIds.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append(", ?");
        }
        String string = sb.toString();
        String[] strArr = (String[]) CollectionsKt.plus((Collection<? extends String>) messageIds, userId).toArray(new String[0]);
        try {
            this.dbHelper.getWritableDatabase().delete(table, "_id IN (" + string + ") AND messageUser = ?", strArr);
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error batch-deleting from " + table, e);
            return false;
        }
    }

    @Override // p149l.yqm
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<String> mo215746a(@NotNull String userId) {
        userId.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(Table.INBOX_PENDING_DELETES.getTableName(), new String[]{"_id"}, "messageUser = ?", new String[]{userId}, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                while (cursor.moveToNext()) {
                    linkedHashSet.add(cursor.getString(columnIndexOrThrow));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(cursorQuery, null);
                return linkedHashSet;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Error reading from " + Table.INBOX_PENDING_DELETES.getTableName(), e);
            return linkedHashSet;
        }
    }

    @Override // p149l.yqm
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public int mo215747b(@NotNull String userId, long nowSeconds) {
        userId.getClass();
        try {
            return this.dbHelper.getWritableDatabase().delete(Table.INBOX_PENDING_DELETES.getTableName(), "messageUser = ? AND state = ? AND expires > 0 AND expires <= ?", new String[]{userId, "AWAITING_CONFIRM", String.valueOf(nowSeconds)});
        } catch (SQLiteException e) {
            this.logger.verbose("Error sweeping expired pending-delete rows", e);
            return 0;
        }
    }

    @Override // p149l.yqm
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public Set<String> mo215748c(@NotNull String userId) {
        userId.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(Table.INBOX_PENDING_READS.getTableName(), new String[]{"_id"}, "messageUser = ?", new String[]{userId}, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                while (cursor.moveToNext()) {
                    linkedHashSet.add(cursor.getString(columnIndexOrThrow));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(cursorQuery, null);
                return linkedHashSet;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Error reading from " + Table.INBOX_PENDING_READS.getTableName(), e);
            return linkedHashSet;
        }
    }

    @Override // p149l.yqm
    @WorkerThread
    /* JADX INFO: renamed from: d */
    public boolean mo215749d(@NotNull List<String> messageIds, @NotNull String userId) {
        messageIds.getClass();
        userId.getClass();
        return m219856i(Table.INBOX_PENDING_READS.getTableName(), messageIds, userId);
    }

    @Override // p149l.yqm
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public int mo215750e(@NotNull String userId, long nowSeconds) {
        userId.getClass();
        try {
            return this.dbHelper.getWritableDatabase().delete(Table.INBOX_PENDING_READS.getTableName(), "messageUser = ? AND expires > 0 AND expires <= ?", new String[]{userId, String.valueOf(nowSeconds)});
        } catch (SQLiteException e) {
            this.logger.verbose("Error sweeping expired pending-read rows", e);
            return 0;
        }
    }

    @Override // p149l.yqm
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public boolean mo215751f(@NotNull String messageId, @NotNull String userId, long expiresAt) {
        messageId.getClass();
        userId.getClass();
        if (!this.dbHelper.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("messageUser", userId);
        contentValues.put("_id", messageId);
        contentValues.put("expires", Long.valueOf(expiresAt));
        contentValues.put("created_at", Long.valueOf(this.clock.mo158533c()));
        try {
            return this.dbHelper.getWritableDatabase().insertWithOnConflict(Table.INBOX_PENDING_READS.getTableName(), null, contentValues, 4) >= 0;
        } catch (SQLiteException e) {
            this.logger.verbose("Error inserting into " + Table.INBOX_PENDING_READS.getTableName(), e);
            return false;
        }
    }

    @Override // p149l.yqm
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<oi60> mo215752g(@NotNull String userId) {
        userId.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(Table.INBOX_PENDING_DELETES.getTableName(), new String[]{"_id", Constants.KEY_WZRK_PARAMS, "expires"}, "messageUser = ? AND state = ?", new String[]{userId, "PENDING_SEND"}, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(Constants.KEY_WZRK_PARAMS);
                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("expires");
                while (true) {
                    JSONObject jSONObject = null;
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    String string = cursor.isNull(columnIndexOrThrow2) ? null : cursor.getString(columnIndexOrThrow2);
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (Exception e) {
                            this.logger.verbose("Skipping malformed wzrkParams for pending delete row", e);
                        }
                    }
                    String string2 = cursor.getString(columnIndexOrThrow);
                    string2.getClass();
                    arrayList.add(new oi60(string2, jSONObject, cursor.getLong(columnIndexOrThrow3)));
                    this.logger.verbose("Error reading from " + Table.INBOX_PENDING_DELETES.getTableName(), e);
                    return arrayList;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(cursorQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e2) {
            this.logger.verbose("Error reading from " + Table.INBOX_PENDING_DELETES.getTableName(), e2);
        }
        return arrayList;
    }

    @Override // p149l.yqm
    @WorkerThread
    /* JADX INFO: renamed from: h */
    public boolean mo215753h(@NotNull List<String> messageIds, @NotNull String userId) {
        messageIds.getClass();
        userId.getClass();
        if (messageIds.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("?");
        int size = messageIds.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append(", ?");
        }
        String string = sb.toString();
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", "AWAITING_CONFIRM");
        String[] strArr = (String[]) CollectionsKt.plus((Collection<? extends String>) messageIds, userId).toArray(new String[0]);
        try {
            this.dbHelper.getWritableDatabase().update(Table.INBOX_PENDING_DELETES.getTableName(), contentValues, "_id IN (" + string + ") AND messageUser = ?", strArr);
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error transitioning rows to AWAITING_CONFIRM", e);
            return false;
        }
    }
}
