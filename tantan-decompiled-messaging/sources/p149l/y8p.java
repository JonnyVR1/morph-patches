package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlContractInfosEnvelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class y8p {

    /* JADX INFO: renamed from: d */
    public static y8p f196856d;

    /* JADX INFO: renamed from: a */
    public IntlContractInfosEnvelope f196857a;

    /* JADX INFO: renamed from: b */
    public uqd0 f196858b = new uqd0("intl_renew_contract_dlg_show" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public final C22392a<IntlContractInfosEnvelope> f196859c = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m213412b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static y8p m213413d() {
        if (f196856d == null) {
            synchronized (y8p.class) {
                try {
                    if (f196856d == null) {
                        f196856d = new y8p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f196856d;
    }

    /* JADX INFO: renamed from: e */
    public static void m213414e(Act act) {
        try {
            act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().build()));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m213415i() {
        zvf0.m220396r("e_intl_membership_callback_banner", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: j */
    public static void m213416j() {
        zvf0.m220402x("e_intl_membership_callback_banner", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: l */
    public static void m213417l() {
        if (NullChecker.m81303a(f196856d)) {
            f196856d = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m213418c() {
        return NullChecker.m81303a(this.f196858b) && NullChecker.m81303a(this.f196857a) && !TextUtils.equals(this.f196858b.get(), this.f196857a.data.contract.contractId);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m213419f(d30 d30Var, IntlContractInfosEnvelope intlContractInfosEnvelope) {
        this.f196857a = intlContractInfosEnvelope;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        this.f196859c.onNext(intlContractInfosEnvelope);
    }

    /* JADX INFO: renamed from: g */
    public void m213420g(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.f17545c.f19626Z1.m145030c3()).subscribe(mkd0.m154956H(new e30() { // from class: l.w8p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185243a.m213419f(d30Var, (IntlContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.x8p
            @Override // p149l.e30
            public final void call(Object obj) {
                y8p.m213412b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m213421h(String str) {
        return NullChecker.m81303a(this.f196857a) && TextUtils.equals(this.f196857a.data.contract.membershipType, str);
    }

    /* JADX INFO: renamed from: k */
    public boolean m213422k() {
        return m213423m() && m213418c();
    }

    /* JADX INFO: renamed from: m */
    public boolean m213423m() {
        return NullChecker.m81303a(this.f196857a) && TextUtils.equals(this.f196857a.data.contract.contractStatus, "canceled");
    }

    /* JADX INFO: renamed from: n */
    public C22306c<IntlContractInfosEnvelope> m213424n() {
        return this.f196859c.asObservable();
    }

    /* JADX INFO: renamed from: o */
    public void m213425o(Act act) {
        new v8p(act).m197479h();
    }

    /* JADX INFO: renamed from: p */
    public void m213426p() {
        if (NullChecker.m81303a(this.f196858b) && NullChecker.m81303a(this.f196857a)) {
            this.f196858b.put(this.f196857a.data.contract.contractId);
        }
    }
}
