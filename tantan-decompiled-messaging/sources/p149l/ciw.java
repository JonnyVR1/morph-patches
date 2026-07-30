package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class ciw extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private static final String f81117a = "ciw";

    public ciw(Context context) {
        this(context, "mk.db", null, 2);
    }

    /* JADX INFO: renamed from: b */
    private void m107100b(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS mk_usage( _id TEXT primary key,visit LONG,asymEncrypt INT,checkupdate LONG");
        for (int i = 0; i < 10; i++) {
            sb.append(",temp" + i + " TEXT");
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
        mxv.m156926a(f81117a, "tang-----build table " + ((Object) sb));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            m107100b(sQLiteDatabase, "mk_usage");
            onCreate(sQLiteDatabase);
            mxv.m156930e(f81117a, "onDowngrade drop table and reCreate");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mxv.m156926a(f81117a, "onUpgrade~~~~~~~~~~~~oldVersion=" + i + ", newVersion=" + i2);
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE mk_usage ADD COLUMN asymEncrypt INT ");
        }
    }

    public ciw(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }
}
