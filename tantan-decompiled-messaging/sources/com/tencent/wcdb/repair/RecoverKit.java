package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public class RecoverKit implements CancellationSignal.OnCancelListener {
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    static final String TAG = "WCDB.DBBackup";
    private SQLiteDatabase mDB;
    private int mFailedCount;
    private String mLastError = null;
    private long mNativePtr;
    private int mSuccessCount;

    public RecoverKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) throws SQLiteException {
        this.mDB = sQLiteDatabase;
        long jNativeInit = nativeInit(str, bArr);
        this.mNativePtr = jNativeInit;
        if (jNativeInit == 0) {
            throw new SQLiteException("Failed initialize recover context.");
        }
    }

    private static native void nativeCancel(long j);

    private static native int nativeFailureCount(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, boolean z);

    private static native int nativeSuccessCount(long j);

    public int failureCount() {
        return this.mFailedCount;
    }

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

    public int run(boolean z) {
        if (this.mNativePtr == 0) {
            qkq0.m175383a("RecoverKit not initialized.");
            return 0;
        }
        long jAcquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("recover", false, false);
        int iNativeRun = nativeRun(this.mNativePtr, jAcquireNativeConnectionHandle, z);
        this.mDB.releaseNativeConnection(jAcquireNativeConnectionHandle, null);
        this.mSuccessCount = nativeSuccessCount(this.mNativePtr);
        this.mFailedCount = nativeFailureCount(this.mNativePtr);
        this.mLastError = nativeLastError(this.mNativePtr);
        nativeFinish(this.mNativePtr);
        this.mNativePtr = 0L;
        return iNativeRun;
    }

    public int successCount() {
        return this.mSuccessCount;
    }

    public int run(boolean z, CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int iRun = run(z);
        cancellationSignal.setOnCancelListener(null);
        return iRun;
    }
}
