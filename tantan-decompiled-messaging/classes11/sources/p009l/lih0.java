package p009l;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.api.ve.VEPrivacyCertCheckEntry;
import com.p008ss.android.ttvecamera.C0743g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lih0 {
    /* JADX INFO: renamed from: a */
    private static boolean m17892a(Cert cert, boolean z) {
        boolean z2;
        try {
            if (z) {
                VEPrivacyCertCheckEntry.Camera.open(cert);
            } else {
                VEPrivacyCertCheckEntry.Camera.close(cert);
            }
            z2 = true;
        } catch (BPEAException e) {
            C0743g.m11166b("TECamera1PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            z2 = false;
        }
        C0743g.m11169e("TECamera1PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public static void m17893b(Cert cert, @NonNull Camera camera) {
        if (m17892a(cert, false)) {
            camera.release();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Camera m17894c(Cert cert, int i) {
        if (m17892a(cert, true)) {
            return i >= 0 ? Camera.open(i) : Camera.open();
        }
        return null;
    }
}
