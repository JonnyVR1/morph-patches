package p006l;

import android.os.Build;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.data.CommonAssetsSettings;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class wc40 implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: c */
    public static boolean m26351c() {
        if (RemoteConfig.x().s("webp_switch_flag")) {
            return true;
        }
        return "exp".equals(ABManager.m1256i0("cloud_webp_replace_jpeg"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m26352d() {
        if (RemoteConfig.x().s("webp_switch_flag")) {
            return false;
        }
        return "control".equals(ABManager.m1256i0("cloud_webp_replace_jpeg"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m26353e() {
        int i;
        List list;
        try {
            i = Integer.parseInt(qib0.f19805c0.userId()) % 4;
        } catch (Exception e) {
            CrashHelper.c(e);
            i = -1;
        }
        CommonAssetsSettings commonAssetsSettingsM11767g = qib0.f19800X.m11767g();
        if (commonAssetsSettingsM11767g != null && (list = commonAssetsSettingsM11767g.enableAgc) != null && list.size() != 0) {
            for (Integer num : commonAssetsSettingsM11767g.enableAgc) {
                if (num != null && num.intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m26354f() {
        m26355g();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m26355g() {
        String str = Build.MODEL;
        if (str.equals("Lenovo K10e70")) {
            return true;
        }
        String str2 = Build.BRAND;
        if ((str2.equals("Meizu") && str.equals("m2 note")) || str.equals("Redmi 5 Plus") || str.equals("YQ601")) {
            return true;
        }
        return str2.equals("samsung") && str.equals("SM-N9008S");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m26356h() {
        return Build.BRAND.equals("OPPO") && Build.MODEL.equals("OPPO A59s");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m26357i() {
        return "exp".equals(ABManager.m1256i0("android_image_prefetch_opt"));
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public void mo1300b() {
    }
}
