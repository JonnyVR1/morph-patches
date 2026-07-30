package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationExecuteAct;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;

/* JADX INFO: loaded from: classes12.dex */
public class o3l0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m165861e(Act act, Throwable th) {
        act.progressDismiss();
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m165864h(Act act) {
        act.progressDismiss();
        x5l0.f192502a = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m165866p(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m165867j(final Act act, final String str, boolean z, String str2, String str3, final int i, final boolean z2, String str4, final boolean z3) {
        final e4l0 e4l0Var = new e4l0(act, str, z, str2, str3, i, str4);
        act.duringCreated(SharedLibraryLoader.m82637k().m82649u("facertification").filter(new qcj() { // from class: l.e3l0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LoadEvent) obj).m82621c());
            }
        })).take(1).doOnSubscribe(new x20() { // from class: l.f3l0
            @Override // p153l.x20
            public final void call() {
                act.progress(R$string.f18632L5);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.g3l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102001a.m165869l(act, e4l0Var, z2, z3, str, i, (LoadEvent) obj);
            }
        }, new y20() { // from class: l.h3l0
            @Override // p153l.y20
            public final void call(Object obj) {
                o3l0.m165861e(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m165872o(RxFacertification.C10892b c10892b, Act act, String str, int i) {
        new d4l0().m114225n(c10892b, act, str, i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m165869l(Act act, e4l0 e4l0Var, boolean z, boolean z2, String str, int i, LoadEvent loadEvent) {
        act.progressDismiss();
        m165866p("megface");
        m165866p("securitydevice");
        m165873q(e4l0Var.m119445g(), act, CoreModule.m30929H().userId(), e4l0Var.m119446h(z, z2), e4l0Var.m119447i(z2), str, i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m165871n(final Act act, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final TTFacertificationClient.InterfaceC10893a interfaceC10893a, final String str2, final int i) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f18632L5);
        PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.j3l0
            @Override // p153l.x20
            public final void call() {
                this.f118190a.m165870m(act, str, verificationTokenRequestParam, interfaceC10893a, str2, i);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: q */
    public final void m165873q(boolean z, final Act act, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final TTFacertificationClient.InterfaceC10893a interfaceC10893a, final String str2, final int i) {
        if (z) {
            m165870m(act, str, verificationTokenRequestParam, interfaceC10893a, str2, i);
        } else {
            l7y.m153156h(act, new Runnable() { // from class: l.i3l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112743a.m165871n(act, str, verificationTokenRequestParam, interfaceC10893a, str2, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m165870m(final Act act, String str, VerificationTokenRequestParam verificationTokenRequestParam, TTFacertificationClient.InterfaceC10893a interfaceC10893a, final String str2, final int i) {
        act.duringCreated(TTFacertificationClient.m61385p().m61389A(act, str, verificationTokenRequestParam, new wq8(), interfaceC10893a, str2)).doOnSubscribe(new x20() { // from class: l.k3l0
            @Override // p153l.x20
            public final void call() {
                x5l0.f192502a = false;
            }
        }).doOnUnsubscribe(new x20() { // from class: l.l3l0
            @Override // p153l.x20
            public final void call() {
                o3l0.m165864h(act);
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.m3l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134674a.m165872o(act, str2, i, (RxFacertification.C10892b) obj);
            }
        }, new y20() { // from class: l.n3l0
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }, false));
    }
}
