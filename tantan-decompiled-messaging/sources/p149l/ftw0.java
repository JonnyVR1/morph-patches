package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ftw0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @GuardedBy("GservicesDelegateSupplier.class")
    public static asw0 f99288a;

    /* JADX INFO: renamed from: a */
    public static synchronized asw0 m123122a() {
        try {
            if (f99288a == null) {
                m123123b(new rvw0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f99288a;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m123123b(asw0 asw0Var) {
        if (f99288a != null) {
            throw new IllegalStateException("init() already called");
        }
        f99288a = asw0Var;
    }
}
