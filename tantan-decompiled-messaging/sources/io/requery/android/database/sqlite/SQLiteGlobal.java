package io.requery.android.database.sqlite;

import android.os.StatFs;
import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteGlobal {
    private static int sDefaultPageSize;
    private static final Object sLock = new Object();

    private SQLiteGlobal() {
    }

    public static String getDefaultJournalMode() {
        return RequestParameters.SUBRESOURCE_DELETE;
    }

    public static int getDefaultPageSize() {
        synchronized (sLock) {
            try {
                if (sDefaultPageSize == 0) {
                    sDefaultPageSize = new StatFs("/data").getBlockSize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 1024;
    }

    public static String getDefaultSyncMode() {
        return "normal";
    }

    public static int getJournalSizeLimit() {
        return 10000;
    }

    public static int getWALAutoCheckpoint() {
        return Math.max(1, 1000);
    }

    public static int getWALConnectionPoolSize() {
        return Math.max(2, 5);
    }

    public static String getWALSyncMode() {
        return "normal";
    }

    private static native int nativeReleaseMemory();

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }
}
