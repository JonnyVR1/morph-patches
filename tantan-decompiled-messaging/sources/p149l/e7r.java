package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.Counter;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: classes13.dex */
public class e7r {
    /* JADX INFO: renamed from: a */
    public static void m115205a(int i) {
        SQLiteDatabase sQLiteDatabaseM115207c = m115207c();
        try {
            sQLiteDatabaseM115207c.delete("launchRecord", "version != " + i, null);
        } catch (Exception unused) {
        } finally {
            ryl.m181666a(sQLiteDatabaseM115207c);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static j760<Integer, Integer> m115206b() {
        int i;
        SQLiteDatabase sQLiteDatabaseM115207c = m115207c();
        int i2 = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM115207c.rawQuery("SELECT * FROM launchRecord", null);
                if (cursorRawQuery.moveToFirst()) {
                    i = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(WBConstants.AUTH_PARAMS_VERSION));
                    try {
                        i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(Counter.TYPE));
                    } catch (Exception unused) {
                    }
                } else {
                    i = 0;
                }
            } catch (Exception unused2) {
            }
            return new j760<>(Integer.valueOf(i), Integer.valueOf(i2));
        } finally {
            ryl.m181666a(cursorRawQuery);
            ryl.m181666a(sQLiteDatabaseM115207c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static SQLiteDatabase m115207c() {
        if (xzb.m211950k() == null) {
            xzb.m211951n(nt2.m160814e());
        }
        return xzb.m211950k().getWritableDatabase();
    }

    /* JADX INFO: renamed from: d */
    public static void m115208d(int i, int i2) {
        SQLiteDatabase sQLiteDatabaseM115207c = m115207c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Counter.TYPE, Integer.valueOf(i2));
            if (i > 0) {
                sQLiteDatabaseM115207c.update("launchRecord", contentValues, "version = ?", new String[]{String.valueOf(i)});
            } else {
                contentValues.put(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(xzb.m211950k().m211952m()));
                sQLiteDatabaseM115207c.insert("launchRecord", null, contentValues);
            }
        } catch (Exception unused) {
        } finally {
            ryl.m181666a(sQLiteDatabaseM115207c);
        }
    }
}
