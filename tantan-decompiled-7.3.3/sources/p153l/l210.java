package p153l;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes4.dex */
public class l210 {
    /* JADX INFO: renamed from: a */
    public static void m152547a(x20 x20Var, x20 x20Var2) {
        int iM152548b = m152548b();
        if (iM152548b == 1) {
            x20Var.call();
        } else {
            if (iM152548b != 2) {
                return;
            }
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m152548b() {
        return ((double) bnl0.m105588w0()) / ((double) ynp0.m216939p()) > 1.5d ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m152549c() {
        return Camera.getNumberOfCameras() >= 2;
    }
}
