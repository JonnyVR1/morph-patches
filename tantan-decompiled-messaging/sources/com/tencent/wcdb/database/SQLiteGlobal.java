package com.tencent.wcdb.database;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteGlobal {
    private static final String TAG = "WCDB.SQLiteGlobal";
    public static final String defaultJournalMode = "PERSIST";
    public static final int defaultPageSize;
    public static final String defaultSyncMode = "FULL";
    public static final int journalSizeLimit = 524288;
    public static final int walAutoCheckpoint = 100;
    public static final int walConnectionPoolSize = 4;
    public static final String walSyncMode = "FULL";

    static {
        int blockSize;
        if (!WCDBInitializationProbe.libLoaded) {
            System.loadLibrary("c++_shared");
            System.loadLibrary("wcdb");
        }
        try {
            blockSize = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            blockSize = 4096;
        }
        defaultPageSize = blockSize;
        nativeSetDefaultCipherSettings(blockSize);
    }

    private SQLiteGlobal() {
    }

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    private static native void nativeSetDefaultCipherSettings(int i);

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }
}
