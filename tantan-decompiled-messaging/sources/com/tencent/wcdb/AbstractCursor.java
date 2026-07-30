package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p149l.qtc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCursor implements CrossProcessCursor {
    private static final String TAG = "Cursor";
    protected boolean mClosed;
    protected ContentResolver mContentResolver;
    private Uri mNotifyUri;
    private ContentObserver mSelfObserver;
    private boolean mSelfObserverRegistered;
    private final Object mSelfObserverLock = new Object();
    private final DataSetObservable mDataSetObservable = new DataSetObservable();
    private final ContentObservable mContentObservable = new ContentObservable();
    private Bundle mExtras = Bundle.EMPTY;
    protected int mPos = -1;

    @Deprecated
    protected int mRowIdColumnIndex = -1;

    @Deprecated
    protected Long mCurrentRowID = null;

    @Deprecated
    protected HashMap<Long, Map<String, Object>> mUpdatedRows = new HashMap<>();

    public static class SelfContentObserver extends ContentObserver {
        WeakReference<AbstractCursor> mCursor;

        public SelfContentObserver(AbstractCursor abstractCursor) {
            super(null);
            this.mCursor = new WeakReference<>(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractCursor abstractCursor = this.mCursor.get();
            if (abstractCursor != null) {
                abstractCursor.onChange(false);
            }
        }
    }

    public void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        onDeactivateOrClose();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        onDeactivateOrClose();
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        DatabaseUtils.cursorFillWindow(this, i, cursorWindow);
    }

    public void finalize() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && this.mSelfObserverRegistered) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
        }
        try {
            if (this.mClosed) {
                return;
            }
            close();
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Log.m84620e(TAG, "requesting column name with table name -- ".concat(str), new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        qtc0.m176411a("column '", str, "' does not exist");
        return 0;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public String getColumnName(int i) {
        return getColumnNames()[i];
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract String[] getColumnNames();

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract int getCount();

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract double getDouble(int i);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract float getFloat(int i);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract int getInt(int i);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract long getLong(int i);

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return this.mNotifyUri;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final int getPosition() {
        return this.mPos;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract short getShort(int i);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract String getString(int i);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i) {
        return 3;
    }

    @Deprecated
    public Object getUpdatedField(int i) {
        return null;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public CursorWindow getWindow() {
        return null;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.mPos == getCount();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.mPos == -1;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isClosed() {
        return this.mClosed;
    }

    @Deprecated
    public boolean isFieldUpdated(int i) {
        return false;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isFirst() {
        return this.mPos == 0 && getCount() != 0;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.mPos == count + (-1) && count != 0;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract boolean isNull(int i);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.mPos + i);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        }
        if (i < 0) {
            this.mPos = -1;
            return false;
        }
        int i2 = this.mPos;
        if (i == i2) {
            return true;
        }
        boolean zOnMove = onMove(i2, i);
        if (!zOnMove) {
            this.mPos = -1;
            return zOnMove;
        }
        this.mPos = i;
        int i3 = this.mRowIdColumnIndex;
        if (i3 != -1) {
            this.mCurrentRowID = Long.valueOf(getLong(i3));
        }
        return zOnMove;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    public void onChange(boolean z) {
        synchronized (this.mSelfObserverLock) {
            try {
                this.mContentObservable.dispatchChange(z);
                Uri uri = this.mNotifyUri;
                if (uri != null && z) {
                    this.mContentResolver.notifyChange(uri, this.mSelfObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onDeactivateOrClose() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return true;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        this.mContentObservable.registerObserver(contentObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.mExtras = bundle;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.mSelfObserverLock) {
            try {
                this.mNotifyUri = uri;
                this.mContentResolver = contentResolver;
                ContentObserver contentObserver = this.mSelfObserver;
                if (contentObserver != null) {
                    contentResolver.unregisterContentObserver(contentObserver);
                }
                SelfContentObserver selfContentObserver = new SelfContentObserver(this);
                this.mSelfObserver = selfContentObserver;
                this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
                this.mSelfObserverRegistered = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (this.mClosed) {
            return;
        }
        this.mContentObservable.unregisterObserver(contentObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
    }
}
