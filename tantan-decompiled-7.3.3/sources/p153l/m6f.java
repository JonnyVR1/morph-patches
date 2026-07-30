package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.sina.weibo.sdk.constant.WBConstants;
import com.vivo.push.PushClientConstants;

/* JADX INFO: loaded from: classes11.dex */
public class m6f {
    /* JADX INFO: renamed from: a */
    public static void m157215a(int i) {
        SQLiteDatabase sQLiteDatabaseM157217c = m157217c();
        try {
            sQLiteDatabaseM157217c.delete("exception", "version != ?", new String[]{String.valueOf(i)});
        } catch (Exception unused) {
        } finally {
            m1m.m156698a(sQLiteDatabaseM157217c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m157216b(StackTraceElement stackTraceElement) {
        SQLiteDatabase sQLiteDatabaseM157217c = m157217c();
        boolean z = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabaseM157217c.query("exception", new String[]{"lineNumber"}, "methodName=? and lineNumber=?", new String[]{stackTraceElement.getMethodName(), String.valueOf(stackTraceElement.getLineNumber())}, null, null, null);
            if (cursorQuery.getCount() > 0) {
                z = true;
            }
        } catch (Exception unused) {
        } finally {
            m1m.m156698a(cursorQuery);
            m1m.m156698a(sQLiteDatabaseM157217c);
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static SQLiteDatabase m157217c() {
        if (k1c.m147854k() == null) {
            k1c.m147855n(du2.m118045e());
        }
        return k1c.m147854k().getWritableDatabase();
    }

    /* JADX INFO: renamed from: d */
    public static void m157218d(StackTraceElement stackTraceElement) {
        SQLiteDatabase sQLiteDatabaseM157217c = m157217c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(PushClientConstants.TAG_CLASS_NAME, stackTraceElement.getClassName());
            contentValues.put("fileName", stackTraceElement.getFileName());
            contentValues.put("methodName", stackTraceElement.getMethodName());
            contentValues.put("lineNumber", Integer.valueOf(stackTraceElement.getLineNumber()));
            contentValues.put(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(k1c.m147854k().m147856m()));
            sQLiteDatabaseM157217c.insert("exception", null, contentValues);
        } catch (Exception unused) {
        } finally {
            m1m.m156698a(sQLiteDatabaseM157217c);
        }
    }
}
