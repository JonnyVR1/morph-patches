package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p014db.Table;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006*"}, m88121d2 = {"Ll/a4f;", "Ll/z3f;", "Ll/z6c;", "dbHelper", "Ll/axl;", "logger", "Ll/j1c;", "dbEncryptionHandler", "Ll/oa5;", "clock", "<init>", "(Ll/z6c;Ll/axl;Ll/j1c;Ll/oa5;)V", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "Lcom/clevertap/android/sdk/db/Table;", "table", "", "c", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)J", "", Constants.KEY_LIMIT, "Ll/gxb0;", "e", "(Lcom/clevertap/android/sdk/db/Table;I)Ll/gxb0;", "batchSize", Constants.INAPP_DATA_TAG, "(I)Ll/gxb0;", "", "lastId", "", "b", "(Ljava/lang/String;Lcom/clevertap/android/sdk/db/Table;)V", "a", "(Lcom/clevertap/android/sdk/db/Table;)V", "g", "f", "(Lcom/clevertap/android/sdk/db/Table;)I", "Ll/z6c;", "Ll/axl;", "Ll/j1c;", "Ll/oa5;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class a4f implements z3f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final z6c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final j1c dbEncryptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    public a4f(@NotNull z6c z6cVar, @NotNull axl axlVar, @NotNull j1c j1cVar, @NotNull oa5 oa5Var) {
        z6cVar.getClass();
        axlVar.getClass();
        j1cVar.getClass();
        oa5Var.getClass();
        this.dbHelper = z6cVar;
        this.logger = axlVar;
        this.dbEncryptionHandler = j1cVar;
        this.clock = oa5Var;
    }

    @Override // p153l.z3f
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo95916a(@NotNull Table table) {
        table.getClass();
        long jCurrentTimeMillis = this.clock.currentTimeMillis() - 432000000;
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "created_at <= " + jCurrentTimeMillis, null);
        } catch (Exception e) {
            this.logger.verbose("Error removing stale event records from " + tableName + ". Recreating DB.", e);
            this.dbHelper.m218783m();
        }
    }

    @Override // p153l.z3f
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public synchronized void mo95917b(@NotNull String lastId, @NotNull Table table) {
        lastId.getClass();
        table.getClass();
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id <= ?", new String[]{lastId});
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing sent data from table " + tableName + " Recreating DB", e);
            this.dbHelper.m218783m();
        }
    }

    @Override // p153l.z3f
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public long mo95918c(@NotNull JSONObject event, @NotNull Table table) {
        event.getClass();
        table.getClass();
        if (!this.dbHelper.m218782k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return -2L;
        }
        String tableName = table.getTableName();
        ContentValues contentValues = new ContentValues();
        j1c j1cVar = this.dbEncryptionHandler;
        String string = event.toString();
        string.getClass();
        contentValues.put("data", j1cVar.m143114c(string));
        contentValues.put("created_at", Long.valueOf(this.clock.currentTimeMillis()));
        try {
            return this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
        } catch (Exception e) {
            this.logger.verbose("Error adding data to table " + tableName + ". Recreating DB", e);
            this.dbHelper.m218783m();
            return -1L;
        }
    }

    @Override // p153l.z3f
    @NotNull
    /* JADX INFO: renamed from: d */
    public synchronized gxb0 mo95919d(int batchSize) {
        gxb0 gxb0Var;
        try {
            gxb0Var = new gxb0();
            gxb0 gxb0VarMo95920e = mo95920e(Table.PROFILE_EVENTS, batchSize);
            int length = gxb0VarMo95920e.getData().length();
            for (int i = 0; i < length; i++) {
                gxb0Var.getData().put(gxb0VarMo95920e.getData().getJSONObject(i));
            }
            gxb0Var.m132817d().addAll(gxb0VarMo95920e.m132817d());
            gxb0Var.m132819f(gxb0VarMo95920e.getHasMore());
            int size = batchSize - gxb0Var.m132817d().size();
            if (size > 0 || !gxb0Var.getHasMore()) {
                gxb0 gxb0VarMo95920e2 = mo95920e(Table.EVENTS, size);
                int length2 = gxb0VarMo95920e2.getData().length();
                for (int i2 = 0; i2 < length2; i2++) {
                    gxb0Var.getData().put(gxb0VarMo95920e2.getData().getJSONObject(i2));
                }
                gxb0Var.m132815b().addAll(gxb0VarMo95920e2.m132815b());
                gxb0Var.m132819f(gxb0VarMo95920e2.getHasMore());
            }
            this.logger.verbose("Fetched combined batch: " + gxb0Var.m132817d().size() + " profile events, " + gxb0Var.m132815b().size() + " events");
        } catch (Throwable th) {
            throw th;
        }
        return gxb0Var;
    }

    @Override // p153l.z3f
    @NotNull
    /* JADX INFO: renamed from: e */
    public synchronized gxb0 mo95920e(@NotNull Table table, int limit) {
        gxb0 gxb0Var;
        table.getClass();
        gxb0Var = new gxb0();
        String tableName = table.getTableName();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, new String[]{"_id", "data", "created_at"}, null, null, null, null, "created_at ASC", String.valueOf(limit + 1));
            try {
                Cursor cursor = cursorQuery;
                int i = 0;
                gxb0Var.m132819f(cursor.getCount() > limit);
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data");
                while (cursor.moveToNext() && i != limit) {
                    String string = cursor.getString(columnIndexOrThrow);
                    String strM143113b = this.dbEncryptionHandler.m143113b(cursor.getString(columnIndexOrThrow2));
                    if (strM143113b == null) {
                        this.logger.verbose("Error parsing event data for id: " + string + " from table: " + tableName);
                    } else {
                        gxb0Var.getData().put(new JSONObject(strM143113b));
                        if (table == Table.PROFILE_EVENTS) {
                            List<String> listM132817d = gxb0Var.m132817d();
                            string.getClass();
                            listM132817d.add(string);
                        } else {
                            List<String> listM132815b = gxb0Var.m132815b();
                            string.getClass();
                            listM132815b.add(string);
                        }
                        i++;
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(cursorQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records from table " + tableName, e);
        }
        int size = table == Table.PROFILE_EVENTS ? gxb0Var.m132817d().size() : gxb0Var.m132815b().size();
        this.logger.verbose("Fetched " + size + " events from " + tableName);
        return gxb0Var;
    }

    @Override // p153l.z3f
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public synchronized int mo95921f(@NotNull Table table) {
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
                    if (string2 == null || !this.dbEncryptionHandler.m143112a(string2)) {
                        String strM143113b = this.dbEncryptionHandler.m143113b(string2);
                        if (strM143113b == null) {
                            this.logger.verbose("Error decrypting data for id: " + string + " from table: " + tableName + ", skipping");
                        } else {
                            String strM143114c = this.dbEncryptionHandler.m143114c(strM143113b);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("data", strM143114c);
                            if (this.dbHelper.getWritableDatabase().update(tableName, contentValues, "_id = ?", new String[]{string}) > 0) {
                                i++;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(cursorQuery, null);
                this.logger.verbose("Successfully migrated " + i + " rows in table " + tableName);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Error updating all events in table " + tableName + ". Recreating DB", e);
            this.dbHelper.m218783m();
            return -1;
        }
        return i;
    }

    @Override // p153l.z3f
    @WorkerThread
    /* JADX INFO: renamed from: g */
    public void mo95922g(@NotNull Table table) {
        table.getClass();
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, null, null);
        } catch (Exception e) {
            this.logger.verbose("Error removing all events from table " + tableName + ". Recreating DB", e);
            this.dbHelper.m218783m();
        }
    }
}
