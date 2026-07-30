package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class i1c extends SQLiteOpenHelper implements vpl {

    /* JADX INFO: renamed from: l.i1c$b */
    public static class C17616b {
        private static final i1c INSTANCE = new i1c();
    }

    public i1c() {
        super(i4g0.m138507e(), "statistics_store", null, 2);
    }

    /* JADX INFO: renamed from: e */
    public static i1c m138088e() {
        return C17616b.INSTANCE;
    }

    @Override // p153l.vpl
    /* JADX INFO: renamed from: a */
    public List<v4f> mo138089a(String str, int i) {
        String str2;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            String[] strArr = {"_id", "env", NotificationCompat.CATEGORY_EVENT, "seqnum"};
            if (i > 0) {
                str2 = "" + i;
            } else {
                str2 = null;
            }
            cursorQuery = writableDatabase.query(str, strArr, null, null, null, null, null, str2);
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                v4f v4fVar = new v4f();
                v4fVar.f182358a = cursorQuery.getLong(0);
                v4fVar.f182359b = cursorQuery.getString(1);
                v4fVar.f182360c = cursorQuery.getString(2);
                v4fVar.f182361d = cursorQuery.getLong(3);
                arrayList.add(v4fVar);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @Override // p153l.vpl
    /* JADX INFO: renamed from: b */
    public int mo138090b(String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = getWritableDatabase().rawQuery("select count(*) from " + str, null);
            cursorRawQuery.moveToFirst();
            int i = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // p153l.vpl
    /* JADX INFO: renamed from: c */
    public long mo138091c(String str, String str2, long j, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("env", str);
        contentValues.put(NotificationCompat.CATEGORY_EVENT, str2);
        contentValues.put("seqnum", Long.valueOf(j));
        return getWritableDatabase().insert(str3, null, contentValues);
    }

    @Override // p153l.vpl
    /* JADX INFO: renamed from: d */
    public void mo138092d(List<v4f> list, String str) {
        if (te5.m190683a(list) || !i4g0.m138510h()) {
            return;
        }
        getWritableDatabase().beginTransaction();
        try {
            Iterator<v4f> it = list.iterator();
            while (it.hasNext()) {
                getWritableDatabase().delete(str, "_id = ?", new String[]{Long.toString(it.next().f182358a)});
            }
            getWritableDatabase().setTransactionSuccessful();
        } finally {
            getWritableDatabase().endTransaction();
        }
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE normal_logs (_id INTEGER PRIMARY KEY, env TEXT, event TEXT, seqnum INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE at_once_logs (_id INTEGER PRIMARY KEY, env TEXT, event TEXT, seqnum INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sc_logs (_id INTEGER PRIMARY KEY, env TEXT, event TEXT, seqnum INTEGER)");
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sc_logs (_id INTEGER PRIMARY KEY, env TEXT, event TEXT, seqnum INTEGER)");
    }
}
