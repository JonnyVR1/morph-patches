package com.tencent.wcdb.database;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteAsyncCheckpointer implements SQLiteCheckpointListener, Handler.Callback {
    private static final int DEFAULT_BLOCKING_THRESHOLD = 300;
    private static final int DEFAULT_THRESHOLD = 100;
    private static HandlerThread gDefaultThread;
    private static final Object gDefaultThreadLock = new Object();
    private static int gDefaultThreadRefCount;
    private int mBlockingThreshold;
    private Handler mHandler;
    private int mLastSyncMode;
    private Looper mLooper;
    private final HashSet<Pair<SQLiteDatabase, String>> mPendingCheckpoints;
    private int mThreshold;
    private boolean mUseDefaultLooper;

    public SQLiteAsyncCheckpointer(Looper looper, int i, int i2) {
        this.mLooper = looper;
        this.mThreshold = i;
        this.mBlockingThreshold = i2;
        this.mPendingCheckpoints = new HashSet<>();
    }

    private static Looper acquireDefaultLooper() {
        Looper looper;
        synchronized (gDefaultThreadLock) {
            try {
                int i = gDefaultThreadRefCount;
                gDefaultThreadRefCount = i + 1;
                if (i == 0) {
                    if (gDefaultThread != null) {
                        throw new AssertionError("gDefaultThread == null");
                    }
                    HandlerThread handlerThread = new HandlerThread("WCDB.AsyncCheckpointer", 4);
                    gDefaultThread = handlerThread;
                    handlerThread.start();
                }
                looper = gDefaultThread.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    private static void releaseDefaultLooper() {
        synchronized (gDefaultThreadLock) {
            try {
                int i = gDefaultThreadRefCount - 1;
                gDefaultThreadRefCount = i;
                if (i <= 0) {
                    if (i < 0) {
                        throw new AssertionError("gDefaultThreadRefCount == 0");
                    }
                    gDefaultThread.quit();
                    gDefaultThread = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) pair.first;
        String str = (String) pair.second;
        boolean z = message.arg1 != 0;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            Pair<Integer, Integer> pairWalCheckpoint = sQLiteDatabase.walCheckpoint(str, z);
            onCheckpointResult(sQLiteDatabase, ((Integer) pairWalCheckpoint.first).intValue(), ((Integer) pairWalCheckpoint.second).intValue(), SystemClock.uptimeMillis() - jUptimeMillis);
            sQLiteDatabase.releaseReference();
            synchronized (this.mPendingCheckpoints) {
                try {
                    if (!this.mPendingCheckpoints.remove(pair)) {
                        throw new AssertionError("mPendingCheckpoints.remove(p)");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            sQLiteDatabase.releaseReference();
            throw th2;
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onAttach(SQLiteDatabase sQLiteDatabase) {
        if (this.mLooper == null) {
            this.mLooper = acquireDefaultLooper();
            this.mUseDefaultLooper = true;
        }
        this.mHandler = new Handler(this.mLooper, this);
        this.mLastSyncMode = sQLiteDatabase.getSynchronousMode();
        sQLiteDatabase.setSynchronousMode(1);
    }

    public void onCheckpointResult(SQLiteDatabase sQLiteDatabase, int i, int i2, long j) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onDetach(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setSynchronousMode(this.mLastSyncMode);
        this.mHandler = null;
        if (this.mUseDefaultLooper) {
            this.mLooper = null;
            releaseDefaultLooper();
            this.mUseDefaultLooper = false;
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onWALCommit(SQLiteDatabase sQLiteDatabase, String str, int i) {
        boolean zAdd;
        if (i < this.mThreshold) {
            return;
        }
        int i2 = i >= this.mBlockingThreshold ? 1 : 0;
        Pair<SQLiteDatabase, String> pair = new Pair<>(sQLiteDatabase, str);
        synchronized (this.mPendingCheckpoints) {
            zAdd = this.mPendingCheckpoints.add(pair);
        }
        if (zAdd) {
            sQLiteDatabase.acquireReference();
            this.mHandler.sendMessage(this.mHandler.obtainMessage(0, i2, 0, pair));
        }
    }

    public SQLiteAsyncCheckpointer(Looper looper) {
        this(looper, 100, 300);
    }

    public SQLiteAsyncCheckpointer() {
        this(null, 100, 300);
    }
}
