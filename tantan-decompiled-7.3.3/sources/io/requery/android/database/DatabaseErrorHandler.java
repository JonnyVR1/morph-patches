package io.requery.android.database;

import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public interface DatabaseErrorHandler {
    void onCorruption(SQLiteDatabase sQLiteDatabase);
}
