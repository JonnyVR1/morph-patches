package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.jdpaysdk.author.JDPayAuthor;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.data.JDPayAuthorResult;
import com.p046p1.mobile.putong.core.data.JDPayBill;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.data.OrderData;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PaymentParam;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class kiq implements nzl, gml {

    /* JADX INFO: renamed from: a */
    public JDPayAuthor f123376a = new JDPayAuthor();

    /* JADX INFO: renamed from: b */
    public Act f123377b;

    /* JADX INFO: renamed from: c */
    public final String f123378c;

    /* JADX INFO: renamed from: l.kiq$a */
    public class C18024a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f123379a;

        public C18024a(z3g0 z3g0Var) {
            this.f123379a = z3g0Var;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            Objects.toString(intent);
            kiq.this.f123377b.unregisterOnActivityResultListener(this);
            if (i2 != 1024) {
                this.f123379a.onCompleted();
                return false;
            }
            try {
                boolean zEquals = TextUtils.equals(JDPayAuthorResult.JSON_ADAPTER.parse(intent.getStringExtra("jdpay_Result")).payStatus, "JDP_PAY_SUCCESS");
                z3g0 z3g0Var = this.f123379a;
                if (zEquals) {
                    z3g0Var.m132487l(PaymentApi.PaymentResultStatus.succeed);
                } else {
                    z3g0Var.m132487l(PaymentApi.PaymentResultStatus.failed);
                }
            } catch (Exception unused) {
                this.f123379a.m132487l(PaymentApi.PaymentResultStatus.failed);
            }
            this.f123379a.onCompleted();
            return true;
        }
    }

    public kiq(Context context, String str) {
        this.f123377b = (Act) context;
        this.f123378c = str;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22306c m146116h(PurchasePaymentParam purchasePaymentParam, PaymentApi.PaymentResultStatus paymentResultStatus) {
        return paymentResultStatus == PaymentApi.PaymentResultStatus.succeed ? qib0.f154705T.m29592b0(purchasePaymentParam) : C22306c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: p */
    private void m146118p(PaymentParam paymentParam) {
        hab0.INSTANCE.m130129c(this.f123378c, paymentParam.itemId, PayMethod.jingdong);
    }

    /* JADX INFO: renamed from: q */
    private void m146119q(PaymentParam paymentParam, String str, int i, String str2) {
        hab0.INSTANCE.m130130d(this.f123378c, paymentParam.itemId, PayMethod.jingdong, str, i, str2);
    }

    /* JADX INFO: renamed from: r */
    private void m146120r(PaymentParam paymentParam, String str, int i, String str2) {
        zvf0.m220371D("e_purchase_order_response", "p_purchase_page", vwb.m200311Y("skuID", paymentParam.itemId), vwb.m200311Y("platform", PayMethod.jingdong), vwb.m200311Y("code", Integer.valueOf(i)), vwb.m200311Y("order_id", str), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", str2));
    }

    @Override // p149l.gml
    /* JADX INFO: renamed from: a */
    public C22306c<PaymentApi.SignResultStatus> mo127034a(SignPaymentParam signPaymentParam) {
        return C22306c.just(PaymentApi.SignResultStatus.failed);
    }

    @Override // p149l.gml
    /* JADX INFO: renamed from: b */
    public C22306c<PaymentApi.SignResultStatus> mo127035b(SignPaymentParam signPaymentParam) {
        return C22306c.just(PaymentApi.SignResultStatus.failed);
    }

    @Override // p149l.nzl
    /* JADX INFO: renamed from: c */
    public C22306c<PaymentApi.PaymentResultStatus> mo141208c(final PurchasePaymentParam purchasePaymentParam, final d30 d30Var) {
        m146118p(purchasePaymentParam);
        purchasePaymentParam.url = "/jingdong/create-order";
        return qib0.f154705T.m29586V(purchasePaymentParam).switchMap(new w9j() { // from class: l.fiq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97708a.m146125n(purchasePaymentParam, d30Var, (OrderData) obj);
            }
        }).doOnError(new e30() { // from class: l.giq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102953a.m146126o(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final C22306c<PaymentApi.PaymentResultStatus> m146121j() {
        return C22306c.create(new C22306c.a() { // from class: l.jiq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118127a.m146123l((z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public C22306c<PaymentApi.PaymentResultStatus> m146122k(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final d30 d30Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.itemId = purchasePaymentParam.itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        purchasePaymentParamNew_.url = "/jingdong/pay";
        return C22306c.just(purchasePaymentParam).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.hiq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107954a.m146124m(str, purchasePaymentParamNew_, d30Var, (PurchasePaymentParam) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m146123l(z3g0 z3g0Var) {
        this.f123377b.registerOnActivityResultListener(new C18024a(z3g0Var));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C22306c m146124m(String str, final PurchasePaymentParam purchasePaymentParam, d30 d30Var, PurchasePaymentParam purchasePaymentParam2) {
        JDPayBill jDPayBill;
        try {
            jDPayBill = JDPayBill.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            jDPayBill = null;
        }
        if (jDPayBill == null) {
            m146120r(purchasePaymentParam, "", 200, "JDPayBill bill = null;");
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str2 = jDPayBill.merchant;
        String str3 = jDPayBill.appId;
        this.f123376a.author(this.f123377b, jDPayBill.orderId, str2, str3, jDPayBill.signData, (String) null);
        m146120r(purchasePaymentParam, purchasePaymentParam.orderId, 200, "OK");
        if (NullChecker.m81303a(d30Var)) {
            Objects.requireNonNull(d30Var);
            e51.m114742G(new bii0(d30Var));
        }
        return m146121j().observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.iiq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return kiq.m146116h(purchasePaymentParam, (PaymentApi.PaymentResultStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C22306c m146125n(PurchasePaymentParam purchasePaymentParam, d30 d30Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m146119q(purchasePaymentParam, str, meta.code, meta.message);
        Meta meta2 = orderData.meta;
        int i = meta2.code;
        if (i != 200) {
            m146120r(purchasePaymentParam, "", i, meta2.message);
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        Order order = orderData.data;
        return m146122k(purchasePaymentParam, order.paymentRequest, order.orderId, d30Var);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m146126o(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        m146120r(purchasePaymentParam, "", yij0.m214970z(th), th.getMessage());
        m146119q(purchasePaymentParam, "default", yij0.m214970z(th), th.getMessage());
    }
}
