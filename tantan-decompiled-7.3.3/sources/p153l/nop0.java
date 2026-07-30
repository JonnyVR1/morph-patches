package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Bill;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.data.OrderData;
import com.p051p1.mobile.putong.data.PaymentParam;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.wxapi.WXPayEntryActivity;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.modelbiz.OpenWebview;
import com.tencent.p106mm.opensdk.modelpay.PayReq;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import java.io.IOException;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class nop0 implements h2m, sol {

    /* JADX INFO: renamed from: a */
    public IWXAPI f143012a;

    /* JADX INFO: renamed from: b */
    public final String f143013b;

    public nop0(Context context, String str) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, null);
        this.f143012a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        this.f143013b = str;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22421c m164164i(PurchasePaymentParam purchasePaymentParam, Order order) {
        CoreModule.f18264c.f20396j0.f20035f0 = false;
        return (TEnum.equals(order.orderStatus, BundleStatus.purchased) || TEnum.equals(order.orderStatus, BundleStatus.assumedPurchased)) ? uqb0.f180388T.m30590b0(purchasePaymentParam) : C22421c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ C22421c m164167m(String str, final PurchasePaymentParam purchasePaymentParam, x20 x20Var, PurchasePaymentParam purchasePaymentParam2) {
        Bill bill;
        try {
            bill = Bill.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            bill = null;
        }
        if (bill == null) {
            m164172v(purchasePaymentParam, "", 200, "Bill bill = null;");
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        PayReq payReq = new PayReq();
        payReq.appId = bill.appid;
        payReq.partnerId = bill.partner;
        payReq.prepayId = bill.prepay;
        payReq.packageValue = bill.packageValue;
        payReq.nonceStr = bill.noncestr;
        payReq.timeStamp = bill.timestamp;
        payReq.sign = bill.sign;
        this.f143012a.sendReq(payReq);
        CoreModule.f18264c.f20396j0.f20035f0 = true;
        m164172v(purchasePaymentParam, purchasePaymentParam.orderId, 200, "OK");
        if (NullChecker.m82486a(x20Var)) {
            Objects.requireNonNull(x20Var);
            l51.m152887G(new bri0(x20Var));
        }
        return uqb0.f180388T.m30587Y().observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.mop0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return nop0.m164164i(purchasePaymentParam, (Order) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ C22421c m164168n(PurchasePaymentParam purchasePaymentParam, x20 x20Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m164171u(purchasePaymentParam, str, meta.code, meta.message);
        Meta meta2 = orderData.meta;
        int i = meta2.code;
        if (i != 200) {
            m164172v(purchasePaymentParam, "", i, meta2.message);
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        Order order = orderData.data;
        return m164176l(purchasePaymentParam, order.paymentRequest, order.orderId, x20Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m164169o(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        m164172v(purchasePaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m164171u(purchasePaymentParam, "default", bsj0.m106290z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: t */
    private void m164170t(PaymentParam paymentParam) {
        lib0.INSTANCE.m154351c(this.f143013b, paymentParam.itemId, "wechat");
    }

    /* JADX INFO: renamed from: u */
    private void m164171u(PaymentParam paymentParam, String str, int i, String str2) {
        lib0.INSTANCE.m154352d(this.f143013b, paymentParam.itemId, "wechat", str, i, str2);
    }

    /* JADX INFO: renamed from: v */
    private void m164172v(PaymentParam paymentParam, String str, int i, String str2) {
        i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", paymentParam.itemId), jyb.m147494Y("platform", "wechat"), jyb.m147494Y("code", Integer.valueOf(i)), jyb.m147494Y("order_id", str), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", str2));
    }

    /* JADX INFO: renamed from: w */
    private void m164173w(PaymentParam paymentParam) {
        lib0.INSTANCE.m154353e(this.f143013b, paymentParam.itemId, "wechat");
    }

    /* JADX INFO: renamed from: x */
    private void m164174x(PaymentParam paymentParam, String str, int i, String str2) {
        lib0.INSTANCE.m154354f(this.f143013b, paymentParam.itemId, "wechat", str, i, str2);
    }

    /* JADX INFO: renamed from: y */
    private void m164175y(PaymentParam paymentParam, String str, int i, String str2) {
        i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", paymentParam.itemId), jyb.m147494Y("platform", "wechat"), jyb.m147494Y("contract_id", str), jyb.m147494Y("order_type", "contract"), jyb.m147494Y("code", Integer.valueOf(i)), jyb.m147494Y("error_message", str2));
    }

    @Override // p153l.sol
    /* JADX INFO: renamed from: a */
    public C22421c<PaymentApi.SignResultStatus> mo150322a(final SignPaymentParam signPaymentParam) {
        m164173w(signPaymentParam);
        signPaymentParam.url = "/wechat/contract/signAndPay";
        return uqb0.f180388T.m30584V(signPaymentParam).map(new qcj() { // from class: l.hop0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110941a.m164179r(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new y20() { // from class: l.iop0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116192a.m164180s(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p153l.sol
    /* JADX INFO: renamed from: b */
    public C22421c<PaymentApi.SignResultStatus> mo150323b(final SignPaymentParam signPaymentParam) {
        m164173w(signPaymentParam);
        signPaymentParam.url = "/wechat/contract/sign";
        return uqb0.f180388T.m30584V(signPaymentParam).map(new qcj() { // from class: l.jop0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122048a.m164177p(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new y20() { // from class: l.kop0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127787a.m164178q(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p153l.h2m
    /* JADX INFO: renamed from: c */
    public C22421c<PaymentApi.PaymentResultStatus> mo133394c(final PurchasePaymentParam purchasePaymentParam, final x20 x20Var) {
        if (!this.f143012a.isWXAppInstalled()) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28212Y9));
        }
        purchasePaymentParam.url = "/wechat/create-order";
        m164170t(purchasePaymentParam);
        return uqb0.f180388T.m30584V(purchasePaymentParam).switchMap(new qcj() { // from class: l.fop0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100084a.m164168n(purchasePaymentParam, x20Var, (OrderData) obj);
            }
        }).doOnError(new y20() { // from class: l.gop0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105332a.m164169o(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public C22421c<PaymentApi.PaymentResultStatus> m164176l(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final x20 x20Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.itemId = purchasePaymentParam.itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        purchasePaymentParamNew_.url = "/wechat/pay";
        return C22421c.just(purchasePaymentParam).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.lop0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132925a.m164167m(str, purchasePaymentParamNew_, x20Var, (PurchasePaymentParam) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ PaymentApi.SignResultStatus m164177p(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m164175y(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m164174x(signPaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return PaymentApi.SignResultStatus.failed;
        }
        signPaymentParam.contractId = orderData.data.contractId;
        OpenWebview.Req req = new OpenWebview.Req();
        req.url = orderData.data.signRequest;
        this.f143012a.sendReq(req);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m164178q(SignPaymentParam signPaymentParam, Throwable th) {
        m164175y(signPaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m164174x(signPaymentParam, "default", bsj0.m106290z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ PaymentApi.SignResultStatus m164179r(SignPaymentParam signPaymentParam, OrderData orderData) {
        Bill bill;
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m164175y(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m164174x(signPaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return PaymentApi.SignResultStatus.failed;
        }
        Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        try {
            bill = Bill.JSON_ADAPTER.parse(order.signAndPayRequest);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
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
        this.f143012a.sendReq(payReq);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m164180s(SignPaymentParam signPaymentParam, Throwable th) {
        m164175y(signPaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m164174x(signPaymentParam, "default", bsj0.m106290z(th), th.getMessage());
    }
}
