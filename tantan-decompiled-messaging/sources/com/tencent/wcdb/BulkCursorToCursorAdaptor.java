package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.wcdb.support.Log;
import p149l.aag0;

/* JADX INFO: loaded from: classes2.dex */
public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private static final String TAG = "BulkCursor";
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private AbstractCursor.SelfContentObserver mObserverBridge = new AbstractCursor.SelfContentObserver(this);
    private boolean mWantsAllOnMoveCalls;

    private void throwIfCursorIsClosed() {
        if (this.mBulkCursor == null) {
            throw new StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        IBulkCursor iBulkCursor = this.mBulkCursor;
        if (iBulkCursor != null) {
            try {
                iBulkCursor.close();
            } catch (RemoteException unused) {
                Log.m84627w(TAG, "Remote process exception when closing");
            } finally {
                this.mBulkCursor = null;
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractWindowedCursor, com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        IBulkCursor iBulkCursor = this.mBulkCursor;
        if (iBulkCursor != null) {
            try {
                iBulkCursor.deactivate();
            } catch (RemoteException unused) {
                Log.m84627w(TAG, "Remote process exception when deactivating");
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String[] getColumnNames() {
        throwIfCursorIsClosed();
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        throwIfCursorIsClosed();
        return this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle getExtras() {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public IContentObserver getObserver() {
        try {
            return (IContentObserver) this.mObserverBridge.getClass().getMethod("getContentObserver", null).invoke(this.mObserverBridge, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void initialize(BulkCursorDescriptor bulkCursorDescriptor) {
        this.mBulkCursor = bulkCursorDescriptor.cursor;
        String[] strArr = bulkCursorDescriptor.columnNames;
        this.mColumns = strArr;
        this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(strArr);
        this.mWantsAllOnMoveCalls = bulkCursorDescriptor.wantsAllOnMoveCalls;
        this.mCount = bulkCursorDescriptor.count;
        CursorWindow cursorWindow = bulkCursorDescriptor.window;
        if (cursorWindow != null) {
            setWindow(cursorWindow);
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        throwIfCursorIsClosed();
        try {
            CursorWindow cursorWindow = this.mWindow;
            if (cursorWindow == null || i2 < cursorWindow.getStartPosition() || i2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
                setWindow(this.mBulkCursor.getWindow(i2));
            } else if (this.mWantsAllOnMoveCalls) {
                this.mBulkCursor.onMove(i2);
            }
            return this.mWindow != null;
        } catch (RemoteException unused) {
            Log.m84619e(TAG, "Unable to get window because the remote process is dead");
            return false;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        throwIfCursorIsClosed();
        try {
            int iRequery = this.mBulkCursor.requery(getObserver());
            this.mCount = iRequery;
            if (iRequery == -1) {
                deactivate();
                return false;
            }
            this.mPos = -1;
            closeWindow();
            super.requery();
            return true;
        } catch (Exception e) {
            Log.m84619e(TAG, "Unable to requery because the remote process exception " + e.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle respond(Bundle bundle) {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException e) {
            Log.m84628w(TAG, "respond() threw RemoteException, returning an empty bundle.", e);
            return Bundle.EMPTY;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
