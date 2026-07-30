package p149l;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tech.sud.gip.base.ThreadUtils;

/* JADX INFO: loaded from: classes.dex */
public final class u6g0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s7g0 f174838a;

    public u6g0(s7g0 s7g0Var) {
        this.f174838a = s7g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m191975a(SparseArray sparseArray, List list, HashMap map) {
        ArrayList arrayList;
        HashMap map2;
        SparseArray sparseArray2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        arg0 arg0Var = this.f174838a.f162913b;
        synchronized (arg0Var) {
            try {
                SparseArray sparseArray3 = arg0Var.f71265a;
                if ((sparseArray3 == null || sparseArray3.size() <= 0) && (((arrayList = arg0Var.f71270f) == null || arrayList.size() <= 0) && (((map2 = arg0Var.f71266b) == null || map2.size() <= 0) && (((sparseArray2 = arg0Var.f71268d) == null || sparseArray2.size() <= 0) && ((arrayList2 = arg0Var.f71269e) == null || arrayList2.size() <= 0))))) {
                    if (sparseArray != null && arg0Var.f71265a != null) {
                        int i = 0;
                        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                            arg0Var.f71265a.put(sparseArray.keyAt(i2), (tfg0) sparseArray.valueAt(i2));
                        }
                        if (arg0Var.f71269e != null) {
                            int size = sparseArray.size();
                            while (true) {
                                arrayList4 = arg0Var.f71269e;
                                if (i >= size) {
                                    break;
                                }
                                arrayList4.add(Integer.valueOf(((tfg0) sparseArray.valueAt(i)).f169975a));
                                i++;
                            }
                            Collections.sort(arrayList4);
                        }
                    }
                    if (list != null && (arrayList3 = arg0Var.f71270f) != null) {
                        arrayList3.addAll(list);
                    }
                    if (map != null && arg0Var.f71266b != null) {
                        for (String str : map.keySet()) {
                            arg0Var.f71266b.put(str, (String) map.get(str));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        super.run();
        SQLiteDatabase writableDatabase = this.f174838a.f162912a.getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursor5 = null;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM breakpoint", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    arrayList.add(new wlg0(cursorRawQuery));
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                }
            }
            Cursor cursorRawQuery2 = writableDatabase.rawQuery("SELECT * FROM block", null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    arrayList2.add(new djg0(cursorRawQuery2));
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorRawQuery2;
                    cursor5 = cursorRawQuery;
                    if (cursor5 != null) {
                        cursor5.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            cursorRawQuery.close();
            cursorRawQuery2.close();
            final SparseArray sparseArray = new SparseArray();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                wlg0 wlg0Var = (wlg0) obj;
                tfg0 tfg0Var = new tfg0(wlg0Var.f186896a, wlg0Var.f186897b, new File(wlg0Var.f186899d), wlg0Var.f186900e, wlg0Var.f186901f);
                tfg0Var.f169977c = wlg0Var.f186898c;
                tfg0Var.f169983i = wlg0Var.f186902g;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    djg0 djg0Var = (djg0) it.next();
                    if (djg0Var.f86534a == tfg0Var.f169975a) {
                        tfg0Var.f169981g.add(new sbg0(djg0Var.f86535b, djg0Var.f86536c, djg0Var.f86537d));
                        it.remove();
                        size = size;
                    }
                }
                sparseArray.put(tfg0Var.f169975a, tfg0Var);
            }
            gog0 gog0Var = this.f174838a.f162912a;
            gog0Var.getClass();
            final ArrayList arrayList3 = new ArrayList();
            try {
                try {
                    Cursor cursorRawQuery3 = gog0Var.getWritableDatabase().rawQuery("SELECT * FROM taskFileDirty", null);
                    while (cursorRawQuery3.moveToNext()) {
                        try {
                            arrayList3.add(Integer.valueOf(cursorRawQuery3.getInt(cursorRawQuery3.getColumnIndex("id"))));
                        } catch (Throwable th3) {
                            th = th3;
                            cursor3 = cursorRawQuery3;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    }
                    cursorRawQuery3.close();
                    SQLiteDatabase writableDatabase2 = this.f174838a.f162912a.getWritableDatabase();
                    final HashMap map = new HashMap();
                    try {
                        Cursor cursorRawQuery4 = writableDatabase2.rawQuery("SELECT * FROM okdownloadResponseFilename", null);
                        while (cursorRawQuery4.moveToNext()) {
                            try {
                                map.put(cursorRawQuery4.getString(cursorRawQuery4.getColumnIndex("url")), cursorRawQuery4.getString(cursorRawQuery4.getColumnIndex("filename")));
                            } catch (Throwable th4) {
                                th = th4;
                                cursor4 = cursorRawQuery4;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                throw th;
                            }
                        }
                        cursorRawQuery4.close();
                        ThreadUtils.postUITask(new Runnable() { // from class: l.h6g0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f106056a.m191975a(sparseArray, arrayList3, map);
                            }
                        });
                    } catch (Throwable th5) {
                        th = th5;
                        cursor4 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    cursor2 = null;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                cursor2 = null;
            }
        } catch (Throwable th8) {
            th = th8;
            cursor = null;
        }
    }
}
