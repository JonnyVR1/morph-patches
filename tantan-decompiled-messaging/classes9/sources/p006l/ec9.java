package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.IntlInnerWebPay;
import com.p1.mobile.putong.core.data.IntlInnerWebPayConfig;
import com.p1.mobile.putong.core.data.IntlInnerWebPayEnvelope;
import com.p1.mobile.putong.core.data.IntlRequestWebPayPayment;
import com.p1.mobile.putong.core.data.IntlWebPay;
import com.p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p1.mobile.putong.core.data.NativeConfig;
import com.p1.mobile.putong.core.data.ThirdPartConfig;
import com.p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import l.e30;
import l.e51;
import l.i0g0;
import l.jo0;
import l.mkd0;
import l.utc0;
import l.v9j;
import l.vwb;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ec9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public boolean f11069R;

    /* JADX INFO: renamed from: S */
    public boolean f11070S;

    /* JADX INFO: renamed from: T */
    public a<Boolean> f11071T;

    /* JADX INFO: renamed from: U */
    public a<Boolean> f11072U;

    /* JADX INFO: renamed from: V */
    public IntlInnerWebPayConfig f11073V;

    /* JADX INFO: renamed from: W */
    public ArrayList<String> f11074W;

    /* JADX INFO: renamed from: X */
    public ArrayList<String> f11075X;

    public ec9(C0158c c0158c) {
        super(c0158c);
        this.f11069R = false;
        this.f11070S = false;
        Boolean bool = Boolean.FALSE;
        this.f11071T = a.c(bool);
        this.f11072U = a.c(bool);
        this.f11073V = null;
        this.f11074W = new ArrayList<>();
        this.f11075X = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m14453b3(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    public c<IntlWebPayPaymentEnvelope> m14462k3(NativeConfig nativeConfig, String str, String str2) {
        final String str3;
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.f11073V;
        if (intlInnerWebPayConfig == null || !TextUtils.equals(intlInnerWebPayConfig.method, "nativeMethod") || nativeConfig == null) {
            return null;
        }
        if (TextUtils.equals(nativeConfig.defaultQueryType, "order")) {
            str3 = C0154a.m3238i0() + "/create-order";
        } else {
            str3 = C0154a.m3238i0() + "/create-contract";
        }
        final IntlRequestWebPayPayment intlRequestWebPayPaymentNew_ = IntlRequestWebPayPayment.new_();
        intlRequestWebPayPaymentNew_.membershipType = str;
        intlRequestWebPayPaymentNew_.quantity = Integer.parseInt(str2);
        intlRequestWebPayPaymentNew_.platform = nativeConfig.platform;
        intlRequestWebPayPaymentNew_.currencyCode = nativeConfig.currencyCode;
        intlRequestWebPayPaymentNew_.payType = nativeConfig.payType;
        return this.f8580Q.scheduled("createPayment", -1, new v9j() { // from class: l.bc9
            public final Object call() {
                return ia20.m16572f(new v9j() { // from class: l.dc9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, intlRequestWebPayPayment.toJson())).b();
                    }
                }, IntlWebPayPaymentEnvelope.JSON_ADAPTER);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: l3 */
    public c<WebSubscriptionLandPageEnvelope> m14463l3() {
        final String strM3289v = C0154a.m3289v();
        return this.f8580Q.scheduled("getCheckoutContractConfig", 0, new v9j() { // from class: l.ub9
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.xb9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }, WebSubscriptionLandPageEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public NativeConfig m14464m3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.f11073V;
        if (intlInnerWebPayConfig == null || !TextUtils.equals(intlInnerWebPayConfig.method, "nativeMethod") || vwb.J(this.f11073V.nativeConfigs)) {
            return null;
        }
        return (NativeConfig) this.f11073V.nativeConfigs.get(0);
    }

    /* JADX INFO: renamed from: n3 */
    public c<IntlInnerWebPayEnvelope> m14465n3() {
        final String str = C0154a.m3238i0() + "/method?language=" + i0g0.y() + "&affiliate=" + (IntlCountryCodeController.m10k() ? "huawei" : "googleplay");
        return this.f8580Q.scheduled("intlWebPayConfig", 0, new v9j() { // from class: l.ac9
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.cc9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }, IntlInnerWebPayEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public String m14466o3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig;
        if (IntlCountryCodeController.m10k() || (intlInnerWebPayConfig = CoreModule.f1534c.f3609X1.f11073V) == null) {
            return "";
        }
        if (TextUtils.equals("nativeMethod", intlInnerWebPayConfig.method)) {
            NativeConfig nativeConfigM14464m3 = CoreModule.f1534c.f3609X1.m14464m3();
            return nativeConfigM14464m3 == null ? "" : nativeConfigM14464m3.btnDesc;
        }
        ThirdPartConfig thirdPartConfig = CoreModule.f1534c.f3609X1.f11073V.thirdPartConfig;
        return thirdPartConfig == null ? "" : thirdPartConfig.text;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m14467p3() {
        if (((Boolean) this.f11071T.e()).booleanValue() && NullChecker.a(this.f11073V) && !IntlCountryCodeController.m10k()) {
            return (TextUtils.equals(this.f11073V.method, "nativeMethod") || TextUtils.equals(this.f11073V.method, "thirdPartMethod")) && this.f11070S && !this.f11075X.contains(String.valueOf(qib0.f19808f0));
        }
        return false;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m14468q3() {
        return m14467p3() && TextUtils.equals(this.f11073V.method, "nativeMethod");
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m14469r3(IntlInnerWebPay intlInnerWebPay) {
        this.f11070S = intlInnerWebPay.android;
        this.f11075X.clear();
        this.f11075X.addAll(intlInnerWebPay.reverse_mcc);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m14470s3(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope) {
        this.f11073V = intlInnerWebPayEnvelope.data;
        this.f11072U.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m14471t3(IntlWebPay intlWebPay) {
        this.f11069R = intlWebPay.intlWebPayValid;
        this.f11074W.clear();
        this.f11074W.addAll(intlWebPay.intlWebPayBlackList);
    }

    /* JADX INFO: renamed from: u3 */
    public String m14472u3() {
        NativeConfig nativeConfigM14464m3;
        return (CoreModule.f1534c.f3609X1.f11073V == null || (nativeConfigM14464m3 = m14464m3()) == null) ? "" : nativeConfigM14464m3.redirectType;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m14473v3() {
        final IntlInnerWebPay intlInnerWebPayNew_;
        String strF = RemoteConfig.x().F("intl_pay_penetration");
        try {
            if (TextUtils.isEmpty(strF)) {
                intlInnerWebPayNew_ = IntlInnerWebPay.new_();
            } else {
                intlInnerWebPayNew_ = (IntlInnerWebPay) IntlInnerWebPay.JSON_ADAPTER.parse(strF);
                intlInnerWebPayNew_.nullCheck();
            }
            e51.G(new Runnable() { // from class: l.yb9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28106a.m14469r3(intlInnerWebPayNew_);
                }
            });
        } catch (IOException e) {
            CrashHelper.c(new IOException("intl web pay catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: w3 */
    public void m14474w3() {
        m14475x3();
        m14473v3();
        m14465n3().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.vb9
            public final void call(Object obj) {
                this.f24243a.m14470s3((IntlInnerWebPayEnvelope) obj);
            }
        }, new e30() { // from class: l.wb9
            public final void call(Object obj) {
                ec9.m14453b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x3 */
    public final void m14475x3() {
        if (!IntlCountryCodeController.m10k()) {
            this.f11069R = false;
            this.f11074W.clear();
            return;
        }
        try {
            final IntlWebPay intlWebPay = IntlWebPay.parse(RemoteConfig.x().F("intl_web_pay"));
            e51.G(new Runnable() { // from class: l.zb9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28694a.m14471t3(intlWebPay);
                }
            });
        } catch (IOException e) {
            CrashHelper.c(new IOException("intl web pay catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public String m14476y3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = CoreModule.f1534c.f3609X1.f11073V;
        return intlInnerWebPayConfig == null ? "" : intlInnerWebPayConfig.subscriptionHomePage;
    }
}
