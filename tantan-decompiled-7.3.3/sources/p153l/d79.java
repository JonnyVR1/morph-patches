package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p051p1.mobile.putong.core.data.IntlSobotHelpCenter;
import com.p051p1.mobile.putong.core.data.IntrRiskConfig;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
public class d79 implements ABManager.InterfaceC4829d {

    /* JADX INFO: renamed from: a */
    public static boolean f85468a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f85469b = true;

    /* JADX INFO: renamed from: c */
    public static boolean f85470c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f85471d = true;

    /* JADX INFO: renamed from: e */
    public static int f85472e = 0;

    /* JADX INFO: renamed from: f */
    public static boolean f85473f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f85474g = true;

    /* JADX INFO: renamed from: h */
    public static int f85475h;

    /* JADX INFO: renamed from: i */
    public static int f85476i;

    /* JADX INFO: renamed from: j */
    public static Calendar f85477j;

    /* JADX INFO: renamed from: k */
    public static Calendar f85478k;

    /* JADX INFO: renamed from: l */
    public static long f85479l;

    /* JADX INFO: renamed from: q */
    public static JSONArray f85484q;

    /* JADX INFO: renamed from: m */
    public static Boolean f85480m = Boolean.TRUE;

    /* JADX INFO: renamed from: n */
    public static String f85481n = "";

    /* JADX INFO: renamed from: o */
    public static String f85482o = "";

    /* JADX INFO: renamed from: p */
    public static volatile int f85483p = -1;

    /* JADX INFO: renamed from: r */
    public static AtomicBoolean f85485r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s */
    public static boolean f85486s = false;

    /* JADX INFO: renamed from: t */
    public static int f85487t = -1;

    /* JADX INFO: renamed from: u */
    public static boolean f85488u = false;

    /* JADX INFO: renamed from: v */
    public static String f85489v = "idn_top";

    /* JADX INFO: renamed from: w */
    public static String f85490w = "oc_top";

    /* JADX INFO: renamed from: x */
    public static String f85491x = "idn_live";

    /* JADX INFO: renamed from: y */
    public static List<PurchaseType> f85492y = new ArrayList();

    /* JADX INFO: renamed from: z */
    public static final wyd0 f85493z = new wyd0("me_tab_revamp_debug_group", "");

    /* JADX INFO: renamed from: l.d79$a */
    public static class C16468a {

        /* JADX INFO: renamed from: a */
        public int f85494a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f85495b;

        public C16468a(int i, PurchaseType purchaseType) {
            this.f85494a = i;
            this.f85495b = purchaseType;
        }
    }

    /* JADX INFO: renamed from: A */
    public static IntlSlGuideConfig m114642A() {
        try {
            IntlSlGuideConfig intlSlGuideConfig = (IntlSlGuideConfig) RemoteConfig.m80481x().m80516v("intl_sl_guide_config", IntlSlGuideConfig.JSON_ADAPTER);
            if (intlSlGuideConfig != null) {
                return intlSlGuideConfig;
            }
        } catch (Exception unused) {
        }
        return m114708y();
    }

    /* JADX INFO: renamed from: B */
    public static String m114643B() {
        return ABManager.m30350j0("intl_me_tab_revamp");
    }

    /* JADX INFO: renamed from: C */
    public static List<PurchaseType> m114644C() {
        if (!jyb.m147479J(f85492y)) {
            return f85492y;
        }
        if (m114661T() && !joa.m146361M3() && joa.m146401n4() && joa.m146392i4() && joa.m146373Y3()) {
            f85492y.add(PurchaseType.TYPE_GET_VIP);
            f85492y.add(PurchaseType.TYPE_GET_LIKERS);
            f85492y.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (m114663V()) {
                f85492y.add(PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        } else {
            m114656O(f85492y);
        }
        return f85492y;
    }

    /* JADX INFO: renamed from: D */
    public static String m114645D() {
        IntlSobotHelpCenter intlSobotHelpCenter;
        try {
            intlSobotHelpCenter = (IntlSobotHelpCenter) RemoteConfig.m80481x().m80516v("intl_sobot_help", IntlSobotHelpCenter.JSON_ADAPTER);
        } catch (Exception unused) {
            intlSobotHelpCenter = null;
        }
        return intlSobotHelpCenter == null ? "" : intlSobotHelpCenter.url;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m114646E() {
        if (IntlCountryCodeController.m29114k()) {
            return false;
        }
        int i = uqb0.f180400f0;
        return i == 466 || i == 0 || TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m114647F() {
        return m114675e0();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m114648G() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m114649H() {
        return (gra.m131606N3() || !m114648G() || IntlCountryCodeController.m29125v()) ? false : true;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m114650I() {
        return m114648G() && !IntlCountryCodeController.m29125v();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m114651J() {
        return m114648G() && IntlCountryCodeController.m29125v();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m114652K() {
        return "test1".equals(ABManager.m30350j0("intl_me_subscription_card_show"));
    }

    /* JADX INFO: renamed from: L */
    public static boolean m114653L() {
        return m114668a0();
    }

    /* JADX INFO: renamed from: M */
    public static boolean m114654M() {
        if (m114661T()) {
            return false;
        }
        return nmp.m163836e();
    }

    /* JADX INFO: renamed from: N */
    public static boolean m114655N() {
        return "test2".equals(ABManager.m30350j0("intl_see_card_tag"));
    }

    /* JADX INFO: renamed from: O */
    public static void m114656O(List<PurchaseType> list) {
        try {
            JSONObject object = JSON.parseObject(RemoteConfig.m80481x().m80485F("intl_me_vipsee_sort"));
            if (object.getBoolean("enable").booleanValue()) {
                String string = object.getString("mcc");
                if (!TextUtils.isEmpty(string) && jyb.m147520m(JSON.parseArray(string, Integer.class), new qcj() { // from class: l.y69
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(uqb0.f180400f0 == ((Integer) obj).intValue());
                    }
                })) {
                    JSONObject object2 = JSON.parseObject(object.getString("sort"));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C16468a(object2.getInteger("vip").intValue(), PurchaseType.TYPE_GET_VIP));
                    arrayList.add(new C16468a(object2.getInteger("see").intValue(), PurchaseType.TYPE_GET_LIKERS));
                    arrayList.add(new C16468a(object2.getInteger("combo").intValue(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE));
                    Collections.sort(arrayList, new Comparator() { // from class: l.z69
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return d79.m114670c((d79.C16468a) obj, (d79.C16468a) obj2);
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((C16468a) it.next()).f85495b);
                    }
                    if (m114663V()) {
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

    /* JADX INFO: renamed from: P */
    public static boolean m114657P() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m114658Q() {
        return RemoteConfig.m80481x().m80513s("intl_parallel_mode");
    }

    /* JADX INFO: renamed from: R */
    public static boolean m114659R() {
        if (IntlCountryCodeController.m29114k()) {
            return false;
        }
        return "_Test".equals(ABManager.m30350j0("IntlVASGoogleOrder"));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m114660S() {
        return "test".equals(ABManager.m30350j0("intl_instantmatch_open_user"));
    }

    /* JADX INFO: renamed from: T */
    public static boolean m114661T() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m114662U() {
        return "_Test".equals(ABManager.m30350j0("IntlVASILike"));
    }

    /* JADX INFO: renamed from: V */
    public static boolean m114663V() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: W */
    public static boolean m114664W(User user) {
        return (m114663V() || user.isMe()) && user.isUltraPremium() && !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m114665X() {
        if (IntlCountryCodeController.m29114k()) {
            return false;
        }
        return "_Test".equals(ABManager.m30350j0("IntlVASSubCallback"));
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m114666Y() {
        String strM30350j0 = ABManager.m30350j0("IntlRewardAds");
        return "_Test".equals(strM30350j0) || "_TestNew".equals(strM30350j0);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m114667Z() {
        return "_TestNew".equals(ABManager.m30350j0("IntlRewardAds"));
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m114668a0() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m114669b0() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m114670c(C16468a c16468a, C16468a c16468a2) {
        return c16468a.f85494a - c16468a2.f85494a;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m114671c0(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(RemoteConfig.m80481x().m80485F("intl_kol_active"));
            if (object.getBoolean("enable").booleanValue()) {
                f85485r.set(jyb.m147520m(JSON.parseArray(object.getString("userids"), String.class), new qcj() { // from class: l.b79
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).equals(str));
                    }
                }));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m114673d0() {
        return "_Test".equals(ABManager.m30350j0("IntlVASLocSvc"));
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m114675e0() {
        return CoreModule.f18273l.m143406b().mo36110Yg();
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m114677f0() {
        return (m114679g0() || m114681h0()) ? false : true;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m114679g0() {
        return "test1".equals(m114643B());
    }

    /* JADX INFO: renamed from: h */
    public static boolean m114680h() {
        return (f85468a || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m114681h0() {
        return "test2".equals(m114643B());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m114682i() {
        return (f85469b || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m114683i0() {
        Locale locale = CoreModule.f18263b.getResources().getConfiguration().locale;
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry());
    }

    /* JADX INFO: renamed from: j */
    public static int m114684j() {
        return f85472e;
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m114685j0() {
        return m114687k0() || m114689l0();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m114686k() {
        return (f85470c || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m114687k0() {
        return "a".equals(ABManager.m30350j0("intl_letterc")) && !IntlCountryCodeController.m29125v();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m114688l() {
        return (f85471d || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m114689l0() {
        return "b".equals(ABManager.m30350j0("intl_letterc")) && !IntlCountryCodeController.m29125v();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m114690m() {
        m114666Y();
        return (f85473f || IntlCountryCodeController.m29114k() || !m114666Y()) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m114691m0() {
        return "idn_card_small".equals(ABManager.m30350j0(f85491x));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m114692n() {
        return (f85474g || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m114693n0() {
        return "live_2".equals(ABManager.m30350j0("live_cn")) || "live_4".equals(ABManager.m30350j0("live_in"));
    }

    /* JADX INFO: renamed from: o */
    public static void m114694o() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            m114671c0(userM116600p9.f56859id);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static int m114695o0() {
        try {
            return Integer.parseInt(RemoteConfig.m80481x().m80485F("live_card_pop"));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m114696p() {
        return TextUtils.equals(ABManager.m30350j0("intl_gp_payment"), AuthenticationTokenClaims.JSON_KEY_EXP) || RemoteConfig.m80481x().m80513s("intl_gp_pay_product");
    }

    /* JADX INFO: renamed from: p0 */
    public static org.json.JSONObject m114697p0() {
        if (TextUtils.isEmpty(f85482o)) {
            f85482o = RemoteConfig.m80481x().m80485F("intl_replace_right_api");
        }
        if (TextUtils.isEmpty(f85482o)) {
            return null;
        }
        try {
            return new org.json.JSONObject(f85482o);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m114698q() {
        return !f85480m.booleanValue() && !yab.m214867X(CoreModule.f18264c.f20318J0.f134516f0.get().longValue()) && NullChecker.m82486a(f85478k) && pzi0.m174458s(f85478k.get(11), f85478k.get(12), f85478k.get(13)) < f85479l;
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m114699q0() {
        org.json.JSONObject jSONObjectM114697p0 = m114697p0();
        if (jSONObjectM114697p0 == null) {
            return false;
        }
        try {
            return jSONObjectM114697p0.optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m114700r() {
        try {
            return JSON.parseObject(RemoteConfig.m80481x().m80485F("intl_metab_config")).getBoolean("enable").booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m114701r0(User user) {
        return NullChecker.m82486a(user) && !jyb.m147479J(user.profile.extensions.business.cardType) && "official_ad_card".equals(user.profile.extensions.business.cardType.get(0));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m114702s(String str) {
        org.json.JSONObject jSONObjectM114697p0 = m114697p0();
        if (jSONObjectM114697p0 != null && !TextUtils.isEmpty(str)) {
            try {
                List array = JSON.parseArray(jSONObjectM114697p0.getString("screenShotWhiteList"), String.class);
                if (jyb.m147479J(array)) {
                    return false;
                }
                return array.contains(str);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m114703t() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.m80481x().m80516v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        if (!NullChecker.m82486a(intrRiskConfig) || intrRiskConfig.detectAboutMe.isEmpty()) {
            return false;
        }
        return jyb.m147520m(intrRiskConfig.detectAboutMe, new qcj() { // from class: l.a79
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(uqb0.f180400f0 == ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static boolean m114704u() {
        return m114706w() || m114705v();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m114705v() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.m80481x().m80516v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        return NullChecker.m82486a(intrRiskConfig) && intrRiskConfig.testb;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m114706w() {
        IntrRiskConfig intrRiskConfig;
        try {
            intrRiskConfig = (IntrRiskConfig) RemoteConfig.m80481x().m80516v("risk_warning", IntrRiskConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intrRiskConfig = null;
        }
        return NullChecker.m82486a(intrRiskConfig) && intrRiskConfig.testa;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m114707x(final String str) {
        if (NullChecker.m82486a(f85484q)) {
            return jyb.m147520m(f85484q, new qcj() { // from class: l.c79
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(obj.equals(str));
                }
            });
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static IntlSlGuideConfig m114708y() {
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
    public static List<PurchaseType> m114709z() {
        f85492y.clear();
        f85492y.add(PurchaseType.TYPE_GET_VIP);
        List<PurchaseType> list = f85492y;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        list.add(purchaseType);
        List<PurchaseType> list2 = f85492y;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        list2.add(purchaseType2);
        f85492y.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        if (CoreModule.f18264c.f20396j0.m31575A4()) {
            f85492y.remove(purchaseType);
            f85492y.add(0, purchaseType);
        } else if (CoreModule.f18264c.f20396j0.m31646y4()) {
            f85492y.remove(purchaseType2);
            f85492y.add(0, purchaseType2);
        }
        return f85492y;
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public final void mo30392b() {
        f85468a = true;
        f85469b = true;
        f85474g = true;
        f85470c = true;
        f85484q = null;
        f85481n = "";
        f85482o = "";
        f85480m = Boolean.TRUE;
        f85478k = null;
        f85477j = null;
        f85492y.clear();
        f85485r.set(false);
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public final void mo30391a() {
    }
}
