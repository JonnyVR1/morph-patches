package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.common.base.Optional;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreProduct;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FreeTrialData;
import com.p046p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p046p1.mobile.putong.core.data.GPContractQueryParams;
import com.p046p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p046p1.mobile.putong.core.data.IntlTabMePayGuideEnvelope;
import com.p046p1.mobile.putong.core.data.LuckyTtConfig;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PremiumWeeklyGuideData;
import com.p046p1.mobile.putong.core.data.PremiumWeeklyGuideEnvelope;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.data.RequestPromotion;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.GPContract;
import com.p046p1.mobile.putong.data.GPContractEnvelope;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.d30;
import p149l.doa;
import p149l.drb;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.jo0;
import p149l.la20;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.roj0;
import p149l.sab0;
import p149l.stc0;
import p149l.tpd0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreProduct extends ax6 {

    /* JADX INFO: renamed from: w0 */
    public static String f19278w0 = "select";

    /* JADX INFO: renamed from: R */
    public Map<ProductCategory, List<Merchandise>> f19279R;

    /* JADX INFO: renamed from: S */
    public C22392a<List<GPContract>> f19280S;

    /* JADX INFO: renamed from: T */
    public C22392a<List<GPContract>> f19281T;

    /* JADX INFO: renamed from: U */
    public C22392a<List<GPContract>> f19282U;

    /* JADX INFO: renamed from: V */
    public zpd0 f19283V;

    /* JADX INFO: renamed from: W */
    public zpd0 f19284W;

    /* JADX INFO: renamed from: X */
    public zpd0 f19285X;

    /* JADX INFO: renamed from: Y */
    public hpd0 f19286Y;

    /* JADX INFO: renamed from: Z */
    public hpd0 f19287Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f19288a0;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f19289b0;

    /* JADX INFO: renamed from: c0 */
    public hpd0 f19290c0;

    /* JADX INFO: renamed from: d0 */
    public hpd0 f19291d0;

    /* JADX INFO: renamed from: e0 */
    public final hpd0 f19292e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f19293f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f19294g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f19295h0;

    /* JADX INFO: renamed from: i0 */
    public LuckyTtConfig f19296i0;

    /* JADX INFO: renamed from: j0 */
    public final C22392a<Optional<RefundDetail>> f19297j0;

    /* JADX INFO: renamed from: k0 */
    public final C22392a<Optional<RefundDetail>> f19298k0;

    /* JADX INFO: renamed from: l0 */
    public final C22392a<IntlTabMePayGuide> f19299l0;

    /* JADX INFO: renamed from: m0 */
    public final C22392a<Optional<Boolean>> f19300m0;

    /* JADX INFO: renamed from: n0 */
    public final tpd0 f19301n0;

    /* JADX INFO: renamed from: o0 */
    public final C22392a<List<Merchandise>> f19302o0;

    /* JADX INFO: renamed from: p0 */
    public final C22392a<PurchaseDialogConfigs> f19303p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f19304q0;

    /* JADX INFO: renamed from: r0 */
    public FreeTrialData f19305r0;

    /* JADX INFO: renamed from: s0 */
    public String f19306s0;

    /* JADX INFO: renamed from: t0 */
    public C22393b<j760<String, PushMessageCustom>> f19307t0;

    /* JADX INFO: renamed from: u0 */
    public C22392a<Boolean> f19308u0;

    /* JADX INFO: renamed from: v0 */
    public C22392a<Optional<Boolean>> f19309v0;

    public enum PromotionStatus {
        BLOCK,
        NONE,
        OUTOFDATE,
        VALID
    }

    public CoreProduct(C4732c c4732c) {
        super(c4732c);
        this.f19279R = new HashMap();
        this.f19280S = C22392a.m221512b();
        this.f19281T = C22392a.m221512b();
        this.f19282U = C22392a.m221512b();
        this.f19283V = new zpd0("display_gp_vip_subs_failed_dlg_" + CoreModule.m29931H().userId(), 0L);
        this.f19284W = new zpd0("display_gp_see_subs_failed_dlg_" + CoreModule.m29931H().userId(), 0L);
        this.f19285X = new zpd0("display_dlg_in_privilege_" + CoreModule.m29931H().userId(), 0L);
        String str = "location_search_bubble_show_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.TRUE;
        this.f19286Y = new hpd0(str, bool);
        this.f19287Z = new hpd0("location_bubble_show_" + CoreModule.m29931H().userId(), bool);
        String str2 = "location_bubule_has_shown_" + CoreModule.m29931H().userId();
        Boolean bool2 = Boolean.FALSE;
        this.f19288a0 = new hpd0(str2, bool2);
        this.f19289b0 = new hpd0("location_search_bubble_has_shown_" + CoreModule.m29931H().userId(), bool2);
        this.f19290c0 = new hpd0("is_sign_" + CoreModule.m29931H().userId(), bool2);
        this.f19291d0 = new hpd0("has_shown_lucky_tt_icon", bool2);
        this.f19292e0 = new hpd0("showcase_horizontal_enable_cache_" + CoreModule.m29931H().userId(), bool);
        this.f19294g0 = false;
        this.f19295h0 = false;
        this.f19297j0 = C22392a.m221512b();
        this.f19298k0 = C22392a.m221512b();
        this.f19299l0 = C22392a.m221512b();
        this.f19300m0 = C22392a.m221512b();
        this.f19301n0 = new tpd0("show_intl_tab_me_pay_guide_red" + CoreModule.m29931H().userId(), -1);
        this.f19302o0 = C22392a.m221512b();
        this.f19303p0 = C22392a.m221512b();
        this.f19304q0 = false;
        this.f19307t0 = C22393b.m221521b();
        this.f19308u0 = C22392a.m221513c(bool2);
        this.f19309v0 = C22392a.m221513c(Optional.absent());
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m30538g3() {
        CoreModule.f17553k.f91953p.deleteAll();
        CoreModule.f17553k.f91954q.deleteAll();
        if (ura.m195053e().m195057d().mo33682F4()) {
            du2.m113670a("[core][merchandise]", "selectPromotion merchandises deleteAlll ");
            CoreModule.f17553k.f91948k.deleteAll();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ String m30552n3(Merchandise merchandise) {
        return merchandise.f56011id + "\t" + merchandise.defaultStockKeepUnit.f20507id + "\t" + merchandise.category;
    }

    /* JADX INFO: renamed from: A4 */
    public boolean m30572A4() {
        return m30635u4("seeWhoLikedMe") && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && !m30606R4();
    }

    /* JADX INFO: renamed from: A5 */
    public C22306c<List<Merchandise>> m30573A5(String str, boolean z) {
        return m30646z5(ProductCategory.get(str), z);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m30574B4() {
        if (m30635u4("vip")) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9) && !userM169527p9.isVIP() && !userM169527p9.isSVIP()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public C22306c<List<Merchandise>> m30575B5(ProductCategory productCategory, String str) {
        return CoreModule.f17553k.f91948k.m198611H(productCategory, str).m165620m().doOnNext(new e30() { // from class: l.cna
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81657a.m30616b5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public FreeTrialData m30576C4() {
        if (!NullChecker.m81303a(this.f19305r0) || TextUtils.isEmpty(this.f19305r0.promotionType)) {
            return null;
        }
        return this.f19305r0;
    }

    /* JADX INFO: renamed from: C5 */
    public C22306c<List<Merchandise>> m30577C5(ProductCategory productCategory, String str) {
        return CoreModule.f17553k.f91948k.m198612I(productCategory, str).m165620m().doOnNext(new e30() { // from class: l.opa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144960a.m30617c5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public C22306c<IntlTabMePayGuide> m30578D4() {
        return this.f19299l0.asObservable();
    }

    /* JADX INFO: renamed from: D5 */
    public List<Merchandise> m30579D5(ProductCategory productCategory) {
        if (this.f19279R.get(productCategory) == null && (TEnum.equals(productCategory, ProductCategory.tttSeeWhoLikedMe) || (TEnum.equals(productCategory, ProductCategory.tttVip) && TEnum.equals(productCategory, "svip")))) {
            m30640w5(productCategory);
        }
        return this.f19279R.get(productCategory);
    }

    /* JADX INFO: renamed from: E4 */
    public C22392a<List<Merchandise>> m30580E4() {
        return this.f19302o0;
    }

    /* JADX INFO: renamed from: E5 */
    public C22306c<Boolean> m30581E5() {
        return this.f19300m0.asObservable().filter(new doa()).map(new w9j() { // from class: l.eoa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return (Boolean) ((Optional) obj).get();
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: F4 */
    public List<Merchandise> m30582F4() {
        return new ArrayList(CoreModule.f17553k.f91948k.m198609F().m165617j());
    }

    /* JADX INFO: renamed from: F5 */
    public void m30583F5() {
        try {
            this.f19296i0 = LuckyTtConfig.parse(RemoteConfig.m79298x().m79302F("luckytantan_native_entrance"));
        } catch (IOException e) {
            CrashHelper.m81296c(new IOException("lucky tt catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public C22306c<FreeTrialEnvelope> m30584G4() {
        return this.f72126Q.scheduled("promotionInfo", 0, new v9j() { // from class: l.qna
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155406a.m30610V4();
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public void m30585G5(String str, PushMessageCustom pushMessageCustom) {
        if ("purchase_result".equals(this.f19306s0) && "purchase_loading".equals(str)) {
            return;
        }
        this.f19306s0 = str;
        this.f19307t0.m132487l(j760.m140076a(str, pushMessageCustom));
    }

    /* JADX INFO: renamed from: H4 */
    public PromotionStatus m30586H4() {
        long jM155944o = mqi0.m155944o() / 1000;
        FreeTrialData freeTrialData = this.f19305r0;
        if (freeTrialData == null) {
            return PromotionStatus.NONE;
        }
        return (jM155944o < freeTrialData.startTime || jM155944o > freeTrialData.endTime) ? PromotionStatus.OUTOFDATE : PromotionStatus.VALID;
    }

    /* JADX INFO: renamed from: H5 */
    public C22306c<Data> m30587H5(final String str) {
        return this.f72126Q.scheduled("query_contracts", 0, new v9j() { // from class: l.moa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.noa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31186C1(str)).m185887f().m185883b();
                    }
                }).filter(new w9j() { // from class: l.ooa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a(((Envelope) obj).data));
                    }
                }).map(new w9j() { // from class: l.poa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public PurchaseDialogConfigs m30588I4() {
        if (this.f19303p0.m221519i()) {
            return this.f19303p0.m221515e();
        }
        return null;
    }

    /* JADX INFO: renamed from: I5 */
    public List<Merchandise> m30589I5(String str) {
        return CoreModule.f17553k.f91948k.queryCache(Merchandise.DEFAULTSTOCKKEEPUNIT_ID.mo60175EQ(str), null, 20);
    }

    /* JADX INFO: renamed from: J4 */
    public C22392a<Optional<RefundDetail>> m30590J4() {
        return this.f19297j0;
    }

    /* JADX INFO: renamed from: J5 */
    public C22306c<roj0> m30591J5() {
        final String str;
        du2.m113670a("[core][merchandise]", " refreshMerchandises ");
        if (IntlCountryCodeController.m28115k()) {
            str = C4728a.m31200G("/users/me/merchandises") + "?appSource=tttApp&affiliate=huawei";
        } else {
            str = C4728a.m31200G("/users/me/merchandises") + "?appSource=tttApp&affiliate=googleplay";
        }
        return this.f72126Q.scheduled("merchandises", 0, new v9j() { // from class: l.una
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177347a.m30621g5(str);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public C22392a<Optional<RefundDetail>> m30592K4() {
        return this.f19298k0;
    }

    /* JADX INFO: renamed from: K5 */
    public C22306c<Optional<RefundDetail>> m30593K5() {
        return this.f72126Q.scheduled("refund_detail_of_svip", 0, new v9j() { // from class: l.jna
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118845a.m30624j5();
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m30594L4() {
        return this.f19292e0.get().booleanValue();
    }

    /* JADX INFO: renamed from: L5 */
    public C22306c<roj0> m30595L5(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("action", "select");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return this.f72126Q.scheduled("merchandises-promotions", -1, new v9j() { // from class: l.roa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160372a.m30628n5(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public String m30596M4(String str) {
        if (vwb.m200298L(str)) {
            CrashHelper.m81296c(new Throwable("getTrackerFormItemId：itemId==null"));
            return "";
        }
        List<Merchandise> listM30589I5 = m30589I5(str);
        if (vwb.m200296J(listM30589I5)) {
            CrashHelper.m81296c(new Throwable("getTrackerFormItemId：merchandises==null itemId=" + str));
            return "";
        }
        Merchandise merchandise = listM30589I5.get(0);
        if (NullChecker.m81303a(merchandise.defaultStockKeepUnit) && str.equals(merchandise.defaultStockKeepUnit.f20507id)) {
            return merchandise.defaultStockKeepUnit.tracker;
        }
        CrashHelper.m81296c(new Throwable("getTrackerFormItemId：have merchandises but return null"));
        return "";
    }

    /* JADX INFO: renamed from: M5 */
    public void m30597M5(boolean z) {
        this.f19308u0.m132487l(Boolean.valueOf(z));
    }

    @UiThread
    /* JADX INFO: renamed from: N4 */
    public void m30598N4(final ProductCategory productCategory) {
        final GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
        gPContractQueryParams.platform = "googleplay";
        gPContractQueryParams.productType = productCategory;
        final String str = "/contracts/iap/query?platform=googleplay&productType=" + productCategory;
        scheduled("gpContracts/" + productCategory, 0, new v9j() { // from class: l.rpa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.pna
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31329n1(str)).m185893l(utc0.create(Network.JSON, gPContractQueryParams.toJson())).m185883b();
                    }
                }, GPContractEnvelope.JSON_ADAPTER);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.spa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165764a.m30611W4(productCategory, (GPContractEnvelope) obj);
            }
        }, new e30() { // from class: l.tpa
            @Override // p149l.e30
            public final void call(Object obj) {
                App.f15368d.m20433k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public C22306c<roj0> m30599N5(String str, String str2, String str3, boolean z) {
        final RequestPromotion requestPromotion = new RequestPromotion();
        requestPromotion.action = str;
        requestPromotion.privilegeType = str2;
        if (TextUtils.equals(f19278w0, str)) {
            requestPromotion.selectedID = str3;
        }
        return this.f72126Q.scheduled("merchandises/promotions", -1, new v9j() { // from class: l.soa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165662a.m30632r5(requestPromotion);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public boolean m30600O4() {
        return !vwb.m200296J(m30579D5(ProductCategory.get(ProductCategory.Promo_premiumUpgradeToUltra)));
    }

    /* JADX INFO: renamed from: O5 */
    public C22306c<roj0> m30601O5(final String str) {
        return this.f72126Q.scheduled("currency_code", -1, new v9j() { // from class: l.toa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.fpa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31358u2()).m185893l(utc0.create(Network.JSON, "{\"currencyCode\":\"" + str + "\"}")).m185883b();
                    }
                }).map(new w9j() { // from class: l.gpa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public boolean m30602P4() {
        return !(vwb.m200296J(m30579D5(ProductCategory.get(ProductCategory.tttVipUpgradeToPremium))) || vwb.m200296J(m30579D5(ProductCategory.get(ProductCategory.tttSeeUpgradeToPremium))) || vwb.m200296J(m30579D5(ProductCategory.get(ProductCategory.tttPremiumUpgradeToUltra)))) || m30600O4();
    }

    /* JADX INFO: renamed from: P5 */
    public C22306c<roj0> m30603P5() {
        return this.f72126Q.scheduled("upload_premium_weekly_guide", 0, new v9j() { // from class: l.kna
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f123872a.m30634t5();
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m30604Q4() {
        return CoreModule.f17545c.f19654j0.m30574B4() || CoreModule.f17545c.f19654j0.m30572A4() || CoreModule.f17545c.f19654j0.m30643y4();
    }

    /* JADX INFO: renamed from: Q5 */
    public C22306c<roj0> m30605Q5() {
        return this.f72126Q.scheduled("upload_tab_me_payGuide", -1, new v9j() { // from class: l.yma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f198969a.m30638v5();
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m30606R4() {
        return NullChecker.m81303a(CoreModule.f17545c.m31484o3()) && CoreModule.f17545c.m31484o3().likersLimit.remaining > 0;
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m30607S4(PurchaseType purchaseType) {
        if (sab0.m182905w(purchaseType) && CoreModule.f17545c.f19654j0.m30574B4()) {
            return true;
        }
        if (sab0.m182901s(purchaseType) && CoreModule.f17545c.f19654j0.m30572A4()) {
            return true;
        }
        return sab0.m182899q(purchaseType) && CoreModule.f17545c.f19654j0.m30643y4();
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m30608T4() {
        if (NullChecker.m81303a(m30576C4()) && m30635u4("premium")) {
            return "premium-promotion".equals(m30576C4().offerType);
        }
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ FreeTrialEnvelope m30609U4(FreeTrialEnvelope freeTrialEnvelope) {
        this.f19305r0 = freeTrialEnvelope.data;
        return freeTrialEnvelope;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ C22306c m30610V4() {
        return ia20.m135119c(new v9j() { // from class: l.goa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31178A1(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }, FreeTrialEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.hoa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108804a.m30609U4((FreeTrialEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m30611W4(ProductCategory productCategory, GPContractEnvelope gPContractEnvelope) {
        if (gPContractEnvelope == null || gPContractEnvelope.data == null) {
            return;
        }
        if (TEnum.equals(productCategory, "svip")) {
            this.f19281T.m132487l(gPContractEnvelope.data.contracts);
        } else if (TEnum.equals(productCategory, "vip")) {
            this.f19280S.m132487l(gPContractEnvelope.data.contracts);
        } else if (TEnum.equals(productCategory, "seeWhoLikedMe")) {
            this.f19282U.m132487l(gPContractEnvelope.data.contracts);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m30612X4(ProductCategory productCategory, List list) {
        this.f19279R.put(productCategory, list);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m30613Y4(ProductCategory[] productCategoryArr) {
        for (final ProductCategory productCategory : productCategoryArr) {
            final List<Merchandise> listQuery = CoreModule.f17553k.f91948k.query(Merchandise.CATEGORY.m60176EQ(productCategory.toString()), Merchandise.QUANTITY.DESC, -1);
            if (!vwb.m200296J(listQuery)) {
                e51.m114742G(new Runnable() { // from class: l.ina
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f114008a.m30612X4(productCategory, listQuery);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ List m30614Z4(ProductCategory productCategory, List list) {
        list.size();
        Objects.toString(productCategory);
        Objects.toString(vwb.m200346r(list, new w9j() { // from class: l.lna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty(((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.getProductId()));
            }
        }));
        if (vwb.m200346r(list, new w9j() { // from class: l.mna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty(((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.getProductId()));
            }
        }) != null) {
            return vwb.m200324f0(new Merchandise[0]);
        }
        m30642x5(list, productCategory.toString(), "\tloadFromDB: ");
        return list;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m30615a5(List list) {
        if (!this.f19304q0 && list.isEmpty()) {
            m30591J5();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m30616b5(List list) {
        if (list.isEmpty()) {
            m30591J5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m30617c5(List list) {
        if (list.isEmpty()) {
            m30591J5();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Envelope m30618d5(Envelope envelope) {
        m30642x5(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, "all", "\tmerchandise from server : ");
        if (ura.m195053e().m195057d().mo33682F4()) {
            drb.INSTANCE.m113290a(envelope);
        }
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.loa
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91948k.deleteAll();
            }
        });
        du2.m113670a("[core][merchandise]", " mergeNetworkStateIntoLocal complete ");
        return envelope;
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m30619e5(Throwable th) {
        du2.m113670a("[core][merchandise]", " refreshMerchandises error " + th);
        m30640w5(ProductCategory.get(ProductCategory.tttVip), ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial));
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ roj0 m30620f5(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        this.f19279R.put(ProductCategory.get(ProductCategory.tttVip), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.rna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
            }
        }));
        this.f19279R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.tna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
            }
        }));
        this.f19279R.put(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.vna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSvipGoogleplayFreeTrial));
            }
        }));
        this.f19279R.put(ProductCategory.get(ProductCategory.Promo_premiumUpgradeToUltra), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.wna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.Promo_premiumUpgradeToUltra));
            }
        }));
        if (ura.m195053e().m195057d().mo33866k()) {
            this.f19279R.put(ProductCategory.get("svipPicksMembership"), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.xna
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                }
            }));
            this.f19279R.put(ProductCategory.get("picksMembership"), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.yna
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                }
            }));
        }
        PurchaseDialogConfigs purchaseDialogConfigs = coreData.purchaseDialogConfigs;
        if (NullChecker.m81303a(purchaseDialogConfigs)) {
            this.f19303p0.m132487l(purchaseDialogConfigs);
            if (NullChecker.m81303a(purchaseDialogConfigs.isShowCheckPopup)) {
                this.f19292e0.put(purchaseDialogConfigs.isShowCheckPopup);
            }
        }
        if (CoreModule.m29934N().mo60329Vo()) {
            this.f19279R.put(ProductCategory.get(ProductCategory.momentCoin), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.zna
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.momentCoin));
                }
            }));
        }
        if (CoreModule.f17557o.m195057d().mo33766Vd()) {
            this.f19279R.put(ProductCategory.get(ProductCategory.tttUltraPremium), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.aoa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttUltraPremium));
                }
            }));
        }
        if (CoreModule.f17557o.m195057d().mo33724Na()) {
            this.f19279R.put(ProductCategory.get(ProductCategory.tttVipUpgradeToPremium), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.boa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVipUpgradeToPremium));
                }
            }));
            this.f19279R.put(ProductCategory.get(ProductCategory.tttSeeUpgradeToPremium), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.coa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeUpgradeToPremium));
                }
            }));
            this.f19279R.put(ProductCategory.get(ProductCategory.tttPremiumUpgradeToUltra), vwb.m200339n(coreData.merchandises, new w9j() { // from class: l.sna
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttPremiumUpgradeToUltra));
                }
            }));
        }
        this.f19302o0.m132487l(coreData.merchandises);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ C22306c m30621g5(final String str) {
        return new la20(new v9j() { // from class: l.dna
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).filter(new w9j() { // from class: l.ena
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81305c(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).merchandises, "core_merchandises_refresh", CrashHelper.ReportLevel.p1));
            }
        }).map(new w9j() { // from class: l.fna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98410a.m30618d5((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.gna
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103584a.m30619e5((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.hna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108594a.m30620f5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ stc0 m30622h5() {
        return C4728a.f19494P.auth().m185898q(m31382V1()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ Optional m30623i5(Envelope envelope) {
        if (!NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).refundDetails) || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).refundDetails)) {
            this.f19297j0.m132487l(Optional.absent());
            this.f19298k0.m132487l(Optional.absent());
            return Optional.absent();
        }
        List<RefundDetail> list = ((CoreData) envelope.getModuleData(CoreData.class)).refundDetails;
        if (!ura.m195053e().m195057d().mo33919s3()) {
            Optional<RefundDetail> optionalM15413of = Optional.m15413of(list.get(0));
            this.f19297j0.m132487l(optionalM15413of);
            return optionalM15413of;
        }
        RefundDetail refundDetail = (RefundDetail) vwb.m200346r(list, new w9j() { // from class: l.nna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RefundDetail) obj).f20491id, "oDiamond"));
            }
        });
        boolean zM81303a = NullChecker.m81303a(refundDetail);
        C22392a<Optional<RefundDetail>> c22392a = this.f19298k0;
        if (zM81303a) {
            c22392a.m132487l(Optional.m15413of(refundDetail));
        } else {
            c22392a.m132487l(Optional.absent());
        }
        RefundDetail refundDetail2 = (RefundDetail) vwb.m200346r(list, new w9j() { // from class: l.ona
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RefundDetail) obj).f20491id, "svip"));
            }
        });
        Optional<RefundDetail> optionalM15413of2 = NullChecker.m81303a(refundDetail2) ? Optional.m15413of(refundDetail2) : Optional.absent();
        this.f19297j0.m132487l(optionalM15413of2);
        return optionalM15413of2;
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ C22306c m30624j5() {
        return ia20.m135117a(new v9j() { // from class: l.ana
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f70720a.m30622h5();
            }
        }).map(new w9j() { // from class: l.bna
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76382a.m30623i5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ Envelope m30625k5(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33682F4()) {
            drb.INSTANCE.m113292c(envelope);
        }
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.dpa
            @Override // p149l.d30
            public final void call() {
                CoreProduct.m30538g3();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m30626l5(Throwable th) {
        m30640w5(ProductCategory.get(ProductCategory.tttVip), ProductCategory.get(ProductCategory.tttSeeWhoLikedMe));
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ roj0 m30627m5(Envelope envelope) {
        this.f19279R.put(ProductCategory.get(ProductCategory.tttVip), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.hpa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
            }
        }));
        this.f19279R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.ipa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
            }
        }));
        if (ura.m195053e().m195057d().mo33866k()) {
            this.f19279R.put(ProductCategory.get("svipPicksMembership"), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.jpa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                }
            }));
            this.f19279R.put(ProductCategory.get("picksMembership"), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.kpa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                }
            }));
        }
        if (CoreModule.m29934N().mo60329Vo()) {
            this.f19279R.put(ProductCategory.get(ProductCategory.momentCoin), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.lpa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.momentCoin));
                }
            }));
        }
        if (CoreModule.f17557o.m195057d().mo33766Vd()) {
            this.f19279R.put(ProductCategory.get(ProductCategory.tttUltraPremium), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.npa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttUltraPremium));
                }
            }));
        }
        this.f19302o0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).merchandises);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ C22306c m30628n5(final JSONObject jSONObject) {
        return new la20(new v9j() { // from class: l.uoa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31182B1()).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.voa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182376a.m30625k5((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.woa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187391a.m30626l5((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.xoa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193795a.m30627m5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ Envelope m30629o5(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.epa
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91948k.deleteAll();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m30630p5(Throwable th) {
        m30640w5(ProductCategory.get(ProductCategory.tttVip), ProductCategory.get(ProductCategory.tttSeeWhoLikedMe));
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ roj0 m30631q5(Envelope envelope) {
        this.f19279R.put(ProductCategory.get(ProductCategory.tttVip), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.ppa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
            }
        }));
        this.f19279R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.qpa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
            }
        }));
        this.f19302o0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).merchandises);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ C22306c m30632r5(final RequestPromotion requestPromotion) {
        return new la20(new v9j() { // from class: l.yoa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/users/me/merchandises/promotions")).m185892k(utc0.create(Network.JSON, requestPromotion.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.zoa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204095a.m30629o5((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.apa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71006a.m30630p5((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.cpa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81912a.m30631q5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ roj0 m30633s5(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope) {
        PremiumWeeklyGuideData premiumWeeklyGuideData = premiumWeeklyGuideEnvelope.data;
        this.f19300m0.m132487l(Optional.m15413of(Boolean.valueOf(premiumWeeklyGuideData != null && premiumWeeklyGuideData.needGuide)));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ C22306c m30634t5() {
        return ia20.m135119c(new v9j() { // from class: l.ioa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/checkPremiumWeeklyGuide")).m185887f().m185883b();
            }
        }, PremiumWeeklyGuideEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.joa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118927a.m30633s5((PremiumWeeklyGuideEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m30635u4(String str) {
        if (!NullChecker.m81303a(m30576C4()) || !TextUtils.equals(m30576C4().promotionType, str)) {
            return false;
        }
        long jM155944o = mqi0.m155944o() / 1000;
        return jM155944o >= m30576C4().startTime && jM155944o <= m30576C4().endTime;
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ roj0 m30636u5(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope) {
        boolean z = intlTabMePayGuideEnvelope.data.showBanner;
        tpd0 tpd0Var = this.f19301n0;
        if (z) {
            if (tpd0Var.get().intValue() == -1) {
                this.f19301n0.put(1);
            }
        } else if (tpd0Var.get().intValue() == 1) {
            this.f19301n0.put(-1);
        }
        this.f19299l0.m132487l(intlTabMePayGuideEnvelope.data);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v4 */
    public void m30637v4() {
        this.f19293f0 = false;
        Order order = new Order();
        order.orderStatus = BundleStatus.get(BundleStatus.assumedPurchased);
        qib0.f154705T.m29590Z(order);
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ C22306c m30638v5() {
        return ia20.m135119c(new v9j() { // from class: l.bpa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31336p0()).m185887f().m185883b();
            }
        }, IntlTabMePayGuideEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.mpa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f135029a.m30636u5((IntlTabMePayGuideEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public void m30639w4() {
        if (this.f19303p0.m221519i() && NullChecker.m81303a(this.f19303p0.m221515e().isShowCheckPopup)) {
            PurchaseDialogConfigs purchaseDialogConfigsM221515e = this.f19303p0.m221515e();
            boolean zBooleanValue = purchaseDialogConfigsM221515e.isShowCheckPopup.booleanValue();
            purchaseDialogConfigsM221515e.isShowCheckPopup = Boolean.valueOf(!zBooleanValue);
            this.f19303p0.m132487l(purchaseDialogConfigsM221515e);
            this.f19292e0.put(Boolean.valueOf(!zBooleanValue));
            return;
        }
        PurchaseDialogConfigs purchaseDialogConfigsNew_ = PurchaseDialogConfigs.new_();
        Boolean bool = Boolean.TRUE;
        purchaseDialogConfigsNew_.isShowCheckPopup = bool;
        this.f19303p0.m132487l(purchaseDialogConfigsNew_);
        this.f19292e0.put(bool);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m30640w5(final ProductCategory... productCategoryArr) {
        e51.m114774y(new Runnable() { // from class: l.zma
            @Override // java.lang.Runnable
            public final void run() {
                this.f203704a.m30613Y4(productCategoryArr);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public void m30641x4() {
        this.f19300m0.m132487l(Optional.m15413of(Boolean.FALSE));
    }

    /* JADX INFO: renamed from: x5 */
    public final void m30642x5(List<Merchandise> list, String str, String str2) {
        du2.m113670a("[core][merchandise]", "category:" + str + "\tsize:" + list.size() + str2 + vwb.m200342o0(list, new w9j() { // from class: l.koa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreProduct.m30552n3((Merchandise) obj);
            }
        }, Constants.SEPARATOR_COMMA));
    }

    /* JADX INFO: renamed from: y4 */
    public boolean m30643y4() {
        if (!m30635u4("premium") && !m30635u4("premium_sale")) {
            return false;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (!NullChecker.m81303a(userM169527p9) || m30606R4() || userM169527p9.isVIP() || userM169527p9.isSVIP() || m30608T4()) ? false : true;
    }

    /* JADX INFO: renamed from: y5 */
    public C22306c<List<Merchandise>> m30644y5(ProductCategory productCategory) {
        return m30646z5(productCategory, true);
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m30645z4() {
        if (m30635u4("premium") && m30608T4()) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            return (!NullChecker.m81303a(userM169527p9) || m30606R4() || userM169527p9.isVIP() || userM169527p9.isSVIP()) ? false : true;
        }
        if (m30635u4("premium_sale")) {
            User userM169527p10 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p10) && !m30606R4() && !userM169527p10.isVIP() && !userM169527p10.isSVIP()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z5 */
    public C22306c<List<Merchandise>> m30646z5(final ProductCategory productCategory, boolean z) {
        return CoreModule.f17553k.f91948k.m198610G(productCategory, z).m165620m().map(new w9j() { // from class: l.foa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98522a.m30614Z4(productCategory, (List) obj);
            }
        }).doOnNext(new e30() { // from class: l.qoa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155545a.m30615a5((List) obj);
            }
        });
    }
}
