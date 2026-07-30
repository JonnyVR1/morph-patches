package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotion;
import com.p046p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class wi60 {

    /* JADX INFO: renamed from: f */
    public static wi60 f186504f;

    /* JADX INFO: renamed from: b */
    public long f186506b;

    /* JADX INFO: renamed from: d */
    public PendingPaymentGuidance f186508d;

    /* JADX INFO: renamed from: e */
    public Merchandise f186509e;

    /* JADX INFO: renamed from: a */
    public final uqd0 f186505a = new uqd0("last_identifier" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public final C22392a<j760<PendingPaymentGuidance, Merchandise>> f186507c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m203287d(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static wi60 m203291m() {
        if (f186504f == null) {
            synchronized (wi60.class) {
                try {
                    if (f186504f == null) {
                        f186504f = new wi60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186504f;
    }

    /* JADX INFO: renamed from: A */
    public void m203292A() {
        CoreModule.f17545c.f19551A2.m182445d3().subscribe(mkd0.m154956H(new e30() { // from class: l.si60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164686a.m203315x((PendingPaymentGuidance) obj);
            }
        }, new e30() { // from class: l.ti60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170533a.m203316y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public void m203293B() {
        this.f186506b = ((mqi0.m155944o() / 1000) * 1000) + 1800000;
    }

    /* JADX INFO: renamed from: C */
    public boolean m203294C() {
        return NullChecker.m81303a(this.f186508d) && NullChecker.m81303a(this.f186509e) && this.f186508d.remainingTime > 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m203295D(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: E */
    public void m203296E(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, e30<Integer> e30Var) {
        if (TEnum.equals(payMethod, "wechat")) {
            if (!sd60.m183465p()) {
                hab0.INSTANCE.m130133g(str, merchandise.defaultStockKeepUnit.f20507id, "wx not install");
                return;
            }
        } else if (!sd60.m183460k()) {
            hab0.INSTANCE.m130127a(str, merchandise.defaultStockKeepUnit.f20507id, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(purchaseType, act, str2, "");
        rf60Var.m179078C(str);
        if (m203313v(pendingPaymentGuidance.guideType) && NullChecker.m81303a(coupon)) {
            if (coupon.endTime - mqi0.m155944o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                rf60Var.m179101r(coupon.couponID);
            }
        }
        if (!m203313v(pendingPaymentGuidance.guideType)) {
            rf60Var.m179079D(false);
        }
        rf60Var.m179076A("pendingPaymentGuide");
        if (!TextUtils.isEmpty(pendingPaymentGuidance.discountToken)) {
            rf60Var.m179104u(pendingPaymentGuidance.discountToken);
        }
        if (TextUtils.equals(pendingPaymentGuidance.method, "create-order")) {
            rf60Var.m179098o(merchandise.defaultStockKeepUnit.f20507id, TEnum.equals(payMethod, "wechat"), e30Var);
            return;
        }
        if (TextUtils.equals(pendingPaymentGuidance.method, "sign")) {
            rf60Var.m179106w(true);
            rf60Var.m179084I(TEnum.equals(payMethod, "wechat"), merchandise.defaultStockKeepUnit.f20507id, e30Var);
        } else if (TextUtils.equals(pendingPaymentGuidance.method, "signAndPay")) {
            rf60Var.m179107x(true);
            rf60Var.m179084I(TEnum.equals(payMethod, "wechat"), merchandise.defaultStockKeepUnit.f20507id, e30Var);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m203297F(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated((C22306c) CoreModule.f17545c.f19551A2.m182445d3().switchMap(new w9j() { // from class: l.pi60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149127a.m203302j((PendingPaymentGuidance) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.qi60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154670a.m203317z(d30Var, (j760) obj);
            }
        }, new e30() { // from class: l.ri60
            @Override // p149l.e30
            public final void call(Object obj) {
                wi60.m203287d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public void m203298G(long j) {
        this.f186506b = j;
    }

    /* JADX INFO: renamed from: H */
    public boolean m203299H(String str, PayMethod payMethod, PurchaseType purchaseType) {
        return CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3() && m203313v(str) && TEnum.equals(payMethod, "alipay") && purchaseType != PurchaseType.TYPE_O_DIAMOND;
    }

    /* JADX INFO: renamed from: h */
    public final void m203300h(j760<PendingPaymentGuidance, Merchandise> j760Var) {
        PendingPaymentGuidance pendingPaymentGuidance = j760Var.f116564a;
        this.f186508d = pendingPaymentGuidance;
        Merchandise merchandise = j760Var.f116565b;
        this.f186509e = merchandise;
        this.f186507c.m132487l(j760.m140076a(pendingPaymentGuidance, merchandise));
    }

    /* JADX INFO: renamed from: i */
    public final void m203301i(PendingPaymentGuidance pendingPaymentGuidance) {
        List<MonetizationPromotion> listM137871y3 = CoreModule.f17545c.f19634c1.m137871y3();
        if (TextUtils.isEmpty(pendingPaymentGuidance.discountToken) || vwb.m200296J(listM137871y3) || TextUtils.equals(this.f186505a.get(), pendingPaymentGuidance.discountToken)) {
            return;
        }
        CoreModule.f17545c.f19634c1.m137864N3();
        this.f186505a.put(pendingPaymentGuidance.discountToken);
    }

    /* JADX INFO: renamed from: j */
    public final C22306c<j760<PendingPaymentGuidance, Merchandise>> m203302j(final PendingPaymentGuidance pendingPaymentGuidance) {
        if (!NullChecker.m81303a(pendingPaymentGuidance)) {
            return C22306c.just(j760.m140076a(null, null));
        }
        m203301i(pendingPaymentGuidance);
        return CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(pendingPaymentGuidance.productType)).take(1).map(new w9j() { // from class: l.ui60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176632a.m203314w(pendingPaymentGuidance, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public CharSequence m203303k(Merchandise merchandise, PurchaseType purchaseType, String str) {
        if (TextUtils.equals(str, "contractSuccessPayFailManyTimes")) {
            return we60.m202872m(purchaseType, true);
        }
        if (sab0.m182891i(purchaseType) && merchandise.autoRenewable()) {
            return we60.m202836A(merchandise, we60.m202852Q(true));
        }
        if (sab0.m182899q(purchaseType) && merchandise.autoRenewable()) {
            return we60.m202842G(purchaseType, true);
        }
        return (sab0.m182905w(purchaseType) && merchandise.autoRenewable()) ? we60.m202842G(purchaseType, true) : we60.m202872m(purchaseType, true);
    }

    /* JADX INFO: renamed from: l */
    public j760<Boolean, String> m203304l(long j) {
        long jM155944o = j - mqi0.m155944o();
        if (jM155944o <= 0) {
            return new j760<>(Boolean.FALSE, "00:00");
        }
        if (jM155944o > 86400000) {
            return new j760<>(Boolean.FALSE, ((int) (jM155944o / 86400000)) + "天");
        }
        if (jM155944o > 3600000) {
            return new j760<>(Boolean.FALSE, ((int) (jM155944o / 3600000)) + "时");
        }
        int i = (int) (jM155944o / Constants.ONE_MIN_IN_MILLIS);
        int i2 = (int) ((jM155944o % Constants.ONE_MIN_IN_MILLIS) / 1000);
        return new j760<>(Boolean.TRUE, m203295D(i) + ":" + m203295D(i2));
    }

    /* JADX INFO: renamed from: n */
    public String m203305n(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            return CoreModule.m29935P().m94651a().mo33447Y3();
        }
        if (TEnum.equals(productCategory, "svip")) {
            return CoreModule.m29935P().m94651a().mo33339Ie();
        }
        return TEnum.equals(productCategory, "oDiamond") ? CoreModule.m29935P().m94651a().mo33315F0() : CoreModule.m29935P().m94651a().mo33447Y3();
    }

    /* JADX INFO: renamed from: o */
    public Merchandise m203306o() {
        return this.f186509e;
    }

    /* JADX INFO: renamed from: p */
    public long m203307p() {
        return this.f186506b;
    }

    /* JADX INFO: renamed from: q */
    public PendingPaymentGuidance m203308q() {
        return this.f186508d;
    }

    /* JADX INFO: renamed from: r */
    public List<PayMethod> m203309r(String str, Merchandise merchandise, String str2) {
        ArrayList arrayList = new ArrayList();
        if (m203313v(str)) {
            return p2b0.m167133h().m167155x(merchandise);
        }
        arrayList.add(PayMethod.get(str2));
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public String m203310s(String str) {
        if (m203313v(str)) {
            return "payment_pending";
        }
        return TextUtils.equals(str, "contractSuccessPayFail") ? "payment_balance" : "payment_coupon";
    }

    /* JADX INFO: renamed from: t */
    public String m203311t(String str, boolean z) {
        if (m203313v(str)) {
            return z ? "p_chat,assistant_buybutton_pending" : "p_navigation,privilege_button_pending";
        }
        if (TextUtils.equals(str, "contractSuccessPayFail")) {
            return z ? "p_chat,assistant_buybutton_balance" : "p_navigation,privilege_button_balance";
        }
        return z ? "p_chat,assistant_buybutton_coupon" : "p_navigation,privilege_button_coupon";
    }

    /* JADX INFO: renamed from: u */
    public boolean m203312u(Merchandise merchandise, String str) {
        return merchandise.autoRenewable() && dsa.m113445r() && !TextUtils.equals(str, "contractSuccessPayFailManyTimes");
    }

    /* JADX INFO: renamed from: v */
    public boolean m203313v(String str) {
        return TextUtils.equals(str, "pendingOrder") || TextUtils.equals(str, "pendingContract") || TextUtils.equals(str, "pendingContractAndPay");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ j760 m203314w(final PendingPaymentGuidance pendingPaymentGuidance, List list) {
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.vi60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Merchandise) obj).defaultStockKeepUnit.f20507id, pendingPaymentGuidance.itemId));
            }
        });
        this.f186509e = merchandise;
        return j760.m140076a(pendingPaymentGuidance, merchandise);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m203315x(PendingPaymentGuidance pendingPaymentGuidance) {
        if (!NullChecker.m81303a(pendingPaymentGuidance)) {
            m203293B();
        } else {
            m203298G(pendingPaymentGuidance.endTime);
            m203301i(pendingPaymentGuidance);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m203316y(Throwable th) {
        m203293B();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m203317z(d30 d30Var, j760 j760Var) {
        m203300h(j760Var);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }
}
