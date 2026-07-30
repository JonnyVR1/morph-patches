package com.tencent.wcdb.database;

import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorIndexOutOfBoundsException;
import com.tencent.wcdb.StaleDataException;
import com.tencent.wcdb.support.CancellationSignal;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteAsyncCursor extends AbstractCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteAsyncCursor.1
        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteAsyncCursor(sQLiteCursorDriver, str, (SQLiteAsyncQuery) sQLiteProgram);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteAsyncQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private static final int MAX_KEEP_CHUNKS = 32;
    private static final int MAX_PREFETCH = 256;
    private static final int MIN_FETCH_ROWS = 32;
    private static final String TAG = "WCDB.SQLiteAsyncCursor";
    private final String[] mColumns;
    private volatile int mCount;
    private long mCurrentRow;
    private final SQLiteCursorDriver mDriver;
    private final SQLiteAsyncQuery mQuery;
    private QueryThread mQueryThread;
    private final Object mWaitLock;
    private ChunkedCursorWindow mWindow;

    public class QueryThread extends Thread {
        private int mFetchPos;
        private int mMinPos;
        private volatile int mRequestPos;

        public QueryThread() {
            super("SQLiteAsyncCursor.QueryThread");
            this.mRequestPos = 0;
            this.mMinPos = 0;
            this.mFetchPos = 0;
        }

        public void quit() {
            interrupt();
        }

        public void requestPos(int i) {
            synchronized (this) {
                this.mRequestPos = i;
                notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int iFillRows;
            try {
                int count = SQLiteAsyncCursor.this.mQuery.getCount();
                synchronized (SQLiteAsyncCursor.this.mWaitLock) {
                    SQLiteAsyncCursor.this.mCount = count;
                    SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                }
                while (!Thread.interrupted()) {
                    synchronized (this) {
                        while (this.mRequestPos + 256 <= this.mFetchPos && this.mRequestPos >= this.mMinPos) {
                            try {
                                wait();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        i = this.mRequestPos;
                        i2 = i + 256;
                    }
                    if (i < this.mMinPos) {
                        SQLiteAsyncCursor.this.mQuery.reset();
                        this.mFetchPos = 0;
                        SQLiteAsyncCursor.this.mWindow.clear();
                        this.mMinPos = 0;
                    }
                    if (this.mFetchPos < i2) {
                        if (SQLiteAsyncCursor.this.mWindow.getNumChunks() > 32) {
                            long jRemoveChunk = SQLiteAsyncCursor.this.mWindow.removeChunk(this.mMinPos);
                            if (jRemoveChunk != -1) {
                                this.mMinPos = (int) jRemoveChunk;
                            }
                        }
                        synchronized (SQLiteAsyncCursor.this.mWaitLock) {
                            try {
                                iFillRows = SQLiteAsyncCursor.this.mQuery.fillRows(SQLiteAsyncCursor.this.mWindow, this.mFetchPos, 32);
                                int i3 = this.mFetchPos;
                                if (i3 <= i && i3 + iFillRows > i) {
                                    SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        this.mFetchPos += iFillRows;
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th3) {
                SQLiteAsyncCursor.this.mQuery.release();
                throw th3;
            }
            SQLiteAsyncCursor.this.mQuery.release();
        }
    }

    public SQLiteAsyncCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteAsyncQuery sQLiteAsyncQuery) {
        if (sQLiteAsyncQuery == null) {
            ig3.m135964a("query object cannot be null");
            throw null;
        }
        this.mQuery = sQLiteAsyncQuery;
        this.mDriver = sQLiteCursorDriver;
        this.mColumns = sQLiteAsyncQuery.getColumnNames();
        this.mCount = -1;
        this.mWaitLock = new Object();
        this.mWindow = new ChunkedCursorWindow(16777216);
        QueryThread queryThread = new QueryThread();
        this.mQueryThread = queryThread;
        queryThread.start();
    }

    private void checkValidRow() {
        if (this.mCurrentRow != 0) {
            return;
        }
        if (!isValidPosition(this.mPos)) {
            throw new CursorIndexOutOfBoundsException(this.mPos, this.mCount);
        }
        throw new StaleDataException("Cannot get valid Row object");
    }

    private boolean isValidPosition(int i) {
        return i >= 0 && i < getCount();
    }

    private boolean requestRow() {
        if (this.mWindow == null || !isValidPosition(this.mPos)) {
            return false;
        }
        this.mQueryThread.requestPos(this.mPos);
        long rowUnsafe = this.mWindow.getRowUnsafe(this.mPos);
        this.mCurrentRow = rowUnsafe;
        if (rowUnsafe == 0) {
            this.mCurrentRow = waitForRow(this.mPos);
        }
        return this.mCurrentRow != 0;
    }

    private long waitForRow(int i) {
        long rowUnsafe;
        try {
            synchronized (this.mWaitLock) {
                while (true) {
                    try {
                        rowUnsafe = this.mWindow.getRowUnsafe(i);
                        if (rowUnsafe == 0) {
                            if (!isValidPosition(i)) {
                                throw new CursorIndexOutOfBoundsException(this.mPos, this.mCount);
                            }
                            this.mWaitLock.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return rowUnsafe;
        } catch (InterruptedException unused) {
            return 0L;
        }
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
        checkValidRow();
        return this.mWindow.getBlobUnsafe(this.mCurrentRow, i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (this.mCount >= 0) {
            return this.mCount;
        }
        if (this.mWindow == null) {
            return -1;
        }
        try {
            synchronized (this.mWaitLock) {
                while (this.mCount < 0) {
                    try {
                        this.mWaitLock.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (InterruptedException unused) {
        }
        return this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i) {
        checkValidRow();
        return this.mWindow.getDoubleUnsafe(this.mCurrentRow, i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i) {
        return (float) getDouble(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i) {
        return (int) getLong(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i) {
        checkValidRow();
        return this.mWindow.getLongUnsafe(this.mCurrentRow, i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i) {
        return (short) getLong(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String getString(int i) {
        checkValidRow();
        return this.mWindow.getStringUnsafe(this.mCurrentRow, i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i) {
        checkValidRow();
        return this.mWindow.getTypeUnsafe(this.mCurrentRow, i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i) {
        return getType(i) == 0;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i < -1) {
            i = -1;
        }
        if (i != this.mPos) {
            this.mWindow.endRowUnsafe(this.mCurrentRow);
            this.mCurrentRow = 0L;
        }
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        }
        this.mPos = i;
        return i >= 0 && requestRow();
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void onDeactivateOrClose() {
        long j = this.mCurrentRow;
        if (j != 0) {
            this.mWindow.endRowUnsafe(j);
            this.mCurrentRow = 0L;
        }
        QueryThread queryThread = this.mQueryThread;
        if (queryThread != null) {
            queryThread.quit();
            try {
                this.mQueryThread.join();
            } catch (InterruptedException unused) {
            }
            this.mQueryThread = null;
        }
        ChunkedCursorWindow chunkedCursorWindow = this.mWindow;
        if (chunkedCursorWindow != null) {
            chunkedCursorWindow.close();
            this.mWindow = null;
        }
        this.mCount = -1;
        this.mPos = -1;
        super.onDeactivateOrClose();
    }
}
