package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.IntlInnerWebPay;
import com.p051p1.mobile.putong.core.data.IntlInnerWebPayConfig;
import com.p051p1.mobile.putong.core.data.IntlInnerWebPayEnvelope;
import com.p051p1.mobile.putong.core.data.IntlPayMethod;
import com.p051p1.mobile.putong.core.data.IntlRequestWebPayPayment;
import com.p051p1.mobile.putong.core.data.IntlWebPay;
import com.p051p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p051p1.mobile.putong.core.data.NativeConfig;
import com.p051p1.mobile.putong.core.data.ThirdPartConfig;
import com.p051p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.IOException;
import java.util.ArrayList;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class nd9 extends dy6 {

    /* JADX INFO: renamed from: R */
    public boolean f141461R;

    /* JADX INFO: renamed from: S */
    public boolean f141462S;

    /* JADX INFO: renamed from: T */
    public C22507a<Boolean> f141463T;

    /* JADX INFO: renamed from: U */
    public C22507a<Boolean> f141464U;

    /* JADX INFO: renamed from: V */
    public IntlInnerWebPayConfig f141465V;

    /* JADX INFO: renamed from: W */
    public ArrayList<String> f141466W;

    /* JADX INFO: renamed from: X */
    public ArrayList<String> f141467X;

    public nd9(C4883c c4883c) {
        super(c4883c);
        this.f141461R = false;
        this.f141462S = false;
        Boolean bool = Boolean.FALSE;
        this.f141463T = C22507a.m222759c(bool);
        this.f141464U = C22507a.m222759c(bool);
        this.f141465V = null;
        this.f141466W = new ArrayList<>();
        this.f141467X = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m162643b3(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<IntlWebPayPaymentEnvelope> m162652k3(NativeConfig nativeConfig, String str, String str2) {
        final String str3;
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.f141465V;
        if (intlInnerWebPayConfig == null || !TextUtils.equals(intlInnerWebPayConfig.method, IntlPayMethod.nativeMethod) || nativeConfig == null) {
            return null;
        }
        if (TextUtils.equals(nativeConfig.defaultQueryType, "order")) {
            str3 = C4879a.m32311i0() + "/create-order";
        } else {
            str3 = C4879a.m32311i0() + "/create-contract";
        }
        final IntlRequestWebPayPayment intlRequestWebPayPaymentNew_ = IntlRequestWebPayPayment.new_();
        intlRequestWebPayPaymentNew_.membershipType = str;
        intlRequestWebPayPaymentNew_.quantity = Integer.parseInt(str2);
        intlRequestWebPayPaymentNew_.platform = nativeConfig.platform;
        intlRequestWebPayPaymentNew_.currencyCode = nativeConfig.currencyCode;
        intlRequestWebPayPaymentNew_.payType = nativeConfig.payType;
        return this.f91137Q.scheduled("createPayment", -1, new pcj() { // from class: l.kd9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176659f(new pcj() { // from class: l.md9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, intlRequestWebPayPayment.toJson())).m209028b();
                    }
                }, IntlWebPayPaymentEnvelope.JSON_ADAPTER);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<WebSubscriptionLandPageEnvelope> m162653l3() {
        final String strM32362v = C4879a.m32362v();
        return this.f91137Q.scheduled("getCheckoutContractConfig", 0, new pcj() { // from class: l.dd9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.gd9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }, WebSubscriptionLandPageEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public NativeConfig m162654m3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.f141465V;
        if (intlInnerWebPayConfig == null || !TextUtils.equals(intlInnerWebPayConfig.method, IntlPayMethod.nativeMethod) || jyb.m147479J(this.f141465V.nativeConfigs)) {
            return null;
        }
        return this.f141465V.nativeConfigs.get(0);
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<IntlInnerWebPayEnvelope> m162655n3() {
        final String str = C4879a.m32311i0() + "/method?language=" + q8g0.m175820y() + "&affiliate=" + (IntlCountryCodeController.m29114k() ? HardwareEarMonitorUtils.MANUFACTURER_HUAWEI : "googleplay");
        return this.f91137Q.scheduled("intlWebPayConfig", 0, new pcj() { // from class: l.jd9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.ld9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }, IntlInnerWebPayEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public String m162656o3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig;
        if (IntlCountryCodeController.m29114k() || (intlInnerWebPayConfig = CoreModule.f18264c.f20362X1.f141465V) == null) {
            return "";
        }
        if (TextUtils.equals(IntlPayMethod.nativeMethod, intlInnerWebPayConfig.method)) {
            NativeConfig nativeConfigM162654m3 = CoreModule.f18264c.f20362X1.m162654m3();
            return nativeConfigM162654m3 == null ? "" : nativeConfigM162654m3.btnDesc;
        }
        ThirdPartConfig thirdPartConfig = CoreModule.f18264c.f20362X1.f141465V.thirdPartConfig;
        return thirdPartConfig == null ? "" : thirdPartConfig.text;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m162657p3() {
        if (this.f141463T.m222761e().booleanValue() && NullChecker.m82486a(this.f141465V) && !IntlCountryCodeController.m29114k()) {
            return (TextUtils.equals(this.f141465V.method, IntlPayMethod.nativeMethod) || TextUtils.equals(this.f141465V.method, IntlPayMethod.thirdPartMethod)) && this.f141462S && !this.f141467X.contains(String.valueOf(uqb0.f180400f0));
        }
        return false;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m162658q3() {
        return m162657p3() && TextUtils.equals(this.f141465V.method, IntlPayMethod.nativeMethod);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m162659r3(IntlInnerWebPay intlInnerWebPay) {
        this.f141462S = intlInnerWebPay.f211037android;
        this.f141467X.clear();
        this.f141467X.addAll(intlInnerWebPay.reverse_mcc);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m162660s3(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope) {
        this.f141465V = intlInnerWebPayEnvelope.data;
        this.f141464U.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m162661t3(IntlWebPay intlWebPay) {
        this.f141461R = intlWebPay.intlWebPayValid;
        this.f141466W.clear();
        this.f141466W.addAll(intlWebPay.intlWebPayBlackList);
    }

    /* JADX INFO: renamed from: u3 */
    public String m162662u3() {
        NativeConfig nativeConfigM162654m3;
        return (CoreModule.f18264c.f20362X1.f141465V == null || (nativeConfigM162654m3 = m162654m3()) == null) ? "" : nativeConfigM162654m3.redirectType;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m162663v3() {
        final IntlInnerWebPay intlInnerWebPayNew_;
        String strM80485F = RemoteConfig.m80481x().m80485F("intl_pay_penetration");
        try {
            if (TextUtils.isEmpty(strM80485F)) {
                intlInnerWebPayNew_ = IntlInnerWebPay.new_();
            } else {
                intlInnerWebPayNew_ = IntlInnerWebPay.JSON_ADAPTER.parse(strM80485F);
                intlInnerWebPayNew_.nullCheck();
            }
            l51.m152887G(new Runnable() { // from class: l.hd9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108805a.m162659r3(intlInnerWebPayNew_);
                }
            });
        } catch (IOException e) {
            CrashHelper.m82479c(new IOException("intl web pay catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: w3 */
    public void m162664w3() {
        m162665x3();
        m162663v3();
        m162655n3().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ed9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93153a.m162660s3((IntlInnerWebPayEnvelope) obj);
            }
        }, new y20() { // from class: l.fd9
            @Override // p153l.y20
            public final void call(Object obj) {
                nd9.m162643b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x3 */
    public final void m162665x3() {
        if (!IntlCountryCodeController.m29114k()) {
            this.f141461R = false;
            this.f141466W.clear();
            return;
        }
        try {
            final IntlWebPay intlWebPay = IntlWebPay.parse(RemoteConfig.m80481x().m80485F("intl_web_pay"));
            l51.m152887G(new Runnable() { // from class: l.id9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114492a.m162661t3(intlWebPay);
                }
            });
        } catch (IOException e) {
            CrashHelper.m82479c(new IOException("intl web pay catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public String m162666y3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = CoreModule.f18264c.f20362X1.f141465V;
        return intlInnerWebPayConfig == null ? "" : intlInnerWebPayConfig.subscriptionHomePage;
    }
}
