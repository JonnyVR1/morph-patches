package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreProduct;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FreeTrialData;
import com.p051p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p051p1.mobile.putong.core.data.GPContractQueryParams;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuideEnvelope;
import com.p051p1.mobile.putong.core.data.LuckyTtConfig;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PremiumWeeklyGuideData;
import com.p051p1.mobile.putong.core.data.PremiumWeeklyGuideEnvelope;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RefundDetail;
import com.p051p1.mobile.putong.core.data.RequestPromotion;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.GPContract;
import com.p051p1.mobile.putong.data.GPContractEnvelope;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.byd0;
import p153l.dy6;
import p153l.fo0;
import p153l.gta;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.pcj;
import p153l.pf60;
import p153l.ppa;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.rsb;
import p153l.ti20;
import p153l.tu2;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wib0;
import p153l.x1d0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class CoreProduct extends dy6 {

    /* JADX INFO: renamed from: w0 */
    public static String f20020w0 = "select";

    /* JADX INFO: renamed from: R */
    public Map<ProductCategory, List<Merchandise>> f20021R;

    /* JADX INFO: renamed from: S */
    public C22507a<List<GPContract>> f20022S;

    /* JADX INFO: renamed from: T */
    public C22507a<List<GPContract>> f20023T;

    /* JADX INFO: renamed from: U */
    public C22507a<List<GPContract>> f20024U;

    /* JADX INFO: renamed from: V */
    public byd0 f20025V;

    /* JADX INFO: renamed from: W */
    public byd0 f20026W;

    /* JADX INFO: renamed from: X */
    public byd0 f20027X;

    /* JADX INFO: renamed from: Y */
    public jxd0 f20028Y;

    /* JADX INFO: renamed from: Z */
    public jxd0 f20029Z;

    /* JADX INFO: renamed from: a0 */
    public jxd0 f20030a0;

    /* JADX INFO: renamed from: b0 */
    public jxd0 f20031b0;

    /* JADX INFO: renamed from: c0 */
    public jxd0 f20032c0;

    /* JADX INFO: renamed from: d0 */
    public jxd0 f20033d0;

    /* JADX INFO: renamed from: e0 */
    public final jxd0 f20034e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f20035f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f20036g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f20037h0;

    /* JADX INFO: renamed from: i0 */
    public LuckyTtConfig f20038i0;

    /* JADX INFO: renamed from: j0 */
    public final C22507a<Optional<RefundDetail>> f20039j0;

    /* JADX INFO: renamed from: k0 */
    public final C22507a<Optional<RefundDetail>> f20040k0;

    /* JADX INFO: renamed from: l0 */
    public final C22507a<IntlTabMePayGuide> f20041l0;

    /* JADX INFO: renamed from: m0 */
    public final C22507a<Optional<Boolean>> f20042m0;

    /* JADX INFO: renamed from: n0 */
    public final vxd0 f20043n0;

    /* JADX INFO: renamed from: o0 */
    public final C22507a<List<Merchandise>> f20044o0;

    /* JADX INFO: renamed from: p0 */
    public final C22507a<PurchaseDialogConfigs> f20045p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f20046q0;

    /* JADX INFO: renamed from: r0 */
    public FreeTrialData f20047r0;

    /* JADX INFO: renamed from: s0 */
    public String f20048s0;

    /* JADX INFO: renamed from: t0 */
    public C22508b<pf60<String, PushMessageCustom>> f20049t0;

    /* JADX INFO: renamed from: u0 */
    public C22507a<Boolean> f20050u0;

    /* JADX INFO: renamed from: v0 */
    public C22507a<Optional<Boolean>> f20051v0;

    public enum PromotionStatus {
        BLOCK,
        NONE,
        OUTOFDATE,
        VALID
    }

    public CoreProduct(C4883c c4883c) {
        super(c4883c);
        this.f20021R = new HashMap();
        this.f20022S = C22507a.m222758b();
        this.f20023T = C22507a.m222758b();
        this.f20024U = C22507a.m222758b();
        this.f20025V = new byd0("display_gp_vip_subs_failed_dlg_" + CoreModule.m30929H().userId(), 0L);
        this.f20026W = new byd0("display_gp_see_subs_failed_dlg_" + CoreModule.m30929H().userId(), 0L);
        this.f20027X = new byd0("display_dlg_in_privilege_" + CoreModule.m30929H().userId(), 0L);
        String str = "location_search_bubble_show_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.TRUE;
        this.f20028Y = new jxd0(str, bool);
        this.f20029Z = new jxd0("location_bubble_show_" + CoreModule.m30929H().userId(), bool);
        String str2 = "location_bubule_has_shown_" + CoreModule.m30929H().userId();
        Boolean bool2 = Boolean.FALSE;
        this.f20030a0 = new jxd0(str2, bool2);
        this.f20031b0 = new jxd0("location_search_bubble_has_shown_" + CoreModule.m30929H().userId(), bool2);
        this.f20032c0 = new jxd0("is_sign_" + CoreModule.m30929H().userId(), bool2);
        this.f20033d0 = new jxd0("has_shown_lucky_tt_icon", bool2);
        this.f20034e0 = new jxd0("showcase_horizontal_enable_cache_" + CoreModule.m30929H().userId(), bool);
        this.f20036g0 = false;
        this.f20037h0 = false;
        this.f20039j0 = C22507a.m222758b();
        this.f20040k0 = C22507a.m222758b();
        this.f20041l0 = C22507a.m222758b();
        this.f20042m0 = C22507a.m222758b();
        this.f20043n0 = new vxd0("show_intl_tab_me_pay_guide_red" + CoreModule.m30929H().userId(), -1);
        this.f20044o0 = C22507a.m222758b();
        this.f20045p0 = C22507a.m222758b();
        this.f20046q0 = false;
        this.f20049t0 = C22508b.m222767b();
        this.f20050u0 = C22507a.m222759c(bool2);
        this.f20051v0 = C22507a.m222759c(Optional.absent());
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m31541g3() {
        CoreModule.f18272k.f115548p.deleteAll();
        CoreModule.f18272k.f115549q.deleteAll();
        if (gta.m132210e().m132214d().mo34685F4()) {
            tu2.m192703a("[core][merchandise]", "selectPromotion merchandises deleteAlll ");
            CoreModule.f18272k.f115543k.deleteAll();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ String m31555n3(Merchandise merchandise) {
        return merchandise.f56859id + "\t" + merchandise.defaultStockKeepUnit.f21249id + "\t" + merchandise.category;
    }

    /* JADX INFO: renamed from: A4 */
    public boolean m31575A4() {
        return m31638u4("seeWhoLikedMe") && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && !m31609R4();
    }

    /* JADX INFO: renamed from: A5 */
    public C22421c<List<Merchandise>> m31576A5(String str, boolean z) {
        return m31649z5(ProductCategory.get(str), z);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m31577B4() {
        if (m31638u4("vip")) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9) && !userM116600p9.isVIP() && !userM116600p9.isSVIP()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public C22421c<List<Merchandise>> m31578B5(ProductCategory productCategory, String str) {
        return CoreModule.f18272k.f115543k.m187645H(productCategory, str).m208677m().doOnNext(new y20() { // from class: l.ooa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148341a.m31619b5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public FreeTrialData m31579C4() {
        if (!NullChecker.m82486a(this.f20047r0) || TextUtils.isEmpty(this.f20047r0.promotionType)) {
            return null;
        }
        return this.f20047r0;
    }

    /* JADX INFO: renamed from: C5 */
    public C22421c<List<Merchandise>> m31580C5(ProductCategory productCategory, String str) {
        return CoreModule.f18272k.f115543k.m187646I(productCategory, str).m208677m().doOnNext(new y20() { // from class: l.ara
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72922a.m31620c5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public C22421c<IntlTabMePayGuide> m31581D4() {
        return this.f20041l0.asObservable();
    }

    /* JADX INFO: renamed from: D5 */
    public List<Merchandise> m31582D5(ProductCategory productCategory) {
        if (this.f20021R.get(productCategory) == null && (TEnum.equals(productCategory, ProductCategory.tttSeeWhoLikedMe) || (TEnum.equals(productCategory, ProductCategory.tttVip) && TEnum.equals(productCategory, "svip")))) {
            m31643w5(productCategory);
        }
        return this.f20021R.get(productCategory);
    }

    /* JADX INFO: renamed from: E4 */
    public C22507a<List<Merchandise>> m31583E4() {
        return this.f20044o0;
    }

    /* JADX INFO: renamed from: E5 */
    public C22421c<Boolean> m31584E5() {
        return this.f20042m0.asObservable().filter(new ppa()).map(new qcj() { // from class: l.qpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return (Boolean) ((Optional) obj).get();
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: F4 */
    public List<Merchandise> m31585F4() {
        return new ArrayList(CoreModule.f18272k.f115543k.m187643F().m208674j());
    }

    /* JADX INFO: renamed from: F5 */
    public void m31586F5() {
        try {
            this.f20038i0 = LuckyTtConfig.parse(RemoteConfig.m80481x().m80485F("luckytantan_native_entrance"));
        } catch (IOException e) {
            CrashHelper.m82479c(new IOException("lucky tt catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public C22421c<FreeTrialEnvelope> m31587G4() {
        return this.f91137Q.scheduled("promotionInfo", 0, new pcj() { // from class: l.cpa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82982a.m31613V4();
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public void m31588G5(String str, PushMessageCustom pushMessageCustom) {
        if ("purchase_result".equals(this.f20048s0) && "purchase_loading".equals(str)) {
            return;
        }
        this.f20048s0 = str;
        this.f20049t0.m137019l(pf60.m172085a(str, pushMessageCustom));
    }

    /* JADX INFO: renamed from: H4 */
    public PromotionStatus m31589H4() {
        long jM174454o = pzi0.m174454o() / 1000;
        FreeTrialData freeTrialData = this.f20047r0;
        if (freeTrialData == null) {
            return PromotionStatus.NONE;
        }
        return (jM174454o < freeTrialData.startTime || jM174454o > freeTrialData.endTime) ? PromotionStatus.OUTOFDATE : PromotionStatus.VALID;
    }

    /* JADX INFO: renamed from: H5 */
    public C22421c<Data> m31590H5(final String str) {
        return this.f91137Q.scheduled("query_contracts", 0, new pcj() { // from class: l.ypa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.zpa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32189C1(str)).m209032f().m209028b();
                    }
                }).filter(new qcj() { // from class: l.aqa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a(((Envelope) obj).data));
                    }
                }).map(new qcj() { // from class: l.bqa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public PurchaseDialogConfigs m31591I4() {
        if (this.f20045p0.m222765i()) {
            return this.f20045p0.m222761e();
        }
        return null;
    }

    /* JADX INFO: renamed from: I5 */
    public List<Merchandise> m31592I5(String str) {
        return CoreModule.f18272k.f115543k.queryCache(Merchandise.DEFAULTSTOCKKEEPUNIT_ID.mo61359EQ(str), null, 20);
    }

    /* JADX INFO: renamed from: J4 */
    public C22507a<Optional<RefundDetail>> m31593J4() {
        return this.f20039j0;
    }

    /* JADX INFO: renamed from: J5 */
    public C22421c<uxj0> m31594J5() {
        final String str;
        tu2.m192703a("[core][merchandise]", " refreshMerchandises ");
        if (IntlCountryCodeController.m29114k()) {
            str = C4879a.m32203G("/users/me/merchandises") + "?appSource=tttApp&affiliate=huawei";
        } else {
            str = C4879a.m32203G("/users/me/merchandises") + "?appSource=tttApp&affiliate=googleplay";
        }
        return this.f91137Q.scheduled("merchandises", 0, new pcj() { // from class: l.gpa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f105447a.m31624g5(str);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public C22507a<Optional<RefundDetail>> m31595K4() {
        return this.f20040k0;
    }

    /* JADX INFO: renamed from: K5 */
    public C22421c<Optional<RefundDetail>> m31596K5() {
        return this.f91137Q.scheduled("refund_detail_of_svip", 0, new pcj() { // from class: l.voa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185018a.m31627j5();
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m31597L4() {
        return this.f20034e0.get().booleanValue();
    }

    /* JADX INFO: renamed from: L5 */
    public C22421c<uxj0> m31598L5(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("action", "select");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return this.f91137Q.scheduled("merchandises-promotions", -1, new pcj() { // from class: l.dqa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90190a.m31631n5(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public String m31599M4(String str) {
        if (jyb.m147481L(str)) {
            CrashHelper.m82479c(new Throwable("getTrackerFormItemId：itemId==null"));
            return "";
        }
        List<Merchandise> listM31592I5 = m31592I5(str);
        if (jyb.m147479J(listM31592I5)) {
            CrashHelper.m82479c(new Throwable("getTrackerFormItemId：merchandises==null itemId=" + str));
            return "";
        }
        Merchandise merchandise = listM31592I5.get(0);
        if (NullChecker.m82486a(merchandise.defaultStockKeepUnit) && str.equals(merchandise.defaultStockKeepUnit.f21249id)) {
            return merchandise.defaultStockKeepUnit.tracker;
        }
        CrashHelper.m82479c(new Throwable("getTrackerFormItemId：have merchandises but return null"));
        return "";
    }

    /* JADX INFO: renamed from: M5 */
    public void m31600M5(boolean z) {
        this.f20050u0.m137019l(Boolean.valueOf(z));
    }

    @UiThread
    /* JADX INFO: renamed from: N4 */
    public void m31601N4(final ProductCategory productCategory) {
        final GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
        gPContractQueryParams.platform = "googleplay";
        gPContractQueryParams.productType = productCategory;
        final String str = "/contracts/iap/query?platform=googleplay&productType=" + productCategory;
        scheduled("gpContracts/" + productCategory, 0, new pcj() { // from class: l.dra
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.bpa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32332n1(str)).m209038l(z1d0.create(Network.JSON, gPContractQueryParams.toJson())).m209028b();
                    }
                }, GPContractEnvelope.JSON_ADAPTER);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.era
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95457a.m31614W4(productCategory, (GPContractEnvelope) obj);
            }
        }, new y20() { // from class: l.fra
            @Override // p153l.y20
            public final void call(Object obj) {
                App.f16087d.m21432k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public C22421c<uxj0> m31602N5(String str, String str2, String str3, boolean z) {
        final RequestPromotion requestPromotion = new RequestPromotion();
        requestPromotion.action = str;
        requestPromotion.privilegeType = str2;
        if (TextUtils.equals(f20020w0, str)) {
            requestPromotion.selectedID = str3;
        }
        return this.f91137Q.scheduled("merchandises/promotions", -1, new pcj() { // from class: l.eqa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f95318a.m31635r5(requestPromotion);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public boolean m31603O4() {
        return !jyb.m147479J(m31582D5(ProductCategory.get(ProductCategory.Promo_premiumUpgradeToUltra)));
    }

    /* JADX INFO: renamed from: O5 */
    public C22421c<uxj0> m31604O5(final String str) {
        return this.f91137Q.scheduled("currency_code", -1, new pcj() { // from class: l.fqa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.rqa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32361u2()).m209038l(z1d0.create(Network.JSON, "{\"currencyCode\":\"" + str + "\"}")).m209028b();
                    }
                }).map(new qcj() { // from class: l.sqa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public boolean m31605P4() {
        return !(jyb.m147479J(m31582D5(ProductCategory.get(ProductCategory.tttVipUpgradeToPremium))) || jyb.m147479J(m31582D5(ProductCategory.get(ProductCategory.tttSeeUpgradeToPremium))) || jyb.m147479J(m31582D5(ProductCategory.get(ProductCategory.tttPremiumUpgradeToUltra)))) || m31603O4();
    }

    /* JADX INFO: renamed from: P5 */
    public C22421c<uxj0> m31606P5() {
        return this.f91137Q.scheduled("upload_premium_weekly_guide", 0, new pcj() { // from class: l.woa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190019a.m31637t5();
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m31607Q4() {
        return CoreModule.f18264c.f20396j0.m31577B4() || CoreModule.f18264c.f20396j0.m31575A4() || CoreModule.f18264c.f20396j0.m31646y4();
    }

    /* JADX INFO: renamed from: Q5 */
    public C22421c<uxj0> m31608Q5() {
        return this.f91137Q.scheduled("upload_tab_me_payGuide", -1, new pcj() { // from class: l.koa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f127707a.m31641v5();
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m31609R4() {
        return NullChecker.m82486a(CoreModule.f18264c.m32487o3()) && CoreModule.f18264c.m32487o3().likersLimit.remaining > 0;
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m31610S4(PurchaseType purchaseType) {
        if (wib0.m206579w(purchaseType) && CoreModule.f18264c.f20396j0.m31577B4()) {
            return true;
        }
        if (wib0.m206575s(purchaseType) && CoreModule.f18264c.f20396j0.m31575A4()) {
            return true;
        }
        return wib0.m206573q(purchaseType) && CoreModule.f18264c.f20396j0.m31646y4();
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m31611T4() {
        if (NullChecker.m82486a(m31579C4()) && m31638u4("premium")) {
            return "premium-promotion".equals(m31579C4().offerType);
        }
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ FreeTrialEnvelope m31612U4(FreeTrialEnvelope freeTrialEnvelope) {
        this.f20047r0 = freeTrialEnvelope.data;
        return freeTrialEnvelope;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ C22421c m31613V4() {
        return qi20.m176656c(new pcj() { // from class: l.spa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32181A1(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }, FreeTrialEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.tpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175578a.m31612U4((FreeTrialEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m31614W4(ProductCategory productCategory, GPContractEnvelope gPContractEnvelope) {
        if (gPContractEnvelope == null || gPContractEnvelope.data == null) {
            return;
        }
        if (TEnum.equals(productCategory, "svip")) {
            this.f20023T.m137019l(gPContractEnvelope.data.contracts);
        } else if (TEnum.equals(productCategory, "vip")) {
            this.f20022S.m137019l(gPContractEnvelope.data.contracts);
        } else if (TEnum.equals(productCategory, "seeWhoLikedMe")) {
            this.f20024U.m137019l(gPContractEnvelope.data.contracts);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m31615X4(ProductCategory productCategory, List list) {
        this.f20021R.put(productCategory, list);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m31616Y4(ProductCategory[] productCategoryArr) {
        for (final ProductCategory productCategory : productCategoryArr) {
            final List<Merchandise> listQuery = CoreModule.f18272k.f115543k.query(Merchandise.CATEGORY.m61360EQ(productCategory.toString()), Merchandise.QUANTITY.DESC, -1);
            if (!jyb.m147479J(listQuery)) {
                l51.m152887G(new Runnable() { // from class: l.uoa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f180027a.m31615X4(productCategory, listQuery);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ List m31617Z4(ProductCategory productCategory, List list) {
        list.size();
        Objects.toString(productCategory);
        Objects.toString(jyb.m147529r(list, new qcj() { // from class: l.xoa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty(((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.getProductId()));
            }
        }));
        if (jyb.m147529r(list, new qcj() { // from class: l.yoa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty(((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.getProductId()));
            }
        }) != null) {
            return jyb.m147507f0(new Merchandise[0]);
        }
        m31645x5(list, productCategory.toString(), "\tloadFromDB: ");
        return list;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m31618a5(List list) {
        if (!this.f20046q0 && list.isEmpty()) {
            m31594J5();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m31619b5(List list) {
        if (list.isEmpty()) {
            m31594J5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m31620c5(List list) {
        if (list.isEmpty()) {
            m31594J5();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Envelope m31621d5(Envelope envelope) {
        m31645x5(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, "all", "\tmerchandise from server : ");
        if (gta.m132210e().m132214d().mo34685F4()) {
            rsb.INSTANCE.m182949a(envelope);
        }
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.xpa
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115543k.deleteAll();
            }
        });
        tu2.m192703a("[core][merchandise]", " mergeNetworkStateIntoLocal complete ");
        return envelope;
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m31622e5(Throwable th) {
        tu2.m192703a("[core][merchandise]", " refreshMerchandises error " + th);
        m31643w5(ProductCategory.get(ProductCategory.tttVip), ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial));
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ uxj0 m31623f5(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        this.f20021R.put(ProductCategory.get(ProductCategory.tttVip), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.dpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
            }
        }));
        this.f20021R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.fpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
            }
        }));
        this.f20021R.put(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.hpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSvipGoogleplayFreeTrial));
            }
        }));
        this.f20021R.put(ProductCategory.get(ProductCategory.Promo_premiumUpgradeToUltra), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.ipa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.Promo_premiumUpgradeToUltra));
            }
        }));
        if (gta.m132210e().m132214d().mo34869k()) {
            this.f20021R.put(ProductCategory.get("svipPicksMembership"), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.jpa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                }
            }));
            this.f20021R.put(ProductCategory.get("picksMembership"), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.kpa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                }
            }));
        }
        PurchaseDialogConfigs purchaseDialogConfigs = coreData.purchaseDialogConfigs;
        if (NullChecker.m82486a(purchaseDialogConfigs)) {
            this.f20045p0.m137019l(purchaseDialogConfigs);
            if (NullChecker.m82486a(purchaseDialogConfigs.isShowCheckPopup)) {
                this.f20034e0.put(purchaseDialogConfigs.isShowCheckPopup);
            }
        }
        if (CoreModule.m30932N().mo61513Vo()) {
            this.f20021R.put(ProductCategory.get(ProductCategory.momentCoin), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.lpa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.momentCoin));
                }
            }));
        }
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            this.f20021R.put(ProductCategory.get(ProductCategory.tttUltraPremium), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.mpa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttUltraPremium));
                }
            }));
        }
        if (CoreModule.f18276o.m132214d().mo34727Na()) {
            this.f20021R.put(ProductCategory.get(ProductCategory.tttVipUpgradeToPremium), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.npa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVipUpgradeToPremium));
                }
            }));
            this.f20021R.put(ProductCategory.get(ProductCategory.tttSeeUpgradeToPremium), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.opa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeUpgradeToPremium));
                }
            }));
            this.f20021R.put(ProductCategory.get(ProductCategory.tttPremiumUpgradeToUltra), jyb.m147522n(coreData.merchandises, new qcj() { // from class: l.epa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttPremiumUpgradeToUltra));
                }
            }));
        }
        this.f20044o0.m137019l(coreData.merchandises);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ C22421c m31624g5(final String str) {
        return new ti20(new pcj() { // from class: l.poa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).filter(new qcj() { // from class: l.qoa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82488c(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).merchandises, "core_merchandises_refresh", CrashHelper.ReportLevel.p1));
            }
        }).map(new qcj() { // from class: l.roa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164167a.m31621d5((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.soa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169861a.m31622e5((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.toa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175373a.m31623f5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ x1d0 m31625h5() {
        return C4879a.f20236P.auth().m209043q(m32385V1()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ Optional m31626i5(Envelope envelope) {
        if (!NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).refundDetails) || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).refundDetails)) {
            this.f20039j0.m137019l(Optional.absent());
            this.f20040k0.m137019l(Optional.absent());
            return Optional.absent();
        }
        List<RefundDetail> list = ((CoreData) envelope.getModuleData(CoreData.class)).refundDetails;
        if (!gta.m132210e().m132214d().mo34922s3()) {
            Optional<RefundDetail> optionalM15467of = Optional.m15467of(list.get(0));
            this.f20039j0.m137019l(optionalM15467of);
            return optionalM15467of;
        }
        RefundDetail refundDetail = (RefundDetail) jyb.m147529r(list, new qcj() { // from class: l.zoa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RefundDetail) obj).f21233id, "oDiamond"));
            }
        });
        boolean zM82486a = NullChecker.m82486a(refundDetail);
        C22507a<Optional<RefundDetail>> c22507a = this.f20040k0;
        if (zM82486a) {
            c22507a.m137019l(Optional.m15467of(refundDetail));
        } else {
            c22507a.m137019l(Optional.absent());
        }
        RefundDetail refundDetail2 = (RefundDetail) jyb.m147529r(list, new qcj() { // from class: l.apa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RefundDetail) obj).f21233id, "svip"));
            }
        });
        Optional<RefundDetail> optionalM15467of2 = NullChecker.m82486a(refundDetail2) ? Optional.m15467of(refundDetail2) : Optional.absent();
        this.f20039j0.m137019l(optionalM15467of2);
        return optionalM15467of2;
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ C22421c m31627j5() {
        return qi20.m176654a(new pcj() { // from class: l.moa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137801a.m31625h5();
            }
        }).map(new qcj() { // from class: l.noa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142971a.m31626i5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ Envelope m31628k5(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34685F4()) {
            rsb.INSTANCE.m182951c(envelope);
        }
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.pqa
            @Override // p153l.x20
            public final void call() {
                CoreProduct.m31541g3();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m31629l5(Throwable th) {
        m31643w5(ProductCategory.get(ProductCategory.tttVip), ProductCategory.get(ProductCategory.tttSeeWhoLikedMe));
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ uxj0 m31630m5(Envelope envelope) {
        this.f20021R.put(ProductCategory.get(ProductCategory.tttVip), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.tqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
            }
        }));
        this.f20021R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.uqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
            }
        }));
        if (gta.m132210e().m132214d().mo34869k()) {
            this.f20021R.put(ProductCategory.get("svipPicksMembership"), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.vqa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                }
            }));
            this.f20021R.put(ProductCategory.get("picksMembership"), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.wqa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                }
            }));
        }
        if (CoreModule.m30932N().mo61513Vo()) {
            this.f20021R.put(ProductCategory.get(ProductCategory.momentCoin), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.xqa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.momentCoin));
                }
            }));
        }
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            this.f20021R.put(ProductCategory.get(ProductCategory.tttUltraPremium), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.zqa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttUltraPremium));
                }
            }));
        }
        this.f20044o0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).merchandises);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ C22421c m31631n5(final JSONObject jSONObject) {
        return new ti20(new pcj() { // from class: l.gqa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32185B1()).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.hqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111102a.m31628k5((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.iqa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116392a.m31629l5((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.jqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122191a.m31630m5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ Envelope m31632o5(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.qqa
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115543k.deleteAll();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m31633p5(Throwable th) {
        m31643w5(ProductCategory.get(ProductCategory.tttVip), ProductCategory.get(ProductCategory.tttSeeWhoLikedMe));
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ uxj0 m31634q5(Envelope envelope) {
        this.f20021R.put(ProductCategory.get(ProductCategory.tttVip), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.bra
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
            }
        }));
        this.f20021R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.cra
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
            }
        }));
        this.f20044o0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).merchandises);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ C22421c m31635r5(final RequestPromotion requestPromotion) {
        return new ti20(new pcj() { // from class: l.kqa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/users/me/merchandises/promotions")).m209037k(z1d0.create(Network.JSON, requestPromotion.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.lqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133162a.m31632o5((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.mqa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138028a.m31633p5((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.oqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148563a.m31634q5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ uxj0 m31636s5(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope) {
        PremiumWeeklyGuideData premiumWeeklyGuideData = premiumWeeklyGuideEnvelope.data;
        this.f20042m0.m137019l(Optional.m15467of(Boolean.valueOf(premiumWeeklyGuideData != null && premiumWeeklyGuideData.needGuide)));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ C22421c m31637t5() {
        return qi20.m176656c(new pcj() { // from class: l.upa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/checkPremiumWeeklyGuide")).m209032f().m209028b();
            }
        }, PremiumWeeklyGuideEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.vpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185224a.m31636s5((PremiumWeeklyGuideEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m31638u4(String str) {
        if (!NullChecker.m82486a(m31579C4()) || !TextUtils.equals(m31579C4().promotionType, str)) {
            return false;
        }
        long jM174454o = pzi0.m174454o() / 1000;
        return jM174454o >= m31579C4().startTime && jM174454o <= m31579C4().endTime;
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ uxj0 m31639u5(IntlTabMePayGuideEnvelope intlTabMePayGuideEnvelope) {
        boolean z = intlTabMePayGuideEnvelope.data.showBanner;
        vxd0 vxd0Var = this.f20043n0;
        if (z) {
            if (vxd0Var.get().intValue() == -1) {
                this.f20043n0.put(1);
            }
        } else if (vxd0Var.get().intValue() == 1) {
            this.f20043n0.put(-1);
        }
        this.f20041l0.m137019l(intlTabMePayGuideEnvelope.data);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v4 */
    public void m31640v4() {
        this.f20035f0 = false;
        Order order = new Order();
        order.orderStatus = BundleStatus.get(BundleStatus.assumedPurchased);
        uqb0.f180388T.m30588Z(order);
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ C22421c m31641v5() {
        return qi20.m176656c(new pcj() { // from class: l.nqa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32339p0()).m209032f().m209028b();
            }
        }, IntlTabMePayGuideEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.yqa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201160a.m31639u5((IntlTabMePayGuideEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public void m31642w4() {
        if (this.f20045p0.m222765i() && NullChecker.m82486a(this.f20045p0.m222761e().isShowCheckPopup)) {
            PurchaseDialogConfigs purchaseDialogConfigsM222761e = this.f20045p0.m222761e();
            boolean zBooleanValue = purchaseDialogConfigsM222761e.isShowCheckPopup.booleanValue();
            purchaseDialogConfigsM222761e.isShowCheckPopup = Boolean.valueOf(!zBooleanValue);
            this.f20045p0.m137019l(purchaseDialogConfigsM222761e);
            this.f20034e0.put(Boolean.valueOf(!zBooleanValue));
            return;
        }
        PurchaseDialogConfigs purchaseDialogConfigsNew_ = PurchaseDialogConfigs.new_();
        Boolean bool = Boolean.TRUE;
        purchaseDialogConfigsNew_.isShowCheckPopup = bool;
        this.f20045p0.m137019l(purchaseDialogConfigsNew_);
        this.f20034e0.put(bool);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m31643w5(final ProductCategory... productCategoryArr) {
        l51.m152919y(new Runnable() { // from class: l.loa
            @Override // java.lang.Runnable
            public final void run() {
                this.f132884a.m31616Y4(productCategoryArr);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public void m31644x4() {
        this.f20042m0.m137019l(Optional.m15467of(Boolean.FALSE));
    }

    /* JADX INFO: renamed from: x5 */
    public final void m31645x5(List<Merchandise> list, String str, String str2) {
        tu2.m192703a("[core][merchandise]", "category:" + str + "\tsize:" + list.size() + str2 + jyb.m147525o0(list, new qcj() { // from class: l.wpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreProduct.m31555n3((Merchandise) obj);
            }
        }, Constants.SEPARATOR_COMMA));
    }

    /* JADX INFO: renamed from: y4 */
    public boolean m31646y4() {
        if (!m31638u4("premium") && !m31638u4("premium_sale")) {
            return false;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (!NullChecker.m82486a(userM116600p9) || m31609R4() || userM116600p9.isVIP() || userM116600p9.isSVIP() || m31611T4()) ? false : true;
    }

    /* JADX INFO: renamed from: y5 */
    public C22421c<List<Merchandise>> m31647y5(ProductCategory productCategory) {
        return m31649z5(productCategory, true);
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m31648z4() {
        if (m31638u4("premium") && m31611T4()) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            return (!NullChecker.m82486a(userM116600p9) || m31609R4() || userM116600p9.isVIP() || userM116600p9.isSVIP()) ? false : true;
        }
        if (m31638u4("premium_sale")) {
            User userM116600p10 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p10) && !m31609R4() && !userM116600p10.isVIP() && !userM116600p10.isSVIP()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z5 */
    public C22421c<List<Merchandise>> m31649z5(final ProductCategory productCategory, boolean z) {
        return CoreModule.f18272k.f115543k.m187644G(productCategory, z).m208677m().map(new qcj() { // from class: l.rpa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164348a.m31617Z4(productCategory, (List) obj);
            }
        }).doOnNext(new y20() { // from class: l.cqa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83077a.m31618a5((List) obj);
            }
        });
    }
}
