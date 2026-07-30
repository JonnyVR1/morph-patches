package io.agora.utils2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import io.agora.base.internal.CalledByNative;
import io.agora.utils2.internal.Logging;
import java.io.File;
import p149l.trf0;
import p149l.urf0;

/* JADX INFO: loaded from: classes2.dex */
class SqliteWrapper {
    private static final String TAG = "SQLITE";
    private final Object lock = new Object();

    /* JADX INFO: renamed from: db */
    private SQLiteDatabase f63374db = null;

    public static class StorageItem {
        long actualSize;
        byte[] data;
        long expired;
        String key;

        public StorageItem() {
            this.key = null;
            this.data = null;
            this.actualSize = 0L;
            this.expired = 0L;
        }

        @CalledByNative("StorageItem")
        public long getActualSize() {
            return this.actualSize;
        }

        @CalledByNative("StorageItem")
        public byte[] getData() {
            return this.data;
        }

        @CalledByNative("StorageItem")
        public long getExpired() {
            return this.expired;
        }

        @CalledByNative("StorageItem")
        public String getKey() {
            return this.key;
        }

        public StorageItem(String str, byte[] bArr, long j, long j2) {
            this.key = str;
            this.data = bArr;
            this.actualSize = j;
            this.expired = j2;
        }
    }

    @CalledByNative
    public SqliteWrapper() {
    }

    private boolean executeCommandOnPath(String str, String str2) {
        if (!isDatabaseValid() || !isPathValid(str)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.f63374db.execSQL(str2);
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    private boolean isDatabaseValid() {
        SQLiteDatabase sQLiteDatabase = this.f63374db;
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.f63374db.isReadOnly()) ? false : true;
    }

    private boolean isPathValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == ';') {
                return false;
            }
        }
        return !str.toLowerCase().contains("sqlite_master");
    }

    @CalledByNative
    public void close() {
        if (isDatabaseValid()) {
            synchronized (this.lock) {
                this.f63374db.close();
                this.f63374db = null;
            }
        }
    }

    @CalledByNative
    public boolean delete(String str, String str2) {
        if (!isDatabaseValid() || !isPathValid(str) || !isPathValid(str2)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.f63374db.execSQL("delete from \"" + str + "\" where key = \"" + str2 + "\";");
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @CalledByNative
    public void dispose() {
        synchronized (this.lock) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f63374db;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    this.f63374db.close();
                }
                this.f63374db = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    public boolean drop(String str) {
        return executeCommandOnPath(str, "drop table if exists \"" + str + "\";");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:9:0x0015, B:11:0x0021, B:14:0x002b, B:35:0x0069, B:39:0x0076, B:40:0x0078, B:37:0x006d, B:18:0x0035, B:20:0x003b, B:23:0x0042, B:25:0x0047, B:28:0x0054, B:32:0x005d), top: B:46:0x0015, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @CalledByNative
    public String[] findAllTableNames() {
        String[] strArr;
        String[] strArr2;
        Cursor cursorRawQuery;
        String str;
        String str2;
        if (!isDatabaseValid()) {
            Logging.m87224w(TAG, "database is invalid");
            return new String[0];
        }
        synchronized (this.lock) {
            Cursor cursor = null;
            strArr2 = null;
            strArr2 = null;
            strArr2 = null;
            try {
                try {
                    cursorRawQuery = this.f63374db.rawQuery("select DISTINCT tbl_name from sqlite_master;", new String[0]);
                    if (cursorRawQuery != null) {
                        try {
                            int count = cursorRawQuery.getCount();
                            if (count == 0) {
                                str = TAG;
                                str2 = "findAllTableNames table count is zero";
                            } else if (!cursorRawQuery.isClosed() && cursorRawQuery.moveToFirst()) {
                                strArr2 = new String[count];
                                for (int i = 0; i < count; i++) {
                                    strArr2[i] = cursorRawQuery.getString(0);
                                    if (!cursorRawQuery.moveToNext()) {
                                        break;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            cursor = cursorRawQuery;
                            strArr = null;
                            Logging.m87224w(TAG, "findAllTableNames exception");
                            Cursor cursor2 = cursor;
                            strArr2 = strArr;
                            cursorRawQuery = cursor2;
                        }
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Exception unused2) {
                                Logging.m87224w(TAG, "cursor close exception");
                            }
                        }
                        if (strArr2 == null) {
                            strArr2 = new String[0];
                        }
                    } else {
                        str = TAG;
                        str2 = "findAllTableNames cursor is null";
                    }
                    Logging.m87224w(str, str2);
                } catch (Exception unused3) {
                    strArr = null;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (strArr2 == null) {
                    strArr2 = new String[0];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strArr2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c0 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:17:0x003f, B:20:0x004b, B:24:0x0054, B:30:0x0062, B:51:0x00b1, B:56:0x00c0, B:59:0x00c4, B:60:0x00c9, B:62:0x00cb, B:63:0x00d0, B:53:0x00b5, B:32:0x006e, B:34:0x007c, B:36:0x0082, B:39:0x0089, B:40:0x008d, B:41:0x0096, B:44:0x009f), top: B:68:0x003f, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @CalledByNative
    public StorageItem load(String str, String str2, boolean z) {
        byte[] bArr;
        Cursor cursorRawQuery;
        byte[] bArr2;
        long length;
        long j;
        String str3;
        boolean z2;
        if (!isDatabaseValid()) {
            Logging.m87224w(TAG, "database is invalid");
            return new StorageItem();
        }
        if (TextUtils.isEmpty(str)) {
            Logging.m87224w(TAG, "query is invalid");
            return new StorageItem();
        }
        if (TextUtils.isEmpty(str2)) {
            Logging.m87224w(TAG, "cmd is invalid");
            return new StorageItem();
        }
        synchronized (this.lock) {
            byte[] blob = null;
            try {
                try {
                    cursorRawQuery = this.f63374db.rawQuery(str, new String[0]);
                    if (cursorRawQuery != null) {
                        try {
                            z2 = cursorRawQuery.getCount() > 0;
                            cursorRawQuery.close();
                            cursorRawQuery = null;
                        } catch (Exception unused) {
                            bArr = null;
                            bArr2 = bArr;
                            length = 0;
                            j = 0;
                            str3 = blob;
                            if (cursorRawQuery != null) {
                                try {
                                    cursorRawQuery.close();
                                } catch (Exception unused2) {
                                    Logging.m87224w(TAG, "cursor close exception");
                                }
                            }
                            if (length != 0) {
                                return new StorageItem(str3, bArr2, length, j);
                            }
                            return new StorageItem();
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        cursorRawQuery = this.f63374db.rawQuery(str2, new String[0]);
                        if (!cursorRawQuery.isClosed() && cursorRawQuery.moveToFirst() && cursorRawQuery.getCount() == 1) {
                            String string = cursorRawQuery.getString(0);
                            try {
                                blob = cursorRawQuery.getBlob(1);
                                long j2 = cursorRawQuery.getLong(2);
                                length = blob.length > 524288 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : blob.length;
                                j = j2;
                                str3 = string;
                                bArr2 = blob;
                            } catch (Exception unused3) {
                                byte[] bArr3 = blob;
                                blob = string;
                                bArr = bArr3;
                                bArr2 = bArr;
                                length = 0;
                                j = 0;
                                str3 = blob;
                            }
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        if (length != 0 && bArr2.length != 0) {
                            return new StorageItem(str3, bArr2, length, j);
                        }
                        return new StorageItem();
                    }
                    Logging.m87224w(TAG, "table is not exist");
                    length = 0;
                    j = 0;
                    str3 = 0;
                    bArr2 = null;
                } catch (Exception unused4) {
                    bArr = null;
                    cursorRawQuery = null;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (length != 0) {
                    return new StorageItem(str3, bArr2, length, j);
                }
                return new StorageItem();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007d A[Catch: all -> 0x006a, TryCatch #2 {, blocks: (B:13:0x0020, B:15:0x002a, B:17:0x0030, B:20:0x0037, B:22:0x0040, B:26:0x0059, B:25:0x0057, B:34:0x0070, B:38:0x007d, B:39:0x007f, B:36:0x0074), top: B:46:0x0020, inners: #3 }] */
    @CalledByNative
    public StorageItem[] loadWholeTable(String str) {
        StorageItem[] storageItemArr;
        Cursor cursorRawQuery;
        String str2;
        String str3;
        if (!isDatabaseValid()) {
            str2 = TAG;
            str3 = "database is invalid";
        } else {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.lock) {
                    storageItemArr = null;
                    try {
                        cursorRawQuery = this.f63374db.rawQuery(str, new String[0]);
                        if (cursorRawQuery != null) {
                            try {
                                if (!cursorRawQuery.isClosed() && cursorRawQuery.moveToFirst()) {
                                    int count = cursorRawQuery.getCount();
                                    storageItemArr = new StorageItem[count];
                                    for (int i = 0; i < count; i++) {
                                        String string = cursorRawQuery.getString(0);
                                        byte[] blob = cursorRawQuery.getBlob(1);
                                        storageItemArr[i] = new StorageItem(string, blob, blob.length > 524288 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : blob.length, cursorRawQuery.getLong(2));
                                        if (!cursorRawQuery.moveToNext()) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        cursorRawQuery = null;
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused3) {
                            Logging.m87224w(TAG, "cursor close exception");
                        }
                        if (storageItemArr == null) {
                            storageItemArr = new StorageItem[0];
                        }
                    } else if (storageItemArr == null) {
                        storageItemArr = new StorageItem[0];
                    }
                    throw th;
                }
                return storageItemArr;
            }
            str2 = TAG;
            str3 = "cmd is invalid";
        }
        Logging.m87224w(str2, str3);
        return new StorageItem[0];
    }

    @CalledByNative
    public boolean open(String str) {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        if (!isPathValid(str)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        urf0.m195075a();
                        SQLiteDatabase.OpenParams.Builder builderM190413a = trf0.m190413a();
                        builderM190413a.setOpenFlags(268435456);
                        builderM190413a.setJournalMode(BLiveOperationTitleShowType.off);
                        sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(new File(str), builderM190413a.build());
                    } else {
                        sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(str, null, 268435456);
                    }
                    this.f63374db = sQLiteDatabaseOpenDatabase;
                    try {
                        this.f63374db.execSQL("PRAGMA TEMP_STORE = MEMORY;");
                        this.f63374db.execSQL("PRAGMA SYNCHRONOUS = OFF;");
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (this.f63374db.isOpen()) {
                            this.f63374db.close();
                        }
                        this.f63374db = null;
                        Logging.m87216d(TAG, "Can not open database: " + str);
                        return false;
                    }
                } catch (Exception unused) {
                    SQLiteDatabase sQLiteDatabase = this.f63374db;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        this.f63374db.close();
                    }
                    this.f63374db = null;
                    Logging.m87216d(TAG, "Can not open database: " + str);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @CalledByNative
    public long save(String str, String str2, byte[] bArr, long j) {
        SQLiteStatement sQLiteStatementCompileStatement;
        long length = 0;
        if (!isPathValid(str) || !isPathValid(str2) || bArr == null || bArr.length == 0 || bArr.length >= 524288 || !touch(str)) {
            return 0L;
        }
        synchronized (this.lock) {
            try {
                String str3 = "replace into \"" + str + "\" (key, value, expired) values (\"" + str2 + "\", ?, " + j + ");";
                this.f63374db.beginTransaction();
                try {
                    sQLiteStatementCompileStatement = this.f63374db.compileStatement(str3);
                    try {
                        sQLiteStatementCompileStatement.bindBlob(1, bArr);
                        sQLiteStatementCompileStatement.execute();
                        length = bArr.length;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    sQLiteStatementCompileStatement = null;
                }
                this.f63374db.setTransactionSuccessful();
                this.f63374db.endTransaction();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    @CalledByNative
    public boolean touch(String str) {
        return executeCommandOnPath(str, "create table if not exists \"" + str + "\" (key text primary key, value text, expired INTEGER);");
    }
}
