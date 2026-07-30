package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.safety.exception.IgnoreException;

/* JADX INFO: loaded from: classes13.dex */
public class xzb extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    public static xzb f195183b;

    /* JADX INFO: renamed from: a */
    public final int f195184a;

    public xzb(@Nullable Context context, int i, int i2) {
        super(context, "global_exceptions", (SQLiteDatabase.CursorFactory) null, i);
        this.f195184a = i2;
    }

    /* JADX INFO: renamed from: k */
    public static xzb m211950k() {
        return f195183b;
    }

    /* JADX INFO: renamed from: n */
    public static void m211951n(Context context) {
        if (f195183b == null) {
            try {
                xzb xzbVar = new xzb(context, 1, rx0.m181465b(context));
                f195183b = xzbVar;
                i5f.m134475a(xzbVar.f195184a);
                csb.m108487a(f195183b.f195184a);
                e7r.m115205a(f195183b.f195184a);
            } catch (Exception e) {
                throw new IgnoreException("异常事件记录库创建失败！", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public int m211952m() {
        return this.f195184a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE exception (className Text,methodName Text,lineNumber INTEGER,version INTEGER,fileName Text)");
        sQLiteDatabase.execSQL("CREATE TABLE crash (counter INTEGER,version INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE launchRecord (counter INTEGER,version INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
