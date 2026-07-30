package p149l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class nkh0 {

    /* JADX INFO: renamed from: m */
    public static int f139415m;

    /* JADX INFO: renamed from: a */
    public int f139416a = 0;

    /* JADX INFO: renamed from: b */
    public int f139417b = 0;

    /* JADX INFO: renamed from: c */
    public final Act f139418c;

    /* JADX INFO: renamed from: d */
    public HandlerThread f139419d;

    /* JADX INFO: renamed from: e */
    public Handler f139420e;

    /* JADX INFO: renamed from: f */
    public CameraManager f139421f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, CameraCharacteristics> f139422g;

    /* JADX INFO: renamed from: h */
    public CameraDevice f139423h;

    /* JADX INFO: renamed from: i */
    public CameraCaptureSession f139424i;

    /* JADX INFO: renamed from: j */
    public TTCameraConfig f139425j;

    /* JADX INFO: renamed from: k */
    public String f139426k;

    /* JADX INFO: renamed from: l */
    public CameraCharacteristics f139427l;

    public nkh0(Act act) {
        StringBuilder sb = new StringBuilder("TTCameraThread");
        int i = f139415m;
        f139415m = i + 1;
        sb.append(i);
        this.f139419d = new HandlerThread(sb.toString());
        this.f139422g = new HashMap<>();
        this.f139426k = null;
        this.f139427l = null;
        this.f139418c = act;
        this.f139419d.start();
        this.f139420e = new Handler(this.f139419d.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public void mo102531b(TTCameraConfig tTCameraConfig) {
        this.f139425j = tTCameraConfig;
        try {
            this.f139421f = (CameraManager) this.f139418c.getSystemService("camera");
            this.f139422g.clear();
            for (String str : this.f139421f.getCameraIdList()) {
                this.f139422g.put(str, this.f139421f.getCameraCharacteristics(str));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        for (Map.Entry<String, CameraCharacteristics> entry : this.f139422g.entrySet()) {
            CameraCharacteristics value = entry.getValue();
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            if (((Integer) value.get(key)).intValue() != 0 || tTCameraConfig.m29723l()) {
                if (1 == ((Integer) entry.getValue().get(key)).intValue() && tTCameraConfig.m29723l()) {
                    this.f139426k = entry.getKey();
                    this.f139427l = entry.getValue();
                    break;
                }
            } else {
                this.f139426k = entry.getKey();
                this.f139427l = entry.getValue();
                break;
            }
        }
        this.f139417b = this.f139418c.getWindowManager().getDefaultDisplay().getRotation();
        CameraCharacteristics cameraCharacteristics = this.f139427l;
        if (cameraCharacteristics != null) {
            this.f139416a = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        }
    }
}
