package p153l;

import android.os.Binder;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xix0 {
    /* JADX INFO: renamed from: a */
    public static <V> V m211178a(ylx0<V> ylx0Var) {
        try {
            return ylx0Var.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return ylx0Var.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
