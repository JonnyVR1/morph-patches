package p153l;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class r3s0 {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public static Set<String> m179701a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m179702b(d6x0 d6x0Var, SQLiteDatabase sQLiteDatabase) {
        if (d6x0Var == null) {
            wg3.m206174a("Monitor must not be null");
            return;
        }
        File file = new File(edt0.m120520a().zza(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            d6x0Var.m114563F().m153300a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            d6x0Var.m114563F().m153300a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            d6x0Var.m114563F().m153300a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        d6x0Var.m114563F().m153300a("Failed to turn on database write permission for owner");
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public static void m179703c(d6x0 d6x0Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (d6x0Var == null) {
            wg3.m206174a("Monitor must not be null");
            return;
        }
        if (!m179704d(d6x0Var, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> setM179701a = m179701a(sQLiteDatabase, str);
            for (String str4 : str3.split(Constants.SEPARATOR_COMMA)) {
                if (!setM179701a.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!setM179701a.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (setM179701a.isEmpty()) {
                return;
            }
            d6x0Var.m114563F().m153302c("Table has extra columns. table, columns", str, TextUtils.join(", ", setM179701a));
        } catch (SQLiteException e) {
            d6x0Var.m114558A().m153301b("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public static boolean m179704d(d6x0 d6x0Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (d6x0Var == null) {
            wg3.m206174a("Monitor must not be null");
            return false;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{AuthenticationTokenClaims.JSON_KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                return zMoveToFirst;
            } catch (SQLiteException e) {
                d6x0Var.m114563F().m153302c("Error querying for table", str, e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }
}
