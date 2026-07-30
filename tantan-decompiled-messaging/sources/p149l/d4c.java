package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d4c<T> {

    /* JADX INFO: renamed from: a */
    private SQLiteOpenHelper f84290a;

    public d4c(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f84290a = sQLiteOpenHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m109971a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.close();
    }

    /* JADX INFO: renamed from: b */
    public final int m109972b(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseM109978j = m109978j();
        try {
            sQLiteDatabaseM109978j.beginTransaction();
            int iDelete = sQLiteDatabaseM109978j.delete(mo18398h(), str, strArr);
            sQLiteDatabaseM109978j.setTransactionSuccessful();
            return iDelete;
        } catch (Exception e) {
            lwv.m152016a(e);
            return 0;
        } finally {
            sQLiteDatabaseM109978j.endTransaction();
            m109971a(sQLiteDatabaseM109978j, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m109973c() {
        return m109972b(null, null);
    }

    /* JADX INFO: renamed from: d */
    public final List<T> m109974d(String str, String[] strArr) {
        return m109975e(null, str, strArr, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final List<T> m109975e(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        SQLiteDatabase sQLiteDatabaseM109977i = m109977i();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                sQLiteDatabaseM109977i.beginTransaction();
                cursorQuery = sQLiteDatabaseM109977i.query(mo18398h(), strArr, str, strArr2, str2, str3, str4, str5);
                while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                    arrayList.add(mo18399k(cursorQuery));
                }
                sQLiteDatabaseM109977i.setTransactionSuccessful();
            } catch (Exception e) {
                lwv.m152016a(e);
            }
            return arrayList;
        } finally {
            sQLiteDatabaseM109977i.endTransaction();
            m109971a(sQLiteDatabaseM109977i, cursorQuery);
        }
    }

    /* JADX INFO: renamed from: f */
    public final List<T> m109976f() {
        return m109974d(null, null);
    }

    /* JADX INFO: renamed from: g */
    public abstract ContentValues mo18397g(T t);

    /* JADX INFO: renamed from: h */
    public abstract String mo18398h();

    /* JADX INFO: renamed from: i */
    public final SQLiteDatabase m109977i() {
        return this.f84290a.getReadableDatabase();
    }

    /* JADX INFO: renamed from: j */
    public final SQLiteDatabase m109978j() {
        return this.f84290a.getWritableDatabase();
    }

    /* JADX INFO: renamed from: k */
    public abstract T mo18399k(Cursor cursor);

    /* JADX INFO: renamed from: l */
    public long m109979l(T t) {
        SQLiteDatabase sQLiteDatabaseM109978j = m109978j();
        ContentValues contentValuesMo18397g = mo18397g(t);
        try {
            sQLiteDatabaseM109978j.beginTransaction();
            long jReplace = sQLiteDatabaseM109978j.replace(mo18398h(), null, contentValuesMo18397g);
            sQLiteDatabaseM109978j.setTransactionSuccessful();
            return jReplace;
        } catch (Exception e) {
            lwv.m152016a(e);
            return 0L;
        } finally {
            sQLiteDatabaseM109978j.endTransaction();
            m109971a(sQLiteDatabaseM109978j, null);
        }
    }
}
