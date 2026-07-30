package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.support.Log;
import p149l.k250;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final String TAG = "WCDB.SQLiteOpenHelper";
    private SQLiteCipherSpec mCipher;
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mForcedSingleConnection;
    private boolean mIsInitializing;
    private int mMode;
    private final String mName;
    private boolean mNeedMode;
    private final int mNewVersion;
    private byte[] mPassword;

    static {
        SQLiteGlobal.loadLib();
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i < 1) {
            k250.m144273a("Version must be >= 1, was ", i);
            throw null;
        }
        this.mContext = context;
        this.mName = str;
        this.mFactory = cursorFactory;
        this.mNewVersion = i;
        this.mErrorHandler = databaseErrorHandler;
        this.mPassword = bArr;
        this.mCipher = sQLiteCipherSpec != null ? new SQLiteCipherSpec(sQLiteCipherSpec) : null;
        this.mNeedMode = false;
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (this.mIsInitializing) {
            qkq0.m175383a("getDatabase called recursively");
            return null;
        }
        SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
        try {
            this.mIsInitializing = true;
            if (sQLiteDatabase2 == null) {
                String str = this.mName;
                if (str == null) {
                    sQLiteDatabaseOpenDatabase = SQLiteDatabase.create(null);
                } else {
                    boolean z2 = this.mForcedSingleConnection;
                    try {
                        this.mNeedMode = true;
                        int i = this.mEnableWriteAheadLogging ? 8 : 0;
                        this.mMode = i;
                        sQLiteDatabaseOpenDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(this.mContext, str, this.mPassword, this.mCipher, i, this.mFactory, this.mErrorHandler, z2 ? 1 : 0);
                    } catch (SQLiteException e) {
                        if (z) {
                            throw e;
                        }
                        Log.m84620e(TAG, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                        sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.mContext.getDatabasePath(this.mName).getPath(), this.mPassword, this.mCipher, this.mFactory, 1, this.mErrorHandler);
                    }
                }
                sQLiteDatabase2 = sQLiteDatabaseOpenDatabase;
            } else if (z && sQLiteDatabase2.isReadOnly()) {
                sQLiteDatabase2.reopenReadWrite();
            }
            SQLiteDatabase databaseLockedLast = getDatabaseLockedLast(sQLiteDatabase2);
            this.mIsInitializing = false;
            if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.mDatabase) {
                sQLiteDatabase2.close();
            }
            return databaseLockedLast;
        } catch (Throwable th) {
            this.mIsInitializing = false;
            if (sQLiteDatabase2 == null || sQLiteDatabase2 == this.mDatabase) {
                throw th;
            }
            sQLiteDatabase2.close();
            throw th;
        }
    }

    private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase sQLiteDatabase) {
        onConfigure(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        if (version != this.mNewVersion) {
            if (sQLiteDatabase.isReadOnly()) {
                throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
            }
            sQLiteDatabase.beginTransaction();
            try {
                if (version == 0) {
                    onCreate(sQLiteDatabase);
                } else {
                    int i = this.mNewVersion;
                    if (version > i) {
                        onDowngrade(sQLiteDatabase, version, i);
                    } else {
                        onUpgrade(sQLiteDatabase, version, i);
                    }
                }
                sQLiteDatabase.setVersion(this.mNewVersion);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            Log.m84627w(TAG, "Opened " + this.mName + " in read-only mode");
        }
        this.mDatabase = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setForcedSingleConnection(boolean z) {
        synchronized (this) {
            this.mForcedSingleConnection = z;
        }
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            try {
                if (this.mEnableWriteAheadLogging != z) {
                    SQLiteDatabase sQLiteDatabase = this.mDatabase;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                        SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                        if (z) {
                            sQLiteDatabase2.enableWriteAheadLogging();
                        } else {
                            sQLiteDatabase2.disableWriteAheadLogging();
                        }
                    }
                    this.mEnableWriteAheadLogging = z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, bArr, null, cursorFactory, i, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, null, null, cursorFactory, i, databaseErrorHandler);
    }
}
