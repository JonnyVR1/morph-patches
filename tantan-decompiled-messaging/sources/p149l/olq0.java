package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class olq0 extends ajq0<ziq0> {
    public olq0() {
        super("duplicatelog");
    }

    @Override // p149l.ajq0
    /* JADX INFO: renamed from: b */
    public HashMap<String, String> mo97006b() {
        HashMap<String, String> map = new HashMap<>();
        map.put("path", "TEXT");
        map.put("insert_time", "INTEGER");
        map.put("ext1", "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }

    @Override // p149l.ajq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ContentValues mo97005a(ziq0 ziq0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", ziq0Var.f203349a);
        contentValues.put("insert_time", Long.valueOf(ziq0Var.f203350b));
        return contentValues;
    }

    /* JADX INFO: renamed from: f */
    public void m164986f(SQLiteDatabase sQLiteDatabase, ziq0 ziq0Var) {
        if (ziq0Var == null || m164987g(sQLiteDatabase, ziq0Var.f203349a)) {
            return;
        }
        super.m97008d(sQLiteDatabase, ziq0Var);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f70134b + " where _id in (select _id from " + this.f70134b + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            kwq0.m147634g(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m164987g(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        int count;
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase.query(this.f70134b, null, "path=?", new String[]{str}, null, null, null);
            count = cursorQuery.getCount();
            try {
                cursorQuery.close();
            } catch (Throwable th2) {
                th = th2;
                kwq0.m147634g(th);
            }
        } catch (Throwable th3) {
            th = th3;
            count = 0;
        }
        return count > 0;
    }
}
