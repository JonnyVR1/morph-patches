package p002l;

import android.hardware.Camera;
import l.d30;
import l.uep0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cu00 {
    /* JADX INFO: renamed from: a */
    public static void m11349a(d30 d30Var, d30 d30Var2) {
        int iM11350b = m11350b();
        if (iM11350b == 1) {
            d30Var.call();
        } else {
            if (iM11350b != 2) {
                return;
            }
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m11350b() {
        return ((double) xdl0.w0()) / ((double) uep0.p()) > 1.5d ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11351c() {
        return Camera.getNumberOfCameras() >= 2;
    }
}
