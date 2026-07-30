package p149l;

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
import com.bytedance.bpea.entry.api.p011ve.VEPrivacyCertCheckEntry;
import com.p069ss.android.ttvecamera.C13341g;

/* JADX INFO: loaded from: classes11.dex */
public class pih0 {
    /* JADX INFO: renamed from: a */
    public static boolean m169600a(Cert cert, boolean z) {
        boolean z2 = true;
        if (cert == null) {
            C13341g.m80818e("TECamera2PolicyAdapter", "privacyCert is null.");
            return true;
        }
        try {
            if (z) {
                VEPrivacyCertCheckEntry.Camera.open(cert);
            } else {
                VEPrivacyCertCheckEntry.Camera.close(cert);
            }
        } catch (BPEAException e) {
            C13341g.m80815b("TECamera2PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            z2 = false;
        }
        C13341g.m80818e("TECamera2PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b */
    public static void m169601b(Cert cert, @NonNull CameraDevice cameraDevice) {
        wjh0.m203445a("TECamera2PolicyAdapter-closeCamera");
        if (m169600a(cert, false)) {
            cameraDevice.close();
        }
        wjh0.m203446b();
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public static void m169602c(Cert cert, CameraManager cameraManager, @NonNull String str, @NonNull CameraDevice.StateCallback stateCallback, @Nullable Handler handler) throws CameraAccessException {
        wjh0.m203445a("TECamera2PolicyAdapter-openCamera");
        if (m169600a(cert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
        wjh0.m203446b();
    }
}
