package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.jdpaysdk.author.JDPayAuthor;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.data.JDPayAuthorResult;
import com.p051p1.mobile.putong.core.data.JDPayBill;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.data.OrderData;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PaymentParam;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class kkq implements h2m, sol {

    /* JADX INFO: renamed from: a */
    public JDPayAuthor f127274a = new JDPayAuthor();

    /* JADX INFO: renamed from: b */
    public Act f127275b;

    /* JADX INFO: renamed from: c */
    public final String f127276c;

    /* JADX INFO: renamed from: l.kkq$a */
    public class C18202a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f127277a;

        public C18202a(gcg0 gcg0Var) {
            this.f127277a = gcg0Var;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            Objects.toString(intent);
            kkq.this.f127275b.unregisterOnActivityResultListener(this);
            if (i2 != 1024) {
                this.f127277a.onCompleted();
                return false;
            }
            try {
                boolean zEquals = TextUtils.equals(JDPayAuthorResult.JSON_ADAPTER.parse(intent.getStringExtra("jdpay_Result")).payStatus, "JDP_PAY_SUCCESS");
                gcg0 gcg0Var = this.f127277a;
                if (zEquals) {
                    gcg0Var.m137019l(PaymentApi.PaymentResultStatus.succeed);
                } else {
                    gcg0Var.m137019l(PaymentApi.PaymentResultStatus.failed);
                }
            } catch (Exception unused) {
                this.f127277a.m137019l(PaymentApi.PaymentResultStatus.failed);
            }
            this.f127277a.onCompleted();
            return true;
        }
    }

    public kkq(Context context, String str) {
        this.f127275b = (Act) context;
        this.f127276c = str;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22421c m150317h(PurchasePaymentParam purchasePaymentParam, PaymentApi.PaymentResultStatus paymentResultStatus) {
        return paymentResultStatus == PaymentApi.PaymentResultStatus.succeed ? uqb0.f180388T.m30590b0(purchasePaymentParam) : C22421c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: p */
    private void m150319p(PaymentParam paymentParam) {
        lib0.INSTANCE.m154351c(this.f127276c, paymentParam.itemId, PayMethod.jingdong);
    }

    /* JADX INFO: renamed from: q */
    private void m150320q(PaymentParam paymentParam, String str, int i, String str2) {
        lib0.INSTANCE.m154352d(this.f127276c, paymentParam.itemId, PayMethod.jingdong, str, i, str2);
    }

    /* JADX INFO: renamed from: r */
    private void m150321r(PaymentParam paymentParam, String str, int i, String str2) {
        i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", paymentParam.itemId), jyb.m147494Y("platform", PayMethod.jingdong), jyb.m147494Y("code", Integer.valueOf(i)), jyb.m147494Y("order_id", str), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", str2));
    }

    @Override // p153l.sol
    /* JADX INFO: renamed from: a */
    public C22421c<PaymentApi.SignResultStatus> mo150322a(SignPaymentParam signPaymentParam) {
        return C22421c.just(PaymentApi.SignResultStatus.failed);
    }

    @Override // p153l.sol
    /* JADX INFO: renamed from: b */
    public C22421c<PaymentApi.SignResultStatus> mo150323b(SignPaymentParam signPaymentParam) {
        return C22421c.just(PaymentApi.SignResultStatus.failed);
    }

    @Override // p153l.h2m
    /* JADX INFO: renamed from: c */
    public C22421c<PaymentApi.PaymentResultStatus> mo133394c(final PurchasePaymentParam purchasePaymentParam, final x20 x20Var) {
        m150319p(purchasePaymentParam);
        purchasePaymentParam.url = "/jingdong/create-order";
        return uqb0.f180388T.m30584V(purchasePaymentParam).switchMap(new qcj() { // from class: l.fkq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99550a.m150328n(purchasePaymentParam, x20Var, (OrderData) obj);
            }
        }).doOnError(new y20() { // from class: l.gkq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104757a.m150329o(purchasePaymentParam, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final C22421c<PaymentApi.PaymentResultStatus> m150324j() {
        return C22421c.create(new C22421c.a() { // from class: l.jkq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121441a.m150326l((gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public C22421c<PaymentApi.PaymentResultStatus> m150325k(PurchasePaymentParam purchasePaymentParam, final String str, String str2, final x20 x20Var) {
        final PurchasePaymentParam purchasePaymentParamNew_ = PurchasePaymentParam.new_();
        purchasePaymentParamNew_.itemId = purchasePaymentParam.itemId;
        purchasePaymentParamNew_.quantity = purchasePaymentParam.quantity;
        purchasePaymentParamNew_.orderId = str2;
        purchasePaymentParamNew_.url = "/jingdong/pay";
        return C22421c.just(purchasePaymentParam).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.hkq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110446a.m150327m(str, purchasePaymentParamNew_, x20Var, (PurchasePaymentParam) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m150326l(gcg0 gcg0Var) {
        this.f127275b.registerOnActivityResultListener(new C18202a(gcg0Var));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C22421c m150327m(String str, final PurchasePaymentParam purchasePaymentParam, x20 x20Var, PurchasePaymentParam purchasePaymentParam2) {
        JDPayBill jDPayBill;
        try {
            jDPayBill = JDPayBill.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            jDPayBill = null;
        }
        if (jDPayBill == null) {
            m150321r(purchasePaymentParam, "", 200, "JDPayBill bill = null;");
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str2 = jDPayBill.merchant;
        String str3 = jDPayBill.appId;
        this.f127274a.author(this.f127275b, jDPayBill.orderId, str2, str3, jDPayBill.signData, (String) null);
        m150321r(purchasePaymentParam, purchasePaymentParam.orderId, 200, "OK");
        if (NullChecker.m82486a(x20Var)) {
            Objects.requireNonNull(x20Var);
            l51.m152887G(new bri0(x20Var));
        }
        return m150324j().observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.ikq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kkq.m150317h(purchasePaymentParam, (PaymentApi.PaymentResultStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C22421c m150328n(PurchasePaymentParam purchasePaymentParam, x20 x20Var, OrderData orderData) {
        String str = orderData.data.orderId;
        Meta meta = orderData.meta;
        m150320q(purchasePaymentParam, str, meta.code, meta.message);
        Meta meta2 = orderData.meta;
        int i = meta2.code;
        if (i != 200) {
            m150321r(purchasePaymentParam, "", i, meta2.message);
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        Order order = orderData.data;
        return m150325k(purchasePaymentParam, order.paymentRequest, order.orderId, x20Var);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m150329o(PurchasePaymentParam purchasePaymentParam, Throwable th) {
        m150321r(purchasePaymentParam, "", bsj0.m106290z(th), th.getMessage());
        m150320q(purchasePaymentParam, "default", bsj0.m106290z(th), th.getMessage());
    }
}
