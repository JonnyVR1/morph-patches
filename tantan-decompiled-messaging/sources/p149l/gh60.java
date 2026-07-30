package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class gh60 extends z3g0<PaymentApi.PaymentResultStatus> {

    /* JADX INFO: renamed from: e */
    public final Act f102631e;

    /* JADX INFO: renamed from: f */
    public final PurchaseType f102632f;

    /* JADX INFO: renamed from: g */
    public final e30<l6b0> f102633g;

    /* JADX INFO: renamed from: h */
    public ue50 f102634h;

    /* JADX INFO: renamed from: i */
    public PurchasePaymentParam f102635i;

    /* JADX INFO: renamed from: j */
    public l6b0 f102636j;

    public gh60(Act act, PurchaseType purchaseType, e30<l6b0> e30Var, l6b0 l6b0Var) {
        this.f102631e = act;
        this.f102632f = purchaseType;
        this.f102633g = e30Var;
        this.f102636j = l6b0Var;
        this.f102635i = l6b0Var.f126250a;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m126154h() {
        we60.m202849N();
        lsi0.m151593w(R$string.f27208K7);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m126156j() {
        return this.f102635i.useAutoDeduct;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m126157k(View view) {
        if (sd60.m183464o()) {
            zvf0.m220396r("e_purchase_retry_button", "p_purchase_pay_fail_page");
            this.f102633g.call(this.f102636j);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m126158l() {
        e51.m114743H(this.f102631e, new Runnable() { // from class: l.dh60
            @Override // java.lang.Runnable
            public final void run() {
                gh60.m126154h();
            }
        }, 2000L);
    }

    @Override // p149l.m250
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m132487l(PaymentApi.PaymentResultStatus paymentResultStatus) {
        unsubscribe();
        this.f102631e.progressDismiss();
        boolean zM126156j = m126156j();
        if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
            ah60.m96368C(this.f102632f);
            ah60.m96369D(this.f102632f, "");
            PurchaseType purchaseType = this.f102632f;
            if (zM126156j) {
                sd60.m183448B(purchaseType);
                if (sab0.m182889g(this.f102632f)) {
                    we60.m202849N();
                } else {
                    m126158l();
                }
            } else if (sab0.m182891i(purchaseType)) {
                CoreModule.f17545c.f19555C0.m210115x4();
            }
            this.f102634h.mo30846c();
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.failed) {
            if (zM126156j) {
                we60.m202855T(this.f102631e);
                this.f102634h.mo30845a();
                CoreModule.f17545c.f19591O0.m30075C3();
            } else {
                m126161o();
            }
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.toSigning) {
            we60.m202849N();
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.pending) {
            PurchasePaymentParam purchasePaymentParam = this.f102635i;
            ah60.m96373H(purchasePaymentParam.orderId, new yi1(purchasePaymentParam, false, this.f102632f));
        }
        lc60.m149282b().mo149284a(this.f102636j, this.f102632f, paymentResultStatus);
    }

    /* JADX INFO: renamed from: n */
    public void m126160n(ue50 ue50Var) {
        this.f102634h = ue50Var;
    }

    /* JADX INFO: renamed from: o */
    public void m126161o() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_pay_fail_page", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorName", "");
            u4e.m191726a(jSONObject, "passive", "alert", "alert_system", "purchase_button", "purchase_page", "pay_fail");
            jSONObject.put("category", this.f102632f.productCategory().name());
            jSONObject.put("purchase_id", this.f102635i.getPurchaseTrackId());
            cwf0VarM133794c.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        new xh0.C21150a(this.f102631e).m208740s(this.f102631e.string(R$string.f27331V9)).m208731j(this.f102631e.string(R$string.f27309T9)).m208738q(R$string.f27320U9).m208736o(new View.OnClickListener() { // from class: l.eh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91304a.m126157k(view);
            }
        }).m208726e(R$string.f27376a).m208734m(new DialogInterface.OnDismissListener() { // from class: l.fh60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        if ((th instanceof IllegalStateException) && TextUtils.equals(th.getMessage(), "alipay")) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27298S9));
        } else {
            CrashHelper.m81296c(th);
        }
        unsubscribe();
        this.f102631e.progressDismiss();
        if (NullChecker.m81303a(this.f102634h)) {
            this.f102634h.mo30845a();
        }
    }

    @Override // p149l.m250
    public void onCompleted() {
    }
}
