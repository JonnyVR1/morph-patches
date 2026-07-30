package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class ja5 extends xi5 {

    /* JADX INFO: renamed from: b */
    public static wyd0 f118945b = new wyd0("client_track_sessionId", "");

    /* JADX INFO: renamed from: c */
    public static C17903a f118946c = new C17903a();

    /* JADX INFO: renamed from: a */
    public C17904b f118947a = new C17904b();

    /* JADX INFO: renamed from: l.ja5$b */
    public static class C17904b extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: l.ja5$b$a */
        public static final class a implements Comparable<a> {

            /* JADX INFO: renamed from: a */
            public final long f118948a;

            /* JADX INFO: renamed from: b */
            public final String f118949b;

            public a(long j, String str) {
                this.f118948a = j;
                this.f118949b = str;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compareTo(a aVar) {
                if (aVar == null) {
                    return 1;
                }
                long j = this.f118948a;
                long j2 = aVar.f118948a;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            }
        }

        public C17904b() {
            super(App.f16088e, "client_tracking", null, 3);
            if (TextUtils.isEmpty(ja5.f118945b.get())) {
                ja5.f118945b.put(UUID.randomUUID().toString() + System.currentTimeMillis() + "");
            }
        }

        /* JADX INFO: renamed from: e */
        public ArrayList<a> m144000e() {
            ArrayList<a> arrayList = new ArrayList<>();
            getWritableDatabase().beginTransaction();
            try {
                Cursor cursorQuery = getWritableDatabase().query("log", new String[]{"_id", "entry"}, "session < ? AND session != -1", new String[]{Integer.toString(App.f16092i.get().intValue())}, null, null, null, null);
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    arrayList.add(new a(cursorQuery.getLong(0), cursorQuery.getString(1)));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                for (a aVar : arrayList) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("session", App.f16092i.get());
                    getWritableDatabase().update("log", contentValues, "_id = ?", new String[]{Long.toString(aVar.f118948a)});
                }
                getWritableDatabase().setTransactionSuccessful();
                return arrayList;
            } finally {
                getWritableDatabase().endTransaction();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m144001f(a aVar, boolean z) {
            getWritableDatabase().beginTransaction();
            try {
                if (z) {
                    getWritableDatabase().delete("log", "_id = ?", new String[]{Long.toString(aVar.f118948a)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("session", (Integer) 0);
                    getWritableDatabase().update("log", contentValues, "_id = ?", new String[]{Long.toString(aVar.f118948a)});
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
            tu2.m192703a("[putong-common][db]", "client_tracking onUpgrade oldVersion = " + i + ", newVersion = " + i2);
            if (i < 3) {
                sQLiteDatabase.execSQL("ALTER TABLE log ADD COLUMN seqnum INTEGER");
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m143991B() {
        f118946c.m143999e();
    }

    /* JADX INFO: renamed from: z */
    public static String m143994z() {
        return niw.m163314d(App.f16088e.getDatabasePath("event_tracking"));
    }

    /* JADX INFO: renamed from: C */
    public void m143996C() {
        l51.m152919y(new Runnable() { // from class: l.ia5
            @Override // java.lang.Runnable
            public final void run() {
                this.f113557a.m143995A();
            }
        });
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void m143995A() {
        ArrayList<C17904b.a> arrayListM144000e = this.f118947a.m144000e();
        Collections.sort(arrayListM144000e);
        boolean z = false;
        for (C17904b.a aVar : arrayListM144000e) {
            if (z) {
                this.f118947a.m144001f(aVar, false);
            } else if (!m143998E(aVar, true)) {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m143998E(C17904b.a aVar, boolean z) {
        int i = 0;
        boolean z2 = false;
        while (i <= 2 && !z2) {
            i5d0 i5d0VarExecute = null;
            try {
                try {
                    try {
                        i5d0VarExecute = uqb0.f180368D.mo181341a(uqb0.f180376H.basic().m209043q(aVar.f118949b).m209028b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (i5d0VarExecute != null) {
                        if (i5d0VarExecute.m138673q() % 100 == 2) {
                            z2 = true;
                        } else {
                            i += 3;
                        }
                        try {
                            k5d0 k5d0VarM138670k = i5d0VarExecute.m138670k();
                            if (k5d0VarM138670k != null) {
                                k5d0VarM138670k.close();
                            }
                        } catch (Exception e) {
                            CrashHelper.m82479c(e);
                        }
                    }
                } catch (Throwable th) {
                    ua5.m195158b(i5d0VarExecute);
                    throw th;
                }
            } catch (Exception e2) {
                i++;
                CrashHelper.m82479c(e2);
            }
            ua5.m195158b(i5d0VarExecute);
        }
        this.f118947a.m144001f(aVar, z2);
        return z2;
    }

    /* JADX INFO: renamed from: l.ja5$a */
    public static class C17903a extends SQLiteOpenHelper {
        public C17903a() {
            super(App.f16088e, "event_tracking", null, 3);
        }

        /* JADX INFO: renamed from: e */
        public void m143999e() {
            if (App.f16088e.getDatabasePath("event_tracking").exists()) {
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
