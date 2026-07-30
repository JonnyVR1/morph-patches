package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Bill;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.data.OrderData;
import com.p046p1.mobile.putong.data.PaymentParam;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.wxapi.WXPayEntryActivity;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.modelbiz.OpenWebview;
import com.tencent.p101mm.opensdk.modelpay.PayReq;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import java.io.IOException;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class jfp0 implements nzl, gml {

    /* JADX INFO: renamed from: a */
    public IWXAPI f117682a;

    /* JADX INFO: renamed from: b */
    public final String f117683b;

    public jfp0(Context context, String str) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, null);
        this.f117682a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        this.f117683b = str;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22306c m141196i(PurchasePaymentParam purchasePaymentParam, Order order) {
        CoreModule.f17545c.f19654j0.f19293f0 = false;
        return (TEnum.equals(order.orderStatus, BundleStatus.purchased) || TEnum.equals(order.orderStatus, BundleStatus.assumedPurchased)) ? qib0.f154705T.m29592b0(purchasePaymentParam) : C22306c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ C22306c m141199m(String str, final PurchasePaymentParam purchasePaymentParam, d30 d30Var, PurchasePaymentParam purchasePaymentParam2) {
        Bill bill;
        try {
            bill = Bill.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            bill = null;
        }
        if (bill == null) {
            m141204v(purchasePaymentParam, "", 200, "Bill bill = null;");
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        PayReq payReq = new PayReq();
        payReq.appId = bill.appid;
        payReq.partnerId = bill.partner;
        payReq.prepayId = bill.prepay;
        payReq.packageValue = bill.packageValue;
        payReq.nonceStr = bill.noncestr;
        payReq.timeStamp = bill.timestamp;
        payReq.sign = bill.sign;
        this.f117682a.sendReq(payReq);
        CoreModule.f17545c.f19654j0.f19293f0 = true;
        m141204v(purchasePaymentParam, purchasePaymentParam.orderId, 200, "OK");
        if (NullChecker.m81303a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.m114742G(new bii0(d30Var));
        }
        return qib0.f154705T.m29589Y().observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.ifp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jfp0.m141196i(purchasePaymentParam, (Order) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ C22306c m141200n(PurchasePaymentParam purchasePaymentParam, d30 d30Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m141203u(purchasePaymentParam, str, meta.code, meta.message);
        Meta meta2 = orderData.meta;
        int i = meta2.code;
        if (i != 200) {
            m141204v(purchasePaymentParam, "", i, meta2.message);
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        Order order = orderData.data;
        return m141209l(purchasePaymentParam, order.paymentRequest, order.orderId, d30Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m141201o(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        m141204v(purchasePaymentParam, "", yij0.m214970z(th), th.getMessage());
        m141203u(purchasePaymentParam, "default", yij0.m214970z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: t */
    private void m141202t(PaymentParam paymentParam) {
        hab0.INSTANCE.m130129c(this.f117683b, paymentParam.itemId, "wechat");
    }

    /* JADX INFO: renamed from: u */
    private void m141203u(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.INSTANCE.m130130d(this.f117683b, paymentParam.itemId, "wechat", str, i, str2);
    }

    /* JADX INFO: renamed from: v */
    private void m141204v(PaymentParam paymentParam, String str, int i, String str2) {
        zvf0.m220371D("e_purchase_order_response", "p_purchase_page", vwb.m200311Y("skuID", paymentParam.itemId), vwb.m200311Y("platform", "wechat"), vwb.m200311Y("code", Integer.valueOf(i)), vwb.m200311Y("order_id", str), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", str2));
    }

    /* JADX INFO: renamed from: w */
    private void m141205w(PaymentParam paymentParam) {
        hab0.INSTANCE.m130131e(this.f117683b, paymentParam.itemId, "wechat");
    }

    /* JADX INFO: renamed from: x */
    private void m141206x(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.INSTANCE.m130132f(this.f117683b, paymentParam.itemId, "wechat", str, i, str2);
    }

    /* JADX INFO: renamed from: y */
    private void m141207y(PaymentParam paymentParam, String str, int i, String str2) {
        zvf0.m220371D("e_purchase_order_response", "p_purchase_page", vwb.m200311Y("skuID", paymentParam.itemId), vwb.m200311Y("platform", "wechat"), vwb.m200311Y("contract_id", str), vwb.m200311Y("order_type", "contract"), vwb.m200311Y("code", Integer.valueOf(i)), vwb.m200311Y("error_message", str2));
    }

    @Override // p149l.gml
    /* JADX INFO: renamed from: a */
    public C22306c<PaymentApi.SignResultStatus> mo127034a(final SignPaymentParam signPaymentParam) {
        m141205w(signPaymentParam);
        signPaymentParam.url = "/wechat/contract/signAndPay";
        return qib0.f154705T.m29586V(signPaymentParam).map(new w9j() { // from class: l.dfp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f85967a.m141212r(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.efp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90852a.m141213s(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p149l.gml
    /* JADX INFO: renamed from: b */
    public C22306c<PaymentApi.SignResultStatus> mo127035b(final SignPaymentParam signPaymentParam) {
        m141205w(signPaymentParam);
        signPaymentParam.url = "/wechat/contract/sign";
        return qib0.f154705T.m29586V(signPaymentParam).map(new w9j() { // from class: l.ffp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97285a.m141210p(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.gfp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102423a.m141211q(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p149l.nzl
    /* JADX INFO: renamed from: c */
    public C22306c<PaymentApi.PaymentResultStatus> mo141208c(final PurchasePaymentParam purchasePaymentParam, final d30 d30Var) {
        if (!this.f117682a.isWXAppInstalled()) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27364Y9));
        }
        purchasePaymentParam.url = "/wechat/create-order";
        m141202t(purchasePaymentParam);
        return qib0.f154705T.m29586V(purchasePaymentParam).switchMap(new w9j() { // from class: l.bfp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75343a.m141200n(purchasePaymentParam, d30Var, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.cfp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80647a.m141201o(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public C22306c<PaymentApi.PaymentResultStatus> m141209l(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final d30 d30Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.itemId = purchasePaymentParam.itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        purchasePaymentParamNew_.url = "/wechat/pay";
        return C22306c.just(purchasePaymentParam).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.hfp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107497a.m141199m(str, purchasePaymentParamNew_, d30Var, (PurchasePaymentParam) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ PaymentApi.SignResultStatus m141210p(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m141207y(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m141206x(signPaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return PaymentApi.SignResultStatus.failed;
        }
        signPaymentParam.contractId = orderData.data.contractId;
        OpenWebview.Req req = new OpenWebview.Req();
        req.url = orderData.data.signRequest;
        this.f117682a.sendReq(req);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m141211q(SignPaymentParam signPaymentParam, Throwable th) {
        m141207y(signPaymentParam, "", yij0.m214970z(th), th.getMessage());
        m141206x(signPaymentParam, "default", yij0.m214970z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ PaymentApi.SignResultStatus m141212r(SignPaymentParam signPaymentParam, OrderData orderData) {
        Bill bill;
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m141207y(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m141206x(signPaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return PaymentApi.SignResultStatus.failed;
        }
        Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        try {
            bill = Bill.JSON_ADAPTER.parse(order.signAndPayRequest);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            bill = null;
        }
        if (bill == null) {
            return PaymentApi.SignResultStatus.toSigning;
        }
        PayReq payReq = new PayReq();
        payReq.appId = bill.appid;
        payReq.partnerId = bill.partner;
        payReq.prepayId = bill.prepay;
        payReq.packageValue = bill.packageValue;
        payReq.nonceStr = bill.noncestr;
        payReq.timeStamp = bill.timestamp;
        payReq.sign = bill.sign;
        this.f117682a.sendReq(payReq);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m141213s(SignPaymentParam signPaymentParam, Throwable th) {
        m141207y(signPaymentParam, "", yij0.m214970z(th), th.getMessage());
        m141206x(signPaymentParam, "default", yij0.m214970z(th), th.getMessage());
    }
}
