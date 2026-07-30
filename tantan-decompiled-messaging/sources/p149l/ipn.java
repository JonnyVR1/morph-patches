package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveImageColorConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class ipn {

    /* JADX INFO: renamed from: a */
    public static hpd0 f114331a = new hpd0("openDefaultRGB565", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public static BLiveImageColorConfig f114332b;

    /* JADX INFO: renamed from: a */
    public static boolean m137564a() {
        if (vdt.m198092b(1)) {
            return false;
        }
        String strM196095l = uvr.m196095l();
        if (TextUtils.isEmpty(strM196095l)) {
            return false;
        }
        int length = strM196095l.length();
        try {
            if (f114332b == null) {
                f114332b = (BLiveImageColorConfig) RemoteConfig.m79298x().m79333v("intl_image_default_rgb565", BLiveImageColorConfig.JSON_ADAPTER);
            }
            BLiveImageColorConfig bLiveImageColorConfig = f114332b;
            if (bLiveImageColorConfig == null || !bLiveImageColorConfig.f44387on) {
                return false;
            }
            String strSubstring = strM196095l.substring(length - 1);
            BLiveImageColorConfig bLiveImageColorConfig2 = f114332b;
            return !bLiveImageColorConfig2.isGary || bLiveImageColorConfig2.gary_number.contains(strSubstring);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }
}
