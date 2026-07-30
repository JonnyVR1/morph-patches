package com.tencent.wcdb;

import android.database.ContentObserver;
import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes2.dex */
public class MergeCursor extends AbstractCursor {
    private Cursor mCursor;
    private Cursor[] mCursors;
    private DataSetObserver mObserver = new DataSetObserver() { // from class: com.tencent.wcdb.MergeCursor.1
        @Override // android.database.DataSetObserver
        public void onChanged() {
            MergeCursor.this.mPos = -1;
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            MergeCursor.this.mPos = -1;
        }
    };

    public MergeCursor(Cursor[] cursorArr) {
        this.mCursors = cursorArr;
        int i = 0;
        this.mCursor = cursorArr[0];
        while (true) {
            Cursor[] cursorArr2 = this.mCursors;
            if (i >= cursorArr2.length) {
                return;
            }
            Cursor cursor = cursorArr2[i];
            if (cursor != null) {
                cursor.registerDataSetObserver(this.mObserver);
            }
            i++;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                cursor.close();
            }
        }
        super.close();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                cursor.deactivate();
            }
        }
        super.deactivate();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i) {
        return this.mCursor.getBlob(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String[] getColumnNames() {
        Cursor cursor = this.mCursor;
        return cursor != null ? cursor.getColumnNames() : new String[0];
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        int length = this.mCursors.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                count += cursor.getCount();
            }
        }
        return count;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i) {
        return this.mCursor.getDouble(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i) {
        return this.mCursor.getFloat(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i) {
        return this.mCursor.getInt(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i) {
        return this.mCursor.getLong(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i) {
        return this.mCursor.getShort(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String getString(int i) {
        return this.mCursor.getString(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i) {
        return this.mCursor.getType(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i) {
        return this.mCursor.isNull(i);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        this.mCursor = null;
        int length = this.mCursors.length;
        int count = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Cursor cursor = this.mCursors[i3];
            if (cursor != null) {
                int count2 = cursor.getCount() + count;
                Cursor[] cursorArr = this.mCursors;
                if (i2 < count2) {
                    this.mCursor = cursorArr[i3];
                    break;
                }
                count += cursorArr[i3].getCount();
            }
        }
        Cursor cursor2 = this.mCursor;
        if (cursor2 != null) {
            return cursor2.moveToPosition(i2 - count);
        }
        return false;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                cursor.registerContentObserver(contentObserver);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null && !cursor.requery()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                cursor.unregisterContentObserver(contentObserver);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            Cursor cursor = this.mCursors[i];
            if (cursor != null) {
                cursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
}
