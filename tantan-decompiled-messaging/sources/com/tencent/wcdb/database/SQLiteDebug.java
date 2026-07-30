package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.util.Printer;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDebug {
    private static final String TAG = "WCDB.SQLiteDebug";
    private static volatile int sLastErrorLine;
    private static volatile ArrayList<IOTraceStats> sLastIOTraceStats;

    public static class DbStats {
        public String cache;
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(String str, long j, long j2, int i, int i2, int i3, int i4) {
            this.dbName = str;
            this.pageSize = j2 / 1024;
            this.dbSize = (j * j2) / 1024;
            this.lookaside = i;
            this.cache = i2 + "/" + i3 + "/" + i4;
        }
    }

    public static class IOTraceStats {
        public String dbName;
        public String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public String path;

        @SuppressLint({"DefaultLocale"})
        public String toString() {
            return String.format("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", this.dbName, this.path, Long.valueOf(this.pageSize), Long.valueOf(this.pageCount), this.journalMode, Long.valueOf(this.lastReadOffset), Long.valueOf(this.lastWriteOffset), Long.valueOf(this.lastJournalReadOffset), Long.valueOf(this.lastJournalWriteOffset));
        }
    }

    public static class PagerStats {
        public ArrayList<DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    static {
        SQLiteGlobal.loadLib();
    }

    private SQLiteDebug() {
    }

    public static void collectLastIOTraceStats(SQLiteDatabase sQLiteDatabase) {
        try {
            sLastErrorLine = nativeGetLastErrorLine();
            ArrayList<IOTraceStats> arrayList = new ArrayList<>();
            long jAcquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("collectIoStat", false, false);
            if (jAcquireNativeConnectionHandle != 0) {
                nativeGetIOTraceStats(jAcquireNativeConnectionHandle, arrayList);
            }
            sQLiteDatabase.releaseNativeConnection(jAcquireNativeConnectionHandle, null);
            sLastIOTraceStats = arrayList;
        } catch (RuntimeException e) {
            Log.m84619e(TAG, "Cannot collect I/O trace statistics: " + e.getMessage());
        }
    }

    public static void dump(Printer printer, String[] strArr) {
        boolean z = false;
        for (String str : strArr) {
            if (str.equals("-v")) {
                z = true;
            }
        }
        SQLiteDatabase.dumpAll(printer, z);
    }

    public static PagerStats getDatabaseInfo() {
        PagerStats pagerStats = new PagerStats();
        nativeGetPagerStats(pagerStats);
        pagerStats.dbStats = SQLiteDatabase.getDbStats();
        return pagerStats;
    }

    public static int getLastErrorLine() {
        return sLastErrorLine;
    }

    public static ArrayList<IOTraceStats> getLastIOTraceStats() {
        return sLastIOTraceStats;
    }

    private static native void nativeGetIOTraceStats(long j, ArrayList<IOTraceStats> arrayList);

    private static native int nativeGetLastErrorLine();

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    private static native void nativeSetIOTraceFlags(int i);

    public static void setIOTraceFlags(int i) {
        nativeSetIOTraceFlags(i);
    }

    public static final boolean shouldLogSlowQuery(long j) {
        return j > 300;
    }

    public static void collectLastIOTraceStats(SQLiteConnection sQLiteConnection) {
        try {
            sLastErrorLine = nativeGetLastErrorLine();
            ArrayList<IOTraceStats> arrayList = new ArrayList<>();
            long nativeHandle = sQLiteConnection.getNativeHandle(null);
            if (nativeHandle != 0) {
                nativeGetIOTraceStats(nativeHandle, arrayList);
                sQLiteConnection.endNativeHandle(null);
            }
            sLastIOTraceStats = arrayList;
        } catch (RuntimeException e) {
            Log.m84619e(TAG, "Cannot collect I/O trace statistics: " + e.getMessage());
        }
    }
}
