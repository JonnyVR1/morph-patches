package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p046p1.mobile.putong.core.data.IntlSobotHelpCenter;
import com.p046p1.mobile.putong.core.data.IntrRiskConfig;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class u59 implements ABManager.InterfaceC4678d {

    /* JADX INFO: renamed from: a */
    public static boolean f174661a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f174662b = true;

    /* JADX INFO: renamed from: c */
    public static boolean f174663c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f174664d = true;

    /* JADX INFO: renamed from: e */
    public static int f174665e = 0;

    /* JADX INFO: renamed from: f */
    public static boolean f174666f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f174667g = true;

    /* JADX INFO: renamed from: h */
    public static int f174668h;

    /* JADX INFO: renamed from: i */
    public static int f174669i;

    /* JADX INFO: renamed from: j */
    public static Calendar f174670j;

    /* JADX INFO: renamed from: k */
    public static Calendar f174671k;

    /* JADX INFO: renamed from: l */
    public static long f174672l;

    /* JADX INFO: renamed from: q */
    public static JSONArray f174677q;

    /* JADX INFO: renamed from: m */
    public static Boolean f174673m = Boolean.TRUE;

    /* JADX INFO: renamed from: n */
    public static String f174674n = "";

    /* JADX INFO: renamed from: o */
    public static String f174675o = "";

    /* JADX INFO: renamed from: p */
    public static volatile int f174676p = -1;

    /* JADX INFO: renamed from: r */
    public static AtomicBoolean f174678r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s */
    public static boolean f174679s = false;

    /* JADX INFO: renamed from: t */
    public static int f174680t = -1;

    /* JADX INFO: renamed from: u */
    public static boolean f174681u = false;

    /* JADX INFO: renamed from: v */
    public static String f174682v = "idn_top";

    /* JADX INFO: renamed from: w */
    public static String f174683w = "oc_top";

    /* JADX INFO: renamed from: x */
    public static String f174684x = "idn_live";

    /* JADX INFO: renamed from: y */
    public static List<PurchaseType> f174685y = new ArrayList();

    /* JADX INFO: renamed from: l.u59$a */
    public static class C20359a {

        /* JADX INFO: renamed from: a */
        public int f174686a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f174687b;

        public C20359a(int i, PurchaseType purchaseType) {
            this.f174686a = i;
            this.f174687b = purchaseType;
        }
    }

    /* JADX INFO: renamed from: A */
    public static IntlSlGuideConfig m191792A() {
        try {
            IntlSlGuideConfig intlSlGuideConfig = (IntlSlGuideConfig) RemoteConfig.m79298x().m79333v("intl_sl_guide_config", IntlSlGuideConfig.JSON_ADAPTER);
            if (intlSlGuideConfig != null) {
                return intlSlGuideConfig;
            }
        } catch (Exception unused) {
        }
        return m191854y();
    }

    /* JADX INFO: renamed from: B */
    public static List<PurchaseType> m191793B() {
        if (!vwb.m200296J(f174685y)) {
            return f174685y;
        }
        if (m191810S() && !xma.m210047L3() && xma.m210087m4() && xma.m210077h4() && xma.m210059X3()) {
            f174685y.add(PurchaseType.TYPE_GET_VIP);
            f174685y.add(PurchaseType.TYPE_GET_LIKERS);
            f174685y.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (m191812U()) {
                f174685y.add(PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        } else {
            m191805N(f174685y);
        }
        return f174685y;
    }

    /* JADX INFO: renamed from: C */
    public static String m191794C() {
        IntlSobotHelpCenter intlSobotHelpCenter;
        try {
            intlSobotHelpCenter = (IntlSobotHelpCenter) RemoteConfig.m79298x().m79333v("intl_sobot_help", IntlSobotHelpCenter.JSON_ADAPTER);
        } catch (Exception unused) {
            intlSobotHelpCenter = null;
        }
        return intlSobotHelpCenter == null ? "" : intlSobotHelpCenter.url;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m191795D() {
        if (IntlCountryCodeController.m28115k()) {
            return false;
        }
        int i = qib0.f154717f0;
        return i == 466 || i == 0 || TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m191796E() {
        return m191823d0();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m191797F() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m191798G() {
        return (upa.m194675N3() || !m191797F() || IntlCountryCodeController.m28126v()) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m191799H() {
        return m191797F() && !IntlCountryCodeController.m28126v();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m191800I() {
        return m191797F() && IntlCountryCodeController.m28126v();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m191801J() {
        return "test1".equals(ABManager.m29352j0("intl_me_subscription_card_show"));
    }

    /* JADX INFO: renamed from: K */
    public static boolean m191802K() {
        return m191817Z();
    }

    /* JADX INFO: renamed from: L */
    public static boolean m191803L() {
        if (m191810S()) {
            return false;
        }
        return nkp.m159986e();
    }

    /* JADX INFO: renamed from: M */
    public static boolean m191804M() {
        return "test2".equals(ABManager.m29352j0("intl_see_card_tag"));
    }

    /* JADX INFO: renamed from: N */
    public static void m191805N(List<PurchaseType> list) {
        try {
            JSONObject object = JSON.parseObject(RemoteConfig.m79298x().m79302F("intl_me_vipsee_sort"));
            if (object.getBoolean("enable").booleanValue()) {
                String string = object.getString("mcc");
                if (!TextUtils.isEmpty(string) && vwb.m200337m(JSON.parseArray(string, Integer.class), new w9j() { // from class: l.p59
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(qib0.f154717f0 == ((Integer) obj).intValue());
                    }
                })) {
                    JSONObject object2 = JSON.parseObject(object.getString("sort"));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C20359a(object2.getInteger("vip").intValue(), PurchaseType.TYPE_GET_VIP));
                    arrayList.add(new C20359a(object2.getInteger("see").intValue(), PurchaseType.TYPE_GET_LIKERS));
                    arrayList.add(new C20359a(object2.getInteger("combo").intValue(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE));
                    Collections.sort(arrayList, new Comparator() { // from class: l.q59
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return u59.m191820c((u59.C20359a) obj, (u59.C20359a) obj2);
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((C20359a) it.next()).f174687b);
                    }
                    if (m191812U()) {
                        list.add(PurchaseType.TYPE_ULTRA_PREMIUM);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception unused) {
        }
        list.add(PurchaseType.TYPE_GET_VIP);
        list.add(PurchaseType.TYPE_GET_LIKERS);
        list.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        list.add(PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m191806O() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: P */
    public static boolean m191807P() {
        return RemoteConfig.m79298x().m79330s("intl_parallel_mode");
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m191808Q() {
        if (IntlCountryCodeController.m28115k()) {
            return false;
        }
        return "_Test".equals(ABManager.m29352j0("IntlVASGoogleOrder"));
    }

    /* JADX INFO: renamed from: R */
    public static boolean m191809R() {
        return "test".equals(ABManager.m29352j0("intl_instantmatch_open_user"));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m191810S() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m191811T() {
        return "_Test".equals(ABManager.m29352j0("IntlVASILike"));
    }

    /* JADX INFO: renamed from: U */
    public static boolean m191812U() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m191813V(User user) {
        return (m191812U() || user.isMe()) && user.isUltraPremium() && !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: W */
    public static boolean m191814W() {
        if (IntlCountryCodeController.m28115k()) {
            return false;
        }
        return "_Test".equals(ABManager.m29352j0("IntlVASSubCallback"));
    }

    /* JADX INFO: renamed from: X */
    public static boolean m191815X() {
        String strM29352j0 = ABManager.m29352j0("IntlRewardAds");
        return "_Test".equals(strM29352j0) || "_TestNew".equals(strM29352j0);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m191816Y() {
        return "_TestNew".equals(ABManager.m29352j0("IntlRewardAds"));
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m191817Z() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m191818a0() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m191819b0(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(RemoteConfig.m79298x().m79302F("intl_kol_active"));
            if (object.getBoolean("enable").booleanValue()) {
                f174678r.set(vwb.m200337m(JSON.parseArray(object.getString("userids"), String.class), new w9j() { // from class: l.s59
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).equals(str));
                    }
                }));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m191820c(C20359a c20359a, C20359a c20359a2) {
        return c20359a.f174686a - c20359a2.f174686a;
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m191821c0() {
        return "_Test".equals(ABManager.m29352j0("IntlVASLocSvc"));
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m191823d0() {
        return CoreModule.f17554l.m94652b().mo35107Yg();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m191825e0() {
        Locale locale = CoreModule.f17544b.getResources().getConfiguration().locale;
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry());
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m191827f0() {
        return m191829g0() || m191831h0();
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m191829g0() {
        return "a".equals(ABManager.m29352j0("intl_letterc")) && !IntlCountryCodeController.m28126v();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m191830h() {
        return (f174661a || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m191831h0() {
        return "b".equals(ABManager.m29352j0("intl_letterc")) && !IntlCountryCodeController.m28126v();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m191832i() {
        return (f174662b || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m191833i0() {
        return "idn_card_small".equals(ABManager.m29352j0(f174684x));
    }

    /* JADX INFO: renamed from: j */
    public static int m191834j() {
        return f174665e;
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m191835j0() {
        return "live_2".equals(ABManager.m29352j0("live_cn")) || "live_4".equals(ABManager.m29352j0("live_in"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m191836k() {
        return (f174663c || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m191837k0() {
        try {
            return Integer.parseInt(RemoteConfig.m79298x().m79302F("live_card_pop"));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m191838l() {
        return (f174664d || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public static org.json.JSONObject m191839l0() {
        if (TextUtils.isEmpty(f174675o)) {
            f174675o = RemoteConfig.m79298x().m79302F("intl_replace_right_api");
        }
        if (TextUtils.isEmpty(f174675o)) {
            return null;
        }
        try {
            return new org.json.JSONObject(f174675o);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m191840m() {
        m191815X();
        return (f174666f || IntlCountryCodeController.m28115k() || !m191815X()) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m191841m0() {
        org.json.JSONObject jSONObjectM191839l0 = m191839l0();
        if (jSONObjectM191839l0 == null) {
            return false;
        }
        try {
            return jSONObjectM191839l0.optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m191842n() {
        return (f174667g || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m191843n0(User user) {
        return NullChecker.m81303a(user) && !vwb.m200296J(user.profile.extensions.business.cardType) && "official_ad_card".equals(user.profile.extensions.business.cardType.get(0));
    }

    /* JADX INFO: renamed from: o */
    public static void m191844o() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            m191819b0(userM169527p9.f56011id);
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m191845p() {
        return TextUtils.equals(ABManager.m29352j0("intl_gp_payment"), AuthenticationTokenClaims.JSON_KEY_EXP) || RemoteConfig.m79298x().m79330s("intl_gp_pay_product");
    }

    /* JADX INFO: renamed from: q */
    public static boolean m191846q() {
        return !f174673m.booleanValue() && !l9b.m149015X(CoreModule.f17545c.f19576J0.f115754f0.get().longValue()) && NullChecker.m81303a(f174671k) && mqi0.m155948s(f174671k.get(11), f174671k.get(12), f174671k.get(13)) < f174672l;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m191847r() {
        try {
            return JSON.parseObject(RemoteConfig.m79298x().m79302F("intl_metab_config")).getBoolean("enable").booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m191848s(String str) {
        org.json.JSONObject jSONObjectM191839l0 = m191839l0();
        if (jSONObjectM191839l0 != null && !TextUtils.isEmpty(str)) {
            try {
                List array = JSON.parseArray(jSONObjectM191839l0.getString("screenShotWhiteList"), String.class);
                if (vwb.m200296J(array)) {
                    return false;
                }
                return array.contains(str);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m191849t() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.m79298x().m79333v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        if (!NullChecker.m81303a(intrRiskConfig) || intrRiskConfig.detectAboutMe.isEmpty()) {
            return false;
        }
        return vwb.m200337m(intrRiskConfig.detectAboutMe, new w9j() { // from class: l.r59
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(qib0.f154717f0 == ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static boolean m191850u() {
        return m191852w() || m191851v();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m191851v() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.m79298x().m79333v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        return NullChecker.m81303a(intrRiskConfig) && intrRiskConfig.testb;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m191852w() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.m79298x().m79333v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        return NullChecker.m81303a(intrRiskConfig) && intrRiskConfig.testa;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m191853x(final String str) {
        if (NullChecker.m81303a(f174677q)) {
            return vwb.m200337m(f174677q, new w9j() { // from class: l.t59
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(obj.equals(str));
                }
            });
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static IntlSlGuideConfig m191854y() {
        IntlSlGuideConfig intlSlGuideConfig = new IntlSlGuideConfig();
        intlSlGuideConfig.intl_sl_card_guide_dlg_men = 3;
        intlSlGuideConfig.intl_sl_card_guide_dlg_women = 3;
        intlSlGuideConfig.intl_pop_0_20_men = 0.395f;
        intlSlGuideConfig.intl_pop_0_20_women = 0.74f;
        intlSlGuideConfig.intl_pop_0_30_men = 0.355f;
        intlSlGuideConfig.intl_pop_0_30_women = 0.705f;
        intlSlGuideConfig.intl_card_user_last_active_limit_time = 24;
        return intlSlGuideConfig;
    }

    /* JADX INFO: renamed from: z */
    public static List<PurchaseType> m191855z() {
        f174685y.clear();
        f174685y.add(PurchaseType.TYPE_GET_VIP);
        List<PurchaseType> list = f174685y;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        list.add(purchaseType);
        List<PurchaseType> list2 = f174685y;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        list2.add(purchaseType2);
        f174685y.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        if (CoreModule.f17545c.f19654j0.m30572A4()) {
            f174685y.remove(purchaseType);
            f174685y.add(0, purchaseType);
        } else if (CoreModule.f17545c.f19654j0.m30643y4()) {
            f174685y.remove(purchaseType2);
            f174685y.add(0, purchaseType2);
        }
        return f174685y;
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public final void mo29394b() {
        f174661a = true;
        f174662b = true;
        f174667g = true;
        f174663c = true;
        f174677q = null;
        f174674n = "";
        f174675o = "";
        f174673m = Boolean.TRUE;
        f174671k = null;
        f174670j = null;
        f174685y.clear();
        f174678r.set(false);
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public final void mo29393a() {
    }
}
