package p153l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.measurement.zzcj;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rjt0 extends SQLiteOpenHelper {
    public rjt0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, bmt0 bmt0Var) {
        super(context, (str == null || edt0.m120520a().mo115815d(str, bmt0Var, zzcj.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public rjt0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, null, 1, bmt0.f77405a);
    }
}
