package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.p053ui.intlrenew.IntlRenewContractView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class v8p {

    /* JADX INFO: renamed from: a */
    public Dialog f180562a;

    /* JADX INFO: renamed from: b */
    public IntlRenewContractView f180563b;

    /* JADX INFO: renamed from: c */
    public cwf0 f180564c = i0e.m133794c("p_intl_membership_callback_popup", v8p.class.getName());

    public v8p(final Act act) {
        Dialog dialogM197475d = m197475d(act);
        this.f180562a = dialogM197475d;
        IntlRenewContractView intlRenewContractView = (IntlRenewContractView) dialogM197475d.m20458P();
        this.f180563b = intlRenewContractView;
        intlRenewContractView.m46353e(new Runnable() { // from class: l.s8p
            @Override // java.lang.Runnable
            public final void run() {
                this.f163094a.m197476e(act);
            }
        });
        this.f180563b.m46352d(new Runnable() { // from class: l.t8p
            @Override // java.lang.Runnable
            public final void run() {
                this.f168941a.m197477f();
            }
        });
        this.f180562a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.u8p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f175149a.m197478g(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final Dialog m197475d(Act act) {
        Dialog.C4309e c4309eM20517M = act.dialog().m20516L(y7c0.f196699i).m20517M(m6c0.f131553Y);
        int i = t100.f167268q;
        return c4309eM20517M.m20498C(i, 0, i, 0).m20496B(true).m20567z();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m197476e(Act act) {
        y8p.m213414e(act);
        zvf0.m220396r("e_intl_membership_callback_popup_btn", "p_intl_membership_callback_popup");
        this.f180562a.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m197477f() {
        this.f180562a.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m197478g(DialogInterface dialogInterface) {
        i0e.m133796e(this.f180564c);
    }

    /* JADX INFO: renamed from: h */
    public void m197479h() {
        if (NullChecker.m81303a(this.f180562a)) {
            this.f180562a.show();
            i0e.m133797f(this.f180564c);
            y8p.m213413d().m213426p();
        }
    }
}
