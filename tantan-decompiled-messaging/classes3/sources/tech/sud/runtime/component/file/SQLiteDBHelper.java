package tech.sud.runtime.component.file;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class SQLiteDBHelper {

    /* JADX INFO: renamed from: a */
    private static Map<Integer, SQLiteDatabase> f11370a = new HashMap(5);

    /* JADX INFO: renamed from: b */
    private static int f11371b = 0;

    public static void addColumn(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " ");
    }

    public static void clear() {
        Iterator<Map.Entry<Integer, SQLiteDatabase>> it = f11370a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().close();
        }
        f11370a.clear();
    }

    public static void close(int i) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.close();
        f11370a.remove(Integer.valueOf(i));
    }

    public static boolean columnExists(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        boolean z = false;
        if (sQLiteDatabase == null) {
            return false;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query(str, new String[]{str2}, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.getColumnIndex(str2) >= 0) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static long count(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return -1L;
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select count(*) ".concat(str2.isEmpty() ? "" : "where id=".concat(str2)), null);
            long j = (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) ? 0L : cursorRawQuery.getInt(0);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public static int execSQL(int i, String str) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return -1;
        }
        try {
            sQLiteDatabase.execSQL(str);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String getPrimaryKey(int i, String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        String columnName = "";
        if (sQLiteDatabase == null) {
            return "";
        }
        try {
            cursorQuery = sQLiteDatabase.query(str, null, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() >= 0) {
                        cursorQuery.moveToFirst();
                        columnName = cursorQuery.getColumnName(0);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery == null) {
                        throw th;
                    }
                    cursorQuery.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return columnName;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    public static int getVersion(int i) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return -1;
        }
        return sQLiteDatabase.getVersion();
    }

    public static int open(String str) {
        int i = f11371b + 1;
        f11371b = i;
        if (!f11370a.containsKey(Integer.valueOf(i))) {
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                return -1;
            }
            f11370a.put(Integer.valueOf(i), sQLiteDatabaseOpenOrCreateDatabase);
        }
        return i;
    }

    public static String query(int i, String str, String str2, String str3, boolean z) {
        return query2(i, str, null, str2 + "=" + str3);
    }

    public static String query2(int i, String str, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        String str4 = "";
        if (sQLiteDatabase == null) {
            return "";
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = str2.isEmpty() ? sQLiteDatabase.query(false, str, null, str3, null, null, null, null, null) : sQLiteDatabase.query(false, str, new String[]{str2}, str3, null, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                String str5 = "[";
                do {
                    String str6 = str5 + "{";
                    for (int i2 = 0; i2 < cursorQuery.getColumnCount(); i2++) {
                        if (i2 > 0) {
                            str6 = str6 + ",";
                        }
                        str6 = str6 + '\"' + cursorQuery.getColumnName(i2) + "\":" + cursorQuery.getString(i2);
                    }
                    str5 = str6 + "},";
                } while (cursorQuery.moveToNext());
                str4 = str5.substring(0, str5.length() - 1) + ']';
            }
            return str4;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static void setVersion(int i, int i2) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.setVersion(i2);
    }

    public static String sqliteStorageQueryItem(int i, String str) throws Throwable {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        Cursor cursor = null;
        string = null;
        String string = null;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.moveToNext()) {
                        string = cursorRawQuery.getString(0);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String sqliteStorageQueryList(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        if (sQLiteDatabase == null) {
            return "";
        }
        Cursor cursorRawQuery = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("limitSize", 10240);
            File file = new File(str);
            jSONObject.put("currentSize", file.exists() ? file.length() / IjkMediaMeta.AV_CH_SIDE_RIGHT : 2L);
            JSONArray jSONArray = new JSONArray();
            cursorRawQuery = sQLiteDatabase.rawQuery(str2, null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    jSONArray.put(cursorRawQuery.getString(0));
                }
            }
            jSONObject.put("keys", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public static boolean tableExists(int i, String str) {
        SQLiteDatabase sQLiteDatabase = f11370a.get(Integer.valueOf(i));
        boolean z = false;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '" + str + "'", null);
            if (cursorRawQuery != null && cursorRawQuery.getCount() >= 0) {
                z = true;
            }
            return z;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }
}
