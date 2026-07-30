package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w6k extends SQLiteOpenHelper {
    private Context mContext;

    public w6k(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.mContext = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
    }

    public w6k(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        super(context, str, cursorFactory, i, databaseErrorHandler);
        this.mContext = context;
    }

    @TargetApi(28)
    public w6k(Context context, String str, int i, SQLiteDatabase.OpenParams openParams) {
        super(context, str, i, openParams);
        this.mContext = context;
    }
}
