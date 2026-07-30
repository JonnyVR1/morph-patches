package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.app.PayTask;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.data.OrderData;
import com.p046p1.mobile.putong.data.PaymentParam;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class ui0 implements nzl, gml {

    /* JADX INFO: renamed from: a */
    public final String f176610a;

    /* JADX INFO: renamed from: b */
    public Activity f176611b;

    static {
        EnvUtils.setEnv(EnvUtils.EnvEnum.ONLINE);
    }

    public ui0(Context context, String str) {
        this.f176611b = (Activity) context;
        this.f176610a = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m193804G(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + str));
        if (intent.resolveActivityInfo(context.getPackageManager(), 131072) != null) {
            context.startActivity(intent);
        } else {
            qkq0.m175383a("alipay");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PaymentApi.PaymentResultStatus m193806e(Boolean bool) {
        return bool.booleanValue() ? PaymentApi.PaymentResultStatus.toSigning : PaymentApi.PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: y */
    public static void m193815y(Activity activity, int i) {
        switch (i) {
            case TantanException.Client.CoreService.HASPRIVILEGE /* 48803 */:
                lsi0.m151580j(activity.getString(R$string.f27273Q6));
                break;
            case TantanException.Client.CoreService.AUTOPAYLIMIT /* 48804 */:
                break;
            case TantanException.Client.CoreService.AUTOPAYCANCEL /* 48805 */:
                lsi0.m151580j(activity.getString(R$string.f27295S6));
                break;
            default:
                lsi0.m151580j(activity.getString(R$string.f27295S6));
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m193816A(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.INSTANCE.m130130d(this.f176610a, paymentParam.itemId, "alipay", str, i, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m193817B(PaymentParam paymentParam, String str, int i, String str2) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y("skuID", paymentParam.itemId), vwb.m200311Y("platform", "alipay"), vwb.m200311Y("code", Integer.valueOf(i)), vwb.m200311Y("order_id", str), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", str2));
        if (ura.m195053e().m195057d().mo33753U()) {
            arrayListM200324f0.add(vwb.m200311Y("no_secret_payment", Boolean.valueOf(CoreModule.f17545c.f19591O0.m30079n3())));
            arrayListM200324f0.add(vwb.m200311Y("user_secret_staus", CoreModule.f17545c.f19591O0.m30076D3()));
        }
        zvf0.m220371D("e_purchase_order_response", "p_purchase_page", (j760[]) arrayListM200324f0.toArray(new j760[arrayListM200324f0.size()]));
    }

    /* JADX INFO: renamed from: C */
    public final void m193818C(PaymentParam paymentParam) {
        hab0.INSTANCE.m130131e(this.f176610a, paymentParam.itemId, "alipay");
    }

    /* JADX INFO: renamed from: D */
    public final void m193819D(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.INSTANCE.m130132f(this.f176610a, paymentParam.itemId, "alipay", str, i, str2);
    }

    /* JADX INFO: renamed from: E */
    public void m193820E(PaymentParam paymentParam, String str, int i, String str2) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y("skuID", paymentParam.itemId), vwb.m200311Y("platform", "alipay"), vwb.m200311Y("contract_id", str), vwb.m200311Y("order_type", "contract"), vwb.m200311Y("code", Integer.valueOf(i)), vwb.m200311Y("error_message", str2));
        if (ura.m195053e().m195057d().mo33753U()) {
            arrayListM200324f0.add(vwb.m200311Y("no_secret_payment", Boolean.valueOf(CoreModule.f17545c.f19591O0.m30079n3())));
            arrayListM200324f0.add(vwb.m200311Y("user_secret_staus", CoreModule.f17545c.f19591O0.m30076D3()));
        }
        zvf0.m220371D("e_purchase_order_response", "p_purchase_page", (j760[]) arrayListM200324f0.toArray(new j760[arrayListM200324f0.size()]));
    }

    /* JADX INFO: renamed from: F */
    public C22306c<Boolean> m193821F(String str, PaymentParam paymentParam) throws Exception {
        try {
            m193804G(this.f176611b, str);
            return C22306c.just(Boolean.TRUE);
        } catch (Exception e) {
            if ((e instanceof IllegalStateException) && TextUtils.equals(e.getMessage(), "alipay")) {
                throw e;
            }
            CrashHelper.m81296c(e);
            m193820E(paymentParam, "", yij0.m214970z(e), e.getMessage());
            m193819D(paymentParam, "default", yij0.m214970z(e), e.getMessage());
            return C22306c.just(Boolean.FALSE);
        }
    }

    @Override // p149l.gml
    /* JADX INFO: renamed from: a */
    public C22306c<PaymentApi.SignResultStatus> mo127034a(final SignPaymentParam signPaymentParam) {
        signPaymentParam.url = "/alipay/contract/signAndPay";
        m193818C(signPaymentParam);
        return qib0.f154705T.m29586V(signPaymentParam).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.oi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144081a.m193831w(signPaymentParam, (OrderData) obj);
            }
        }).observeOn(jo0.m142408a()).doOnError(new e30() { // from class: l.pi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149067a.m193832x(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p149l.gml
    /* JADX INFO: renamed from: b */
    public C22306c<PaymentApi.SignResultStatus> mo127035b(final SignPaymentParam signPaymentParam) {
        signPaymentParam.url = "/alipay/contract/sign";
        m193818C(signPaymentParam);
        return qib0.f154705T.m29586V(signPaymentParam).map(new w9j() { // from class: l.mi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133927a.m193828t(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.ni0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139049a.m193829u(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p149l.nzl
    /* JADX INFO: renamed from: c */
    public C22306c<PaymentApi.PaymentResultStatus> mo141208c(final PurchasePaymentParam purchasePaymentParam, final d30 d30Var) {
        purchasePaymentParam.url = "/alipay/create-order";
        m193833z(purchasePaymentParam);
        final boolean z = purchasePaymentParam.useAutoDeduct;
        return qib0.f154705T.m29586V(purchasePaymentParam).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.ki0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123252a.m193826r(purchasePaymentParam, z, d30Var, (OrderData) obj);
            }
        }).observeOn(jo0.m142408a()).doOnError(new e30() { // from class: l.li0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128153a.m193827s(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m193822n(int i) {
        if (ura.m195053e().m195057d().mo33753U() && i == 48803) {
            lsi0.m151580j(this.f176611b.getString(R$string.f27273Q6));
        }
    }

    /* JADX INFO: renamed from: o */
    public C22306c<PaymentApi.PaymentResultStatus> m193823o(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final d30 d30Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.url = "/alipay/pay";
        purchasePaymentParamNew_.itemId = purchasePaymentParam.itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        return C22306c.just(purchasePaymentParam).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.ti0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170342a.m193824p(str, d30Var, purchasePaymentParamNew_, (PurchasePaymentParam) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C22306c m193824p(String str, d30 d30Var, PurchasePaymentParam purchasePaymentParam, PurchasePaymentParam purchasePaymentParam2) {
        Map mapPayV2 = new PayTask(this.f176611b).payV2(str, false);
        if (NullChecker.m81303a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.m114742G(new bii0(d30Var));
        }
        purchasePaymentParam.receipt = (String) mapPayV2.get(LovePlanetStage.result);
        return TextUtils.equals((CharSequence) mapPayV2.get("resultStatus"), "9000") ? qib0.f154705T.m29592b0(purchasePaymentParam) : C22306c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ PaymentApi.PaymentResultStatus m193825q(Order order, d30 d30Var) throws Exception {
        Map mapPayV2 = new PayTask(this.f176611b).payV2(order.signAndPayRequest, true);
        if (NullChecker.m81303a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.m114742G(new bii0(d30Var));
        }
        return TextUtils.equals((CharSequence) mapPayV2.get("resultStatus"), "9000") ? PaymentApi.PaymentResultStatus.succeed : PaymentApi.PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22306c m193826r(PurchasePaymentParam purchasePaymentParam, boolean z, final d30 d30Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m193817B(purchasePaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.orderId;
        Meta meta2 = orderData.meta;
        m193816A(purchasePaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        final Order order = orderData.data;
        if (z) {
            if (!TextUtils.isEmpty(order.signRequest)) {
                return m193821F(order.signRequest, purchasePaymentParam).map(new w9j() { // from class: l.qi0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ui0.m193806e((Boolean) obj);
                    }
                });
            }
            if (!TextUtils.isEmpty(order.paymentRequest)) {
                Order order2 = orderData.data;
                return m193823o(purchasePaymentParam, order2.paymentRequest, order2.orderId, d30Var);
            }
            if (TEnum.equals(order.orderStatus, "pending")) {
                purchasePaymentParam.orderId = orderData.data.orderId;
                return C22306c.just(PaymentApi.PaymentResultStatus.pending);
            }
            if (TEnum.equals(order.orderStatus, "success")) {
                return C22306c.just(PaymentApi.PaymentResultStatus.succeed);
            }
            if (TEnum.equals(order.orderStatus, "failed")) {
                return C22306c.just(PaymentApi.PaymentResultStatus.failed);
            }
        }
        if (!TextUtils.isEmpty(order.signAndPayRequest)) {
            return C22306c.fromCallable(new Callable() { // from class: l.ri0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f159507a.m193825q(order, d30Var);
                }
            });
        }
        Order order3 = orderData.data;
        return m193823o(purchasePaymentParam, order3.paymentRequest, order3.orderId, d30Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m193827s(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            m193822n(((TantanException.Client.CoreService) th).subCode);
        }
        m193817B(purchasePaymentParam, "", yij0.m214970z(th), th.getMessage());
        m193816A(purchasePaymentParam, "default", yij0.m214970z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ PaymentApi.SignResultStatus m193828t(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m193820E(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m193819D(signPaymentParam, str2, meta2.code, meta2.message);
        Meta meta3 = orderData.meta;
        if (meta3.code != 200) {
            m193822n(meta3.subCode);
            return PaymentApi.SignResultStatus.failed;
        }
        Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        if (TEnum.equals(order.contractStatus, "signing")) {
            return PaymentApi.SignResultStatus.signing;
        }
        if (TEnum.equals(orderData.data.contractStatus, "success")) {
            return PaymentApi.SignResultStatus.succeed;
        }
        m193804G(this.f176611b, orderData.data.signRequest);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m193829u(SignPaymentParam signPaymentParam, Throwable th) {
        m193820E(signPaymentParam, "", yij0.m214970z(th), th.getMessage());
        m193819D(signPaymentParam, "default", yij0.m214970z(th), th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            m193815y(this.f176611b, ((TantanException.Client.CoreService) th).subCode);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ PaymentApi.SignResultStatus m193830v(Order order) throws Exception {
        return TextUtils.equals((CharSequence) new PayTask(this.f176611b).payV2(order.signAndPayRequest, true).get("resultStatus"), "9000") ? PaymentApi.SignResultStatus.succeed : PaymentApi.SignResultStatus.failed;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22306c m193831w(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m193820E(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m193819D(signPaymentParam, str2, meta2.code, meta2.message);
        Meta meta3 = orderData.meta;
        if (meta3.code != 200) {
            m193822n(meta3.subCode);
            return C22306c.just(PaymentApi.SignResultStatus.failed);
        }
        final Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        if (TextUtils.isEmpty(order.signAndPayRequest)) {
            return (TEnum.equals(orderData.data.orderStatus, "success") && TEnum.equals(orderData.data.contractStatus, "signing")) ? C22306c.just(PaymentApi.SignResultStatus.succeed) : C22306c.just(PaymentApi.SignResultStatus.failed);
        }
        return C22306c.fromCallable(new Callable() { // from class: l.si0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f164663a.m193830v(order);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m193832x(SignPaymentParam signPaymentParam, Throwable th) {
        m193820E(signPaymentParam, "", yij0.m214970z(th), th.getMessage());
        m193819D(signPaymentParam, "default", yij0.m214970z(th), th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            m193815y(this.f176611b, ((TantanException.Client.CoreService) th).subCode);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m193833z(PaymentParam paymentParam) {
        hab0.INSTANCE.m130129c(this.f176610a, paymentParam.itemId, "alipay");
    }
}
