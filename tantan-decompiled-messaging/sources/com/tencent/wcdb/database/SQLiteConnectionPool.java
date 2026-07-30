package com.tencent.wcdb.database;

import android.os.SystemClock;
import android.util.Printer;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import com.tencent.wcdb.support.PrefixPrinter;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteConnectionPool implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 3000;
    private static final int OPEN_FLAG_REOPEN_MASK = 268435473;
    private static final String TAG = "WCDB.SQLiteConnectionPool";
    private SQLiteConnection mAvailablePrimaryConnection;
    private volatile SQLiteChangeListener mChangeListener;
    private volatile SQLiteCheckpointListener mCheckpointListener;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private final WeakReference<SQLiteDatabase> mDB;
    private boolean mIsOpen;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private byte[] mPassword;
    private volatile SQLiteTrace mTraceCallback;
    private final Object mLock = new Object();
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();

    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    public static class ConnectionPoolBusyInfo {
        int activeConnections;
        ArrayList<String> activeOperationDescriptions;
        ArrayList<SQLiteTrace.TraceInfo<String>> activeSql;
        ArrayList<SQLiteTrace.TraceInfo<StackTraceElement[]>> activeTransactions;
        int availableConnections;
        int idleConnections;
        String label;

        private ConnectionPoolBusyInfo() {
            this.activeOperationDescriptions = new ArrayList<>();
            this.activeSql = new ArrayList<>();
            this.activeTransactions = new ArrayList<>();
        }
    }

    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }

    private SQLiteConnectionPool(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i) {
        this.mDB = new WeakReference<>(sQLiteDatabase);
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.mConnectionWaiterQueue; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.mNext) {
                connectionWaiter2 = connectionWaiter3;
            }
            ConnectionWaiter connectionWaiter4 = connectionWaiter.mNext;
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter4;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter4;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (true) {
            ArrayList<SQLiteConnection> arrayList = this.mAvailableNonPrimaryConnections;
            if (i >= size) {
                arrayList.clear();
                return;
            } else {
                closeConnectionAndLogExceptionsLocked(arrayList.get(i));
                i++;
            }
        }
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException e) {
            Log.m84619e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection + e.getMessage());
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size <= this.mMaxConnectionPoolSize - 1) {
                return;
            }
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
            size = i;
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z) {
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                this.mIsOpen = false;
                closeAvailableConnectionsAndLogExceptionsLocked();
                int size = this.mAcquiredConnections.size();
                if (size != 0) {
                    Log.m84623i(TAG, "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                wakeConnectionWaitersLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i & 1) != 0);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            Log.m84619e(TAG, "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e;
        }
    }

    private ConnectionPoolBusyInfo gatherConnectionPoolBusyInfoLocked() {
        ConnectionPoolBusyInfo connectionPoolBusyInfo = new ConnectionPoolBusyInfo();
        connectionPoolBusyInfo.activeConnections = 0;
        connectionPoolBusyInfo.idleConnections = 0;
        if (!this.mAcquiredConnections.isEmpty()) {
            for (SQLiteConnection sQLiteConnection : this.mAcquiredConnections.keySet()) {
                SQLiteTrace.TraceInfo<StackTraceElement[]> traceInfoTracePersistAcquisitionUnsafe = sQLiteConnection.tracePersistAcquisitionUnsafe();
                if (traceInfoTracePersistAcquisitionUnsafe != null) {
                    connectionPoolBusyInfo.activeTransactions.add(traceInfoTracePersistAcquisitionUnsafe);
                }
                SQLiteTrace.TraceInfo<String> traceInfoTraceCurrentOperationUnsafe = sQLiteConnection.traceCurrentOperationUnsafe();
                if (traceInfoTraceCurrentOperationUnsafe != null) {
                    connectionPoolBusyInfo.activeSql.add(traceInfoTraceCurrentOperationUnsafe);
                    String strDescribeCurrentOperationUnsafe = sQLiteConnection.describeCurrentOperationUnsafe();
                    if (strDescribeCurrentOperationUnsafe != null) {
                        connectionPoolBusyInfo.activeOperationDescriptions.add(strDescribeCurrentOperationUnsafe);
                    }
                    connectionPoolBusyInfo.activeConnections++;
                } else {
                    connectionPoolBusyInfo.idleConnections++;
                }
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        connectionPoolBusyInfo.availableConnections = size;
        if (this.mAvailablePrimaryConnection != null) {
            connectionPoolBusyInfo.availableConnections = size + 1;
        }
        return connectionPoolBusyInfo;
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private void logConnectionPoolBusy(ConnectionPoolBusyInfo connectionPoolBusyInfo, long j, int i) {
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread threadCurrentThread = Thread.currentThread();
            sb.append("The connection pool for database '");
            sb.append(connectionPoolBusyInfo.label);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(threadCurrentThread.getId());
            sb.append(" (");
            sb.append(threadCurrentThread.getName());
            sb.append(") with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(j * 0.001f);
            sb.append(" seconds.\n");
        }
        sb.append("Connections: ");
        sb.append(connectionPoolBusyInfo.activeConnections);
        sb.append(" active, ");
        sb.append(connectionPoolBusyInfo.idleConnections);
        sb.append(" idle, ");
        sb.append(connectionPoolBusyInfo.availableConnections);
        sb.append(" available.\n");
        if (!connectionPoolBusyInfo.activeOperationDescriptions.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            for (String str : connectionPoolBusyInfo.activeOperationDescriptions) {
                sb.append("  ");
                sb.append(str);
                sb.append(SignParameters.NEW_LINE);
            }
        }
        Log.m84627w(TAG, sb.toString());
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.mAcquiredConnections.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mAcquiredConnections.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        if (sQLiteDatabaseConfiguration == null) {
            ig3.m135964a("configuration must not be null.");
            return null;
        }
        SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabase, sQLiteDatabaseConfiguration, i);
        sQLiteConnectionPool.mPassword = bArr;
        sQLiteConnectionPool.mCipher = sQLiteCipherSpec != null ? new SQLiteCipherSpec(sQLiteCipherSpec) : null;
        sQLiteConnectionPool.open();
        return sQLiteConnectionPool;
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z, this.mPassword, this.mCipher);
    }

    private void reconfigureAllConnectionsLocked() {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                Log.m84620e(TAG, "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, e);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Log.m84620e(TAG, "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e2);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size--;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                Log.m84620e(TAG, "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked(int i) {
        if (i <= 0) {
            i = (this.mConfiguration.openFlags & 536870912) != 0 ? 4 : 1;
        }
        this.mMaxConnectionPoolSize = i;
        Log.m84624i(TAG, "Max connection pool size is %d.", Integer.valueOf(i));
    }

    private void throwIfClosedLocked() {
        if (this.mIsOpen) {
            return;
        }
        qkq0.m175383a("Cannot perform this operation because the connection pool has been closed.");
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(sQLiteConnectionRemove, i);
            return sQLiteConnectionRemove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(sQLiteConnectionOpenConnectionLocked, i);
        return sQLiteConnectionOpenConnectionLocked;
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(sQLiteConnectionOpenConnectionLocked, i);
        return sQLiteConnectionOpenConnectionLocked;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
    
        if (r2 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        r14 = r13 - r1.mStartTime;
        logConnectionPoolBusy(r2, r14, r26);
        r3 = r24.mDB.get();
        r11 = r24.mTraceCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        if (r3 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        if (r11 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        r4 = r2.activeSql;
        r2 = r2.activeTransactions;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e7, code lost:
    
        r11.onConnectionPoolBusy(r3, r25, r14, r5, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ed, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r17v3, types: [long] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.tencent.wcdb.database.SQLiteConnectionPool] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.tencent.wcdb.support.CancellationSignal] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.tencent.wcdb.support.CancellationSignal$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionPoolBusyInfo] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.wcdb.support.CancellationSignal$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r2v8, types: [long] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.wcdb.database.SQLiteConnection waitForConnection(java.lang.String r25, int r26, com.tencent.wcdb.support.CancellationSignal r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnectionPool.waitForConnection(java.lang.String, int, com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.database.SQLiteConnection");
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnectionTryAcquirePrimaryConnectionLocked;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnectionTryAcquirePrimaryConnectionLocked = null;
                    } else {
                        sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnectionTryAcquirePrimaryConnectionLocked == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnectionTryAcquirePrimaryConnectionLocked == null && !z2 && (sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnectionTryAcquirePrimaryConnectionLocked != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnectionTryAcquirePrimaryConnectionLocked;
                    } else if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.mException = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public SQLiteConnection acquireConnection(String str, int i, CancellationSignal cancellationSignal) throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis();
        DBErrorMonitor.trackAcquireConnection();
        SQLiteConnection sQLiteConnectionWaitForConnection = waitForConnection(str, i, cancellationSignal);
        SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace != null) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            SQLiteDatabase sQLiteDatabase = this.mDB.get();
            if (sQLiteDatabase != null) {
                sQLiteTrace.onConnectionObtained(sQLiteDatabase, str, jUptimeMillis2, (i & 2) != 0);
            }
        }
        return sQLiteConnectionWaitForConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dispose(false);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            try {
                SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
                if (sQLiteConnection != null) {
                    sQLiteConnection.collectDbStats(arrayList);
                }
                Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
                while (it.hasNext()) {
                    it.next().collectDbStats(arrayList);
                }
                Iterator<SQLiteConnection> it2 = this.mAcquiredConnections.keySet().iterator();
                while (it2.hasNext()) {
                    it2.next().collectDbStatsUnsafe(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        Printer printerCreate = PrefixPrinter.create(printer, "    ");
        synchronized (this.mLock) {
            try {
                printer.println("Connection pool for " + this.mConfiguration.path + ":");
                StringBuilder sb = new StringBuilder("  Open: ");
                sb.append(this.mIsOpen);
                printer.println(sb.toString());
                printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
                printer.println("  Available primary connection:");
                SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
                if (sQLiteConnection != null) {
                    sQLiteConnection.dump(printerCreate, z);
                } else {
                    printerCreate.println("<none>");
                }
                printer.println("  Available non-primary connections:");
                int i = 0;
                if (this.mAvailableNonPrimaryConnections.isEmpty()) {
                    printerCreate.println("<none>");
                } else {
                    int size = this.mAvailableNonPrimaryConnections.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.mAvailableNonPrimaryConnections.get(i2).dump(printerCreate, z);
                    }
                }
                printer.println("  Acquired connections:");
                if (this.mAcquiredConnections.isEmpty()) {
                    printerCreate.println("<none>");
                } else {
                    for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                        entry.getKey().dump(printerCreate, z);
                        printerCreate.println("  Status: " + entry.getValue());
                    }
                }
                printer.println("  Connection waiters:");
                if (this.mConnectionWaiterQueue != null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                    while (connectionWaiter != null) {
                        printerCreate.println(i + ": waited for " + (jUptimeMillis - connectionWaiter.mStartTime) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                        connectionWaiter = connectionWaiter.mNext;
                        i++;
                    }
                } else {
                    printerCreate.println("<none>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject dumpJSON(boolean z) throws JSONException {
        JSONObject jSONObjectPut;
        synchronized (this.mLock) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                jSONObjectPut = new JSONObject().put("path", this.mConfiguration.path).put("open", this.mIsOpen).put("maxConn", this.mMaxConnectionPoolSize).put("availablePrimary", (Object) null).put("availableNonPrimary", jSONArray).put("acquired", jSONArray2).put("waiters", jSONArray3);
                Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().dumpJSON(z));
                }
                for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                    jSONArray2.put(entry.getKey().dumpJSON(z).put(NotificationCompat.CATEGORY_STATUS, entry.getValue().toString()));
                }
                for (ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue; connectionWaiter != null; connectionWaiter = connectionWaiter.mNext) {
                    jSONArray3.put(new JSONObject().put(BLiveOperationTitleShowType.duration, SystemClock.uptimeMillis() - connectionWaiter.mStartTime).put("thread", connectionWaiter.mThread.toString()).put("priority", connectionWaiter.mPriority).put("sql", connectionWaiter.mSql));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObjectPut;
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public SQLiteChangeListener getChangeListener() {
        return this.mChangeListener;
    }

    public SQLiteCheckpointListener getCheckpointListener() {
        return this.mCheckpointListener;
    }

    public SQLiteTrace getTraceCallback() {
        return this.mTraceCallback;
    }

    public void notifyChanges(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        SQLiteChangeListener sQLiteChangeListener = this.mChangeListener;
        if (sQLiteChangeListener == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteChangeListener.onChange(sQLiteDatabase, str, str2, jArr, jArr2, jArr3);
    }

    public void notifyCheckpoint(String str, int i) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        SQLiteCheckpointListener sQLiteCheckpointListener = this.mCheckpointListener;
        if (sQLiteCheckpointListener == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteCheckpointListener.onWALCommit(sQLiteDatabase, str, i);
    }

    public void onConnectionLeaked() {
        Log.m84627w(TAG, "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.mConnectionLeaked.set(true);
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            ig3.m135964a("configuration must not be null.");
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                boolean z = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0;
                if (z) {
                    if (!this.mAcquiredConnections.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                }
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled && !this.mAcquiredConnections.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
                if (((sQLiteDatabaseConfiguration2.openFlags ^ sQLiteDatabaseConfiguration.openFlags) & OPEN_FLAG_REOPEN_MASK) == 0 && DatabaseUtils.objectEquals(sQLiteDatabaseConfiguration2.vfsName, sQLiteDatabaseConfiguration.vfsName) && sQLiteDatabaseConfiguration.extensions.containsAll(this.mConfiguration.extensions)) {
                    this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked(0);
                    closeExcessConnectionsAndLogExceptionsLocked();
                    reconfigureAllConnectionsLocked();
                } else {
                    if (z) {
                        closeAvailableConnectionsAndLogExceptionsLocked();
                    }
                    SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                    closeAvailableConnectionsAndLogExceptionsLocked();
                    discardAcquiredConnectionsLocked();
                    this.mAvailablePrimaryConnection = sQLiteConnectionOpenConnectionLocked;
                    this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked(0);
                }
                wakeConnectionWaitersLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
        DBErrorMonitor.trackReleaseConnection();
        synchronized (this.mLock) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatusRemove = this.mAcquiredConnections.remove(sQLiteConnection);
                if (acquiredConnectionStatusRemove == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.mIsOpen) {
                    closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                } else if (sQLiteConnection.isPrimaryConnection()) {
                    if (recycleConnectionLocked(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.mAvailablePrimaryConnection = sQLiteConnection;
                    }
                    wakeConnectionWaitersLocked();
                } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                    closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                } else {
                    if (recycleConnectionLocked(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                    }
                    wakeConnectionWaitersLocked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
        boolean z2 = sQLiteChangeListener != null;
        if (!z2) {
            z = false;
        }
        synchronized (this.mLock) {
            try {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
                if (sQLiteDatabaseConfiguration.updateNotificationEnabled != z2 || sQLiteDatabaseConfiguration.updateNotificationRowID != z) {
                    sQLiteDatabaseConfiguration.updateNotificationEnabled = z2;
                    sQLiteDatabaseConfiguration.updateNotificationRowID = z;
                    closeExcessConnectionsAndLogExceptionsLocked();
                    reconfigureAllConnectionsLocked();
                }
                this.mChangeListener = sQLiteChangeListener;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCheckpointListener(SQLiteCheckpointListener sQLiteCheckpointListener) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onDetach(sQLiteDatabase);
        }
        this.mCheckpointListener = sQLiteCheckpointListener;
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onAttach(sQLiteDatabase);
        }
    }

    public void setTraceCallback(SQLiteTrace sQLiteTrace) {
        this.mTraceCallback = sQLiteTrace;
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            try {
                if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.mIsOpen) {
                    return false;
                }
                return isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    public void traceExecute(String str, int i, long j) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteTrace.onSQLExecuted(sQLiteDatabase, str, i, j);
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        return open(sQLiteDatabase, sQLiteDatabaseConfiguration, bArr, sQLiteCipherSpec, 1);
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
    }
}
