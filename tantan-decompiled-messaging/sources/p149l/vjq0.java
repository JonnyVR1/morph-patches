package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class vjq0 {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f181744a = false;

    /* JADX INFO: renamed from: a */
    private static void m198683a(Class<?> cls, Context context) {
        if (f181744a) {
            return;
        }
        try {
            f181744a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            ilq0.m137040m("mdid:load lib error " + th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m198684b(Context context) {
        try {
            Class<?> clsM161880c = nwq0.m161880c(context, "com.bun.miitmdid.core.JLibrary");
            if (clsM161880c == null) {
                return false;
            }
            m198683a(clsM161880c, context);
            return true;
        } catch (Throwable th) {
            ilq0.m137040m("mdid:check error " + th);
            return false;
        }
    }
}
