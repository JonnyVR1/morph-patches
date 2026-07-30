package p009l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.app.PayTask;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.Order;
import com.p1.mobile.putong.data.OrderData;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import l.d30;
import l.e30;
import l.e51;
import l.hab0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.qib0;
import l.qkq0;
import l.ura;
import l.vwb;
import l.w9j;
import l.zvf0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ui0 implements nzl, gml {

    /* JADX INFO: renamed from: a */
    public final String f21198a;

    /* JADX INFO: renamed from: b */
    public Activity f21199b;

    static {
        EnvUtils.setEnv(EnvUtils.EnvEnum.ONLINE);
    }

    public ui0(Context context, String str) {
        this.f21199b = (Activity) context;
        this.f21198a = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m23024G(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + str));
        if (intent.resolveActivityInfo(context.getPackageManager(), 131072) != null) {
            context.startActivity(intent);
        } else {
            qkq0.a("alipay");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PaymentApi.PaymentResultStatus m23026e(Boolean bool) {
        return bool.booleanValue() ? PaymentApi.PaymentResultStatus.toSigning : PaymentApi.PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: y */
    public static void m23035y(Activity activity, int i) {
        switch (i) {
            case 48803:
                lsi0.j(activity.getString(R$string.f6051Q6));
                break;
            case 48804:
                break;
            case 48805:
                lsi0.j(activity.getString(R$string.f6073S6));
                break;
            default:
                lsi0.j(activity.getString(R$string.f6073S6));
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m23036A(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.Companion.d(this.f21198a, paymentParam.itemId, "alipay", str, i, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m23037B(PaymentParam paymentParam, String str, int i, String str2) {
        ArrayList arrayListF0 = vwb.f0(new j760[]{vwb.Y("skuID", paymentParam.itemId), vwb.Y(ShareEventActivity.PLATFORM, "alipay"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, Integer.valueOf(i)), vwb.Y("order_id", str), vwb.Y("order_type", "pay"), vwb.Y("error_message", str2)});
        if (ura.e().d().U()) {
            arrayListF0.add(vwb.Y("no_secret_payment", Boolean.valueOf(CoreModule.c.O0.n3())));
            arrayListF0.add(vwb.Y("user_secret_staus", CoreModule.c.O0.D3()));
        }
        zvf0.D("e_purchase_order_response", "p_purchase_page", (j760[]) arrayListF0.toArray(new j760[arrayListF0.size()]));
    }

    /* JADX INFO: renamed from: C */
    public final void m23038C(PaymentParam paymentParam) {
        hab0.Companion.e(this.f21198a, paymentParam.itemId, "alipay");
    }

    /* JADX INFO: renamed from: D */
    public final void m23039D(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.Companion.f(this.f21198a, paymentParam.itemId, "alipay", str, i, str2);
    }

    /* JADX INFO: renamed from: E */
    public void m23040E(PaymentParam paymentParam, String str, int i, String str2) {
        ArrayList arrayListF0 = vwb.f0(new j760[]{vwb.Y("skuID", paymentParam.itemId), vwb.Y(ShareEventActivity.PLATFORM, "alipay"), vwb.Y("contract_id", str), vwb.Y("order_type", "contract"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, Integer.valueOf(i)), vwb.Y("error_message", str2)});
        if (ura.e().d().U()) {
            arrayListF0.add(vwb.Y("no_secret_payment", Boolean.valueOf(CoreModule.c.O0.n3())));
            arrayListF0.add(vwb.Y("user_secret_staus", CoreModule.c.O0.D3()));
        }
        zvf0.D("e_purchase_order_response", "p_purchase_page", (j760[]) arrayListF0.toArray(new j760[arrayListF0.size()]));
    }

    /* JADX INFO: renamed from: F */
    public c<Boolean> m23041F(String str, PaymentParam paymentParam) throws Exception {
        try {
            m23024G(this.f21199b, str);
            return c.just(Boolean.TRUE);
        } catch (Exception e) {
            if ((e instanceof IllegalStateException) && TextUtils.equals(e.getMessage(), "alipay")) {
                throw e;
            }
            CrashHelper.c(e);
            m23040E(paymentParam, "", yij0.m25426z(e), e.getMessage());
            m23039D(paymentParam, "default", yij0.m25426z(e), e.getMessage());
            return c.just(Boolean.FALSE);
        }
    }

    @Override // p009l.gml
    /* JADX INFO: renamed from: a */
    public c<PaymentApi.SignResultStatus> mo15110a(final SignPaymentParam signPaymentParam) {
        ((PaymentParam) signPaymentParam).url = "/alipay/contract/signAndPay";
        m23038C(signPaymentParam);
        return qib0.T.V(signPaymentParam).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.oi0
            public final Object call(Object obj) {
                return this.f18055a.m23051w(signPaymentParam, (OrderData) obj);
            }
        }).observeOn(jo0.a()).doOnError(new e30() { // from class: l.pi0
            public final void call(Object obj) {
                this.f18595a.m23052x(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p009l.gml
    /* JADX INFO: renamed from: b */
    public c<PaymentApi.SignResultStatus> mo15111b(final SignPaymentParam signPaymentParam) {
        ((PaymentParam) signPaymentParam).url = "/alipay/contract/sign";
        m23038C(signPaymentParam);
        return qib0.T.V(signPaymentParam).map(new w9j() { // from class: l.mi0
            public final Object call(Object obj) {
                return this.f16926a.m23048t(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.ni0
            public final void call(Object obj) {
                this.f17477a.m23049u(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p009l.nzl
    /* JADX INFO: renamed from: c */
    public c<PaymentApi.PaymentResultStatus> mo16983c(final PurchasePaymentParam purchasePaymentParam, final d30 d30Var) {
        ((PaymentParam) purchasePaymentParam).url = "/alipay/create-order";
        m23053z(purchasePaymentParam);
        final boolean z = ((PaymentParam) purchasePaymentParam).useAutoDeduct;
        return qib0.T.V(purchasePaymentParam).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.ki0
            public final Object call(Object obj) {
                return this.f15693a.m23046r(purchasePaymentParam, z, d30Var, (OrderData) obj);
            }
        }).observeOn(jo0.a()).doOnError(new e30() { // from class: l.li0
            public final void call(Object obj) {
                this.f16167a.m23047s(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m23042n(int i) {
        if (ura.e().d().U() && i == 48803) {
            lsi0.j(this.f21199b.getString(R$string.f6051Q6));
        }
    }

    /* JADX INFO: renamed from: o */
    public c<PaymentApi.PaymentResultStatus> m23043o(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final d30 d30Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        ((PaymentParam) purchasePaymentParamNew_).url = "/alipay/pay";
        ((PaymentParam) purchasePaymentParamNew_).itemId = ((PaymentParam) purchasePaymentParam).itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        return c.just(purchasePaymentParam).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.ti0
            public final Object call(Object obj) {
                return this.f20704a.m23044p(str, d30Var, purchasePaymentParamNew_, (PurchasePaymentParam) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ c m23044p(String str, d30 d30Var, PurchasePaymentParam purchasePaymentParam, PurchasePaymentParam purchasePaymentParam2) {
        Map mapPayV2 = new PayTask(this.f21199b).payV2(str, false);
        if (NullChecker.a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.G(new bii0(d30Var));
        }
        ((PaymentParam) purchasePaymentParam).receipt = (String) mapPayV2.get("result");
        return TextUtils.equals((CharSequence) mapPayV2.get("resultStatus"), "9000") ? qib0.T.b0(purchasePaymentParam) : c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ PaymentApi.PaymentResultStatus m23045q(Order order, d30 d30Var) throws Exception {
        Map mapPayV2 = new PayTask(this.f21199b).payV2(order.signAndPayRequest, true);
        if (NullChecker.a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.G(new bii0(d30Var));
        }
        return TextUtils.equals((CharSequence) mapPayV2.get("resultStatus"), "9000") ? PaymentApi.PaymentResultStatus.succeed : PaymentApi.PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ c m23046r(PurchasePaymentParam purchasePaymentParam, boolean z, final d30 d30Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m23037B(purchasePaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.orderId;
        Meta meta2 = orderData.meta;
        m23036A(purchasePaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        final Order order = orderData.data;
        if (z) {
            if (!TextUtils.isEmpty(order.signRequest)) {
                return m23041F(order.signRequest, purchasePaymentParam).map(new w9j() { // from class: l.qi0
                    public final Object call(Object obj) {
                        return ui0.m23026e((Boolean) obj);
                    }
                });
            }
            if (!TextUtils.isEmpty(order.paymentRequest)) {
                Order order2 = orderData.data;
                return m23043o(purchasePaymentParam, order2.paymentRequest, order2.orderId, d30Var);
            }
            if (TEnum.equals(order.orderStatus, "pending")) {
                purchasePaymentParam.orderId = orderData.data.orderId;
                return c.just(PaymentApi.PaymentResultStatus.pending);
            }
            if (TEnum.equals(order.orderStatus, "success")) {
                return c.just(PaymentApi.PaymentResultStatus.succeed);
            }
            if (TEnum.equals(order.orderStatus, "failed")) {
                return c.just(PaymentApi.PaymentResultStatus.failed);
            }
        }
        if (!TextUtils.isEmpty(order.signAndPayRequest)) {
            return c.fromCallable(new Callable() { // from class: l.ri0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f19841a.m23045q(order, d30Var);
                }
            });
        }
        Order order3 = orderData.data;
        return m23043o(purchasePaymentParam, order3.paymentRequest, order3.orderId, d30Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m23047s(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            m23042n(((TantanException.Client.CoreService) th).subCode);
        }
        m23037B(purchasePaymentParam, "", yij0.m25426z(th), th.getMessage());
        m23036A(purchasePaymentParam, "default", yij0.m25426z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ PaymentApi.SignResultStatus m23048t(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m23040E(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m23039D(signPaymentParam, str2, meta2.code, meta2.message);
        Meta meta3 = orderData.meta;
        if (meta3.code != 200) {
            m23042n(meta3.subCode);
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
        m23024G(this.f21199b, orderData.data.signRequest);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m23049u(SignPaymentParam signPaymentParam, Throwable th) {
        m23040E(signPaymentParam, "", yij0.m25426z(th), th.getMessage());
        m23039D(signPaymentParam, "default", yij0.m25426z(th), th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            m23035y(this.f21199b, ((TantanException.Client.CoreService) th).subCode);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ PaymentApi.SignResultStatus m23050v(Order order) throws Exception {
        return TextUtils.equals((CharSequence) new PayTask(this.f21199b).payV2(order.signAndPayRequest, true).get("resultStatus"), "9000") ? PaymentApi.SignResultStatus.succeed : PaymentApi.SignResultStatus.failed;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ c m23051w(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m23040E(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m23039D(signPaymentParam, str2, meta2.code, meta2.message);
        Meta meta3 = orderData.meta;
        if (meta3.code != 200) {
            m23042n(meta3.subCode);
            return c.just(PaymentApi.SignResultStatus.failed);
        }
        final Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        if (TextUtils.isEmpty(order.signAndPayRequest)) {
            return (TEnum.equals(orderData.data.orderStatus, "success") && TEnum.equals(orderData.data.contractStatus, "signing")) ? c.just(PaymentApi.SignResultStatus.succeed) : c.just(PaymentApi.SignResultStatus.failed);
        }
        return c.fromCallable(new Callable() { // from class: l.si0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20271a.m23050v(order);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m23052x(SignPaymentParam signPaymentParam, Throwable th) {
        m23040E(signPaymentParam, "", yij0.m25426z(th), th.getMessage());
        m23039D(signPaymentParam, "default", yij0.m25426z(th), th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            m23035y(this.f21199b, ((TantanException.Client.CoreService) th).subCode);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m23053z(PaymentParam paymentParam) {
        hab0.Companion.c(this.f21198a, paymentParam.itemId, "alipay");
    }
}
