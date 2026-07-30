package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.measurement.zzcj;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lat0 extends SQLiteOpenHelper {
    public lat0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, vct0 vct0Var) {
        super(context, (str == null || y3t0.m212856a().mo162947d(str, vct0Var, zzcj.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public lat0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, null, 1, vct0.f180985a);
    }
}
