package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0016\u0010&\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%¨\u0006'"}, m87232d2 = {"Ll/qfb0;", "Ll/pfb0;", "Ll/t5c;", "dbHelper", "Ll/nul;", "logger", "Ll/n95;", "clock", "<init>", "(Ll/t5c;Ll/nul;Ll/n95;)V", "", "id", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "count", "g", "(I)Ljava/lang/String;", "", "ttlInSeconds", "", "a", "(Ljava/lang/String;J)V", "", Constants.INAPP_DATA_TAG, "()[Ljava/lang/String;", "", "e", "(Ljava/lang/String;)Z", "ids", "c", "([Ljava/lang/String;)V", "b", "()V", "Ll/t5c;", "Ll/nul;", "Ll/n95;", "Z", "rtlDirtyFlag", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qfb0 implements pfb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final t5c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private volatile boolean rtlDirtyFlag;

    public qfb0(@NotNull t5c t5cVar, @NotNull nul nulVar, @NotNull n95 n95Var) {
        t5cVar.getClass();
        nulVar.getClass();
        n95Var.getClass();
        this.dbHelper = t5cVar;
        this.logger = nulVar;
        this.clock = n95Var;
        this.rtlDirtyFlag = true;
    }

    /* JADX INFO: renamed from: f */
    private final String m174278f(String id) {
        Exception exc;
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        String string = "";
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, null, "data = ?", new String[]{id}, null, null, null);
            if (cursorQuery == null) {
                return "";
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                string = cursor2.moveToFirst() ? cursor2.getString(cursor2.getColumnIndexOrThrow("data")) : "";
                this.logger.verbose("Fetching PID for check - " + string);
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(cursor, null);
                return string;
            } catch (Throwable th) {
                String str = string;
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        CloseableKt.m87404a(cursor, th);
                        throw th2;
                    } catch (Exception e) {
                        exc = e;
                        string = str;
                    }
                }
            }
        } catch (Exception e2) {
            exc = e2;
        }
        this.logger.verbose("Could not fetch records out of database " + tableName + '.', exc);
        return string;
    }

    /* JADX INFO: renamed from: g */
    private final String m174279g(int count) {
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

    @Override // p149l.pfb0
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo168602a(@NotNull String id, long ttlInSeconds) {
        id.getClass();
        if (!this.dbHelper.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return;
        }
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        if (ttlInSeconds <= 0) {
            ttlInSeconds = this.clock.mo158533c() + Constants.DEFAULT_PUSH_TTL_SECONDS;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", id);
        contentValues.put("created_at", Long.valueOf(ttlInSeconds));
        contentValues.put("isRead", (Integer) 0);
        try {
            this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
            this.rtlDirtyFlag = true;
            this.logger.verbose("Stored PN - " + id + " with TTL - " + ttlInSeconds);
        } catch (SQLiteException e) {
            this.logger.verbose("Error adding data to table " + tableName + ". Recreating DB", e);
            this.dbHelper.m187292m();
        }
    }

    @Override // p149l.pfb0
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public void mo168603b() {
        long jMo158533c = this.clock.mo158533c();
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "created_at <= " + jMo158533c, null);
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale push notification records from " + tableName + ". Recreating DB.", e);
            this.dbHelper.m187292m();
        }
    }

    @Override // p149l.pfb0
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public void mo168604c(@NotNull String[] ids) {
        ids.getClass();
        if (ids.length == 0) {
            return;
        }
        if (!this.dbHelper.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return;
        }
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", (Integer) 1);
        String strM174279g = m174279g(ids.length);
        try {
            this.dbHelper.getWritableDatabase().update(tableName, contentValues, "data IN (" + strM174279g + ')', ids);
            this.rtlDirtyFlag = false;
        } catch (SQLiteException e) {
            this.logger.verbose("Error updating data in table " + tableName + ". Recreating DB", e);
            this.dbHelper.m187292m();
        }
    }

    @Override // p149l.pfb0
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d */
    public String[] mo168605d() {
        if (!this.rtlDirtyFlag) {
            return new String[0];
        }
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, null, "isRead = 0", null, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    while (cursor2.moveToNext()) {
                        int columnIndex = cursor2.getColumnIndex("data");
                        if (columnIndex >= 0) {
                            String string = cursor2.getString(columnIndex);
                            this.logger.verbose("Fetching PID - " + string);
                            if (string != null) {
                                arrayList.add(string);
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.m87404a(cursor, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m87404a(cursor, th);
                        throw th2;
                    }
                }
            }
        } catch (SQLiteException e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // p149l.pfb0
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public boolean mo168606e(@NotNull String id) {
        id.getClass();
        return Intrinsics.m87488d(id, m174278f(id));
    }
}
