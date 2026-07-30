package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C2104a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.zw */
/* JADX INFO: loaded from: classes9.dex */
public class C21908zw extends ar2<C20416tx> {
    public C21908zw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m221832j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m221835p0(Bundle bundle) {
        ((C20416tx) this.viewModel).m193397A(CoreModule.m30930K().me_());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.rw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165088a.m221835p0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.sw
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.m30930K().waitPatchSettings().switchMap(new qcj() { // from class: l.ww
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.m30930K().mo31798me();
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176365a.m221839q0((User) obj);
            }
        }));
        duringCreated(C21846zp.f205406c).subscribe(psd0.m173597H(new y20() { // from class: l.uw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181222a.m221840r0((uxj0) obj);
            }
        }, new y20() { // from class: l.vw
            @Override // p153l.y20
            public final void call(Object obj) {
                C21908zw.m221832j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m221836m0(String str) {
        sw6.m188256s3(str).subscribe(psd0.m173597H(new y20() { // from class: l.xw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196451a.m221837n0((uxj0) obj);
            }
        }, new y20() { // from class: l.yw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201774a.m221838o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m221837n0(uxj0 uxj0Var) {
        o1j0.m165650x(R$string.f28678c2, false);
        User userMe_ = CoreModule.m30930K().me_();
        if (NullChecker.m82486a(userMe_) && TEnum.equals(userMe_.source, "google")) {
            C2104a.m12495a(m99640Y(), new GoogleSignInOptions.C2103a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12488b().m12490d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12487a()).m133800c();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m221838o0(Throwable th) {
        ((C20416tx) this.viewModel).m193409y(th);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m221839q0(User user) {
        ((C20416tx) this.viewModel).m193410z(user);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m221840r0(uxj0 uxj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: s0 */
    public void m221841s0(Intent intent) {
        ((C20416tx) this.viewModel).getAct().startActivity(intent);
    }

    /* JADX INFO: renamed from: t0 */
    public void m221842t0(Class<?> cls) {
        ((C20416tx) this.viewModel).getAct().startActivity(new Intent(((C20416tx) this.viewModel).getAct(), cls));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
