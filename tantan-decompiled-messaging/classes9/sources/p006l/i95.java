package p006l;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import l.du2;
import l.e51;
import l.exc0;
import l.gxc0;
import l.ogw;
import l.t95;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class i95 extends xh5 {

    /* JADX INFO: renamed from: b */
    public static uqd0 f14315b = new uqd0("client_track_sessionId", "");

    /* JADX INFO: renamed from: c */
    public static C0829a f14316c = new C0829a();

    /* JADX INFO: renamed from: a */
    public C0830b f14317a = new C0830b();

    /* JADX INFO: renamed from: l.i95$b */
    public static class C0830b extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: l.i95$b$a */
        public static final class a implements Comparable<a> {

            /* JADX INFO: renamed from: a */
            public final long f14318a;

            /* JADX INFO: renamed from: b */
            public final String f14319b;

            public a(long j, String str) {
                this.f14318a = j;
                this.f14319b = str;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compareTo(a aVar) {
                if (aVar == null) {
                    return 1;
                }
                long j = this.f14318a;
                long j2 = aVar.f14318a;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            }
        }

        public C0830b() {
            super(App.e, "client_tracking", (SQLiteDatabase.CursorFactory) null, 3);
            if (TextUtils.isEmpty((CharSequence) i95.f14315b.get())) {
                i95.f14315b.put(UUID.randomUUID().toString() + System.currentTimeMillis() + "");
            }
        }

        /* JADX INFO: renamed from: e */
        public ArrayList<a> m16532e() {
            ArrayList<a> arrayList = new ArrayList<>();
            getWritableDatabase().beginTransaction();
            try {
                Cursor cursorQuery = getWritableDatabase().query("log", new String[]{"_id", "entry"}, "session < ? AND session != -1", new String[]{Integer.toString(((Integer) App.i.get()).intValue())}, (String) null, (String) null, (String) null, (String) null);
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    arrayList.add(new a(cursorQuery.getLong(0), cursorQuery.getString(1)));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                for (a aVar : arrayList) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("session", (Integer) App.i.get());
                    getWritableDatabase().update("log", contentValues, "_id = ?", new String[]{Long.toString(aVar.f14318a)});
                }
                getWritableDatabase().setTransactionSuccessful();
                return arrayList;
            } finally {
                getWritableDatabase().endTransaction();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m16533f(a aVar, boolean z) {
            getWritableDatabase().beginTransaction();
            try {
                if (z) {
                    getWritableDatabase().delete("log", "_id = ?", new String[]{Long.toString(aVar.f14318a)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("session", (Integer) 0);
                    getWritableDatabase().update("log", contentValues, "_id = ?", new String[]{Long.toString(aVar.f14318a)});
                }
                getWritableDatabase().setTransactionSuccessful();
                getWritableDatabase().endTransaction();
            } catch (Throwable th) {
                getWritableDatabase().endTransaction();
                throw th;
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE log (_id INTEGER PRIMARY KEY, entry TEXT, session INTEGER, seqnum INTEGER)");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            du2.a("[putong-common][db]", "client_tracking onUpgrade oldVersion = " + i + ", newVersion = " + i2);
            if (i < 3) {
                sQLiteDatabase.execSQL("ALTER TABLE log ADD COLUMN seqnum INTEGER");
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m16523B() {
        f14316c.m16531e();
    }

    /* JADX INFO: renamed from: z */
    public static String m16526z() {
        return ogw.d(App.e.getDatabasePath("event_tracking"));
    }

    /* JADX INFO: renamed from: C */
    public void m16528C() {
        e51.y(new Runnable() { // from class: l.h95
            @Override // java.lang.Runnable
            public final void run() {
                this.f13746a.m16527A();
            }
        });
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void m16527A() {
        ArrayList<C0830b.a> arrayListM16532e = this.f14317a.m16532e();
        Collections.sort(arrayListM16532e);
        boolean z = false;
        for (C0830b.a aVar : arrayListM16532e) {
            if (z) {
                this.f14317a.m16533f(aVar, false);
            } else if (!m16530E(aVar, true)) {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m16530E(C0830b.a aVar, boolean z) {
        int i = 0;
        boolean z2 = false;
        while (i <= 2 && !z2) {
            exc0 exc0VarExecute = null;
            try {
                try {
                    try {
                        exc0VarExecute = qib0.f19776D.a(qib0.f19784H.basic().q(aVar.f14319b).b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (exc0VarExecute != null) {
                        if (exc0VarExecute.q() % 100 == 2) {
                            z2 = true;
                        } else {
                            i += 3;
                        }
                        try {
                            gxc0 gxc0VarK = exc0VarExecute.k();
                            if (gxc0VarK != null) {
                                gxc0VarK.close();
                            }
                        } catch (Exception e) {
                            CrashHelper.c(e);
                        }
                    }
                } catch (Throwable th) {
                    t95.b(exc0VarExecute);
                    throw th;
                }
            } catch (Exception e2) {
                i++;
                CrashHelper.c(e2);
            }
            t95.b(exc0VarExecute);
        }
        this.f14317a.m16533f(aVar, z2);
        return z2;
    }

    /* JADX INFO: renamed from: l.i95$a */
    public static class C0829a extends SQLiteOpenHelper {
        public C0829a() {
            super(App.e, "event_tracking", (SQLiteDatabase.CursorFactory) null, 3);
        }

        /* JADX INFO: renamed from: e */
        public void m16531e() {
            if (App.e.getDatabasePath("event_tracking").exists()) {
                return;
            }
            getWritableDatabase().beginTransaction();
            getWritableDatabase().endTransaction();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE log (_id INTEGER PRIMARY KEY, entry TEXT, session INTEGER, seqnum INTEGER)");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}
