package p149l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public class x4e0 {
    /* JADX INFO: renamed from: b */
    private static int m206970b(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService(rjw.m179664a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            m206969a(Class.forName(rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31}))).getMethod(rjw.m179664a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
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
    private static int m206971c(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService(rjw.m179664a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            m206969a(Class.forName(rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31}))).getMethod(rjw.m179664a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.widthPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static String m206972d(Context context) {
        return m206970b(context) + rjw.m179664a(new byte[]{72}) + m206971c(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static Class<Display> m206969a(Class<?> cls) {
        return cls;
    }
}
