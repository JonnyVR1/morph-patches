package p149l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.CommonAssetsSettings;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class wc40 implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m202626c() {
        if (RemoteConfig.m79298x().m79330s("webp_switch_flag")) {
            return true;
        }
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("cloud_webp_replace_jpeg"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m202627d() {
        if (RemoteConfig.m79298x().m79330s("webp_switch_flag")) {
            return false;
        }
        return "control".equals(ABManager.m29350i0("cloud_webp_replace_jpeg"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m202628e() {
        int i;
        List<Integer> list;
        try {
            i = Integer.parseInt(qib0.f154714c0.userId()) % 4;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            i = -1;
        }
        CommonAssetsSettings commonAssetsSettingsM95177g = qib0.f154709X.m95177g();
        if (commonAssetsSettingsM95177g != null && (list = commonAssetsSettingsM95177g.enableAgc) != null && list.size() != 0) {
            for (Integer num : commonAssetsSettingsM95177g.enableAgc) {
                if (num != null && num.intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m202629f() {
        m202630g();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m202630g() {
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
    public static boolean m202631h() {
        return Build.BRAND.equals(RomUtil.ROM_OPPO) && Build.MODEL.equals("OPPO A59s");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m202632i() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("android_image_prefetch_opt"));
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
