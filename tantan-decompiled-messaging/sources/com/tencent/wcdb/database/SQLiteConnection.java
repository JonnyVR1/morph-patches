package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.Printer;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.LruCache;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
    private static final boolean DEBUG = false;
    private static final String TAG = "WCDB.SQLiteConnection";
    private StackTraceElement[] mAcquiredStack;
    private Thread mAcquiredThread;
    private int mAcquiredTid;
    private long mAcquiredTimestamp;
    private int mCancellationSignalAttachCount;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private int mNativeHandleCount;
    private Operation mNativeOperation;
    private boolean mOnlyAllowReadOnlyOperations;
    private byte[] mPassword;
    private final SQLiteConnectionPool mPool;
    private final PreparedStatementCache mPreparedStatementCache;
    private PreparedStatement mPreparedStatementPool;
    private final OperationLog mRecentOperations = new OperationLog();
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final Pattern TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
    private static final String[] HMAC_ALGO_MAPPING = {"HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512"};
    private static final String[] PBKDF2_ALGO_MAPPING = {"PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512"};

    @SuppressLint({"SimpleDateFormat"})
    public static final class Operation {
        private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        ArrayList<Object> mBindArgs;
        int mCookie;
        long mEndTime;
        Exception mException;
        boolean mFinished;
        String mKind;
        String mSql;
        long mStartTime;
        int mTid;
        int mType;

        private Operation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getFormattedStartTime() {
            return sDateFormat.format(new Date(this.mStartTime));
        }

        private String getStatus() {
            if (this.mFinished) {
                return this.mException != null ? "failed" : "succeeded";
            }
            return "running";
        }

        public void describe(StringBuilder sb, boolean z) {
            ArrayList<Object> arrayList;
            sb.append(this.mKind);
            if (this.mFinished) {
                sb.append(" took ");
                sb.append(this.mEndTime - this.mStartTime);
                sb.append("ms");
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.mStartTime);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(getStatus());
            if (this.mSql != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb.append("\"");
            }
            if (this.mTid > 0) {
                sb.append(", tid=");
                sb.append(this.mTid);
            }
            if (z && (arrayList = this.mBindArgs) != null && arrayList.size() != 0) {
                sb.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.mBindArgs.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb.append("\"");
                        sb.append((String) obj);
                        sb.append("\"");
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append(Constants.AES_SUFFIX);
            }
            Exception exc = this.mException;
            if (exc == null || exc.getMessage() == null) {
                return;
            }
            sb.append(", exception=\"");
            sb.append(this.mException.getMessage());
            sb.append("\"");
        }

        public JSONObject dumpJSON(boolean z) throws JSONException {
            JSONObject jSONObjectPutOpt = new JSONObject().put("start", this.mStartTime).put("kind", this.mKind).put(BLiveOperationTitleShowType.duration, (this.mFinished ? this.mEndTime : System.currentTimeMillis()) - this.mStartTime).put(NotificationCompat.CATEGORY_STATUS, getStatus()).putOpt("sql", this.mSql);
            int i = this.mTid;
            return jSONObjectPutOpt.putOpt("tid", i > 0 ? Integer.valueOf(i) : null).putOpt("exception", this.mException);
        }
    }

    public final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final Operation[] mOperations;

        private OperationLog() {
            this.mOperations = new Operation[20];
        }

        private boolean endOperationDeferLogLocked(Operation operation) {
            if (operation == null) {
                return false;
            }
            operation.mEndTime = System.currentTimeMillis();
            operation.mFinished = true;
            Exception exc = operation.mException;
            if (exc == null || exc.getMessage() == null) {
                return SQLiteDebug.shouldLogSlowQuery(operation.mEndTime - operation.mStartTime);
            }
            return true;
        }

        private Operation getOperationLocked(int i) {
            Operation operation = this.mOperations[i & 255];
            if (operation.mCookie == i) {
                return operation;
            }
            return null;
        }

        private void logOperationLocked(Operation operation, String str) {
            StringBuilder sb = new StringBuilder();
            operation.describe(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            Log.m84623i(SQLiteConnection.TAG, sb.toString());
        }

        private int newOperationCookieLocked(int i) {
            int i2 = this.mGeneration;
            this.mGeneration = i2 + 1;
            return (i2 << 8) | i;
        }

        public Operation beginOperation(String str, String str2, Object[] objArr) {
            Operation operation;
            synchronized (this.mOperations) {
                try {
                    int i = (this.mIndex + 1) % 20;
                    operation = this.mOperations[i];
                    if (operation == null) {
                        operation = new Operation();
                        this.mOperations[i] = operation;
                    } else {
                        operation.mFinished = false;
                        operation.mException = null;
                        ArrayList<Object> arrayList = operation.mBindArgs;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.mStartTime = System.currentTimeMillis();
                    operation.mKind = str;
                    operation.mSql = str2;
                    if (objArr != null) {
                        ArrayList<Object> arrayList2 = operation.mBindArgs;
                        if (arrayList2 == null) {
                            operation.mBindArgs = new ArrayList<>();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.mBindArgs.add(obj);
                            } else {
                                operation.mBindArgs.add(SQLiteConnection.EMPTY_BYTE_ARRAY);
                            }
                        }
                    }
                    operation.mCookie = newOperationCookieLocked(i);
                    operation.mTid = SQLiteConnection.this.mAcquiredTid;
                    this.mIndex = i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return operation;
        }

        public String describeCurrentOperation() {
            synchronized (this.mOperations) {
                try {
                    Operation operation = this.mOperations[this.mIndex];
                    if (operation == null || operation.mFinished) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    operation.describe(sb, false);
                    return sb.toString();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void dump(Printer printer, boolean z) {
            synchronized (this.mOperations) {
                try {
                    printer.println("  Most recently executed operations:");
                    int i = this.mIndex;
                    Operation operation = this.mOperations[i];
                    if (operation != null) {
                        int i2 = 0;
                        do {
                            StringBuilder sb = new StringBuilder();
                            sb.append("    ");
                            sb.append(i2);
                            sb.append(": [");
                            sb.append(operation.getFormattedStartTime());
                            sb.append("] ");
                            operation.describe(sb, z);
                            printer.println(sb.toString());
                            i = i > 0 ? i - 1 : 19;
                            i2++;
                            operation = this.mOperations[i];
                            if (operation == null) {
                                break;
                            }
                        } while (i2 < 20);
                    } else {
                        printer.println("    <none>");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public JSONArray dumpJSON(boolean z) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            synchronized (this.mOperations) {
                try {
                    int i = this.mIndex;
                    int i2 = 0;
                    while (true) {
                        Operation operation = this.mOperations[i];
                        if (operation == null) {
                            break;
                        }
                        int i3 = i2 + 1;
                        if (i2 >= 20) {
                            break;
                        }
                        jSONArray.put(operation.dumpJSON(z));
                        i = i > 0 ? i - 1 : 19;
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jSONArray;
        }

        public void endOperation(int i) {
            String str;
            String str2;
            int i2;
            long j;
            synchronized (this.mOperations) {
                try {
                    Operation operationLocked = getOperationLocked(i);
                    if (endOperationDeferLogLocked(operationLocked)) {
                        logOperationLocked(operationLocked, null);
                    }
                    str = operationLocked.mSql;
                    str2 = operationLocked.mKind;
                    i2 = operationLocked.mType;
                    j = operationLocked.mEndTime - operationLocked.mStartTime;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if ("prepare".equals(str2)) {
                return;
            }
            SQLiteConnection.this.mPool.traceExecute(str, i2, j);
        }

        public boolean endOperationDeferLog(int i) {
            synchronized (this.mOperations) {
                try {
                    Operation operationLocked = getOperationLocked(i);
                    if (operationLocked == null) {
                        return false;
                    }
                    boolean zEndOperationDeferLogLocked = endOperationDeferLogLocked(operationLocked);
                    String str = operationLocked.mSql;
                    String str2 = operationLocked.mKind;
                    int i2 = operationLocked.mType;
                    long j = operationLocked.mEndTime - operationLocked.mStartTime;
                    if (!"prepare".equals(str2)) {
                        SQLiteConnection.this.mPool.traceExecute(str, i2, j);
                    }
                    return zEndOperationDeferLogLocked;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void failOperation(int i, Exception exc) {
            synchronized (this.mOperations) {
                try {
                    Operation operationLocked = getOperationLocked(i);
                    if (operationLocked != null) {
                        operationLocked.mException = exc;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void logOperation(int i, String str) {
            synchronized (this.mOperations) {
                try {
                    Operation operationLocked = getOperationLocked(i);
                    if (operationLocked != null) {
                        logOperationLocked(operationLocked, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public SQLiteTrace.TraceInfo<String> traceCurrentOperation() {
            synchronized (this.mOperations) {
                try {
                    Operation operation = this.mOperations[this.mIndex];
                    if (operation == null || operation.mFinished) {
                        return null;
                    }
                    return new SQLiteTrace.TraceInfo<>(operation.mSql, operation.mStartTime, operation.mTid);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class PreparedStatement {
        private WeakReference<SQLiteConnection> mConnection;
        private boolean mInCache;
        private boolean mInUse;
        private int mNumParameters;
        private Operation mOperation;
        private PreparedStatement mPoolNext;
        private boolean mReadOnly;
        private String mSql;
        private long mStatementPtr;
        private int mType;

        public PreparedStatement(SQLiteConnection sQLiteConnection) {
            this.mConnection = new WeakReference<>(sQLiteConnection);
        }

        public void attachCancellationSignal(CancellationSignal cancellationSignal) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.attachCancellationSignal(cancellationSignal);
        }

        public void beginOperation(String str, Object[] objArr) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            Operation operationBeginOperation = sQLiteConnection.mRecentOperations.beginOperation(str, this.mSql, objArr);
            this.mOperation = operationBeginOperation;
            operationBeginOperation.mType = this.mType;
        }

        public void bindArguments(Object[] objArr) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.bindArguments(this, objArr);
        }

        public void detachCancellationSignal(CancellationSignal cancellationSignal) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.detachCancellationSignal(cancellationSignal);
        }

        public void endOperation(String str) {
            SQLiteConnection sQLiteConnection;
            if (this.mOperation == null || (sQLiteConnection = this.mConnection.get()) == null) {
                return;
            }
            if (sQLiteConnection.mRecentOperations.endOperationDeferLog(this.mOperation.mCookie)) {
                sQLiteConnection.mRecentOperations.logOperation(this.mOperation.mCookie, str);
            }
            this.mOperation = null;
        }

        public void failOperation(Exception exc) {
            SQLiteConnection sQLiteConnection;
            if (this.mOperation == null || (sQLiteConnection = this.mConnection.get()) == null) {
                return;
            }
            sQLiteConnection.mRecentOperations.failOperation(this.mOperation.mCookie, exc);
        }

        public long getPtr() {
            return this.mStatementPtr;
        }

        public String getSQL() {
            return this.mSql;
        }

        public int getType() {
            return this.mType;
        }

        public boolean isReadOnly() {
            return this.mReadOnly;
        }

        public void reset(boolean z) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.resetStatement(this, z);
        }
    }

    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        public void dump(Printer printer) {
            printer.println("  Prepared statement cache:");
            Map<String, PreparedStatement> mapSnapshot = snapshot();
            if (mapSnapshot.isEmpty()) {
                printer.println("    <none>");
                return;
            }
            int i = 0;
            for (Map.Entry<String, PreparedStatement> entry : mapSnapshot.entrySet()) {
                PreparedStatement value = entry.getValue();
                if (value.mInCache) {
                    printer.println("    " + i + ": statementPtr=0x" + Long.toHexString(value.getPtr()) + ", numParameters=" + value.mNumParameters + ", type=" + value.mType + ", readOnly=" + value.mReadOnly + ", sql=\"" + SQLiteConnection.trimSqlForDisplay(entry.getKey()) + "\"");
                }
                i++;
            }
        }

        @Override // com.tencent.wcdb.support.LruCache
        public void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.mInCache = false;
            if (preparedStatement.mInUse) {
                return;
            }
            SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        this.mPassword = bArr;
        this.mCipher = sQLiteCipherSpec != null ? new SQLiteCipherSpec(sQLiteCipherSpec) : null;
        this.mPool = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConfiguration = sQLiteDatabaseConfiguration2;
        this.mConnectionId = i;
        this.mIsPrimaryConnection = z;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) != 0;
        this.mPreparedStatementCache = new PreparedStatementCache(sQLiteDatabaseConfiguration2.maxSqlCacheSize);
    }

    private void applyBlockGuardPolicy(PreparedStatement preparedStatement) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachCancellationSignal(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i = this.mCancellationSignalAttachCount + 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindArguments(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.mNumParameters) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.mNumParameters + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long ptr = preparedStatement.getPtr();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            int typeOfObject = DatabaseUtils.getTypeOfObject(obj);
            if (typeOfObject == 0) {
                nativeBindNull(this.mConnectionPtr, ptr, i + 1);
            } else if (typeOfObject == 1) {
                nativeBindLong(this.mConnectionPtr, ptr, i + 1, ((Number) obj).longValue());
            } else if (typeOfObject == 2) {
                nativeBindDouble(this.mConnectionPtr, ptr, i + 1, ((Number) obj).doubleValue());
            } else if (typeOfObject != 4) {
                boolean z = obj instanceof Boolean;
                long j = this.mConnectionPtr;
                if (z) {
                    nativeBindLong(j, ptr, i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
                } else {
                    nativeBindString(j, ptr, i + 1, obj.toString());
                }
            } else {
                nativeBindBlob(this.mConnectionPtr, ptr, i + 1, (byte[]) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detachCancellationSignal(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i = this.mCancellationSignalAttachCount - 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    private void dispose(boolean z) {
        if (this.mConnectionPtr != 0) {
            int i = this.mRecentOperations.beginOperation("close", null, null).mCookie;
            try {
                this.mPreparedStatementCache.evictAll();
                nativeClose(this.mConnectionPtr);
                this.mConnectionPtr = 0L;
            } finally {
                this.mRecentOperations.endOperation(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizePreparedStatement(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.getPtr());
        recyclePreparedStatement(preparedStatement);
    }

    private SQLiteDebug.DbStats getMainDbStatsUnsafe(int i, long j, long j2) {
        String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            str = str + " (" + this.mConnectionId + ")";
        }
        return new SQLiteDebug.DbStats(str, j, j2, i, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    }

    private static boolean isCacheable(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatement(long j, long j2, boolean z);

    private static native long nativeSQLiteHandle(long j, boolean z);

    private static native void nativeSetKey(long j, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j);

    private static native long nativeWalCheckpoint(long j, String str);

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.mPool.notifyChanges(str, str2, jArr, jArr2, jArr3);
    }

    private void notifyCheckpoint(String str, int i) {
        this.mPool.notifyCheckpoint(str, i);
    }

    private PreparedStatement obtainPreparedStatement(String str, long j, int i, int i2, boolean z) {
        PreparedStatement preparedStatement = this.mPreparedStatementPool;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            preparedStatement.mPoolNext = null;
            preparedStatement.mInCache = false;
        } else {
            preparedStatement = new PreparedStatement(this);
        }
        preparedStatement.mSql = str;
        preparedStatement.mStatementPtr = j;
        preparedStatement.mNumParameters = i;
        preparedStatement.mType = i2;
        preparedStatement.mReadOnly = z;
        return preparedStatement;
    }

    private void open() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        long jNativeOpen = nativeOpen(sQLiteDatabaseConfiguration.path, sQLiteDatabaseConfiguration.openFlags, sQLiteDatabaseConfiguration.vfsName);
        this.mConnectionPtr = jNativeOpen;
        byte[] bArr = this.mPassword;
        if (bArr != null && bArr.length == 0) {
            this.mPassword = null;
        }
        byte[] bArr2 = this.mPassword;
        if (bArr2 != null) {
            nativeSetKey(jNativeOpen, bArr2);
            setCipherSpec();
        }
        setPageSize();
        setReadOnlyFromConfiguration();
        setForeignKeyModeFromConfiguration();
        setWalModeFromConfiguration();
        setSyncModeFromConfiguration();
        setJournalSizeLimit();
        setCheckpointStrategy();
        setLocaleFromConfiguration();
        long j = WCDBInitializationProbe.apiEnv;
        long jNativeSQLiteHandle = nativeSQLiteHandle(this.mConnectionPtr, true);
        try {
            Iterator<SQLiteExtension> it = this.mConfiguration.extensions.iterator();
            while (it.hasNext()) {
                it.next().initialize(jNativeSQLiteHandle, j);
            }
            nativeSQLiteHandle(this.mConnectionPtr, false);
            setUpdateNotificationFromConfiguration();
        } catch (Throwable th) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            throw th;
        }
    }

    private void recyclePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mSql = null;
        preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetStatement(PreparedStatement preparedStatement, boolean z) {
        nativeResetStatement(this.mConnectionPtr, preparedStatement.getPtr(), z);
    }

    private void setCheckpointStrategy() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        if (this.mConfiguration.customWALHookEnabled) {
            nativeSetWalHook(this.mConnectionPtr);
        } else if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != 100) {
            executeForLong("PRAGMA wal_autocheckpoint=100", null, null);
        }
    }

    private void setCipherSpec() {
        SQLiteCipherSpec sQLiteCipherSpec = this.mCipher;
        if (sQLiteCipherSpec != null) {
            if (sQLiteCipherSpec.kdfIteration != 0) {
                execute("PRAGMA kdf_iter=" + this.mCipher.kdfIteration, null, null);
            }
            execute("PRAGMA cipher_use_hmac=" + this.mCipher.hmacEnabled, null, null);
            if (this.mCipher.hmacAlgorithm != -1) {
                execute("PRAGMA cipher_hmac_algorithm=" + HMAC_ALGO_MAPPING[this.mCipher.hmacAlgorithm], null, null);
            }
            if (this.mCipher.kdfAlgorithm != -1) {
                execute("PRAGMA cipher_kdf_algorithm=" + PBKDF2_ALGO_MAPPING[this.mCipher.kdfAlgorithm], null, null);
            }
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            return;
        }
        long j = this.mConfiguration.foreignKeyConstraintsEnabled ? 1L : 0L;
        if (executeForLong("PRAGMA foreign_keys", null, null) != j) {
            execute("PRAGMA foreign_keys=" + j, null, null);
        }
    }

    private void setJournalMode(String str) {
        String strExecuteForString = executeForString("PRAGMA journal_mode", null, null);
        if (strExecuteForString.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (executeForString("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        Log.m84627w(TAG, "Could not change the database journal mode of '" + this.mConfiguration.label + "' from '" + strExecuteForString + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }

    private void setJournalSizeLimit() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection || executeForLong("PRAGMA journal_size_limit", null, null) == PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            return;
        }
        executeForLong("PRAGMA journal_size_limit=524288", null, null);
    }

    private void setLocaleFromConfiguration() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        int i = sQLiteDatabaseConfiguration.openFlags | 16;
        sQLiteDatabaseConfiguration.openFlags = i;
        if ((i & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.locale.toString();
        nativeRegisterLocalizedCollators(this.mConnectionPtr, string);
        if (this.mIsReadOnlyConnection) {
            return;
        }
        try {
            execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strExecuteForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (strExecuteForString == null || !strExecuteForString.equals(string)) {
                execute("BEGIN", null, null);
                try {
                    execute("DELETE FROM android_metadata", null, null);
                    execute("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    execute("REINDEX LOCALIZED", null, null);
                    execute("COMMIT", null, null);
                } catch (Throwable th) {
                    execute("ROLLBACK", null, null);
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            throw new SQLiteException("Failed to change locale for db '" + this.mConfiguration.label + "' to '" + string + "'.", e);
        }
    }

    private void setPageSize() {
        long j;
        String str;
        int i;
        if (this.mConfiguration.isInMemoryDb()) {
            return;
        }
        if (this.mPassword != null) {
            SQLiteCipherSpec sQLiteCipherSpec = this.mCipher;
            if (sQLiteCipherSpec == null || (i = sQLiteCipherSpec.pageSize) <= 0) {
                i = SQLiteGlobal.defaultPageSize;
            }
            j = i;
            str = "PRAGMA cipher_page_size";
        } else {
            j = SQLiteGlobal.defaultPageSize;
            str = "PRAGMA page_size";
        }
        if (executeForLong(str, null, null) != j) {
            execute(str + "=" + j, null, null);
        }
    }

    private void setReadOnlyFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            execute("PRAGMA query_only = 1", null, null);
        }
    }

    private void setSyncModeFromConfiguration() {
        execute("PRAGMA synchronous=" + this.mConfiguration.synchronousMode, null, null);
    }

    private void setUpdateNotificationFromConfiguration() {
        long j = this.mConnectionPtr;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        nativeSetUpdateNotification(j, sQLiteDatabaseConfiguration.updateNotificationEnabled, sQLiteDatabaseConfiguration.updateNotificationRowID);
    }

    private void setWalModeFromConfiguration() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        setJournalMode((this.mConfiguration.openFlags & 536870912) != 0 ? "WAL" : SQLiteGlobal.defaultJournalMode);
    }

    private void throwIfStatementForbidden(PreparedStatement preparedStatement) {
        if (this.mOnlyAllowReadOnlyOperations && !preparedStatement.mReadOnly) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String trimSqlForDisplay(String str) {
        return TRIM_SQL_PATTERN.matcher(str).replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public PreparedStatement acquirePreparedStatement(String str) {
        boolean z;
        SQLiteConnection sQLiteConnection;
        PreparedStatement preparedStatementObtainPreparedStatement = this.mPreparedStatementCache.get(str);
        if (preparedStatementObtainPreparedStatement == null) {
            z = false;
        } else {
            if (!preparedStatementObtainPreparedStatement.mInUse) {
                preparedStatementObtainPreparedStatement.mInUse = true;
                return preparedStatementObtainPreparedStatement;
            }
            z = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, jNativePrepareStatement);
            int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
            sQLiteConnection = this;
            try {
                preparedStatementObtainPreparedStatement = sQLiteConnection.obtainPreparedStatement(str, jNativePrepareStatement, iNativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, jNativePrepareStatement));
                if (!z && isCacheable(sqlStatementType)) {
                    sQLiteConnection.mPreparedStatementCache.put(str, preparedStatementObtainPreparedStatement);
                    preparedStatementObtainPreparedStatement.mInCache = true;
                }
                preparedStatementObtainPreparedStatement.mInUse = true;
                return preparedStatementObtainPreparedStatement;
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (preparedStatementObtainPreparedStatement != null && preparedStatementObtainPreparedStatement.mInCache) {
                    throw runtimeException;
                }
                nativeFinalizeStatement(sQLiteConnection.mConnectionPtr, jNativePrepareStatement);
                throw runtimeException;
            }
        } catch (RuntimeException e2) {
            e = e2;
            sQLiteConnection = this;
        }
    }

    public void close() {
        dispose(false);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        long jExecuteForLong;
        long jExecuteForLong2;
        long jExecuteForLong3;
        long jExecuteForLong4;
        int iNativeGetDbLookaside = nativeGetDbLookaside(this.mConnectionPtr);
        try {
            jExecuteForLong = executeForLong("PRAGMA page_count;", null, null);
            try {
                jExecuteForLong2 = executeForLong("PRAGMA page_size;", null, null);
            } catch (SQLiteException unused) {
                jExecuteForLong2 = 0;
            }
        } catch (SQLiteException unused2) {
            jExecuteForLong = 0;
        }
        arrayList.add(getMainDbStatsUnsafe(iNativeGetDbLookaside, jExecuteForLong, jExecuteForLong2));
        CursorWindow cursorWindow = new CursorWindow("collectDbStats");
        try {
            try {
                executeForCursorWindow("PRAGMA database_list;", null, cursorWindow, 0, 0, false, null);
                for (int i = 1; i < cursorWindow.getNumRows(); i++) {
                    String string = cursorWindow.getString(i, 1);
                    String string2 = cursorWindow.getString(i, 2);
                    try {
                        jExecuteForLong3 = executeForLong("PRAGMA " + string + ".page_count;", null, null);
                        try {
                            jExecuteForLong4 = executeForLong("PRAGMA " + string + ".page_size;", null, null);
                        } catch (SQLiteException unused3) {
                            jExecuteForLong4 = 0;
                        }
                    } catch (SQLiteException unused4) {
                        jExecuteForLong3 = 0;
                    }
                    long j = jExecuteForLong3;
                    String str = "  (attached) " + string;
                    if (string2.length() != 0) {
                        str = str + ": " + string2;
                    }
                    arrayList.add(new SQLiteDebug.DbStats(str, j, jExecuteForLong4, 0, 0, 0, 0));
                }
            } catch (SQLiteException unused5) {
            }
        } finally {
            cursorWindow.close();
        }
    }

    public void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0L, 0L));
    }

    public String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    public void dump(Printer printer, boolean z) {
        printer.println("Connection #" + this.mConnectionId + ":");
        if (z) {
            printer.println("  connectionPtr: 0x" + Long.toHexString(this.mConnectionPtr));
        }
        printer.println("  isPrimaryConnection: " + this.mIsPrimaryConnection);
        printer.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
        if (this.mAcquiredThread != null) {
            printer.println("  acquiredThread: " + this.mAcquiredThread + " (tid: " + this.mAcquiredTid + ")");
        }
        this.mRecentOperations.dump(printer, z);
        if (z) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    public JSONObject dumpJSON(boolean z) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.mConnectionId).put("ptr", Long.toHexString(this.mConnectionPtr)).put("primary", this.mIsPrimaryConnection).put("readOnly", this.mOnlyAllowReadOnlyOperations);
        Thread thread = this.mAcquiredThread;
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("thread", thread != null ? thread.toString() : null);
        int i = this.mAcquiredTid;
        return jSONObjectPutOpt.putOpt("tid", i > 0 ? Integer.valueOf(i) : null).put("operations", this.mRecentOperations.dumpJSON(z));
    }

    public void endNativeHandle(Exception exc) {
        int i = this.mNativeHandleCount - 1;
        this.mNativeHandleCount = i;
        if (i != 0 || this.mNativeOperation == null) {
            return;
        }
        nativeSQLiteHandle(this.mConnectionPtr, false);
        OperationLog operationLog = this.mRecentOperations;
        if (exc == null) {
            operationLog.endOperationDeferLog(this.mNativeOperation.mCookie);
        } else {
            operationLog.failOperation(this.mNativeOperation.mCookie, exc);
        }
        this.mNativeOperation = null;
    }

    public void execute(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return;
        }
        Operation operationBeginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
        int i = operationBeginOperation.mCookie;
        try {
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(preparedStatementAcquirePreparedStatement);
                    bindArguments(preparedStatementAcquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(preparedStatementAcquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        nativeExecute(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr());
                        detachCancellationSignal(cancellationSignal);
                        releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                        this.mRecentOperations.endOperation(i);
                    } catch (Throwable th) {
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                } catch (Throwable th2) {
                    releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.mRecentOperations.endOperation(i);
                throw th3;
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(i, e);
            throw e;
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0;
        }
        Operation operationBeginOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", str, objArr);
        int i = operationBeginOperation.mCookie;
        try {
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(preparedStatementAcquirePreparedStatement);
                    bindArguments(preparedStatementAcquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(preparedStatementAcquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        int iNativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr());
                        detachCancellationSignal(cancellationSignal);
                        releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                        if (this.mRecentOperations.endOperationDeferLog(i)) {
                            this.mRecentOperations.logOperation(i, "changedRows=" + iNativeExecuteForChangedRowCount);
                        }
                        return iNativeExecuteForChangedRowCount;
                    } catch (Throwable th) {
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                } catch (Throwable th2) {
                    releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                    throw th2;
                }
            } catch (RuntimeException e) {
                this.mRecentOperations.failOperation(i, e);
                throw e;
            }
        } catch (Throwable th3) {
            if (this.mRecentOperations.endOperationDeferLog(i)) {
                this.mRecentOperations.logOperation(i, "changedRows=0");
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x016d A[Catch: all -> 0x00b2, TryCatch #8 {all -> 0x00b2, blocks: (B:6:0x001c, B:23:0x0078, B:25:0x0080, B:69:0x0165, B:71:0x016d, B:72:0x0196), top: B:91:0x001c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x016d, please report this as an issue */
    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, CancellationSignal cancellationSignal) {
        int i3;
        String str2;
        int i4;
        String str3;
        String str4;
        String str5;
        String str6;
        int i5;
        int numRows;
        int i6;
        PreparedStatement preparedStatement;
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0;
        }
        if (cursorWindow == null) {
            ig3.m135964a("window must not be null.");
            return 0;
        }
        cursorWindow.acquireReference();
        try {
            Operation operationBeginOperation = this.mRecentOperations.beginOperation("executeForCursorWindow", str, objArr);
            int i7 = operationBeginOperation.mCookie;
            int i8 = -1;
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(preparedStatementAcquirePreparedStatement);
                    bindArguments(preparedStatementAcquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(preparedStatementAcquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    str2 = "', startPos=";
                    try {
                        try {
                            try {
                                str3 = ", countedRows=";
                                preparedStatement = preparedStatementAcquirePreparedStatement;
                                str5 = ", actualPos=";
                                str2 = str2;
                                i4 = i7;
                                str4 = ", filledRows=";
                                i3 = i;
                                str6 = "window='";
                                try {
                                    long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr(), cursorWindow.mWindowPtr, i3, i2, z);
                                    i6 = (int) (jNativeExecuteForCursorWindow >> 32);
                                    i5 = (int) jNativeExecuteForCursorWindow;
                                    try {
                                        numRows = cursorWindow.getNumRows();
                                        try {
                                            cursorWindow.setStartPosition(i6);
                                            try {
                                                detachCancellationSignal(cancellationSignal);
                                                try {
                                                    releasePreparedStatement(preparedStatement);
                                                    if (this.mRecentOperations.endOperationDeferLog(i4)) {
                                                        this.mRecentOperations.logOperation(i4, str6 + cursorWindow + str2 + i3 + str5 + i6 + str4 + numRows + str3 + i5);
                                                    }
                                                    cursorWindow.releaseReference();
                                                    return i5;
                                                } catch (RuntimeException e) {
                                                    e = e;
                                                    str5 = str5;
                                                    str2 = str2;
                                                    str3 = str3;
                                                    str4 = str4;
                                                    i8 = i6;
                                                    this.mRecentOperations.failOperation(i4, e);
                                                    throw e;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    str5 = str5;
                                                    str2 = str2;
                                                    str3 = str3;
                                                    str4 = str4;
                                                    if (this.mRecentOperations.endOperationDeferLog(i4)) {
                                                        this.mRecentOperations.logOperation(i4, str6 + cursorWindow + str2 + i3 + str5 + i6 + str4 + numRows + str3 + i5);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str5 = str5;
                                                str2 = str2;
                                                str3 = str3;
                                                str4 = str4;
                                                i8 = i6;
                                                try {
                                                    try {
                                                        releasePreparedStatement(preparedStatement);
                                                        throw th;
                                                    } catch (RuntimeException e2) {
                                                        e = e2;
                                                        this.mRecentOperations.failOperation(i4, e);
                                                        throw e;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i6 = i8;
                                                    if (this.mRecentOperations.endOperationDeferLog(i4)) {
                                                        this.mRecentOperations.logOperation(i4, str6 + cursorWindow + str2 + i3 + str5 + i6 + str4 + numRows + str3 + i5);
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            i8 = i6;
                                            try {
                                                detachCancellationSignal(cancellationSignal);
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                releasePreparedStatement(preparedStatement);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        numRows = -1;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    str5 = str5;
                                    str2 = str2;
                                    str3 = str3;
                                    str4 = str4;
                                    i5 = -1;
                                    numRows = -1;
                                    detachCancellationSignal(cancellationSignal);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                str5 = ", actualPos=";
                                str2 = str2;
                                i4 = i7;
                                str4 = ", filledRows=";
                                i3 = i;
                                str6 = "window='";
                                str3 = ", countedRows=";
                                preparedStatement = preparedStatementAcquirePreparedStatement;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            str5 = ", actualPos=";
                            i4 = i7;
                            preparedStatement = preparedStatementAcquirePreparedStatement;
                            str4 = ", filledRows=";
                            str6 = "window='";
                            str3 = ", countedRows=";
                            str2 = str2;
                            i3 = i;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        str5 = ", actualPos=";
                        i4 = i7;
                        i3 = i;
                        str3 = ", countedRows=";
                        preparedStatement = preparedStatementAcquirePreparedStatement;
                        str4 = ", filledRows=";
                        str6 = "window='";
                    }
                } catch (Throwable th11) {
                    th = th11;
                    i3 = i;
                    str2 = "', startPos=";
                    i4 = i7;
                    str3 = ", countedRows=";
                    str5 = ", actualPos=";
                    preparedStatement = preparedStatementAcquirePreparedStatement;
                    str4 = ", filledRows=";
                    str6 = "window='";
                    i5 = -1;
                    numRows = -1;
                }
            } catch (RuntimeException e3) {
                e = e3;
                i3 = i;
                str2 = "', startPos=";
                i4 = i7;
                str3 = ", countedRows=";
                str4 = ", filledRows=";
                str5 = ", actualPos=";
                str6 = "window='";
                i5 = -1;
                numRows = -1;
            } catch (Throwable th12) {
                th = th12;
                i3 = i;
                str2 = "', startPos=";
                i4 = i7;
                str3 = ", countedRows=";
                str4 = ", filledRows=";
                str5 = ", actualPos=";
                str6 = "window='";
                i5 = -1;
                numRows = -1;
                i6 = -1;
            }
        } catch (Throwable th13) {
            cursorWindow.releaseReference();
            throw th13;
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0L;
        }
        Operation operationBeginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
        int i = operationBeginOperation.mCookie;
        try {
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(preparedStatementAcquirePreparedStatement);
                    bindArguments(preparedStatementAcquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(preparedStatementAcquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        long jNativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr());
                        detachCancellationSignal(cancellationSignal);
                        releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                        this.mRecentOperations.endOperation(i);
                        return jNativeExecuteForLastInsertedRowId;
                    } catch (Throwable th) {
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                } catch (Throwable th2) {
                    releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.mRecentOperations.endOperation(i);
                throw th3;
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(i, e);
            throw e;
        }
    }

    public long executeForLong(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return 0L;
        }
        Operation operationBeginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
        int i = operationBeginOperation.mCookie;
        try {
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(preparedStatementAcquirePreparedStatement);
                    bindArguments(preparedStatementAcquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(preparedStatementAcquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        long jNativeExecuteForLong = nativeExecuteForLong(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr());
                        detachCancellationSignal(cancellationSignal);
                        releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                        this.mRecentOperations.endOperation(i);
                        return jNativeExecuteForLong;
                    } catch (Throwable th) {
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                } catch (Throwable th2) {
                    releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.mRecentOperations.endOperation(i);
                throw th3;
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(i, e);
            throw e;
        }
    }

    public String executeForString(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return null;
        }
        Operation operationBeginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
        int i = operationBeginOperation.mCookie;
        try {
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(preparedStatementAcquirePreparedStatement);
                    bindArguments(preparedStatementAcquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(preparedStatementAcquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        String strNativeExecuteForString = nativeExecuteForString(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr());
                        detachCancellationSignal(cancellationSignal);
                        releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                        this.mRecentOperations.endOperation(i);
                        return strNativeExecuteForString;
                    } catch (Throwable th) {
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                } catch (Throwable th2) {
                    releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.mRecentOperations.endOperation(i);
                throw th3;
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(i, e);
            throw e;
        }
    }

    public void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.mPool;
            if (sQLiteConnectionPool != null && this.mConnectionPtr != 0) {
                sQLiteConnectionPool.onConnectionLeaked();
            }
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public int getConnectionId() {
        return this.mConnectionId;
    }

    public long getNativeHandle(String str) {
        if (this.mConnectionPtr == 0) {
            return 0L;
        }
        if (str != null && this.mNativeOperation == null) {
            Operation operationBeginOperation = this.mRecentOperations.beginOperation(str, null, null);
            this.mNativeOperation = operationBeginOperation;
            operationBeginOperation.mType = 99;
        }
        this.mNativeHandleCount++;
        return nativeSQLiteHandle(this.mConnectionPtr, true);
    }

    public boolean isPreparedStatementInCache(String str) {
        return this.mPreparedStatementCache.get(str) != null;
    }

    public boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    public void prepare(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            ig3.m135964a("sql must not be null.");
            return;
        }
        Operation operationBeginOperation = this.mRecentOperations.beginOperation("prepare", str, null);
        int i = operationBeginOperation.mCookie;
        try {
            try {
                PreparedStatement preparedStatementAcquirePreparedStatement = acquirePreparedStatement(str);
                operationBeginOperation.mType = preparedStatementAcquirePreparedStatement.mType;
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.numParameters = preparedStatementAcquirePreparedStatement.mNumParameters;
                        sQLiteStatementInfo.readOnly = preparedStatementAcquirePreparedStatement.mReadOnly;
                        int iNativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr());
                        if (iNativeGetColumnCount == 0) {
                            sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                        } else {
                            sQLiteStatementInfo.columnNames = new String[iNativeGetColumnCount];
                            for (int i2 = 0; i2 < iNativeGetColumnCount; i2++) {
                                sQLiteStatementInfo.columnNames[i2] = nativeGetColumnName(this.mConnectionPtr, preparedStatementAcquirePreparedStatement.getPtr(), i2);
                            }
                        }
                    } catch (Throwable th) {
                        releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                        throw th;
                    }
                }
                releasePreparedStatement(preparedStatementAcquirePreparedStatement);
                this.mRecentOperations.endOperation(i);
            } catch (RuntimeException e) {
                this.mRecentOperations.failOperation(i, e);
                throw e;
            }
        } catch (Throwable th2) {
            this.mRecentOperations.endOperation(i);
            throw th2;
        }
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mOnlyAllowReadOnlyOperations = false;
        long j = WCDBInitializationProbe.apiEnv;
        long jNativeSQLiteHandle = nativeSQLiteHandle(this.mConnectionPtr, true);
        try {
            for (SQLiteExtension sQLiteExtension : sQLiteDatabaseConfiguration.extensions) {
                if (!this.mConfiguration.extensions.contains(sQLiteExtension)) {
                    sQLiteExtension.initialize(jNativeSQLiteHandle, j);
                }
            }
            nativeSQLiteHandle(this.mConnectionPtr, false);
            int i = sQLiteDatabaseConfiguration.openFlags;
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
            boolean z = ((i ^ sQLiteDatabaseConfiguration2.openFlags) & 536870912) != 0;
            boolean z2 = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != sQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled;
            boolean zEquals = sQLiteDatabaseConfiguration.locale.equals(sQLiteDatabaseConfiguration2.locale);
            boolean z3 = sQLiteDatabaseConfiguration.customWALHookEnabled;
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration3 = this.mConfiguration;
            boolean z4 = z3 != sQLiteDatabaseConfiguration3.customWALHookEnabled;
            boolean z5 = sQLiteDatabaseConfiguration.synchronousMode != sQLiteDatabaseConfiguration3.synchronousMode;
            boolean z6 = (sQLiteDatabaseConfiguration.updateNotificationEnabled == sQLiteDatabaseConfiguration3.updateNotificationEnabled && sQLiteDatabaseConfiguration.updateNotificationRowID == sQLiteDatabaseConfiguration3.updateNotificationRowID) ? false : true;
            sQLiteDatabaseConfiguration3.updateParametersFrom(sQLiteDatabaseConfiguration);
            this.mPreparedStatementCache.resize(sQLiteDatabaseConfiguration.maxSqlCacheSize);
            if (z2) {
                setForeignKeyModeFromConfiguration();
            }
            if (z) {
                setWalModeFromConfiguration();
            }
            if (z5) {
                setSyncModeFromConfiguration();
            }
            if (z4) {
                setCheckpointStrategy();
            }
            if (!zEquals) {
                setLocaleFromConfiguration();
            }
            if (z6) {
                setUpdateNotificationFromConfiguration();
            }
        } catch (Throwable th) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            throw th;
        }
    }

    public void releasePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mInUse = false;
        if (!preparedStatement.mInCache) {
            finalizePreparedStatement(preparedStatement);
            return;
        }
        try {
            resetStatement(preparedStatement, true);
        } catch (SQLiteException unused) {
            this.mPreparedStatementCache.remove(preparedStatement.mSql);
        }
    }

    public void setAcquisitionState(boolean z, boolean z2) {
        if (!z) {
            this.mAcquiredThread = null;
            this.mAcquiredTid = 0;
            this.mAcquiredStack = null;
            this.mAcquiredTimestamp = 0L;
            return;
        }
        this.mAcquiredThread = Thread.currentThread();
        this.mAcquiredTid = Process.myTid();
        if (z2) {
            this.mAcquiredStack = this.mAcquiredThread.getStackTrace();
            this.mAcquiredTimestamp = System.currentTimeMillis();
        } else {
            this.mAcquiredStack = null;
            this.mAcquiredTimestamp = 0L;
        }
    }

    public void setOnlyAllowReadOnlyOperations(boolean z) {
        this.mOnlyAllowReadOnlyOperations = z;
    }

    public String toString() {
        return "SQLiteConnection: " + this.mConfiguration.path + " (" + this.mConnectionId + ")";
    }

    public SQLiteTrace.TraceInfo<String> traceCurrentOperationUnsafe() {
        return this.mRecentOperations.traceCurrentOperation();
    }

    public SQLiteTrace.TraceInfo<StackTraceElement[]> tracePersistAcquisitionUnsafe() {
        StackTraceElement[] stackTraceElementArr = this.mAcquiredStack;
        if (stackTraceElementArr == null) {
            return null;
        }
        return new SQLiteTrace.TraceInfo<>(stackTraceElementArr, this.mAcquiredTimestamp, this.mAcquiredTid);
    }

    public Pair<Integer, Integer> walCheckpoint(String str) {
        if (str == null || str.isEmpty()) {
            str = BLiveTraceServerLocation.main;
        }
        long jNativeWalCheckpoint = nativeWalCheckpoint(this.mConnectionPtr, str);
        return new Pair<>(Integer.valueOf((int) (jNativeWalCheckpoint >> 32)), Integer.valueOf((int) (jNativeWalCheckpoint & 4294967295L)));
    }

    public static SQLiteConnection open(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z, bArr, sQLiteCipherSpec);
        try {
            sQLiteConnection.open();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            SQLiteDebug.collectLastIOTraceStats(sQLiteConnection);
            sQLiteConnection.dispose(false);
            throw e;
        }
    }
}
