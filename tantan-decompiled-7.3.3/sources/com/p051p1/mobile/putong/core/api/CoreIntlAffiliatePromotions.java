package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.AffiliateProducts;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionExtraConfig;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.VisitorsRecommendationType;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p137rx.subjects.ReplaySubject;
import p153l.ax5;
import p153l.byd0;
import p153l.dy6;
import p153l.fo0;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.r3n;
import p153l.sw0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class CoreIntlAffiliatePromotions extends dy6 {

    /* JADX INFO: renamed from: o0 */
    public static volatile boolean f19928o0;

    /* JADX INFO: renamed from: p0 */
    public static final jxd0 f19929p0;

    /* JADX INFO: renamed from: q0 */
    public static final jxd0 f19930q0;

    /* JADX INFO: renamed from: R */
    public volatile List<IapAffiliatePromotion> f19931R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public volatile List<IapAffiliatePromotion> f19932S;

    /* JADX INFO: renamed from: T */
    public volatile boolean f19933T;

    /* JADX INFO: renamed from: U */
    public volatile boolean f19934U;

    /* JADX INFO: renamed from: V */
    public volatile boolean f19935V;

    /* JADX INFO: renamed from: W */
    public final Object f19936W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public C22421c<List<IapAffiliatePromotion>> f19937X;

    /* JADX INFO: renamed from: Y */
    public final byd0 f19938Y;

    /* JADX INFO: renamed from: Z */
    public final jxd0 f19939Z;

    /* JADX INFO: renamed from: a0 */
    public final byd0 f19940a0;

    /* JADX INFO: renamed from: b0 */
    public final byd0 f19941b0;

    /* JADX INFO: renamed from: c0 */
    public final byd0 f19942c0;

    /* JADX INFO: renamed from: d0 */
    public final byd0 f19943d0;

    /* JADX INFO: renamed from: e0 */
    public final C22508b<Boolean> f19944e0;

    /* JADX INFO: renamed from: f0 */
    public final C22508b<Long> f19945f0;

    /* JADX INFO: renamed from: g0 */
    public final ReplaySubject<Boolean> f19946g0;

    /* JADX INFO: renamed from: h0 */
    public volatile long f19947h0;

    /* JADX INFO: renamed from: i0 */
    public volatile long f19948i0;

    /* JADX INFO: renamed from: j0 */
    public volatile long f19949j0;

    /* JADX INFO: renamed from: k0 */
    public volatile long f19950k0;

    /* JADX INFO: renamed from: l0 */
    public volatile long f19951l0;

    /* JADX INFO: renamed from: m0 */
    public volatile long f19952m0;

    /* JADX INFO: renamed from: n0 */
    public volatile long f19953n0;

    public enum IntlAffiliateDiscountEntryTab {
        ME_TAB("meTabSubscriptionCardAbove"),
        MESSAGE_TAB("messageTab"),
        WHISPER_TAB("whisperTab"),
        MEET_ILIKE_NEW_LIKE("newLike"),
        ME_TAB_ILIKE_OLD_LIKE("oldLike"),
        MEET_LIKERS_NEW_SEE("newSee"),
        SEE_STANDALONE_OLD_SEE("oldSee"),
        MEET_VISITORS_NEW_VISITOR(VisitorsRecommendationType.newVisitor),
        ME_TAB_VISITORS_OLD_VISITOR("oldVisitor"),
        HOME_SWIPE_CARD_PAGE("swipeCardPage");


        @NonNull
        public final String displayConfigKey;

        IntlAffiliateDiscountEntryTab(String str) {
            this.displayConfigKey = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions$a */
    public class C4868a implements sw0.InterfaceC20166c {
        @Override // p153l.sw0.InterfaceC20166c
        public void onBack() {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c == null) {
                return;
            }
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = c4883c.f20438x0;
            if (r3n.m179639g("app_back")) {
                return;
            }
            coreIntlAffiliatePromotions.m31166C3();
        }

        @Override // p153l.sw0.InterfaceC20166c
        public void onFront() {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c == null) {
                return;
            }
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = c4883c.f20438x0;
            r3n.m179641j("app_front");
            coreIntlAffiliatePromotions.m31226y4();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f19929p0 = new jxd0("debug_mock_discount_promotion", bool);
        f19930q0 = new jxd0("debug_mock_free_trial_promotion", bool);
    }

    public CoreIntlAffiliatePromotions(C4883c c4883c) {
        super(c4883c);
        this.f19931R = Collections.EMPTY_LIST;
        this.f19936W = new Object();
        this.f19938Y = new byd0("intl_promotion_me_tab_dot_clicked_hit_" + CoreModule.m30929H().userId(), 0L);
        this.f19939Z = new jxd0("intl_swipe_first_fullscreen_discount_auto_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f19940a0 = new byd0("intl_swipe_first_fullscreen_discount_last_auto_hit_" + CoreModule.m30929H().userId(), 0L);
        this.f19941b0 = new byd0("intl_affiliate_cd_remain_sec_" + CoreModule.m30929H().userId(), -1L);
        this.f19942c0 = new byd0("intl_affiliate_cd_bound_hit_" + CoreModule.m30929H().userId(), 0L);
        this.f19943d0 = new byd0("intl_affiliate_client_dismiss_hit_" + CoreModule.m30929H().userId(), 0L);
        this.f19944e0 = C22508b.m222767b();
        this.f19945f0 = C22508b.m222767b();
        this.f19946g0 = ReplaySubject.m222747d(1);
        this.f19947h0 = -1L;
        m31161z4();
    }

    /* JADX INFO: renamed from: D4 */
    public static String m31139D4(@Nullable String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: K4 */
    public static boolean m31140K4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
        return iapAffiliatePromotionExtraConfig != null && iapAffiliatePromotionExtraConfig.countdown > 0;
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m31141Q3(@NonNull String str, @NonNull String str2) {
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
    public static boolean m31142R3(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        String strTrim = str2.trim();
        if (!TextUtils.isEmpty(str3)) {
            strTrim = m31159l3(strTrim, str3).trim();
        }
        return m31141Q3(str.trim(), strTrim);
    }

    /* JADX INFO: renamed from: U3 */
    public static boolean m31143U3(@Nullable IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, boolean z) {
        if (iapAffiliatePromotionDisplaySlot == null) {
            return false;
        }
        if (TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.mainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.subtitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.buttonText) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.imgUrl) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.theme) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public static boolean m31144V3(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null || TextUtils.isEmpty(iapAffiliatePromotion.promotionType)) {
            return false;
        }
        return "freeTrial".equalsIgnoreCase(iapAffiliatePromotion.promotionType.trim());
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m31145a3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static boolean m31146a4(long j) {
        return j == 99999 || j == 88888;
    }

    /* JADX INFO: renamed from: b4 */
    public static boolean m31148b4(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "discount".equalsIgnoreCase(str) || "freeTrial".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: d4 */
    public static boolean m31151d4(IapAffiliatePromotion iapAffiliatePromotion, long j) {
        long j2 = iapAffiliatePromotion.startTime;
        if (j2 > 0 && j < j2) {
            return false;
        }
        long j3 = iapAffiliatePromotion.endTime;
        return j3 <= 0 || j <= j3;
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ List m31152e3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return (coreData == null || jyb.m147479J(coreData.iapAffiliatePromotions)) ? Collections.EMPTY_LIST : coreData.iapAffiliatePromotions;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m31156i3(List list) {
    }

    @NonNull
    /* JADX INFO: renamed from: l3 */
    public static String m31159l3(@Nullable String str, @Nullable String str2) {
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
    public static String m31160m3(@Nullable String str, @Nullable String str2, @Nullable String str3) {
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
    public static void m31161z4() {
        if (f19928o0) {
            return;
        }
        synchronized (CoreIntlAffiliatePromotions.class) {
            try {
                if (f19928o0) {
                    return;
                }
                sw0.m188232c().m188233b(new C4868a());
                f19928o0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final IapAffiliatePromotion m31162A3() {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion.productType)) && m31148b4(iapAffiliatePromotion.promotionType) && m31151d4(iapAffiliatePromotion, jM174454o) && !m31190X3(iapAffiliatePromotion.promotionHitId) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public void m31163A4(long j, long j2) {
        if (j <= 0) {
            return;
        }
        long jMax = Math.max(0L, j2);
        this.f19948i0 = j;
        this.f19947h0 = jMax;
    }

    /* JADX INFO: renamed from: B3 */
    public void m31164B3() {
        m31166C3();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m31165B4(@Nullable List<IapAffiliatePromotion> list) {
        IapAffiliatePromotion next;
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (m31192Z3()) {
            return;
        }
        if (!jyb.m147479J(list)) {
            long jM174454o = pzi0.m174454o() / 1000;
            Iterator<IapAffiliatePromotion> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && "svip".equalsIgnoreCase(m31139D4(next.productType)) && m31148b4(next.promotionType) && m31151d4(next, jM174454o) && (map = next.displayConfig) != null && map.get("promotionMainPage") != null) {
                    break;
                }
            }
        } else {
            next = null;
            break;
        }
        if (next == null) {
            this.f19941b0.put(-1L);
            this.f19942c0.put(0L);
            return;
        }
        long jLongValue = this.f19942c0.get().longValue();
        if (jLongValue == 0 || next.promotionHitId == jLongValue) {
            return;
        }
        this.f19941b0.put(-1L);
        this.f19942c0.put(0L);
    }

    /* JADX INFO: renamed from: C3 */
    public final void m31166C3() {
        if (this.f19948i0 <= 0 || this.f19947h0 < 0) {
            return;
        }
        if (this.f19941b0.get().longValue() == this.f19947h0 && this.f19942c0.get().longValue() == this.f19948i0) {
            return;
        }
        this.f19941b0.put(Long.valueOf(this.f19947h0));
        this.f19942c0.put(Long.valueOf(this.f19948i0));
    }

    /* JADX INFO: renamed from: C4 */
    public long m31167C4() {
        IapAffiliatePromotion iapAffiliatePromotionM31225y3 = m31225y3();
        if (iapAffiliatePromotionM31225y3 != null) {
            return iapAffiliatePromotionM31225y3.promotionHitId;
        }
        for (IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab : IntlAffiliateDiscountEntryTab.values()) {
            IapAffiliatePromotion iapAffiliatePromotionM31227z3 = m31227z3(intlAffiliateDiscountEntryTab.displayConfigKey);
            if (iapAffiliatePromotionM31227z3 != null) {
                return iapAffiliatePromotionM31227z3.promotionHitId;
            }
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public IapAffiliatePromotion m31168D3(@NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        return m31227z3(intlAffiliateDiscountEntryTab.displayConfigKey);
    }

    @Nullable
    /* JADX INFO: renamed from: E3 */
    public IapAffiliatePromotion m31169E3() {
        return m31225y3();
    }

    /* JADX INFO: renamed from: E4 */
    public void m31170E4(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f19952m0 = j;
        this.f19953n0 = j2;
    }

    /* JADX INFO: renamed from: F3 */
    public long m31171F3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m31207p3(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: F4 */
    public final boolean m31172F4() {
        String strM30350j0 = ABManager.m30350j0("intl_ft_revamp");
        return "test1".equals(strM30350j0) || "test2".equals(strM30350j0);
    }

    @Nullable
    /* JADX INFO: renamed from: G3 */
    public IapAffiliatePromotionDisplaySlot m31173G3(@Nullable IapAffiliatePromotion iapAffiliatePromotion, @NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (iapAffiliatePromotion == null || (map = iapAffiliatePromotion.displayConfig) == null) {
            return null;
        }
        return map.get(intlAffiliateDiscountEntryTab.displayConfigKey);
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m31174G4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m31140K4(iapAffiliatePromotion);
    }

    @Nullable
    /* JADX INFO: renamed from: H3 */
    public IapAffiliatePromotionDisplaySlot m31175H3(String str) {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        IapAffiliatePromotion iapAffiliatePromotionM31177I3 = m31177I3();
        if (iapAffiliatePromotionM31177I3 == null || (map = iapAffiliatePromotionM31177I3.displayConfig) == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: H4 */
    public boolean m31176H4() {
        IapAffiliatePromotion iapAffiliatePromotionM31177I3;
        return (!joa.m146386f4() || (iapAffiliatePromotionM31177I3 = m31177I3()) == null || this.f19938Y.get().longValue() == iapAffiliatePromotionM31177I3.promotionHitId) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: I3 */
    public IapAffiliatePromotion m31177I3() {
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion.productType)) && m31148b4(iapAffiliatePromotion.promotionType) && m31151d4(iapAffiliatePromotion, jM174454o) && !m31190X3(iapAffiliatePromotion.promotionHitId)) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I4 */
    public void m31178I4() {
        m31222w4().subscribe(new y20() { // from class: l.y59
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreIntlAffiliatePromotions.m31156i3((List) obj);
            }
        }, new y20() { // from class: l.z59
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreIntlAffiliatePromotions.m31145a3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public long m31179J3() {
        IapAffiliatePromotion iapAffiliatePromotionM31225y3 = m31225y3();
        if (iapAffiliatePromotionM31225y3 != null) {
            return iapAffiliatePromotionM31225y3.endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: J4 */
    public void m31180J4(long j, long j2, long j3) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f19949j0 = j;
        this.f19951l0 = j2;
        this.f19950k0 = Math.max(0L, j3);
    }

    /* JADX INFO: renamed from: K3 */
    public C22421c<List<IapAffiliatePromotion>> m31181K3() {
        return !m31172F4() ? C22421c.just(Collections.EMPTY_LIST).compose(psd0.m173592C()) : this.f91137Q.scheduled("iap_affiliate_promotions_googleplay", 0, new pcj() { // from class: l.x59
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.a69
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32291d0()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.b69
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreIntlAffiliatePromotions.m31152e3((Envelope) obj);
                    }
                });
            }
        }).compose(psd0.m173592C());
    }

    @Nullable
    /* JADX INFO: renamed from: L3 */
    public IapAffiliatePromotionDisplaySlot m31182L3(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (iapAffiliatePromotion == null || (map = iapAffiliatePromotion.displayConfig) == null) {
            return null;
        }
        return map.get("promotionMainPage");
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m31183M3(@NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        return m31227z3(intlAffiliateDiscountEntryTab.displayConfigKey) != null;
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m31184N3() {
        return m31225y3() != null;
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m31185O3() {
        return !jyb.m147479J(m31213s3());
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m31186P3() {
        return m31162A3() != null;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m31187S3() {
        this.f19932S = null;
        this.f19933T = false;
        this.f19934U = false;
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m31188T3() {
        return m31144V3(m31177I3());
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m31189W3() {
        return this.f19935V;
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m31190X3(long j) {
        long jLongValue = this.f19943d0.get().longValue();
        return jLongValue > 0 && j > 0 && jLongValue == j;
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean m31191Y3(long j) {
        return m31190X3(j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m31192Z3() {
        return false;
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m31193c4() {
        return m31144V3(m31225y3());
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m31194e4() {
        IapAffiliatePromotion iapAffiliatePromotionM31169E3;
        if (!this.f19935V || !m31184N3() || (iapAffiliatePromotionM31169E3 = m31169E3()) == null || m31191Y3(iapAffiliatePromotionM31169E3.promotionHitId)) {
            return false;
        }
        long j = iapAffiliatePromotionM31169E3.promotionHitId;
        boolean zBooleanValue = this.f19939Z.get().booleanValue();
        if (j > 0) {
            return (zBooleanValue || j == this.f19940a0.get().longValue()) ? false : true;
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m31195f4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m31151d4(iapAffiliatePromotion, pzi0.m174454o() / 1000);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ C22421c m31196g4() {
        return C22421c.just(new ArrayList(this.f19931R));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m31197h4(List list) {
        if (jyb.m147479J(list)) {
            this.f19931R = Collections.EMPTY_LIST;
        } else {
            this.f19931R = new ArrayList(list);
        }
        this.f19935V = true;
        m31214s4(this.f19931R);
        m31215t3();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m31198i4(AtomicReference atomicReference) {
        m31205o3((C22421c) atomicReference.get());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m31199j4(AtomicReference atomicReference, Throwable th) {
        m31205o3((C22421c) atomicReference.get());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31200k4(long j) {
        this.f19943d0.put(Long.valueOf(j));
        this.f19945f0.onNext(Long.valueOf(j));
        this.f19944e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m31201l4(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strTrim = str.trim();
            IapAffiliatePromotion iapAffiliatePromotionM31225y3 = m31225y3();
            if (iapAffiliatePromotionM31225y3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM31225y3.iapId)) {
                String strTrim2 = iapAffiliatePromotionM31225y3.iapId.trim();
                String str2 = iapAffiliatePromotionM31225y3.offerId;
                String strTrim3 = str2 != null ? str2.trim() : "";
                if (!m31144V3(iapAffiliatePromotionM31225y3) || TextUtils.isEmpty(strTrim3)) {
                    return m31142R3(strTrim2, strTrim, strTrim3);
                }
                String strM31160m3 = m31160m3(strTrim, iapAffiliatePromotionM31225y3.iapId, iapAffiliatePromotionM31225y3.offerId);
                if ((TextUtils.isEmpty(strM31160m3) || !TextUtils.equals(strTrim, strM31160m3)) && !TextUtils.equals(strTrim2, m31159l3(strTrim, strTrim3))) {
                    return m31141Q3(strTrim2, strTrim);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m31202m4(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strTrim = str.trim();
            IapAffiliatePromotion iapAffiliatePromotionM31162A3 = m31162A3();
            if (iapAffiliatePromotionM31162A3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM31162A3.iapId)) {
                String strTrim2 = iapAffiliatePromotionM31162A3.iapId.trim();
                String str2 = iapAffiliatePromotionM31162A3.offerId;
                String strTrim3 = str2 != null ? str2.trim() : "";
                if (!m31144V3(iapAffiliatePromotionM31162A3) || TextUtils.isEmpty(strTrim3)) {
                    return m31142R3(strTrim2, strTrim, strTrim3);
                }
                String strM31160m3 = m31160m3(strTrim, iapAffiliatePromotionM31162A3.iapId, iapAffiliatePromotionM31162A3.offerId);
                if ((TextUtils.isEmpty(strM31160m3) || !TextUtils.equals(strTrim, strM31160m3)) && !TextUtils.equals(strTrim2, m31159l3(strTrim, strTrim3))) {
                    return m31141Q3(strTrim2, strTrim);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n3 */
    public void m31203n3() {
        this.f19952m0 = 0L;
        this.f19953n0 = 0L;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m31204n4(@Nullable List<IapAffiliatePromotion> list) {
        long jLongValue = this.f19943d0.get().longValue();
        if (jLongValue == 0) {
            return;
        }
        if (m31192Z3() && m31146a4(jLongValue)) {
            return;
        }
        if (!jyb.m147479J(list)) {
            for (IapAffiliatePromotion iapAffiliatePromotion : list) {
                if (iapAffiliatePromotion != null && iapAffiliatePromotion.promotionHitId == jLongValue) {
                    return;
                }
            }
        }
        this.f19943d0.put(0L);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m31205o3(@Nullable C22421c<List<IapAffiliatePromotion>> c22421c) {
        synchronized (this.f19936W) {
            try {
                if (this.f19937X == c22421c) {
                    this.f19937X = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m31206o4(long j) {
        if (j <= 0) {
            IapAffiliatePromotion iapAffiliatePromotionM31223x3 = m31223x3();
            if (iapAffiliatePromotionM31223x3 != null) {
                m31211r3(iapAffiliatePromotionM31223x3.promotionHitId);
                return;
            } else {
                this.f19944e0.onNext(Boolean.TRUE);
                return;
            }
        }
        IapAffiliatePromotion iapAffiliatePromotionM31221w3 = m31221w3(j);
        if (iapAffiliatePromotionM31221w3 == null || !m31195f4(iapAffiliatePromotionM31221w3)) {
            m31211r3(j);
        } else {
            m31200k4(j);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final long m31207p3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        long jM174454o = pzi0.m174454o();
        long j = jM174454o / 1000;
        long j2 = iapAffiliatePromotion.endTime;
        long j3 = j2 > 0 ? j2 * 1000 : 2305843009213693951L;
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
        if (iapAffiliatePromotionExtraConfig != null) {
            long j4 = iapAffiliatePromotionExtraConfig.countdown;
            if (j4 > 0) {
                this.f19941b0.get().getClass();
                this.f19942c0.get().getClass();
                m31217u3(iapAffiliatePromotion);
                long jLongValue = this.f19941b0.get().longValue();
                if (jLongValue < 0) {
                    long j5 = iapAffiliatePromotion.endTime;
                    jLongValue = Math.min(j4, j5 > 0 ? Math.max(0L, j5 - j) : 4611686018427387L);
                }
                long j6 = iapAffiliatePromotion.endTime;
                long jMin = Math.min(jLongValue, j6 > 0 ? Math.max(0L, j6 - j) : 9223372036854775L);
                long jMin2 = (1000 * jMin) + jM174454o;
                if (iapAffiliatePromotion.endTime > 0) {
                    jMin2 = Math.min(jMin2, j3);
                }
                if (this.f19949j0 == iapAffiliatePromotion.promotionHitId && this.f19950k0 == jMin && this.f19951l0 > jM174454o) {
                    long j7 = iapAffiliatePromotion.endTime;
                    long jMin3 = this.f19951l0;
                    if (j7 > 0) {
                        jMin3 = Math.min(jMin3, j3);
                    }
                    if (jMin3 > jM174454o) {
                        return jMin3;
                    }
                }
                this.f19949j0 = iapAffiliatePromotion.promotionHitId;
                this.f19950k0 = jMin;
                this.f19951l0 = jMin2;
                return jMin2;
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: p4 */
    public C22421c<Boolean> m31208p4() {
        return this.f19944e0.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public void m31209q3(long j) {
        IapAffiliatePromotion iapAffiliatePromotionM31221w3;
        if (j <= 0 || (iapAffiliatePromotionM31221w3 = m31221w3(j)) == null || m31195f4(iapAffiliatePromotionM31221w3)) {
            return;
        }
        m31211r3(j);
    }

    /* JADX INFO: renamed from: q4 */
    public C22421c<Boolean> m31210q4() {
        return this.f19946g0.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: r3 */
    public final void m31211r3(long j) {
        this.f19943d0.put(Long.valueOf(j));
        this.f19941b0.put(-1L);
        this.f19942c0.put(0L);
        this.f19945f0.onNext(Long.valueOf(j));
        this.f19944e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r4 */
    public C22421c<Long> m31212r4() {
        return this.f19945f0.asObservable();
    }

    /* JADX INFO: renamed from: s3 */
    public final List<IapAffiliatePromotion> m31213s3() {
        m31187S3();
        return this.f19931R;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m31214s4(List<IapAffiliatePromotion> list) {
        m31204n4(list);
        m31165B4(list);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m31215t3() {
        try {
            this.f19946g0.onNext(Boolean.TRUE);
        } catch (RuntimeException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public final IapAffiliatePromotion m31216t4() {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion.productType)) && m31148b4(iapAffiliatePromotion.promotionType) && m31151d4(iapAffiliatePromotion, jM174454o) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m31217u3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        if (m31140K4(iapAffiliatePromotion)) {
            long jM174454o = pzi0.m174454o() / 1000;
            long j = iapAffiliatePromotion.extraConfig.countdown;
            long j2 = iapAffiliatePromotion.endTime;
            long jMax = j2 > 0 ? Math.max(0L, j2 - jM174454o) : 4611686018427387L;
            long jMin = Math.min(j, jMax);
            long jLongValue = this.f19942c0.get().longValue();
            long jLongValue2 = this.f19941b0.get().longValue();
            if (jLongValue != iapAffiliatePromotion.promotionHitId || jLongValue2 < 0) {
                this.f19941b0.put(Long.valueOf(jMin));
                this.f19942c0.put(Long.valueOf(iapAffiliatePromotion.promotionHitId));
            } else {
                long jMin2 = Math.min(jLongValue2, jMax);
                if (jMin2 != jLongValue2) {
                    this.f19941b0.put(Long.valueOf(jMin2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public long m31218u4(long j) {
        if (j <= 0 || this.f19952m0 != j) {
            return 0L;
        }
        return this.f19953n0;
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public IapAffiliatePromotion m31219v3(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            List<IapAffiliatePromotion> listM31213s3 = m31213s3();
            if (jyb.m147479J(listM31213s3)) {
                return null;
            }
            String strTrim = str.trim();
            for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
                if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion.productType)) && m31148b4(iapAffiliatePromotion.promotionType) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null && !TextUtils.isEmpty(iapAffiliatePromotion.iapId) && m31141Q3(iapAffiliatePromotion.iapId.trim(), strTrim)) {
                    return iapAffiliatePromotion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public C22421c<List<IapAffiliatePromotion>> m31220v4() {
        synchronized (this.f19936W) {
            this.f19937X = null;
        }
        this.f19935V = false;
        return m31222w4();
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public IapAffiliatePromotion m31221w3(long j) {
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
            if (iapAffiliatePromotion != null && iapAffiliatePromotion.promotionHitId == j) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public C22421c<List<IapAffiliatePromotion>> m31222w4() {
        if (!m31172F4()) {
            this.f19931R = Collections.EMPTY_LIST;
            this.f19935V = true;
            m31214s4(this.f19931R);
            m31215t3();
            return C22421c.just(new ArrayList(this.f19931R)).compose(psd0.m173592C());
        }
        synchronized (this.f19936W) {
            try {
                if (this.f19935V) {
                    return C22421c.defer(new pcj() { // from class: l.t59
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return this.f172189a.m31196g4();
                        }
                    }).compose(psd0.m173592C());
                }
                C22421c<List<IapAffiliatePromotion>> c22421c = this.f19937X;
                if (c22421c != null) {
                    return c22421c;
                }
                ax5<List<IapAffiliatePromotion>> ax5VarPublish = m31181K3().doOnNext(new y20() { // from class: l.u59
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f177588a.m31197h4((List) obj);
                    }
                }).publish();
                final AtomicReference atomicReference = new AtomicReference();
                C22421c<List<IapAffiliatePromotion>> c22421cDoOnError = ax5VarPublish.m100757a(1).doOnCompleted(new x20() { // from class: l.v59
                    @Override // p153l.x20
                    public final void call() {
                        this.f182488a.m31198i4(atomicReference);
                    }
                }).doOnError(new y20() { // from class: l.w59
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f187487a.m31199j4(atomicReference, (Throwable) obj);
                    }
                });
                atomicReference.set(c22421cDoOnError);
                this.f19937X = c22421cDoOnError;
                return c22421cDoOnError;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final IapAffiliatePromotion m31223x3() {
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion.productType)) && m31148b4(iapAffiliatePromotion.promotionType)) {
                long j = iapAffiliatePromotion.endTime;
                if (j > 0 && jM174454o >= j && !m31190X3(iapAffiliatePromotion.promotionHitId)) {
                    return iapAffiliatePromotion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public long m31224x4() {
        return this.f19941b0.get().longValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final IapAffiliatePromotion m31225y3() {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM31213s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion.productType)) && m31148b4(iapAffiliatePromotion.promotionType) && m31151d4(iapAffiliatePromotion, jM174454o) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m31226y4() {
        m31166C3();
        IapAffiliatePromotion iapAffiliatePromotionM31216t4 = m31216t4();
        if (iapAffiliatePromotionM31216t4 == null) {
            this.f19944e0.onNext(Boolean.TRUE);
            return;
        }
        if (m31190X3(iapAffiliatePromotionM31216t4.promotionHitId)) {
            this.f19944e0.onNext(Boolean.TRUE);
            return;
        }
        if (!m31140K4(iapAffiliatePromotionM31216t4)) {
            this.f19944e0.onNext(Boolean.TRUE);
            return;
        }
        long jLongValue = this.f19941b0.get().longValue();
        if (jLongValue < 0) {
            this.f19944e0.onNext(Boolean.TRUE);
            return;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        long j = iapAffiliatePromotionM31216t4.endTime;
        if (j <= 0 || jM174454o + jLongValue < j) {
            this.f19944e0.onNext(Boolean.TRUE);
        } else {
            m31211r3(iapAffiliatePromotionM31216t4.promotionHitId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final IapAffiliatePromotion m31227z3(@NonNull String str) {
        List<IapAffiliatePromotion> listM31213s3 = m31213s3();
        if (jyb.m147479J(listM31213s3)) {
            return null;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        boolean z = true;
        boolean z2 = "newSee".equals(str) || "newLike".equals(str) || "oldLike".equals(str) || "oldSee".equals(str) || VisitorsRecommendationType.newVisitor.equals(str) || "oldVisitor".equals(str) || "swipeCardPage".equals(str);
        if (!"oldSee".equals(str) && !"oldLike".equals(str) && !"oldVisitor".equals(str)) {
            z = false;
        }
        IapAffiliatePromotion iapAffiliatePromotion = null;
        for (int i = 0; i < listM31213s3.size(); i++) {
            IapAffiliatePromotion iapAffiliatePromotion2 = listM31213s3.get(i);
            if (iapAffiliatePromotion2 != null && "svip".equalsIgnoreCase(m31139D4(iapAffiliatePromotion2.productType)) && m31148b4(iapAffiliatePromotion2.promotionType) && m31151d4(iapAffiliatePromotion2, jM174454o) && !m31190X3(iapAffiliatePromotion2.promotionHitId)) {
                Map<String, IapAffiliatePromotionDisplaySlot> map = iapAffiliatePromotion2.displayConfig;
                if (m31143U3(map != null ? map.get(str) : null, z2)) {
                    if (z) {
                        if (iapAffiliatePromotion == null) {
                            iapAffiliatePromotion = iapAffiliatePromotion2;
                        }
                        if (m31140K4(iapAffiliatePromotion2)) {
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
