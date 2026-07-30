package p153l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class zyw0 extends rjt0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zvw0 f206652a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyw0(zvw0 zvw0Var, Context context, String str) {
        super(context, str, null, 1);
        this.f206652a = zvw0Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f206652a.zzj().m114558A().m153300a("Opening the local database failed, dropping and recreating it");
            if (!this.f206652a.zza().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f206652a.zzj().m114558A().m153301b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f206652a.zzj().m114558A().m153301b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        r3s0.m179702b(this.f206652a.zzj(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        r3s0.m179703c(this.f206652a.zzj(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
