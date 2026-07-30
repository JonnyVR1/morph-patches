package p149l;

import android.os.Binder;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r9x0 {
    /* JADX INFO: renamed from: a */
    public static <V> V m178465a(scx0<V> scx0Var) {
        try {
            return scx0Var.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return scx0Var.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
