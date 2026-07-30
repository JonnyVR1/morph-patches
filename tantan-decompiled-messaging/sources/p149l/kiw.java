package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class kiw {

    /* JADX INFO: renamed from: b */
    private static final String f123409b = "kiw";

    /* JADX INFO: renamed from: a */
    private ciw f123410a;

    /* JADX INFO: renamed from: l.kiw$b */
    public static class C18026b {

        /* JADX INFO: renamed from: c */
        private static C18026b f123411c;

        /* JADX INFO: renamed from: d */
        private static ciw f123412d;

        /* JADX INFO: renamed from: a */
        private AtomicInteger f123413a = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        private SQLiteDatabase f123414b;

        private C18026b() {
        }

        /* JADX INFO: renamed from: b */
        public static synchronized C18026b m146159b() {
            return f123411c;
        }

        /* JADX INFO: renamed from: c */
        public static synchronized void m146160c(ciw ciwVar) {
            f123411c = new C18026b();
            f123412d = ciwVar;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m146161a() {
            SQLiteDatabase sQLiteDatabase;
            if (this.f123413a.decrementAndGet() == 0 && (sQLiteDatabase = this.f123414b) != null) {
                sQLiteDatabase.close();
            }
        }

        /* JADX INFO: renamed from: d */
        public synchronized SQLiteDatabase m146162d() {
            try {
                if (this.f123413a.incrementAndGet() == 1) {
                    this.f123414b = f123412d.getWritableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f123414b;
        }
    }

    /* JADX INFO: renamed from: l.kiw$c */
    public static class C18027c {

        /* JADX INFO: renamed from: a */
        private static kiw f123415a = new kiw();
    }

    private kiw() {
        m146147a();
        C18026b.m146160c(this.f123410a);
    }

    /* JADX INFO: renamed from: a */
    private void m146147a() {
        this.f123410a = new ciw(shw.m184283c());
    }

    /* JADX INFO: renamed from: b */
    private boolean m146148b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select count(_id) from mk_usage  WHERE _id=?", new String[]{str});
        int i = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : 0;
        cursorRawQuery.close();
        return i == 1;
    }

    /* JADX INFO: renamed from: d */
    private void m146149d() {
        C18026b.m146159b().m146161a();
    }

    /* JADX INFO: renamed from: f */
    public static kiw m146150f() {
        return C18027c.f123415a;
    }

    /* JADX INFO: renamed from: g */
    private boolean m146151g(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        return sQLiteDatabase.insert("mk_usage", null, contentValues) >= 0;
    }

    /* JADX INFO: renamed from: h */
    private SQLiteDatabase m146152h() {
        return C18026b.m146159b().m146162d();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m146153c() {
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM146152h = m146152h();
                if (sQLiteDatabaseM146152h == null) {
                    m146149d();
                    return;
                }
                sQLiteDatabaseM146152h.delete("mk_usage", null, null);
                mxv.m156926a(f123409b, "tang-----清空所有使用纪录 ");
                m146149d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            m146149d();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m146154e(String str) {
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM146152h = m146152h();
                if (sQLiteDatabaseM146152h == null) {
                    m146149d();
                    return;
                }
                sQLiteDatabaseM146152h.delete("mk_usage", "_id=?", new String[]{str});
                mxv.m156926a(f123409b, "tang-----清空单个离线包使用纪录 " + str);
                m146149d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            m146149d();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized n460 m146155i(String str) {
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM146152h = m146152h();
                if (sQLiteDatabaseM146152h == null) {
                    m146149d();
                    return null;
                }
                Cursor cursorQuery = sQLiteDatabaseM146152h.query("mk_usage", null, "_id=?", new String[]{str}, null, null, null);
                n460 n460VarM157803a = n460.m157803a(cursorQuery);
                cursorQuery.close();
                m146149d();
                return n460VarM157803a;
            } catch (Exception e) {
                e.printStackTrace();
                m146149d();
                return null;
            }
        } catch (Throwable th) {
            m146149d();
            throw th;
        }
        m146149d();
        throw th;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m146156j(String str, int i) {
        boolean zM146151g = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM146152h = m146152h();
                ContentValues contentValues = new ContentValues();
                contentValues.put("asymEncrypt", Integer.valueOf(i));
                if (m146148b(sQLiteDatabaseM146152h, str)) {
                    zM146151g = sQLiteDatabaseM146152h.update("mk_usage", contentValues, "_id=?", new String[]{str}) == 1;
                    mxv.m156926a(f123409b, "tang----更新数据 " + zM146151g + "   " + contentValues);
                } else {
                    contentValues.put("_id", str);
                    zM146151g = m146151g(sQLiteDatabaseM146152h, contentValues);
                    mxv.m156926a(f123409b, "tang----插入数据 " + zM146151g + "   " + contentValues);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m146149d();
            return zM146151g;
        } catch (Throwable th) {
            m146149d();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m146157k(String str, long j) {
        boolean zM146151g = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM146152h = m146152h();
                ContentValues contentValues = new ContentValues();
                contentValues.put("checkupdate", Long.valueOf(j));
                if (m146148b(sQLiteDatabaseM146152h, str)) {
                    zM146151g = sQLiteDatabaseM146152h.update("mk_usage", contentValues, "_id=?", new String[]{str}) == 1;
                    mxv.m156926a(f123409b, "tang----更新数据 " + zM146151g + "   " + contentValues);
                } else {
                    contentValues.put("_id", str);
                    zM146151g = m146151g(sQLiteDatabaseM146152h, contentValues);
                    mxv.m156926a(f123409b, "tang----插入数据 " + zM146151g + "   " + contentValues);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m146149d();
            return zM146151g;
        } catch (Throwable th) {
            m146149d();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized boolean m146158l(String str, long j) {
        boolean zM146151g = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM146152h = m146152h();
                ContentValues contentValues = new ContentValues();
                contentValues.put("visit", Long.valueOf(j));
                if (m146148b(sQLiteDatabaseM146152h, str)) {
                    zM146151g = sQLiteDatabaseM146152h.update("mk_usage", contentValues, "_id=?", new String[]{str}) == 1;
                    mxv.m156926a(f123409b, "tang----更新数据 " + zM146151g + "   " + contentValues);
                } else {
                    contentValues.put("_id", str);
                    zM146151g = m146151g(sQLiteDatabaseM146152h, contentValues);
                    mxv.m156926a(f123409b, "tang----插入数据 " + zM146151g + "   " + contentValues);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m146149d();
            return zM146151g;
        } catch (Throwable th) {
            m146149d();
            throw th;
        }
    }
}
