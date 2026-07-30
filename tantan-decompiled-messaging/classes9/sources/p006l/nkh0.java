package p006l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nkh0 {

    /* JADX INFO: renamed from: m */
    public static int f17722m;

    /* JADX INFO: renamed from: a */
    public int f17723a = 0;

    /* JADX INFO: renamed from: b */
    public int f17724b = 0;

    /* JADX INFO: renamed from: c */
    public final Act f17725c;

    /* JADX INFO: renamed from: d */
    public HandlerThread f17726d;

    /* JADX INFO: renamed from: e */
    public Handler f17727e;

    /* JADX INFO: renamed from: f */
    public CameraManager f17728f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, CameraCharacteristics> f17729g;

    /* JADX INFO: renamed from: h */
    public CameraDevice f17730h;

    /* JADX INFO: renamed from: i */
    public CameraCaptureSession f17731i;

    /* JADX INFO: renamed from: j */
    public TTCameraConfig f17732j;

    /* JADX INFO: renamed from: k */
    public String f17733k;

    /* JADX INFO: renamed from: l */
    public CameraCharacteristics f17734l;

    public nkh0(Act act) {
        StringBuilder sb = new StringBuilder("TTCameraThread");
        int i = f17722m;
        f17722m = i + 1;
        sb.append(i);
        this.f17726d = new HandlerThread(sb.toString());
        this.f17729g = new HashMap<>();
        this.f17733k = null;
        this.f17734l = null;
        this.f17725c = act;
        this.f17726d.start();
        this.f17727e = new Handler(this.f17726d.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public void mo12815b(TTCameraConfig tTCameraConfig) {
        this.f17732j = tTCameraConfig;
        try {
            this.f17728f = (CameraManager) this.f17725c.getSystemService("camera");
            this.f17729g.clear();
            for (String str : this.f17728f.getCameraIdList()) {
                this.f17729g.put(str, this.f17728f.getCameraCharacteristics(str));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        for (Map.Entry<String, CameraCharacteristics> entry : this.f17729g.entrySet()) {
            CameraCharacteristics value = entry.getValue();
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            if (((Integer) value.get(key)).intValue() != 0 || tTCameraConfig.m1633l()) {
                if (1 == ((Integer) entry.getValue().get(key)).intValue() && tTCameraConfig.m1633l()) {
                    this.f17733k = entry.getKey();
                    this.f17734l = entry.getValue();
                    break;
                }
            } else {
                this.f17733k = entry.getKey();
                this.f17734l = entry.getValue();
                break;
            }
        }
        this.f17724b = this.f17725c.getWindowManager().getDefaultDisplay().getRotation();
        CameraCharacteristics cameraCharacteristics = this.f17734l;
        if (cameraCharacteristics != null) {
            this.f17723a = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        }
    }
}
