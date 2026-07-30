package p149l;

import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class wjs0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f186682a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f186683b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized String m203496a() {
        return f186683b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m203497b(String str) {
        if (f186682a.add(str)) {
            f186683b = f186683b + ", " + str;
        }
    }
}
