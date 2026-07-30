package p149l;

import Sudchar.Sudbyte;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class s7g0 implements w8g0 {

    /* JADX INFO: renamed from: a */
    public final gog0 f162912a;

    /* JADX INFO: renamed from: b */
    public final arg0 f162913b = new arg0();

    public s7g0(Context context) {
        this.f162912a = new gog0(context.getApplicationContext());
        new u6g0(this).start();
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: a */
    public final void mo98390a() {
        this.f162913b.getClass();
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: b */
    public final boolean mo98391b(tfg0 tfg0Var) throws Throwable {
        boolean zMo98391b = this.f162913b.mo98391b(tfg0Var);
        gog0 gog0Var = this.f162912a;
        SQLiteDatabase writableDatabase = gog0Var.getWritableDatabase();
        writableDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = gog0Var.getWritableDatabase().rawQuery("SELECT id FROM breakpoint WHERE id = ? LIMIT 1", new String[]{Integer.toString(tfg0Var.f169975a)});
            try {
                if (cursorRawQuery.moveToNext()) {
                    int i = tfg0Var.f169975a;
                    gog0Var.getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i)});
                    gog0Var.getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i)});
                    gog0Var.m127244b(tfg0Var);
                    writableDatabase.setTransactionSuccessful();
                    cursorRawQuery.close();
                    writableDatabase.endTransaction();
                } else {
                    cursorRawQuery.close();
                    writableDatabase.endTransaction();
                }
                String str = tfg0Var.f169980f.f90099a;
                tfg0Var.toString();
                if (!tfg0Var.f169982h || str == null) {
                    return zMo98391b;
                }
                gog0 gog0Var2 = this.f162912a;
                String str2 = tfg0Var.f169976b;
                SQLiteDatabase writableDatabase2 = gog0Var2.getWritableDatabase();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("url", str2);
                contentValues.put("filename", str);
                synchronized (str2.intern()) {
                    try {
                        try {
                            Cursor cursorRawQuery2 = writableDatabase2.rawQuery("SELECT filename FROM okdownloadResponseFilename WHERE url = ?", new String[]{str2});
                            try {
                                if (!cursorRawQuery2.moveToFirst()) {
                                    writableDatabase2.insert("okdownloadResponseFilename", null, contentValues);
                                } else if (!str.equals(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("filename")))) {
                                    writableDatabase2.replace("okdownloadResponseFilename", null, contentValues);
                                }
                                cursorRawQuery2.close();
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return zMo98391b;
            } catch (Throwable th4) {
                th = th4;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: c */
    public final tfg0 mo98392c(slg0 slg0Var) throws Sudbyte {
        tfg0 tfg0VarMo98392c = this.f162913b.mo98392c(slg0Var);
        this.f162912a.m127244b(tfg0VarMo98392c);
        return tfg0VarMo98392c;
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: d */
    public final boolean mo98393d(int i) {
        if (!this.f162913b.mo98393d(i)) {
            return false;
        }
        this.f162912a.getWritableDatabase().delete("taskFileDirty", "id = ?", new String[]{String.valueOf(i)});
        return true;
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: e */
    public final void mo98394e(int i, int i2) {
        arg0 arg0Var = this.f162913b;
        if (i2 == 1) {
            arg0Var.remove(i);
        } else {
            arg0Var.getClass();
        }
        if (i2 == 1) {
            gog0 gog0Var = this.f162912a;
            gog0Var.getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i)});
            gog0Var.getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i)});
        }
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: f */
    public final boolean mo98395f(int i) {
        if (!this.f162913b.mo98395f(i)) {
            return false;
        }
        SQLiteDatabase writableDatabase = this.f162912a.getWritableDatabase();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("id", Integer.valueOf(i));
        writableDatabase.insert("taskFileDirty", null, contentValues);
        return true;
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: g */
    public final void mo98396g(tfg0 tfg0Var, int i, long j) {
        this.f162913b.mo98396g(tfg0Var, i, j);
        long j2 = ((sbg0) tfg0Var.f169981g.get(i)).f163536c.get();
        gog0 gog0Var = this.f162912a;
        gog0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_offset", Long.valueOf(j2));
        gog0Var.getWritableDatabase().update("block", contentValues, "breakpoint_id = ? AND block_index = ?", new String[]{Integer.toString(tfg0Var.f169975a), Integer.toString(i)});
    }

    @Override // p149l.w8g0
    public final tfg0 get(int i) {
        return (tfg0) this.f162913b.f71265a.get(i);
    }

    @Override // p149l.w8g0
    public final void remove(int i) {
        this.f162913b.remove(i);
        gog0 gog0Var = this.f162912a;
        gog0Var.getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i)});
        gog0Var.getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i)});
    }
}
