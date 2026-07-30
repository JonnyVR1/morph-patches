package p153l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class fbv0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final Context f98162a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f98163b;

    public fbv0(Context context, xvw0 xvw0Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) jas0.m144075c().m176505a(sgs0.f168366k8)).intValue());
        this.f98162a = context;
        this.f98163b = xvw0Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m124953d(hct0 hct0Var, SQLiteDatabase sQLiteDatabase) throws Exception {
        m124956n(sQLiteDatabase, hct0Var);
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m124954i(SQLiteDatabase sQLiteDatabase, String str, hct0 hct0Var) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m124956n(sQLiteDatabase, hct0Var);
    }

    /* JADX INFO: renamed from: m */
    public static final void m124955m(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* JADX INFO: renamed from: n */
    public static void m124956n(SQLiteDatabase sQLiteDatabase, hct0 hct0Var) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr = new String[count];
                int i = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("url");
                    if (columnIndex != -1) {
                        strArr[i] = cursorQuery.getString(columnIndex);
                    }
                    i++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    hct0Var.zza(strArr[i2]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Void m124957b(hbv0 hbv0Var, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(hbv0Var.f108655a));
        contentValues.put("gws_query_id", hbv0Var.f108656b);
        contentValues.put("url", hbv0Var.f108657c);
        contentValues.put("event_state", Integer.valueOf(hbv0Var.f108658d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        bxy0.m106934r();
        zws0 zws0VarM12361a0 = C2098b.m12361a0(this.f98162a);
        if (zws0VarM12361a0 != null) {
            try {
                zws0VarM12361a0.zze(h950.m134038Y2(this.f98162a));
            } catch (RemoteException e) {
                d2v0.m113738l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m124958e(final String str) {
        m124960h(new kbw0() { // from class: l.dbv0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                fbv0.m124955m((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m124959g(final hbv0 hbv0Var) {
        m124960h(new kbw0() { // from class: l.zav0
            @Override // p153l.kbw0
            public final Object zza(Object obj) throws Exception {
                this.f203595a.m124957b(hbv0Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m124960h(kbw0 kbw0Var) {
        pvw0.m173991r(this.f98163b.mo155969R(new Callable() { // from class: l.bbv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75999a.getWritableDatabase();
            }
        }), new ebv0(this, kbw0Var), this.f98163b);
    }

    /* JADX INFO: renamed from: j */
    public final void m124961j(final SQLiteDatabase sQLiteDatabase, final hct0 hct0Var, final String str) {
        this.f98163b.execute(new Runnable() { // from class: l.cbv0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                fbv0.m124954i(sQLiteDatabase, str, hct0Var);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m124962k(final hct0 hct0Var, final String str) {
        m124960h(new kbw0() { // from class: l.abv0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                this.f69658a.m124961j((SQLiteDatabase) obj, hct0Var, str);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
