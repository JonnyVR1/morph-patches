package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreProduct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FreeTrialData;
import com.p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p1.mobile.putong.core.data.GPContractQueryParams;
import com.p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p1.mobile.putong.core.data.IntlTabMePayGuideEnvelope;
import com.p1.mobile.putong.core.data.LuckyTtConfig;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PremiumWeeklyGuideData;
import com.p1.mobile.putong.core.data.PremiumWeeklyGuideEnvelope;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RefundDetail;
import com.p1.mobile.putong.core.data.RequestPromotion;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.Data;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.GPContract;
import com.p1.mobile.putong.data.GPContractEnvelope;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.d30;
import l.drb;
import l.du2;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.sab0;
import l.stc0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.la20;
import p006l.qib0;
import p006l.ura;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreProduct extends ax6 {

    /* JADX INFO: renamed from: w0 */
    public static String f3267w0 = "select";

    /* JADX INFO: renamed from: R */
    public Map<ProductCategory, List<Merchandise>> f3268R;

    /* JADX INFO: renamed from: S */
    public a<List<GPContract>> f3269S;

    /* JADX INFO: renamed from: T */
    public a<List<GPContract>> f3270T;

    /* JADX INFO: renamed from: U */
    public a<List<GPContract>> f3271U;

    /* JADX INFO: renamed from: V */
    public zpd0 f3272V;

    /* JADX INFO: renamed from: W */
    public zpd0 f3273W;

    /* JADX INFO: renamed from: X */
    public zpd0 f3274X;

    /* JADX INFO: renamed from: Y */
    public hpd0 f3275Y;

    /* JADX INFO: renamed from: Z */
    public hpd0 f3276Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f3277a0;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f3278b0;

    /* JADX INFO: renamed from: c0 */
    public hpd0 f3279c0;

    /* JADX INFO: renamed from: d0 */
    public hpd0 f3280d0;

    /* JADX INFO: renamed from: e0 */
    public final hpd0 f3281e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f3282f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f3283g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f3284h0;

    /* JADX INFO: renamed from: i0 */
    public LuckyTtConfig f3285i0;

    /* JADX INFO: renamed from: j0 */
    public final a<Optional<RefundDetail>> f3286j0;

    /* JADX INFO: renamed from: k0 */
    public final a<Optional<RefundDetail>> f3287k0;

    /* JADX INFO: renamed from: l0 */
    public final a<IntlTabMePayGuide> f3288l0;

    /* JADX INFO: renamed from: m0 */
    public final a<Optional<Boolean>> f3289m0;

    /* JADX INFO: renamed from: n0 */
    public final tpd0 f3290n0;

    /* JADX INFO: renamed from: o0 */
    public final a<List<Merchandise>> f3291o0;

    /* JADX INFO: renamed from: p0 */
    public final a<PurchaseDialogConfigs> f3292p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f3293q0;

    /* JADX INFO: renamed from: r0 */
    public FreeTrialData f3294r0;

    /* JADX INFO: renamed from: s0 */
    public String f3295s0;

    /* JADX INFO: renamed from: t0 */
    public b<j760<String, PushMessageCustom>> f3296t0;

    /* JADX INFO: renamed from: u0 */
    public a<Boolean> f3297u0;

    /* JADX INFO: renamed from: v0 */
    public a<Optional<Boolean>> f3298v0;

    public enum PromotionStatus {
        BLOCK,
        NONE,
        OUTOFDATE,
        VALID
    }

    public CoreProduct(C0158c c0158c) {
        super(c0158c);
        this.f3268R = new HashMap();
        this.f3269S = a.b();
        this.f3270T = a.b();
        this.f3271U = a.b();
        this.f3272V = new zpd0("display_gp_vip_subs_failed_dlg_" + CoreModule.m1850H().userId(), 0L);
        this.f3273W = new zpd0("display_gp_see_subs_failed_dlg_" + CoreModule.m1850H().userId(), 0L);
        this.f3274X = new zpd0("display_dlg_in_privilege_" + CoreModule.m1850H().userId(), 0L);
        String str = "location_search_bubble_show_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.TRUE;
        this.f3275Y = new hpd0(str, bool);
        this.f3276Z = new hpd0("location_bubble_show_" + CoreModule.m1850H().userId(), bool);
        String str2 = "location_bubule_has_shown_" + CoreModule.m1850H().userId();
        Boolean bool2 = Boolean.FALSE;
        this.f3277a0 = new hpd0(str2, bool2);
        this.f3278b0 = new hpd0("location_search_bubble_has_shown_" + CoreModule.m1850H().userId(), bool2);
        this.f3279c0 = new hpd0("is_sign_" + CoreModule.m1850H().userId(), bool2);
        this.f3280d0 = new hpd0("has_shown_lucky_tt_icon", bool2);
        this.f3281e0 = new hpd0("showcase_horizontal_enable_cache_" + CoreModule.m1850H().userId(), bool);
        this.f3283g0 = false;
        this.f3284h0 = false;
        this.f3286j0 = a.b();
        this.f3287k0 = a.b();
        this.f3288l0 = a.b();
        this.f3289m0 = a.b();
        this.f3290n0 = new tpd0("show_intl_tab_me_pay_guide_red" + CoreModule.m1850H().userId(), -1);
        this.f3291o0 = a.b();
        this.f3292p0 = a.b();
        this.f3293q0 = false;
        this.f3296t0 = b.b();
        this.f3297u0 = a.c(bool2);
        this.f3298v0 = a.c(Optional.absent());
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m2466g3() {
        CoreModule.f1542k.f11208p.deleteAll();
        CoreModule.f1542k.f11209q.deleteAll();
        if (ura.m25555e().m25559d().m5619F4()) {
            du2.a("[core][merchandise]", "selectPromotion merchandises deleteAlll ");
            CoreModule.f1542k.f11203k.deleteAll();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ String m2480n3(Merchandise merchandise) {
        return ((DbObject) merchandise).id + "\t" + merchandise.defaultStockKeepUnit.id + "\t" + merchandise.category;
    }

    /* JADX INFO: renamed from: A4 */
    public boolean m2500A4() {
        return m2563u4("seeWhoLikedMe") && NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9()) && !m2534R4();
    }

    /* JADX INFO: renamed from: A5 */
    public c<List<Merchandise>> m2501A5(String str, boolean z) {
        return m2574z5(ProductCategory.get(str), z);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m2502B4() {
        if (m2563u4("vip")) {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            if (NullChecker.a(userM21490p9) && !userM21490p9.isVIP() && !userM21490p9.isSVIP()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public c<List<Merchandise>> m2503B5(ProductCategory productCategory, String str) {
        return CoreModule.f1542k.f11203k.m25829H(productCategory, str).m().doOnNext(new e30() { // from class: l.cna
            public final void call(Object obj) {
                this.f9744a.m2544b5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public FreeTrialData m2504C4() {
        if (!NullChecker.a(this.f3294r0) || TextUtils.isEmpty(this.f3294r0.promotionType)) {
            return null;
        }
        return this.f3294r0;
    }

    /* JADX INFO: renamed from: C5 */
    public c<List<Merchandise>> m2505C5(ProductCategory productCategory, String str) {
        return CoreModule.f1542k.f11203k.m25830I(productCategory, str).m().doOnNext(new e30() { // from class: l.opa
            public final void call(Object obj) {
                this.f18317a.m2545c5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public c<IntlTabMePayGuide> m2506D4() {
        return this.f3288l0.asObservable();
    }

    /* JADX INFO: renamed from: D5 */
    public List<Merchandise> m2507D5(ProductCategory productCategory) {
        if (this.f3268R.get(productCategory) == null && (TEnum.equals(productCategory, "tttSeeWhoLikedMe") || (TEnum.equals(productCategory, "tttVip") && TEnum.equals(productCategory, "svip")))) {
            m2568w5(productCategory);
        }
        return this.f3268R.get(productCategory);
    }

    /* JADX INFO: renamed from: E4 */
    public a<List<Merchandise>> m2508E4() {
        return this.f3291o0;
    }

    /* JADX INFO: renamed from: E5 */
    public c<Boolean> m2509E5() {
        return this.f3289m0.asObservable().filter(new w9j() { // from class: l.doa
            public final Object call(Object obj) {
                return Boolean.valueOf(((Optional) obj).isPresent());
            }
        }).map(new w9j() { // from class: l.eoa
            public final Object call(Object obj) {
                return (Boolean) ((Optional) obj).get();
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: F4 */
    public List<Merchandise> m2510F4() {
        return new ArrayList(CoreModule.f1542k.f11203k.m25827F().j());
    }

    /* JADX INFO: renamed from: F5 */
    public void m2511F5() {
        try {
            this.f3285i0 = LuckyTtConfig.parse(RemoteConfig.x().F("luckytantan_native_entrance"));
        } catch (IOException e) {
            CrashHelper.c(new IOException("lucky tt catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public c<FreeTrialEnvelope> m2512G4() {
        return this.f8580Q.scheduled("promotionInfo", 0, new v9j() { // from class: l.qna
            public final Object call() {
                return this.f19924a.m2538V4();
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public void m2513G5(String str, PushMessageCustom pushMessageCustom) {
        if ("purchase_result".equals(this.f3295s0) && "purchase_loading".equals(str)) {
            return;
        }
        this.f3295s0 = str;
        this.f3296t0.onNext(j760.a(str, pushMessageCustom));
    }

    /* JADX INFO: renamed from: H4 */
    public PromotionStatus m2514H4() {
        long jO = mqi0.o() / 1000;
        FreeTrialData freeTrialData = this.f3294r0;
        if (freeTrialData == null) {
            return PromotionStatus.NONE;
        }
        return (jO < freeTrialData.startTime || jO > freeTrialData.endTime) ? PromotionStatus.OUTOFDATE : PromotionStatus.VALID;
    }

    /* JADX INFO: renamed from: H5 */
    public c<Data> m2515H5(final String str) {
        return this.f8580Q.scheduled("query_contracts", 0, new v9j() { // from class: l.moa
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.noa
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3116C1(str)).f().b();
                    }
                }).filter(new w9j() { // from class: l.ooa
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a(((Envelope) obj).data));
                    }
                }).map(new w9j() { // from class: l.poa
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public PurchaseDialogConfigs m2516I4() {
        if (this.f3292p0.i()) {
            return (PurchaseDialogConfigs) this.f3292p0.e();
        }
        return null;
    }

    /* JADX INFO: renamed from: I5 */
    public List<Merchandise> m2517I5(String str) {
        return CoreModule.f1542k.f11203k.queryCache(Merchandise.DEFAULTSTOCKKEEPUNIT_ID.EQ(str), (Order) null, 20);
    }

    /* JADX INFO: renamed from: J4 */
    public a<Optional<RefundDetail>> m2518J4() {
        return this.f3286j0;
    }

    /* JADX INFO: renamed from: J5 */
    public c<roj0> m2519J5() {
        final String str;
        du2.a("[core][merchandise]", " refreshMerchandises ");
        if (IntlCountryCodeController.m10k()) {
            str = C0154a.m3130G("/users/me/merchandises") + "?appSource=tttApp&affiliate=huawei";
        } else {
            str = C0154a.m3130G("/users/me/merchandises") + "?appSource=tttApp&affiliate=googleplay";
        }
        return this.f8580Q.scheduled("merchandises", 0, new v9j() { // from class: l.una
            public final Object call() {
                return this.f23668a.m2549g5(str);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public a<Optional<RefundDetail>> m2520K4() {
        return this.f3287k0;
    }

    /* JADX INFO: renamed from: K5 */
    public c<Optional<RefundDetail>> m2521K5() {
        return this.f8580Q.scheduled("refund_detail_of_svip", 0, new v9j() { // from class: l.jna
            public final Object call() {
                return this.f15286a.m2552j5();
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m2522L4() {
        return ((Boolean) this.f3281e0.get()).booleanValue();
    }

    /* JADX INFO: renamed from: L5 */
    public c<roj0> m2523L5(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("action", "select");
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return this.f8580Q.scheduled("merchandises-promotions", -1, new v9j() { // from class: l.roa
            public final Object call() {
                return this.f20660a.m2556n5(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public String m2524M4(String str) {
        if (vwb.L(str)) {
            CrashHelper.c(new Throwable("getTrackerFormItemId：itemId==null"));
            return "";
        }
        List<Merchandise> listM2517I5 = m2517I5(str);
        if (vwb.J(listM2517I5)) {
            CrashHelper.c(new Throwable("getTrackerFormItemId：merchandises==null itemId=" + str));
            return "";
        }
        Merchandise merchandise = listM2517I5.get(0);
        if (NullChecker.a(merchandise.defaultStockKeepUnit) && str.equals(merchandise.defaultStockKeepUnit.id)) {
            return merchandise.defaultStockKeepUnit.tracker;
        }
        CrashHelper.c(new Throwable("getTrackerFormItemId：have merchandises but return null"));
        return "";
    }

    /* JADX INFO: renamed from: M5 */
    public void m2525M5(boolean z) {
        this.f3297u0.onNext(Boolean.valueOf(z));
    }

    @UiThread
    /* JADX INFO: renamed from: N4 */
    public void m2526N4(final ProductCategory productCategory) {
        final GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
        gPContractQueryParams.platform = "googleplay";
        gPContractQueryParams.productType = productCategory;
        final String str = "/contracts/iap/query?platform=googleplay&productType=" + productCategory;
        scheduled("gpContracts/" + productCategory, 0, new v9j() { // from class: l.rpa
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.pna
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3259n1(str)).l(utc0.create(Network.JSON, gPContractQueryParams.toJson())).b();
                    }
                }, GPContractEnvelope.JSON_ADAPTER);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.spa
            public final void call(Object obj) {
                this.f21565a.m2539W4(productCategory, (GPContractEnvelope) obj);
            }
        }, new e30() { // from class: l.tpa
            public final void call(Object obj) {
                App.d.k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public c<roj0> m2527N5(String str, String str2, String str3, boolean z) {
        final RequestPromotion requestPromotion = new RequestPromotion();
        requestPromotion.action = str;
        requestPromotion.privilegeType = str2;
        if (TextUtils.equals(f3267w0, str)) {
            requestPromotion.selectedID = str3;
        }
        return this.f8580Q.scheduled("merchandises/promotions", -1, new v9j() { // from class: l.soa
            public final Object call() {
                return this.f21548a.m2560r5(requestPromotion);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public boolean m2528O4() {
        return !vwb.J(m2507D5(ProductCategory.get("Promo_premiumUpgradeToUltra")));
    }

    /* JADX INFO: renamed from: O5 */
    public c<roj0> m2529O5(final String str) {
        return this.f8580Q.scheduled("currency_code", -1, new v9j() { // from class: l.toa
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.fpa
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3288u2()).l(utc0.create(Network.JSON, "{\"currencyCode\":\"" + str + "\"}")).b();
                    }
                }).map(new w9j() { // from class: l.gpa
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public boolean m2530P4() {
        return !(vwb.J(m2507D5(ProductCategory.get("tttVipUpgradeToPremium"))) || vwb.J(m2507D5(ProductCategory.get("tttSeeUpgradeToPremium"))) || vwb.J(m2507D5(ProductCategory.get("tttPremiumUpgradeToUltra")))) || m2528O4();
    }

    /* JADX INFO: renamed from: P5 */
    public c<roj0> m2531P5() {
        return this.f8580Q.scheduled("upload_premium_weekly_guide", 0, new v9j() { // from class: l.kna
            public final Object call() {
                return this.f15915a.m2562t5();
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m2532Q4() {
        return CoreModule.f1534c.f3643j0.m2502B4() || CoreModule.f1534c.f3643j0.m2500A4() || CoreModule.f1534c.f3643j0.m2571y4();
    }

    /* JADX INFO: renamed from: Q5 */
    public c<roj0> m2533Q5() {
        return this.f8580Q.scheduled("upload_tab_me_payGuide", -1, new v9j() { // from class: l.yma
            public final Object call() {
                return this.f28300a.m2566v5();
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m2534R4() {
        return NullChecker.a(CoreModule.f1534c.m3414o3()) && CoreModule.f1534c.m3414o3().likersLimit.remaining > 0;
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m2535S4(PurchaseType purchaseType) {
        if (sab0.w(purchaseType) && CoreModule.f1534c.f3643j0.m2502B4()) {
            return true;
        }
        if (sab0.s(purchaseType) && CoreModule.f1534c.f3643j0.m2500A4()) {
            return true;
        }
        return sab0.q(purchaseType) && CoreModule.f1534c.f3643j0.m2571y4();
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m2536T4() {
        if (NullChecker.a(m2504C4()) && m2563u4("premium")) {
            return "premium-promotion".equals(m2504C4().offerType);
        }
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ FreeTrialEnvelope m2537U4(FreeTrialEnvelope freeTrialEnvelope) {
        this.f3294r0 = freeTrialEnvelope.data;
        return freeTrialEnvelope;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ c m2538V4() {
        return ia20.m16569c(new v9j() { // from class: l.goa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3108A1(CoreModule.m1850H().userId())).f().b();
            }
        }, FreeTrialEnvelope.JSON_ADAPTER).observeOn(jo0.a()).map(new w9j() { // from class: l.hoa
            public final Object call(Object obj) {
                return this.f13988a.m2537U4((FreeTrialEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m2539W4(ProductCategory productCategory, GPContractEnvelope gPContractEnvelope) {
        if (gPContractEnvelope == null || gPContractEnvelope.data == null) {
            return;
        }
        if (TEnum.equals(productCategory, "svip")) {
            this.f3270T.onNext(gPContractEnvelope.data.contracts);
        } else if (TEnum.equals(productCategory, "vip")) {
            this.f3269S.onNext(gPContractEnvelope.data.contracts);
        } else if (TEnum.equals(productCategory, "seeWhoLikedMe")) {
            this.f3271U.onNext(gPContractEnvelope.data.contracts);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m2540X4(ProductCategory productCategory, List list) {
        this.f3268R.put(productCategory, list);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m2541Y4(ProductCategory[] productCategoryArr) {
        for (final ProductCategory productCategory : productCategoryArr) {
            final List listQuery = CoreModule.f1542k.f11203k.query(Merchandise.CATEGORY.EQ(productCategory.toString()), ((OrderedColumn) Merchandise.QUANTITY).DESC, -1);
            if (!vwb.J(listQuery)) {
                e51.G(new Runnable() { // from class: l.ina
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14580a.m2540X4(productCategory, listQuery);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ List m2542Z4(ProductCategory productCategory, List list) {
        list.size();
        Objects.toString(productCategory);
        Objects.toString(vwb.r(list, new w9j() { // from class: l.lna
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty(((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.getProductId()));
            }
        }));
        if (vwb.r(list, new w9j() { // from class: l.mna
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty(((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.getProductId()));
            }
        }) != null) {
            return vwb.f0(new Merchandise[0]);
        }
        m2570x5(list, productCategory.toString(), "\tloadFromDB: ");
        return list;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m2543a5(List list) {
        if (!this.f3293q0 && list.isEmpty()) {
            m2519J5();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m2544b5(List list) {
        if (list.isEmpty()) {
            m2519J5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m2545c5(List list) {
        if (list.isEmpty()) {
            m2519J5();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Envelope m2546d5(Envelope envelope) {
        m2570x5(envelope.getModuleData(CoreData.class).merchandises, "all", "\tmerchandise from server : ");
        if (ura.m25555e().m25559d().m5619F4()) {
            drb.INSTANCE.a(envelope);
        }
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.loa
            public final void call() {
                CoreModule.f1542k.f11203k.deleteAll();
            }
        });
        du2.a("[core][merchandise]", " mergeNetworkStateIntoLocal complete ");
        return envelope;
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m2547e5(Throwable th) {
        du2.a("[core][merchandise]", " refreshMerchandises error " + th);
        m2568w5(ProductCategory.get("tttVip"), ProductCategory.get("tttSeeWhoLikedMe"), ProductCategory.get("tttSvipGoogleplayFreeTrial"));
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ roj0 m2548f5(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        this.f3268R.put(ProductCategory.get("tttVip"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.rna
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttVip"));
            }
        }));
        this.f3268R.put(ProductCategory.get("tttSeeWhoLikedMe"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.tna
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttSeeWhoLikedMe"));
            }
        }));
        this.f3268R.put(ProductCategory.get("tttSvipGoogleplayFreeTrial"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.vna
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttSvipGoogleplayFreeTrial"));
            }
        }));
        this.f3268R.put(ProductCategory.get("Promo_premiumUpgradeToUltra"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.wna
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "Promo_premiumUpgradeToUltra"));
            }
        }));
        if (ura.m25555e().m25559d().m5803k()) {
            this.f3268R.put(ProductCategory.get("svipPicksMembership"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.xna
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                }
            }));
            this.f3268R.put(ProductCategory.get("picksMembership"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.yna
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                }
            }));
        }
        PurchaseDialogConfigs purchaseDialogConfigs = moduleData.purchaseDialogConfigs;
        if (NullChecker.a(purchaseDialogConfigs)) {
            this.f3292p0.onNext(purchaseDialogConfigs);
            if (NullChecker.a(purchaseDialogConfigs.isShowCheckPopup)) {
                this.f3281e0.put(purchaseDialogConfigs.isShowCheckPopup);
            }
        }
        if (CoreModule.m1853N().Vo()) {
            this.f3268R.put(ProductCategory.get("momentCoin"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.zna
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "momentCoin"));
                }
            }));
        }
        if (CoreModule.f1546o.m25559d().m5703Vd()) {
            this.f3268R.put(ProductCategory.get("tttUltraPremium"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.aoa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttUltraPremium"));
                }
            }));
        }
        if (CoreModule.f1546o.m25559d().m5661Na()) {
            this.f3268R.put(ProductCategory.get("tttVipUpgradeToPremium"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.boa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttVipUpgradeToPremium"));
                }
            }));
            this.f3268R.put(ProductCategory.get("tttSeeUpgradeToPremium"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.coa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttSeeUpgradeToPremium"));
                }
            }));
            this.f3268R.put(ProductCategory.get("tttPremiumUpgradeToUltra"), vwb.n(moduleData.merchandises, new w9j() { // from class: l.sna
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttPremiumUpgradeToUltra"));
                }
            }));
        }
        this.f3291o0.onNext(moduleData.merchandises);
        return roj0.a;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ c m2549g5(final String str) {
        return new la20(new v9j() { // from class: l.dna
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).filter(new w9j() { // from class: l.ena
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.c(((Envelope) obj).getModuleData(CoreData.class).merchandises, "core_merchandises_refresh", CrashHelper.ReportLevel.p1));
            }
        }).map(new w9j() { // from class: l.fna
            public final Object call(Object obj) {
                return this.f12796a.m2546d5((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.gna
            public final void call(Object obj) {
                this.f13407a.m2547e5((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.hna
            public final Object call(Object obj) {
                return this.f13952a.m2548f5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ stc0 m2550h5() {
        return C0154a.f3483P.auth().q(m3312V1()).f().b();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ Optional m2551i5(Envelope envelope) {
        if (!NullChecker.a(envelope.getModuleData(CoreData.class).refundDetails) || vwb.J(envelope.getModuleData(CoreData.class).refundDetails)) {
            this.f3286j0.onNext(Optional.absent());
            this.f3287k0.onNext(Optional.absent());
            return Optional.absent();
        }
        List list = envelope.getModuleData(CoreData.class).refundDetails;
        if (!ura.m25555e().m25559d().m5856s3()) {
            Optional optionalOf = Optional.of((RefundDetail) list.get(0));
            this.f3286j0.onNext(optionalOf);
            return optionalOf;
        }
        RefundDetail refundDetail = (RefundDetail) vwb.r(list, new w9j() { // from class: l.nna
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RefundDetail) obj).id, "oDiamond"));
            }
        });
        boolean zA = NullChecker.a(refundDetail);
        a<Optional<RefundDetail>> aVar = this.f3287k0;
        if (zA) {
            aVar.onNext(Optional.of(refundDetail));
        } else {
            aVar.onNext(Optional.absent());
        }
        RefundDetail refundDetail2 = (RefundDetail) vwb.r(list, new w9j() { // from class: l.ona
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RefundDetail) obj).id, "svip"));
            }
        });
        Optional optionalOf2 = NullChecker.a(refundDetail2) ? Optional.of(refundDetail2) : Optional.absent();
        this.f3286j0.onNext(optionalOf2);
        return optionalOf2;
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ c m2552j5() {
        return ia20.m16567a(new v9j() { // from class: l.ana
            public final Object call() {
                return this.f8404a.m2550h5();
            }
        }).map(new w9j() { // from class: l.bna
            public final Object call(Object obj) {
                return this.f9002a.m2551i5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ Envelope m2553k5(Envelope envelope) {
        if (ura.m25555e().m25559d().m5619F4()) {
            drb.INSTANCE.c(envelope);
        }
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.dpa
            public final void call() {
                CoreProduct.m2466g3();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m2554l5(Throwable th) {
        m2568w5(ProductCategory.get("tttVip"), ProductCategory.get("tttSeeWhoLikedMe"));
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ roj0 m2555m5(Envelope envelope) {
        this.f3268R.put(ProductCategory.get("tttVip"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.hpa
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttVip"));
            }
        }));
        this.f3268R.put(ProductCategory.get("tttSeeWhoLikedMe"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.ipa
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttSeeWhoLikedMe"));
            }
        }));
        if (ura.m25555e().m25559d().m5803k()) {
            this.f3268R.put(ProductCategory.get("svipPicksMembership"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.jpa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                }
            }));
            this.f3268R.put(ProductCategory.get("picksMembership"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.kpa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                }
            }));
        }
        if (CoreModule.m1853N().Vo()) {
            this.f3268R.put(ProductCategory.get("momentCoin"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.lpa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "momentCoin"));
                }
            }));
        }
        if (CoreModule.f1546o.m25559d().m5703Vd()) {
            this.f3268R.put(ProductCategory.get("tttUltraPremium"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.npa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttUltraPremium"));
                }
            }));
        }
        this.f3291o0.onNext(envelope.getModuleData(CoreData.class).merchandises);
        return roj0.a;
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ c m2556n5(final JSONObject jSONObject) {
        return new la20(new v9j() { // from class: l.uoa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3112B1()).k(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.voa
            public final Object call(Object obj) {
                return this.f24400a.m2553k5((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.woa
            public final void call(Object obj) {
                this.f25265a.m2554l5((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.xoa
            public final Object call(Object obj) {
                return this.f27637a.m2555m5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ Envelope m2557o5(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.epa
            public final void call() {
                CoreModule.f1542k.f11203k.deleteAll();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m2558p5(Throwable th) {
        m2568w5(ProductCategory.get("tttVip"), ProductCategory.get("tttSeeWhoLikedMe"));
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ roj0 m2559q5(Envelope envelope) {
        this.f3268R.put(ProductCategory.get("tttVip"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.ppa
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttVip"));
            }
        }));
        this.f3268R.put(ProductCategory.get("tttSeeWhoLikedMe"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.qpa
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttSeeWhoLikedMe"));
            }
        }));
        this.f3291o0.onNext(envelope.getModuleData(CoreData.class).merchandises);
        return roj0.a;
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ c m2560r5(final RequestPromotion requestPromotion) {
        return new la20(new v9j() { // from class: l.yoa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/users/me/merchandises/promotions")).k(utc0.create(Network.JSON, requestPromotion.toJson())).b();
            }
        }).map(new w9j() { // from class: l.zoa
            public final Object call(Object obj) {
                return this.f28861a.m2557o5((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.apa
            public final void call(Object obj) {
                this.f8436a.m2558p5((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.cpa
            public final Object call(Object obj) {
                return this.f9780a.m2559q5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ roj0 m2561s5(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope) {
        PremiumWeeklyGuideData premiumWeeklyGuideData = premiumWeeklyGuideEnvelope.data;
        this.f3289m0.onNext(Optional.of(Boolean.valueOf(premiumWeeklyGuideData != null && premiumWeeklyGuideData.needGuide)));
        return roj0.a;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ c m2562t5() {
        return ia20.m16569c(new v9j() { // from class: l.ioa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/checkPremiumWeeklyGuide")).f().b();
            }
        }, PremiumWeeklyGuideEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.joa
            public final Object call(Object obj) {
                return this.f15290a.m2561s5((PremiumWeeklyGuideEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m2563u4(String str) {
        if (!NullChecker.a(m2504C4()) || !TextUtils.equals(m2504C4().promotionType, str)) {
            return false;
        }
        long jO = mqi0.o() / 1000;
        return jO >= m2504C4().startTime && jO <= m2504C4().endTime;
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ roj0 m2564u5(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope) {
        boolean z = intlTabMePayGuideEnvelope.data.showBanner;
        tpd0 tpd0Var = this.f3290n0;
        if (z) {
            if (((Integer) tpd0Var.get()).intValue() == -1) {
                this.f3290n0.put(1);
            }
        } else if (((Integer) tpd0Var.get()).intValue() == 1) {
            this.f3290n0.put(-1);
        }
        this.f3288l0.onNext(intlTabMePayGuideEnvelope.data);
        return roj0.a;
    }

    /* JADX INFO: renamed from: v4 */
    public void m2565v4() {
        this.f3282f0 = false;
        com.p1.mobile.putong.data.Order order = new com.p1.mobile.putong.data.Order();
        order.orderStatus = BundleStatus.get("assumedPurchased");
        qib0.f19796T.m1496Z(order);
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ c m2566v5() {
        return ia20.m16569c(new v9j() { // from class: l.bpa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3266p0()).f().b();
            }
        }, IntlTabMePayGuideEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.mpa
            public final Object call(Object obj) {
                return this.f17177a.m2564u5((IntlTabMePayGuideEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public void m2567w4() {
        if (this.f3292p0.i() && NullChecker.a(((PurchaseDialogConfigs) this.f3292p0.e()).isShowCheckPopup)) {
            PurchaseDialogConfigs purchaseDialogConfigs = (PurchaseDialogConfigs) this.f3292p0.e();
            boolean zBooleanValue = purchaseDialogConfigs.isShowCheckPopup.booleanValue();
            purchaseDialogConfigs.isShowCheckPopup = Boolean.valueOf(!zBooleanValue);
            this.f3292p0.onNext(purchaseDialogConfigs);
            this.f3281e0.put(Boolean.valueOf(!zBooleanValue));
            return;
        }
        PurchaseDialogConfigs purchaseDialogConfigsNew_ = PurchaseDialogConfigs.new_();
        Boolean bool = Boolean.TRUE;
        purchaseDialogConfigsNew_.isShowCheckPopup = bool;
        this.f3292p0.onNext(purchaseDialogConfigsNew_);
        this.f3281e0.put(bool);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m2568w5(final ProductCategory... productCategoryArr) {
        e51.y(new Runnable() { // from class: l.zma
            @Override // java.lang.Runnable
            public final void run() {
                this.f28822a.m2541Y4(productCategoryArr);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public void m2569x4() {
        this.f3289m0.onNext(Optional.of(Boolean.FALSE));
    }

    /* JADX INFO: renamed from: x5 */
    public final void m2570x5(List<Merchandise> list, String str, String str2) {
        du2.a("[core][merchandise]", "category:" + str + "\tsize:" + list.size() + str2 + vwb.o0(list, new w9j() { // from class: l.koa
            public final Object call(Object obj) {
                return CoreProduct.m2480n3((Merchandise) obj);
            }
        }, ","));
    }

    /* JADX INFO: renamed from: y4 */
    public boolean m2571y4() {
        if (!m2563u4("premium") && !m2563u4("premium_sale")) {
            return false;
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        return (!NullChecker.a(userM21490p9) || m2534R4() || userM21490p9.isVIP() || userM21490p9.isSVIP() || m2536T4()) ? false : true;
    }

    /* JADX INFO: renamed from: y5 */
    public c<List<Merchandise>> m2572y5(ProductCategory productCategory) {
        return m2574z5(productCategory, true);
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m2573z4() {
        if (m2563u4("premium") && m2536T4()) {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            return (!NullChecker.a(userM21490p9) || m2534R4() || userM21490p9.isVIP() || userM21490p9.isSVIP()) ? false : true;
        }
        if (m2563u4("premium_sale")) {
            User userM21490p10 = CoreModule.f1534c.f3628e0.m21490p9();
            if (NullChecker.a(userM21490p10) && !m2534R4() && !userM21490p10.isVIP() && !userM21490p10.isSVIP()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z5 */
    public c<List<Merchandise>> m2574z5(final ProductCategory productCategory, boolean z) {
        return CoreModule.f1542k.f11203k.m25828G(productCategory, z).m().map(new w9j() { // from class: l.foa
            public final Object call(Object obj) {
                return this.f12816a.m2542Z4(productCategory, (List) obj);
            }
        }).doOnNext(new e30() { // from class: l.qoa
            public final void call(Object obj) {
                this.f19953a.m2543a5((List) obj);
            }
        });
    }
}
