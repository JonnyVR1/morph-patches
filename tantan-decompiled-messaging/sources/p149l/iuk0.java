package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationExecuteAct;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;

/* JADX INFO: loaded from: classes9.dex */
public class iuk0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m138413e(Act act, Throwable th) {
        act.progressDismiss();
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m138416h(Act act) {
        act.progressDismiss();
        rwk0.f161351a = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m138418p(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m138419j(final Act act, final String str, boolean z, String str2, String str3, final int i, final boolean z2, String str4, final boolean z3) {
        final yuk0 yuk0Var = new yuk0(act, str, z, str2, str3, i, str4);
        act.duringCreated(SharedLibraryLoader.m81454k().m81466u("facertification").filter(new w9j() { // from class: l.ytk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LoadEvent) obj).m81438c());
            }
        })).take(1).doOnSubscribe(new d30() { // from class: l.ztk0
            @Override // p149l.d30
            public final void call() {
                act.progress(R$string.f17842J5);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.auk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71835a.m138421l(act, yuk0Var, z2, z3, str, i, (LoadEvent) obj);
            }
        }, new e30() { // from class: l.buk0
            @Override // p149l.e30
            public final void call(Object obj) {
                iuk0.m138413e(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m138424o(RxFacertification.C10729b c10729b, Act act, String str, int i) {
        new xuk0().m211113n(c10729b, act, str, i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m138421l(Act act, yuk0 yuk0Var, boolean z, boolean z2, String str, int i, LoadEvent loadEvent) {
        act.progressDismiss();
        m138418p("megface");
        m138418p("securitydevice");
        m138425q(yuk0Var.m216124g(), act, CoreModule.m29931H().userId(), yuk0Var.m216125h(z, z2), yuk0Var.m216126i(z2), str, i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m138423n(final Act act, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final TTFacertificationClient.InterfaceC10730a interfaceC10730a, final String str2, final int i) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f17842J5);
        PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.duk0
            @Override // p149l.d30
            public final void call() {
                this.f87992a.m138422m(act, str, verificationTokenRequestParam, interfaceC10730a, str2, i);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: q */
    public final void m138425q(boolean z, final Act act, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final TTFacertificationClient.InterfaceC10730a interfaceC10730a, final String str2, final int i) {
        if (z) {
            m138422m(act, str, verificationTokenRequestParam, interfaceC10730a, str2, i);
        } else {
            oyx.m166734h(act, new Runnable() { // from class: l.cuk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82575a.m138423n(act, str, verificationTokenRequestParam, interfaceC10730a, str2, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m138422m(final Act act, String str, VerificationTokenRequestParam verificationTokenRequestParam, TTFacertificationClient.InterfaceC10730a interfaceC10730a, final String str2, final int i) {
        act.duringCreated(TTFacertificationClient.m60201p().m60205A(act, str, verificationTokenRequestParam, new rp8(), interfaceC10730a, str2)).doOnSubscribe(new d30() { // from class: l.euk0
            @Override // p149l.d30
            public final void call() {
                rwk0.f161351a = false;
            }
        }).doOnUnsubscribe(new d30() { // from class: l.fuk0
            @Override // p149l.d30
            public final void call() {
                iuk0.m138416h(act);
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.guk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104414a.m138424o(act, str2, i, (RxFacertification.C10729b) obj);
            }
        }, new e30() { // from class: l.huk0
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }, false));
    }
}
