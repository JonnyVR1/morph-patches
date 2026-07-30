package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class cwy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static awy0 f84156a;

    /* JADX INFO: renamed from: a */
    public static synchronized jvy0 m112946a(avy0 avy0Var) {
        try {
            if (f84156a == null) {
                f84156a = new awy0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (jvy0) f84156a.m205622b(avy0Var);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized jvy0 m112947b(String str) {
        return m112946a(avy0.m100556d("common").mo217351c());
    }
}
