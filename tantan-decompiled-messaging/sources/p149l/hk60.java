package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public class hk60 {
    /* JADX INFO: renamed from: a */
    public static boolean m131458a(Context context, String str) {
        return e16.m114373a(context, str) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m131459b(Context context, String[] strArr) {
        if (context == null || strArr == null || strArr.length <= 0) {
            return false;
        }
        boolean z = true;
        for (String str : strArr) {
            if (e16.m114373a(context, str) != 0) {
                z = false;
            }
        }
        return z;
    }
}
