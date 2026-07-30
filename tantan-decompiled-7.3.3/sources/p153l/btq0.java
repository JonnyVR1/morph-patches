package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class btq0 {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f78391a = false;

    /* JADX INFO: renamed from: a */
    private static void m106378a(Class<?> cls, Context context) {
        if (f78391a) {
            return;
        }
        try {
            f78391a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            ouq0.m169393m("mdid:load lib error " + th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106379b(Context context) {
        try {
            Class<?> clsM189419c = t5r0.m189419c(context, "com.bun.miitmdid.core.JLibrary");
            if (clsM189419c == null) {
                return false;
            }
            m106378a(clsM189419c, context);
            return true;
        } catch (Throwable th) {
            ouq0.m169393m("mdid:check error " + th);
            return false;
        }
    }
}
