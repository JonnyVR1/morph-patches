package p153l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ush0 {

    /* JADX INFO: renamed from: m */
    public static int f180819m;

    /* JADX INFO: renamed from: a */
    public int f180820a = 0;

    /* JADX INFO: renamed from: b */
    public int f180821b = 0;

    /* JADX INFO: renamed from: c */
    public final Act f180822c;

    /* JADX INFO: renamed from: d */
    public HandlerThread f180823d;

    /* JADX INFO: renamed from: e */
    public Handler f180824e;

    /* JADX INFO: renamed from: f */
    public CameraManager f180825f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, CameraCharacteristics> f180826g;

    /* JADX INFO: renamed from: h */
    public CameraDevice f180827h;

    /* JADX INFO: renamed from: i */
    public CameraCaptureSession f180828i;

    /* JADX INFO: renamed from: j */
    public TTCameraConfig f180829j;

    /* JADX INFO: renamed from: k */
    public String f180830k;

    /* JADX INFO: renamed from: l */
    public CameraCharacteristics f180831l;

    public ush0(Act act) {
        StringBuilder sb = new StringBuilder("TTCameraThread");
        int i = f180819m;
        f180819m = i + 1;
        sb.append(i);
        this.f180823d = new HandlerThread(sb.toString());
        this.f180826g = new HashMap<>();
        this.f180830k = null;
        this.f180831l = null;
        this.f180822c = act;
        this.f180823d.start();
        this.f180824e = new Handler(this.f180823d.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public void mo100638b(TTCameraConfig tTCameraConfig) {
        this.f180829j = tTCameraConfig;
        try {
            this.f180825f = (CameraManager) this.f180822c.getSystemService("camera");
            this.f180826g.clear();
            for (String str : this.f180825f.getCameraIdList()) {
                this.f180826g.put(str, this.f180825f.getCameraCharacteristics(str));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        for (Map.Entry<String, CameraCharacteristics> entry : this.f180826g.entrySet()) {
            CameraCharacteristics value = entry.getValue();
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            if (((Integer) value.get(key)).intValue() != 0 || tTCameraConfig.m30721l()) {
                if (1 == ((Integer) entry.getValue().get(key)).intValue() && tTCameraConfig.m30721l()) {
                    this.f180830k = entry.getKey();
                    this.f180831l = entry.getValue();
                    break;
                }
            } else {
                this.f180830k = entry.getKey();
                this.f180831l = entry.getValue();
                break;
            }
        }
        this.f180821b = this.f180822c.getWindowManager().getDefaultDisplay().getRotation();
        CameraCharacteristics cameraCharacteristics = this.f180831l;
        if (cameraCharacteristics != null) {
            this.f180820a = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        }
    }
}
