package com.tencent.wcdb.repair;

import android.database.Cursor;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import p149l.x9g0;

/* JADX INFO: loaded from: classes2.dex */
public class RepairKit implements CancellationSignal.OnCancelListener {
    public static final int FLAG_ALL_TABLES = 2;
    public static final int FLAG_NO_CREATE_TABLES = 1;
    private static final int INTEGRITY_DATA = 2;
    private static final int INTEGRITY_HEADER = 1;
    private static final int INTEGRITY_KDF_SALT = 4;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_IGNORE = 2;
    public static final int RESULT_OK = 0;
    private Callback mCallback;
    private RepairCursor mCurrentCursor;
    private int mIntegrityFlags;
    private MasterInfo mMasterInfo;
    private long mNativePtr;

    public interface Callback {
        int onProgress(String str, int i, Cursor cursor);
    }

    public static class MasterInfo {
        private byte[] mKDFSalt;
        private long mMasterPtr;

        private MasterInfo(long j, byte[] bArr) {
            this.mMasterPtr = j;
            this.mKDFSalt = bArr;
        }

        public static MasterInfo load(String str, byte[] bArr, String[] strArr) {
            if (str == null) {
                return make(strArr);
            }
            byte[] bArr2 = new byte[16];
            long jNativeLoadMaster = RepairKit.nativeLoadMaster(str, bArr, strArr, bArr2);
            if (jNativeLoadMaster != 0) {
                return new MasterInfo(jNativeLoadMaster, bArr2);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        public static MasterInfo make(String[] strArr) {
            long jNativeMakeMaster = RepairKit.nativeMakeMaster(strArr);
            if (jNativeMakeMaster != 0) {
                return new MasterInfo(jNativeMakeMaster, null);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        public static boolean save(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
            long jAcquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("backupMaster", true, false);
            boolean zNativeSaveMaster = RepairKit.nativeSaveMaster(jAcquireNativeConnectionHandle, str, bArr);
            sQLiteDatabase.releaseNativeConnection(jAcquireNativeConnectionHandle, null);
            return zNativeSaveMaster;
        }

        public void finalize() throws Throwable {
            release();
            super.finalize();
        }

        public void release() {
            long j = this.mMasterPtr;
            if (j == 0) {
                return;
            }
            RepairKit.nativeFreeMaster(j);
            this.mMasterPtr = 0L;
        }
    }

    public static class RepairCursor extends AbstractCursor {
        long mPtr;

        private RepairCursor() {
        }

        private static native byte[] nativeGetBlob(long j, int i);

        private static native int nativeGetColumnCount(long j);

        private static native double nativeGetDouble(long j, int i);

        private static native long nativeGetLong(long j, int i);

        private static native String nativeGetString(long j, int i);

        private static native int nativeGetType(long j, int i);

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public byte[] getBlob(int i) {
            return nativeGetBlob(this.mPtr, i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getColumnCount() {
            return nativeGetColumnCount(this.mPtr);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getCount() {
            throw new UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public double getDouble(int i) {
            return nativeGetDouble(this.mPtr, i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public float getFloat(int i) {
            return (float) getDouble(i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getInt(int i) {
            return (int) getLong(i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public long getLong(int i) {
            return nativeGetLong(this.mPtr, i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public short getShort(int i) {
            return (short) getLong(i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public String getString(int i) {
            return nativeGetString(this.mPtr, i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getType(int i) {
            return nativeGetType(this.mPtr, i);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public boolean isNull(int i) {
            return getType(i) == 0;
        }
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, MasterInfo masterInfo) {
        if (str == null) {
            x9g0.m207497a();
            throw null;
        }
        long jNativeInit = nativeInit(str, bArr, sQLiteCipherSpec, masterInfo != null ? masterInfo.mKDFSalt : null);
        this.mNativePtr = jNativeInit;
        if (jNativeInit == 0) {
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        this.mIntegrityFlags = nativeIntegrityFlags(jNativeInit);
        this.mMasterInfo = masterInfo;
    }

    public static String lastError() {
        return nativeLastError();
    }

    private static native void nativeCancel(long j);

    private static native void nativeFini(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFreeMaster(long j);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    private static native int nativeIntegrityFlags(long j);

    private static native String nativeLastError();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j, long j2, long j3, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    private int onProgress(String str, int i, long j) {
        if (this.mCallback == null) {
            return 0;
        }
        if (this.mCurrentCursor == null) {
            this.mCurrentCursor = new RepairCursor();
        }
        RepairCursor repairCursor = this.mCurrentCursor;
        repairCursor.mPtr = j;
        return this.mCallback.onProgress(str, i, repairCursor);
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public Callback getCallback() {
        return this.mCallback;
    }

    public boolean isDataCorrupted() {
        return (this.mIntegrityFlags & 2) == 0;
    }

    public boolean isHeaderCorrupted() {
        return (this.mIntegrityFlags & 1) == 0;
    }

    public boolean isSaltCorrupted() {
        return (this.mIntegrityFlags & 4) == 0;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeCancel(j);
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i) {
        if (this.mNativePtr == 0) {
            x9g0.m207497a();
            return 0;
        }
        MasterInfo masterInfo = this.mMasterInfo;
        long j = masterInfo != null ? masterInfo.mMasterPtr : 0L;
        long jAcquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("repair", false, false);
        int iNativeOutput = nativeOutput(this.mNativePtr, jAcquireNativeConnectionHandle, j, i);
        sQLiteDatabase.releaseNativeConnection(jAcquireNativeConnectionHandle, null);
        this.mCurrentCursor = null;
        this.mIntegrityFlags = nativeIntegrityFlags(this.mNativePtr);
        return iNativeOutput;
    }

    public void release() {
        MasterInfo masterInfo = this.mMasterInfo;
        if (masterInfo != null) {
            masterInfo.release();
            this.mMasterInfo = null;
        }
        long j = this.mNativePtr;
        if (j != 0) {
            nativeFini(j);
            this.mNativePtr = 0L;
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int iOutput = output(sQLiteDatabase, i);
        cancellationSignal.setOnCancelListener(null);
        return iOutput;
    }
}
