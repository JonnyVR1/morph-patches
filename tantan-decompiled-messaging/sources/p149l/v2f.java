package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006*"}, m87232d2 = {"Ll/v2f;", "Ll/u2f;", "Ll/t5c;", "dbHelper", "Ll/nul;", "logger", "Ll/vzb;", "dbEncryptionHandler", "Ll/n95;", "clock", "<init>", "(Ll/t5c;Ll/nul;Ll/vzb;Ll/n95;)V", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "Lcom/clevertap/android/sdk/db/Table;", "table", "", "c", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)J", "", Constants.KEY_LIMIT, "Ll/cpb0;", "e", "(Lcom/clevertap/android/sdk/db/Table;I)Ll/cpb0;", "batchSize", Constants.INAPP_DATA_TAG, "(I)Ll/cpb0;", "", "lastId", "", "b", "(Ljava/lang/String;Lcom/clevertap/android/sdk/db/Table;)V", "a", "(Lcom/clevertap/android/sdk/db/Table;)V", "g", "f", "(Lcom/clevertap/android/sdk/db/Table;)I", "Ll/t5c;", "Ll/nul;", "Ll/vzb;", "Ll/n95;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class v2f implements u2f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final t5c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final vzb dbEncryptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    public v2f(@NotNull t5c t5cVar, @NotNull nul nulVar, @NotNull vzb vzbVar, @NotNull n95 n95Var) {
        t5cVar.getClass();
        nulVar.getClass();
        vzbVar.getClass();
        n95Var.getClass();
        this.dbHelper = t5cVar;
        this.logger = nulVar;
        this.dbEncryptionHandler = vzbVar;
        this.clock = n95Var;
    }

    @Override // p149l.u2f
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo191483a(@NotNull Table table) {
        table.getClass();
        long jCurrentTimeMillis = this.clock.currentTimeMillis() - 432000000;
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "created_at <= " + jCurrentTimeMillis, null);
        } catch (Exception e) {
            this.logger.verbose("Error removing stale event records from " + tableName + ". Recreating DB.", e);
            this.dbHelper.m187292m();
        }
    }

    @Override // p149l.u2f
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public synchronized void mo191484b(@NotNull String lastId, @NotNull Table table) {
        lastId.getClass();
        table.getClass();
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id <= ?", new String[]{lastId});
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing sent data from table " + tableName + " Recreating DB", e);
            this.dbHelper.m187292m();
        }
    }

    @Override // p149l.u2f
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public long mo191485c(@NotNull JSONObject event, @NotNull Table table) {
        event.getClass();
        table.getClass();
        if (!this.dbHelper.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return -2L;
        }
        String tableName = table.getTableName();
        ContentValues contentValues = new ContentValues();
        vzb vzbVar = this.dbEncryptionHandler;
        String string = event.toString();
        string.getClass();
        contentValues.put("data", vzbVar.m200738c(string));
        contentValues.put("created_at", Long.valueOf(this.clock.currentTimeMillis()));
        try {
            return this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
        } catch (Exception e) {
            this.logger.verbose("Error adding data to table " + tableName + ". Recreating DB", e);
            this.dbHelper.m187292m();
            return -1L;
        }
    }

    @Override // p149l.u2f
    @NotNull
    /* JADX INFO: renamed from: d */
    public synchronized cpb0 mo191486d(int batchSize) {
        cpb0 cpb0Var;
        try {
            cpb0Var = new cpb0();
            cpb0 cpb0VarMo191487e = mo191487e(Table.PROFILE_EVENTS, batchSize);
            int length = cpb0VarMo191487e.getData().length();
            for (int i = 0; i < length; i++) {
                cpb0Var.getData().put(cpb0VarMo191487e.getData().getJSONObject(i));
            }
            cpb0Var.m108118d().addAll(cpb0VarMo191487e.m108118d());
            cpb0Var.m108120f(cpb0VarMo191487e.getHasMore());
            int size = batchSize - cpb0Var.m108118d().size();
            if (size > 0 || !cpb0Var.getHasMore()) {
                cpb0 cpb0VarMo191487e2 = mo191487e(Table.EVENTS, size);
                int length2 = cpb0VarMo191487e2.getData().length();
                for (int i2 = 0; i2 < length2; i2++) {
                    cpb0Var.getData().put(cpb0VarMo191487e2.getData().getJSONObject(i2));
                }
                cpb0Var.m108116b().addAll(cpb0VarMo191487e2.m108116b());
                cpb0Var.m108120f(cpb0VarMo191487e2.getHasMore());
            }
            this.logger.verbose("Fetched combined batch: " + cpb0Var.m108118d().size() + " profile events, " + cpb0Var.m108116b().size() + " events");
        } catch (Throwable th) {
            throw th;
        }
        return cpb0Var;
    }

    @Override // p149l.u2f
    @NotNull
    /* JADX INFO: renamed from: e */
    public synchronized cpb0 mo191487e(@NotNull Table table, int limit) {
        cpb0 cpb0Var;
        table.getClass();
        cpb0Var = new cpb0();
        String tableName = table.getTableName();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, new String[]{"_id", "data", "created_at"}, null, null, null, null, "created_at ASC", String.valueOf(limit + 1));
            try {
                Cursor cursor = cursorQuery;
                int i = 0;
                cpb0Var.m108120f(cursor.getCount() > limit);
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data");
                while (cursor.moveToNext() && i != limit) {
                    String string = cursor.getString(columnIndexOrThrow);
                    String strM200737b = this.dbEncryptionHandler.m200737b(cursor.getString(columnIndexOrThrow2));
                    if (strM200737b == null) {
                        this.logger.verbose("Error parsing event data for id: " + string + " from table: " + tableName);
                    } else {
                        cpb0Var.getData().put(new JSONObject(strM200737b));
                        if (table == Table.PROFILE_EVENTS) {
                            List<String> listM108118d = cpb0Var.m108118d();
                            string.getClass();
                            listM108118d.add(string);
                        } else {
                            List<String> listM108116b = cpb0Var.m108116b();
                            string.getClass();
                            listM108116b.add(string);
                        }
                        i++;
                    }
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
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records from table " + tableName, e);
        }
        int size = table == Table.PROFILE_EVENTS ? cpb0Var.m108118d().size() : cpb0Var.m108116b().size();
        this.logger.verbose("Fetched " + size + " events from " + tableName);
        return cpb0Var;
    }

    @Override // p149l.u2f
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public synchronized int mo191488f(@NotNull Table table) {
        int i;
        table.getClass();
        String tableName = table.getTableName();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, new String[]{"_id", "data"}, null, null, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data");
                i = 0;
                while (cursor.moveToNext()) {
                    String string = cursor.getString(columnIndexOrThrow);
                    String string2 = cursor.getString(columnIndexOrThrow2);
                    if (string2 == null || !this.dbEncryptionHandler.m200736a(string2)) {
                        String strM200737b = this.dbEncryptionHandler.m200737b(string2);
                        if (strM200737b == null) {
                            this.logger.verbose("Error decrypting data for id: " + string + " from table: " + tableName + ", skipping");
                        } else {
                            String strM200738c = this.dbEncryptionHandler.m200738c(strM200737b);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("data", strM200738c);
                            if (this.dbHelper.getWritableDatabase().update(tableName, contentValues, "_id = ?", new String[]{string}) > 0) {
                                i++;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(cursorQuery, null);
                this.logger.verbose("Successfully migrated " + i + " rows in table " + tableName);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Error updating all events in table " + tableName + ". Recreating DB", e);
            this.dbHelper.m187292m();
            return -1;
        }
        return i;
    }

    @Override // p149l.u2f
    @WorkerThread
    /* JADX INFO: renamed from: g */
    public void mo191489g(@NotNull Table table) {
        table.getClass();
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, null, null);
        } catch (Exception e) {
            this.logger.verbose("Error removing all events from table " + tableName + ". Recreating DB", e);
            this.dbHelper.m187292m();
        }
    }
}
