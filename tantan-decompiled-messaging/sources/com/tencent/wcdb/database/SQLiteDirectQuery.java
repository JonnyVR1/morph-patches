package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteDirectQuery extends SQLiteProgram {
    private static final int[] SQLITE_TYPE_MAPPING = {3, 1, 2, 3, 4, 0};
    private static final String TAG = "WCDB.SQLiteDirectQuery";
    private final CancellationSignal mCancellationSignal;

    public SQLiteDirectQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native int nativeStep(long j, int i);

    public byte[] getBlob(int i) {
        return nativeGetBlob(this.mPreparedStatement.getPtr(), i);
    }

    public double getDouble(int i) {
        return nativeGetDouble(this.mPreparedStatement.getPtr(), i);
    }

    public long getLong(int i) {
        return nativeGetLong(this.mPreparedStatement.getPtr(), i);
    }

    public String getString(int i) {
        return nativeGetString(this.mPreparedStatement.getPtr(), i);
    }

    public int getType(int i) {
        return SQLITE_TYPE_MAPPING[nativeGetType(this.mPreparedStatement.getPtr(), i)];
    }

    @Override // com.tencent.wcdb.database.SQLiteProgram, com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        synchronized (this) {
            try {
                SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
                if (preparedStatement != null) {
                    preparedStatement.detachCancellationSignal(this.mCancellationSignal);
                    this.mPreparedStatement.endOperation(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.onAllReferencesReleased();
    }

    public synchronized void reset(boolean z) {
        SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
        if (preparedStatement != null) {
            preparedStatement.reset(false);
            if (z) {
                this.mPreparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.endOperation(null);
                releasePreparedStatement();
            }
        }
    }

    public int step(int i) {
        try {
            if (acquirePreparedStatement(false)) {
                this.mPreparedStatement.beginOperation("directQuery", getBindArgs());
                this.mPreparedStatement.attachCancellationSignal(this.mCancellationSignal);
            }
            return nativeStep(this.mPreparedStatement.getPtr(), i);
        } catch (RuntimeException e) {
            if (e instanceof SQLiteException) {
                Log.m84619e(TAG, "Got exception on stepping: " + e.getMessage() + ", SQL: " + getSql());
                checkCorruption((SQLiteException) e);
            }
            SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
            if (preparedStatement != null) {
                preparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.failOperation(e);
            }
            releasePreparedStatement();
            throw e;
        }
    }
}
