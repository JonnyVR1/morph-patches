package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.immomo.mmutil.log.Log4Android;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class khw extends DatabaseOpenHelper {
    public khw(Context context, String str) {
        super(context, str, 1);
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
    public void onCreate(Database database) {
        Log4Android.m18417f().m18423g("greenDAO Creating tables for schema version 1");
        j2c.m139424a(database, true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mhw.m154641a(wrap(sQLiteDatabase), i, i2);
        onCreate(sQLiteDatabase);
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
    public void onUpgrade(Database database, int i, int i2) {
        mhw.m154642b(database, i, i2);
        onCreate(database);
    }
}
