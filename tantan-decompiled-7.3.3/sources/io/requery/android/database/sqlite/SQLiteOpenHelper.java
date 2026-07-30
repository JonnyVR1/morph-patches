package io.requery.android.database.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import io.requery.android.database.DatabaseErrorHandler;
import p153l.wtq0;
import p153l.za50;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i < 1) {
            za50.m219101a("Version must be >= 1, was ", i);
            throw null;
        }
        this.mContext = context;
        this.mName = str;
        this.mFactory = cursorFactory;
        this.mNewVersion = i;
        this.mErrorHandler = databaseErrorHandler;
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
            wtq0.m207906a("getDatabase called recursively");
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
                    try {
                        sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(createConfiguration(this.mContext.getDatabasePath(str).getPath(), SQLiteDatabase.CREATE_IF_NECESSARY), this.mFactory, this.mErrorHandler);
                    } catch (SQLiteException e) {
                        if (z) {
                            throw e;
                        }
                        Log.e(TAG, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                        sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(createConfiguration(this.mContext.getDatabasePath(this.mName).getPath(), 1), this.mFactory, this.mErrorHandler);
                    }
                }
                sQLiteDatabase2 = sQLiteDatabaseOpenDatabase;
            } else if (z && sQLiteDatabase2.isReadOnly()) {
                sQLiteDatabase2.reopenReadWrite();
            }
            onConfigure(sQLiteDatabase2);
            int version = sQLiteDatabase2.getVersion();
            if (version != this.mNewVersion) {
                if (sQLiteDatabase2.isReadOnly()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase2.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
                }
                sQLiteDatabase2.beginTransaction();
                try {
                    if (version == 0) {
                        onCreate(sQLiteDatabase2);
                    } else {
                        int i = this.mNewVersion;
                        if (version > i) {
                            onDowngrade(sQLiteDatabase2, version, i);
                        } else {
                            onUpgrade(sQLiteDatabase2, version, i);
                        }
                    }
                    sQLiteDatabase2.setVersion(this.mNewVersion);
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabase2.endTransaction();
                    throw th;
                }
            }
            onOpen(sQLiteDatabase2);
            sQLiteDatabase2.isReadOnly();
            this.mDatabase = sQLiteDatabase2;
            this.mIsInitializing = false;
            return sQLiteDatabase2;
        } catch (Throwable th2) {
            this.mIsInitializing = false;
            if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.mDatabase) {
                sQLiteDatabase2.close();
            }
            throw th2;
        }
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

    public SQLiteDatabaseConfiguration createConfiguration(String str, int i) {
        return new SQLiteDatabaseConfiguration(str, i);
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
}
