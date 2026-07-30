package p149l;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes13.dex */
public class du00 {
    /* JADX INFO: renamed from: a */
    public static void m113660a(d30 d30Var, d30 d30Var2) {
        int iM113661b = m113661b();
        if (iM113661b == 1) {
            d30Var.call();
        } else {
            if (iM113661b != 2) {
                return;
            }
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m113661b() {
        return ((double) xdl0.m208408w0()) / ((double) uep0.m193329p()) > 1.5d ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m113662c() {
        return Camera.getNumberOfCameras() >= 2;
    }
}
