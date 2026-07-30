package org.greenrobot.greendao.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import l.wzb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StandardDatabase implements Database {
    private final SQLiteDatabase delegate;

    public StandardDatabase(SQLiteDatabase sQLiteDatabase) {
        this.delegate = sQLiteDatabase;
    }

    @Override // org.greenrobot.greendao.database.Database
    public void beginTransaction() {
        wzb.b();
        this.delegate.beginTransaction();
    }

    @Override // org.greenrobot.greendao.database.Database
    public void close() {
        this.delegate.close();
    }

    @Override // org.greenrobot.greendao.database.Database
    public DatabaseStatement compileStatement(String str) {
        return new StandardDatabaseStatement(this.delegate.compileStatement(str));
    }

    @Override // org.greenrobot.greendao.database.Database
    public void endTransaction() throws Exception {
        wzb.c();
        try {
            this.delegate.endTransaction();
        } catch (Exception e) {
            wzb.a(e);
            throw e;
        }
    }

    @Override // org.greenrobot.greendao.database.Database
    public void execSQL(String str) throws SQLException {
        this.delegate.execSQL(str);
    }

    @Override // org.greenrobot.greendao.database.Database
    public Object getRawDatabase() {
        return this.delegate;
    }

    public SQLiteDatabase getSQLiteDatabase() {
        return this.delegate;
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.Database
    public Cursor rawQuery(String str, String[] strArr) {
        return this.delegate.rawQuery(str, strArr);
    }

    @Override // org.greenrobot.greendao.database.Database
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.Database
    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.delegate.execSQL(str, objArr);
    }
}
