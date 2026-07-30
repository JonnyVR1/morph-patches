package p153l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.safety.exception.IgnoreException;

/* JADX INFO: loaded from: classes11.dex */
public class k1c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    public static k1c f123473b;

    /* JADX INFO: renamed from: a */
    public final int f123474a;

    public k1c(@Nullable Context context, int i, int i2) {
        super(context, "global_exceptions", (SQLiteDatabase.CursorFactory) null, i);
        this.f123474a = i2;
    }

    /* JADX INFO: renamed from: k */
    public static k1c m147854k() {
        return f123473b;
    }

    /* JADX INFO: renamed from: n */
    public static void m147855n(Context context) {
        if (f123473b == null) {
            try {
                k1c k1cVar = new k1c(context, 1, yx0.m217667b(context));
                f123473b = k1cVar;
                m6f.m157215a(k1cVar.f123474a);
                qtb.m177907a(f123473b.f123474a);
                f9r.m124682a(f123473b.f123474a);
            } catch (Exception e) {
                throw new IgnoreException("异常事件记录库创建失败！", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public int m147856m() {
        return this.f123474a;
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
