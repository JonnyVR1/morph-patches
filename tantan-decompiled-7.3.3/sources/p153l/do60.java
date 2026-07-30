package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.data.PaymentParamExtra;
import com.p051p1.mobile.putong.data.PaymentParamExtraLandingPageInfo;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class do60 {

    /* JADX INFO: renamed from: a */
    public final PurchaseType f89881a;

    /* JADX INFO: renamed from: b */
    public String f89882b;

    /* JADX INFO: renamed from: c */
    public String f89883c;

    /* JADX INFO: renamed from: d */
    public String f89884d;

    /* JADX INFO: renamed from: e */
    public boolean f89885e;

    /* JADX INFO: renamed from: f */
    public boolean f89886f;

    /* JADX INFO: renamed from: g */
    public int f89887g;

    /* JADX INFO: renamed from: h */
    public String f89888h;

    /* JADX INFO: renamed from: i */
    public boolean f89889i;

    /* JADX INFO: renamed from: j */
    public String f89890j;

    /* JADX INFO: renamed from: k */
    public boolean f89891k;

    /* JADX INFO: renamed from: l */
    public String f89892l;

    /* JADX INFO: renamed from: m */
    public int f89893m;

    /* JADX INFO: renamed from: n */
    public String f89894n;

    public do60(PurchaseType purchaseType) {
        this.f89881a = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public PurchasePaymentParam m117176a() {
        PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        String str = this.f89883c;
        purchasePaymentParamNew_.itemId = str;
        purchasePaymentParamNew_.useAutoDeduct = this.f89885e;
        String strM31599M4 = this.f89888h;
        if (strM31599M4 == null) {
            strM31599M4 = CoreModule.f18264c.f20396j0.m31599M4(str);
        }
        purchasePaymentParamNew_.tracker = strM31599M4;
        purchasePaymentParamNew_.ext = m117178c();
        purchasePaymentParamNew_.couponId = this.f89890j;
        purchasePaymentParamNew_.orderId = this.f89884d;
        purchasePaymentParamNew_.quantity = this.f89887g;
        purchasePaymentParamNew_.jsBridge = this.f89886f;
        purchasePaymentParamNew_.useJDNew = true;
        return purchasePaymentParamNew_;
    }

    /* JADX INFO: renamed from: b */
    public SignPaymentParam m117177b() {
        SignPaymentParam signPaymentParamNew_ = SignPaymentParam.new_();
        String str = this.f89883c;
        signPaymentParamNew_.itemId = str;
        signPaymentParamNew_.useAutoDeduct = this.f89885e;
        String strM31599M4 = this.f89888h;
        if (strM31599M4 == null) {
            strM31599M4 = CoreModule.f18264c.f20396j0.m31599M4(str);
        }
        signPaymentParamNew_.tracker = strM31599M4;
        signPaymentParamNew_.ext = m117178c();
        signPaymentParamNew_.couponId = this.f89890j;
        signPaymentParamNew_.delayCharge = this.f89889i;
        signPaymentParamNew_.reSignAfterFail = this.f89891k;
        return signPaymentParamNew_;
    }

    /* JADX INFO: renamed from: c */
    public PaymentParamExtra m117178c() {
        PaymentParamExtra paymentParamExtraNew_ = PaymentParamExtra.new_();
        if (this.f89893m != 32) {
            PaymentParamExtraLandingPageInfo paymentParamExtraLandingPageInfoNew_ = PaymentParamExtraLandingPageInfo.new_();
            ProductCategory productCategory = this.f89881a.productCategory();
            if ((TEnum.equals(productCategory, "quickchatMembership") || TEnum.equals(productCategory, "svip")) && TextUtils.isEmpty(this.f89882b)) {
                paymentParamExtraLandingPageInfoNew_.targetUserId = this.f89882b;
            }
            paymentParamExtraLandingPageInfoNew_.category = productCategory.name();
            paymentParamExtraLandingPageInfoNew_.enablePush = true;
            paymentParamExtraNew_.payLandPageInfo = paymentParamExtraLandingPageInfoNew_.toJson();
        }
        if (!TextUtils.isEmpty(this.f89892l)) {
            paymentParamExtraNew_.purchaseEnv = this.f89892l;
        }
        if (!TextUtils.isEmpty(this.f89894n)) {
            paymentParamExtraNew_.discountToken = this.f89894n;
        }
        return paymentParamExtraNew_;
    }

    /* JADX INFO: renamed from: d */
    public do60 m117179d(int i) {
        this.f89893m = i;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public do60 m117180e(String str) {
        this.f89890j = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public do60 m117181f(boolean z) {
        this.f89889i = z;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public do60 m117182g(String str) {
        this.f89894n = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public do60 m117183h(String str) {
        this.f89883c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public do60 m117184i(boolean z) {
        this.f89886f = z;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public do60 m117185j(String str) {
        this.f89882b = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public do60 m117186k(String str) {
        this.f89892l = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public do60 m117187l(int i) {
        this.f89887g = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public do60 m117188m(boolean z) {
        this.f89891k = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public do60 m117189n(String str) {
        this.f89888h = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public do60 m117190o(boolean z) {
        this.f89885e = z;
        return this;
    }
}
