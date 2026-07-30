package p149l;

import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class n8f {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f137638a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public static String f137639b = "goog.exo.core";

    /* JADX INFO: renamed from: a */
    public static synchronized void m158492a(String str) {
        if (f137638a.add(str)) {
            f137639b += ", " + str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m158493b() {
        return f137639b;
    }
}
