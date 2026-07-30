package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MonetizationPromotion;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.p2b0;
import l.rf60;
import l.sab0;
import l.sd60;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.we60;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wi60 {

    /* JADX INFO: renamed from: f */
    public static wi60 f25160f;

    /* JADX INFO: renamed from: b */
    public long f25162b;

    /* JADX INFO: renamed from: d */
    public PendingPaymentGuidance f25164d;

    /* JADX INFO: renamed from: e */
    public Merchandise f25165e;

    /* JADX INFO: renamed from: a */
    public final uqd0 f25161a = new uqd0("last_identifier" + CoreModule.m1850H().userId(), "");

    /* JADX INFO: renamed from: c */
    public final a<j760<PendingPaymentGuidance, Merchandise>> f25163c = a.b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m26382d(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static wi60 m26386m() {
        if (f25160f == null) {
            synchronized (wi60.class) {
                try {
                    if (f25160f == null) {
                        f25160f = new wi60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25160f;
    }

    /* JADX INFO: renamed from: A */
    public void m26387A() {
        CoreModule.f1534c.f3540A2.m23518d3().subscribe(mkd0.H(new e30() { // from class: l.si60
            public final void call(Object obj) {
                this.f21324a.m26410x((PendingPaymentGuidance) obj);
            }
        }, new e30() { // from class: l.ti60
            public final void call(Object obj) {
                this.f22126a.m26411y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public void m26388B() {
        this.f25162b = ((mqi0.o() / 1000) * 1000) + 1800000;
    }

    /* JADX INFO: renamed from: C */
    public boolean m26389C() {
        return NullChecker.a(this.f25164d) && NullChecker.a(this.f25165e) && this.f25164d.remainingTime > 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m26390D(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: E */
    public void m26391E(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, e30<Integer> e30Var) {
        if (TEnum.equals(payMethod, "wechat")) {
            if (!sd60.p()) {
                hab0.INSTANCE.m16140g(str, merchandise.defaultStockKeepUnit.id, "wx not install");
                return;
            }
        } else if (!sd60.k()) {
            hab0.INSTANCE.m16134a(str, merchandise.defaultStockKeepUnit.id, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(purchaseType, act, str2, "");
        rf60Var.C(str);
        if (m26408v(pendingPaymentGuidance.guideType) && NullChecker.a(coupon)) {
            if (coupon.endTime - mqi0.o() > 0.0d) {
                rf60Var.r(coupon.couponID);
            }
        }
        if (!m26408v(pendingPaymentGuidance.guideType)) {
            rf60Var.D(false);
        }
        rf60Var.A("pendingPaymentGuide");
        if (!TextUtils.isEmpty(pendingPaymentGuidance.discountToken)) {
            rf60Var.u(pendingPaymentGuidance.discountToken);
        }
        if (TextUtils.equals(pendingPaymentGuidance.method, "create-order")) {
            rf60Var.o(merchandise.defaultStockKeepUnit.id, TEnum.equals(payMethod, "wechat"), e30Var);
            return;
        }
        if (TextUtils.equals(pendingPaymentGuidance.method, "sign")) {
            rf60Var.w(true);
            rf60Var.I(TEnum.equals(payMethod, "wechat"), merchandise.defaultStockKeepUnit.id, e30Var);
        } else if (TextUtils.equals(pendingPaymentGuidance.method, "signAndPay")) {
            rf60Var.x(true);
            rf60Var.I(TEnum.equals(payMethod, "wechat"), merchandise.defaultStockKeepUnit.id, e30Var);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m26392F(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.f1534c.f3540A2.m23518d3().switchMap(new w9j() { // from class: l.pi60
            public final Object call(Object obj) {
                return this.f18741a.m26397j((PendingPaymentGuidance) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.qi60
            public final void call(Object obj) {
                this.f19767a.m26412z(d30Var, (j760) obj);
            }
        }, new e30() { // from class: l.ri60
            public final void call(Object obj) {
                wi60.m26382d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public void m26393G(long j) {
        this.f25162b = j;
    }

    /* JADX INFO: renamed from: H */
    public boolean m26394H(String str, PayMethod payMethod, PurchaseType purchaseType) {
        return CoreModule.m1854P().m11706a().m5362U() && CoreModule.f1534c.f3580O0.m2007n3() && m26408v(str) && TEnum.equals(payMethod, "alipay") && purchaseType != PurchaseType.TYPE_O_DIAMOND;
    }

    /* JADX INFO: renamed from: h */
    public final void m26395h(j760<PendingPaymentGuidance, Merchandise> j760Var) {
        PendingPaymentGuidance pendingPaymentGuidance = (PendingPaymentGuidance) j760Var.a;
        this.f25164d = pendingPaymentGuidance;
        Merchandise merchandise = (Merchandise) j760Var.b;
        this.f25165e = merchandise;
        this.f25163c.onNext(j760.a(pendingPaymentGuidance, merchandise));
    }

    /* JADX INFO: renamed from: i */
    public final void m26396i(PendingPaymentGuidance pendingPaymentGuidance) {
        List<MonetizationPromotion> listM16948y3 = CoreModule.f1534c.f3623c1.m16948y3();
        if (TextUtils.isEmpty(pendingPaymentGuidance.discountToken) || vwb.J(listM16948y3) || TextUtils.equals((CharSequence) this.f25161a.get(), pendingPaymentGuidance.discountToken)) {
            return;
        }
        CoreModule.f1534c.f3623c1.m16941N3();
        this.f25161a.put(pendingPaymentGuidance.discountToken);
    }

    /* JADX INFO: renamed from: j */
    public final c<j760<PendingPaymentGuidance, Merchandise>> m26397j(final PendingPaymentGuidance pendingPaymentGuidance) {
        if (!NullChecker.a(pendingPaymentGuidance)) {
            return c.just(j760.a((Object) null, (Object) null));
        }
        m26396i(pendingPaymentGuidance);
        return CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get(pendingPaymentGuidance.productType)).take(1).map(new w9j() { // from class: l.ui60
            public final Object call(Object obj) {
                return this.f23552a.m26409w(pendingPaymentGuidance, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public CharSequence m26398k(Merchandise merchandise, PurchaseType purchaseType, String str) {
        if (TextUtils.equals(str, "contractSuccessPayFailManyTimes")) {
            return we60.m(purchaseType, true);
        }
        if (sab0.i(purchaseType) && merchandise.autoRenewable()) {
            return we60.A(merchandise, we60.Q(true));
        }
        if (sab0.q(purchaseType) && merchandise.autoRenewable()) {
            return we60.G(purchaseType, true);
        }
        return (sab0.w(purchaseType) && merchandise.autoRenewable()) ? we60.G(purchaseType, true) : we60.m(purchaseType, true);
    }

    /* JADX INFO: renamed from: l */
    public j760<Boolean, String> m26399l(long j) {
        long jO = j - mqi0.o();
        if (jO <= 0) {
            return new j760<>(Boolean.FALSE, "00:00");
        }
        if (jO > 86400000) {
            return new j760<>(Boolean.FALSE, ((int) (jO / 86400000)) + "天");
        }
        if (jO > 3600000) {
            return new j760<>(Boolean.FALSE, ((int) (jO / 3600000)) + "时");
        }
        return new j760<>(Boolean.TRUE, m26390D((int) (jO / 60000)) + ":" + m26390D((int) ((jO % 60000) / 1000)));
    }

    /* JADX INFO: renamed from: n */
    public String m26400n(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, "tttVip")) {
            return CoreModule.m1854P().m11706a().m5384Y3();
        }
        if (TEnum.equals(productCategory, "svip")) {
            return CoreModule.m1854P().m11706a().m5276Ie();
        }
        return TEnum.equals(productCategory, "oDiamond") ? CoreModule.m1854P().m11706a().m5252F0() : CoreModule.m1854P().m11706a().m5384Y3();
    }

    /* JADX INFO: renamed from: o */
    public Merchandise m26401o() {
        return this.f25165e;
    }

    /* JADX INFO: renamed from: p */
    public long m26402p() {
        return this.f25162b;
    }

    /* JADX INFO: renamed from: q */
    public PendingPaymentGuidance m26403q() {
        return this.f25164d;
    }

    /* JADX INFO: renamed from: r */
    public List<PayMethod> m26404r(String str, Merchandise merchandise, String str2) {
        ArrayList arrayList = new ArrayList();
        if (m26408v(str)) {
            return p2b0.h().x(merchandise);
        }
        arrayList.add(PayMethod.get(str2));
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public String m26405s(String str) {
        if (m26408v(str)) {
            return "payment_pending";
        }
        return TextUtils.equals(str, "contractSuccessPayFail") ? "payment_balance" : "payment_coupon";
    }

    /* JADX INFO: renamed from: t */
    public String m26406t(String str, boolean z) {
        if (m26408v(str)) {
            return z ? "p_chat,assistant_buybutton_pending" : "p_navigation,privilege_button_pending";
        }
        if (TextUtils.equals(str, "contractSuccessPayFail")) {
            return z ? "p_chat,assistant_buybutton_balance" : "p_navigation,privilege_button_balance";
        }
        return z ? "p_chat,assistant_buybutton_coupon" : "p_navigation,privilege_button_coupon";
    }

    /* JADX INFO: renamed from: u */
    public boolean m26407u(Merchandise merchandise, String str) {
        return merchandise.autoRenewable() && dsa.m14210r() && !TextUtils.equals(str, "contractSuccessPayFailManyTimes");
    }

    /* JADX INFO: renamed from: v */
    public boolean m26408v(String str) {
        return TextUtils.equals(str, "pendingOrder") || TextUtils.equals(str, "pendingContract") || TextUtils.equals(str, "pendingContractAndPay");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ j760 m26409w(final PendingPaymentGuidance pendingPaymentGuidance, List list) {
        Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.vi60
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Merchandise) obj).defaultStockKeepUnit.id, pendingPaymentGuidance.itemId));
            }
        });
        this.f25165e = merchandise;
        return j760.a(pendingPaymentGuidance, merchandise);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m26410x(PendingPaymentGuidance pendingPaymentGuidance) {
        if (!NullChecker.a(pendingPaymentGuidance)) {
            m26388B();
        } else {
            m26393G(pendingPaymentGuidance.endTime);
            m26396i(pendingPaymentGuidance);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m26411y(Throwable th) {
        m26388B();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m26412z(d30 d30Var, j760 j760Var) {
        m26395h(j760Var);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }
}
