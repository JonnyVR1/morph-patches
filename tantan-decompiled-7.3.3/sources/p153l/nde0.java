package p153l;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class nde0 {

    /* JADX INFO: renamed from: a */
    public static volatile int f141486a;

    /* JADX INFO: renamed from: a */
    public static int m162697a(Context context) {
        try {
            if (f141486a <= 0) {
                f141486a = m162699c(context.getApplicationContext());
                if (f141486a <= 0) {
                    f141486a = m162698b(context);
                }
            }
        } catch (Throwable th) {
            Log.e("MKScreenUtil", "", th);
        }
        return f141486a;
    }

    /* JADX INFO: renamed from: b */
    private static int m162698b(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
        } catch (Throwable th) {
            Log.e("MKScreenUtil", "", th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m162699c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
