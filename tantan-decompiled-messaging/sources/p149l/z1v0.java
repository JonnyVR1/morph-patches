package p149l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class z1v0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final Context f201108a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f201109b;

    public z1v0(Context context, rmw0 rmw0Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) d1s0.m109677c().m144697a(m7s0.f132295k8)).intValue());
        this.f201108a = context;
        this.f201109b = rmw0Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m216814d(b3t0 b3t0Var, SQLiteDatabase sQLiteDatabase) throws Exception {
        m216817n(sQLiteDatabase, b3t0Var);
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m216815i(SQLiteDatabase sQLiteDatabase, String str, b3t0 b3t0Var) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m216817n(sQLiteDatabase, b3t0Var);
    }

    /* JADX INFO: renamed from: m */
    public static final void m216816m(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* JADX INFO: renamed from: n */
    public static void m216817n(SQLiteDatabase sQLiteDatabase, b3t0 b3t0Var) throws Throwable {
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
                    b3t0Var.zza(strArr[i2]);
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
    public final /* synthetic */ Void m216818b(b2v0 b2v0Var, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(b2v0Var.f72752a));
        contentValues.put("gws_query_id", b2v0Var.f72753b);
        contentValues.put("url", b2v0Var.f72754c);
        contentValues.put("event_state", Integer.valueOf(b2v0Var.f72755d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        vny0.m199080r();
        tns0 tns0VarM12307a0 = C2075b.m12307a0(this.f201108a);
        if (tns0VarM12307a0 != null) {
            try {
                tns0VarM12307a0.zze(s050.m181848Y2(this.f201108a));
            } catch (RemoteException e) {
                xsu0.m210835l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m216819e(final String str) {
        m216821h(new e2w0() { // from class: l.x1v0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                z1v0.m216816m((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m216820g(final b2v0 b2v0Var) {
        m216821h(new e2w0() { // from class: l.t1v0
            @Override // p149l.e2w0
            public final Object zza(Object obj) throws Exception {
                this.f167372a.m216818b(b2v0Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m216821h(e2w0 e2w0Var) {
        jmw0.m142245r(this.f201109b.mo122102R(new Callable() { // from class: l.v1v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f179284a.getWritableDatabase();
            }
        }), new y1v0(this, e2w0Var), this.f201109b);
    }

    /* JADX INFO: renamed from: j */
    public final void m216822j(final SQLiteDatabase sQLiteDatabase, final b3t0 b3t0Var, final String str) {
        this.f201109b.execute(new Runnable() { // from class: l.w1v0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                z1v0.m216815i(sQLiteDatabase, str, b3t0Var);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m216823k(final b3t0 b3t0Var, final String str) {
        m216821h(new e2w0() { // from class: l.u1v0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                this.f173049a.m216822j((SQLiteDatabase) obj, b3t0Var, str);
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
