package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;
import p149l.qkq0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes2.dex */
public class BackupKit implements CancellationSignal.OnCancelListener {
    public static final int FLAG_FIX_CORRUPTION = 4;
    public static final int FLAG_INCREMENTAL = 16;
    public static final int FLAG_NO_CIPHER = 1;
    public static final int FLAG_NO_COMPRESS = 2;
    public static final int FLAG_NO_CREATE_TABLE = 8;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    static final String TAG = "WCDB.DBBackup";
    private SQLiteDatabase mDB;
    private String mLastError = null;
    private long mNativePtr;
    private int mStatementCount;
    private String[] mTableDesc;

    public BackupKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr, int i, String[] strArr) throws SQLiteException {
        this.mDB = sQLiteDatabase;
        this.mTableDesc = strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : null;
        if (str == null) {
            x9g0.m207497a();
            throw null;
        }
        long jNativeInit = nativeInit(str, bArr, i);
        this.mNativePtr = jNativeInit;
        if (jNativeInit == 0) {
            throw new SQLiteException("Failed initialize backup context.");
        }
    }

    private static native void nativeCancel(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr, int i);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, String[] strArr);

    private static native int nativeStatementCount(long j);

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public String lastError() {
        return this.mLastError;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
        long j = this.mNativePtr;
        if (j != 0) {
            nativeCancel(j);
        }
    }

    public void release() {
        long j = this.mNativePtr;
        if (j != 0) {
            nativeFinish(j);
            this.mNativePtr = 0L;
        }
    }

    public int run() {
        if (this.mNativePtr == 0) {
            qkq0.m175383a("BackupKit not initialized.");
            return 0;
        }
        long jAcquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("backup", false, false);
        int iNativeRun = nativeRun(this.mNativePtr, jAcquireNativeConnectionHandle, this.mTableDesc);
        this.mDB.releaseNativeConnection(jAcquireNativeConnectionHandle, null);
        this.mStatementCount = nativeStatementCount(this.mNativePtr);
        this.mLastError = nativeLastError(this.mNativePtr);
        nativeFinish(this.mNativePtr);
        this.mNativePtr = 0L;
        return iNativeRun;
    }

    public int statementCount() {
        return this.mStatementCount;
    }

    public int run(CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int iRun = run();
        cancellationSignal.setOnCancelListener(null);
        return iRun;
    }
}
