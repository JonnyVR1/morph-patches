package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class sdf0 extends gcg0<PaymentApi.SignResultStatus> {

    /* JADX INFO: renamed from: e */
    public final Act f167404e;

    /* JADX INFO: renamed from: f */
    public final PurchaseType f167405f;

    /* JADX INFO: renamed from: g */
    public mdf0 f167406g;

    /* JADX INFO: renamed from: h */
    public SignPaymentParam f167407h;

    /* JADX INFO: renamed from: i */
    public boolean f167408i;

    /* JADX INFO: renamed from: j */
    public final boolean f167409j;

    /* JADX INFO: renamed from: k */
    public final y20<mdf0> f167410k;

    public sdf0(Act act, PurchaseType purchaseType, mdf0 mdf0Var, boolean z, y20<mdf0> y20Var) {
        this.f167404e = act;
        this.f167405f = purchaseType;
        this.f167406g = mdf0Var;
        this.f167407h = mdf0Var.f136376a;
        this.f167408i = mdf0Var.f136378c;
        this.f167409j = z;
        this.f167410k = y20Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m185458h() {
        bn60.m105331N();
        o1j0.m165649w(R$string.f28056K7);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m185460j(View view) {
        if (xl60.m211510o()) {
            i4g0.m138520r("e_purchase_retry_button", "p_purchase_pay_fail_page");
            this.f167410k.call(this.f167406g);
        }
    }

    @Override // p153l.bb50
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m137019l(PaymentApi.SignResultStatus signResultStatus) {
        unsubscribe();
        if (signResultStatus == PaymentApi.SignResultStatus.failed) {
            if (this.f167409j) {
                m185462l();
            } else if (!this.f167408i) {
                o1j0.m165640n(R$string.f28105P1);
            }
        } else if (signResultStatus == PaymentApi.SignResultStatus.signing) {
            SignPaymentParam signPaymentParam = this.f167407h;
            if (signPaymentParam.delayCharge) {
                if (gta.m132210e().m132214d().mo34716K4()) {
                    gta.m132210e().m132214d().mo34773Vn(this.f167404e, null);
                    bn60.m105336S();
                }
                bn60.m105331N();
                return;
            }
            fp60.m126547I(signPaymentParam.contractId, new fj1(signPaymentParam, true, this.f167405f));
        } else {
            if (signResultStatus == PaymentApi.SignResultStatus.succeed) {
                if (this.f167409j) {
                    bn60.m105331N();
                    if (wib0.m206565i(this.f167405f)) {
                        CoreModule.f18264c.f20297C0.m146428y4();
                    }
                } else {
                    l51.m152888H(this.f167404e, new Runnable() { // from class: l.pdf0
                        @Override // java.lang.Runnable
                        public final void run() {
                            sdf0.m185458h();
                        }
                    }, 1500L);
                }
                CoreModule.f18264c.f20333O0.m31072B3();
                fp60.m126542D(this.f167405f, null);
            }
            if (!this.f167408i && !this.f167407h.delayCharge) {
                fp60.m126550L(this.f167405f, this.f167406g, "", this.f167409j);
            }
            this.f167404e.progressDismiss();
        }
        odf0.m167295b().mo167296a(this.f167406g, this.f167405f, signResultStatus);
    }

    /* JADX INFO: renamed from: l */
    public void m185462l() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_pay_fail_page", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorName", "");
            i6e.m138809a(jSONObject, "passive", "alert", "alert_system", "purchase_button", "purchase_page", "pay_fail");
            jSONObject.put("category", this.f167405f.productCategory().name());
            jSONObject.put("purchase_id", this.f167407h.getPurchaseTrackId());
            l4g0VarM204399c.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        new th0.C20312a(this.f167404e).m191160s(this.f167404e.string(R$string.f28179V9)).m191151j(this.f167404e.string(R$string.f28157T9)).m191158q(R$string.f28168U9).m191156o(new View.OnClickListener() { // from class: l.qdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156720a.m185460j(view);
            }
        }).m191146e(R$string.f28224a).m191154m(new DialogInterface.OnDismissListener() { // from class: l.rdf0
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
        boolean z = this.f167408i;
        Act act = this.f167404e;
        if (z) {
            bn60.m105337T(act);
        } else {
            act.progressDismiss();
        }
    }

    @Override // p153l.bb50
    public void onCompleted() {
    }
}
