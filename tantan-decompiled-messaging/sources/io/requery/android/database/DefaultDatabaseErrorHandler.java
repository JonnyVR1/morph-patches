package io.requery.android.database;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private static final String TAG = "DefaultDatabaseError";

    private void deleteDatabaseFile(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.e(TAG, "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.getMessage();
        }
    }

    @Override // io.requery.android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        Log.e(TAG, "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (!sQLiteDatabase.isOpen()) {
            deleteDatabaseFile(sQLiteDatabase.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase.getAttachedDbs();
            } finally {
                if (attachedDbs != null) {
                    Iterator<Pair<String, String>> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        deleteDatabaseFile((String) it.next().second);
                    }
                } else {
                    deleteDatabaseFile(sQLiteDatabase.getPath());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            sQLiteDatabase.close();
        } catch (SQLiteException unused2) {
        }
    }
}
