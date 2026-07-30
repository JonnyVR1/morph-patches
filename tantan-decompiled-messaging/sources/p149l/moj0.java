package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.p013db.Table;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/moj0;", "Ll/loj0;", "Ll/t5c;", "dbHelper", "Ll/nul;", "logger", "Ll/n95;", "clock", "<init>", "(Ll/t5c;Ll/nul;Ll/n95;)V", "", "a", "()V", "", "b", "()J", "Ll/t5c;", "Ll/nul;", "c", "Ll/n95;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class moj0 implements loj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final t5c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    public moj0(@NotNull t5c t5cVar, @NotNull nul nulVar, @NotNull n95 n95Var) {
        t5cVar.getClass();
        nulVar.getClass();
        n95Var.getClass();
        this.dbHelper = t5cVar;
        this.logger = nulVar;
        this.clock = n95Var;
    }

    @Override // p149l.loj0
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo150780a() {
        if (!this.dbHelper.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return;
        }
        String tableName = Table.UNINSTALL_TS.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("created_at", Long.valueOf(this.clock.currentTimeMillis()));
        try {
            this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
        } catch (SQLiteException e) {
            this.logger.verbose("Error adding data to table " + tableName + ". Recreating DB", e);
            this.dbHelper.m187292m();
        }
    }

    @Override // p149l.loj0
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public long mo150781b() {
        String tableName = Table.UNINSTALL_TS.getTableName();
        long j = 0;
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, null, null, null, null, null, "created_at DESC", "1");
            if (cursorQuery == null) {
                return 0L;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                j = cursor2.moveToFirst() ? cursor2.getLong(cursor2.getColumnIndexOrThrow("created_at")) : 0L;
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(cursor, null);
                return j;
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
            return j;
        }
    }

    public /* synthetic */ moj0(t5c t5cVar, nul nulVar, n95 n95Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t5cVar, nulVar, (i & 4) != 0 ? n95.f137721a : n95Var);
    }
}
