package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class l2x0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @GuardedBy("GservicesDelegateSupplier.class")
    public static g1x0 f129818a;

    /* JADX INFO: renamed from: a */
    public static synchronized g1x0 m152649a() {
        try {
            if (f129818a == null) {
                m152650b(new x4x0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f129818a;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m152650b(g1x0 g1x0Var) {
        if (f129818a != null) {
            throw new IllegalStateException("init() already called");
        }
        f129818a = g1x0Var;
    }
}
