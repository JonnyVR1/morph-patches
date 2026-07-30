package p153l;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes8.dex */
public class ode0 {
    /* JADX INFO: renamed from: a */
    public static int m167293a() {
        int i;
        Display defaultDisplay = ((WindowManager) fiw.m125761a().getSystemService(hmw.m136007a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName(hmw.m136007a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31})).getMethod(hmw.m136007a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m167294b() {
        int i;
        Display defaultDisplay = ((WindowManager) fiw.m125761a().getSystemService(hmw.m136007a(new byte[]{71, 15, 95, 83, 14, 17}))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName(hmw.m136007a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 34, 88, 68, 17, 10, 81, 31})).getMethod(hmw.m136007a(new byte[]{87, 3, 69, 101, 4, 7, 92, 43, 84, 67, 19, 15, 83, 21}), DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.widthPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }
}
