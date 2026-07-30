package p149l;

import android.database.Cursor;
import android.net.Uri;
import android.os.StatFs;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class qlg0 {
    /* JADX INFO: renamed from: a */
    public static long m175478a(Uri uri) {
        Cursor cursorQuery = bog0.m102944a().f76522h.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return 0L;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m175479b(StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    /* JADX INFO: renamed from: c */
    public static void m175480c(Map map, ujg0 ujg0Var) throws IOException {
        if (map.containsKey("If-Match") || map.containsKey("Range")) {
            rhg0.m179353a("If-Match and Range only can be handle by internal!");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                ((jmg0) ujg0Var).f118633b.m185882a(str, (String) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m175481d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
