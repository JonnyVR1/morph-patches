package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.C2232o0;
import com.google.android.gms.internal.ads.zzhag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fav0 {
    /* JADX INFO: renamed from: a */
    public static int m124783a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorM124790h = m124790h(sQLiteDatabase, i);
        if (cursorM124790h.getCount() > 0) {
            cursorM124790h.moveToNext();
            i2 = cursorM124790h.getInt(cursorM124790h.getColumnIndexOrThrow("value"));
        }
        cursorM124790h.close();
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static long m124784b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor cursorM124790h = m124790h(sQLiteDatabase, 2);
        if (cursorM124790h.getCount() > 0) {
            cursorM124790h.moveToNext();
            j = cursorM124790h.getLong(cursorM124790h.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorM124790h.close();
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m124785c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(C2232o0.m13101V(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzhag e) {
                dct0.m115295d("Unable to deserialize proto from offline signals database:");
                dct0.m115295d(e.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static void m124786d(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m124787e(SQLiteDatabase sQLiteDatabase) {
        m124791i(sQLiteDatabase, "failed_requests", 0);
        m124791i(sQLiteDatabase, "total_requests", 0);
        m124791i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* JADX INFO: renamed from: f */
    public static void m124788f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        m124792j(sQLiteDatabase, "failed_requests", 0);
        m124792j(sQLiteDatabase, "total_requests", 0);
        m124792j(sQLiteDatabase, "completed_requests", 0);
    }

    /* JADX INFO: renamed from: g */
    public static void m124789g(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
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
    public static Cursor m124790h(SQLiteDatabase sQLiteDatabase, int i) {
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
    public static void m124791i(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* JADX INFO: renamed from: j */
    public static void m124792j(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
