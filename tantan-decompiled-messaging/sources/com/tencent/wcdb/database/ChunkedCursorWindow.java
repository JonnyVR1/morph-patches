package com.tencent.wcdb.database;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.wcdb.CursorWindowAllocationException;
import p149l.sad0;

/* JADX INFO: loaded from: classes2.dex */
public class ChunkedCursorWindow extends SQLiteClosable {
    public static final long CHUNK_NOT_FOUND = -1;
    private int mNumColumns = 0;
    long mWindowPtr;

    public ChunkedCursorWindow(int i) {
        long jNativeCreate = nativeCreate(i);
        this.mWindowPtr = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new CursorWindowAllocationException("Cursor window allocation failed.");
        }
    }

    private void dispose() {
        long j = this.mWindowPtr;
        if (j != 0) {
            nativeDispose(j);
            this.mWindowPtr = 0L;
        }
    }

    private static native void nativeClear(long j);

    private static native long nativeCreate(int i);

    private static native void nativeDispose(long j);

    private static native void nativeEndRow(long j, long j2);

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native int nativeGetNumChunks(long j);

    private static native long nativeGetRow(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native long nativeRemoveChunk(long j, int i);

    private static native boolean nativeSetNumColumns(long j, int i);

    public void clear() {
        acquireReference();
        try {
            nativeClear(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void endRowUnsafe(long j) {
        if (j == 0) {
            return;
        }
        nativeEndRow(this.mWindowPtr, j);
        releaseReference();
    }

    public void finalize() throws Throwable {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public byte[] getBlob(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe == 0) {
            sad0.m182909a("Couldn't read row ", i, ", column ", i2, " from ChunkedCursorWindow.");
            return null;
        }
        try {
            return nativeGetBlob(rowUnsafe, i2);
        } finally {
            endRowUnsafe(rowUnsafe);
        }
    }

    public byte[] getBlobUnsafe(long j, int i) {
        return nativeGetBlob(j, i);
    }

    public double getDouble(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe == 0) {
            sad0.m182909a("Couldn't read row ", i, ", column ", i2, " from ChunkedCursorWindow.");
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        try {
            return nativeGetDouble(rowUnsafe, i2);
        } finally {
            endRowUnsafe(rowUnsafe);
        }
    }

    public double getDoubleUnsafe(long j, int i) {
        return nativeGetDouble(j, i);
    }

    public long getLong(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe == 0) {
            sad0.m182909a("Couldn't read row ", i, ", column ", i2, " from ChunkedCursorWindow.");
            return 0L;
        }
        try {
            return nativeGetLong(rowUnsafe, i2);
        } finally {
            endRowUnsafe(rowUnsafe);
        }
    }

    public long getLongUnsafe(long j, int i) {
        return nativeGetLong(j, i);
    }

    public int getNumChunks() {
        acquireReference();
        try {
            return nativeGetNumChunks(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public int getNumColumns() {
        return this.mNumColumns;
    }

    public long getRowUnsafe(int i) {
        acquireReference();
        long jNativeGetRow = nativeGetRow(this.mWindowPtr, i);
        if (jNativeGetRow == 0) {
            releaseReference();
        }
        return jNativeGetRow;
    }

    public String getString(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe == 0) {
            sad0.m182909a("Couldn't read row ", i, ", column ", i2, " from ChunkedCursorWindow.");
            return null;
        }
        try {
            return nativeGetString(rowUnsafe, i2);
        } finally {
            endRowUnsafe(rowUnsafe);
        }
    }

    public String getStringUnsafe(long j, int i) {
        return nativeGetString(j, i);
    }

    public int getType(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe == 0) {
            sad0.m182909a("Couldn't read row ", i, ", column ", i2, " from ChunkedCursorWindow.");
            return 0;
        }
        try {
            return nativeGetType(rowUnsafe, i2);
        } finally {
            endRowUnsafe(rowUnsafe);
        }
    }

    public int getTypeUnsafe(long j, int i) {
        return nativeGetType(j, i);
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose();
    }

    public long removeChunk(int i) {
        acquireReference();
        try {
            return nativeRemoveChunk(this.mWindowPtr, i);
        } finally {
            releaseReference();
        }
    }

    public boolean setNumColumns(int i) {
        acquireReference();
        try {
            boolean zNativeSetNumColumns = nativeSetNumColumns(this.mWindowPtr, i);
            if (zNativeSetNumColumns) {
                this.mNumColumns = i;
            }
            return zNativeSetNumColumns;
        } finally {
            releaseReference();
        }
    }
}
