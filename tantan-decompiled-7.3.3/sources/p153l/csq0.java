package p153l;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes2.dex */
public class csq0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private static int f83480a = 1;

    /* JADX INFO: renamed from: b */
    public static final Object f83481b = new Object();

    /* JADX INFO: renamed from: c */
    private static final String[] f83482c = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", HttpHeaderValues.BYTES, " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public csq0(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f83480a);
    }

    /* JADX INFO: renamed from: b */
    private void m112232b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i = 0;
        while (true) {
            String[] strArr = f83482c;
            if (i >= strArr.length - 1) {
                sb.append(");");
                sQLiteDatabase.execSQL(sb.toString());
                return;
            }
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(strArr[i]);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(strArr[i + 1]);
            i += 2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f83481b) {
            try {
                m112232b(sQLiteDatabase);
            } catch (SQLException e) {
                ouq0.m169397q(e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
