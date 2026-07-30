package com.tencent.wcdb.database;

import com.google.android.gms.common.api.Api;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteDirectCursor extends AbstractCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteDirectCursor.1
        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteDirectCursor(sQLiteCursorDriver, str, (SQLiteDirectQuery) sQLiteProgram);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteDirectQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private static final String TAG = "WCDB.SQLiteDirectCursor";
    private final String[] mColumns;
    private int mCount;
    private boolean mCountFinished;
    private final SQLiteCursorDriver mDriver;
    private final SQLiteDirectQuery mQuery;

    public SQLiteDirectCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteDirectQuery sQLiteDirectQuery) {
        if (sQLiteDirectQuery == null) {
            ig3.m135964a("query object cannot be null");
            throw null;
        }
        this.mQuery = sQLiteDirectQuery;
        this.mDriver = sQLiteCursorDriver;
        this.mColumns = sQLiteDirectQuery.getColumnNames();
        this.mCount = -1;
        this.mCountFinished = false;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i) {
        return this.mQuery.getBlob(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (!this.mCountFinished) {
            Log.m84627w(TAG, "Count query on SQLiteDirectCursor is slow. Iterate through the end to get count or use other implementations.");
            this.mCount = this.mPos + this.mQuery.step(Api.BaseClientBuilder.API_PRIORITY_OTHER) + 1;
            this.mCountFinished = true;
            this.mQuery.reset(false);
            this.mPos = this.mQuery.step(this.mPos + 1) - 1;
        }
        return this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i) {
        return this.mQuery.getDouble(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i) {
        return (float) this.mQuery.getDouble(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i) {
        return (int) this.mQuery.getLong(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i) {
        return this.mQuery.getLong(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i) {
        return (short) this.mQuery.getLong(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String getString(int i) {
        return this.mQuery.getString(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i) {
        return this.mQuery.getType(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i) {
        return getType(i) == 0;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i) {
        int iStep;
        int i2;
        if (i < 0) {
            this.mQuery.reset(false);
            this.mPos = -1;
            return false;
        }
        if (this.mCountFinished && i >= (i2 = this.mCount)) {
            this.mPos = i2;
            return false;
        }
        int i3 = this.mPos;
        if (i < i3) {
            Log.m84627w(TAG, "Moving backward on SQLiteDirectCursor is slow. Get rid of backward movement or use other implementations.");
            this.mQuery.reset(false);
            iStep = this.mQuery.step(i + 1) - 1;
        } else {
            if (i == i3) {
                return true;
            }
            iStep = i3 + this.mQuery.step(i - i3);
        }
        if (iStep < i) {
            int i4 = iStep + 1;
            this.mCount = i4;
            this.mCountFinished = true;
            this.mPos = i4;
        } else {
            this.mPos = iStep;
            if (iStep >= this.mCount) {
                this.mCount = iStep + 1;
                this.mCountFinished = false;
            }
        }
        return this.mPos < this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.mQuery.getDatabase().isOpen()) {
                    return false;
                }
                this.mPos = -1;
                this.mCountFinished = false;
                this.mCount = -1;
                this.mDriver.cursorRequeried(this);
                this.mQuery.reset(false);
                try {
                    return super.requery();
                } catch (IllegalStateException e) {
                    Log.m84628w(TAG, "requery() failed " + e.getMessage(), e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
