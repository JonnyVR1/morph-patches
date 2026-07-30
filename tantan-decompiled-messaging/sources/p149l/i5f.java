package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.sina.weibo.sdk.constant.WBConstants;
import com.vivo.push.PushClientConstants;

/* JADX INFO: loaded from: classes13.dex */
public class i5f {
    /* JADX INFO: renamed from: a */
    public static void m134475a(int i) {
        SQLiteDatabase sQLiteDatabaseM134477c = m134477c();
        try {
            sQLiteDatabaseM134477c.delete("exception", "version != ?", new String[]{String.valueOf(i)});
        } catch (Exception unused) {
        } finally {
            ryl.m181666a(sQLiteDatabaseM134477c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134476b(StackTraceElement stackTraceElement) {
        SQLiteDatabase sQLiteDatabaseM134477c = m134477c();
        boolean z = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabaseM134477c.query("exception", new String[]{"lineNumber"}, "methodName=? and lineNumber=?", new String[]{stackTraceElement.getMethodName(), String.valueOf(stackTraceElement.getLineNumber())}, null, null, null);
            if (cursorQuery.getCount() > 0) {
                z = true;
            }
        } catch (Exception unused) {
        } finally {
            ryl.m181666a(cursorQuery);
            ryl.m181666a(sQLiteDatabaseM134477c);
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static SQLiteDatabase m134477c() {
        if (xzb.m211950k() == null) {
            xzb.m211951n(nt2.m160814e());
        }
        return xzb.m211950k().getWritableDatabase();
    }

    /* JADX INFO: renamed from: d */
    public static void m134478d(StackTraceElement stackTraceElement) {
        SQLiteDatabase sQLiteDatabaseM134477c = m134477c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(PushClientConstants.TAG_CLASS_NAME, stackTraceElement.getClassName());
            contentValues.put("fileName", stackTraceElement.getFileName());
            contentValues.put("methodName", stackTraceElement.getMethodName());
            contentValues.put("lineNumber", Integer.valueOf(stackTraceElement.getLineNumber()));
            contentValues.put(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(xzb.m211950k().m211952m()));
            sQLiteDatabaseM134477c.insert("exception", null, contentValues);
        } catch (Exception unused) {
        } finally {
            ryl.m181666a(sQLiteDatabaseM134477c);
        }
    }
}
