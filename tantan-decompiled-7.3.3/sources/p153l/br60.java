package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotion;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class br60 {

    /* JADX INFO: renamed from: f */
    public static br60 f77982f;

    /* JADX INFO: renamed from: b */
    public long f77984b;

    /* JADX INFO: renamed from: d */
    public PendingPaymentGuidance f77986d;

    /* JADX INFO: renamed from: e */
    public Merchandise f77987e;

    /* JADX INFO: renamed from: a */
    public final wyd0 f77983a = new wyd0("last_identifier" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public final C22507a<pf60<PendingPaymentGuidance, Merchandise>> f77985c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m106053d(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static br60 m106057m() {
        if (f77982f == null) {
            synchronized (br60.class) {
                try {
                    if (f77982f == null) {
                        f77982f = new br60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f77982f;
    }

    /* JADX INFO: renamed from: A */
    public void m106058A() {
        CoreModule.f18264c.f20293A2.m119811d3().subscribe(psd0.m173597H(new y20() { // from class: l.xq60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195783a.m106081x((PendingPaymentGuidance) obj);
            }
        }, new y20() { // from class: l.yq60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201154a.m106082y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public void m106059B() {
        this.f77984b = ((pzi0.m174454o() / 1000) * 1000) + 1800000;
    }

    /* JADX INFO: renamed from: C */
    public boolean m106060C() {
        return NullChecker.m82486a(this.f77986d) && NullChecker.m82486a(this.f77987e) && this.f77986d.remainingTime > 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m106061D(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: E */
    public void m106062E(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, y20<Integer> y20Var) {
        if (TEnum.equals(payMethod, "wechat")) {
            if (!xl60.m211511p()) {
                lib0.INSTANCE.m154355g(str, merchandise.defaultStockKeepUnit.f21249id, "wx not install");
                return;
            }
        } else if (!xl60.m211506k()) {
            lib0.INSTANCE.m154349a(str, merchandise.defaultStockKeepUnit.f21249id, "alipay not install");
            return;
        }
        wn60 wn60Var = new wn60(purchaseType, act, str2, "");
        wn60Var.m207144C(str);
        if (m106079v(pendingPaymentGuidance.guideType) && NullChecker.m82486a(coupon)) {
            if (coupon.endTime - pzi0.m174454o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                wn60Var.m207167r(coupon.couponID);
            }
        }
        if (!m106079v(pendingPaymentGuidance.guideType)) {
            wn60Var.m207145D(false);
        }
        wn60Var.m207142A("pendingPaymentGuide");
        if (!TextUtils.isEmpty(pendingPaymentGuidance.discountToken)) {
            wn60Var.m207170u(pendingPaymentGuidance.discountToken);
        }
        if (TextUtils.equals(pendingPaymentGuidance.method, "create-order")) {
            wn60Var.m207164o(merchandise.defaultStockKeepUnit.f21249id, TEnum.equals(payMethod, "wechat"), y20Var);
            return;
        }
        if (TextUtils.equals(pendingPaymentGuidance.method, "sign")) {
            wn60Var.m207172w(true);
            wn60Var.m207150I(TEnum.equals(payMethod, "wechat"), merchandise.defaultStockKeepUnit.f21249id, y20Var);
        } else if (TextUtils.equals(pendingPaymentGuidance.method, "signAndPay")) {
            wn60Var.m207173x(true);
            wn60Var.m207150I(TEnum.equals(payMethod, "wechat"), merchandise.defaultStockKeepUnit.f21249id, y20Var);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m106063F(ner nerVar, final x20 x20Var) {
        nerVar.duringCreated((C22421c) CoreModule.f18264c.f20293A2.m119811d3().switchMap(new qcj() { // from class: l.uq60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180356a.m106068j((PendingPaymentGuidance) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.vq60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185335a.m106083z(x20Var, (pf60) obj);
            }
        }, new y20() { // from class: l.wq60
            @Override // p153l.y20
            public final void call(Object obj) {
                br60.m106053d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public void m106064G(long j) {
        this.f77984b = j;
    }

    /* JADX INFO: renamed from: H */
    public boolean m106065H(String str, PayMethod payMethod, PurchaseType purchaseType) {
        return CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3() && m106079v(str) && TEnum.equals(payMethod, "alipay") && purchaseType != PurchaseType.TYPE_O_DIAMOND;
    }

    /* JADX INFO: renamed from: h */
    public final void m106066h(pf60<PendingPaymentGuidance, Merchandise> pf60Var) {
        PendingPaymentGuidance pendingPaymentGuidance = pf60Var.f152156a;
        this.f77986d = pendingPaymentGuidance;
        Merchandise merchandise = pf60Var.f152157b;
        this.f77987e = merchandise;
        this.f77985c.m137019l(pf60.m172085a(pendingPaymentGuidance, merchandise));
    }

    /* JADX INFO: renamed from: i */
    public final void m106067i(PendingPaymentGuidance pendingPaymentGuidance) {
        List<MonetizationPromotion> listM197858y3 = CoreModule.f18264c.f20376c1.m197858y3();
        if (TextUtils.isEmpty(pendingPaymentGuidance.discountToken) || jyb.m147479J(listM197858y3) || TextUtils.equals(this.f77983a.get(), pendingPaymentGuidance.discountToken)) {
            return;
        }
        CoreModule.f18264c.f20376c1.m197851N3();
        this.f77983a.put(pendingPaymentGuidance.discountToken);
    }

    /* JADX INFO: renamed from: j */
    public final C22421c<pf60<PendingPaymentGuidance, Merchandise>> m106068j(final PendingPaymentGuidance pendingPaymentGuidance) {
        if (!NullChecker.m82486a(pendingPaymentGuidance)) {
            return C22421c.just(pf60.m172085a(null, null));
        }
        m106067i(pendingPaymentGuidance);
        return CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(pendingPaymentGuidance.productType)).take(1).map(new qcj() { // from class: l.zq60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205570a.m106080w(pendingPaymentGuidance, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public CharSequence m106069k(Merchandise merchandise, PurchaseType purchaseType, String str) {
        if (TextUtils.equals(str, "contractSuccessPayFailManyTimes")) {
            return bn60.m105354m(purchaseType, true);
        }
        if (wib0.m206565i(purchaseType) && merchandise.autoRenewable()) {
            return bn60.m105318A(merchandise, bn60.m105334Q(true));
        }
        if (wib0.m206573q(purchaseType) && merchandise.autoRenewable()) {
            return bn60.m105324G(purchaseType, true);
        }
        return (wib0.m206579w(purchaseType) && merchandise.autoRenewable()) ? bn60.m105324G(purchaseType, true) : bn60.m105354m(purchaseType, true);
    }

    /* JADX INFO: renamed from: l */
    public pf60<Boolean, String> m106070l(long j) {
        long jM174454o = j - pzi0.m174454o();
        if (jM174454o <= 0) {
            return new pf60<>(Boolean.FALSE, "00:00");
        }
        if (jM174454o > 86400000) {
            return new pf60<>(Boolean.FALSE, ((int) (jM174454o / 86400000)) + "天");
        }
        if (jM174454o > 3600000) {
            return new pf60<>(Boolean.FALSE, ((int) (jM174454o / 3600000)) + "时");
        }
        int i = (int) (jM174454o / Constants.ONE_MIN_IN_MILLIS);
        int i2 = (int) ((jM174454o % Constants.ONE_MIN_IN_MILLIS) / 1000);
        return new pf60<>(Boolean.TRUE, m106061D(i) + ":" + m106061D(i2));
    }

    /* JADX INFO: renamed from: n */
    public String m106071n(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            return CoreModule.m30933P().m143405a().mo34450Y3();
        }
        if (TEnum.equals(productCategory, "svip")) {
            return CoreModule.m30933P().m143405a().mo34342Ie();
        }
        return TEnum.equals(productCategory, "oDiamond") ? CoreModule.m30933P().m143405a().mo34318F0() : CoreModule.m30933P().m143405a().mo34450Y3();
    }

    /* JADX INFO: renamed from: o */
    public Merchandise m106072o() {
        return this.f77987e;
    }

    /* JADX INFO: renamed from: p */
    public long m106073p() {
        return this.f77984b;
    }

    /* JADX INFO: renamed from: q */
    public PendingPaymentGuidance m106074q() {
        return this.f77986d;
    }

    /* JADX INFO: renamed from: r */
    public List<PayMethod> m106075r(String str, Merchandise merchandise, String str2) {
        ArrayList arrayList = new ArrayList();
        if (m106079v(str)) {
            return tab0.m189811h().m189833x(merchandise);
        }
        arrayList.add(PayMethod.get(str2));
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public String m106076s(String str) {
        if (m106079v(str)) {
            return "payment_pending";
        }
        return TextUtils.equals(str, "contractSuccessPayFail") ? "payment_balance" : "payment_coupon";
    }

    /* JADX INFO: renamed from: t */
    public String m106077t(String str, boolean z) {
        if (m106079v(str)) {
            return z ? "p_chat,assistant_buybutton_pending" : "p_navigation,privilege_button_pending";
        }
        if (TextUtils.equals(str, "contractSuccessPayFail")) {
            return z ? "p_chat,assistant_buybutton_balance" : "p_navigation,privilege_button_balance";
        }
        return z ? "p_chat,assistant_buybutton_coupon" : "p_navigation,privilege_button_coupon";
    }

    /* JADX INFO: renamed from: u */
    public boolean m106078u(Merchandise merchandise, String str) {
        return merchandise.autoRenewable() && pta.m173725r() && !TextUtils.equals(str, "contractSuccessPayFailManyTimes");
    }

    /* JADX INFO: renamed from: v */
    public boolean m106079v(String str) {
        return TextUtils.equals(str, "pendingOrder") || TextUtils.equals(str, "pendingContract") || TextUtils.equals(str, "pendingContractAndPay");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ pf60 m106080w(final PendingPaymentGuidance pendingPaymentGuidance, List list) {
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.ar60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Merchandise) obj).defaultStockKeepUnit.f21249id, pendingPaymentGuidance.itemId));
            }
        });
        this.f77987e = merchandise;
        return pf60.m172085a(pendingPaymentGuidance, merchandise);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m106081x(PendingPaymentGuidance pendingPaymentGuidance) {
        if (!NullChecker.m82486a(pendingPaymentGuidance)) {
            m106059B();
        } else {
            m106064G(pendingPaymentGuidance.endTime);
            m106067i(pendingPaymentGuidance);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m106082y(Throwable th) {
        m106059B();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m106083z(x20 x20Var, pf60 pf60Var) {
        m106066h(pf60Var);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }
}
