package p007l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.PaymentContractStatus;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlContractInfosEnvelope;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.mcr;
import l.mkd0;
import l.uqd0;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y8p {

    /* JADX INFO: renamed from: d */
    public static y8p f15303d;

    /* JADX INFO: renamed from: a */
    public IntlContractInfosEnvelope f15304a;

    /* JADX INFO: renamed from: b */
    public uqd0 f15305b = new uqd0("intl_renew_contract_dlg_show" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: c */
    public final a<IntlContractInfosEnvelope> f15306c = a.b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16975b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static y8p m16976d() {
        if (f15303d == null) {
            synchronized (y8p.class) {
                try {
                    if (f15303d == null) {
                        f15303d = new y8p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15303d;
    }

    /* JADX INFO: renamed from: e */
    public static void m16977e(Act act) {
        try {
            act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().build()));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m16978i() {
        zvf0.r("e_intl_membership_callback_banner", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: j */
    public static void m16979j() {
        zvf0.x("e_intl_membership_callback_banner", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: l */
    public static void m16980l() {
        if (NullChecker.a(f15303d)) {
            f15303d = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m16981c() {
        return NullChecker.a(this.f15305b) && NullChecker.a(this.f15304a) && !TextUtils.equals((CharSequence) this.f15305b.get(), this.f15304a.data.contract.contractId);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m16982f(d30 d30Var, IntlContractInfosEnvelope intlContractInfosEnvelope) {
        this.f15304a = intlContractInfosEnvelope;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        this.f15306c.onNext(intlContractInfosEnvelope);
    }

    /* JADX INFO: renamed from: g */
    public void m16983g(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.c.Z1.c3()).subscribe(mkd0.H(new e30() { // from class: l.w8p
            public final void call(Object obj) {
                this.f14471a.m16982f(d30Var, (IntlContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.x8p
            public final void call(Object obj) {
                y8p.m16975b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m16984h(String str) {
        return NullChecker.a(this.f15304a) && TextUtils.equals(this.f15304a.data.contract.membershipType, str);
    }

    /* JADX INFO: renamed from: k */
    public boolean m16985k() {
        return m16986m() && m16981c();
    }

    /* JADX INFO: renamed from: m */
    public boolean m16986m() {
        return NullChecker.a(this.f15304a) && TextUtils.equals(this.f15304a.data.contract.contractStatus, PaymentContractStatus.canceled);
    }

    /* JADX INFO: renamed from: n */
    public c<IntlContractInfosEnvelope> m16987n() {
        return this.f15306c.asObservable();
    }

    /* JADX INFO: renamed from: o */
    public void m16988o(Act act) {
        new v8p(act).m15367h();
    }

    /* JADX INFO: renamed from: p */
    public void m16989p() {
        if (NullChecker.a(this.f15305b) && NullChecker.a(this.f15304a)) {
            this.f15305b.put(this.f15304a.data.contract.contractId);
        }
    }
}
