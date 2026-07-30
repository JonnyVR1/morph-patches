package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteStatement extends SQLiteProgram {
    public SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }

    public void execute(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
                releaseReference();
            } catch (SQLiteException e) {
                checkCorruption(e);
                throw e;
            }
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public long executeInsert(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                long jExecuteForLastInsertedRowId = getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
                releaseReference();
                return jExecuteForLastInsertedRowId;
            } catch (SQLiteDatabaseCorruptException e) {
                checkCorruption(e);
                throw e;
            }
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public int executeUpdateDelete(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                int iExecuteForChangedRowCount = getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
                releaseReference();
                return iExecuteForChangedRowCount;
            } catch (SQLiteDatabaseCorruptException e) {
                checkCorruption(e);
                throw e;
            }
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public long simpleQueryForLong(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                long jExecuteForLong = getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
                releaseReference();
                return jExecuteForLong;
            } catch (SQLiteDatabaseCorruptException e) {
                checkCorruption(e);
                throw e;
            }
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public String simpleQueryForString(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                String strExecuteForString = getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
                releaseReference();
                return strExecuteForString;
            } catch (SQLiteDatabaseCorruptException e) {
                checkCorruption(e);
                throw e;
            }
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public String toString() {
        return "SQLiteProgram: " + getSql();
    }

    public void execute() {
        execute(null);
    }

    public long executeInsert() {
        return executeInsert(null);
    }

    public int executeUpdateDelete() {
        return executeUpdateDelete(null);
    }

    public long simpleQueryForLong() {
        return simpleQueryForLong(null);
    }

    public String simpleQueryForString() {
        return simpleQueryForString(null);
    }
}
