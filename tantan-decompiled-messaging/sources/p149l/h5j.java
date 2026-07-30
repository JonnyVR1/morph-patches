package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.immomo.mmutil.log.Log4Android;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

/* JADX INFO: loaded from: classes7.dex */
public class h5j extends DatabaseOpenHelper {
    public h5j(Context context, String str) {
        super(context, str, 1);
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
    public void onCreate(Database database) {
        Log4Android.m18417f().m18423g("greenDAO Creating framework tables for schema version 1");
        k2c.m144274a(database, false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log4Android.m18417f().m18423g("greenDAO downgrade schema from version " + i + " to " + i2 + " by dropping all tables");
        k2c.m144275b(wrap(sQLiteDatabase), true);
        onCreate(sQLiteDatabase);
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
    public void onUpgrade(Database database, int i, int i2) {
        Log4Android.m18417f().m18423g("greenDAO Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
        k2c.m144275b(database, true);
        onCreate(database);
    }
}
