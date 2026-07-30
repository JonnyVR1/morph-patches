package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.p013db.Table;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import kotlin.text.C15384b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001a\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006\""}, m87232d2 = {"Ll/b5k0;", "Ll/a5k0;", "Ll/t5c;", "db", "Ll/nul;", "logger", "Lcom/clevertap/android/sdk/db/Table;", "table", "<init>", "(Ll/t5c;Ll/nul;Lcom/clevertap/android/sdk/db/Table;)V", "", "deviceID", "eventName", "normalizedEventName", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ll/z4k0;", "a", "(Ljava/lang/String;Ljava/lang/String;)Ll/z4k0;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)I", "e", "threshold", "numberOfRowsToCleanup", "b", "(II)Z", "Ll/t5c;", "Ll/nul;", "Lcom/clevertap/android/sdk/db/Table;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class b5k0 implements a5k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final t5c db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Table table;

    public b5k0(@NotNull t5c t5cVar, @NotNull nul nulVar, @NotNull Table table) {
        t5cVar.getClass();
        nulVar.getClass();
        table.getClass();
        this.db = t5cVar;
        this.logger = nulVar;
        this.table = table;
    }

    @Override // p149l.a5k0
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public z4k0 mo95047a(@NotNull String deviceID, @NotNull String normalizedEventName) {
        z4k0 z4k0Var;
        deviceID.getClass();
        normalizedEventName.getClass();
        String tableName = this.table.getTableName();
        try {
            Cursor cursorQuery = this.db.getReadableDatabase().query(tableName, null, "deviceID = ? AND normalizedEventName = ?", new String[]{deviceID, normalizedEventName}, null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    String string = cursor2.getString(cursor2.getColumnIndexOrThrow("eventName"));
                    string.getClass();
                    String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("normalizedEventName"));
                    string2.getClass();
                    long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("firstTs"));
                    long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("lastTs"));
                    int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("count"));
                    String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("deviceID"));
                    string3.getClass();
                    z4k0Var = new z4k0(string, string2, j, j2, i, string3);
                } else {
                    z4k0Var = null;
                }
                CloseableKt.m87404a(cursor, null);
                return z4k0Var;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursor, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return null;
        }
    }

    @Override // p149l.a5k0
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public boolean mo95048b(int threshold, int numberOfRowsToCleanup) {
        if (threshold <= 0) {
            this.logger.verbose("Invalid threshold value: " + threshold + ". Threshold should be greater than 0");
            return false;
        }
        if (numberOfRowsToCleanup < 0) {
            this.logger.verbose("Invalid numberOfRowsToCleanup value: " + numberOfRowsToCleanup + ". Should be greater than or equal to 0");
            return false;
        }
        if (numberOfRowsToCleanup >= threshold) {
            this.logger.verbose("Invalid numberOfRowsToCleanup value: " + numberOfRowsToCleanup + ". Should be less than threshold: " + threshold);
            return false;
        }
        String tableName = this.table.getTableName();
        int i = threshold - numberOfRowsToCleanup;
        try {
            this.db.getWritableDatabase().execSQL(C15384b.m93470i("\n            DELETE FROM " + tableName + "\n            WHERE (normalizedEventName, deviceID) IN (\n                SELECT normalizedEventName, deviceID\n                FROM " + tableName + "\n                ORDER BY lastTs ASC \n                LIMIT (\n                SELECT CASE \n                    WHEN COUNT(*) > ? THEN COUNT(*) - ?\n                    ELSE 0\n                END \n                FROM " + tableName + "\n                )\n            );\n        "), new Integer[]{Integer.valueOf(threshold), Integer.valueOf(i)});
            this.logger.verbose("If row count is above " + threshold + " then only keep " + i + " rows in " + tableName);
            return true;
        } catch (Exception e) {
            this.logger.verbose("Error cleaning up extra events in " + tableName + '.', e);
            return false;
        }
    }

    @Override // p149l.a5k0
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public long mo95049c(@NotNull String deviceID, @NotNull String eventName, @NotNull String normalizedEventName) {
        deviceID.getClass();
        eventName.getClass();
        normalizedEventName.getClass();
        if (!this.db.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return -2L;
        }
        String tableName = this.table.getTableName();
        this.logger.verbose("Inserting event " + eventName + " with deviceID = " + deviceID + " in " + tableName);
        long jM5921r = Utils.m5921r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventName", eventName);
        contentValues.put("normalizedEventName", normalizedEventName);
        contentValues.put("firstTs", Long.valueOf(jM5921r));
        contentValues.put("lastTs", Long.valueOf(jM5921r));
        contentValues.put("count", (Integer) 1);
        contentValues.put("deviceID", deviceID);
        try {
            return this.db.getWritableDatabase().insertWithOnConflict(tableName, null, contentValues, 5);
        } catch (Exception e) {
            this.logger.verbose("Error adding row to table " + tableName + " Recreating DB. Exception: " + e);
            this.db.m187292m();
            return -1L;
        }
    }

    @Override // p149l.a5k0
    @WorkerThread
    /* JADX INFO: renamed from: d */
    public int mo95050d(@NotNull String deviceID, @NotNull String normalizedEventName) {
        deviceID.getClass();
        normalizedEventName.getClass();
        String tableName = this.table.getTableName();
        try {
            Cursor cursorQuery = this.db.getReadableDatabase().query(tableName, new String[]{"count"}, "deviceID = ? AND normalizedEventName = ?", new String[]{deviceID, normalizedEventName}, null, null, null, null);
            if (cursorQuery == null) {
                return -1;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int i = cursor2.moveToFirst() ? cursor2.getInt(cursor2.getColumnIndexOrThrow("count")) : 0;
                CloseableKt.m87404a(cursor, null);
                return i;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursor, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    @Override // p149l.a5k0
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public boolean mo95051e(@NotNull String deviceID, @NotNull String normalizedEventName) {
        boolean z;
        deviceID.getClass();
        normalizedEventName.getClass();
        String tableName = this.table.getTableName();
        try {
            Cursor cursorRawQuery = this.db.getReadableDatabase().rawQuery(C15384b.m93470i("\n            SELECT EXISTS(\n                SELECT 1 \n                FROM " + tableName + " \n                WHERE deviceID = ? AND normalizedEventName = ?\n            ) AS eventExists;\n        "), new String[]{deviceID, normalizedEventName});
            if (cursorRawQuery == null) {
                return false;
            }
            Cursor cursor = cursorRawQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    z = cursor2.getInt(cursor2.getColumnIndexOrThrow("eventExists")) == 1;
                }
                CloseableKt.m87404a(cursor, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursor, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return false;
        }
    }

    @Override // p149l.a5k0
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public boolean mo95052f(@NotNull String deviceID, @NotNull String normalizedEventName) {
        deviceID.getClass();
        normalizedEventName.getClass();
        String tableName = this.table.getTableName();
        long jM5921r = Utils.m5921r();
        try {
            String strM93470i = C15384b.m93470i("\n            UPDATE " + tableName + " \n            SET \n                count = count + 1,\n                lastTs = ?\n            WHERE deviceID = ? \n            AND normalizedEventName = ?;\n        ");
            this.logger.verbose("Updating event " + normalizedEventName + " with deviceID = " + deviceID + " in " + tableName);
            this.db.getWritableDatabase().execSQL(strM93470i, new Object[]{Long.valueOf(jM5921r), deviceID, normalizedEventName});
            return true;
        } catch (Exception e) {
            this.logger.verbose("Could not update event in database " + tableName + '.', e);
            return false;
        }
    }
}
