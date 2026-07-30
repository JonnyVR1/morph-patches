package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C2081a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.fx */
/* JADX INFO: loaded from: classes8.dex */
public class C16954fx extends jq2<C21800zx> {
    public C16954fx(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m123601j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m123604p0(Bundle bundle) {
        ((C21800zx) this.viewModel).m220765A(CoreModule.m29932K().me_());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.xw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194681a.m123604p0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.yw
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.m29932K().waitPatchSettings().switchMap(new w9j() { // from class: l.cx
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.m29932K().mo30795me();
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.zw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205087a.m123608q0((User) obj);
            }
        }));
        duringCreated(C16665eq.f92732c).subscribe(mkd0.m154956H(new e30() { // from class: l.ax
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72087a.m123609r0((roj0) obj);
            }
        }, new e30() { // from class: l.bx
            @Override // p149l.e30
            public final void call(Object obj) {
                C16954fx.m123601j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m123605m0(String str) {
        pv6.m171560s3(str).subscribe(mkd0.m154956H(new e30() { // from class: l.dx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88226a.m123606n0((roj0) obj);
            }
        }, new e30() { // from class: l.ex
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93561a.m123607o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m123606n0(roj0 roj0Var) {
        lsi0.m151594x(R$string.f27830c2, false);
        User userMe_ = CoreModule.m29932K().me_();
        if (NullChecker.m81303a(userMe_) && TEnum.equals(userMe_.source, "google")) {
            C2081a.m12441a(m142773Y(), new GoogleSignInOptions.C2080a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12434b().m12436d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12433a()).m167391c();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m123607o0(Throwable th) {
        ((C21800zx) this.viewModel).m220777y(th);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m123608q0(User user) {
        ((C21800zx) this.viewModel).m220778z(user);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m123609r0(roj0 roj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: s0 */
    public void m123610s0(Intent intent) {
        ((C21800zx) this.viewModel).getAct().startActivity(intent);
    }

    /* JADX INFO: renamed from: t0 */
    public void m123611t0(Class<?> cls) {
        ((C21800zx) this.viewModel).getAct().startActivity(new Intent(((C21800zx) this.viewModel).getAct(), cls));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
