package p153l;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.proxy.api.C13825a;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes2.dex */
public class cbl0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    public static final Integer f80832b = 2;

    /* JADX INFO: renamed from: c */
    public static cbl0 f80833c;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, Integer> f80834a;

    public cbl0() {
        super(App.f16088e, "momo_video_cache", (SQLiteDatabase.CursorFactory) null, f80832b.intValue());
        this.f80834a = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: n */
    public static cbl0 m108642n() {
        if (f80833c == null) {
            synchronized (cbl0.class) {
                try {
                    if (f80833c == null) {
                        f80833c = new cbl0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f80833c;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ uxj0 m108643B() throws Exception {
        try {
            getReadableDatabase().beginTransaction();
            getReadableDatabase().delete("video_cache", null, null);
            getReadableDatabase().setTransactionSuccessful();
            this.f80834a.clear();
            return uxj0.f181467a;
        } finally {
            getReadableDatabase().endTransaction();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m108644F(String str, gcg0 gcg0Var) {
        synchronized (this.f80834a) {
            try {
                Integer numValueOf = this.f80834a.get(str);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(m108650t(str));
                    this.f80834a.put(str, numValueOf);
                }
                gcg0Var.onNext(numValueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.database.sqlite.SQLiteOpenHelper, l.cbl0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.database.sqlite.SQLiteOpenHelper] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ uxj0 m108645H(String str) throws Exception {
        uxj0 uxj0Var;
        synchronized (this.f80834a) {
            try {
                try {
                    getReadableDatabase().beginTransaction();
                    if (m108651u(str)) {
                        getReadableDatabase().execSQL("UPDATE video_cache SET _count = _count + 1 WHERE url=?", new Object[]{str});
                        getReadableDatabase().setTransactionSuccessful();
                        Integer num = this.f80834a.get(str);
                        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f80834a;
                        if (num == null) {
                            concurrentHashMap.put(str, Integer.valueOf(m108650t(str) + 1));
                        } else {
                            concurrentHashMap.put(str, Integer.valueOf(concurrentHashMap.get(str).intValue() + 1));
                        }
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("url", str);
                        getReadableDatabase().insert("video_cache", null, contentValues);
                        getReadableDatabase().setTransactionSuccessful();
                        this.f80834a.put(str, 1);
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                    e.getMessage();
                }
                this = getReadableDatabase();
                this.endTransaction();
                uxj0Var = uxj0.f181467a;
            } catch (Throwable th) {
                this.getReadableDatabase().endTransaction();
                throw th;
            }
        }
        return uxj0Var;
    }

    /* JADX INFO: renamed from: I */
    public void m108646I(final String str) {
        C22421c.fromCallable(new Callable() { // from class: l.bbl0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75965a.m108645H(str);
            }
        }).compose(psd0.m173592C()).materialize().subscribe();
    }

    /* JADX INFO: renamed from: k */
    public void m108647k() {
        C22421c.fromCallable(new Callable() { // from class: l.zal0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f203584a.m108643B();
            }
        }).compose(psd0.m173592C()).materialize().subscribe();
    }

    /* JADX INFO: renamed from: m */
    public final void m108648m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT UNIQUE)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m108648m(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 1, f80832b.intValue());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 1) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE video_cache ADD COLUMN _count INTEGER DEFAULT 1");
    }

    /* JADX INFO: renamed from: q */
    public C22421c<Integer> m108649q(final String str) {
        return C22421c.create(new C22421c.a() { // from class: l.abl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69633a.m108644F(str, (gcg0) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[PHI: r3
      0x004e: PHI (r3v2 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v3 android.database.Cursor) binds: [B:15:0x004c, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t */
    public final int m108650t(String str) {
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
                CrashHelper.m82479c(new Exception("getVideoPlayCount exception:" + e.getMessage(), e));
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
    public boolean m108651u(String str) throws Throwable {
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
                    CrashHelper.m82479c(new Exception("hasPlayVideoSync exception:" + exc.getMessage(), exc));
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
    public void m108652v() {
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
                            C13825a.m82554p().m82559o(Uri.parse(cursorQuery.getString(cursorQuery.getColumnIndex("url"))).getPath());
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
                    CrashHelper.m82479c(sQLiteException);
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
                    CrashHelper.m82479c(new Exception("initCacheTableSync exception:" + exc.getMessage(), exc));
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
