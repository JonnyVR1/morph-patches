package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class i95 extends xh5 {

    /* JADX INFO: renamed from: b */
    public static uqd0 f112101b = new uqd0("client_track_sessionId", "");

    /* JADX INFO: renamed from: c */
    public static C17508a f112102c = new C17508a();

    /* JADX INFO: renamed from: a */
    public C17509b f112103a = new C17509b();

    /* JADX INFO: renamed from: l.i95$b */
    public static class C17509b extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: l.i95$b$a */
        public static final class a implements Comparable<a> {

            /* JADX INFO: renamed from: a */
            public final long f112104a;

            /* JADX INFO: renamed from: b */
            public final String f112105b;

            public a(long j, String str) {
                this.f112104a = j;
                this.f112105b = str;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compareTo(a aVar) {
                if (aVar == null) {
                    return 1;
                }
                long j = this.f112104a;
                long j2 = aVar.f112104a;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            }
        }

        public C17509b() {
            super(App.f15369e, "client_tracking", null, 3);
            if (TextUtils.isEmpty(i95.f112101b.get())) {
                i95.f112101b.put(UUID.randomUUID().toString() + System.currentTimeMillis() + "");
            }
        }

        /* JADX INFO: renamed from: e */
        public ArrayList<a> m135015e() {
            ArrayList<a> arrayList = new ArrayList<>();
            getWritableDatabase().beginTransaction();
            try {
                Cursor cursorQuery = getWritableDatabase().query("log", new String[]{"_id", "entry"}, "session < ? AND session != -1", new String[]{Integer.toString(App.f15373i.get().intValue())}, null, null, null, null);
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    arrayList.add(new a(cursorQuery.getLong(0), cursorQuery.getString(1)));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                for (a aVar : arrayList) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("session", App.f15373i.get());
                    getWritableDatabase().update("log", contentValues, "_id = ?", new String[]{Long.toString(aVar.f112104a)});
                }
                getWritableDatabase().setTransactionSuccessful();
                return arrayList;
            } finally {
                getWritableDatabase().endTransaction();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m135016f(a aVar, boolean z) {
            getWritableDatabase().beginTransaction();
            try {
                if (z) {
                    getWritableDatabase().delete("log", "_id = ?", new String[]{Long.toString(aVar.f112104a)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("session", (Integer) 0);
                    getWritableDatabase().update("log", contentValues, "_id = ?", new String[]{Long.toString(aVar.f112104a)});
                }
                getWritableDatabase().setTransactionSuccessful();
                getWritableDatabase().endTransaction();
            } catch (Throwable th) {
                getWritableDatabase().endTransaction();
                throw th;
            }
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE log (_id INTEGER PRIMARY KEY, entry TEXT, session INTEGER, seqnum INTEGER)");
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            du2.m113670a("[putong-common][db]", "client_tracking onUpgrade oldVersion = " + i + ", newVersion = " + i2);
            if (i < 3) {
                sQLiteDatabase.execSQL("ALTER TABLE log ADD COLUMN seqnum INTEGER");
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m135006B() {
        f112102c.m135014e();
    }

    /* JADX INFO: renamed from: z */
    public static String m135009z() {
        return ogw.m164283d(App.f15369e.getDatabasePath("event_tracking"));
    }

    /* JADX INFO: renamed from: C */
    public void m135011C() {
        e51.m114774y(new Runnable() { // from class: l.h95
            @Override // java.lang.Runnable
            public final void run() {
                this.f106515a.m135010A();
            }
        });
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void m135010A() {
        ArrayList<C17509b.a> arrayListM135015e = this.f112103a.m135015e();
        Collections.sort(arrayListM135015e);
        boolean z = false;
        for (C17509b.a aVar : arrayListM135015e) {
            if (z) {
                this.f112103a.m135016f(aVar, false);
            } else if (!m135013E(aVar, true)) {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m135013E(C17509b.a aVar, boolean z) {
        int i = 0;
        boolean z2 = false;
        while (i <= 2 && !z2) {
            exc0 exc0VarExecute = null;
            try {
                try {
                    try {
                        exc0VarExecute = qib0.f154685D.mo144849a(qib0.f154693H.basic().m185898q(aVar.f112105b).m185883b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (exc0VarExecute != null) {
                        if (exc0VarExecute.m118609q() % 100 == 2) {
                            z2 = true;
                        } else {
                            i += 3;
                        }
                        try {
                            gxc0 gxc0VarM118606k = exc0VarExecute.m118606k();
                            if (gxc0VarM118606k != null) {
                                gxc0VarM118606k.close();
                            }
                        } catch (Exception e) {
                            CrashHelper.m81296c(e);
                        }
                    }
                } catch (Throwable th) {
                    t95.m187604b(exc0VarExecute);
                    throw th;
                }
            } catch (Exception e2) {
                i++;
                CrashHelper.m81296c(e2);
            }
            t95.m187604b(exc0VarExecute);
        }
        this.f112103a.m135016f(aVar, z2);
        return z2;
    }

    /* JADX INFO: renamed from: l.i95$a */
    public static class C17508a extends SQLiteOpenHelper {
        public C17508a() {
            super(App.f15369e, "event_tracking", null, 3);
        }

        /* JADX INFO: renamed from: e */
        public void m135014e() {
            if (App.f15369e.getDatabasePath("event_tracking").exists()) {
                return;
            }
            getWritableDatabase().beginTransaction();
            getWritableDatabase().endTransaction();
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE log (_id INTEGER PRIMARY KEY, entry TEXT, session INTEGER, seqnum INTEGER)");
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}
