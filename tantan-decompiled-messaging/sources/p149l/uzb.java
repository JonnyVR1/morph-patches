package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class uzb extends SQLiteOpenHelper implements knl {

    /* JADX INFO: renamed from: l.uzb$b */
    public static class C20547b {
        private static final uzb INSTANCE = new uzb();
    }

    public uzb() {
        super(zvf0.m220383e(), "statistics_store", null, 2);
    }

    /* JADX INFO: renamed from: e */
    public static uzb m196397e() {
        return C20547b.INSTANCE;
    }

    @Override // p149l.knl
    /* JADX INFO: renamed from: a */
    public List<r3f> mo146570a(String str, int i) {
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
                r3f r3fVar = new r3f();
                r3fVar.f157526a = cursorQuery.getLong(0);
                r3fVar.f157527b = cursorQuery.getString(1);
                r3fVar.f157528c = cursorQuery.getString(2);
                r3fVar.f157529d = cursorQuery.getLong(3);
                arrayList.add(r3fVar);
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

    @Override // p149l.knl
    /* JADX INFO: renamed from: b */
    public int mo146571b(String str) {
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

    @Override // p149l.knl
    /* JADX INFO: renamed from: c */
    public long mo146572c(String str, String str2, long j, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("env", str);
        contentValues.put(NotificationCompat.CATEGORY_EVENT, str2);
        contentValues.put("seqnum", Long.valueOf(j));
        return getWritableDatabase().insert(str3, null, contentValues);
    }

    @Override // p149l.knl
    /* JADX INFO: renamed from: d */
    public void mo146573d(List<r3f> list, String str) {
        if (td5.m188065a(list) || !zvf0.m220386h()) {
            return;
        }
        getWritableDatabase().beginTransaction();
        try {
            Iterator<r3f> it = list.iterator();
            while (it.hasNext()) {
                getWritableDatabase().delete(str, "_id = ?", new String[]{Long.toString(it.next().f157526a)});
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
