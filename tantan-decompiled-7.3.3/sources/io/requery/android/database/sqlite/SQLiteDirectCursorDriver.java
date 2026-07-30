package io.requery.android.database.sqlite;

import android.database.Cursor;
import p153l.fg4;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private final fg4 mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteQuery mQuery;
    private final String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, fg4 fg4Var) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = fg4Var;
    }

    @Override // io.requery.android.database.sqlite.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // io.requery.android.database.sqlite.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // io.requery.android.database.sqlite.SQLiteCursorDriver
    public void cursorRequeried(Cursor cursor) {
    }

    @Override // io.requery.android.database.sqlite.SQLiteCursorDriver
    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.mDatabase, this.mSql, this.mCancellationSignal);
        try {
            sQLiteQuery.bindAllArgsAsStrings(strArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.mEditTable, sQLiteQuery) : cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            this.mQuery = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e) {
            sQLiteQuery.close();
            throw e;
        }
    }

    @Override // io.requery.android.database.sqlite.SQLiteCursorDriver
    public void setBindArguments(String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }
}
