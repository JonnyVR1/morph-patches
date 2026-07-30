package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.p058ui.intlrenew.IntlRenewContractView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class vap {

    /* JADX INFO: renamed from: a */
    public Dialog f183139a;

    /* JADX INFO: renamed from: b */
    public IntlRenewContractView f183140b;

    /* JADX INFO: renamed from: c */
    public l4g0 f183141c = w1e.m204399c("p_intl_membership_callback_popup", vap.class.getName());

    public vap(final Act act) {
        Dialog dialogM200586d = m200586d(act);
        this.f183139a = dialogM200586d;
        IntlRenewContractView intlRenewContractView = (IntlRenewContractView) dialogM200586d.m21457P();
        this.f183140b = intlRenewContractView;
        intlRenewContractView.m47536e(new Runnable() { // from class: l.sap
            @Override // java.lang.Runnable
            public final void run() {
                this.f167062a.m200587e(act);
            }
        });
        this.f183140b.m47535d(new Runnable() { // from class: l.tap
            @Override // java.lang.Runnable
            public final void run() {
                this.f172753a.m200588f();
            }
        });
        this.f183139a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uap
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f178221a.m200589g(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final Dialog m200586d(Act act) {
        Dialog.C4460e c4460eM21516M = act.dialog().m21515L(dgc0.f88285j).m21516M(rec0.f162513Y);
        int i = qa00.f156330q;
        return c4460eM21516M.m21497C(i, 0, i, 0).m21495B(true).m21566z();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m200587e(Act act) {
        yap.m214903e(act);
        i4g0.m138520r("e_intl_membership_callback_popup_btn", "p_intl_membership_callback_popup");
        this.f183139a.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m200588f() {
        this.f183139a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m200589g(DialogInterface dialogInterface) {
        w1e.m204401e(this.f183141c);
    }

    /* JADX INFO: renamed from: h */
    public void m200590h() {
        if (NullChecker.m82486a(this.f183139a)) {
            this.f183139a.show();
            w1e.m204402f(this.f183141c);
            yap.m214902d().m214915p();
        }
    }
}
