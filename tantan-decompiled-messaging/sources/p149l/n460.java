package p149l;

import android.database.Cursor;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class n460 {

    /* JADX INFO: renamed from: a */
    public String f137040a;

    /* JADX INFO: renamed from: b */
    public long f137041b;

    /* JADX INFO: renamed from: c */
    public long f137042c;

    /* JADX INFO: renamed from: d */
    public int f137043d = 0;

    public n460(String str) {
        this.f137040a = str;
    }

    /* JADX INFO: renamed from: a */
    public static n460 m157803a(Cursor cursor) {
        if (cursor == null || cursor.isClosed() || cursor.getCount() == 0 || cursor.getColumnCount() == 0) {
            return null;
        }
        cursor.moveToFirst();
        String string = cursor.getString(cursor.getColumnIndex("_id"));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        n460 n460Var = new n460(string);
        n460Var.f137041b = cursor.getLong(cursor.getColumnIndex("visit"));
        n460Var.f137042c = cursor.getLong(cursor.getColumnIndex("checkupdate"));
        n460Var.f137043d = cursor.getInt(cursor.getColumnIndex("asymEncrypt"));
        return n460Var;
    }

    public String toString() {
        return "bid=" + this.f137040a + ";lastVisitTime=" + this.f137041b;
    }
}
