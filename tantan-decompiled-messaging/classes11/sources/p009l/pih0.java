package p009l;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.api.ve.VEPrivacyCertCheckEntry;
import com.p008ss.android.ttvecamera.C0743g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pih0 {
    /* JADX INFO: renamed from: a */
    public static boolean m20299a(Cert cert, boolean z) {
        boolean z2 = true;
        if (cert == null) {
            C0743g.m11169e("TECamera2PolicyAdapter", "privacyCert is null.");
            return true;
        }
        try {
            if (z) {
                VEPrivacyCertCheckEntry.Camera.open(cert);
            } else {
                VEPrivacyCertCheckEntry.Camera.close(cert);
            }
        } catch (BPEAException e) {
            C0743g.m11166b("TECamera2PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            z2 = false;
        }
        C0743g.m11169e("TECamera2PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b */
    public static void m20300b(Cert cert, @NonNull CameraDevice cameraDevice) {
        wjh0.m24289a("TECamera2PolicyAdapter-closeCamera");
        if (m20299a(cert, false)) {
            cameraDevice.close();
        }
        wjh0.m24290b();
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public static void m20301c(Cert cert, CameraManager cameraManager, @NonNull String str, @NonNull CameraDevice.StateCallback stateCallback, @Nullable Handler handler) throws CameraAccessException {
        wjh0.m24289a("TECamera2PolicyAdapter-openCamera");
        if (m20299a(cert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
        wjh0.m24290b();
    }
}
