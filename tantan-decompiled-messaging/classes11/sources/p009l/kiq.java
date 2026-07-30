package p009l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.jdpaysdk.author.JDPayAuthor;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.core.data.JDPayAuthorResult;
import com.p1.mobile.putong.core.data.JDPayBill;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.Order;
import com.p1.mobile.putong.data.OrderData;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.hab0;
import l.j760;
import l.jo0;
import l.qib0;
import l.vwb;
import l.w9j;
import l.z3g0;
import l.zvf0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kiq implements nzl, gml {

    /* JADX INFO: renamed from: a */
    public JDPayAuthor f15720a = new JDPayAuthor();

    /* JADX INFO: renamed from: b */
    public Act f15721b;

    /* JADX INFO: renamed from: c */
    public final String f15722c;

    /* JADX INFO: renamed from: l.kiq$a */
    public class C1000a implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f15723a;

        public C1000a(z3g0 z3g0Var) {
            this.f15723a = z3g0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m17534a(int i, int i2, Intent intent) {
            Objects.toString(intent);
            kiq.this.f15721b.unregisterOnActivityResultListener(this);
            if (i2 != 1024) {
                this.f15723a.onCompleted();
                return false;
            }
            try {
                boolean zEquals = TextUtils.equals(((JDPayAuthorResult) JDPayAuthorResult.JSON_ADAPTER.parse(intent.getStringExtra("jdpay_Result"))).payStatus, "JDP_PAY_SUCCESS");
                z3g0 z3g0Var = this.f15723a;
                if (zEquals) {
                    z3g0Var.onNext(PaymentApi.PaymentResultStatus.succeed);
                } else {
                    z3g0Var.onNext(PaymentApi.PaymentResultStatus.failed);
                }
            } catch (Exception unused) {
                this.f15723a.onNext(PaymentApi.PaymentResultStatus.failed);
            }
            this.f15723a.onCompleted();
            return true;
        }
    }

    public kiq(Context context, String str) {
        this.f15721b = (Act) context;
        this.f15722c = str;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ c m17523h(PurchasePaymentParam purchasePaymentParam, PaymentApi.PaymentResultStatus paymentResultStatus) {
        return paymentResultStatus == PaymentApi.PaymentResultStatus.succeed ? qib0.T.b0(purchasePaymentParam) : c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: p */
    private void m17525p(PaymentParam paymentParam) {
        hab0.Companion.c(this.f15722c, paymentParam.itemId, "jingdong");
    }

    /* JADX INFO: renamed from: q */
    private void m17526q(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.Companion.d(this.f15722c, paymentParam.itemId, "jingdong", str, i, str2);
    }

    /* JADX INFO: renamed from: r */
    private void m17527r(PaymentParam paymentParam, String str, int i, String str2) {
        zvf0.D("e_purchase_order_response", "p_purchase_page", new j760[]{vwb.Y("skuID", paymentParam.itemId), vwb.Y(ShareEventActivity.PLATFORM, "jingdong"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, Integer.valueOf(i)), vwb.Y("order_id", str), vwb.Y("order_type", "pay"), vwb.Y("error_message", str2)});
    }

    @Override // p009l.gml
    /* JADX INFO: renamed from: a */
    public c<PaymentApi.SignResultStatus> mo15110a(SignPaymentParam signPaymentParam) {
        return c.just(PaymentApi.SignResultStatus.failed);
    }

    @Override // p009l.gml
    /* JADX INFO: renamed from: b */
    public c<PaymentApi.SignResultStatus> mo15111b(SignPaymentParam signPaymentParam) {
        return c.just(PaymentApi.SignResultStatus.failed);
    }

    @Override // p009l.nzl
    /* JADX INFO: renamed from: c */
    public c<PaymentApi.PaymentResultStatus> mo16983c(final PurchasePaymentParam purchasePaymentParam, final d30 d30Var) {
        m17525p(purchasePaymentParam);
        ((PaymentParam) purchasePaymentParam).url = "/jingdong/create-order";
        return qib0.T.V(purchasePaymentParam).switchMap(new w9j() { // from class: l.fiq
            public final Object call(Object obj) {
                return this.f13037a.m17532n(purchasePaymentParam, d30Var, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.giq
            public final void call(Object obj) {
                this.f13590a.m17533o(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final c<PaymentApi.PaymentResultStatus> m17528j() {
        return c.create(new c.a() { // from class: l.jiq
            public final void call(Object obj) {
                this.f15188a.m17530l((z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public c<PaymentApi.PaymentResultStatus> m17529k(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final d30 d30Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        ((PaymentParam) purchasePaymentParamNew_).itemId = ((PaymentParam) purchasePaymentParam).itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        ((PaymentParam) purchasePaymentParamNew_).url = "/jingdong/pay";
        return c.just(purchasePaymentParam).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.hiq
            public final Object call(Object obj) {
                return this.f14134a.m17531m(str, purchasePaymentParamNew_, d30Var, (PurchasePaymentParam) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m17530l(z3g0 z3g0Var) {
        this.f15721b.registerOnActivityResultListener(new C1000a(z3g0Var));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ c m17531m(String str, final PurchasePaymentParam purchasePaymentParam, d30 d30Var, PurchasePaymentParam purchasePaymentParam2) {
        JDPayBill jDPayBill;
        try {
            jDPayBill = (JDPayBill) JDPayBill.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.c(e);
            jDPayBill = null;
        }
        if (jDPayBill == null) {
            m17527r(purchasePaymentParam, "", 200, "JDPayBill bill = null;");
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str2 = jDPayBill.merchant;
        String str3 = jDPayBill.appId;
        this.f15720a.author(this.f15721b, jDPayBill.orderId, str2, str3, jDPayBill.signData, (String) null);
        m17527r(purchasePaymentParam, purchasePaymentParam.orderId, 200, "OK");
        if (NullChecker.a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.G(new bii0(d30Var));
        }
        return m17528j().observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.iiq
            public final Object call(Object obj) {
                return kiq.m17523h(purchasePaymentParam, (PaymentApi.PaymentResultStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ c m17532n(PurchasePaymentParam purchasePaymentParam, d30 d30Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m17526q(purchasePaymentParam, str, meta.code, meta.message);
        Meta meta2 = orderData.meta;
        int i = meta2.code;
        if (i != 200) {
            m17527r(purchasePaymentParam, "", i, meta2.message);
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        Order order = orderData.data;
        return m17529k(purchasePaymentParam, order.paymentRequest, order.orderId, d30Var);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m17533o(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        m17527r(purchasePaymentParam, "", yij0.m25426z(th), th.getMessage());
        m17526q(purchasePaymentParam, "default", yij0.m25426z(th), th.getMessage());
    }
}
