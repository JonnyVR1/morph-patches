package com.immomo.mmhttp.cache;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p149l.lwv;
import p149l.nll;

/* JADX INFO: renamed from: com.immomo.mmhttp.cache.b */
/* JADX INFO: loaded from: classes7.dex */
class C3793b extends SQLiteOpenHelper {
    public C3793b() {
        super(nll.m160065a(), "httputils_cache.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("CREATE TABLE cache_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, key VARCHAR, localExpire INTEGER, head BLOB, data BLOB)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cache_unique_index ON cache_table(\"key\")");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            lwv.m152016a(e);
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 != i) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("DROP INDEX cache_unique_index");
                sQLiteDatabase.execSQL("DROP TABLE cache_table");
                sQLiteDatabase.execSQL("CREATE TABLE cache_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, key VARCHAR, localExpire INTEGER, head BLOB, data BLOB)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cache_unique_index ON cache_table(\"key\")");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                lwv.m152016a(e);
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }
}
