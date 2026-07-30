package p153l;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public class pde0 {
    /* JADX INFO: renamed from: b */
    public static int m171789b() {
        int i;
        Display defaultDisplay = ((WindowManager) xiw.m211170a().getSystemService(riw.m181611a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            m171788a(Class.forName(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31}))).getMethod(riw.m181611a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
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
    public static int m171790c() {
        int i;
        Display defaultDisplay = ((WindowManager) xiw.m211170a().getSystemService(riw.m181611a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            m171788a(Class.forName(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31}))).getMethod(riw.m181611a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
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
    private static Class<Display> m171788a(Class<?> cls) {
        return cls;
    }
}
