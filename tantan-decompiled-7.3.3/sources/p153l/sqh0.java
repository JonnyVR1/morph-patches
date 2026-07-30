package p153l;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.api.p012ve.VEPrivacyCertCheckEntry;
import com.p074ss.android.ttvecamera.C13504g;

/* JADX INFO: loaded from: classes11.dex */
public class sqh0 {
    /* JADX INFO: renamed from: a */
    private static boolean m187550a(Cert cert, boolean z) {
        boolean z2;
        try {
            if (z) {
                VEPrivacyCertCheckEntry.Camera.open(cert);
            } else {
                VEPrivacyCertCheckEntry.Camera.close(cert);
            }
            z2 = true;
        } catch (BPEAException e) {
            C13504g.m81998b("TECamera1PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            z2 = false;
        }
        C13504g.m82001e("TECamera1PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public static void m187551b(Cert cert, @NonNull Camera camera) {
        if (m187550a(cert, false)) {
            camera.release();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Camera m187552c(Cert cert, int i) {
        if (m187550a(cert, true)) {
            return i >= 0 ? Camera.open(i) : Camera.open();
        }
        return null;
    }
}
