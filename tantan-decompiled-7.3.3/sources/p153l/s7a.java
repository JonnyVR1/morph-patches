package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SvipResumePurchase;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class s7a implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: A */
    public static int m184973A() {
        return RemoteConfig.m80481x().m80519z("vas_platinum_pin_like_guide_anim_max_count", 1);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m184974c(String str, Privilege privilege) {
        if (!CoreModule.m30933P().m143405a().mo34356Kj()) {
            return false;
        }
        if (!TextUtils.equals(str, "p_message,locked_match") && !TextUtils.equals(str, "p_home,greet") && !TextUtils.equals(str, "p_home,quickchat_card")) {
            return false;
        }
        try {
            return RemoteConfig.m80481x().m80513s("alipay_auto_pay_switch_disable_field");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m184975d() {
        boolean zM80513s;
        try {
            zM80513s = RemoteConfig.m80481x().m80513s("alipay_auto_pay_switch_disable");
        } catch (Exception unused) {
            zM80513s = false;
        }
        return !zM80513s;
    }

    /* JADX INFO: renamed from: e */
    public static SvipResumePurchase m184976e() {
        try {
            return (SvipResumePurchase) RemoteConfig.m80481x().m80516v("svip_resume_purchase", SvipResumePurchase.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m184977f() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_svip2024double11"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m184978g(String str, Privilege privilege) {
        return m184975d() || m184974c(str, privilege);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m184979h() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_vipvalue_order"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m184980i() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_femalevipauto")) || m184981j();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m184981j() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_femalevipauto2"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m184982k() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na == null) {
            return false;
        }
        return (AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_femalevip")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_femalevip2")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_femalevip4")) || CoreModule.m30933P().m143405a().mo34546m7() || m184980i()) && userM116593na.isFemale();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m184983l() {
        return m184982k() && gta.m132210e().m132214d().mo34943w();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m184984m() {
        return "_Test".equals(ABManager.m30348i0("VASHiddenNearby"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m184985n() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_odiamond_discount_2025"));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m184986o() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_odiamond_ui"));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m184987p() {
        return "_exp".equals(ABManager.m30348i0("Rev_dzfts"));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m184988q() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_platinum_membership_2"));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m184989r() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_platinum_membership_3"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m184990s() {
        return "exp1".equals(ABManager.m30348i0("REV_platinium_4")) || "exp2".equals(ABManager.m30348i0("REV_platinium_4"));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m184991t() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_promo_upgrade1"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m184992u() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_svip12M618"));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m184993v() {
        return "exp1".equals(ABManager.m30348i0("REV_svip_coupon_uplift_1m")) || "exp2".equals(ABManager.m30348i0("REV_svip_coupon_uplift_1m"));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m184994w() {
        return "_exp".equals(ABManager.m30348i0("Rev_hytqgzzq"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m184995x() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_tieredmembership"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m184996y() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_youthvipauto"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m184997z() {
        if (CoreModule.m30933P().m143405a().mo34382Np()) {
            return true;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na == null) {
            return false;
        }
        return (AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_youthvip")) || m184996y()) && (userM116593na.age.intValue() <= 22 || joa.m146364P3());
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
