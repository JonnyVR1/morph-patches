package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class kcy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static fcy0 f125118a;

    /* JADX INFO: renamed from: a */
    public static synchronized lay0 m149141a(n9y0 n9y0Var) {
        try {
            if (f125118a == null) {
                f125118a = new fcy0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (lay0) f125118a.m205622b(n9y0Var);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized lay0 m149142b(String str) {
        return m149141a(n9y0.m162051d(str).mo96502c());
    }
}
