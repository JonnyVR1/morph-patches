package p153l;

import Sudchar.Sudbyte;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class agg0 implements ehg0 {

    /* JADX INFO: renamed from: a */
    public final owg0 f71159a;

    /* JADX INFO: renamed from: b */
    public final izg0 f71160b = new izg0();

    public agg0(Context context) {
        this.f71159a = new owg0(context.getApplicationContext());
        new cfg0(this).start();
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: a */
    public final void mo97629a() {
        this.f71160b.getClass();
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: b */
    public final boolean mo97630b(bog0 bog0Var) throws Throwable {
        boolean zMo97630b = this.f71160b.mo97630b(bog0Var);
        owg0 owg0Var = this.f71159a;
        SQLiteDatabase writableDatabase = owg0Var.getWritableDatabase();
        writableDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = owg0Var.getWritableDatabase().rawQuery("SELECT id FROM breakpoint WHERE id = ? LIMIT 1", new String[]{Integer.toString(bog0Var.f77674a)});
            try {
                if (cursorRawQuery.moveToNext()) {
                    int i = bog0Var.f77674a;
                    owg0Var.getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i)});
                    owg0Var.getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i)});
                    owg0Var.m169564b(bog0Var);
                    writableDatabase.setTransactionSuccessful();
                    cursorRawQuery.close();
                    writableDatabase.endTransaction();
                } else {
                    cursorRawQuery.close();
                    writableDatabase.endTransaction();
                }
                String str = bog0Var.f77679f.f136848a;
                bog0Var.toString();
                if (!bog0Var.f77681h || str == null) {
                    return zMo97630b;
                }
                owg0 owg0Var2 = this.f71159a;
                String str2 = bog0Var.f77675b;
                SQLiteDatabase writableDatabase2 = owg0Var2.getWritableDatabase();
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
                return zMo97630b;
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

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: c */
    public final bog0 mo97631c(aug0 aug0Var) throws Sudbyte {
        bog0 bog0VarMo97631c = this.f71160b.mo97631c(aug0Var);
        this.f71159a.m169564b(bog0VarMo97631c);
        return bog0VarMo97631c;
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: d */
    public final boolean mo97632d(int i) {
        if (!this.f71160b.mo97632d(i)) {
            return false;
        }
        this.f71159a.getWritableDatabase().delete("taskFileDirty", "id = ?", new String[]{String.valueOf(i)});
        return true;
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: e */
    public final void mo97633e(int i, int i2) {
        izg0 izg0Var = this.f71160b;
        if (i2 == 1) {
            izg0Var.remove(i);
        } else {
            izg0Var.getClass();
        }
        if (i2 == 1) {
            owg0 owg0Var = this.f71159a;
            owg0Var.getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i)});
            owg0Var.getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i)});
        }
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: f */
    public final boolean mo97634f(int i) {
        if (!this.f71160b.mo97634f(i)) {
            return false;
        }
        SQLiteDatabase writableDatabase = this.f71159a.getWritableDatabase();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("id", Integer.valueOf(i));
        writableDatabase.insert("taskFileDirty", null, contentValues);
        return true;
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: g */
    public final void mo97635g(bog0 bog0Var, int i, long j) {
        this.f71160b.mo97635g(bog0Var, i, j);
        long j2 = ((akg0) bog0Var.f77680g.get(i)).f72005c.get();
        owg0 owg0Var = this.f71159a;
        owg0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_offset", Long.valueOf(j2));
        owg0Var.getWritableDatabase().update("block", contentValues, "breakpoint_id = ? AND block_index = ?", new String[]{Integer.toString(bog0Var.f77674a), Integer.toString(i)});
    }

    @Override // p153l.ehg0
    public final bog0 get(int i) {
        return (bog0) this.f71160b.f117696a.get(i);
    }

    @Override // p153l.ehg0
    public final void remove(int i) {
        this.f71160b.remove(i);
        owg0 owg0Var = this.f71159a;
        owg0Var.getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i)});
        owg0Var.getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i)});
    }
}
