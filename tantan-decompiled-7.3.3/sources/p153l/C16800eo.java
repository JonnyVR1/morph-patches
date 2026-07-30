package p153l;

import android.os.Build;

/* JADX INFO: renamed from: l.eo */
/* JADX INFO: loaded from: classes9.dex */
public class C16800eo {
    /* JADX INFO: renamed from: a */
    public static boolean m121689a() {
        return Build.BRAND.equals("Meizu") && Build.MODEL.equals("m1 note");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m121690b() {
        return bnl0.m105592y0() > 720 && !m121689a();
    }
}
