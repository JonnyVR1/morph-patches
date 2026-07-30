package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class e3y0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static z2y0 f89230a;

    /* JADX INFO: renamed from: a */
    public static synchronized f1y0 m114642a(h0y0 h0y0Var) {
        try {
            if (f89230a == null) {
                f89230a = new z2y0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f1y0) f89230a.m192148b(h0y0Var);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized f1y0 m114643b(String str) {
        return m114642a(h0y0.m128989d(str).mo109559c());
    }
}
