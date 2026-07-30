package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class xzv {

    /* JADX INFO: renamed from: a */
    private static boolean f196927a = false;

    /* JADX INFO: renamed from: b */
    private static zzv f196928b;

    /* JADX INFO: renamed from: a */
    public static zzv m213820a() {
        return f196928b;
    }

    /* JADX INFO: renamed from: b */
    public static void m213821b(Context context, zzv zzvVar) {
        f196928b = zzvVar;
        m213822c(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m213822c(Context context) {
        zzv zzvVar = f196928b;
        boolean z = zzvVar != null;
        boolean z2 = f196927a;
        if (!(z2 ? false : z)) {
            zzvVar = null;
        }
        ouq0.m169398r(new fyq0(zzvVar, z2 ? null : gyq0.m133007d(context)));
    }
}
