package org.greenrobot.greendao.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import l.w6k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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

    /* JADX WARN: Multi-variable type inference failed */
    public Database getReadableDb() {
        return wrap(getReadableDatabase());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Database getWritableDb() {
        return wrap(getWritableDatabase());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

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
