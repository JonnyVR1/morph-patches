package p153l;

import Sudchar.Sudbyte;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes.dex */
public final class owg0 extends SQLiteOpenHelper {
    public owg0(Context context) {
        super(context, "sud-okdownload-breakpoint.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m169564b(bog0 bog0Var) throws Sudbyte {
        int size = bog0Var.f77680g.size();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        for (int i = 0; i < size; i++) {
            akg0 akg0Var = (akg0) bog0Var.f77680g.get(i);
            int i2 = bog0Var.f77674a;
            ContentValues contentValues = new ContentValues();
            contentValues.put("breakpoint_id", Integer.valueOf(i2));
            contentValues.put("block_index", Integer.valueOf(i));
            contentValues.put("start_offset", Long.valueOf(akg0Var.f72003a));
            contentValues.put("content_length", Long.valueOf(akg0Var.f72004b));
            contentValues.put("current_offset", Long.valueOf(akg0Var.f72005c.get()));
            if (writableDatabase.insert("block", null, contentValues) == -1) {
                throw new Sudbyte("insert block " + akg0Var + " failed!");
            }
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Integer.valueOf(bog0Var.f77674a));
        contentValues2.put("url", bog0Var.f77675b);
        contentValues2.put("etag", bog0Var.f77676c);
        contentValues2.put("parent_path", bog0Var.f77677d.getAbsolutePath());
        contentValues2.put("filename", bog0Var.f77679f.f136848a);
        contentValues2.put("task_only_parent_path", Integer.valueOf(bog0Var.f77681h ? 1 : 0));
        contentValues2.put(HttpHeaderValues.CHUNKED, Integer.valueOf(bog0Var.f77682i ? 1 : 0));
        if (writableDatabase.insert("breakpoint", null, contentValues2) != -1) {
            return;
        }
        throw new Sudbyte("insert info " + bog0Var + " failed!");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS breakpoint( id INTEGER PRIMARY KEY, url VARCHAR NOT NULL, etag VARCHAR, parent_path VARCHAR NOT NULL, filename VARCHAR, task_only_parent_path TINYINT(1) DEFAULT 0, chunked TINYINT(1) DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS block( id INTEGER PRIMARY KEY AUTOINCREMENT, breakpoint_id INTEGER, block_index INTEGER, start_offset INTEGER, content_length INTEGER, current_offset INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        setWriteAheadLoggingEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        }
        if (i <= 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
