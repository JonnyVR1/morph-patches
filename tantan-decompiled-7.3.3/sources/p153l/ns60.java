package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class ns60 {
    /* JADX INFO: renamed from: a */
    public static boolean m164558a(Context context, String str) {
        return j26.m143188a(context, str) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m164559b(Context context, String[] strArr) {
        if (context == null || strArr == null || strArr.length <= 0) {
            return false;
        }
        boolean z = true;
        for (String str : strArr) {
            if (j26.m143188a(context, str) != 0) {
                z = false;
            }
        }
        return z;
    }
}
