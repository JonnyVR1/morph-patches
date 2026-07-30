package p153l;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes9.dex */
public class m210 {
    /* JADX INFO: renamed from: a */
    public static void m156737a(x20 x20Var, x20 x20Var2) {
        int iM156738b = m156738b();
        if (iM156738b == 1) {
            x20Var.call();
        } else {
            if (iM156738b != 2) {
                return;
            }
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m156738b() {
        return ((double) bnl0.m105588w0()) / ((double) ynp0.m216939p()) > 1.5d ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m156739c() {
        return Camera.getNumberOfCameras() >= 2;
    }
}
