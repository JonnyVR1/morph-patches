package p153l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.CommonAssetsSettings;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class kl40 implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m150345c() {
        if (RemoteConfig.m80481x().m80513s("webp_switch_flag")) {
            return true;
        }
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("cloud_webp_replace_jpeg"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m150346d() {
        if (RemoteConfig.m80481x().m80513s("webp_switch_flag")) {
            return false;
        }
        return "control".equals(ABManager.m30348i0("cloud_webp_replace_jpeg"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m150347e() {
        int i;
        List<Integer> list;
        try {
            i = Integer.parseInt(uqb0.f180397c0.userId()) % 4;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            i = -1;
        }
        CommonAssetsSettings commonAssetsSettingsM144645g = uqb0.f180392X.m144645g();
        if (commonAssetsSettingsM144645g != null && (list = commonAssetsSettingsM144645g.enableAgc) != null && list.size() != 0) {
            for (Integer num : commonAssetsSettingsM144645g.enableAgc) {
                if (num != null && num.intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m150348f() {
        m150349g();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m150349g() {
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
    public static boolean m150350h() {
        return Build.BRAND.equals(RomUtil.ROM_OPPO) && Build.MODEL.equals("OPPO A59s");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m150351i() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("android_image_prefetch_opt"));
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
