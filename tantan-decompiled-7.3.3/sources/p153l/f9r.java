package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.Counter;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: classes11.dex */
public class f9r {
    /* JADX INFO: renamed from: a */
    public static void m124682a(int i) {
        SQLiteDatabase sQLiteDatabaseM124684c = m124684c();
        try {
            sQLiteDatabaseM124684c.delete("launchRecord", "version != " + i, null);
        } catch (Exception unused) {
        } finally {
            m1m.m156698a(sQLiteDatabaseM124684c);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static pf60<Integer, Integer> m124683b() {
        int i;
        SQLiteDatabase sQLiteDatabaseM124684c = m124684c();
        int i2 = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM124684c.rawQuery("SELECT * FROM launchRecord", null);
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
            return new pf60<>(Integer.valueOf(i), Integer.valueOf(i2));
        } finally {
            m1m.m156698a(cursorRawQuery);
            m1m.m156698a(sQLiteDatabaseM124684c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static SQLiteDatabase m124684c() {
        if (k1c.m147854k() == null) {
            k1c.m147855n(du2.m118045e());
        }
        return k1c.m147854k().getWritableDatabase();
    }

    /* JADX INFO: renamed from: d */
    public static void m124685d(int i, int i2) {
        SQLiteDatabase sQLiteDatabaseM124684c = m124684c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Counter.TYPE, Integer.valueOf(i2));
            if (i > 0) {
                sQLiteDatabaseM124684c.update("launchRecord", contentValues, "version = ?", new String[]{String.valueOf(i)});
            } else {
                contentValues.put(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(k1c.m147854k().m147856m()));
                sQLiteDatabaseM124684c.insert("launchRecord", null, contentValues);
            }
        } catch (Exception unused) {
        } finally {
            m1m.m156698a(sQLiteDatabaseM124684c);
        }
    }
}
