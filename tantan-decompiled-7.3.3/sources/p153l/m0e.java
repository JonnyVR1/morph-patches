package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class m0e {
    /* JADX INFO: renamed from: a */
    public static boolean m156510a() {
        try {
            return new File("/proc/net/if_inet6").exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
