package p149l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes7.dex */
public class j4e {
    /* JADX INFO: renamed from: a */
    public static int m139643a(Activity activity) {
        if (m139646d()) {
            return m139647e(activity) ? 3 : 4;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static Point m139644b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: c */
    public static float m139645c(Context context, boolean z) {
        Point pointM139644b = m139644b(context);
        return pointM139644b.y / pointM139644b.x;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m139646d() {
        String str = Build.MODEL;
        return "PGU110".equals(str) || "PEUM00".equals(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m139647e(Activity activity) {
        if (activity == null) {
            return false;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        return ((rotation == 1 && i == 2) || (rotation == 0 && i == 1)) ? false : true;
    }
}
