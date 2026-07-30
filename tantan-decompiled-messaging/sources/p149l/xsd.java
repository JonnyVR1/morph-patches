package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import com.p046p1.mobile.putong.core.data.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/xsd;", "Ll/wsd;", "Ll/t5c;", "db", "Ll/nul;", "logger", "Lcom/clevertap/android/sdk/db/Table;", "table", "Ll/n95;", "clock", "<init>", "(Ll/t5c;Ll/nul;Lcom/clevertap/android/sdk/db/Table;Ll/n95;)V", "", "Ll/ysd;", "delayedInApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "", "inAppId", Action.remove, "(Ljava/lang/String;)Z", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Z", "a", "Ll/t5c;", "Ll/nul;", "Lcom/clevertap/android/sdk/db/Table;", "Ll/n95;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xsd implements wsd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final t5c db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Table table;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    public xsd(@NotNull t5c t5cVar, @NotNull nul nulVar, @NotNull Table table, @NotNull n95 n95Var) {
        t5cVar.getClass();
        nulVar.getClass();
        table.getClass();
        n95Var.getClass();
        this.db = t5cVar;
        this.logger = nulVar;
        this.table = table;
        this.clock = n95Var;
    }

    @Override // p149l.wsd
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public boolean mo205475b() {
        String tableName = this.table.getTableName();
        try {
            this.logger.verbose("Clearing all delayed legacy in-apps from " + tableName);
            this.db.getWritableDatabase().delete(tableName, null, null);
            this.logger.verbose("Successfully cleared all delayed legacy in-apps from " + tableName);
            return true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error clearing all delayed legacy in-apps from table " + tableName + '.', e);
            return false;
        }
    }

    @Override // p149l.wsd
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo205476c(@NotNull String inAppId) {
        inAppId.getClass();
        String tableName = this.table.getTableName();
        try {
            Cursor cursorQuery = this.db.getReadableDatabase().query(tableName, new String[]{"data"}, "inAppId = ?", new String[]{inAppId}, null, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                String string = cursor.moveToFirst() ? cursor.getString(cursor.getColumnIndexOrThrow("data")) : null;
                CloseableKt.m87404a(cursorQuery, null);
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch delayed legacy in-app from database " + tableName + '.', e);
            return null;
        }
    }

    @Override // p149l.wsd
    @WorkerThread
    /* JADX INFO: renamed from: d */
    public boolean mo205477d(@NotNull List<ysd> delayedInApps) {
        delayedInApps.getClass();
        if (delayedInApps.isEmpty()) {
            this.logger.verbose("DelayedLegacyInAppDAO: Empty batch insert list");
            return true;
        }
        if (!this.db.m187291k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return false;
        }
        String tableName = this.table.getTableName();
        this.logger.verbose("DelayedLegacyInAppDAO: Batch insert for " + delayedInApps.size() + " delayed legacy in-apps");
        try {
            this.db.getWritableDatabase().beginTransaction();
            long jCurrentTimeMillis = this.clock.currentTimeMillis();
            for (ysd ysdVar : delayedInApps) {
                this.logger.verbose("DelayedLegacyInAppDAO: Batch inserting " + ysdVar.getInAppId());
                ContentValues contentValues = new ContentValues();
                contentValues.put("inAppId", ysdVar.getInAppId());
                contentValues.put("delay", Integer.valueOf(ysdVar.getDelay()));
                contentValues.put("data", ysdVar.getInAppData());
                contentValues.put("created_at", Long.valueOf(jCurrentTimeMillis));
                this.db.getWritableDatabase().insertWithOnConflict(tableName, null, contentValues, 5);
            }
            this.db.getWritableDatabase().setTransactionSuccessful();
            this.db.getWritableDatabase().endTransaction();
            this.logger.verbose("DelayedLegacyInAppDAO: Batch insert completed successfully for " + delayedInApps.size() + " items");
            return true;
        } catch (Exception e) {
            this.logger.verbose("Failed to perform batch insert on table " + tableName, e);
            try {
                this.db.getWritableDatabase().endTransaction();
            } catch (Exception e2) {
                this.logger.verbose("Failed to end transaction on table " + tableName, e2);
            }
            return false;
        }
    }

    @Override // p149l.wsd
    @WorkerThread
    public boolean remove(@NotNull String inAppId) {
        inAppId.getClass();
        String tableName = this.table.getTableName();
        try {
            this.logger.verbose("Removing delayed legacy in-app: " + inAppId + " from " + tableName);
            return this.db.getWritableDatabase().delete(tableName, "inAppId = ?", new String[]{inAppId}) > 0;
        } catch (SQLiteException e) {
            this.logger.verbose("Could not remove delayed legacy in-app from database " + tableName + '.', e);
            return false;
        }
    }

    public /* synthetic */ xsd(t5c t5cVar, nul nulVar, Table table, n95 n95Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t5cVar, nulVar, table, (i & 8) != 0 ? n95.f137721a : n95Var);
    }
}
