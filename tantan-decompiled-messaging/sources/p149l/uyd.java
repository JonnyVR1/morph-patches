package p149l;

import android.os.Build;
import com.idv.identity.platform.config.DeviceSetting;

/* JADX INFO: loaded from: classes7.dex */
public class uyd {
    /* JADX INFO: renamed from: a */
    public static DeviceSetting m196284a(DeviceSetting[] deviceSettingArr) {
        DeviceSetting deviceSetting;
        if (deviceSettingArr != null) {
            int i = Integer.parseInt(Build.VERSION.SDK);
            int length = deviceSettingArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                deviceSetting = deviceSettingArr[i2];
                if (i < deviceSetting.getMinApiLevel() || i > deviceSetting.getMaxApiLevel()) {
                }
            }
            deviceSetting = null;
        } else {
            deviceSetting = null;
        }
        return deviceSetting == null ? new DeviceSetting() : deviceSetting;
    }
}
