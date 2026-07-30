package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationExecuteAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p1.mobile.putong.facertification.RxFacertification;
import com.p1.mobile.putong.facertification.TTFacertificationClient;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import l.d30;
import l.e30;
import l.mkd0;
import l.oyx;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iuk0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m17040e(Act act, Throwable th) {
        act.progressDismiss();
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m17043h(Act act) {
        act.progressDismiss();
        rwk0.f20826a = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m17045p(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m17046j(final Act act, final String str, boolean z, String str2, String str3, final int i, final boolean z2, String str4, final boolean z3) {
        final yuk0 yuk0Var = new yuk0(act, str, z, str2, str3, i, str4);
        act.duringCreated(SharedLibraryLoader.k().u("facertification").filter(new w9j() { // from class: l.ytk0
            public final Object call(Object obj) {
                return Boolean.valueOf(((LoadEvent) obj).c());
            }
        })).take(1).doOnSubscribe(new d30() { // from class: l.ztk0
            public final void call() {
                act.progress(R$string.f1831J5);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.auk0
            public final void call(Object obj) {
                this.f8533a.m17048l(act, yuk0Var, z2, z3, str, i, (LoadEvent) obj);
            }
        }, new e30() { // from class: l.buk0
            public final void call(Object obj) {
                iuk0.m17040e(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m17051o(RxFacertification.b bVar, Act act, String str, int i) {
        new xuk0().m27645n(bVar, act, str, i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m17048l(Act act, yuk0 yuk0Var, boolean z, boolean z2, String str, int i, LoadEvent loadEvent) {
        act.progressDismiss();
        m17045p("megface");
        m17045p("securitydevice");
        m17052q(yuk0Var.m28400g(), act, CoreModule.m1850H().userId(), yuk0Var.m28401h(z, z2), yuk0Var.m28402i(z2), str, i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m17050n(final Act act, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final TTFacertificationClient.a aVar, final String str2, final int i) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f1831J5);
        PermissionHelper.c().r(new String[]{"android.permission.CAMERA"}).w(false).u(true).o(new d30() { // from class: l.duk0
            public final void call() {
                this.f10599a.m17049m(act, str, verificationTokenRequestParam, aVar, str2, i);
            }
        }).i(act);
    }

    /* JADX INFO: renamed from: q */
    public final void m17052q(boolean z, final Act act, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final TTFacertificationClient.a aVar, final String str2, final int i) {
        if (z) {
            m17049m(act, str, verificationTokenRequestParam, aVar, str2, i);
        } else {
            oyx.h(act, new Runnable() { // from class: l.cuk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9860a.m17050n(act, str, verificationTokenRequestParam, aVar, str2, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m17049m(final Act act, String str, VerificationTokenRequestParam verificationTokenRequestParam, TTFacertificationClient.a aVar, final String str2, final int i) {
        act.duringCreated(TTFacertificationClient.p().A(act, str, verificationTokenRequestParam, new rp8(), aVar, str2)).doOnSubscribe(new d30() { // from class: l.euk0
            public final void call() {
                rwk0.f20826a = false;
            }
        }).doOnUnsubscribe(new d30() { // from class: l.fuk0
            public final void call() {
                iuk0.m17043h(act);
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.guk0
            public final void call(Object obj) {
                this.f13513a.m17051o(act, str2, i, (RxFacertification.b) obj);
            }
        }, new e30() { // from class: l.huk0
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }, false));
    }
}
