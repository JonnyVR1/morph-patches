package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveImageColorConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class irn {

    /* JADX INFO: renamed from: a */
    public static jxd0 f116587a = new jxd0("openDefaultRGB565", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public static BLiveImageColorConfig f116588b;

    /* JADX INFO: renamed from: a */
    public static boolean m141839a() {
        if (wft.m206159b(1)) {
            return false;
        }
        String strM203884l = vxr.m203884l();
        if (TextUtils.isEmpty(strM203884l)) {
            return false;
        }
        int length = strM203884l.length();
        try {
            if (f116588b == null) {
                f116588b = (BLiveImageColorConfig) RemoteConfig.m80481x().m80516v("intl_image_default_rgb565", BLiveImageColorConfig.JSON_ADAPTER);
            }
            BLiveImageColorConfig bLiveImageColorConfig = f116588b;
            if (bLiveImageColorConfig == null || !bLiveImageColorConfig.f45235on) {
                return false;
            }
            String strSubstring = strM203884l.substring(length - 1);
            BLiveImageColorConfig bLiveImageColorConfig2 = f116588b;
            return !bLiveImageColorConfig2.isGary || bLiveImageColorConfig2.gary_number.contains(strSubstring);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }
}
