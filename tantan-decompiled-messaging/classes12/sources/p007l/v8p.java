package p007l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.p001ui.intlrenew.IntlRenewContractView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i0e;
import l.m6c0;
import l.t100;
import l.y7c0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v8p {

    /* JADX INFO: renamed from: a */
    public Dialog f14106a;

    /* JADX INFO: renamed from: b */
    public IntlRenewContractView f14107b;

    /* JADX INFO: renamed from: c */
    public cwf0 f14108c = i0e.c("p_intl_membership_callback_popup", v8p.class.getName());

    public v8p(final Act act) {
        Dialog dialogM15363d = m15363d(act);
        this.f14106a = dialogM15363d;
        IntlRenewContractView intlRenewContractView = (IntlRenewContractView) dialogM15363d.P();
        this.f14107b = intlRenewContractView;
        intlRenewContractView.m17e(new Runnable() { // from class: l.s8p
            @Override // java.lang.Runnable
            public final void run() {
                this.f12838a.m15364e(act);
            }
        });
        this.f14107b.m16d(new Runnable() { // from class: l.t8p
            @Override // java.lang.Runnable
            public final void run() {
                this.f13234a.m15365f();
            }
        });
        this.f14106a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.u8p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f13595a.m15366g(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final Dialog m15363d(Act act) {
        Dialog.e eVarM = act.dialog().L(y7c0.i).M(m6c0.Y);
        int i = t100.q;
        return eVarM.C(i, 0, i, 0).B(true).z();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m15364e(Act act) {
        y8p.m16977e(act);
        zvf0.r("e_intl_membership_callback_popup_btn", "p_intl_membership_callback_popup");
        this.f14106a.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m15365f() {
        this.f14106a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m15366g(DialogInterface dialogInterface) {
        i0e.e(this.f14108c);
    }

    /* JADX INFO: renamed from: h */
    public void m15367h() {
        if (NullChecker.a(this.f14106a)) {
            this.f14106a.show();
            i0e.f(this.f14108c);
            y8p.m16976d().m16989p();
        }
    }
}
