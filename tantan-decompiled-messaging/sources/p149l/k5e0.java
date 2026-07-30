package p149l;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public class k5e0 {
    /* JADX INFO: renamed from: b */
    public static int m144530b() {
        int i;
        Display defaultDisplay = ((WindowManager) ygw.m214775a().getSystemService(sgw.m184137a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            m144529a(Class.forName(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31}))).getMethod(sgw.m184137a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static int m144531c() {
        int i;
        Display defaultDisplay = ((WindowManager) ygw.m214775a().getSystemService(sgw.m184137a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            m144529a(Class.forName(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31}))).getMethod(sgw.m184137a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.widthPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static Class<Display> m144529a(Class<?> cls) {
        return cls;
    }
}
