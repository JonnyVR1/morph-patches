package p149l;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.proxy.api.C13662a;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes2.dex */
public class x1l0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    public static final Integer f189086b = 2;

    /* JADX INFO: renamed from: c */
    public static x1l0 f189087c;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, Integer> f189088a;

    public x1l0() {
        super(App.f15369e, "momo_video_cache", (SQLiteDatabase.CursorFactory) null, f189086b.intValue());
        this.f189088a = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: n */
    public static x1l0 m206744n() {
        if (f189087c == null) {
            synchronized (x1l0.class) {
                try {
                    if (f189087c == null) {
                        f189087c = new x1l0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f189087c;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ roj0 m206745B() throws Exception {
        try {
            getReadableDatabase().beginTransaction();
            getReadableDatabase().delete("video_cache", null, null);
            getReadableDatabase().setTransactionSuccessful();
            this.f189088a.clear();
            return roj0.f160388a;
        } finally {
            getReadableDatabase().endTransaction();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m206746F(String str, z3g0 z3g0Var) {
        synchronized (this.f189088a) {
            try {
                Integer numValueOf = this.f189088a.get(str);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(m206752t(str));
                    this.f189088a.put(str, numValueOf);
                }
                z3g0Var.onNext(numValueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.database.sqlite.SQLiteOpenHelper, l.x1l0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.database.sqlite.SQLiteOpenHelper] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ roj0 m206747H(String str) throws Exception {
        roj0 roj0Var;
        synchronized (this.f189088a) {
            try {
                try {
                    getReadableDatabase().beginTransaction();
                    if (m206753u(str)) {
                        getReadableDatabase().execSQL("UPDATE video_cache SET _count = _count + 1 WHERE url=?", new Object[]{str});
                        getReadableDatabase().setTransactionSuccessful();
                        Integer num = this.f189088a.get(str);
                        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f189088a;
                        if (num == null) {
                            concurrentHashMap.put(str, Integer.valueOf(m206752t(str) + 1));
                        } else {
                            concurrentHashMap.put(str, Integer.valueOf(concurrentHashMap.get(str).intValue() + 1));
                        }
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("url", str);
                        getReadableDatabase().insert("video_cache", null, contentValues);
                        getReadableDatabase().setTransactionSuccessful();
                        this.f189088a.put(str, 1);
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                    e.getMessage();
                }
                this = getReadableDatabase();
                this.endTransaction();
                roj0Var = roj0.f160388a;
            } catch (Throwable th) {
                this.getReadableDatabase().endTransaction();
                throw th;
            }
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: I */
    public void m206748I(final String str) {
        C22306c.fromCallable(new Callable() { // from class: l.w1l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f184022a.m206747H(str);
            }
        }).compose(mkd0.m154951C()).materialize().subscribe();
    }

    /* JADX INFO: renamed from: k */
    public void m206749k() {
        C22306c.fromCallable(new Callable() { // from class: l.u1l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f173033a.m206745B();
            }
        }).compose(mkd0.m154951C()).materialize().subscribe();
    }

    /* JADX INFO: renamed from: m */
    public final void m206750m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT UNIQUE)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m206750m(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 1, f189086b.intValue());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 1) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE video_cache ADD COLUMN _count INTEGER DEFAULT 1");
    }

    /* JADX INFO: renamed from: q */
    public C22306c<Integer> m206751q(final String str) {
        return C22306c.create(new C22306c.a() { // from class: l.v1l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179264a.m206746F(str, (z3g0) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[PHI: r3
      0x004e: PHI (r3v2 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v3 android.database.Cursor) binds: [B:15:0x004c, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t */
    public final int m206752t(String str) {
        int i = 1;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = getReadableDatabase().query("video_cache", null, "url=?", new String[]{str}, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    i = cursorQuery.getInt(cursorQuery.getColumnIndex("_count"));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return i;
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("getVideoPlayCount exception:" + e.getMessage(), e));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 1;
            }
        } catch (Throwable unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public boolean m206753u(String str) throws Throwable {
        Throwable th;
        SQLiteDatabase writableDatabase;
        Exception exc;
        boolean z = false;
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            try {
                try {
                    writableDatabase.beginTransaction();
                    cursorQuery = writableDatabase.query("video_cache", new String[]{"_id"}, "url=?", new String[]{str}, null, null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        z = true;
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    writableDatabase.endTransaction();
                    return z;
                } catch (Exception e) {
                    exc = e;
                    CrashHelper.m81296c(new Exception("hasPlayVideoSync exception:" + exc.getMessage(), exc));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (writableDatabase != null) {
                        writableDatabase.endTransaction();
                    }
                    return z;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (writableDatabase != null) {
                    throw th;
                }
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            writableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (writableDatabase != null) {
                throw th;
            }
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.database.Cursor, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v10 */
    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: v */
    public void m206754v() {
        Throwable th;
        Exception exc;
        SQLiteDatabase writableDatabase;
        SQLiteException sQLiteException;
        ?? r1 = 0;
        cursorQuery = null;
        Cursor cursorQuery = null;
        Cursor cursor = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    cursorQuery = writableDatabase.query("video_cache", null, null, null, null, null, "_id");
                    if (cursorQuery != null && cursorQuery.getCount() > 1000) {
                        int i = 0;
                        for (int i2 = 0; i2 < cursorQuery.getCount() - 700; i2++) {
                            cursorQuery.moveToNext();
                            i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                            C13662a.m81371p().m81376o(Uri.parse(cursorQuery.getString(cursorQuery.getColumnIndex("url"))).getPath());
                        }
                        writableDatabase.execSQL("delete from video_cache where _id<=" + i);
                        writableDatabase.setTransactionSuccessful();
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    writableDatabase.endTransaction();
                } catch (SQLiteException e) {
                    sQLiteException = e;
                    cursor = cursorQuery;
                    CrashHelper.m81296c(sQLiteException);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (writableDatabase == null) {
                        return;
                    }
                    writableDatabase.endTransaction();
                } catch (Exception e2) {
                    exc = e2;
                    r1 = cursorQuery;
                    CrashHelper.m81296c(new Exception("initCacheTableSync exception:" + exc.getMessage(), exc));
                    if (r1 != 0) {
                        r1.close();
                    }
                    if (writableDatabase == null) {
                        return;
                    }
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    r1.close();
                }
                if (0 != 0) {
                    throw th;
                }
                r1.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            sQLiteException = e3;
            writableDatabase = null;
        } catch (Exception e4) {
            exc = e4;
            writableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                r1.close();
            }
            if (0 != 0) {
                throw th;
            }
            r1.endTransaction();
            throw th;
        }
    }
}
