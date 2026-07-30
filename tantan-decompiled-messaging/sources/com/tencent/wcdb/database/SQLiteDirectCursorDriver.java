package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private static SQLiteDatabase.CursorFactory DEFAULT_FACTORY = SQLiteCursor.FACTORY;
    private final CancellationSignal mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteProgram mQuery;
    private final String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = cancellationSignal;
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorRequeried(Cursor cursor) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, Object[] objArr) {
        if (cursorFactory == null) {
            cursorFactory = DEFAULT_FACTORY;
        }
        SQLiteProgram sQLiteProgramNewQuery = null;
        try {
            sQLiteProgramNewQuery = cursorFactory.newQuery(this.mDatabase, this.mSql, objArr, this.mCancellationSignal);
            Cursor cursorNewCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteProgramNewQuery);
            this.mQuery = sQLiteProgramNewQuery;
            return cursorNewCursor;
        } catch (RuntimeException e) {
            if (sQLiteProgramNewQuery != null) {
                sQLiteProgramNewQuery.close();
            }
            throw e;
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void setBindArguments(String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }
}
