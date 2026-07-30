package p153l;

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
public final class cfg0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ agg0 f81510a;

    public cfg0(agg0 agg0Var) {
        this.f81510a = agg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m109538a(SparseArray sparseArray, List list, HashMap map) {
        ArrayList arrayList;
        HashMap map2;
        SparseArray sparseArray2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        izg0 izg0Var = this.f81510a.f71160b;
        synchronized (izg0Var) {
            try {
                SparseArray sparseArray3 = izg0Var.f117696a;
                if ((sparseArray3 == null || sparseArray3.size() <= 0) && (((arrayList = izg0Var.f117701f) == null || arrayList.size() <= 0) && (((map2 = izg0Var.f117697b) == null || map2.size() <= 0) && (((sparseArray2 = izg0Var.f117699d) == null || sparseArray2.size() <= 0) && ((arrayList2 = izg0Var.f117700e) == null || arrayList2.size() <= 0))))) {
                    if (sparseArray != null && izg0Var.f117696a != null) {
                        int i = 0;
                        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                            izg0Var.f117696a.put(sparseArray.keyAt(i2), (bog0) sparseArray.valueAt(i2));
                        }
                        if (izg0Var.f117700e != null) {
                            int size = sparseArray.size();
                            while (true) {
                                arrayList4 = izg0Var.f117700e;
                                if (i >= size) {
                                    break;
                                }
                                arrayList4.add(Integer.valueOf(((bog0) sparseArray.valueAt(i)).f77674a));
                                i++;
                            }
                            Collections.sort(arrayList4);
                        }
                    }
                    if (list != null && (arrayList3 = izg0Var.f117701f) != null) {
                        arrayList3.addAll(list);
                    }
                    if (map != null && izg0Var.f117697b != null) {
                        for (String str : map.keySet()) {
                            izg0Var.f117697b.put(str, (String) map.get(str));
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
        SQLiteDatabase writableDatabase = this.f81510a.f71159a.getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursor5 = null;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM breakpoint", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    arrayList.add(new eug0(cursorRawQuery));
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                }
            }
            Cursor cursorRawQuery2 = writableDatabase.rawQuery("SELECT * FROM block", null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    arrayList2.add(new lrg0(cursorRawQuery2));
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
                eug0 eug0Var = (eug0) obj;
                bog0 bog0Var = new bog0(eug0Var.f95864a, eug0Var.f95865b, new File(eug0Var.f95867d), eug0Var.f95868e, eug0Var.f95869f);
                bog0Var.f77676c = eug0Var.f95866c;
                bog0Var.f77682i = eug0Var.f95870g;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    lrg0 lrg0Var = (lrg0) it.next();
                    if (lrg0Var.f133325a == bog0Var.f77674a) {
                        bog0Var.f77680g.add(new akg0(lrg0Var.f133326b, lrg0Var.f133327c, lrg0Var.f133328d));
                        it.remove();
                        size = size;
                    }
                }
                sparseArray.put(bog0Var.f77674a, bog0Var);
            }
            owg0 owg0Var = this.f81510a.f71159a;
            owg0Var.getClass();
            final ArrayList arrayList3 = new ArrayList();
            try {
                try {
                    Cursor cursorRawQuery3 = owg0Var.getWritableDatabase().rawQuery("SELECT * FROM taskFileDirty", null);
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
                    SQLiteDatabase writableDatabase2 = this.f81510a.f71159a.getWritableDatabase();
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
                        ThreadUtils.postUITask(new Runnable() { // from class: l.peg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f152073a.m109538a(sparseArray, arrayList3, map);
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
