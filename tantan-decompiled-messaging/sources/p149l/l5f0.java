package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class l5f0 extends z3g0<PaymentApi.SignResultStatus> {

    /* JADX INFO: renamed from: e */
    public final Act f126126e;

    /* JADX INFO: renamed from: f */
    public final PurchaseType f126127f;

    /* JADX INFO: renamed from: g */
    public f5f0 f126128g;

    /* JADX INFO: renamed from: h */
    public SignPaymentParam f126129h;

    /* JADX INFO: renamed from: i */
    public boolean f126130i;

    /* JADX INFO: renamed from: j */
    public final boolean f126131j;

    /* JADX INFO: renamed from: k */
    public final e30<f5f0> f126132k;

    public l5f0(Act act, PurchaseType purchaseType, f5f0 f5f0Var, boolean z, e30<f5f0> e30Var) {
        this.f126126e = act;
        this.f126127f = purchaseType;
        this.f126128g = f5f0Var;
        this.f126129h = f5f0Var.f95177a;
        this.f126130i = f5f0Var.f95179c;
        this.f126131j = z;
        this.f126132k = e30Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m148631h() {
        we60.m202849N();
        lsi0.m151593w(R$string.f27208K7);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m148633j(View view) {
        if (sd60.m183464o()) {
            zvf0.m220396r("e_purchase_retry_button", "p_purchase_pay_fail_page");
            this.f126132k.call(this.f126128g);
        }
    }

    @Override // p149l.m250
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m132487l(PaymentApi.SignResultStatus signResultStatus) {
        unsubscribe();
        if (signResultStatus == PaymentApi.SignResultStatus.failed) {
            if (this.f126131j) {
                m148635l();
            } else if (!this.f126130i) {
                lsi0.m151584n(R$string.f27257P1);
            }
        } else if (signResultStatus == PaymentApi.SignResultStatus.signing) {
            SignPaymentParam signPaymentParam = this.f126129h;
            if (signPaymentParam.delayCharge) {
                if (ura.m195053e().m195057d().mo33713K4()) {
                    ura.m195053e().m195057d().mo33770Vn(this.f126126e, null);
                    we60.m202854S();
                }
                we60.m202849N();
                return;
            }
            ah60.m96374I(signPaymentParam.contractId, new yi1(signPaymentParam, true, this.f126127f));
        } else {
            if (signResultStatus == PaymentApi.SignResultStatus.succeed) {
                if (this.f126131j) {
                    we60.m202849N();
                    if (sab0.m182891i(this.f126127f)) {
                        CoreModule.f17545c.f19555C0.m210115x4();
                    }
                } else {
                    e51.m114743H(this.f126126e, new Runnable() { // from class: l.i5f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            l5f0.m148631h();
                        }
                    }, 1500L);
                }
                CoreModule.f17545c.f19591O0.m30074B3();
                ah60.m96369D(this.f126127f, null);
            }
            if (!this.f126130i && !this.f126129h.delayCharge) {
                ah60.m96377L(this.f126127f, this.f126128g, "", this.f126131j);
            }
            this.f126126e.progressDismiss();
        }
        h5f0.m129397b().mo119261a(this.f126128g, this.f126127f, signResultStatus);
    }

    /* JADX INFO: renamed from: l */
    public void m148635l() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_pay_fail_page", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorName", "");
            u4e.m191726a(jSONObject, "passive", "alert", "alert_system", "purchase_button", "purchase_page", "pay_fail");
            jSONObject.put("category", this.f126127f.productCategory().name());
            jSONObject.put("purchase_id", this.f126129h.getPurchaseTrackId());
            cwf0VarM133794c.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        new xh0.C21150a(this.f126126e).m208740s(this.f126126e.string(R$string.f27331V9)).m208731j(this.f126126e.string(R$string.f27309T9)).m208738q(R$string.f27320U9).m208736o(new View.OnClickListener() { // from class: l.j5f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116316a.m148633j(view);
            }
        }).m208726e(R$string.f27376a).m208734m(new DialogInterface.OnDismissListener() { // from class: l.k5f0
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
        boolean z = this.f126130i;
        Act act = this.f126126e;
        if (z) {
            we60.m202855T(act);
        } else {
            act.progressDismiss();
        }
    }

    @Override // p149l.m250
    public void onCompleted() {
    }
}
