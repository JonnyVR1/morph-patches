package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.wxapi.WXPayEntryActivity;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Bill;
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
import com.tencent.mm.opensdk.modelbiz.OpenWebview;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.IOException;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.hab0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.qib0;
import l.vwb;
import l.w9j;
import l.zvf0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jfp0 implements nzl, gml {

    /* JADX INFO: renamed from: a */
    public IWXAPI f15106a;

    /* JADX INFO: renamed from: b */
    public final String f15107b;

    public jfp0(Context context, String str) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, (String) null);
        this.f15106a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        this.f15107b = str;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ c m16971i(PurchasePaymentParam purchasePaymentParam, Order order) {
        CoreModule.c.j0.f0 = false;
        return (TEnum.equals(order.orderStatus, "purchased") || TEnum.equals(order.orderStatus, "assumedPurchased")) ? qib0.T.b0(purchasePaymentParam) : c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ c m16974m(String str, final PurchasePaymentParam purchasePaymentParam, d30 d30Var, PurchasePaymentParam purchasePaymentParam2) {
        Bill bill;
        try {
            bill = (Bill) Bill.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.c(e);
            bill = null;
        }
        if (bill == null) {
            m16979v(purchasePaymentParam, "", 200, "Bill bill = null;");
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        PayReq payReq = new PayReq();
        payReq.appId = bill.appid;
        payReq.partnerId = bill.partner;
        payReq.prepayId = bill.prepay;
        payReq.packageValue = bill.packageValue;
        payReq.nonceStr = bill.noncestr;
        payReq.timeStamp = bill.timestamp;
        payReq.sign = bill.sign;
        this.f15106a.sendReq(payReq);
        CoreModule.c.j0.f0 = true;
        m16979v(purchasePaymentParam, purchasePaymentParam.orderId, 200, "OK");
        if (NullChecker.a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.G(new bii0(d30Var));
        }
        return qib0.T.Y().observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.ifp0
            public final Object call(Object obj) {
                return jfp0.m16971i(purchasePaymentParam, (Order) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ c m16975n(PurchasePaymentParam purchasePaymentParam, d30 d30Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m16978u(purchasePaymentParam, str, meta.code, meta.message);
        Meta meta2 = orderData.meta;
        int i = meta2.code;
        if (i != 200) {
            m16979v(purchasePaymentParam, "", i, meta2.message);
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        Order order = orderData.data;
        return m16984l(purchasePaymentParam, order.paymentRequest, order.orderId, d30Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m16976o(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        m16979v(purchasePaymentParam, "", yij0.m25426z(th), th.getMessage());
        m16978u(purchasePaymentParam, "default", yij0.m25426z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: t */
    private void m16977t(PaymentParam paymentParam) {
        hab0.Companion.c(this.f15107b, paymentParam.itemId, "wechat");
    }

    /* JADX INFO: renamed from: u */
    private void m16978u(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.Companion.d(this.f15107b, paymentParam.itemId, "wechat", str, i, str2);
    }

    /* JADX INFO: renamed from: v */
    private void m16979v(PaymentParam paymentParam, String str, int i, String str2) {
        zvf0.D("e_purchase_order_response", "p_purchase_page", new j760[]{vwb.Y("skuID", paymentParam.itemId), vwb.Y(ShareEventActivity.PLATFORM, "wechat"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, Integer.valueOf(i)), vwb.Y("order_id", str), vwb.Y("order_type", "pay"), vwb.Y("error_message", str2)});
    }

    /* JADX INFO: renamed from: w */
    private void m16980w(PaymentParam paymentParam) {
        hab0.Companion.e(this.f15107b, paymentParam.itemId, "wechat");
    }

    /* JADX INFO: renamed from: x */
    private void m16981x(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.Companion.f(this.f15107b, paymentParam.itemId, "wechat", str, i, str2);
    }

    /* JADX INFO: renamed from: y */
    private void m16982y(PaymentParam paymentParam, String str, int i, String str2) {
        zvf0.D("e_purchase_order_response", "p_purchase_page", new j760[]{vwb.Y("skuID", paymentParam.itemId), vwb.Y(ShareEventActivity.PLATFORM, "wechat"), vwb.Y("contract_id", str), vwb.Y("order_type", "contract"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, Integer.valueOf(i)), vwb.Y("error_message", str2)});
    }

    @Override // p009l.gml
    /* JADX INFO: renamed from: a */
    public c<PaymentApi.SignResultStatus> mo15110a(final SignPaymentParam signPaymentParam) {
        m16980w(signPaymentParam);
        ((PaymentParam) signPaymentParam).url = "/wechat/contract/signAndPay";
        return qib0.T.V(signPaymentParam).map(new w9j() { // from class: l.dfp0
            public final Object call(Object obj) {
                return this.f11824a.m16987r(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.efp0
            public final void call(Object obj) {
                this.f12544a.m16988s(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p009l.gml
    /* JADX INFO: renamed from: b */
    public c<PaymentApi.SignResultStatus> mo15111b(final SignPaymentParam signPaymentParam) {
        m16980w(signPaymentParam);
        ((PaymentParam) signPaymentParam).url = "/wechat/contract/sign";
        return qib0.T.V(signPaymentParam).map(new w9j() { // from class: l.ffp0
            public final Object call(Object obj) {
                return this.f12988a.m16985p(signPaymentParam, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.gfp0
            public final void call(Object obj) {
                this.f13524a.m16986q(signPaymentParam, (Throwable) obj);
            }
        });
    }

    @Override // p009l.nzl
    /* JADX INFO: renamed from: c */
    public c<PaymentApi.PaymentResultStatus> mo16983c(final PurchasePaymentParam purchasePaymentParam, final d30 d30Var) {
        if (!this.f15106a.isWXAppInstalled()) {
            lsi0.y(CoreModule.b.getString(R$string.f6142Y9));
        }
        ((PaymentParam) purchasePaymentParam).url = "/wechat/create-order";
        m16977t(purchasePaymentParam);
        return qib0.T.V(purchasePaymentParam).switchMap(new w9j() { // from class: l.bfp0
            public final Object call(Object obj) {
                return this.f10054a.m16975n(purchasePaymentParam, d30Var, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.cfp0
            public final void call(Object obj) {
                this.f10575a.m16976o(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public c<PaymentApi.PaymentResultStatus> m16984l(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final d30 d30Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        ((PaymentParam) purchasePaymentParamNew_).itemId = ((PaymentParam) purchasePaymentParam).itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        ((PaymentParam) purchasePaymentParamNew_).url = "/wechat/pay";
        return c.just(purchasePaymentParam).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.hfp0
            public final Object call(Object obj) {
                return this.f14060a.m16974m(str, purchasePaymentParamNew_, d30Var, (PurchasePaymentParam) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ PaymentApi.SignResultStatus m16985p(SignPaymentParam signPaymentParam, OrderData orderData) {
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m16982y(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m16981x(signPaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return PaymentApi.SignResultStatus.failed;
        }
        signPaymentParam.contractId = orderData.data.contractId;
        OpenWebview.Req req = new OpenWebview.Req();
        req.url = orderData.data.signRequest;
        this.f15106a.sendReq(req);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m16986q(SignPaymentParam signPaymentParam, Throwable th) {
        m16982y(signPaymentParam, "", yij0.m25426z(th), th.getMessage());
        m16981x(signPaymentParam, "default", yij0.m25426z(th), th.getMessage());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ PaymentApi.SignResultStatus m16987r(SignPaymentParam signPaymentParam, OrderData orderData) {
        Bill bill;
        String str = orderData.data.contractId;
        Meta meta = orderData.meta;
        m16982y(signPaymentParam, str, meta.code, meta.message);
        String str2 = orderData.data.contractId;
        Meta meta2 = orderData.meta;
        m16981x(signPaymentParam, str2, meta2.code, meta2.message);
        if (orderData.meta.code != 200) {
            return PaymentApi.SignResultStatus.failed;
        }
        Order order = orderData.data;
        signPaymentParam.contractId = order.contractId;
        try {
            bill = (Bill) Bill.JSON_ADAPTER.parse(order.signAndPayRequest);
        } catch (IOException e) {
            CrashHelper.c(e);
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
        this.f15106a.sendReq(payReq);
        return PaymentApi.SignResultStatus.toSigning;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m16988s(SignPaymentParam signPaymentParam, Throwable th) {
        m16982y(signPaymentParam, "", yij0.m25426z(th), th.getMessage());
        m16981x(signPaymentParam, "default", yij0.m25426z(th), th.getMessage());
    }
}
