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
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.e51;
import l.lsi0;
import l.sab0;
import l.xh0;
import l.z3g0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gh60 extends z3g0<PaymentApi.PaymentResultStatus> {

    /* JADX INFO: renamed from: e */
    public final Act f13566e;

    /* JADX INFO: renamed from: f */
    public final PurchaseType f13567f;

    /* JADX INFO: renamed from: g */
    public final e30<l6b0> f13568g;

    /* JADX INFO: renamed from: h */
    public ue50 f13569h;

    /* JADX INFO: renamed from: i */
    public PurchasePaymentParam f13570i;

    /* JADX INFO: renamed from: j */
    public l6b0 f13571j;

    public gh60(Act act, PurchaseType purchaseType, e30<l6b0> e30Var, l6b0 l6b0Var) {
        this.f13566e = act;
        this.f13567f = purchaseType;
        this.f13568g = e30Var;
        this.f13571j = l6b0Var;
        this.f13570i = l6b0Var.f15968a;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m15039h() {
        we60.m24152N();
        lsi0.w(R$string.f5986K7);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15041j() {
        return ((PaymentParam) this.f13570i).useAutoDeduct;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m15042k(View view) {
        if (sd60.m22084o()) {
            zvf0.r("e_purchase_retry_button", "p_purchase_pay_fail_page");
            this.f13568g.call(this.f13571j);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15043l() {
        e51.H(this.f13566e, new Runnable() { // from class: l.dh60
            @Override // java.lang.Runnable
            public final void run() {
                gh60.m15039h();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onNext(PaymentApi.PaymentResultStatus paymentResultStatus) {
        unsubscribe();
        this.f13566e.progressDismiss();
        boolean zM15041j = m15041j();
        if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
            ah60.m11406C(this.f13567f);
            ah60.m11407D(this.f13567f, "");
            PurchaseType purchaseType = this.f13567f;
            if (zM15041j) {
                sd60.m22068B(purchaseType);
                if (sab0.g(this.f13567f)) {
                    we60.m24152N();
                } else {
                    m15043l();
                }
            } else if (sab0.i(purchaseType)) {
                CoreModule.c.C0.x4();
            }
            this.f13569h.mo21110c();
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.failed) {
            if (zM15041j) {
                we60.m24158T(this.f13566e);
                this.f13569h.mo21108a();
                CoreModule.c.O0.C3();
            } else {
                m15046o();
            }
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.toSigning) {
            we60.m24152N();
        } else if (paymentResultStatus == PaymentApi.PaymentResultStatus.pending) {
            PurchasePaymentParam purchasePaymentParam = this.f13570i;
            ah60.m11411H(purchasePaymentParam.orderId, new yi1(purchasePaymentParam, false, this.f13567f));
        }
        lc60.m17810b().mo17812a(this.f13571j, this.f13567f, paymentResultStatus);
    }

    /* JADX INFO: renamed from: n */
    public void m15045n(ue50 ue50Var) {
        this.f13569h = ue50Var;
    }

    /* JADX INFO: renamed from: o */
    public void m15046o() {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_purchase_pay_fail_page", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorName", "");
            u4e.m22744a(jSONObject, "passive", "alert", "alert_system", "purchase_button", "purchase_page", "pay_fail");
            jSONObject.put("category", this.f13567f.productCategory().name());
            jSONObject.put("purchase_id", this.f13570i.getPurchaseTrackId());
            cwf0VarM16062c.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        new xh0.a(this.f13566e).s(this.f13566e.string(R$string.f6109V9)).j(this.f13566e.string(R$string.f6087T9)).q(R$string.f6098U9).o(new View.OnClickListener() { // from class: l.eh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12565a.m15042k(view);
            }
        }).e(R$string.f6154a).m(new DialogInterface.OnDismissListener() { // from class: l.fh60
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
        this.f13566e.progressDismiss();
        if (NullChecker.a(this.f13569h)) {
            this.f13569h.mo21108a();
        }
    }

    public void onCompleted() {
    }
}
