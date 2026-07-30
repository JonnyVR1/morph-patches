package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.AffiliateProducts;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionExtraConfig;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l.d30;
import l.e30;
import l.hpd0;
import l.jo0;
import l.lw0;
import l.mkd0;
import l.mqi0;
import l.r1n;
import l.v9j;
import l.vv5;
import l.vwb;
import l.w9j;
import l.zpd0;
import p006l.ax6;
import p006l.xma;
import rx.c;
import rx.subjects.ReplaySubject;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreIntlAffiliatePromotions extends ax6 {

    /* JADX INFO: renamed from: o0 */
    public static volatile boolean f3176o0;

    /* JADX INFO: renamed from: p0 */
    public static final hpd0 f3177p0;

    /* JADX INFO: renamed from: q0 */
    public static final hpd0 f3178q0;

    /* JADX INFO: renamed from: R */
    public volatile List<IapAffiliatePromotion> f3179R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public volatile List<IapAffiliatePromotion> f3180S;

    /* JADX INFO: renamed from: T */
    public volatile boolean f3181T;

    /* JADX INFO: renamed from: U */
    public volatile boolean f3182U;

    /* JADX INFO: renamed from: V */
    public volatile boolean f3183V;

    /* JADX INFO: renamed from: W */
    public final Object f3184W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public c<List<IapAffiliatePromotion>> f3185X;

    /* JADX INFO: renamed from: Y */
    public final zpd0 f3186Y;

    /* JADX INFO: renamed from: Z */
    public final hpd0 f3187Z;

    /* JADX INFO: renamed from: a0 */
    public final zpd0 f3188a0;

    /* JADX INFO: renamed from: b0 */
    public final zpd0 f3189b0;

    /* JADX INFO: renamed from: c0 */
    public final zpd0 f3190c0;

    /* JADX INFO: renamed from: d0 */
    public final zpd0 f3191d0;

    /* JADX INFO: renamed from: e0 */
    public final b<Boolean> f3192e0;

    /* JADX INFO: renamed from: f0 */
    public final b<Long> f3193f0;

    /* JADX INFO: renamed from: g0 */
    public final ReplaySubject<Boolean> f3194g0;

    /* JADX INFO: renamed from: h0 */
    public volatile long f3195h0;

    /* JADX INFO: renamed from: i0 */
    public volatile long f3196i0;

    /* JADX INFO: renamed from: j0 */
    public volatile long f3197j0;

    /* JADX INFO: renamed from: k0 */
    public volatile long f3198k0;

    /* JADX INFO: renamed from: l0 */
    public volatile long f3199l0;

    /* JADX INFO: renamed from: m0 */
    public volatile long f3200m0;

    /* JADX INFO: renamed from: n0 */
    public volatile long f3201n0;

    public enum IntlAffiliateDiscountEntryTab {
        ME_TAB("meTabSubscriptionCardAbove"),
        MESSAGE_TAB("messageTab"),
        WHISPER_TAB("whisperTab"),
        MEET_ILIKE_NEW_LIKE("newLike"),
        ME_TAB_ILIKE_OLD_LIKE("oldLike"),
        MEET_LIKERS_NEW_SEE("newSee"),
        SEE_STANDALONE_OLD_SEE("oldSee"),
        MEET_VISITORS_NEW_VISITOR("newVisitor"),
        ME_TAB_VISITORS_OLD_VISITOR("oldVisitor"),
        HOME_SWIPE_CARD_PAGE("swipeCardPage");


        @NonNull
        public final String displayConfigKey;

        IntlAffiliateDiscountEntryTab(String str) {
            this.displayConfigKey = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions$a */
    public class C0143a implements lw0.c {
        public void onBack() {
            C0158c c0158c = CoreModule.f1534c;
            if (c0158c == null) {
                return;
            }
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = c0158c.f3685x0;
            if (r1n.g("app_back")) {
                return;
            }
            coreIntlAffiliatePromotions.m2096C3();
        }

        public void onFront() {
            C0158c c0158c = CoreModule.f1534c;
            if (c0158c == null) {
                return;
            }
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = c0158c.f3685x0;
            r1n.j("app_front");
            coreIntlAffiliatePromotions.m2156y4();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3177p0 = new hpd0("debug_mock_discount_promotion", bool);
        f3178q0 = new hpd0("debug_mock_free_trial_promotion", bool);
    }

    public CoreIntlAffiliatePromotions(C0158c c0158c) {
        super(c0158c);
        this.f3179R = Collections.EMPTY_LIST;
        this.f3184W = new Object();
        this.f3186Y = new zpd0("intl_promotion_me_tab_dot_clicked_hit_" + CoreModule.m1850H().userId(), 0L);
        this.f3187Z = new hpd0("intl_swipe_first_fullscreen_discount_auto_shown_" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f3188a0 = new zpd0("intl_swipe_first_fullscreen_discount_last_auto_hit_" + CoreModule.m1850H().userId(), 0L);
        this.f3189b0 = new zpd0("intl_affiliate_cd_remain_sec_" + CoreModule.m1850H().userId(), -1L);
        this.f3190c0 = new zpd0("intl_affiliate_cd_bound_hit_" + CoreModule.m1850H().userId(), 0L);
        this.f3191d0 = new zpd0("intl_affiliate_client_dismiss_hit_" + CoreModule.m1850H().userId(), 0L);
        this.f3192e0 = b.b();
        this.f3193f0 = b.b();
        this.f3194g0 = ReplaySubject.d(1);
        this.f3195h0 = -1L;
        m2091z4();
    }

    /* JADX INFO: renamed from: D4 */
    public static String m2069D4(@Nullable String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: K4 */
    public static boolean m2070K4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
        return iapAffiliatePromotionExtraConfig != null && iapAffiliatePromotionExtraConfig.countdown > 0;
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m2071Q3(@NonNull String str, @NonNull String str2) {
        String strTrim = str.trim();
        String strTrim2 = str2.trim();
        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
            if (TextUtils.equals(strTrim, strTrim2)) {
                return true;
            }
            if (!strTrim.contains(":") && strTrim2.startsWith(strTrim.concat(":"))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R3 */
    public static boolean m2072R3(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        String strTrim = str2.trim();
        if (!TextUtils.isEmpty(str3)) {
            strTrim = m2089l3(strTrim, str3).trim();
        }
        return m2071Q3(str.trim(), strTrim);
    }

    /* JADX INFO: renamed from: U3 */
    public static boolean m2073U3(@Nullable IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, boolean z) {
        if (iapAffiliatePromotionDisplaySlot == null) {
            return false;
        }
        if (TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.mainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.subtitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.buttonText) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.imgUrl) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.theme) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public static boolean m2074V3(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null || TextUtils.isEmpty(iapAffiliatePromotion.promotionType)) {
            return false;
        }
        return "freeTrial".equalsIgnoreCase(iapAffiliatePromotion.promotionType.trim());
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m2075a3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static boolean m2076a4(long j) {
        return j == 99999 || j == 88888;
    }

    /* JADX INFO: renamed from: b4 */
    public static boolean m2078b4(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "discount".equalsIgnoreCase(str) || "freeTrial".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: d4 */
    public static boolean m2081d4(IapAffiliatePromotion iapAffiliatePromotion, long j) {
        long j2 = iapAffiliatePromotion.startTime;
        if (j2 > 0 && j < j2) {
            return false;
        }
        long j3 = iapAffiliatePromotion.endTime;
        return j3 <= 0 || j <= j3;
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ List m2082e3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        return (moduleData == null || vwb.J(moduleData.iapAffiliatePromotions)) ? Collections.EMPTY_LIST : moduleData.iapAffiliatePromotions;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m2086i3(List list) {
    }

    @NonNull
    /* JADX INFO: renamed from: l3 */
    public static String m2089l3(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.trim();
        if (TextUtils.isEmpty(str2)) {
            return strTrim;
        }
        String str3 = ":" + str2.trim();
        return strTrim.endsWith(str3) ? strTrim.substring(0, strTrim.length() - str3.length()) : strTrim;
    }

    @NonNull
    /* JADX INFO: renamed from: m3 */
    public static String m2090m3(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str == null) {
            str = "";
        }
        String strTrim = str2 != null ? str2.trim() : "";
        String strTrim2 = str3 != null ? str3.trim() : "";
        if (TextUtils.isEmpty(strTrim2)) {
            return TextUtils.isEmpty(strTrim) ? str : strTrim;
        }
        if (TextUtils.isEmpty(strTrim)) {
            return "";
        }
        return strTrim + ":" + strTrim2;
    }

    /* JADX INFO: renamed from: z4 */
    public static void m2091z4() {
        if (f3176o0) {
            return;
        }
        synchronized (CoreIntlAffiliatePromotions.class) {
            try {
                if (f3176o0) {
                    return;
                }
                lw0.c().b(new C0143a());
                f3176o0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final IapAffiliatePromotion m2092A3() {
        Map map;
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        long jO = mqi0.o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion.productType)) && m2078b4(iapAffiliatePromotion.promotionType) && m2081d4(iapAffiliatePromotion, jO) && !m2120X3(iapAffiliatePromotion.promotionHitId) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public void m2093A4(long j, long j2) {
        if (j <= 0) {
            return;
        }
        long jMax = Math.max(0L, j2);
        this.f3196i0 = j;
        this.f3195h0 = jMax;
    }

    /* JADX INFO: renamed from: B3 */
    public void m2094B3() {
        m2096C3();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m2095B4(@Nullable List<IapAffiliatePromotion> list) {
        IapAffiliatePromotion next;
        Map map;
        if (m2122Z3()) {
            return;
        }
        if (!vwb.J(list)) {
            long jO = mqi0.o() / 1000;
            Iterator<IapAffiliatePromotion> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && "svip".equalsIgnoreCase(m2069D4(next.productType)) && m2078b4(next.promotionType) && m2081d4(next, jO) && (map = next.displayConfig) != null && map.get("promotionMainPage") != null) {
                    break;
                }
            }
        } else {
            next = null;
            break;
        }
        if (next == null) {
            this.f3189b0.put(-1L);
            this.f3190c0.put(0L);
            return;
        }
        long jLongValue = ((Long) this.f3190c0.get()).longValue();
        if (jLongValue == 0 || next.promotionHitId == jLongValue) {
            return;
        }
        this.f3189b0.put(-1L);
        this.f3190c0.put(0L);
    }

    /* JADX INFO: renamed from: C3 */
    public final void m2096C3() {
        if (this.f3196i0 <= 0 || this.f3195h0 < 0) {
            return;
        }
        if (((Long) this.f3189b0.get()).longValue() == this.f3195h0 && ((Long) this.f3190c0.get()).longValue() == this.f3196i0) {
            return;
        }
        this.f3189b0.put(Long.valueOf(this.f3195h0));
        this.f3190c0.put(Long.valueOf(this.f3196i0));
    }

    /* JADX INFO: renamed from: C4 */
    public long m2097C4() {
        IapAffiliatePromotion iapAffiliatePromotionM2155y3 = m2155y3();
        if (iapAffiliatePromotionM2155y3 != null) {
            return iapAffiliatePromotionM2155y3.promotionHitId;
        }
        for (IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab : IntlAffiliateDiscountEntryTab.values()) {
            IapAffiliatePromotion iapAffiliatePromotionM2157z3 = m2157z3(intlAffiliateDiscountEntryTab.displayConfigKey);
            if (iapAffiliatePromotionM2157z3 != null) {
                return iapAffiliatePromotionM2157z3.promotionHitId;
            }
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public IapAffiliatePromotion m2098D3(@NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        return m2157z3(intlAffiliateDiscountEntryTab.displayConfigKey);
    }

    @Nullable
    /* JADX INFO: renamed from: E3 */
    public IapAffiliatePromotion m2099E3() {
        return m2155y3();
    }

    /* JADX INFO: renamed from: E4 */
    public void m2100E4(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f3200m0 = j;
        this.f3201n0 = j2;
    }

    /* JADX INFO: renamed from: F3 */
    public long m2101F3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m2137p3(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: F4 */
    public final boolean m2102F4() {
        String strM1258j0 = ABManager.m1258j0("intl_ft_revamp");
        return "test1".equals(strM1258j0) || "test2".equals(strM1258j0);
    }

    @Nullable
    /* JADX INFO: renamed from: G3 */
    public IapAffiliatePromotionDisplaySlot m2103G3(@Nullable IapAffiliatePromotion iapAffiliatePromotion, @NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        Map map;
        if (iapAffiliatePromotion == null || (map = iapAffiliatePromotion.displayConfig) == null) {
            return null;
        }
        return (IapAffiliatePromotionDisplaySlot) map.get(intlAffiliateDiscountEntryTab.displayConfigKey);
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m2104G4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m2070K4(iapAffiliatePromotion);
    }

    @Nullable
    /* JADX INFO: renamed from: H3 */
    public IapAffiliatePromotionDisplaySlot m2105H3(String str) {
        Map map;
        IapAffiliatePromotion iapAffiliatePromotionM2107I3 = m2107I3();
        if (iapAffiliatePromotionM2107I3 == null || (map = iapAffiliatePromotionM2107I3.displayConfig) == null) {
            return null;
        }
        return (IapAffiliatePromotionDisplaySlot) map.get(str);
    }

    /* JADX INFO: renamed from: H4 */
    public boolean m2106H4() {
        IapAffiliatePromotion iapAffiliatePromotionM2107I3;
        return (!xma.m27379e4() || (iapAffiliatePromotionM2107I3 = m2107I3()) == null || ((Long) this.f3186Y.get()).longValue() == iapAffiliatePromotionM2107I3.promotionHitId) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: I3 */
    public IapAffiliatePromotion m2107I3() {
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        long jO = mqi0.o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion.productType)) && m2078b4(iapAffiliatePromotion.promotionType) && m2081d4(iapAffiliatePromotion, jO) && !m2120X3(iapAffiliatePromotion.promotionHitId)) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I4 */
    public void m2108I4() {
        m2152w4().subscribe(new e30() { // from class: l.p49
            public final void call(Object obj) {
                CoreIntlAffiliatePromotions.m2086i3((List) obj);
            }
        }, new e30() { // from class: l.q49
            public final void call(Object obj) {
                CoreIntlAffiliatePromotions.m2075a3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public long m2109J3() {
        IapAffiliatePromotion iapAffiliatePromotionM2155y3 = m2155y3();
        if (iapAffiliatePromotionM2155y3 != null) {
            return iapAffiliatePromotionM2155y3.endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: J4 */
    public void m2110J4(long j, long j2, long j3) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f3197j0 = j;
        this.f3199l0 = j2;
        this.f3198k0 = Math.max(0L, j3);
    }

    /* JADX INFO: renamed from: K3 */
    public c<List<IapAffiliatePromotion>> m2111K3() {
        return !m2102F4() ? c.just(Collections.EMPTY_LIST).compose(mkd0.C()) : this.f8580Q.scheduled("iap_affiliate_promotions_googleplay", 0, new v9j() { // from class: l.o49
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.r49
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3218d0()).f().b();
                    }
                }).map(new w9j() { // from class: l.s49
                    public final Object call(Object obj) {
                        return CoreIntlAffiliatePromotions.m2082e3((Envelope) obj);
                    }
                });
            }
        }).compose(mkd0.C());
    }

    @Nullable
    /* JADX INFO: renamed from: L3 */
    public IapAffiliatePromotionDisplaySlot m2112L3(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        Map map;
        if (iapAffiliatePromotion == null || (map = iapAffiliatePromotion.displayConfig) == null) {
            return null;
        }
        return (IapAffiliatePromotionDisplaySlot) map.get("promotionMainPage");
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m2113M3(@NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        return m2157z3(intlAffiliateDiscountEntryTab.displayConfigKey) != null;
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m2114N3() {
        return m2155y3() != null;
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m2115O3() {
        return !vwb.J(m2143s3());
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m2116P3() {
        return m2092A3() != null;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m2117S3() {
        this.f3180S = null;
        this.f3181T = false;
        this.f3182U = false;
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m2118T3() {
        return m2074V3(m2107I3());
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m2119W3() {
        return this.f3183V;
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m2120X3(long j) {
        long jLongValue = ((Long) this.f3191d0.get()).longValue();
        return jLongValue > 0 && j > 0 && jLongValue == j;
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean m2121Y3(long j) {
        return m2120X3(j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m2122Z3() {
        return false;
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m2123c4() {
        return m2074V3(m2155y3());
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m2124e4() {
        IapAffiliatePromotion iapAffiliatePromotionM2099E3;
        if (!this.f3183V || !m2114N3() || (iapAffiliatePromotionM2099E3 = m2099E3()) == null || m2121Y3(iapAffiliatePromotionM2099E3.promotionHitId)) {
            return false;
        }
        long j = iapAffiliatePromotionM2099E3.promotionHitId;
        boolean zBooleanValue = ((Boolean) this.f3187Z.get()).booleanValue();
        if (j > 0) {
            return (zBooleanValue || j == ((Long) this.f3188a0.get()).longValue()) ? false : true;
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m2125f4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m2081d4(iapAffiliatePromotion, mqi0.o() / 1000);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ c m2126g4() {
        return c.just(new ArrayList(this.f3179R));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m2127h4(List list) {
        if (vwb.J(list)) {
            this.f3179R = Collections.EMPTY_LIST;
        } else {
            this.f3179R = new ArrayList(list);
        }
        this.f3183V = true;
        m2144s4(this.f3179R);
        m2145t3();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m2128i4(AtomicReference atomicReference) {
        m2135o3((c) atomicReference.get());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m2129j4(AtomicReference atomicReference, Throwable th) {
        m2135o3((c) atomicReference.get());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2130k4(long j) {
        this.f3191d0.put(Long.valueOf(j));
        this.f3193f0.onNext(Long.valueOf(j));
        this.f3192e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m2131l4(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strTrim = str.trim();
            IapAffiliatePromotion iapAffiliatePromotionM2155y3 = m2155y3();
            if (iapAffiliatePromotionM2155y3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM2155y3.iapId)) {
                String strTrim2 = iapAffiliatePromotionM2155y3.iapId.trim();
                String str2 = iapAffiliatePromotionM2155y3.offerId;
                String strTrim3 = str2 != null ? str2.trim() : "";
                if (!m2074V3(iapAffiliatePromotionM2155y3) || TextUtils.isEmpty(strTrim3)) {
                    return m2072R3(strTrim2, strTrim, strTrim3);
                }
                String strM2090m3 = m2090m3(strTrim, iapAffiliatePromotionM2155y3.iapId, iapAffiliatePromotionM2155y3.offerId);
                if ((TextUtils.isEmpty(strM2090m3) || !TextUtils.equals(strTrim, strM2090m3)) && !TextUtils.equals(strTrim2, m2089l3(strTrim, strTrim3))) {
                    return m2071Q3(strTrim2, strTrim);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m2132m4(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strTrim = str.trim();
            IapAffiliatePromotion iapAffiliatePromotionM2092A3 = m2092A3();
            if (iapAffiliatePromotionM2092A3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM2092A3.iapId)) {
                String strTrim2 = iapAffiliatePromotionM2092A3.iapId.trim();
                String str2 = iapAffiliatePromotionM2092A3.offerId;
                String strTrim3 = str2 != null ? str2.trim() : "";
                if (!m2074V3(iapAffiliatePromotionM2092A3) || TextUtils.isEmpty(strTrim3)) {
                    return m2072R3(strTrim2, strTrim, strTrim3);
                }
                String strM2090m3 = m2090m3(strTrim, iapAffiliatePromotionM2092A3.iapId, iapAffiliatePromotionM2092A3.offerId);
                if ((TextUtils.isEmpty(strM2090m3) || !TextUtils.equals(strTrim, strM2090m3)) && !TextUtils.equals(strTrim2, m2089l3(strTrim, strTrim3))) {
                    return m2071Q3(strTrim2, strTrim);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n3 */
    public void m2133n3() {
        this.f3200m0 = 0L;
        this.f3201n0 = 0L;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m2134n4(@Nullable List<IapAffiliatePromotion> list) {
        long jLongValue = ((Long) this.f3191d0.get()).longValue();
        if (jLongValue == 0) {
            return;
        }
        if (m2122Z3() && m2076a4(jLongValue)) {
            return;
        }
        if (!vwb.J(list)) {
            for (IapAffiliatePromotion iapAffiliatePromotion : list) {
                if (iapAffiliatePromotion != null && iapAffiliatePromotion.promotionHitId == jLongValue) {
                    return;
                }
            }
        }
        this.f3191d0.put(0L);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m2135o3(@Nullable c<List<IapAffiliatePromotion>> cVar) {
        synchronized (this.f3184W) {
            try {
                if (this.f3185X == cVar) {
                    this.f3185X = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m2136o4(long j) {
        if (j <= 0) {
            IapAffiliatePromotion iapAffiliatePromotionM2153x3 = m2153x3();
            if (iapAffiliatePromotionM2153x3 != null) {
                m2141r3(iapAffiliatePromotionM2153x3.promotionHitId);
                return;
            } else {
                this.f3192e0.onNext(Boolean.TRUE);
                return;
            }
        }
        IapAffiliatePromotion iapAffiliatePromotionM2151w3 = m2151w3(j);
        if (iapAffiliatePromotionM2151w3 == null || !m2125f4(iapAffiliatePromotionM2151w3)) {
            m2141r3(j);
        } else {
            m2130k4(j);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final long m2137p3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        long jO = mqi0.o();
        long j = jO / 1000;
        long j2 = iapAffiliatePromotion.endTime;
        long j3 = j2 > 0 ? j2 * 1000 : 2305843009213693951L;
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
        if (iapAffiliatePromotionExtraConfig != null) {
            long j4 = iapAffiliatePromotionExtraConfig.countdown;
            if (j4 > 0) {
                ((Long) this.f3189b0.get()).getClass();
                ((Long) this.f3190c0.get()).getClass();
                m2147u3(iapAffiliatePromotion);
                long jLongValue = ((Long) this.f3189b0.get()).longValue();
                if (jLongValue < 0) {
                    long j5 = iapAffiliatePromotion.endTime;
                    jLongValue = Math.min(j4, j5 > 0 ? Math.max(0L, j5 - j) : 4611686018427387L);
                }
                long j6 = iapAffiliatePromotion.endTime;
                long jMin = Math.min(jLongValue, j6 > 0 ? Math.max(0L, j6 - j) : 9223372036854775L);
                long jMin2 = (1000 * jMin) + jO;
                if (iapAffiliatePromotion.endTime > 0) {
                    jMin2 = Math.min(jMin2, j3);
                }
                if (this.f3197j0 == iapAffiliatePromotion.promotionHitId && this.f3198k0 == jMin && this.f3199l0 > jO) {
                    long j7 = iapAffiliatePromotion.endTime;
                    long jMin3 = this.f3199l0;
                    if (j7 > 0) {
                        jMin3 = Math.min(jMin3, j3);
                    }
                    if (jMin3 > jO) {
                        return jMin3;
                    }
                }
                this.f3197j0 = iapAffiliatePromotion.promotionHitId;
                this.f3198k0 = jMin;
                this.f3199l0 = jMin2;
                return jMin2;
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: p4 */
    public c<Boolean> m2138p4() {
        return this.f3192e0.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public void m2139q3(long j) {
        IapAffiliatePromotion iapAffiliatePromotionM2151w3;
        if (j <= 0 || (iapAffiliatePromotionM2151w3 = m2151w3(j)) == null || m2125f4(iapAffiliatePromotionM2151w3)) {
            return;
        }
        m2141r3(j);
    }

    /* JADX INFO: renamed from: q4 */
    public c<Boolean> m2140q4() {
        return this.f3194g0.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: r3 */
    public final void m2141r3(long j) {
        this.f3191d0.put(Long.valueOf(j));
        this.f3189b0.put(-1L);
        this.f3190c0.put(0L);
        this.f3193f0.onNext(Long.valueOf(j));
        this.f3192e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r4 */
    public c<Long> m2142r4() {
        return this.f3193f0.asObservable();
    }

    /* JADX INFO: renamed from: s3 */
    public final List<IapAffiliatePromotion> m2143s3() {
        m2117S3();
        return this.f3179R;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m2144s4(List<IapAffiliatePromotion> list) {
        m2134n4(list);
        m2095B4(list);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m2145t3() {
        try {
            this.f3194g0.onNext(Boolean.TRUE);
        } catch (RuntimeException e) {
            CrashHelper.c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public final IapAffiliatePromotion m2146t4() {
        Map map;
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        long jO = mqi0.o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion.productType)) && m2078b4(iapAffiliatePromotion.promotionType) && m2081d4(iapAffiliatePromotion, jO) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m2147u3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        if (m2070K4(iapAffiliatePromotion)) {
            long jO = mqi0.o() / 1000;
            long j = iapAffiliatePromotion.extraConfig.countdown;
            long j2 = iapAffiliatePromotion.endTime;
            long jMax = j2 > 0 ? Math.max(0L, j2 - jO) : 4611686018427387L;
            long jMin = Math.min(j, jMax);
            long jLongValue = ((Long) this.f3190c0.get()).longValue();
            long jLongValue2 = ((Long) this.f3189b0.get()).longValue();
            if (jLongValue != iapAffiliatePromotion.promotionHitId || jLongValue2 < 0) {
                this.f3189b0.put(Long.valueOf(jMin));
                this.f3190c0.put(Long.valueOf(iapAffiliatePromotion.promotionHitId));
            } else {
                long jMin2 = Math.min(jLongValue2, jMax);
                if (jMin2 != jLongValue2) {
                    this.f3189b0.put(Long.valueOf(jMin2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public long m2148u4(long j) {
        if (j <= 0 || this.f3200m0 != j) {
            return 0L;
        }
        return this.f3201n0;
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public IapAffiliatePromotion m2149v3(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        Map map;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            List<IapAffiliatePromotion> listM2143s3 = m2143s3();
            if (vwb.J(listM2143s3)) {
                return null;
            }
            String strTrim = str.trim();
            for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
                if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion.productType)) && m2078b4(iapAffiliatePromotion.promotionType) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null && !TextUtils.isEmpty(iapAffiliatePromotion.iapId) && m2071Q3(iapAffiliatePromotion.iapId.trim(), strTrim)) {
                    return iapAffiliatePromotion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public c<List<IapAffiliatePromotion>> m2150v4() {
        synchronized (this.f3184W) {
            this.f3185X = null;
        }
        this.f3183V = false;
        return m2152w4();
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public IapAffiliatePromotion m2151w3(long j) {
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
            if (iapAffiliatePromotion != null && iapAffiliatePromotion.promotionHitId == j) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public c<List<IapAffiliatePromotion>> m2152w4() {
        if (!m2102F4()) {
            this.f3179R = Collections.EMPTY_LIST;
            this.f3183V = true;
            m2144s4(this.f3179R);
            m2145t3();
            return c.just(new ArrayList(this.f3179R)).compose(mkd0.C());
        }
        synchronized (this.f3184W) {
            try {
                if (this.f3183V) {
                    return c.defer(new v9j() { // from class: l.k49
                        public final Object call() {
                            return this.f15609a.m2126g4();
                        }
                    }).compose(mkd0.C());
                }
                c<List<IapAffiliatePromotion>> cVar = this.f3185X;
                if (cVar != null) {
                    return cVar;
                }
                vv5 vv5VarPublish = m2111K3().doOnNext(new e30() { // from class: l.l49
                    public final void call(Object obj) {
                        this.f16225a.m2127h4((List) obj);
                    }
                }).publish();
                final AtomicReference atomicReference = new AtomicReference();
                c<List<IapAffiliatePromotion>> cVarDoOnError = vv5VarPublish.a(1).doOnCompleted(new d30() { // from class: l.m49
                    public final void call() {
                        this.f16789a.m2128i4(atomicReference);
                    }
                }).doOnError(new e30() { // from class: l.n49
                    public final void call(Object obj) {
                        this.f17471a.m2129j4(atomicReference, (Throwable) obj);
                    }
                });
                atomicReference.set(cVarDoOnError);
                this.f3185X = cVarDoOnError;
                return cVarDoOnError;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final IapAffiliatePromotion m2153x3() {
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        long jO = mqi0.o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion.productType)) && m2078b4(iapAffiliatePromotion.promotionType)) {
                long j = iapAffiliatePromotion.endTime;
                if (j > 0 && jO >= j && !m2120X3(iapAffiliatePromotion.promotionHitId)) {
                    return iapAffiliatePromotion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public long m2154x4() {
        return ((Long) this.f3189b0.get()).longValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final IapAffiliatePromotion m2155y3() {
        Map map;
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        long jO = mqi0.o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM2143s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion.productType)) && m2078b4(iapAffiliatePromotion.promotionType) && m2081d4(iapAffiliatePromotion, jO) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m2156y4() {
        m2096C3();
        IapAffiliatePromotion iapAffiliatePromotionM2146t4 = m2146t4();
        if (iapAffiliatePromotionM2146t4 == null) {
            this.f3192e0.onNext(Boolean.TRUE);
            return;
        }
        if (m2120X3(iapAffiliatePromotionM2146t4.promotionHitId)) {
            this.f3192e0.onNext(Boolean.TRUE);
            return;
        }
        if (!m2070K4(iapAffiliatePromotionM2146t4)) {
            this.f3192e0.onNext(Boolean.TRUE);
            return;
        }
        long jLongValue = ((Long) this.f3189b0.get()).longValue();
        if (jLongValue < 0) {
            this.f3192e0.onNext(Boolean.TRUE);
            return;
        }
        long jO = mqi0.o() / 1000;
        long j = iapAffiliatePromotionM2146t4.endTime;
        if (j <= 0 || jO + jLongValue < j) {
            this.f3192e0.onNext(Boolean.TRUE);
        } else {
            m2141r3(iapAffiliatePromotionM2146t4.promotionHitId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final IapAffiliatePromotion m2157z3(@NonNull String str) {
        List<IapAffiliatePromotion> listM2143s3 = m2143s3();
        if (vwb.J(listM2143s3)) {
            return null;
        }
        long jO = mqi0.o() / 1000;
        boolean z = true;
        boolean z2 = "newSee".equals(str) || "newLike".equals(str) || "oldLike".equals(str) || "oldSee".equals(str) || "newVisitor".equals(str) || "oldVisitor".equals(str) || "swipeCardPage".equals(str);
        if (!"oldSee".equals(str) && !"oldLike".equals(str) && !"oldVisitor".equals(str)) {
            z = false;
        }
        IapAffiliatePromotion iapAffiliatePromotion = null;
        for (int i = 0; i < listM2143s3.size(); i++) {
            IapAffiliatePromotion iapAffiliatePromotion2 = listM2143s3.get(i);
            if (iapAffiliatePromotion2 != null && "svip".equalsIgnoreCase(m2069D4(iapAffiliatePromotion2.productType)) && m2078b4(iapAffiliatePromotion2.promotionType) && m2081d4(iapAffiliatePromotion2, jO) && !m2120X3(iapAffiliatePromotion2.promotionHitId)) {
                Map map = iapAffiliatePromotion2.displayConfig;
                if (m2073U3(map != null ? (IapAffiliatePromotionDisplaySlot) map.get(str) : null, z2)) {
                    if (z) {
                        if (iapAffiliatePromotion == null) {
                            iapAffiliatePromotion = iapAffiliatePromotion2;
                        }
                        if (m2070K4(iapAffiliatePromotion2)) {
                        }
                    }
                    return iapAffiliatePromotion2;
                }
                continue;
            }
        }
        return iapAffiliatePromotion;
    }
}
