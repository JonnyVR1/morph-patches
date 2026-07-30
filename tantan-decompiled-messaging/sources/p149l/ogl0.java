package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AssistantMessageClear;
import com.p046p1.mobile.putong.core.data.MyTabLikersEntranceNumConfigs;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ogl0 implements ABManager.InterfaceC4678d {

    /* JADX INFO: renamed from: a */
    public static int f143878a;

    /* JADX INFO: renamed from: A */
    public static boolean m164222A() {
        return "_exp".equals(ABManager.m29350i0("Rev_fjdr_syt")) && upa.m194723Z2() && upa.m194665L3() && CoreModule.f17545c.f19563E2.m161357a() && !m164233L();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m164223B() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_youthvip_syt")) && upa.m194723Z2() && upa.m194665L3() && CoreModule.f17545c.f19563E2.m161358b();
    }

    /* JADX INFO: renamed from: C */
    public static boolean m164224C() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_fakeavatar_com"));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m164225D() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        return userM169520na != null && AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_femalevip_syt")) && userM169520na.isFemale() && upa.m194665L3();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m164226E() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_find_offline"));
    }

    /* JADX INFO: renamed from: F */
    public static boolean m164227F() {
        return !"__control".equals(ABManager.m29350i0("pop_platform_all"));
    }

    /* JADX INFO: renamed from: G */
    public static boolean m164228G() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_bg_insmatch_visitor"));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m164229H() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_instantchat_cell"));
    }

    /* JADX INFO: renamed from: I */
    public static boolean m164230I() {
        try {
            AssistantMessageClear assistantMessageClear = (AssistantMessageClear) RemoteConfig.m79298x().m79333v("assistant_message_clear", AssistantMessageClear.JSON_ADAPTER);
            if (assistantMessageClear != null) {
                return assistantMessageClear.enabled;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m164231J() {
        return CoreModule.f17545c.f19555C0.m210101J3() || u59.m191810S() || u59.m191803L();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m164232K() {
        try {
            boolean zM210047L3 = xma.m210047L3();
            String str = "unknown_";
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9)) {
                if (zM210047L3 && userM169527p9.isFemale()) {
                    str = MyTabLikersEntranceNumConfigs.female_overSVIP_show;
                } else if (zM210047L3) {
                    str = MyTabLikersEntranceNumConfigs.male_overSVIP_show;
                } else {
                    str = userM169527p9.isFemale() ? MyTabLikersEntranceNumConfigs.female_noprivilege_or_vip_show : MyTabLikersEntranceNumConfigs.male_noprivilege_or_vip_show;
                }
            }
            String strM79302F = RemoteConfig.m79298x().m79302F("mytab_see_red_dot_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optBoolean(str, !zM210047L3) : !zM210047L3;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m164233L() {
        return !bzc0.m104566f() && AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_nearby_visitor"));
    }

    /* JADX INFO: renamed from: M */
    public static boolean m164234M() {
        try {
            return RemoteConfig.m79298x().m79330s("enableNewGiftPanel");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m164235N() {
        return "_exp".equals(ABManager.m29350i0("Rev_qxgbdcsm"));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m164236O() {
        return upa.m194665L3() && AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_profile_update2"));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m164237P() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_QuickchatPlatform"));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m164238Q() {
        return m164257j() || m164249b0();
    }

    /* JADX INFO: renamed from: R */
    public static boolean m164239R() {
        if (m164237P()) {
            return "exp1".equals(ABManager.m29350i0("REV_Quickchat_reform_2")) || "exp2".equals(ABManager.m29350i0("REV_Quickchat_reform_2"));
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m164240S() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_seecard_newUI")) || gr9.m127681f();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m164241T() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("Rev_sviprepurchase"));
    }

    /* JADX INFO: renamed from: U */
    public static boolean m164242U() {
        return m164243V() || m164244W();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m164243V() {
        return "_exp1".equals(ABManager.m29350i0("Rev_sayhi_new"));
    }

    /* JADX INFO: renamed from: W */
    public static boolean m164244W() {
        return "_exp2".equals(ABManager.m29350i0("Rev_sayhi_new"));
    }

    /* JADX INFO: renamed from: X */
    public static boolean m164245X() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_seetrial")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_seetrial2"));
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m164246Y() {
        return CoreModule.m29934N().mo60368ld();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m164247Z() {
        try {
            RemoteConfig.m79298x().m79330s("superlike_upgrade_disable");
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m164248a0() {
        CoreModule.f17545c.f19639e0.m169527p9();
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m164249b0() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_Quickchat_party_2_new"));
    }

    /* JADX INFO: renamed from: c */
    public static String m164250c() {
        return ABManager.m29324Q("REV_alipay_discount", "slogan2", "限时促销");
    }

    /* JADX INFO: renamed from: d */
    public static String m164251d() {
        return ABManager.m29324Q("REV_alipaySpring", "slogan", "限时促销");
    }

    /* JADX INFO: renamed from: e */
    public static double m164252e() {
        try {
            AssistantMessageClear assistantMessageClear = (AssistantMessageClear) RemoteConfig.m79298x().m79333v("assistant_message_clear", AssistantMessageClear.JSON_ADAPTER);
            if (assistantMessageClear == null) {
                return -1.0d;
            }
            return (mqi0.m155944o() - (((long) assistantMessageClear.limit_days) * 86400000)) * 1.0d;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m164253f() {
        return "_TestClaude".equals(ABManager.m29350i0("AIPartner")) || "_TestDoubao".equals(ABManager.m29350i0("AIPartner"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m164254g() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_alipay_discount"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m164255h() {
        return "exp1".equals(ABManager.m29350i0("REV_ali_sell"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m164256i() {
        return "_promotion".equals(ABManager.m29350i0("REV_alipaySpring"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m164257j() {
        return "exp1".equals(ABManager.m29350i0("REV_Quickchat_party_2"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m164258k() {
        CoreModule.f17545c.f19639e0.m169527p9();
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m164259l() {
        return "_exp".equals(ABManager.m29350i0("Rev_AIpeiliao"));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m164260m() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_homepage_revenue_lift_1"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m164261n() {
        try {
            return RemoteConfig.m79298x().m79330s("enableNewGiftProcess");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m164262o() {
        return m164263p() || m164265r() || m164264q() || gr9.m127681f() || wh5.m203106d().m203108e();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m164263p() {
        return "exp1".equals(ABManager.m29350i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m164264q() {
        return "exp3".equals(ABManager.m29350i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m164265r() {
        return "exp2".equals(ABManager.m29350i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m164266s() {
        return m164267t() || m164268u() || m164269v() || m164270w() || m164271x() || m164272y() || m164273z();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m164267t() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("DynamicDialogue_10"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m164268u() {
        return "exp1".equals(ABManager.m29350i0("DynamicDialogue_2")) || "exp2".equals(ABManager.m29350i0("DynamicDialogue_2"));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m164269v() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("DynamicDialogue_3"));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m164270w() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("DynamicDialogue_4"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m164271x() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("DynamicDialogue_5"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m164272y() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("DynamicDialogue_6"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m164273z() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29352j0("DynamicDialogue_7"));
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public final void mo29393a() {
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            xz6.m211889h().m211898q();
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public final void mo29394b() {
        f143878a = 0;
    }
}
