package p153l;

import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class cts0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f83760a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f83761b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized String m112550a() {
        return f83761b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m112551b(String str) {
        if (f83760a.add(str)) {
            f83761b = f83761b + ", " + str;
        }
    }
}
