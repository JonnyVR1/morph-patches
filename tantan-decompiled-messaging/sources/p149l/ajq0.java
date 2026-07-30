package p149l;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ajq0<T> {

    /* JADX INFO: renamed from: a */
    protected final String f70133a = "_id";

    /* JADX INFO: renamed from: b */
    protected final String f70134b;

    public ajq0(String str) {
        this.f70134b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract ContentValues mo97005a(T t);

    /* JADX INFO: renamed from: b */
    public abstract HashMap<String, String> mo97006b();

    /* JADX INFO: renamed from: c */
    public void m97007c(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f70134b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mapMo97006b = mo97006b();
            if (mapMo97006b != null) {
                for (String str : mapMo97006b.keySet()) {
                    sb.append(str);
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(mapMo97006b.get(str));
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m97008d(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f70134b, null, mo97005a(t));
        } catch (Throwable th) {
            kwq0.m147634g(th);
        }
    }
}
