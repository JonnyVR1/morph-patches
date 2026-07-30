package io.requery.android.database.sqlite;

import android.database.Cursor;

/* JADX INFO: loaded from: classes2.dex */
public interface SQLiteCursorDriver {
    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(Cursor cursor);

    Cursor query(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr);

    void setBindArguments(String[] strArr);
}
