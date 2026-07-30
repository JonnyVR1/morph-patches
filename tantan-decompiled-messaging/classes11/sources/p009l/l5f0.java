package p009l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.tantanapp.common.utils.CrashHelper;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.lsi0;
import l.sab0;
import l.ura;
import l.xh0;
import l.z3g0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class l5f0 extends z3g0<PaymentApi.SignResultStatus> {

    /* JADX INFO: renamed from: e */
    public final Act f15947e;

    /* JADX INFO: renamed from: f */
    public final PurchaseType f15948f;

    /* JADX INFO: renamed from: g */
    public f5f0 f15949g;

    /* JADX INFO: renamed from: h */
    public SignPaymentParam f15950h;

    /* JADX INFO: renamed from: i */
    public boolean f15951i;

    /* JADX INFO: renamed from: j */
    public final boolean f15952j;

    /* JADX INFO: renamed from: k */
    public final e30<f5f0> f15953k;

    public l5f0(Act act, PurchaseType purchaseType, f5f0 f5f0Var, boolean z, e30<f5f0> e30Var) {
        this.f15947e = act;
        this.f15948f = purchaseType;
        this.f15949g = f5f0Var;
        this.f15950h = f5f0Var.f12813a;
        this.f15951i = f5f0Var.f12815c;
        this.f15952j = z;
        this.f15953k = e30Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m17694h() {
        we60.m24152N();
        lsi0.w(R$string.f5986K7);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m17696j(View view) {
        if (sd60.m22084o()) {
            zvf0.r("e_purchase_retry_button", "p_purchase_pay_fail_page");
            this.f15953k.call(this.f15949g);
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onNext(PaymentApi.SignResultStatus signResultStatus) {
        unsubscribe();
        if (signResultStatus == PaymentApi.SignResultStatus.failed) {
            if (this.f15952j) {
                m17698l();
            } else if (!this.f15951i) {
                lsi0.n(R$string.f6035P1);
            }
        } else if (signResultStatus == PaymentApi.SignResultStatus.signing) {
            SignPaymentParam signPaymentParam = this.f15950h;
            if (signPaymentParam.delayCharge) {
                if (ura.e().d().K4()) {
                    ura.e().d().Vn(this.f15947e, (d30) null);
                    we60.m24157S();
                }
                we60.m24152N();
                return;
            }
            ah60.m11412I(signPaymentParam.contractId, new yi1(signPaymentParam, true, this.f15948f));
        } else {
            if (signResultStatus == PaymentApi.SignResultStatus.succeed) {
                if (this.f15952j) {
                    we60.m24152N();
                    if (sab0.i(this.f15948f)) {
                        CoreModule.c.C0.x4();
                    }
                } else {
                    e51.H(this.f15947e, new Runnable() { // from class: l.i5f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            l5f0.m17694h();
                        }
                    }, 1500L);
                }
                CoreModule.c.O0.B3();
                ah60.m11407D(this.f15948f, null);
            }
            if (!this.f15951i && !this.f15950h.delayCharge) {
                ah60.m11415L(this.f15948f, this.f15949g, "", this.f15952j);
            }
            this.f15947e.progressDismiss();
        }
        h5f0.m15404b().mo14201a(this.f15949g, this.f15948f, signResultStatus);
    }

    /* JADX INFO: renamed from: l */
    public void m17698l() {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_purchase_pay_fail_page", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorName", "");
            u4e.m22744a(jSONObject, "passive", "alert", "alert_system", "purchase_button", "purchase_page", "pay_fail");
            jSONObject.put("category", this.f15948f.productCategory().name());
            jSONObject.put("purchase_id", this.f15950h.getPurchaseTrackId());
            cwf0VarM16062c.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        new xh0.a(this.f15947e).s(this.f15947e.string(R$string.f6109V9)).j(this.f15947e.string(R$string.f6087T9)).q(R$string.f6098U9).o(new View.OnClickListener() { // from class: l.j5f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14942a.m17696j(view);
            }
        }).e(R$string.f6154a).m(new DialogInterface.OnDismissListener() { // from class: l.k5f0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).a().g();
        i0e.m16065f(cwf0VarM16062c);
    }

    public void onError(Throwable th) {
        if ((th instanceof IllegalStateException) && TextUtils.equals(th.getMessage(), "alipay")) {
            lsi0.y(CoreModule.b.getString(R$string.f6076S9));
        } else {
            CrashHelper.c(th);
        }
        unsubscribe();
        boolean z = this.f15951i;
        Act act = this.f15947e;
        if (z) {
            we60.m24158T(act);
        } else {
            act.progressDismiss();
        }
    }

    public void onCompleted() {
    }
}
