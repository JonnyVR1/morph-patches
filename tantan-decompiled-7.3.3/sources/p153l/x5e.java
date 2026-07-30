package p153l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes7.dex */
public class x5e {
    /* JADX INFO: renamed from: a */
    public static int m209357a(Activity activity) {
        if (m209360d()) {
            return m209361e(activity) ? 3 : 4;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static Point m209358b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: c */
    public static float m209359c(Context context, boolean z) {
        Point pointM209358b = m209358b(context);
        return pointM209358b.y / pointM209358b.x;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m209360d() {
        String str = Build.MODEL;
        return "PGU110".equals(str) || "PEUM00".equals(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m209361e(Activity activity) {
        if (activity == null) {
            return false;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        return ((rotation == 1 && i == 2) || (rotation == 0 && i == 1)) ? false : true;
    }
}
