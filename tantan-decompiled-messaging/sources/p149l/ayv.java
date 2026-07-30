package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ayv {

    /* JADX INFO: renamed from: a */
    private static boolean f72308a = false;

    /* JADX INFO: renamed from: b */
    private static cyv f72309b;

    /* JADX INFO: renamed from: a */
    public static cyv m99584a() {
        return f72309b;
    }

    /* JADX INFO: renamed from: b */
    public static void m99585b(Context context, cyv cyvVar) {
        f72309b = cyvVar;
        m99586c(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m99586c(Context context) {
        cyv cyvVar = f72309b;
        boolean z = cyvVar != null;
        boolean z2 = f72308a;
        if (!(z2 ? false : z)) {
            cyvVar = null;
        }
        ilq0.m137045r(new zoq0(cyvVar, z2 ? null : apq0.m98172d(context)));
    }
}
