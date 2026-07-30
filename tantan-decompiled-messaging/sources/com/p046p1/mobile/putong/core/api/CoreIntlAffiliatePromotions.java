package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.AffiliateProducts;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionExtraConfig;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.VisitorsRecommendationType;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p133rx.subjects.ReplaySubject;
import p149l.ax6;
import p149l.d30;
import p149l.e30;
import p149l.hpd0;
import p149l.jo0;
import p149l.lw0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.r1n;
import p149l.v9j;
import p149l.vv5;
import p149l.vwb;
import p149l.xma;
import p149l.zpd0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreIntlAffiliatePromotions extends ax6 {

    /* JADX INFO: renamed from: o0 */
    public static volatile boolean f19187o0;

    /* JADX INFO: renamed from: p0 */
    public static final hpd0 f19188p0;

    /* JADX INFO: renamed from: q0 */
    public static final hpd0 f19189q0;

    /* JADX INFO: renamed from: R */
    public volatile List<IapAffiliatePromotion> f19190R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public volatile List<IapAffiliatePromotion> f19191S;

    /* JADX INFO: renamed from: T */
    public volatile boolean f19192T;

    /* JADX INFO: renamed from: U */
    public volatile boolean f19193U;

    /* JADX INFO: renamed from: V */
    public volatile boolean f19194V;

    /* JADX INFO: renamed from: W */
    public final Object f19195W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public C22306c<List<IapAffiliatePromotion>> f19196X;

    /* JADX INFO: renamed from: Y */
    public final zpd0 f19197Y;

    /* JADX INFO: renamed from: Z */
    public final hpd0 f19198Z;

    /* JADX INFO: renamed from: a0 */
    public final zpd0 f19199a0;

    /* JADX INFO: renamed from: b0 */
    public final zpd0 f19200b0;

    /* JADX INFO: renamed from: c0 */
    public final zpd0 f19201c0;

    /* JADX INFO: renamed from: d0 */
    public final zpd0 f19202d0;

    /* JADX INFO: renamed from: e0 */
    public final C22393b<Boolean> f19203e0;

    /* JADX INFO: renamed from: f0 */
    public final C22393b<Long> f19204f0;

    /* JADX INFO: renamed from: g0 */
    public final ReplaySubject<Boolean> f19205g0;

    /* JADX INFO: renamed from: h0 */
    public volatile long f19206h0;

    /* JADX INFO: renamed from: i0 */
    public volatile long f19207i0;

    /* JADX INFO: renamed from: j0 */
    public volatile long f19208j0;

    /* JADX INFO: renamed from: k0 */
    public volatile long f19209k0;

    /* JADX INFO: renamed from: l0 */
    public volatile long f19210l0;

    /* JADX INFO: renamed from: m0 */
    public volatile long f19211m0;

    /* JADX INFO: renamed from: n0 */
    public volatile long f19212n0;

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
    public class C4717a implements lw0.InterfaceC18329c {
        @Override // p149l.lw0.InterfaceC18329c
        public void onBack() {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c == null) {
                return;
            }
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = c4732c.f19696x0;
            if (r1n.m177491g("app_back")) {
                return;
            }
            coreIntlAffiliatePromotions.m30168C3();
        }

        @Override // p149l.lw0.InterfaceC18329c
        public void onFront() {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c == null) {
                return;
            }
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = c4732c.f19696x0;
            r1n.m177493j("app_front");
            coreIntlAffiliatePromotions.m30228y4();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f19188p0 = new hpd0("debug_mock_discount_promotion", bool);
        f19189q0 = new hpd0("debug_mock_free_trial_promotion", bool);
    }

    public CoreIntlAffiliatePromotions(C4732c c4732c) {
        super(c4732c);
        this.f19190R = Collections.EMPTY_LIST;
        this.f19195W = new Object();
        this.f19197Y = new zpd0("intl_promotion_me_tab_dot_clicked_hit_" + CoreModule.m29931H().userId(), 0L);
        this.f19198Z = new hpd0("intl_swipe_first_fullscreen_discount_auto_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f19199a0 = new zpd0("intl_swipe_first_fullscreen_discount_last_auto_hit_" + CoreModule.m29931H().userId(), 0L);
        this.f19200b0 = new zpd0("intl_affiliate_cd_remain_sec_" + CoreModule.m29931H().userId(), -1L);
        this.f19201c0 = new zpd0("intl_affiliate_cd_bound_hit_" + CoreModule.m29931H().userId(), 0L);
        this.f19202d0 = new zpd0("intl_affiliate_client_dismiss_hit_" + CoreModule.m29931H().userId(), 0L);
        this.f19203e0 = C22393b.m221521b();
        this.f19204f0 = C22393b.m221521b();
        this.f19205g0 = ReplaySubject.m221501d(1);
        this.f19206h0 = -1L;
        m30163z4();
    }

    /* JADX INFO: renamed from: D4 */
    public static String m30141D4(@Nullable String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: K4 */
    public static boolean m30142K4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
        return iapAffiliatePromotionExtraConfig != null && iapAffiliatePromotionExtraConfig.countdown > 0;
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m30143Q3(@NonNull String str, @NonNull String str2) {
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
    public static boolean m30144R3(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        String strTrim = str2.trim();
        if (!TextUtils.isEmpty(str3)) {
            strTrim = m30161l3(strTrim, str3).trim();
        }
        return m30143Q3(str.trim(), strTrim);
    }

    /* JADX INFO: renamed from: U3 */
    public static boolean m30145U3(@Nullable IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, boolean z) {
        if (iapAffiliatePromotionDisplaySlot == null) {
            return false;
        }
        if (TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.mainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.subtitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.buttonText) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.imgUrl) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.theme) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle) && TextUtils.isEmpty(iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public static boolean m30146V3(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null || TextUtils.isEmpty(iapAffiliatePromotion.promotionType)) {
            return false;
        }
        return "freeTrial".equalsIgnoreCase(iapAffiliatePromotion.promotionType.trim());
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m30147a3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static boolean m30148a4(long j) {
        return j == 99999 || j == 88888;
    }

    /* JADX INFO: renamed from: b4 */
    public static boolean m30150b4(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "discount".equalsIgnoreCase(str) || "freeTrial".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: d4 */
    public static boolean m30153d4(IapAffiliatePromotion iapAffiliatePromotion, long j) {
        long j2 = iapAffiliatePromotion.startTime;
        if (j2 > 0 && j < j2) {
            return false;
        }
        long j3 = iapAffiliatePromotion.endTime;
        return j3 <= 0 || j <= j3;
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ List m30154e3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return (coreData == null || vwb.m200296J(coreData.iapAffiliatePromotions)) ? Collections.EMPTY_LIST : coreData.iapAffiliatePromotions;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m30158i3(List list) {
    }

    @NonNull
    /* JADX INFO: renamed from: l3 */
    public static String m30161l3(@Nullable String str, @Nullable String str2) {
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
    public static String m30162m3(@Nullable String str, @Nullable String str2, @Nullable String str3) {
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
    public static void m30163z4() {
        if (f19187o0) {
            return;
        }
        synchronized (CoreIntlAffiliatePromotions.class) {
            try {
                if (f19187o0) {
                    return;
                }
                lw0.m151927c().m151928b(new C4717a());
                f19187o0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final IapAffiliatePromotion m30164A3() {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion.productType)) && m30150b4(iapAffiliatePromotion.promotionType) && m30153d4(iapAffiliatePromotion, jM155944o) && !m30192X3(iapAffiliatePromotion.promotionHitId) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public void m30165A4(long j, long j2) {
        if (j <= 0) {
            return;
        }
        long jMax = Math.max(0L, j2);
        this.f19207i0 = j;
        this.f19206h0 = jMax;
    }

    /* JADX INFO: renamed from: B3 */
    public void m30166B3() {
        m30168C3();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m30167B4(@Nullable List<IapAffiliatePromotion> list) {
        IapAffiliatePromotion next;
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (m30194Z3()) {
            return;
        }
        if (!vwb.m200296J(list)) {
            long jM155944o = mqi0.m155944o() / 1000;
            Iterator<IapAffiliatePromotion> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && "svip".equalsIgnoreCase(m30141D4(next.productType)) && m30150b4(next.promotionType) && m30153d4(next, jM155944o) && (map = next.displayConfig) != null && map.get("promotionMainPage") != null) {
                    break;
                }
            }
        } else {
            next = null;
            break;
        }
        if (next == null) {
            this.f19200b0.put(-1L);
            this.f19201c0.put(0L);
            return;
        }
        long jLongValue = this.f19201c0.get().longValue();
        if (jLongValue == 0 || next.promotionHitId == jLongValue) {
            return;
        }
        this.f19200b0.put(-1L);
        this.f19201c0.put(0L);
    }

    /* JADX INFO: renamed from: C3 */
    public final void m30168C3() {
        if (this.f19207i0 <= 0 || this.f19206h0 < 0) {
            return;
        }
        if (this.f19200b0.get().longValue() == this.f19206h0 && this.f19201c0.get().longValue() == this.f19207i0) {
            return;
        }
        this.f19200b0.put(Long.valueOf(this.f19206h0));
        this.f19201c0.put(Long.valueOf(this.f19207i0));
    }

    /* JADX INFO: renamed from: C4 */
    public long m30169C4() {
        IapAffiliatePromotion iapAffiliatePromotionM30227y3 = m30227y3();
        if (iapAffiliatePromotionM30227y3 != null) {
            return iapAffiliatePromotionM30227y3.promotionHitId;
        }
        for (IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab : IntlAffiliateDiscountEntryTab.values()) {
            IapAffiliatePromotion iapAffiliatePromotionM30229z3 = m30229z3(intlAffiliateDiscountEntryTab.displayConfigKey);
            if (iapAffiliatePromotionM30229z3 != null) {
                return iapAffiliatePromotionM30229z3.promotionHitId;
            }
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public IapAffiliatePromotion m30170D3(@NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        return m30229z3(intlAffiliateDiscountEntryTab.displayConfigKey);
    }

    @Nullable
    /* JADX INFO: renamed from: E3 */
    public IapAffiliatePromotion m30171E3() {
        return m30227y3();
    }

    /* JADX INFO: renamed from: E4 */
    public void m30172E4(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f19211m0 = j;
        this.f19212n0 = j2;
    }

    /* JADX INFO: renamed from: F3 */
    public long m30173F3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m30209p3(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: F4 */
    public final boolean m30174F4() {
        String strM29352j0 = ABManager.m29352j0("intl_ft_revamp");
        return "test1".equals(strM29352j0) || "test2".equals(strM29352j0);
    }

    @Nullable
    /* JADX INFO: renamed from: G3 */
    public IapAffiliatePromotionDisplaySlot m30175G3(@Nullable IapAffiliatePromotion iapAffiliatePromotion, @NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (iapAffiliatePromotion == null || (map = iapAffiliatePromotion.displayConfig) == null) {
            return null;
        }
        return map.get(intlAffiliateDiscountEntryTab.displayConfigKey);
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m30176G4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m30142K4(iapAffiliatePromotion);
    }

    @Nullable
    /* JADX INFO: renamed from: H3 */
    public IapAffiliatePromotionDisplaySlot m30177H3(String str) {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        IapAffiliatePromotion iapAffiliatePromotionM30179I3 = m30179I3();
        if (iapAffiliatePromotionM30179I3 == null || (map = iapAffiliatePromotionM30179I3.displayConfig) == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: H4 */
    public boolean m30178H4() {
        IapAffiliatePromotion iapAffiliatePromotionM30179I3;
        return (!xma.m210071e4() || (iapAffiliatePromotionM30179I3 = m30179I3()) == null || this.f19197Y.get().longValue() == iapAffiliatePromotionM30179I3.promotionHitId) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: I3 */
    public IapAffiliatePromotion m30179I3() {
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion.productType)) && m30150b4(iapAffiliatePromotion.promotionType) && m30153d4(iapAffiliatePromotion, jM155944o) && !m30192X3(iapAffiliatePromotion.promotionHitId)) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I4 */
    public void m30180I4() {
        m30224w4().subscribe(new e30() { // from class: l.p49
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreIntlAffiliatePromotions.m30158i3((List) obj);
            }
        }, new e30() { // from class: l.q49
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreIntlAffiliatePromotions.m30147a3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public long m30181J3() {
        IapAffiliatePromotion iapAffiliatePromotionM30227y3 = m30227y3();
        if (iapAffiliatePromotionM30227y3 != null) {
            return iapAffiliatePromotionM30227y3.endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: J4 */
    public void m30182J4(long j, long j2, long j3) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f19208j0 = j;
        this.f19210l0 = j2;
        this.f19209k0 = Math.max(0L, j3);
    }

    /* JADX INFO: renamed from: K3 */
    public C22306c<List<IapAffiliatePromotion>> m30183K3() {
        return !m30174F4() ? C22306c.just(Collections.EMPTY_LIST).compose(mkd0.m154951C()) : this.f72126Q.scheduled("iap_affiliate_promotions_googleplay", 0, new v9j() { // from class: l.o49
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.r49
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31288d0()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.s49
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreIntlAffiliatePromotions.m30154e3((Envelope) obj);
                    }
                });
            }
        }).compose(mkd0.m154951C());
    }

    @Nullable
    /* JADX INFO: renamed from: L3 */
    public IapAffiliatePromotionDisplaySlot m30184L3(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (iapAffiliatePromotion == null || (map = iapAffiliatePromotion.displayConfig) == null) {
            return null;
        }
        return map.get("promotionMainPage");
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m30185M3(@NonNull IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        return m30229z3(intlAffiliateDiscountEntryTab.displayConfigKey) != null;
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m30186N3() {
        return m30227y3() != null;
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m30187O3() {
        return !vwb.m200296J(m30215s3());
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m30188P3() {
        return m30164A3() != null;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m30189S3() {
        this.f19191S = null;
        this.f19192T = false;
        this.f19193U = false;
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m30190T3() {
        return m30146V3(m30179I3());
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m30191W3() {
        return this.f19194V;
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m30192X3(long j) {
        long jLongValue = this.f19202d0.get().longValue();
        return jLongValue > 0 && j > 0 && jLongValue == j;
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean m30193Y3(long j) {
        return m30192X3(j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m30194Z3() {
        return false;
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m30195c4() {
        return m30146V3(m30227y3());
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m30196e4() {
        IapAffiliatePromotion iapAffiliatePromotionM30171E3;
        if (!this.f19194V || !m30186N3() || (iapAffiliatePromotionM30171E3 = m30171E3()) == null || m30193Y3(iapAffiliatePromotionM30171E3.promotionHitId)) {
            return false;
        }
        long j = iapAffiliatePromotionM30171E3.promotionHitId;
        boolean zBooleanValue = this.f19198Z.get().booleanValue();
        if (j > 0) {
            return (zBooleanValue || j == this.f19199a0.get().longValue()) ? false : true;
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m30197f4(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        return m30153d4(iapAffiliatePromotion, mqi0.m155944o() / 1000);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ C22306c m30198g4() {
        return C22306c.just(new ArrayList(this.f19190R));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m30199h4(List list) {
        if (vwb.m200296J(list)) {
            this.f19190R = Collections.EMPTY_LIST;
        } else {
            this.f19190R = new ArrayList(list);
        }
        this.f19194V = true;
        m30216s4(this.f19190R);
        m30217t3();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m30200i4(AtomicReference atomicReference) {
        m30207o3((C22306c) atomicReference.get());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m30201j4(AtomicReference atomicReference, Throwable th) {
        m30207o3((C22306c) atomicReference.get());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30202k4(long j) {
        this.f19202d0.put(Long.valueOf(j));
        this.f19204f0.onNext(Long.valueOf(j));
        this.f19203e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m30203l4(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strTrim = str.trim();
            IapAffiliatePromotion iapAffiliatePromotionM30227y3 = m30227y3();
            if (iapAffiliatePromotionM30227y3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM30227y3.iapId)) {
                String strTrim2 = iapAffiliatePromotionM30227y3.iapId.trim();
                String str2 = iapAffiliatePromotionM30227y3.offerId;
                String strTrim3 = str2 != null ? str2.trim() : "";
                if (!m30146V3(iapAffiliatePromotionM30227y3) || TextUtils.isEmpty(strTrim3)) {
                    return m30144R3(strTrim2, strTrim, strTrim3);
                }
                String strM30162m3 = m30162m3(strTrim, iapAffiliatePromotionM30227y3.iapId, iapAffiliatePromotionM30227y3.offerId);
                if ((TextUtils.isEmpty(strM30162m3) || !TextUtils.equals(strTrim, strM30162m3)) && !TextUtils.equals(strTrim2, m30161l3(strTrim, strTrim3))) {
                    return m30143Q3(strTrim2, strTrim);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m30204m4(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strTrim = str.trim();
            IapAffiliatePromotion iapAffiliatePromotionM30164A3 = m30164A3();
            if (iapAffiliatePromotionM30164A3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM30164A3.iapId)) {
                String strTrim2 = iapAffiliatePromotionM30164A3.iapId.trim();
                String str2 = iapAffiliatePromotionM30164A3.offerId;
                String strTrim3 = str2 != null ? str2.trim() : "";
                if (!m30146V3(iapAffiliatePromotionM30164A3) || TextUtils.isEmpty(strTrim3)) {
                    return m30144R3(strTrim2, strTrim, strTrim3);
                }
                String strM30162m3 = m30162m3(strTrim, iapAffiliatePromotionM30164A3.iapId, iapAffiliatePromotionM30164A3.offerId);
                if ((TextUtils.isEmpty(strM30162m3) || !TextUtils.equals(strTrim, strM30162m3)) && !TextUtils.equals(strTrim2, m30161l3(strTrim, strTrim3))) {
                    return m30143Q3(strTrim2, strTrim);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n3 */
    public void m30205n3() {
        this.f19211m0 = 0L;
        this.f19212n0 = 0L;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m30206n4(@Nullable List<IapAffiliatePromotion> list) {
        long jLongValue = this.f19202d0.get().longValue();
        if (jLongValue == 0) {
            return;
        }
        if (m30194Z3() && m30148a4(jLongValue)) {
            return;
        }
        if (!vwb.m200296J(list)) {
            for (IapAffiliatePromotion iapAffiliatePromotion : list) {
                if (iapAffiliatePromotion != null && iapAffiliatePromotion.promotionHitId == jLongValue) {
                    return;
                }
            }
        }
        this.f19202d0.put(0L);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m30207o3(@Nullable C22306c<List<IapAffiliatePromotion>> c22306c) {
        synchronized (this.f19195W) {
            try {
                if (this.f19196X == c22306c) {
                    this.f19196X = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m30208o4(long j) {
        if (j <= 0) {
            IapAffiliatePromotion iapAffiliatePromotionM30225x3 = m30225x3();
            if (iapAffiliatePromotionM30225x3 != null) {
                m30213r3(iapAffiliatePromotionM30225x3.promotionHitId);
                return;
            } else {
                this.f19203e0.onNext(Boolean.TRUE);
                return;
            }
        }
        IapAffiliatePromotion iapAffiliatePromotionM30223w3 = m30223w3(j);
        if (iapAffiliatePromotionM30223w3 == null || !m30197f4(iapAffiliatePromotionM30223w3)) {
            m30213r3(j);
        } else {
            m30202k4(j);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final long m30209p3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        long jM155944o = mqi0.m155944o();
        long j = jM155944o / 1000;
        long j2 = iapAffiliatePromotion.endTime;
        long j3 = j2 > 0 ? j2 * 1000 : 2305843009213693951L;
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
        if (iapAffiliatePromotionExtraConfig != null) {
            long j4 = iapAffiliatePromotionExtraConfig.countdown;
            if (j4 > 0) {
                this.f19200b0.get().getClass();
                this.f19201c0.get().getClass();
                m30219u3(iapAffiliatePromotion);
                long jLongValue = this.f19200b0.get().longValue();
                if (jLongValue < 0) {
                    long j5 = iapAffiliatePromotion.endTime;
                    jLongValue = Math.min(j4, j5 > 0 ? Math.max(0L, j5 - j) : 4611686018427387L);
                }
                long j6 = iapAffiliatePromotion.endTime;
                long jMin = Math.min(jLongValue, j6 > 0 ? Math.max(0L, j6 - j) : 9223372036854775L);
                long jMin2 = (1000 * jMin) + jM155944o;
                if (iapAffiliatePromotion.endTime > 0) {
                    jMin2 = Math.min(jMin2, j3);
                }
                if (this.f19208j0 == iapAffiliatePromotion.promotionHitId && this.f19209k0 == jMin && this.f19210l0 > jM155944o) {
                    long j7 = iapAffiliatePromotion.endTime;
                    long jMin3 = this.f19210l0;
                    if (j7 > 0) {
                        jMin3 = Math.min(jMin3, j3);
                    }
                    if (jMin3 > jM155944o) {
                        return jMin3;
                    }
                }
                this.f19208j0 = iapAffiliatePromotion.promotionHitId;
                this.f19209k0 = jMin;
                this.f19210l0 = jMin2;
                return jMin2;
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: p4 */
    public C22306c<Boolean> m30210p4() {
        return this.f19203e0.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public void m30211q3(long j) {
        IapAffiliatePromotion iapAffiliatePromotionM30223w3;
        if (j <= 0 || (iapAffiliatePromotionM30223w3 = m30223w3(j)) == null || m30197f4(iapAffiliatePromotionM30223w3)) {
            return;
        }
        m30213r3(j);
    }

    /* JADX INFO: renamed from: q4 */
    public C22306c<Boolean> m30212q4() {
        return this.f19205g0.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: r3 */
    public final void m30213r3(long j) {
        this.f19202d0.put(Long.valueOf(j));
        this.f19200b0.put(-1L);
        this.f19201c0.put(0L);
        this.f19204f0.onNext(Long.valueOf(j));
        this.f19203e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r4 */
    public C22306c<Long> m30214r4() {
        return this.f19204f0.asObservable();
    }

    /* JADX INFO: renamed from: s3 */
    public final List<IapAffiliatePromotion> m30215s3() {
        m30189S3();
        return this.f19190R;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m30216s4(List<IapAffiliatePromotion> list) {
        m30206n4(list);
        m30167B4(list);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m30217t3() {
        try {
            this.f19205g0.onNext(Boolean.TRUE);
        } catch (RuntimeException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public final IapAffiliatePromotion m30218t4() {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion.productType)) && m30150b4(iapAffiliatePromotion.promotionType) && m30153d4(iapAffiliatePromotion, jM155944o) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m30219u3(@NonNull IapAffiliatePromotion iapAffiliatePromotion) {
        if (m30142K4(iapAffiliatePromotion)) {
            long jM155944o = mqi0.m155944o() / 1000;
            long j = iapAffiliatePromotion.extraConfig.countdown;
            long j2 = iapAffiliatePromotion.endTime;
            long jMax = j2 > 0 ? Math.max(0L, j2 - jM155944o) : 4611686018427387L;
            long jMin = Math.min(j, jMax);
            long jLongValue = this.f19201c0.get().longValue();
            long jLongValue2 = this.f19200b0.get().longValue();
            if (jLongValue != iapAffiliatePromotion.promotionHitId || jLongValue2 < 0) {
                this.f19200b0.put(Long.valueOf(jMin));
                this.f19201c0.put(Long.valueOf(iapAffiliatePromotion.promotionHitId));
            } else {
                long jMin2 = Math.min(jLongValue2, jMax);
                if (jMin2 != jLongValue2) {
                    this.f19200b0.put(Long.valueOf(jMin2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public long m30220u4(long j) {
        if (j <= 0 || this.f19211m0 != j) {
            return 0L;
        }
        return this.f19212n0;
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public IapAffiliatePromotion m30221v3(@Nullable Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            String str = affiliateProducts.googleplay;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            List<IapAffiliatePromotion> listM30215s3 = m30215s3();
            if (vwb.m200296J(listM30215s3)) {
                return null;
            }
            String strTrim = str.trim();
            for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
                if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion.productType)) && m30150b4(iapAffiliatePromotion.promotionType) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null && !TextUtils.isEmpty(iapAffiliatePromotion.iapId) && m30143Q3(iapAffiliatePromotion.iapId.trim(), strTrim)) {
                    return iapAffiliatePromotion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public C22306c<List<IapAffiliatePromotion>> m30222v4() {
        synchronized (this.f19195W) {
            this.f19196X = null;
        }
        this.f19194V = false;
        return m30224w4();
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public IapAffiliatePromotion m30223w3(long j) {
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
            if (iapAffiliatePromotion != null && iapAffiliatePromotion.promotionHitId == j) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public C22306c<List<IapAffiliatePromotion>> m30224w4() {
        if (!m30174F4()) {
            this.f19190R = Collections.EMPTY_LIST;
            this.f19194V = true;
            m30216s4(this.f19190R);
            m30217t3();
            return C22306c.just(new ArrayList(this.f19190R)).compose(mkd0.m154951C());
        }
        synchronized (this.f19195W) {
            try {
                if (this.f19194V) {
                    return C22306c.defer(new v9j() { // from class: l.k49
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return this.f120954a.m30198g4();
                        }
                    }).compose(mkd0.m154951C());
                }
                C22306c<List<IapAffiliatePromotion>> c22306c = this.f19196X;
                if (c22306c != null) {
                    return c22306c;
                }
                vv5<List<IapAffiliatePromotion>> vv5VarPublish = m30183K3().doOnNext(new e30() { // from class: l.l49
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f125985a.m30199h4((List) obj);
                    }
                }).publish();
                final AtomicReference atomicReference = new AtomicReference();
                C22306c<List<IapAffiliatePromotion>> c22306cDoOnError = vv5VarPublish.m200172a(1).doOnCompleted(new d30() { // from class: l.m49
                    @Override // p149l.d30
                    public final void call() {
                        this.f131261a.m30200i4(atomicReference);
                    }
                }).doOnError(new e30() { // from class: l.n49
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f137050a.m30201j4(atomicReference, (Throwable) obj);
                    }
                });
                atomicReference.set(c22306cDoOnError);
                this.f19196X = c22306cDoOnError;
                return c22306cDoOnError;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final IapAffiliatePromotion m30225x3() {
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion.productType)) && m30150b4(iapAffiliatePromotion.promotionType)) {
                long j = iapAffiliatePromotion.endTime;
                if (j > 0 && jM155944o >= j && !m30192X3(iapAffiliatePromotion.promotionHitId)) {
                    return iapAffiliatePromotion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public long m30226x4() {
        return this.f19200b0.get().longValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final IapAffiliatePromotion m30227y3() {
        Map<String, IapAffiliatePromotionDisplaySlot> map;
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        for (IapAffiliatePromotion iapAffiliatePromotion : listM30215s3) {
            if (iapAffiliatePromotion != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion.productType)) && m30150b4(iapAffiliatePromotion.promotionType) && m30153d4(iapAffiliatePromotion, jM155944o) && (map = iapAffiliatePromotion.displayConfig) != null && map.get("promotionMainPage") != null) {
                return iapAffiliatePromotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m30228y4() {
        m30168C3();
        IapAffiliatePromotion iapAffiliatePromotionM30218t4 = m30218t4();
        if (iapAffiliatePromotionM30218t4 == null) {
            this.f19203e0.onNext(Boolean.TRUE);
            return;
        }
        if (m30192X3(iapAffiliatePromotionM30218t4.promotionHitId)) {
            this.f19203e0.onNext(Boolean.TRUE);
            return;
        }
        if (!m30142K4(iapAffiliatePromotionM30218t4)) {
            this.f19203e0.onNext(Boolean.TRUE);
            return;
        }
        long jLongValue = this.f19200b0.get().longValue();
        if (jLongValue < 0) {
            this.f19203e0.onNext(Boolean.TRUE);
            return;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        long j = iapAffiliatePromotionM30218t4.endTime;
        if (j <= 0 || jM155944o + jLongValue < j) {
            this.f19203e0.onNext(Boolean.TRUE);
        } else {
            m30213r3(iapAffiliatePromotionM30218t4.promotionHitId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final IapAffiliatePromotion m30229z3(@NonNull String str) {
        List<IapAffiliatePromotion> listM30215s3 = m30215s3();
        if (vwb.m200296J(listM30215s3)) {
            return null;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        boolean z = true;
        boolean z2 = "newSee".equals(str) || "newLike".equals(str) || "oldLike".equals(str) || "oldSee".equals(str) || VisitorsRecommendationType.newVisitor.equals(str) || "oldVisitor".equals(str) || "swipeCardPage".equals(str);
        if (!"oldSee".equals(str) && !"oldLike".equals(str) && !"oldVisitor".equals(str)) {
            z = false;
        }
        IapAffiliatePromotion iapAffiliatePromotion = null;
        for (int i = 0; i < listM30215s3.size(); i++) {
            IapAffiliatePromotion iapAffiliatePromotion2 = listM30215s3.get(i);
            if (iapAffiliatePromotion2 != null && "svip".equalsIgnoreCase(m30141D4(iapAffiliatePromotion2.productType)) && m30150b4(iapAffiliatePromotion2.promotionType) && m30153d4(iapAffiliatePromotion2, jM155944o) && !m30192X3(iapAffiliatePromotion2.promotionHitId)) {
                Map<String, IapAffiliatePromotionDisplaySlot> map = iapAffiliatePromotion2.displayConfig;
                if (m30145U3(map != null ? map.get(str) : null, z2)) {
                    if (z) {
                        if (iapAffiliatePromotion == null) {
                            iapAffiliatePromotion = iapAffiliatePromotion2;
                        }
                        if (m30142K4(iapAffiliatePromotion2)) {
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
