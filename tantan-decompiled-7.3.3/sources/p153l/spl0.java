package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AssistantMessageClear;
import com.p051p1.mobile.putong.core.data.MyTabLikersEntranceNumConfigs;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class spl0 implements ABManager.InterfaceC4829d {

    /* JADX INFO: renamed from: a */
    public static int f170059a;

    /* JADX INFO: renamed from: A */
    public static boolean m187349A() {
        return "_exp".equals(ABManager.m30348i0("Rev_fjdr_syt")) && gra.m131654Z2() && gra.m131596L3() && CoreModule.f18264c.f20305E2.m178134a() && !m187360L();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m187350B() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_youthvip_syt")) && gra.m131654Z2() && gra.m131596L3() && CoreModule.f18264c.f20305E2.m178135b();
    }

    /* JADX INFO: renamed from: C */
    public static boolean m187351C() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_fakeavatar_com"));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m187352D() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        return userM116593na != null && AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_femalevip_syt")) && userM116593na.isFemale() && gra.m131596L3();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m187353E() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_find_offline"));
    }

    /* JADX INFO: renamed from: F */
    public static boolean m187354F() {
        return !"__control".equals(ABManager.m30348i0("pop_platform_all"));
    }

    /* JADX INFO: renamed from: G */
    public static boolean m187355G() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_bg_insmatch_visitor"));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m187356H() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_instantchat_cell"));
    }

    /* JADX INFO: renamed from: I */
    public static boolean m187357I() {
        try {
            AssistantMessageClear assistantMessageClear = (AssistantMessageClear) RemoteConfig.m80481x().m80516v("assistant_message_clear", AssistantMessageClear.JSON_ADAPTER);
            if (assistantMessageClear != null) {
                return assistantMessageClear.enabled;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m187358J() {
        return CoreModule.f18264c.f20297C0.m146414K3() || d79.m114661T() || d79.m114654M();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m187359K() {
        try {
            boolean zM146361M3 = joa.m146361M3();
            String str = "unknown_";
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9)) {
                if (zM146361M3 && userM116600p9.isFemale()) {
                    str = MyTabLikersEntranceNumConfigs.female_overSVIP_show;
                } else if (zM146361M3) {
                    str = MyTabLikersEntranceNumConfigs.male_overSVIP_show;
                } else {
                    str = userM116600p9.isFemale() ? MyTabLikersEntranceNumConfigs.female_noprivilege_or_vip_show : MyTabLikersEntranceNumConfigs.male_noprivilege_or_vip_show;
                }
            }
            String strM80485F = RemoteConfig.m80481x().m80485F("mytab_see_red_dot_config");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optBoolean(str, !zM146361M3) : !zM146361M3;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m187360L() {
        return !e7d0.m119697f() && AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_nearby_visitor"));
    }

    /* JADX INFO: renamed from: M */
    public static boolean m187361M() {
        try {
            return RemoteConfig.m80481x().m80513s("enableNewGiftPanel");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m187362N() {
        return "_exp".equals(ABManager.m30348i0("Rev_qxgbdcsm"));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m187363O() {
        return gra.m131596L3() && AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_profile_update2"));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m187364P() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_QuickchatPlatform"));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m187365Q() {
        return m187384j() || m187376b0();
    }

    /* JADX INFO: renamed from: R */
    public static boolean m187366R() {
        if (m187364P()) {
            return "exp1".equals(ABManager.m30348i0("REV_Quickchat_reform_2")) || "exp2".equals(ABManager.m30348i0("REV_Quickchat_reform_2"));
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m187367S() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_seecard_newUI")) || rs9.m182937f();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m187368T() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("Rev_sviprepurchase"));
    }

    /* JADX INFO: renamed from: U */
    public static boolean m187369U() {
        return m187370V() || m187371W();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m187370V() {
        return "_exp1".equals(ABManager.m30348i0("Rev_sayhi_new"));
    }

    /* JADX INFO: renamed from: W */
    public static boolean m187371W() {
        return "_exp2".equals(ABManager.m30348i0("Rev_sayhi_new"));
    }

    /* JADX INFO: renamed from: X */
    public static boolean m187372X() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_seetrial")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_seetrial2"));
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m187373Y() {
        return CoreModule.m30932N().mo61552ld();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m187374Z() {
        try {
            RemoteConfig.m80481x().m80513s("superlike_upgrade_disable");
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m187375a0() {
        CoreModule.f18264c.f20381e0.m116600p9();
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m187376b0() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_Quickchat_party_2_new"));
    }

    /* JADX INFO: renamed from: c */
    public static String m187377c() {
        return ABManager.m30322Q("REV_alipay_discount", "slogan2", "限时促销");
    }

    /* JADX INFO: renamed from: d */
    public static String m187378d() {
        return ABManager.m30322Q("REV_alipaySpring", "slogan", "限时促销");
    }

    /* JADX INFO: renamed from: e */
    public static double m187379e() {
        try {
            AssistantMessageClear assistantMessageClear = (AssistantMessageClear) RemoteConfig.m80481x().m80516v("assistant_message_clear", AssistantMessageClear.JSON_ADAPTER);
            if (assistantMessageClear == null) {
                return -1.0d;
            }
            return (pzi0.m174454o() - (((long) assistantMessageClear.limit_days) * 86400000)) * 1.0d;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m187380f() {
        return "_TestClaude".equals(ABManager.m30348i0("AIPartner")) || "_TestDoubao".equals(ABManager.m30348i0("AIPartner"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m187381g() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_alipay_discount"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m187382h() {
        return "exp1".equals(ABManager.m30348i0("REV_ali_sell"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m187383i() {
        return "_promotion".equals(ABManager.m30348i0("REV_alipaySpring"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m187384j() {
        return "exp1".equals(ABManager.m30348i0("REV_Quickchat_party_2"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m187385k() {
        CoreModule.f18264c.f20381e0.m116600p9();
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m187386l() {
        return "_exp".equals(ABManager.m30348i0("Rev_AIpeiliao"));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m187387m() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_homepage_revenue_lift_1"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m187388n() {
        try {
            return RemoteConfig.m80481x().m80513s("enableNewGiftProcess");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m187389o() {
        return m187390p() || m187392r() || m187391q() || rs9.m182937f() || wi5.m206550d().m206552e();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m187390p() {
        return "exp1".equals(ABManager.m30348i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m187391q() {
        return "exp3".equals(ABManager.m30348i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m187392r() {
        return "exp2".equals(ABManager.m30348i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m187393s() {
        return m187394t() || m187395u() || m187396v() || m187397w() || m187398x() || m187399y() || m187400z();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m187394t() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("DynamicDialogue_10"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m187395u() {
        return "exp1".equals(ABManager.m30348i0("DynamicDialogue_2")) || "exp2".equals(ABManager.m30348i0("DynamicDialogue_2"));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m187396v() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("DynamicDialogue_3"));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m187397w() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("DynamicDialogue_4"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m187398x() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("DynamicDialogue_5"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m187399y() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("DynamicDialogue_6"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m187400z() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30350j0("DynamicDialogue_7"));
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public final void mo30391a() {
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            a17.m95457h().m95466q();
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public final void mo30392b() {
        f170059a = 0;
    }
}
