package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class zyd {
    /* JADX INFO: renamed from: a */
    public static boolean m220920a() {
        try {
            return new File("/proc/net/if_inet6").exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
