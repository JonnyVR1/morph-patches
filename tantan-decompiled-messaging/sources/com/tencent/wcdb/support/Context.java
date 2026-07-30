package com.tencent.wcdb.support;

import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteGlobal;
import java.io.File;
import org.eclipse.jetty.http.HttpStatus;
import p149l.qtc0;
import p149l.upk0;

/* JADX INFO: loaded from: classes2.dex */
public final class Context {
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;

    static {
        SQLiteGlobal.loadLib();
    }

    private static File getDataDirFile(android.content.Context context) {
        if (context == null) {
            upk0.m194883a("Not supported in system context");
            return null;
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    private static File getDatabasesDir(android.content.Context context) {
        File file = new File(getDataDirFile(context), "databases");
        return file.getPath().equals("databases") ? new File("/data/system") : file;
    }

    private static File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        qtc0.m176411a("File ", str, " contains a path separator");
        return null;
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
        File fileValidateFilePath = validateFilePath(context, str, true);
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(fileValidateFilePath.getPath(), bArr, sQLiteCipherSpec, cursorFactory, (i & 8) != 0 ? 805306368 : 268435456, databaseErrorHandler, i2);
        setFilePermissionsFromMode(fileValidateFilePath.getPath(), i, 0);
        return sQLiteDatabaseOpenDatabase;
    }

    private static void setFilePermissionsFromMode(String str, int i, int i2) {
        int i3 = i2 | 432;
        if ((i & 1) != 0) {
            i3 = i2 | 436;
        }
        if ((i & 2) != 0) {
            i3 |= 2;
        }
        FileUtils.setPermissions(str, i3, -1, -1);
    }

    private static File validateFilePath(android.content.Context context, String str, boolean z) {
        File databasesDir;
        File fileMakeFilename;
        char cCharAt = str.charAt(0);
        char c = File.separatorChar;
        if (cCharAt == c) {
            databasesDir = new File(str.substring(0, str.lastIndexOf(c)));
            fileMakeFilename = new File(databasesDir, str.substring(str.lastIndexOf(c)));
        } else {
            databasesDir = getDatabasesDir(context);
            fileMakeFilename = makeFilename(databasesDir, str);
        }
        if (z && !databasesDir.isDirectory() && databasesDir.mkdir()) {
            FileUtils.setPermissions(databasesDir.getPath(), HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505, -1, -1);
        }
        return fileMakeFilename;
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(context, str, null, null, i, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, i, cursorFactory, null, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, i, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(context, str, null, null, i, cursorFactory, null, 0);
    }
}
