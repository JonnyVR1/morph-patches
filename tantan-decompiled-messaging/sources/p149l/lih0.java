package p149l;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.api.p011ve.VEPrivacyCertCheckEntry;
import com.p069ss.android.ttvecamera.C13341g;

/* JADX INFO: loaded from: classes11.dex */
public class lih0 {
    /* JADX INFO: renamed from: a */
    private static boolean m149897a(Cert cert, boolean z) {
        boolean z2;
        try {
            if (z) {
                VEPrivacyCertCheckEntry.Camera.open(cert);
            } else {
                VEPrivacyCertCheckEntry.Camera.close(cert);
            }
            z2 = true;
        } catch (BPEAException e) {
            C13341g.m80815b("TECamera1PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            z2 = false;
        }
        C13341g.m80818e("TECamera1PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public static void m149898b(Cert cert, @NonNull Camera camera) {
        if (m149897a(cert, false)) {
            camera.release();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Camera m149899c(Cert cert, int i) {
        if (m149897a(cert, true)) {
            return i >= 0 ? Camera.open(i) : Camera.open();
        }
        return null;
    }
}
