package p149l;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes4.dex */
public class cu00 {
    /* JADX INFO: renamed from: a */
    public static void m108718a(d30 d30Var, d30 d30Var2) {
        int iM108719b = m108719b();
        if (iM108719b == 1) {
            d30Var.call();
        } else {
            if (iM108719b != 2) {
                return;
            }
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m108719b() {
        return ((double) xdl0.m208408w0()) / ((double) uep0.m193329p()) > 1.5d ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m108720c() {
        return Camera.getNumberOfCameras() >= 2;
    }
}
