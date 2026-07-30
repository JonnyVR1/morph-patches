package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.C2209o0;
import com.google.android.gms.internal.ads.zzhag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class z0v0 {
    /* JADX INFO: renamed from: a */
    public static int m216761a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorM216768h = m216768h(sQLiteDatabase, i);
        if (cursorM216768h.getCount() > 0) {
            cursorM216768h.moveToNext();
            i2 = cursorM216768h.getInt(cursorM216768h.getColumnIndexOrThrow("value"));
        }
        cursorM216768h.close();
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static long m216762b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor cursorM216768h = m216768h(sQLiteDatabase, 2);
        if (cursorM216768h.getCount() > 0) {
            cursorM216768h.moveToNext();
            j = cursorM216768h.getLong(cursorM216768h.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorM216768h.close();
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m216763c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(C2209o0.m13047V(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzhag e) {
                x2t0.m206866d("Unable to deserialize proto from offline signals database:");
                x2t0.m206866d(e.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static void m216764d(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m216765e(SQLiteDatabase sQLiteDatabase) {
        m216769i(sQLiteDatabase, "failed_requests", 0);
        m216769i(sQLiteDatabase, "total_requests", 0);
        m216769i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* JADX INFO: renamed from: f */
    public static void m216766f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        m216770j(sQLiteDatabase, "failed_requests", 0);
        m216770j(sQLiteDatabase, "total_requests", 0);
        m216770j(sQLiteDatabase, "completed_requests", 0);
    }

    /* JADX INFO: renamed from: g */
    public static void m216767g(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        if (!z2) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    /* JADX INFO: renamed from: h */
    public static Cursor m216768h(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m216769i(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* JADX INFO: renamed from: j */
    public static void m216770j(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
