package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SvipResumePurchase;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g6a implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: A */
    public static int m15579A() {
        return RemoteConfig.x().z("vas_platinum_pin_like_guide_anim_max_count", 1);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15580c(String str, Privilege privilege) {
        if (!CoreModule.m1854P().m11706a().m5290Kj()) {
            return false;
        }
        if (!TextUtils.equals(str, "p_message,locked_match") && !TextUtils.equals(str, "p_home,greet") && !TextUtils.equals(str, "p_home,quickchat_card")) {
            return false;
        }
        try {
            return RemoteConfig.x().s("alipay_auto_pay_switch_disable_field");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15581d() {
        boolean zS;
        try {
            zS = RemoteConfig.x().s("alipay_auto_pay_switch_disable");
        } catch (Exception unused) {
            zS = false;
        }
        return !zS;
    }

    /* JADX INFO: renamed from: e */
    public static SvipResumePurchase m15582e() {
        try {
            return (SvipResumePurchase) RemoteConfig.x().v("svip_resume_purchase", SvipResumePurchase.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15583f() {
        return "exp".equals(ABManager.m1256i0("REV_svip2024double11"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15584g(String str, Privilege privilege) {
        return m15581d() || m15580c(str, privilege);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m15585h() {
        return "exp".equals(ABManager.m1256i0("REV_vipvalue_order"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m15586i() {
        return "exp".equals(ABManager.m1256i0("REV_femalevipauto")) || m15587j();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m15587j() {
        return "exp".equals(ABManager.m1256i0("REV_femalevipauto2"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15588k() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if (userM21483na == null) {
            return false;
        }
        return ("exp".equals(ABManager.m1256i0("REV_femalevip")) || "exp".equals(ABManager.m1256i0("REV_femalevip2")) || "exp".equals(ABManager.m1256i0("REV_femalevip4")) || CoreModule.m1854P().m11706a().m5480m7() || m15586i()) && userM21483na.isFemale();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m15589l() {
        return m15588k() && ura.m25555e().m25559d().m5877w();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m15590m() {
        return "_Test".equals(ABManager.m1256i0("VASHiddenNearby"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m15591n() {
        return "exp".equals(ABManager.m1256i0("REV_odiamond_discount_2025"));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m15592o() {
        return "exp".equals(ABManager.m1256i0("REV_odiamond_ui"));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m15593p() {
        return "_exp".equals(ABManager.m1256i0("Rev_dzfts"));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m15594q() {
        return "exp".equals(ABManager.m1256i0("REV_platinum_membership_2"));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m15595r() {
        return "exp".equals(ABManager.m1256i0("REV_platinum_membership_3"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m15596s() {
        return "exp1".equals(ABManager.m1256i0("REV_platinium_4")) || "exp2".equals(ABManager.m1256i0("REV_platinium_4"));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m15597t() {
        return "exp".equals(ABManager.m1256i0("REV_promo_upgrade1"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m15598u() {
        return "exp".equals(ABManager.m1256i0("REV_svip12M618"));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m15599v() {
        return "exp1".equals(ABManager.m1256i0("REV_svip_coupon_uplift_1m")) || "exp2".equals(ABManager.m1256i0("REV_svip_coupon_uplift_1m"));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m15600w() {
        return "_exp".equals(ABManager.m1256i0("Rev_hytqgzzq"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m15601x() {
        return "exp".equals(ABManager.m1256i0("REV_tieredmembership"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m15602y() {
        return "exp".equals(ABManager.m1256i0("REV_youthvipauto"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m15603z() {
        if (CoreModule.m1854P().m11706a().m5316Np()) {
            return true;
        }
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if (userM21483na == null) {
            return false;
        }
        return ("exp".equals(ABManager.m1256i0("REV_youthvip")) || m15602y()) && (userM21483na.age.intValue() <= 22 || xma.m27358O3());
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
