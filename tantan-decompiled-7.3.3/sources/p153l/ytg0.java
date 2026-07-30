package p153l;

import android.database.Cursor;
import android.net.Uri;
import android.os.StatFs;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ytg0 {
    /* JADX INFO: renamed from: a */
    public static long m217309a(Uri uri) {
        Cursor cursorQuery = jwg0.m147162a().f122926h.getContentResolver().query(uri, null, null, null, null);
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
    public static long m217310b(StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    /* JADX INFO: renamed from: c */
    public static void m217311c(Map map, csg0 csg0Var) throws IOException {
        if (map.containsKey("If-Match") || map.containsKey("Range")) {
            zpg0.m220844a("If-Match and Range only can be handle by internal!");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                ((rug0) csg0Var).f164919b.m209027a(str, (String) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m217312d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
