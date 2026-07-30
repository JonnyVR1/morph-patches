package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class lp60 extends gcg0<PaymentApi.PaymentResultStatus> {

    /* JADX INFO: renamed from: e */
    public final Act f133011e;

    /* JADX INFO: renamed from: f */
    public final PurchaseType f133012f;

    /* JADX INFO: renamed from: g */
    public final y20<peb0> f133013g;

    /* JADX INFO: renamed from: h */
    public bn50 f133014h;

    /* JADX INFO: renamed from: i */
    public PurchasePaymentParam f133015i;

    /* JADX INFO: renamed from: j */
    public peb0 f133016j;

    public lp60(Act act, PurchaseType purchaseType, y20<peb0> y20Var, peb0 peb0Var) {
        this.f133011e = act;
        this.f133012f = purchaseType;
        this.f133013g = y20Var;
        this.f133016j = peb0Var;
        this.f133015i = peb0Var.f151885a;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m155155h() {
        bn60.m105331N();
        o1j0.m165649w(R$string.f28056K7);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m155157j() {
        return this.f133015i.useAutoDeduct;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m155158k(View view) {
        if (xl60.m211510o()) {
            i4g0.m138520r("e_purchase_retry_button", "p_purchase_pay_fail_page");
            this.f133013g.call(this.f133016j);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m155159l() {
        l51.m152888H(this.f133011e, new Runnable() { // from class: l.ip60
            @Override // java.lang.Runnable
            public final void run() {
                lp60.m155155h();
            }
        }, 2000L);
    }

    @Override // p153l.bb50
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m137019l(PaymentApi.PaymentResultStatus paymentResultStatus) {
        unsubscribe();
        this.f133011e.progressDismiss();
        boolean zM155157j = m155157j();
        if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
            fp60.m126541C(this.f133012f);
            fp60.m126542D(this.f133012f, "");
            PurchaseType purchaseType = this.f133012f;
            if (zM155157j) {
                xl60.m211494B(purchaseType);
                if (wib0.m206563g(this.f133012f)) {
                    bn60.m105331N();
                } else {
                    m155159l();
                }
            } else if (wib0.m206565i(purchaseType)) {
                CoreModule.f18264c.f20297C0.m146428y4();
            }
            this.f133014h.mo31849c();
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.failed) {
            if (zM155157j) {
                bn60.m105337T(this.f133011e);
                this.f133014h.mo31848a();
                CoreModule.f18264c.f20333O0.m31073C3();
            } else {
                m155162o();
            }
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.toSigning) {
            bn60.m105331N();
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.pending) {
            PurchasePaymentParam purchasePaymentParam = this.f133015i;
            fp60.m126546H(purchasePaymentParam.orderId, new fj1(purchasePaymentParam, false, this.f133012f));
        }
        qk60.m176925b().mo128635a(this.f133016j, this.f133012f, paymentResultStatus);
    }

    /* JADX INFO: renamed from: n */
    public void m155161n(bn50 bn50Var) {
        this.f133014h = bn50Var;
    }

    /* JADX INFO: renamed from: o */
    public void m155162o() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_pay_fail_page", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorName", "");
            i6e.m138809a(jSONObject, "passive", "alert", "alert_system", "purchase_button", "purchase_page", "pay_fail");
            jSONObject.put("category", this.f133012f.productCategory().name());
            jSONObject.put("purchase_id", this.f133015i.getPurchaseTrackId());
            l4g0VarM204399c.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        new th0.C20312a(this.f133011e).m191160s(this.f133011e.string(R$string.f28179V9)).m191151j(this.f133011e.string(R$string.f28157T9)).m191158q(R$string.f28168U9).m191156o(new View.OnClickListener() { // from class: l.jp60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122078a.m155158k(view);
            }
        }).m191146e(R$string.f28224a).m191154m(new DialogInterface.OnDismissListener() { // from class: l.kp60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        if ((th instanceof IllegalStateException) && TextUtils.equals(th.getMessage(), "alipay")) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28146S9));
        } else {
            CrashHelper.m82479c(th);
        }
        unsubscribe();
        this.f133011e.progressDismiss();
        if (NullChecker.m82486a(this.f133014h)) {
            this.f133014h.mo31848a();
        }
    }

    @Override // p153l.bb50
    public void onCompleted() {
    }
}
