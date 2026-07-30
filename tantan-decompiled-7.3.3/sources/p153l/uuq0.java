package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class uuq0 extends fsq0<esq0> {
    public uuq0() {
        super("duplicatelog");
    }

    @Override // p153l.fsq0
    /* JADX INFO: renamed from: b */
    public HashMap<String, String> mo127235b() {
        HashMap<String, String> map = new HashMap<>();
        map.put("path", "TEXT");
        map.put("insert_time", "INTEGER");
        map.put("ext1", "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }

    @Override // p153l.fsq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ContentValues mo127234a(esq0 esq0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", esq0Var.f95648a);
        contentValues.put("insert_time", Long.valueOf(esq0Var.f95649b));
        return contentValues;
    }

    /* JADX INFO: renamed from: f */
    public void m198213f(SQLiteDatabase sQLiteDatabase, esq0 esq0Var) {
        if (esq0Var == null || m198214g(sQLiteDatabase, esq0Var.f95648a)) {
            return;
        }
        super.m127237d(sQLiteDatabase, esq0Var);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f100682b + " where _id in (select _id from " + this.f100682b + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            q5r0.m175517g(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m198214g(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        int count;
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase.query(this.f100682b, null, "path=?", new String[]{str}, null, null, null);
            count = cursorQuery.getCount();
            try {
                cursorQuery.close();
            } catch (Throwable th2) {
                th = th2;
                q5r0.m175517g(th);
            }
        } catch (Throwable th3) {
            th = th3;
            count = 0;
        }
        return count > 0;
    }
}
