package org.greenrobot.greendao.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import p149l.w6k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DatabaseOpenHelper extends w6k {
    private final Context context;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    public DatabaseOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = i;
    }

    public Database getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public Database getWritableDb() {
        return wrap(getWritableDatabase());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(wrap(sQLiteDatabase), i, i2);
    }

    public void setLoadSQLCipherNativeLibs(boolean z) {
        this.loadSQLCipherNativeLibs = z;
    }

    public Database wrap(SQLiteDatabase sQLiteDatabase) {
        return new StandardDatabase(sQLiteDatabase);
    }

    public void onCreate(Database database) {
    }

    public void onOpen(Database database) {
    }

    public void onUpgrade(Database database, int i, int i2) {
    }

    public DatabaseOpenHelper(Context context, String str, int i) {
        this(context, str, null, i);
    }
}
