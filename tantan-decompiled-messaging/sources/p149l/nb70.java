package p149l;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class nb70 {
    /* JADX INFO: renamed from: a */
    private static String m158759a(long j) {
        Date date = new Date(j * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sgw.m184137a(new byte[]{73, 31, 72, 78, 76, 43, 125, 75, 85, 83, 65, 46, 120, 92, 92, 90, 91, 21, 67}), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(sgw.m184137a(new byte[]{113, 21, 88, 86, 78, 53, 88, 7, 95, 80, 9, 7, 89})));
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m158760b(JSONObject jSONObject) {
        try {
            jSONObject.put(sgw.m184137a(new byte[]{64, 14, 94, 67, 14, 57, 83, 9, 68, 89, 21}), -1);
            return jSONObject;
        } catch (JSONException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m158761c(Cursor cursor) throws JSONException {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{111, 15, 85})));
        String string = cursor.getString(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{111, 2, 88, 68, 17, 10, 81, 31, 110, 89, 0, 11, 85})));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{84, 7, 69, 82, 62, 7, 84, 2, 84, 83})));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{111, 2, 80, 67, 0})));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{111, 21, 88, 77, 4})));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{93, 15, 92, 82, 62, 18, 73, 22, 84})));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{71, 15, 85, 67, 9})));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{88, 3, 88, 80, 9, 18})));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow(sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15})));
        String strM158759a = m158759a(j2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(sgw.m184137a(new byte[]{89, 2}), j);
        jSONObject.put(sgw.m184137a(new byte[]{94, 7, 92, 82}), string);
        jSONObject.put(sgw.m184137a(new byte[]{84, 7, 69, 82, 62, 7, 84, 2, 84, 83}), strM158759a);
        jSONObject.put(sgw.m184137a(new byte[]{64, 7, 69, 95}), string2);
        jSONObject.put(sgw.m184137a(new byte[]{67, 15, 75, 82}), j3);
        jSONObject.put(sgw.m184137a(new byte[]{93, 15, 92, 82, 62, 18, 73, 22, 84}), string3);
        jSONObject.put(sgw.m184137a(new byte[]{71, 15, 85, 67, 9}), i);
        jSONObject.put(sgw.m184137a(new byte[]{88, 3, 88, 80, 9, 18}), i2);
        jSONObject.put(sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), i3);
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m158762d(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (!jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 117, 62, 101, 114, 51, 40, 113, 42, 110, 100, 53, 41, 98, 39, 118, 114}))) {
            return m158760b(jSONObject);
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{sgw.m184137a(new byte[]{111, 15, 85}), sgw.m184137a(new byte[]{111, 2, 88, 68, 17, 10, 81, 31, 110, 89, 0, 11, 85}), sgw.m184137a(new byte[]{84, 7, 69, 82, 62, 7, 84, 2, 84, 83}), sgw.m184137a(new byte[]{111, 2, 80, 67, 0}), sgw.m184137a(new byte[]{111, 21, 88, 77, 4}), sgw.m184137a(new byte[]{93, 15, 92, 82, 62, 18, 73, 22, 84}), sgw.m184137a(new byte[]{71, 15, 85, 67, 9}), sgw.m184137a(new byte[]{88, 3, 88, 80, 9, 18}), sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15})}, null, null, sgw.m184137a(new byte[]{84, 7, 69, 82, 62, 7, 84, 2, 84, 83, 65, 39, 99, 37}));
            try {
                if (cursorQuery == null) {
                    JSONObject jSONObjectM158760b = m158760b(jSONObject);
                    if (cursorQuery == null) {
                        return jSONObjectM158760b;
                    }
                    cursorQuery.close();
                    return jSONObjectM158760b;
                }
                jSONObject.put(sgw.m184137a(new byte[]{64, 14, 94, 67, 14, 57, 83, 9, 68, 89, 21}), cursorQuery.getCount());
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; cursorQuery.moveToNext() && i < 10; i++) {
                    jSONArray.put(m158761c(cursorQuery));
                }
                jSONObject.put(sgw.m184137a(new byte[]{64, 14, 94, 67, 14, 57, 84, 3, 69, 86, 8, 10, 67}), jSONArray);
                cursorQuery.close();
                return jSONObject;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
