package com.tencent.wcdb;

import android.util.Pair;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private static final String[] SUFFIX_TO_BACKUP = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};
    private static final String TAG = "WCDB.DefaultDatabaseErrorHandler";
    private final boolean mNoCorruptionBackup;

    public DefaultDatabaseErrorHandler() {
        this.mNoCorruptionBackup = false;
    }

    private void deleteDatabaseFile(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.m84619e(TAG, "Remove database file: ".concat(str));
        int i = 0;
        if (this.mNoCorruptionBackup) {
            String[] strArr = SUFFIX_TO_BACKUP;
            int length = strArr.length;
            while (i < length) {
                deleteFile(str + strArr[i]);
                i++;
            }
            return;
        }
        File file = new File(str);
        File file2 = new File(file.getParentFile(), "corrupted");
        if (!file2.mkdirs()) {
            Log.m84619e(TAG, "Could not create directory for corrupted database. Corruption backup may be unavailable.");
        }
        String str2 = file2.getPath() + "/" + file.getName();
        String[] strArr2 = SUFFIX_TO_BACKUP;
        int length2 = strArr2.length;
        while (i < length2) {
            String str3 = strArr2[i];
            moveOrDeleteFile(str + str3, str2 + str3);
            i++;
        }
    }

    private static boolean deleteFile(String str) {
        return new File(str).delete();
    }

    private static boolean moveOrDeleteFile(String str, String str2) {
        File file = new File(str);
        boolean zRenameTo = file.renameTo(new File(str2));
        if (!zRenameTo) {
            file.delete();
        }
        return zRenameTo;
    }

    @Override // com.tencent.wcdb.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        List<Pair<String, String>> attachedDbs;
        Log.m84619e(TAG, "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (!sQLiteDatabase.isOpen()) {
            deleteDatabaseFile(sQLiteDatabase.getPath());
            return;
        }
        try {
            attachedDbs = sQLiteDatabase.getAttachedDbs();
        } catch (SQLiteException unused) {
            attachedDbs = null;
        }
        SQLiteTrace traceCallback = sQLiteDatabase.getTraceCallback();
        if (traceCallback != null) {
            traceCallback.onDatabaseCorrupted(sQLiteDatabase);
        }
        try {
            sQLiteDatabase.close();
        } catch (SQLiteException unused2) {
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
    }

    public DefaultDatabaseErrorHandler(boolean z) {
        this.mNoCorruptionBackup = z;
    }
}
