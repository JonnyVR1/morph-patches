package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SvipResumePurchase;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class g6a implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: A */
    public static int m124553A() {
        return RemoteConfig.m79298x().m79336z("vas_platinum_pin_like_guide_anim_max_count", 1);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m124554c(String str, Privilege privilege) {
        if (!CoreModule.m29935P().m94651a().mo33353Kj()) {
            return false;
        }
        if (!TextUtils.equals(str, "p_message,locked_match") && !TextUtils.equals(str, "p_home,greet") && !TextUtils.equals(str, "p_home,quickchat_card")) {
            return false;
        }
        try {
            return RemoteConfig.m79298x().m79330s("alipay_auto_pay_switch_disable_field");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m124555d() {
        boolean zM79330s;
        try {
            zM79330s = RemoteConfig.m79298x().m79330s("alipay_auto_pay_switch_disable");
        } catch (Exception unused) {
            zM79330s = false;
        }
        return !zM79330s;
    }

    /* JADX INFO: renamed from: e */
    public static SvipResumePurchase m124556e() {
        try {
            return (SvipResumePurchase) RemoteConfig.m79298x().m79333v("svip_resume_purchase", SvipResumePurchase.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m124557f() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_svip2024double11"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m124558g(String str, Privilege privilege) {
        return m124555d() || m124554c(str, privilege);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m124559h() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_vipvalue_order"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m124560i() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_femalevipauto")) || m124561j();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m124561j() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_femalevipauto2"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m124562k() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na == null) {
            return false;
        }
        return (AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_femalevip")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_femalevip2")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_femalevip4")) || CoreModule.m29935P().m94651a().mo33543m7() || m124560i()) && userM169520na.isFemale();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m124563l() {
        return m124562k() && ura.m195053e().m195057d().mo33940w();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m124564m() {
        return "_Test".equals(ABManager.m29350i0("VASHiddenNearby"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m124565n() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_odiamond_discount_2025"));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m124566o() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_odiamond_ui"));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m124567p() {
        return "_exp".equals(ABManager.m29350i0("Rev_dzfts"));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m124568q() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_platinum_membership_2"));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m124569r() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_platinum_membership_3"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m124570s() {
        return "exp1".equals(ABManager.m29350i0("REV_platinium_4")) || "exp2".equals(ABManager.m29350i0("REV_platinium_4"));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m124571t() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_promo_upgrade1"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m124572u() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_svip12M618"));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m124573v() {
        return "exp1".equals(ABManager.m29350i0("REV_svip_coupon_uplift_1m")) || "exp2".equals(ABManager.m29350i0("REV_svip_coupon_uplift_1m"));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m124574w() {
        return "_exp".equals(ABManager.m29350i0("Rev_hytqgzzq"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m124575x() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_tieredmembership"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m124576y() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_youthvipauto"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m124577z() {
        if (CoreModule.m29935P().m94651a().mo33379Np()) {
            return true;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na == null) {
            return false;
        }
        return (AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_youthvip")) || m124576y()) && (userM169520na.age.intValue() <= 22 || xma.m210050O3());
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
