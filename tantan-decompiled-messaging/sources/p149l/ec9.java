package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.IntlInnerWebPay;
import com.p046p1.mobile.putong.core.data.IntlInnerWebPayConfig;
import com.p046p1.mobile.putong.core.data.IntlInnerWebPayEnvelope;
import com.p046p1.mobile.putong.core.data.IntlPayMethod;
import com.p046p1.mobile.putong.core.data.IntlRequestWebPayPayment;
import com.p046p1.mobile.putong.core.data.IntlWebPay;
import com.p046p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p046p1.mobile.putong.core.data.NativeConfig;
import com.p046p1.mobile.putong.core.data.ThirdPartConfig;
import com.p046p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.IOException;
import java.util.ArrayList;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class ec9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public boolean f90481R;

    /* JADX INFO: renamed from: S */
    public boolean f90482S;

    /* JADX INFO: renamed from: T */
    public C22392a<Boolean> f90483T;

    /* JADX INFO: renamed from: U */
    public C22392a<Boolean> f90484U;

    /* JADX INFO: renamed from: V */
    public IntlInnerWebPayConfig f90485V;

    /* JADX INFO: renamed from: W */
    public ArrayList<String> f90486W;

    /* JADX INFO: renamed from: X */
    public ArrayList<String> f90487X;

    public ec9(C4732c c4732c) {
        super(c4732c);
        this.f90481R = false;
        this.f90482S = false;
        Boolean bool = Boolean.FALSE;
        this.f90483T = C22392a.m221513c(bool);
        this.f90484U = C22392a.m221513c(bool);
        this.f90485V = null;
        this.f90486W = new ArrayList<>();
        this.f90487X = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m115661b3(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<IntlWebPayPaymentEnvelope> m115670k3(NativeConfig nativeConfig, String str, String str2) {
        final String str3;
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.f90485V;
        if (intlInnerWebPayConfig == null || !TextUtils.equals(intlInnerWebPayConfig.method, IntlPayMethod.nativeMethod) || nativeConfig == null) {
            return null;
        }
        if (TextUtils.equals(nativeConfig.defaultQueryType, "order")) {
            str3 = C4728a.m31308i0() + "/create-order";
        } else {
            str3 = C4728a.m31308i0() + "/create-contract";
        }
        final IntlRequestWebPayPayment intlRequestWebPayPaymentNew_ = IntlRequestWebPayPayment.new_();
        intlRequestWebPayPaymentNew_.membershipType = str;
        intlRequestWebPayPaymentNew_.quantity = Integer.parseInt(str2);
        intlRequestWebPayPaymentNew_.platform = nativeConfig.platform;
        intlRequestWebPayPaymentNew_.currencyCode = nativeConfig.currencyCode;
        intlRequestWebPayPaymentNew_.payType = nativeConfig.payType;
        return this.f72126Q.scheduled("createPayment", -1, new v9j() { // from class: l.bc9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135122f(new v9j() { // from class: l.dc9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, intlRequestWebPayPayment.toJson())).m185883b();
                    }
                }, IntlWebPayPaymentEnvelope.JSON_ADAPTER);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<WebSubscriptionLandPageEnvelope> m115671l3() {
        final String strM31359v = C4728a.m31359v();
        return this.f72126Q.scheduled("getCheckoutContractConfig", 0, new v9j() { // from class: l.ub9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.xb9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }, WebSubscriptionLandPageEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public NativeConfig m115672m3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.f90485V;
        if (intlInnerWebPayConfig == null || !TextUtils.equals(intlInnerWebPayConfig.method, IntlPayMethod.nativeMethod) || vwb.m200296J(this.f90485V.nativeConfigs)) {
            return null;
        }
        return this.f90485V.nativeConfigs.get(0);
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<IntlInnerWebPayEnvelope> m115673n3() {
        final String str = C4728a.m31308i0() + "/method?language=" + i0g0.m133885y() + "&affiliate=" + (IntlCountryCodeController.m28115k() ? HardwareEarMonitorUtils.MANUFACTURER_HUAWEI : "googleplay");
        return this.f72126Q.scheduled("intlWebPayConfig", 0, new v9j() { // from class: l.ac9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.cc9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }, IntlInnerWebPayEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public String m115674o3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig;
        if (IntlCountryCodeController.m28115k() || (intlInnerWebPayConfig = CoreModule.f17545c.f19620X1.f90485V) == null) {
            return "";
        }
        if (TextUtils.equals(IntlPayMethod.nativeMethod, intlInnerWebPayConfig.method)) {
            NativeConfig nativeConfigM115672m3 = CoreModule.f17545c.f19620X1.m115672m3();
            return nativeConfigM115672m3 == null ? "" : nativeConfigM115672m3.btnDesc;
        }
        ThirdPartConfig thirdPartConfig = CoreModule.f17545c.f19620X1.f90485V.thirdPartConfig;
        return thirdPartConfig == null ? "" : thirdPartConfig.text;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m115675p3() {
        if (this.f90483T.m221515e().booleanValue() && NullChecker.m81303a(this.f90485V) && !IntlCountryCodeController.m28115k()) {
            return (TextUtils.equals(this.f90485V.method, IntlPayMethod.nativeMethod) || TextUtils.equals(this.f90485V.method, IntlPayMethod.thirdPartMethod)) && this.f90482S && !this.f90487X.contains(String.valueOf(qib0.f154717f0));
        }
        return false;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m115676q3() {
        return m115675p3() && TextUtils.equals(this.f90485V.method, IntlPayMethod.nativeMethod);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m115677r3(IntlInnerWebPay intlInnerWebPay) {
        this.f90482S = intlInnerWebPay.f210115android;
        this.f90487X.clear();
        this.f90487X.addAll(intlInnerWebPay.reverse_mcc);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m115678s3(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope) {
        this.f90485V = intlInnerWebPayEnvelope.data;
        this.f90484U.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m115679t3(IntlWebPay intlWebPay) {
        this.f90481R = intlWebPay.intlWebPayValid;
        this.f90486W.clear();
        this.f90486W.addAll(intlWebPay.intlWebPayBlackList);
    }

    /* JADX INFO: renamed from: u3 */
    public String m115680u3() {
        NativeConfig nativeConfigM115672m3;
        return (CoreModule.f17545c.f19620X1.f90485V == null || (nativeConfigM115672m3 = m115672m3()) == null) ? "" : nativeConfigM115672m3.redirectType;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m115681v3() {
        final IntlInnerWebPay intlInnerWebPayNew_;
        String strM79302F = RemoteConfig.m79298x().m79302F("intl_pay_penetration");
        try {
            if (TextUtils.isEmpty(strM79302F)) {
                intlInnerWebPayNew_ = IntlInnerWebPay.new_();
            } else {
                intlInnerWebPayNew_ = IntlInnerWebPay.JSON_ADAPTER.parse(strM79302F);
                intlInnerWebPayNew_.nullCheck();
            }
            e51.m114742G(new Runnable() { // from class: l.yb9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197315a.m115677r3(intlInnerWebPayNew_);
                }
            });
        } catch (IOException e) {
            CrashHelper.m81296c(new IOException("intl web pay catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: w3 */
    public void m115682w3() {
        m115683x3();
        m115681v3();
        m115673n3().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.vb9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180823a.m115678s3((IntlInnerWebPayEnvelope) obj);
            }
        }, new e30() { // from class: l.wb9
            @Override // p149l.e30
            public final void call(Object obj) {
                ec9.m115661b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x3 */
    public final void m115683x3() {
        if (!IntlCountryCodeController.m28115k()) {
            this.f90481R = false;
            this.f90486W.clear();
            return;
        }
        try {
            final IntlWebPay intlWebPay = IntlWebPay.parse(RemoteConfig.m79298x().m79302F("intl_web_pay"));
            e51.m114742G(new Runnable() { // from class: l.zb9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202425a.m115679t3(intlWebPay);
                }
            });
        } catch (IOException e) {
            CrashHelper.m81296c(new IOException("intl web pay catch json parse Exception, please ignore. ", e));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public String m115684y3() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = CoreModule.f17545c.f19620X1.f90485V;
        return intlInnerWebPayConfig == null ? "" : intlInnerWebPayConfig.subscriptionHomePage;
    }
}
