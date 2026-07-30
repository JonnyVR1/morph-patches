package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.data.PaymentParamExtra;
import com.p046p1.mobile.putong.data.PaymentParamExtraLandingPageInfo;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class yf60 {

    /* JADX INFO: renamed from: a */
    public final PurchaseType f197988a;

    /* JADX INFO: renamed from: b */
    public String f197989b;

    /* JADX INFO: renamed from: c */
    public String f197990c;

    /* JADX INFO: renamed from: d */
    public String f197991d;

    /* JADX INFO: renamed from: e */
    public boolean f197992e;

    /* JADX INFO: renamed from: f */
    public boolean f197993f;

    /* JADX INFO: renamed from: g */
    public int f197994g;

    /* JADX INFO: renamed from: h */
    public String f197995h;

    /* JADX INFO: renamed from: i */
    public boolean f197996i;

    /* JADX INFO: renamed from: j */
    public String f197997j;

    /* JADX INFO: renamed from: k */
    public boolean f197998k;

    /* JADX INFO: renamed from: l */
    public String f197999l;

    /* JADX INFO: renamed from: m */
    public int f198000m;

    /* JADX INFO: renamed from: n */
    public String f198001n;

    public yf60(PurchaseType purchaseType) {
        this.f197988a = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public PurchasePaymentParam m214467a() {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        String str = this.f197990c;
        purchasePaymentParamNew_.itemId = str;
        purchasePaymentParamNew_.useAutoDeduct = this.f197992e;
        String strM30596M4 = this.f197995h;
        if (strM30596M4 == null) {
            strM30596M4 = CoreModule.f17545c.f19654j0.m30596M4(str);
        }
        purchasePaymentParamNew_.tracker = strM30596M4;
        purchasePaymentParamNew_.ext = m214469c();
        purchasePaymentParamNew_.couponId = this.f197997j;
        purchasePaymentParamNew_.orderId = this.f197991d;
        purchasePaymentParamNew_.quantity = this.f197994g;
        purchasePaymentParamNew_.jsBridge = this.f197993f;
        purchasePaymentParamNew_.useJDNew = true;
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: b */
    public SignPaymentParam m214468b() {
        SignPaymentParam signPaymentParamNew_ = SignPaymentParam.new_();
        String str = this.f197990c;
        signPaymentParamNew_.itemId = str;
        signPaymentParamNew_.useAutoDeduct = this.f197992e;
        String strM30596M4 = this.f197995h;
        if (strM30596M4 == null) {
            strM30596M4 = CoreModule.f17545c.f19654j0.m30596M4(str);
        }
        signPaymentParamNew_.tracker = strM30596M4;
        signPaymentParamNew_.ext = m214469c();
        signPaymentParamNew_.couponId = this.f197997j;
        signPaymentParamNew_.delayCharge = this.f197996i;
        signPaymentParamNew_.reSignAfterFail = this.f197998k;
        return signPaymentParamNew_;
    }

    /* JADX INFO: renamed from: c */
    public PaymentParamExtra m214469c() {
        PaymentParamExtra paymentParamExtraNew_ = PaymentParamExtra.new_();
        if (this.f198000m != 32) {
            PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfoNew_ = PaymentParamExtraLandingPageInfo.new_();
            ProductCategory productCategory = this.f197988a.productCategory();
            if ((TEnum.equals(productCategory, "quickchatMembership") || TEnum.equals(productCategory, "svip")) && TextUtils.isEmpty(this.f197989b)) {
                paymentParamExtraLandingPageInfoNew_.targetUserId = this.f197989b;
            }
            paymentParamExtraLandingPageInfoNew_.category = productCategory.name();
            paymentParamExtraLandingPageInfoNew_.enablePush = true;
            paymentParamExtraNew_.payLandPageInfo = paymentParamExtraLandingPageInfoNew_.toJson();
        }
        if (!TextUtils.isEmpty(this.f197999l)) {
            paymentParamExtraNew_.purchaseEnv = this.f197999l;
        }
        if (!TextUtils.isEmpty(this.f198001n)) {
            paymentParamExtraNew_.discountToken = this.f198001n;
        }
        return paymentParamExtraNew_;
    }

    /* JADX INFO: renamed from: d */
    public yf60 m214470d(int i) {
        this.f198000m = i;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public yf60 m214471e(String str) {
        this.f197997j = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public yf60 m214472f(boolean z) {
        this.f197996i = z;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public yf60 m214473g(String str) {
        this.f198001n = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public yf60 m214474h(String str) {
        this.f197990c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public yf60 m214475i(boolean z) {
        this.f197993f = z;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public yf60 m214476j(String str) {
        this.f197989b = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public yf60 m214477k(String str) {
        this.f197999l = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public yf60 m214478l(int i) {
        this.f197994g = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public yf60 m214479m(boolean z) {
        this.f197998k = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public yf60 m214480n(String str) {
        this.f197995h = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public yf60 m214481o(boolean z) {
        this.f197992e = z;
        return this;
    }
}
