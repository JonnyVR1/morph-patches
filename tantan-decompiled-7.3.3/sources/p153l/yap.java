package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlContractInfosEnvelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class yap {

    /* JADX INFO: renamed from: d */
    public static yap f198227d;

    /* JADX INFO: renamed from: a */
    public IntlContractInfosEnvelope f198228a;

    /* JADX INFO: renamed from: b */
    public wyd0 f198229b = new wyd0("intl_renew_contract_dlg_show" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public final C22507a<IntlContractInfosEnvelope> f198230c = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m214901b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static yap m214902d() {
        if (f198227d == null) {
            synchronized (yap.class) {
                try {
                    if (f198227d == null) {
                        f198227d = new yap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198227d;
    }

    /* JADX INFO: renamed from: e */
    public static void m214903e(Act act) {
        try {
            act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().build()));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m214904i() {
        i4g0.m138520r("e_intl_membership_callback_banner", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: j */
    public static void m214905j() {
        i4g0.m138526x("e_intl_membership_callback_banner", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: l */
    public static void m214906l() {
        if (NullChecker.m82486a(f198227d)) {
            f198227d = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m214907c() {
        return NullChecker.m82486a(this.f198229b) && NullChecker.m82486a(this.f198228a) && !TextUtils.equals(this.f198229b.get(), this.f198228a.data.contract.contractId);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m214908f(x20 x20Var, IntlContractInfosEnvelope intlContractInfosEnvelope) {
        this.f198228a = intlContractInfosEnvelope;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        this.f198230c.onNext(intlContractInfosEnvelope);
    }

    /* JADX INFO: renamed from: g */
    public void m214909g(ner nerVar, final x20 x20Var) {
        nerVar.duringCreated(CoreModule.f18264c.f20368Z1.m189807c3()).subscribe(psd0.m173597H(new y20() { // from class: l.wap
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188151a.m214908f(x20Var, (IntlContractInfosEnvelope) obj);
            }
        }, new y20() { // from class: l.xap
            @Override // p153l.y20
            public final void call(Object obj) {
                yap.m214901b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m214910h(String str) {
        return NullChecker.m82486a(this.f198228a) && TextUtils.equals(this.f198228a.data.contract.membershipType, str);
    }

    /* JADX INFO: renamed from: k */
    public boolean m214911k() {
        return m214912m() && m214907c();
    }

    /* JADX INFO: renamed from: m */
    public boolean m214912m() {
        return NullChecker.m82486a(this.f198228a) && TextUtils.equals(this.f198228a.data.contract.contractStatus, "canceled");
    }

    /* JADX INFO: renamed from: n */
    public C22421c<IntlContractInfosEnvelope> m214913n() {
        return this.f198230c.asObservable();
    }

    /* JADX INFO: renamed from: o */
    public void m214914o(Act act) {
        new vap(act).m200590h();
    }

    /* JADX INFO: renamed from: p */
    public void m214915p() {
        if (NullChecker.m82486a(this.f198229b) && NullChecker.m82486a(this.f198228a)) {
            this.f198229b.put(this.f198228a.data.contract.contractId);
        }
    }
}
