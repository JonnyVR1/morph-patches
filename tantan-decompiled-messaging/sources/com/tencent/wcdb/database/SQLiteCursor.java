package com.tencent.wcdb.database;

import com.tencent.wcdb.AbstractWindowedCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.util.HashMap;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteCursor.1
        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteCursor(sQLiteCursorDriver, str, (SQLiteQuery) sQLiteProgram);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    static final int NO_COUNT = -1;
    static final String TAG = "WCDB.SQLiteCursor";
    private Map<String, Integer> mColumnNameMap;
    private final String[] mColumns;
    private int mCount;
    private int mCursorWindowCapacity;
    private final SQLiteCursorDriver mDriver;
    private final String mEditTable;
    private final SQLiteQuery mQuery;
    private final Throwable mStackTrace;

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mCount = -1;
        if (sQLiteQuery == null) {
            ig3.m135964a("query object cannot be null");
            throw null;
        }
        this.mStackTrace = null;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        String[] columnNames = sQLiteQuery.getColumnNames();
        this.mColumns = columnNames;
        this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(columnNames);
    }

    private void fillWindow(int i) {
        clearOrCreateWindow(getDatabase().getPath());
        try {
            if (this.mCount != -1) {
                this.mQuery.fillWindow(this.mWindow, DatabaseUtils.cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity), i, false);
            } else {
                this.mCount = this.mQuery.fillWindow(this.mWindow, DatabaseUtils.cursorPickFillWindowStartPosition(i, 0), i, true);
                this.mCursorWindowCapacity = this.mWindow.getNumRows();
            }
        } catch (RuntimeException e) {
            closeWindow();
            throw e;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.mQuery.close();
            this.mDriver.cursorClosed();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Log.m84620e(TAG, "requesting column name with table name -- ".concat(str), new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mQuery.getDatabase();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i2 >= cursorWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
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
                CursorWindow cursorWindow = this.mWindow;
                if (cursorWindow != null) {
                    cursorWindow.clear();
                }
                this.mPos = -1;
                this.mCount = -1;
                this.mDriver.cursorRequeried(this);
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

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // com.tencent.wcdb.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.mCount = -1;
    }

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
