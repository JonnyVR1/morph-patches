package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.p014db.Table;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/pxj0;", "Ll/oxj0;", "Ll/z6c;", "dbHelper", "Ll/axl;", "logger", "Ll/oa5;", "clock", "<init>", "(Ll/z6c;Ll/axl;Ll/oa5;)V", "", "a", "()V", "", "b", "()J", "Ll/z6c;", "Ll/axl;", "c", "Ll/oa5;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class pxj0 implements oxj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final z6c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    public pxj0(@NotNull z6c z6cVar, @NotNull axl axlVar, @NotNull oa5 oa5Var) {
        z6cVar.getClass();
        axlVar.getClass();
        oa5Var.getClass();
        this.dbHelper = z6cVar;
        this.logger = axlVar;
        this.clock = oa5Var;
    }

    @Override // p153l.oxj0
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo169717a() {
        if (!this.dbHelper.m218782k()) {
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
            this.dbHelper.m218783m();
        }
    }

    @Override // p153l.oxj0
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public long mo169718b() {
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
                CloseableKt.m88293a(cursor, null);
                return j;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursor, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return j;
        }
    }

    public /* synthetic */ pxj0(z6c z6cVar, axl axlVar, oa5 oa5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6cVar, axlVar, (i & 4) != 0 ? oa5.f145660a : oa5Var);
    }
}
