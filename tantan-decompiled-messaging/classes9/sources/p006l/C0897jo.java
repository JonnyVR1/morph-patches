package p006l;

import android.os.Build;
import l.xdl0;

/* JADX INFO: renamed from: l.jo */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0897jo {
    /* JADX INFO: renamed from: a */
    public static boolean m17667a() {
        return Build.BRAND.equals("Meizu") && Build.MODEL.equals("m1 note");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17668b() {
        return xdl0.y0() > 720 && !m17667a();
    }
}
