package com.tencent.wcdb.database;

import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "WCDB.SQLiteQuery";
    private final CancellationSignal mCancellationSignal;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    public int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        CursorWindow cursorWindow2;
        acquireReference();
        try {
            cursorWindow.acquireReference();
            try {
                cursorWindow2 = cursorWindow;
                try {
                    try {
                        int iExecuteForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow2, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
                        cursorWindow2.releaseReference();
                        releaseReference();
                        return iExecuteForCursorWindow;
                    } catch (SQLiteException e) {
                        e = e;
                        SQLiteException sQLiteException = e;
                        Log.m84619e(TAG, "exception: " + sQLiteException.getMessage() + "; query: " + getSql());
                        checkCorruption(sQLiteException);
                        throw sQLiteException;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    cursorWindow2.releaseReference();
                    throw th2;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorWindow2 = cursorWindow;
            } catch (Throwable th3) {
                th = th3;
                cursorWindow2 = cursorWindow;
                Throwable th4 = th;
                cursorWindow2.releaseReference();
                throw th4;
            }
        } catch (Throwable th5) {
            releaseReference();
            throw th5;
        }
    }

    public String toString() {
        return "SQLiteQuery: " + getSql();
    }
}
