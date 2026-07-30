package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.AssistantMessageClear;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import l.mqi0;
import l.wh5;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ogl0 implements ABManager.InterfaceC0104d {

    /* JADX INFO: renamed from: a */
    public static int f18231a;

    /* JADX INFO: renamed from: A */
    public static boolean m20612A() {
        return "_exp".equals(ABManager.m1256i0("Rev_fjdr_syt")) && upa.m25421Z2() && upa.m25363L3() && CoreModule.f1534c.f3552E2.m20200a() && !m20623L();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m20613B() {
        return "exp".equals(ABManager.m1256i0("REV_youthvip_syt")) && upa.m25421Z2() && upa.m25363L3() && CoreModule.f1534c.f3552E2.m20201b();
    }

    /* JADX INFO: renamed from: C */
    public static boolean m20614C() {
        return "exp".equals(ABManager.m1256i0("REV_fakeavatar_com"));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m20615D() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        return userM21483na != null && "exp".equals(ABManager.m1256i0("REV_femalevip_syt")) && userM21483na.isFemale() && upa.m25363L3();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m20616E() {
        return "exp".equals(ABManager.m1256i0("REV_find_offline"));
    }

    /* JADX INFO: renamed from: F */
    public static boolean m20617F() {
        return !"__control".equals(ABManager.m1256i0("pop_platform_all"));
    }

    /* JADX INFO: renamed from: G */
    public static boolean m20618G() {
        return "exp".equals(ABManager.m1256i0("REV_bg_insmatch_visitor"));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m20619H() {
        return "exp".equals(ABManager.m1256i0("REV_instantchat_cell"));
    }

    /* JADX INFO: renamed from: I */
    public static boolean m20620I() {
        try {
            AssistantMessageClear assistantMessageClear = (AssistantMessageClear) RemoteConfig.x().v("assistant_message_clear", AssistantMessageClear.JSON_ADAPTER);
            if (assistantMessageClear != null) {
                return assistantMessageClear.enabled;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m20621J() {
        return CoreModule.f1534c.f3544C0.m27409J3() || u59.m24981S() || u59.m24974L();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m20622K() {
        try {
            boolean zM27355L3 = xma.m27355L3();
            String str = "unknown_";
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            if (NullChecker.a(userM21490p9)) {
                if (zM27355L3 && userM21490p9.isFemale()) {
                    str = "female_overSVIP_show";
                } else if (zM27355L3) {
                    str = "male_overSVIP_show";
                } else {
                    str = userM21490p9.isFemale() ? "female_noprivilege_or_vip_show" : "male_noprivilege_or_vip_show";
                }
            }
            String strF = RemoteConfig.x().F("mytab_see_red_dot_config");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optBoolean(str, !zM27355L3) : !zM27355L3;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m20623L() {
        return !bzc0.m13040f() && "exp".equals(ABManager.m1256i0("REV_nearby_visitor"));
    }

    /* JADX INFO: renamed from: M */
    public static boolean m20624M() {
        try {
            return RemoteConfig.x().s("enableNewGiftPanel");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m20625N() {
        return "_exp".equals(ABManager.m1256i0("Rev_qxgbdcsm"));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m20626O() {
        return upa.m25363L3() && "exp".equals(ABManager.m1256i0("REV_profile_update2"));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m20627P() {
        return "exp".equals(ABManager.m1256i0("REV_QuickchatPlatform"));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m20628Q() {
        return m20647j() || m20639b0();
    }

    /* JADX INFO: renamed from: R */
    public static boolean m20629R() {
        if (m20627P()) {
            return "exp1".equals(ABManager.m1256i0("REV_Quickchat_reform_2")) || "exp2".equals(ABManager.m1256i0("REV_Quickchat_reform_2"));
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m20630S() {
        return "exp".equals(ABManager.m1256i0("REV_seecard_newUI")) || gr9.m15937f();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m20631T() {
        return "exp".equals(ABManager.m1256i0("Rev_sviprepurchase"));
    }

    /* JADX INFO: renamed from: U */
    public static boolean m20632U() {
        return m20633V() || m20634W();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m20633V() {
        return "_exp1".equals(ABManager.m1256i0("Rev_sayhi_new"));
    }

    /* JADX INFO: renamed from: W */
    public static boolean m20634W() {
        return "_exp2".equals(ABManager.m1256i0("Rev_sayhi_new"));
    }

    /* JADX INFO: renamed from: X */
    public static boolean m20635X() {
        return "exp".equals(ABManager.m1256i0("REV_seetrial")) || "exp".equals(ABManager.m1256i0("REV_seetrial2"));
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m20636Y() {
        return CoreModule.m1853N().ld();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m20637Z() {
        try {
            RemoteConfig.x().s("superlike_upgrade_disable");
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m20638a0() {
        CoreModule.f1534c.f3628e0.m21490p9();
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m20639b0() {
        return "exp".equals(ABManager.m1256i0("REV_Quickchat_party_2_new"));
    }

    /* JADX INFO: renamed from: c */
    public static String m20640c() {
        return ABManager.m1230Q("REV_alipay_discount", "slogan2", "限时促销");
    }

    /* JADX INFO: renamed from: d */
    public static String m20641d() {
        return ABManager.m1230Q("REV_alipaySpring", "slogan", "限时促销");
    }

    /* JADX INFO: renamed from: e */
    public static double m20642e() {
        try {
            AssistantMessageClear assistantMessageClear = (AssistantMessageClear) RemoteConfig.x().v("assistant_message_clear", AssistantMessageClear.JSON_ADAPTER);
            if (assistantMessageClear == null) {
                return -1.0d;
            }
            return (mqi0.o() - (((long) assistantMessageClear.limit_days) * 86400000)) * 1.0d;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20643f() {
        return "_TestClaude".equals(ABManager.m1256i0("AIPartner")) || "_TestDoubao".equals(ABManager.m1256i0("AIPartner"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20644g() {
        return "exp".equals(ABManager.m1256i0("REV_alipay_discount"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20645h() {
        return "exp1".equals(ABManager.m1256i0("REV_ali_sell"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20646i() {
        return "_promotion".equals(ABManager.m1256i0("REV_alipaySpring"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m20647j() {
        return "exp1".equals(ABManager.m1256i0("REV_Quickchat_party_2"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20648k() {
        CoreModule.f1534c.f3628e0.m21490p9();
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m20649l() {
        return "_exp".equals(ABManager.m1256i0("Rev_AIpeiliao"));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m20650m() {
        return "exp".equals(ABManager.m1256i0("REV_homepage_revenue_lift_1"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m20651n() {
        try {
            return RemoteConfig.x().s("enableNewGiftProcess");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m20652o() {
        return m20653p() || m20655r() || m20654q() || gr9.m15937f() || wh5.d().e();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m20653p() {
        return "exp1".equals(ABManager.m1256i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m20654q() {
        return "exp3".equals(ABManager.m1256i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m20655r() {
        return "exp2".equals(ABManager.m1256i0("REV_commercial_card_2311"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m20656s() {
        return m20657t() || m20658u() || m20659v() || m20660w() || m20661x() || m20662y() || m20663z();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m20657t() {
        return "exp".equals(ABManager.m1256i0("DynamicDialogue_10"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m20658u() {
        return "exp1".equals(ABManager.m1256i0("DynamicDialogue_2")) || "exp2".equals(ABManager.m1256i0("DynamicDialogue_2"));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m20659v() {
        return "exp".equals(ABManager.m1256i0("DynamicDialogue_3"));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m20660w() {
        return "exp".equals(ABManager.m1256i0("DynamicDialogue_4"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m20661x() {
        return "exp".equals(ABManager.m1256i0("DynamicDialogue_5"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m20662y() {
        return "exp".equals(ABManager.m1256i0("DynamicDialogue_6"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m20663z() {
        return "exp".equals(ABManager.m1258j0("DynamicDialogue_7"));
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public final void mo1299a() {
        if (NullChecker.a(CoreModule.f1534c)) {
            xz6.m27689h().m27698q();
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public final void mo1300b() {
        f18231a = 0;
    }
}
