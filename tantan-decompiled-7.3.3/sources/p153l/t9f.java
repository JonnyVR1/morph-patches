package p153l;

import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class t9f {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f172634a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public static String f172635b = "goog.exo.core";

    /* JADX INFO: renamed from: a */
    public static synchronized void m189752a(String str) {
        if (f172634a.add(str)) {
            f172635b += ", " + str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m189753b() {
        return f172635b;
    }
}
