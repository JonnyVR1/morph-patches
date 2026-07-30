package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.app.PayTask;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.data.OrderData;
import com.p051p1.mobile.putong.data.PaymentParam;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class qi0 implements h2m, sol {

    /* JADX INFO: renamed from: a */
    public final String f157787a;

    /* JADX INFO: renamed from: b */
    public Activity f157788b;

    static {
        EnvUtils.setEnv(EnvUtils.EnvEnum.ONLINE);
    }

    public qi0(Context context, String str) {
        this.f157788b = (Activity) context;
        this.f157787a = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m176624G(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + str));
        if (intent.resolveActivityInfo(context.getPackageManager(), 131072) != null) {
            context.startActivity(intent);
        } else {
            wtq0.m207906a("alipay");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PaymentApi.PaymentResultStatus m176626e(Boolean bool) {
        return bool.booleanValue() ? PaymentApi.PaymentResultStatus.toSigning : PaymentApi.PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: y */
    public static void m176635y(Activity activity, int i) {
        switch (i) {
            case TantanException.Client.CoreService.HASPRIVILEGE /* 48803 */:
                o1j0.m165636j(activity.getString(R$string.f28121Q6));
                break;
            case TantanException.Client.CoreService.AUTOPAYLIMIT /* 48804 */:
                break;
            case TantanException.Client.CoreService.AUTOPAYCANCEL /* 48805 */:
                o1j0.m165636j(activity.getString(R$string.f28143S6));
                break;
            default:
                o1j0.m165636j(activity.getString(R$string.f28143S6));
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m176636A(PaymentParam paymentParam, String str, int i, String str2) {
        lib0.INSTANCE.m154352d(this.f157787a, paymentParam.itemId, "alipay", str, i, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m176637B(PaymentParam paymentParam, String str, int i, String str2) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y("skuID", paymentParam.itemId), jyb.m147494Y("platform", "alipay"), jyb.m147494Y("code", Integer.valueOf(i)), jyb.m147494Y("order_id", str), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", str2));
        if (gta.m132210e().m132214d().mo34756U()) {
            arrayListM147507f0.add(jyb.m147494Y("no_secret_payment", Boolean.valueOf(CoreModule.f18264c.f20333O0.m31077n3())));
            arrayListM147507f0.add(jyb.m147494Y("user_secret_staus", CoreModule.f18264c.f20333O0.m31074D3()));
        }
        i4g0.m138495D("e_purchase_order_response", "p_purchase_page", (pf60[]) arrayListM147507f0.toArray(new pf60[arrayListM147507f0.size()]));
    }

    /* JADX INFO: renamed from: C */
    public final void m176638C(PaymentParam paymentParam) {
        lib0.INSTANCE.m154353e(this.f157787a, paymentParam.itemId, "alipay");
    }

    /* JADX INFO: renamed from: D */
    public final void m176639D(PaymentParam paymentParam, String str, int i, String str2) {
        lib0.INSTANCE.m154354f(this.f157787a, paymentParam.itemId, "alipay", str, i, str2);
    }

    /* JADX INFO: renamed from: E */
    public void m176640E(PaymentParam paymentParam, String str, int i, String str2) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y("skuID", paymentParam.itemId), jyb.m147494Y("platform", "alipay"), jyb.m147494Y("contract_id", str), jyb.m147494Y("order_type", "contract"), jyb.m147494Y("code", Integer.valueOf(i)), jyb.m147494Y("error_message", str2));
        if (gta.m132210e().m132214d().mo34756U()) {
            arrayListM147507f0.add(jyb.m147494Y("no_secret_payment", Boolean.valueOf(CoreModule.f18264c.f20333O0.m31077n3())));
            arrayListM147507f0.add(jyb.m147494Y("user_secret_staus", CoreModule.f18264c.f20333O0.m31074D3()));
        }
        i4g0.m138495D("e_purchase_order_response", "p_purchase_page", (pf60[]) arrayListM147507f0.toArray(new pf60[arrayListM147507f0.size()]));
    }

    /* JADX INFO: renamed from: F */
    public C22421c<Boolean> m176641F(String str, PaymentParam paymentParam) throws Exception {
        try {
            m176624G(this.f157788b, str);
            return C22421c.just(Boolean.TRUE);
        } catch (Exception e) {
            if ((e instanceof IllegalStateException) && TextUtils.equals(e.getMessage(), "alipay")) {
                throw e;
            }
            CrashHelper.m82479c(e);
            m176640E(paymentParam, "", bsj0.m106290z(e), e.getMessage());
            m176639D(paymentParam, "default", bsj0.m106290z(e), e.getMessage());
            return C22421c.just(Boolean.FALSE);
        }
    }

    @Override // p153l.sol
    /* JADX INFO: renamed from: a */
    public C22421c<PaymentApi.SignResultStatus> mo150322a(final SignPaymentParam signPaymentParam) {
        signPaymentParam.url = "/alipay/contract/signAndPay";
        m176638C(signPaymentParam);
        return uqb0.f180388T.m30584V(signPaymentParam).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.ki0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126952a.m176651w(signPaymentParam, (OrderData) obj);
            }
        }).observeOn(fo0.m126432a()).doOnError(new y20() { // from class: l.li0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132168a.m176652x(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p153l.sol
    /* JADX INFO: renamed from: b */
    public C22421c<PaymentApi.SignResultStatus> mo150323b(final SignPaymentParam signPaymentParam) {
        signPaymentParam.url = "/alipay/contract/sign";
        m176638C(signPaymentParam);
        return uqb0.f180388T.m30584V(signPaymentParam).map(new qcj() { // from class: l.ii0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115040a.m176648t(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new y20() { // from class: l.ji0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121029a.m176649u(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p153l.h2m
    /* JADX INFO: renamed from: c */
    public C22421c<PaymentApi.PaymentResultStatus> mo133394c(final PurchasePaymentParam purchasePaymentParam, final x20 x20Var) {
        purchasePaymentParam.url = "/alipay/create-order";
        m176653z(purchasePaymentParam);
        final boolean z = purchasePaymentParam.useAutoDeduct;
        return uqb0.f180388T.m30584V(purchasePaymentParam).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.gi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104184a.m176646r(purchasePaymentParam, z, x20Var, (OrderData) obj);
            }
        }).observeOn(fo0.m126432a()).doOnError(new y20() { // from class: l.hi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109955a.m176647s(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m176642n(int i) {
        if (gta.m132210e().m132214d().mo34756U() && i == 48803) {
            o1j0.m165636j(this.f157788b.getString(R$string.f28121Q6));
        }
    }

    /* JADX INFO: renamed from: o */
    public C22421c<PaymentApi.PaymentResultStatus> m176643o(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final x20 x20Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.url = "/alipay/pay";
        purchasePaymentParamNew_.itemId = purchasePaymentParam.itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        return C22421c.just(purchasePaymentParam).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.pi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152504a.m176644p(str, x20Var, purchasePaymentParamNew_, (PurchasePaymentParam) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C22421c m176644p(String str, x20 x20Var, PurchasePaymentParam purchasePaymentParam, PurchasePaymentParam purchasePaymentParam2) {
        Map mapPayV2 = new PayTask(this.f157788b).payV2(str, false);
        if (NullChecker.m82486a(x20Var)) {
            Objects.requireNonNull(x20Var);
            l51.m152887G(new bri0(x20Var));
        }
        purchasePaymentParam.receipt = (String) mapPayV2.get(LovePlanetStage.result);
        return TextUtils.equals((CharSequence) mapPayV2.get("resultStatus"), "9000") ? uqb0.f180388T.m30590b0(purchasePaymentParam) : C22421c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ PaymentApi.PaymentResultStatus m176645q(Order order, x20 x20Var) throws Exception {
        Map mapPayV2 = new PayTask(this.f157788b).payV2(order.signAndPayRequest, true);
        if (NullChecker.m82486a(x20Var)) {
            Objects.requireNonNull(x20Var);
            l51.m152887G(new bri0(x20Var));
        }
        return TextUtils.equals((CharSequence) mapPayV2.get("resultStatus"), "9000") ? PaymentApi.PaymentResultStatus.succeed : PaymentApi.PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22421c m176646r(PurchasePaymentParam purchasePaymentParam, boolean z, final x20 x20Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m176637B(purchasePaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.orderId;
        Meta meta2 = orderData.meta;
        m176636A(purchasePaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        final Order order = orderData.data;
        if (z) {
            if (!TextUtils.isEmpty(order.signRequest)) {
                return m176641F(order.signRequest, purchasePaymentParam).map(new qcj() { // from class: l.mi0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return qi0.m176626e((Boolean) obj);
                    }
                });
            }
            if (!TextUtils.isEmpty(order.paymentRequest)) {
                Order order2 = orderData.data;
                return m176643o(purchasePaymentParam, order2.paymentRequest, order2.orderId, x20Var);
            }
            if (TEnum.equals(order.orderStatus, "pending")) {
                purchasePaymentParam.orderId = orderData.data.orderId;
                return C22421c.just(PaymentApi.PaymentResultStatus.pending);
            }
            if (TEnum.equals(order.orderStatus, "success")) {
                return C22421c.just(PaymentApi.PaymentResultStatus.succeed);
            }
            if (TEnum.equals(order.orderStatus, "failed")) {
                return C22421c.just(PaymentApi.PaymentResultStatus.failed);
            }
        }
        if (!TextUtils.isEmpty(order.signAndPayRequest)) {
            return C22421c.fromCallable(new Callable() { // from class: l.ni0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f142080a.m176645q(order, x20Var);
                }
            });
        }
        Order order3 = orderData.data;
        return m176643o(purchasePaymentParam, order3.paymentRequest, order3.orderId, x20Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m176647s(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            m176642n(((TantanException.Client.CoreService) th).subCode);
        }
        m176637B(purchasePaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m176636A(purchasePaymentParam, "default", bsj0.m106290z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ PaymentApi.SignResultStatus m176648t(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m176640E(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m176639D(signPaymentParam, str2, meta2.code, meta2.message);
        Meta meta3 = orderData.meta;
        if (meta3.code != 200) {
            m176642n(meta3.subCode);
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
        m176624G(this.f157788b, orderData.data.signRequest);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m176649u(SignPaymentParam signPaymentParam, Throwable th) {
        m176640E(signPaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m176639D(signPaymentParam, "default", bsj0.m106290z(th), th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            m176635y(this.f157788b, ((TantanException.Client.CoreService) th).subCode);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ PaymentApi.SignResultStatus m176650v(Order order) throws Exception {
        return TextUtils.equals((CharSequence) new PayTask(this.f157788b).payV2(order.signAndPayRequest, true).get("resultStatus"), "9000") ? PaymentApi.SignResultStatus.succeed : PaymentApi.SignResultStatus.failed;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22421c m176651w(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m176640E(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m176639D(signPaymentParam, str2, meta2.code, meta2.message);
        Meta meta3 = orderData.meta;
        if (meta3.code != 200) {
            m176642n(meta3.subCode);
            return C22421c.just(PaymentApi.SignResultStatus.failed);
        }
        final Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        if (TextUtils.isEmpty(order.signAndPayRequest)) {
            return (TEnum.equals(orderData.data.orderStatus, "success") && TEnum.equals(orderData.data.contractStatus, "signing")) ? C22421c.just(PaymentApi.SignResultStatus.succeed) : C22421c.just(PaymentApi.SignResultStatus.failed);
        }
        return C22421c.fromCallable(new Callable() { // from class: l.oi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f147504a.m176650v(order);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m176652x(SignPaymentParam signPaymentParam, Throwable th) {
        m176640E(signPaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m176639D(signPaymentParam, "default", bsj0.m106290z(th), th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            m176635y(this.f157788b, ((TantanException.Client.CoreService) th).subCode);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m176653z(PaymentParam paymentParam) {
        lib0.INSTANCE.m154351c(this.f157787a, paymentParam.itemId, "alipay");
    }
}
