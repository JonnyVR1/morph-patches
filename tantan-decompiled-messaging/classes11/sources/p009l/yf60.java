package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PaymentParamExtra;
import com.p1.mobile.putong.data.PaymentParamExtraLandingPageInfo;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yf60 {

    /* JADX INFO: renamed from: a */
    public final PurchaseType f23033a;

    /* JADX INFO: renamed from: b */
    public String f23034b;

    /* JADX INFO: renamed from: c */
    public String f23035c;

    /* JADX INFO: renamed from: d */
    public String f23036d;

    /* JADX INFO: renamed from: e */
    public boolean f23037e;

    /* JADX INFO: renamed from: f */
    public boolean f23038f;

    /* JADX INFO: renamed from: g */
    public int f23039g;

    /* JADX INFO: renamed from: h */
    public String f23040h;

    /* JADX INFO: renamed from: i */
    public boolean f23041i;

    /* JADX INFO: renamed from: j */
    public String f23042j;

    /* JADX INFO: renamed from: k */
    public boolean f23043k;

    /* JADX INFO: renamed from: l */
    public String f23044l;

    /* JADX INFO: renamed from: m */
    public int f23045m;

    /* JADX INFO: renamed from: n */
    public String f23046n;

    public yf60(PurchaseType purchaseType) {
        this.f23033a = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public PurchasePaymentParam m25334a() {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        String str = this.f23035c;
        ((PaymentParam) purchasePaymentParamNew_).itemId = str;
        ((PaymentParam) purchasePaymentParamNew_).useAutoDeduct = this.f23037e;
        String strM4 = this.f23040h;
        if (strM4 == null) {
            strM4 = CoreModule.c.j0.M4(str);
        }
        ((PaymentParam) purchasePaymentParamNew_).tracker = strM4;
        ((PaymentParam) purchasePaymentParamNew_).ext = m25336c();
        ((PaymentParam) purchasePaymentParamNew_).couponId = this.f23042j;
        purchasePaymentParamNew_.orderId = this.f23036d;
        purchasePaymentParamNew_.quantity = this.f23039g;
        purchasePaymentParamNew_.jsBridge = this.f23038f;
        ((PaymentParam) purchasePaymentParamNew_).useJDNew = true;
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: b */
    public SignPaymentParam m25335b() {
        SignPaymentParam signPaymentParamNew_ = SignPaymentParam.new_();
        String str = this.f23035c;
        ((PaymentParam) signPaymentParamNew_).itemId = str;
        ((PaymentParam) signPaymentParamNew_).useAutoDeduct = this.f23037e;
        String strM4 = this.f23040h;
        if (strM4 == null) {
            strM4 = CoreModule.c.j0.M4(str);
        }
        ((PaymentParam) signPaymentParamNew_).tracker = strM4;
        ((PaymentParam) signPaymentParamNew_).ext = m25336c();
        ((PaymentParam) signPaymentParamNew_).couponId = this.f23042j;
        signPaymentParamNew_.delayCharge = this.f23041i;
        signPaymentParamNew_.reSignAfterFail = this.f23043k;
        return signPaymentParamNew_;
    }

    /* JADX INFO: renamed from: c */
    public PaymentParamExtra m25336c() {
        PaymentParamExtra paymentParamExtraNew_ = PaymentParamExtra.new_();
        if (this.f23045m != 32) {
            PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfoNew_ = PaymentParamExtraLandingPageInfo.new_();
            ProductCategory productCategory = this.f23033a.productCategory();
            if ((TEnum.equals(productCategory, "quickchatMembership") || TEnum.equals(productCategory, "svip")) && TextUtils.isEmpty(this.f23034b)) {
                paymentParamExtraLandingPageInfoNew_.targetUserId = this.f23034b;
            }
            paymentParamExtraLandingPageInfoNew_.category = productCategory.name();
            paymentParamExtraLandingPageInfoNew_.enablePush = true;
            paymentParamExtraNew_.payLandPageInfo = paymentParamExtraLandingPageInfoNew_.toJson();
        }
        if (!TextUtils.isEmpty(this.f23044l)) {
            paymentParamExtraNew_.purchaseEnv = this.f23044l;
        }
        if (!TextUtils.isEmpty(this.f23046n)) {
            paymentParamExtraNew_.discountToken = this.f23046n;
        }
        return paymentParamExtraNew_;
    }

    /* JADX INFO: renamed from: d */
    public yf60 m25337d(int i) {
        this.f23045m = i;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public yf60 m25338e(String str) {
        this.f23042j = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public yf60 m25339f(boolean z) {
        this.f23041i = z;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public yf60 m25340g(String str) {
        this.f23046n = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public yf60 m25341h(String str) {
        this.f23035c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public yf60 m25342i(boolean z) {
        this.f23038f = z;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public yf60 m25343j(String str) {
        this.f23034b = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public yf60 m25344k(String str) {
        this.f23044l = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public yf60 m25345l(int i) {
        this.f23039g = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public yf60 m25346m(boolean z) {
        this.f23043k = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public yf60 m25347n(String str) {
        this.f23040h = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public yf60 m25348o(boolean z) {
        this.f23037e = z;
        return this;
    }
}
