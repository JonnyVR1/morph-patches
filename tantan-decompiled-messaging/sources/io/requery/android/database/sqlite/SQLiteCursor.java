package io.requery.android.database.sqlite;

import android.util.Log;
import android.util.SparseIntArray;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.AbstractWindowedCursor;
import io.requery.android.database.CursorWindow;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "SQLiteCursor";
    private SparseIntArray mColumnNameMap;
    private final String[] mColumns;
    private int mCount = -1;
    private int mCursorWindowCapacity;
    private final SQLiteCursorDriver mDriver;
    private final String mEditTable;
    private final SQLiteQuery mQuery;

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        if (sQLiteQuery == null) {
            ig3.m135964a("query object cannot be null");
            throw null;
        }
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        this.mColumns = sQLiteQuery.getColumnNames();
    }

    public static int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    private void fillWindow(int i) {
        clearOrCreateWindow(getDatabase().getPath());
        try {
            if (this.mCount != -1) {
                this.mQuery.fillWindow(this.mWindow, cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity), i, false);
            } else {
                this.mCount = this.mQuery.fillWindow(this.mWindow, cursorPickFillWindowStartPosition(i, 0), i, true);
                this.mCursorWindowCapacity = this.mWindow.getNumRows();
                Log.isLoggable(TAG, 3);
            }
        } catch (RuntimeException e) {
            setWindow(null);
            throw e;
        }
    }

    @Override // io.requery.android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.mQuery.close();
            this.mDriver.cursorClosed();
        }
    }

    @Override // io.requery.android.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // io.requery.android.database.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // io.requery.android.database.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            SparseIntArray sparseIntArray = new SparseIntArray(length);
            for (int i = 0; i < length; i++) {
                sparseIntArray.put(strArr[i].hashCode(), i);
            }
            this.mColumnNameMap = sparseIntArray;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Log.e(TAG, "requesting column name with table name -- ".concat(str), new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        return this.mColumnNameMap.get(str.hashCode(), -1);
    }

    @Override // io.requery.android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // io.requery.android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mQuery.getDatabase();
    }

    @Override // io.requery.android.database.AbstractCursor
    public boolean onMove(int i, int i2) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i2 >= cursorWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    @Override // io.requery.android.database.AbstractCursor, android.database.Cursor
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
                    CrashHelper.m81296c(e);
                    e.getMessage();
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

    @Override // io.requery.android.database.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.mCount = -1;
    }
}
