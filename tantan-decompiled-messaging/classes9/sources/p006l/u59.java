package p006l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p1.mobile.putong.core.data.IntlSobotHelpCenter;
import com.p1.mobile.putong.core.data.IntrRiskConfig;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import l.l9b;
import l.mqi0;
import l.vwb;
import l.w9j;
import org.json.JSONException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u59 implements ABManager.InterfaceC0104d {

    /* JADX INFO: renamed from: a */
    public static boolean f23343a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f23344b = true;

    /* JADX INFO: renamed from: c */
    public static boolean f23345c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f23346d = true;

    /* JADX INFO: renamed from: e */
    public static int f23347e = 0;

    /* JADX INFO: renamed from: f */
    public static boolean f23348f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f23349g = true;

    /* JADX INFO: renamed from: h */
    public static int f23350h;

    /* JADX INFO: renamed from: i */
    public static int f23351i;

    /* JADX INFO: renamed from: j */
    public static Calendar f23352j;

    /* JADX INFO: renamed from: k */
    public static Calendar f23353k;

    /* JADX INFO: renamed from: l */
    public static long f23354l;

    /* JADX INFO: renamed from: q */
    public static JSONArray f23359q;

    /* JADX INFO: renamed from: m */
    public static Boolean f23355m = Boolean.TRUE;

    /* JADX INFO: renamed from: n */
    public static String f23356n = "";

    /* JADX INFO: renamed from: o */
    public static String f23357o = "";

    /* JADX INFO: renamed from: p */
    public static volatile int f23358p = -1;

    /* JADX INFO: renamed from: r */
    public static AtomicBoolean f23360r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s */
    public static boolean f23361s = false;

    /* JADX INFO: renamed from: t */
    public static int f23362t = -1;

    /* JADX INFO: renamed from: u */
    public static boolean f23363u = false;

    /* JADX INFO: renamed from: v */
    public static String f23364v = "idn_top";

    /* JADX INFO: renamed from: w */
    public static String f23365w = "oc_top";

    /* JADX INFO: renamed from: x */
    public static String f23366x = "idn_live";

    /* JADX INFO: renamed from: y */
    public static List<PurchaseType> f23367y = new ArrayList();

    /* JADX INFO: renamed from: l.u59$a */
    public static class C1335a {

        /* JADX INFO: renamed from: a */
        public int f23368a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f23369b;

        public C1335a(int i, PurchaseType purchaseType) {
            this.f23368a = i;
            this.f23369b = purchaseType;
        }
    }

    /* JADX INFO: renamed from: A */
    public static IntlSlGuideConfig m24963A() {
        try {
            IntlSlGuideConfig intlSlGuideConfig = (IntlSlGuideConfig) RemoteConfig.x().v("intl_sl_guide_config", IntlSlGuideConfig.JSON_ADAPTER);
            if (intlSlGuideConfig != null) {
                return intlSlGuideConfig;
            }
        } catch (Exception unused) {
        }
        return m25025y();
    }

    /* JADX INFO: renamed from: B */
    public static List<PurchaseType> m24964B() {
        if (!vwb.J(f23367y)) {
            return f23367y;
        }
        if (m24981S() && !xma.m27355L3() && xma.m27395m4() && xma.m27385h4() && xma.m27367X3()) {
            f23367y.add(PurchaseType.TYPE_GET_VIP);
            f23367y.add(PurchaseType.TYPE_GET_LIKERS);
            f23367y.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (m24983U()) {
                f23367y.add(PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        } else {
            m24976N(f23367y);
        }
        return f23367y;
    }

    /* JADX INFO: renamed from: C */
    public static String m24965C() {
        IntlSobotHelpCenter intlSobotHelpCenter;
        try {
            intlSobotHelpCenter = (IntlSobotHelpCenter) RemoteConfig.x().v("intl_sobot_help", IntlSobotHelpCenter.JSON_ADAPTER);
        } catch (Exception unused) {
            intlSobotHelpCenter = null;
        }
        return intlSobotHelpCenter == null ? "" : intlSobotHelpCenter.url;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m24966D() {
        if (IntlCountryCodeController.m10k()) {
            return false;
        }
        int i = qib0.f19808f0;
        return i == 466 || i == 0 || TEnum.equals(qib0.f19810h0, "taiwan");
    }

    /* JADX INFO: renamed from: E */
    public static boolean m24967E() {
        return m24994d0();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m24968F() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m24969G() {
        return (upa.m25373N3() || !m24968F() || IntlCountryCodeController.m21v()) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m24970H() {
        return m24968F() && !IntlCountryCodeController.m21v();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m24971I() {
        return m24968F() && IntlCountryCodeController.m21v();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m24972J() {
        return "test1".equals(ABManager.m1258j0("intl_me_subscription_card_show"));
    }

    /* JADX INFO: renamed from: K */
    public static boolean m24973K() {
        return m24988Z();
    }

    /* JADX INFO: renamed from: L */
    public static boolean m24974L() {
        if (m24981S()) {
            return false;
        }
        return nkp.m20159e();
    }

    /* JADX INFO: renamed from: M */
    public static boolean m24975M() {
        return "test2".equals(ABManager.m1258j0("intl_see_card_tag"));
    }

    /* JADX INFO: renamed from: N */
    public static void m24976N(List<PurchaseType> list) {
        try {
            JSONObject object = JSON.parseObject(RemoteConfig.x().F("intl_me_vipsee_sort"));
            if (object.getBoolean("enable").booleanValue()) {
                String string = object.getString("mcc");
                if (!TextUtils.isEmpty(string) && vwb.m(JSON.parseArray(string, Integer.class), new w9j() { // from class: l.p59
                    public final Object call(Object obj) {
                        return Boolean.valueOf(qib0.f19808f0 == ((Integer) obj).intValue());
                    }
                })) {
                    JSONObject object2 = JSON.parseObject(object.getString("sort"));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C1335a(object2.getInteger("vip").intValue(), PurchaseType.TYPE_GET_VIP));
                    arrayList.add(new C1335a(object2.getInteger("see").intValue(), PurchaseType.TYPE_GET_LIKERS));
                    arrayList.add(new C1335a(object2.getInteger("combo").intValue(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE));
                    Collections.sort(arrayList, new Comparator() { // from class: l.q59
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return u59.m24991c((u59.C1335a) obj, (u59.C1335a) obj2);
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((C1335a) it.next()).f23369b);
                    }
                    if (m24983U()) {
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
    public static boolean m24977O() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: P */
    public static boolean m24978P() {
        return RemoteConfig.x().s("intl_parallel_mode");
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m24979Q() {
        if (IntlCountryCodeController.m10k()) {
            return false;
        }
        return "_Test".equals(ABManager.m1258j0("IntlVASGoogleOrder"));
    }

    /* JADX INFO: renamed from: R */
    public static boolean m24980R() {
        return "test".equals(ABManager.m1258j0("intl_instantmatch_open_user"));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m24981S() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m24982T() {
        return "_Test".equals(ABManager.m1258j0("IntlVASILike"));
    }

    /* JADX INFO: renamed from: U */
    public static boolean m24983U() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m24984V(User user) {
        return (m24983U() || user.isMe()) && user.isUltraPremium() && !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: W */
    public static boolean m24985W() {
        if (IntlCountryCodeController.m10k()) {
            return false;
        }
        return "_Test".equals(ABManager.m1258j0("IntlVASSubCallback"));
    }

    /* JADX INFO: renamed from: X */
    public static boolean m24986X() {
        String strM1258j0 = ABManager.m1258j0("IntlRewardAds");
        return "_Test".equals(strM1258j0) || "_TestNew".equals(strM1258j0);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m24987Y() {
        return "_TestNew".equals(ABManager.m1258j0("IntlRewardAds"));
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m24988Z() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m24989a0() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m24990b0(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(RemoteConfig.x().F("intl_kol_active"));
            if (object.getBoolean("enable").booleanValue()) {
                f23360r.set(vwb.m(JSON.parseArray(object.getString("userids"), String.class), new w9j() { // from class: l.s59
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).equals(str));
                    }
                }));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m24991c(C1335a c1335a, C1335a c1335a2) {
        return c1335a.f23368a - c1335a2.f23368a;
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m24992c0() {
        return "_Test".equals(ABManager.m1258j0("IntlVASLocSvc"));
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m24994d0() {
        return CoreModule.f1543l.m11707b().mo7044Yg();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m24996e0() {
        Locale locale = CoreModule.f1533b.getResources().getConfiguration().locale;
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry());
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m24998f0() {
        return m25000g0() || m25002h0();
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m25000g0() {
        return "a".equals(ABManager.m1258j0("intl_letterc")) && !IntlCountryCodeController.m21v();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25001h() {
        return (f23343a || IntlCountryCodeController.m10k()) ? false : true;
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m25002h0() {
        return "b".equals(ABManager.m1258j0("intl_letterc")) && !IntlCountryCodeController.m21v();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m25003i() {
        return (f23344b || IntlCountryCodeController.m10k()) ? false : true;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m25004i0() {
        return "idn_card_small".equals(ABManager.m1258j0(f23366x));
    }

    /* JADX INFO: renamed from: j */
    public static int m25005j() {
        return f23347e;
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m25006j0() {
        return "live_2".equals(ABManager.m1258j0("live_cn")) || "live_4".equals(ABManager.m1258j0("live_in"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25007k() {
        return (f23345c || IntlCountryCodeController.m10k()) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m25008k0() {
        try {
            return Integer.parseInt(RemoteConfig.x().F("live_card_pop"));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m25009l() {
        return (f23346d || IntlCountryCodeController.m10k()) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public static org.json.JSONObject m25010l0() {
        if (TextUtils.isEmpty(f23357o)) {
            f23357o = RemoteConfig.x().F("intl_replace_right_api");
        }
        if (TextUtils.isEmpty(f23357o)) {
            return null;
        }
        try {
            return new org.json.JSONObject(f23357o);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m25011m() {
        m24986X();
        return (f23348f || IntlCountryCodeController.m10k() || !m24986X()) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m25012m0() {
        org.json.JSONObject jSONObjectM25010l0 = m25010l0();
        if (jSONObjectM25010l0 == null) {
            return false;
        }
        try {
            return jSONObjectM25010l0.optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25013n() {
        return (f23349g || IntlCountryCodeController.m10k()) ? false : true;
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m25014n0(User user) {
        return NullChecker.a(user) && !vwb.J(user.profile.extensions.business.cardType) && "official_ad_card".equals(user.profile.extensions.business.cardType.get(0));
    }

    /* JADX INFO: renamed from: o */
    public static void m25015o() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            m24990b0(((DbObject) userM21490p9).id);
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m25016p() {
        return TextUtils.equals(ABManager.m1258j0("intl_gp_payment"), "exp") || RemoteConfig.x().s("intl_gp_pay_product");
    }

    /* JADX INFO: renamed from: q */
    public static boolean m25017q() {
        return !f23355m.booleanValue() && !l9b.X(((Long) CoreModule.f1534c.f3565J0.f14937f0.get()).longValue()) && NullChecker.a(f23353k) && mqi0.s(f23353k.get(11), f23353k.get(12), f23353k.get(13)) < f23354l;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m25018r() {
        try {
            return JSON.parseObject(RemoteConfig.x().F("intl_metab_config")).getBoolean("enable").booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m25019s(String str) {
        org.json.JSONObject jSONObjectM25010l0 = m25010l0();
        if (jSONObjectM25010l0 != null && !TextUtils.isEmpty(str)) {
            try {
                List array = JSON.parseArray(jSONObjectM25010l0.getString("screenShotWhiteList"), String.class);
                if (vwb.J(array)) {
                    return false;
                }
                return array.contains(str);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m25020t() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.x().v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        if (!NullChecker.a(intrRiskConfig) || intrRiskConfig.detectAboutMe.isEmpty()) {
            return false;
        }
        return vwb.m(intrRiskConfig.detectAboutMe, new w9j() { // from class: l.r59
            public final Object call(Object obj) {
                return Boolean.valueOf(qib0.f19808f0 == ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static boolean m25021u() {
        return m25023w() || m25022v();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m25022v() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.x().v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        return NullChecker.a(intrRiskConfig) && intrRiskConfig.testb;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m25023w() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.x().v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        return NullChecker.a(intrRiskConfig) && intrRiskConfig.testa;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m25024x(final String str) {
        if (NullChecker.a(f23359q)) {
            return vwb.m(f23359q, new w9j() { // from class: l.t59
                public final Object call(Object obj) {
                    return Boolean.valueOf(obj.equals(str));
                }
            });
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static IntlSlGuideConfig m25025y() {
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
    public static List<PurchaseType> m25026z() {
        f23367y.clear();
        f23367y.add(PurchaseType.TYPE_GET_VIP);
        List<PurchaseType> list = f23367y;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        list.add(purchaseType);
        List<PurchaseType> list2 = f23367y;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        list2.add(purchaseType2);
        f23367y.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        if (CoreModule.f1534c.f3643j0.m2500A4()) {
            f23367y.remove(purchaseType);
            f23367y.add(0, purchaseType);
        } else if (CoreModule.f1534c.f3643j0.m2571y4()) {
            f23367y.remove(purchaseType2);
            f23367y.add(0, purchaseType2);
        }
        return f23367y;
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public final void mo1300b() {
        f23343a = true;
        f23344b = true;
        f23349g = true;
        f23345c = true;
        f23359q = null;
        f23356n = "";
        f23357o = "";
        f23355m = Boolean.TRUE;
        f23353k = null;
        f23352j = null;
        f23367y.clear();
        f23360r.set(false);
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public final void mo1299a() {
    }
}
