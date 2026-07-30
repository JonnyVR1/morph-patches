package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteAsyncQuery extends SQLiteProgram {
    private static final String TAG = "WCDB.SQLiteAsyncQuery";
    private final int mResultColumns;

    public SQLiteAsyncQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mResultColumns = getColumnNames().length;
    }

    private static native int nativeCount(long j);

    private static native int nativeFillRows(long j, long j2, int i, int i2);

    public void acquire() {
        if (this.mPreparedStatement == null) {
            acquirePreparedStatement(true);
            this.mPreparedStatement.bindArguments(getBindArgs());
        }
    }

    public int fillRows(ChunkedCursorWindow chunkedCursorWindow, int i, int i2) {
        acquire();
        int numColumns = chunkedCursorWindow.getNumColumns();
        int i3 = this.mResultColumns;
        if (numColumns != i3) {
            chunkedCursorWindow.setNumColumns(i3);
        }
        try {
            return nativeFillRows(this.mPreparedStatement.getPtr(), chunkedCursorWindow.mWindowPtr, i, i2);
        } catch (SQLiteException e) {
            Log.m84619e(TAG, "Got exception on fillRows: " + e.getMessage() + ", SQL: " + getSql());
            checkCorruption(e);
            throw e;
        }
    }

    public int getCount() {
        acquire();
        try {
            return nativeCount(this.mPreparedStatement.getPtr());
        } catch (SQLiteException e) {
            Log.m84619e(TAG, "Got exception on getCount: " + e.getMessage() + ", SQL: " + getSql());
            checkCorruption(e);
            throw e;
        }
    }

    public void release() {
        releasePreparedStatement();
    }

    public void reset() {
        SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
        if (preparedStatement != null) {
            preparedStatement.reset(false);
        }
    }
}
