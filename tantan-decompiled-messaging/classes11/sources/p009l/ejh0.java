package p009l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class ejh0 extends vih0 {

    /* JADX INFO: renamed from: d */
    public Map<String, Float> f12585d;

    public ejh0(Context context) {
        super(context);
        this.f12585d = new HashMap();
    }

    /* JADX INFO: renamed from: u */
    public void m13961u(CameraCharacteristics cameraCharacteristics, String str) {
        this.f12585d.put(str, Float.valueOf(((SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getHeight()));
    }

    /* JADX INFO: renamed from: v */
    public String m13962v() {
        Map<String, Float> map = this.f12585d;
        if (map == null) {
            return null;
        }
        float f = 0.0f;
        String str = "";
        for (String str2 : map.keySet()) {
            float fFloatValue = this.f12585d.get(str2).floatValue();
            if (f < fFloatValue) {
                str = str2;
                f = fFloatValue;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: w */
    public String m13963w(CameraManager cameraManager, int i, String[] strArr) throws CameraAccessException {
        int i2 = 0;
        for (String str : strArr) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            int i3 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1;
            if (i3 == i && i3 == 1) {
                m13961u(cameraCharacteristics, str);
                i2++;
            }
        }
        if (i2 >= 2) {
            return m13962v();
        }
        return null;
    }
}
