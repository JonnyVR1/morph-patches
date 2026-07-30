package p153l;

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
import com.bytedance.bpea.entry.api.p012ve.VEPrivacyCertCheckEntry;
import com.p074ss.android.ttvecamera.C13504g;

/* JADX INFO: loaded from: classes11.dex */
public class wqh0 {
    /* JADX INFO: renamed from: a */
    public static boolean m207518a(Cert cert, boolean z) {
        boolean z2 = true;
        if (cert == null) {
            C13504g.m82001e("TECamera2PolicyAdapter", "privacyCert is null.");
            return true;
        }
        try {
            if (z) {
                VEPrivacyCertCheckEntry.Camera.open(cert);
            } else {
                VEPrivacyCertCheckEntry.Camera.close(cert);
            }
        } catch (BPEAException e) {
            C13504g.m81998b("TECamera2PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            z2 = false;
        }
        C13504g.m82001e("TECamera2PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b */
    public static void m207519b(Cert cert, @NonNull CameraDevice cameraDevice) {
        dsh0.m117758a("TECamera2PolicyAdapter-closeCamera");
        if (m207518a(cert, false)) {
            cameraDevice.close();
        }
        dsh0.m117759b();
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public static void m207520c(Cert cert, CameraManager cameraManager, @NonNull String str, @NonNull CameraDevice.StateCallback stateCallback, @Nullable Handler handler) throws CameraAccessException {
        dsh0.m117758a("TECamera2PolicyAdapter-openCamera");
        if (m207518a(cert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
        dsh0.m117759b();
    }
}
