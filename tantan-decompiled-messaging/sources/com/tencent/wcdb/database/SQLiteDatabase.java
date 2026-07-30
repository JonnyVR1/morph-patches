package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Printer;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.DefaultDatabaseErrorHandler;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ig3;
import p149l.qkq0;
import p149l.r2j;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDatabase extends SQLiteClosable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_IO_TRACE = 256;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final int SYNCHRONOUS_EXTRA = 3;
    public static final int SYNCHRONOUS_FULL = 2;
    public static final int SYNCHRONOUS_NORMAL = 1;
    public static final int SYNCHRONOUS_OFF = 0;
    private static final String TAG = "WCDB.SQLiteDatabase";
    private static final WeakHashMap<SQLiteDatabase, Object> sActiveDatabases;
    private final SQLiteDatabaseConfiguration mConfigurationLocked;
    private SQLiteConnectionPool mConnectionPoolLocked;
    private final CursorFactory mCursorFactory;
    private final DatabaseErrorHandler mErrorHandler;
    private boolean mHasAttachedDbsLocked;
    private final ThreadLocal<SQLiteSession> mThreadSession = new ThreadLocal<SQLiteSession>() { // from class: com.tencent.wcdb.database.SQLiteDatabase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.createSession();
        }
    };
    private final Object mLock = new Object();

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram);

        SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal);
    }

    public interface CustomFunction {
        void callback(String[] strArr);
    }

    static {
        SQLiteGlobal.loadLib();
        sActiveDatabases = new WeakHashMap<>();
        CONFLICT_VALUES = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    private SQLiteDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        this.mCursorFactory = cursorFactory;
        this.mErrorHandler = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler(true) : databaseErrorHandler;
        this.mConfigurationLocked = new SQLiteDatabaseConfiguration(str, i);
    }

    private void beginTransaction(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        acquireReference();
        try {
            getThreadSession().beginTransaction(z ? 2 : 1, sQLiteTransactionListener, getThreadDefaultConnectionFlags(false), null);
        } finally {
            releaseReference();
        }
    }

    private void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            try {
                SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
                if (sQLiteConnectionPool != null) {
                    sQLiteConnectionPool.collectDbStats(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory) {
        return openDatabase(":memory:", cursorFactory, 268435456);
    }

    public static boolean deleteDatabase(File file) {
        if (file == null) {
            ig3.m135964a("file must not be null");
            return false;
        }
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: com.tencent.wcdb.database.SQLiteDatabase.2
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    private void dispose(boolean z) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            sQLiteConnectionPool = this.mConnectionPoolLocked;
            this.mConnectionPoolLocked = null;
        }
        if (z) {
            return;
        }
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            weakHashMap.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    public static void dumpAll(Printer printer, boolean z) {
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().dump(printer, z);
        }
    }

    public static JSONArray dumpAllJSON(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().dumpJSON(z));
        }
        return jSONArray;
    }

    private int executeSql(String str, Object[] objArr, CancellationSignal cancellationSignal) throws SQLException {
        boolean z;
        acquireReference();
        try {
            if (DatabaseUtils.getSqlStatementType(str) == 3) {
                synchronized (this.mLock) {
                    try {
                        if (this.mHasAttachedDbsLocked) {
                            z = false;
                        } else {
                            z = true;
                            this.mHasAttachedDbsLocked = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    disableWriteAheadLogging();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete(cancellationSignal);
                sQLiteStatement.close();
                releaseReference();
                return iExecuteUpdateDelete;
            } catch (Throwable th2) {
                sQLiteStatement.close();
                throw th2;
            }
        } catch (Throwable th3) {
            releaseReference();
            throw th3;
        }
    }

    public static String findEditTable(String str) {
        if (TextUtils.isEmpty(str)) {
            qkq0.m175383a("Invalid tables");
            return null;
        }
        int iIndexOf = str.indexOf(32);
        int iIndexOf2 = str.indexOf(44);
        if (iIndexOf > 0 && (iIndexOf < iIndexOf2 || iIndexOf2 < 0)) {
            return str.substring(0, iIndexOf);
        }
        if (iIndexOf2 > 0) {
            return (iIndexOf2 < iIndexOf || iIndexOf < 0) ? str.substring(0, iIndexOf2) : str;
        }
        return str;
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            arrayList.addAll(weakHashMap.keySet());
        }
        return arrayList;
    }

    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().collectDbStats(arrayList);
        }
        return arrayList;
    }

    private static boolean isMainThread() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null && looperMyLooper == Looper.getMainLooper();
    }

    private boolean isReadOnlyLocked() {
        return (this.mConfigurationLocked.openFlags & 1) == 1;
    }

    private Set<String> keySet(ContentValues contentValues) {
        return contentValues.keySet();
    }

    private void open(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        try {
            try {
                openInner(bArr, sQLiteCipherSpec, i);
            } catch (SQLiteDatabaseCorruptException unused) {
                onCorruption();
                openInner(bArr, sQLiteCipherSpec, i);
            }
        } catch (SQLiteException e) {
            Log.m84620e(TAG, "Failed to open database '" + getLabel() + "'.", e);
            close();
            throw e;
        }
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, i, databaseErrorHandler, 0);
    }

    private void openInner(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        synchronized (this.mLock) {
            this.mConnectionPoolLocked = SQLiteConnectionPool.open(this, this.mConfigurationLocked, bArr, sQLiteCipherSpec, i);
        }
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, boolean z) {
        return openDatabase(str, null, null, cursorFactory, z ? 805306368 : 268435456, null, 0);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory) {
        return openDatabase(str, null, null, cursorFactory, 805306368, null, 0);
    }

    public static SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(CursorFactory cursorFactory) {
        return openDatabase(":memory:", null, null, cursorFactory, 805306368, null, 0);
    }

    public static int releaseMemory() {
        return SQLiteGlobal.releaseMemory();
    }

    private void throwIfNotOpenLocked() {
        if (this.mConnectionPoolLocked != null) {
            return;
        }
        r2j.m177608a("The database '", this.mConfigurationLocked.label, "' is not open.");
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        acquireReference();
        try {
            return getThreadSession().yieldTransaction(j, z, null);
        } finally {
            releaseReference();
        }
    }

    public long acquireNativeConnectionHandle(String str, boolean z, boolean z2) {
        if (str == null) {
            str = "unnamedNative";
        }
        int i = z ? 1 : 2;
        if (z2) {
            i |= 4;
        }
        long nativeHandle = getThreadSession().acquireConnectionForNativeHandle(i).getNativeHandle(str);
        if (nativeHandle != 0) {
            return nativeHandle;
        }
        qkq0.m175383a("SQLiteConnection native handle not initialized.");
        return 0L;
    }

    public void addExtension(SQLiteExtension sQLiteExtension) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (this.mConfigurationLocked.extensions.add(sQLiteExtension)) {
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.extensions.remove(sQLiteExtension);
                    throw e;
                }
            }
        }
    }

    public void beginTransactionNonExclusive() {
        beginTransaction(null, false);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, true);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, false);
    }

    public SQLiteStatement compileStatement(String str) throws SQLException {
        acquireReference();
        try {
            return new SQLiteStatement(this, str, null);
        } finally {
            releaseReference();
        }
    }

    public SQLiteSession createSession() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            sQLiteConnectionPool = this.mConnectionPoolLocked;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    public int delete(String str, String str2, String[] strArr) {
        String str3;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " WHERE " + str2;
            }
            sb.append(str3);
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), strArr);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                sQLiteStatement.close();
                releaseReference();
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                sQLiteStatement.close();
                throw th;
            }
        } catch (Throwable th2) {
            releaseReference();
            throw th2;
        }
    }

    public void disableWriteAheadLogging() {
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                int i = sQLiteDatabaseConfiguration.openFlags;
                if ((i & 536870912) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.openFlags = i & (-536870913);
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.openFlags |= 536870912;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            try {
                SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
                if (sQLiteConnectionPool != null) {
                    sQLiteConnectionPool.dump(printer, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject dumpJSON(boolean z) throws JSONException {
        synchronized (this.mLock) {
            try {
                SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
                if (sQLiteConnectionPool != null) {
                    return sQLiteConnectionPool.dumpJSON(z);
                }
                return new JSONObject();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean enableWriteAheadLogging() {
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                if ((this.mConfigurationLocked.openFlags & 536870912) != 0) {
                    return true;
                }
                if (isReadOnlyLocked()) {
                    return false;
                }
                if (this.mConfigurationLocked.isInMemoryDb()) {
                    Log.m84623i(TAG, "can't enable WAL for memory databases.");
                    return false;
                }
                if (this.mHasAttachedDbsLocked) {
                    Log.m84623i(TAG, "this database: " + this.mConfigurationLocked.label + " has attached databases. can't  enable WAL.");
                    return false;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                sQLiteDatabaseConfiguration.openFlags |= 536870912;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                    return true;
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.openFlags &= -536870913;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void endTransaction() {
        acquireReference();
        try {
            getThreadSession().endTransaction(null);
        } finally {
            releaseReference();
        }
    }

    public void execSQL(String str) throws SQLException {
        executeSql(str, null, null);
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public boolean getAsyncCheckpointEnabled() {
        SQLiteCheckpointListener checkpointCallback = getCheckpointCallback();
        return checkpointCallback != null && (checkpointCallback instanceof SQLiteAsyncCheckpointer);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            try {
                Cursor cursorRawQuery = null;
                if (this.mConnectionPoolLocked == null) {
                    return null;
                }
                if (!this.mHasAttachedDbsLocked) {
                    arrayList.add(new Pair(BLiveTraceServerLocation.main, this.mConfigurationLocked.path));
                    return arrayList;
                }
                acquireReference();
                try {
                    try {
                        cursorRawQuery = rawQuery("pragma database_list;", null);
                        while (cursorRawQuery.moveToNext()) {
                            arrayList.add(new Pair(cursorRawQuery.getString(1), cursorRawQuery.getString(2)));
                        }
                        cursorRawQuery.close();
                        releaseReference();
                        return arrayList;
                    } catch (Throwable th) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    releaseReference();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public SQLiteChangeListener getChangeListener() {
        SQLiteChangeListener changeListener;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            changeListener = this.mConnectionPoolLocked.getChangeListener();
        }
        return changeListener;
    }

    public SQLiteCheckpointListener getCheckpointCallback() {
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                if (!this.mConfigurationLocked.customWALHookEnabled) {
                    return null;
                }
                return this.mConnectionPoolLocked.getCheckpointListener();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getLabel() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.label;
        }
        return str;
    }

    public long getMaximumSize() {
        return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", null) * getPageSize();
    }

    public long getPageSize() {
        return DatabaseUtils.longForQuery(this, "PRAGMA page_size;", null);
    }

    public final String getPath() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.path;
        }
        return str;
    }

    @Deprecated
    public Map<String, String> getSyncedTables() {
        return new HashMap(0);
    }

    public int getSynchronousMode() {
        int i;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            i = this.mConfigurationLocked.synchronousMode;
        }
        return i;
    }

    public int getThreadDefaultConnectionFlags(boolean z) {
        int i = z ? 1 : 2;
        return isMainThread() ? i | 4 : i;
    }

    public SQLiteSession getThreadSession() {
        return this.mThreadSession.get();
    }

    public SQLiteTrace getTraceCallback() {
        SQLiteTrace traceCallback;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            traceCallback = this.mConnectionPoolLocked.getTraceCallback();
        }
        return traceCallback;
    }

    public int getVersion() {
        return Long.valueOf(DatabaseUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
    }

    public boolean inTransaction() {
        acquireReference();
        try {
            return getThreadSession().hasTransaction();
        } finally {
            releaseReference();
        }
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLException e2) {
            Log.m84620e(TAG, "Error inserting %s: %s", contentValues, e2);
            return -1L;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        Object[] objArr;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            int i2 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new Object[size];
                int i3 = 0;
                for (String str3 : keySet(contentValues)) {
                    sb.append(i3 > 0 ? Constants.SEPARATOR_COMMA : "");
                    sb.append(str3);
                    objArr[i3] = contentValues.get(str3);
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                while (i2 < size) {
                    sb.append(i2 > 0 ? ",?" : "?");
                    i2++;
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
                objArr = null;
            }
            sb.append(')');
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            try {
                long jExecuteInsert = sQLiteStatement.executeInsert();
                sQLiteStatement.close();
                releaseReference();
                return jExecuteInsert;
            } catch (Throwable th) {
                sQLiteStatement.close();
                throw th;
            }
        } catch (Throwable th2) {
            releaseReference();
            throw th2;
        }
    }

    public boolean isDatabaseIntegrityOk() {
        List<Pair<String, String>> arrayList;
        acquireReference();
        try {
            try {
                arrayList = getAttachedDbs();
                if (arrayList == null) {
                    throw new IllegalStateException("databaselist for: " + getPath() + " couldn't be retrieved. probably because the database is closed");
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    Pair<String, String> pair = arrayList.get(i);
                    SQLiteStatement sQLiteStatementCompileStatement = null;
                    try {
                        sQLiteStatementCompileStatement = compileStatement("PRAGMA " + ((String) pair.first) + ".integrity_check(1);");
                        String strSimpleQueryForString = sQLiteStatementCompileStatement.simpleQueryForString();
                        if (!DatabaseUtils.objectEquals(strSimpleQueryForString, "ok")) {
                            Log.m84619e(TAG, "PRAGMA integrity_check on " + ((String) pair.second) + " returned: " + strSimpleQueryForString);
                            sQLiteStatementCompileStatement.close();
                            releaseReference();
                            return false;
                        }
                        sQLiteStatementCompileStatement.close();
                    } catch (Throwable th) {
                        if (sQLiteStatementCompileStatement != null) {
                            sQLiteStatementCompileStatement.close();
                        }
                        throw th;
                    }
                }
                releaseReference();
                return true;
            } catch (SQLiteException unused) {
                arrayList = new ArrayList<>();
                arrayList.add(new Pair<>(BLiveTraceServerLocation.main, getPath()));
            }
        } catch (Throwable th2) {
            releaseReference();
            throw th2;
        }
        releaseReference();
        throw th2;
    }

    public boolean isDbLockedByCurrentThread() {
        acquireReference();
        try {
            return getThreadSession().hasConnection();
        } finally {
            releaseReference();
        }
    }

    @Deprecated
    public boolean isDbLockedByOtherThreads() {
        return false;
    }

    public boolean isInMemoryDatabase() {
        boolean zIsInMemoryDb;
        synchronized (this.mLock) {
            zIsInMemoryDb = this.mConfigurationLocked.isInMemoryDb();
        }
        return zIsInMemoryDb;
    }

    public boolean isOpen() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnectionPoolLocked != null;
        }
        return z;
    }

    public boolean isReadOnly() {
        boolean zIsReadOnlyLocked;
        synchronized (this.mLock) {
            zIsReadOnlyLocked = isReadOnlyLocked();
        }
        return zIsReadOnlyLocked;
    }

    public boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            z = (this.mConfigurationLocked.openFlags & 536870912) != 0;
        }
        return z;
    }

    @Deprecated
    public void markTableSyncable(String str, String str2) {
    }

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose(false);
    }

    public void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        return queryWithFactory(null, z, str, strArr, str2, objArr, str3, str4, str5, str6, cancellationSignal);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), objArr, findEditTable(str), cancellationSignal);
        } finally {
            releaseReference();
        }
    }

    public Cursor rawQuery(String str, Object[] objArr) {
        return rawQueryWithFactory(null, str, objArr, null, null);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2, CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.mCursorFactory;
            }
            return sQLiteDirectCursorDriver.query(cursorFactory, objArr);
        } finally {
            releaseReference();
        }
    }

    public void releaseNativeConnection(long j, Exception exc) {
        getThreadSession().releaseConnectionForNativeHandle(exc);
    }

    public void reopenReadWrite() {
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                if (isReadOnlyLocked()) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                    int i = sQLiteDatabaseConfiguration.openFlags;
                    sQLiteDatabaseConfiguration.openFlags = i & (-2);
                    try {
                        this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e) {
                        this.mConfigurationLocked.openFlags = i;
                        throw e;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLException e2) {
            Log.m84620e(TAG, "Error inserting " + contentValues, e2);
            return -1L;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void setAsyncCheckpointEnabled(boolean z) {
        setCheckpointCallback(z ? new SQLiteAsyncCheckpointer() : null);
    }

    public void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setChangeListener(sQLiteChangeListener, z);
        }
    }

    public void setCheckpointCallback(SQLiteCheckpointListener sQLiteCheckpointListener) {
        boolean z = sQLiteCheckpointListener != null;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            if (sQLiteDatabaseConfiguration.customWALHookEnabled != z) {
                sQLiteDatabaseConfiguration.customWALHookEnabled = z;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.customWALHookEnabled = true ^ z;
                    throw e;
                }
            }
            this.mConnectionPoolLocked.setCheckpointListener(sQLiteCheckpointListener);
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled == z) {
                    return;
                }
                sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled = z;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.foreignKeyConstraintsEnabled = !z;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setLocale(Locale locale) {
        if (locale == null) {
            ig3.m135964a("locale must not be null.");
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                Locale locale2 = sQLiteDatabaseConfiguration.locale;
                sQLiteDatabaseConfiguration.locale = locale;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.locale = locale2;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public void setLockingEnabled(boolean z) {
    }

    public void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            qkq0.m175383a("expected value between 0 and 100");
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfNotOpenLocked();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                int i2 = sQLiteDatabaseConfiguration.maxSqlCacheSize;
                sQLiteDatabaseConfiguration.maxSqlCacheSize = i;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.maxSqlCacheSize = i2;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long setMaximumSize(long j) {
        long pageSize = getPageSize();
        long j2 = j / pageSize;
        if (j % pageSize != 0) {
            j2++;
        }
        return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = " + j2, null) * pageSize;
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void setSynchronousMode(int i) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i2 = sQLiteDatabaseConfiguration.synchronousMode;
            if (i2 != i) {
                sQLiteDatabaseConfiguration.synchronousMode = i;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.synchronousMode = i2;
                    throw e;
                }
            }
        }
    }

    public void setTraceCallback(SQLiteTrace sQLiteTrace) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setTraceCallback(sQLiteTrace);
        }
    }

    public void setTransactionSuccessful() {
        acquireReference();
        try {
            getThreadSession().setTransactionSuccessful();
        } finally {
            releaseReference();
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        int i2 = 0;
        if (contentValues == null || contentValues.size() == 0) {
            ig3.m135964a("Empty values");
            return 0;
        }
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            Object[] objArr = new Object[length];
            for (String str3 : keySet(contentValues)) {
                sb.append(i2 > 0 ? Constants.SEPARATOR_COMMA : "");
                sb.append(str3);
                objArr[i2] = contentValues.get(str3);
                sb.append("=?");
                i2++;
            }
            if (strArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr[i3] = strArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                sQLiteStatement.close();
                releaseReference();
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                sQLiteStatement.close();
                throw th;
            }
        } catch (Throwable th2) {
            releaseReference();
            throw th2;
        }
    }

    public Pair<Integer, Integer> walCheckpoint(String str, boolean z) {
        acquireReference();
        try {
            return getThreadSession().walCheckpoint(str, z ? 2 : 0);
        } finally {
            releaseReference();
        }
    }

    @Deprecated
    public boolean yieldIfContended() {
        return yieldIfContendedHelper(false, -1L);
    }

    public boolean yieldIfContendedSafely() {
        return yieldIfContendedHelper(true, -1L);
    }

    @Deprecated
    public void markTableSyncable(String str, String str2, String str3) {
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        executeSql(str, objArr, null);
    }

    public void execSQL(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        executeSql(str, objArr, cancellationSignal);
    }

    public boolean yieldIfContendedSafely(long j) {
        return yieldIfContendedHelper(true, j);
    }

    public Cursor rawQuery(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        return rawQueryWithFactory(null, str, objArr, null, cancellationSignal);
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, int i2) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i, cursorFactory, databaseErrorHandler);
        sQLiteDatabase.open(bArr, sQLiteCipherSpec, i2);
        return sQLiteDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, null, null, cursorFactory, 805306368, null, i);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cursorFactory, i, null);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, null, null, cursorFactory, i, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, null, 0);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, int i2) {
        return openDatabase(str, null, null, cursorFactory, i, databaseErrorHandler, i2);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(file.getPath(), bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, null, null, cursorFactory, 268435456, null, i);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory(null, z, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory) {
        return openDatabase(str, null, null, cursorFactory, 268435456, null, 0);
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file.getPath(), cursorFactory);
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, str6);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2) {
        return rawQueryWithFactory(cursorFactory, str, objArr, str2, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 268435456, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(str, bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(str, bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cursorFactory, 268435456, databaseErrorHandler);
    }

    public void beginTransaction() {
        beginTransaction(null, true);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory(cursorFactory, z, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }
}
