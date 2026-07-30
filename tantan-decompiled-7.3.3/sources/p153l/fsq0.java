package p153l;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class fsq0<T> {

    /* JADX INFO: renamed from: a */
    protected final String f100681a = "_id";

    /* JADX INFO: renamed from: b */
    protected final String f100682b;

    public fsq0(String str) {
        this.f100682b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract ContentValues mo127234a(T t);

    /* JADX INFO: renamed from: b */
    public abstract HashMap<String, String> mo127235b();

    /* JADX INFO: renamed from: c */
    public void m127236c(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f100682b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mapMo127235b = mo127235b();
            if (mapMo127235b != null) {
                for (String str : mapMo127235b.keySet()) {
                    sb.append(str);
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(mapMo127235b.get(str));
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m127237d(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f100682b, null, mo127234a(t));
        } catch (Throwable th) {
            q5r0.m175517g(th);
        }
    }
}
