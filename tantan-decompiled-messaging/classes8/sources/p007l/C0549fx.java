package p007l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.pv6;
import l.roj0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: renamed from: l.fx */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0549fx extends jq2<C0818zx> {
    public C0549fx(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m9178j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m9181p0(Bundle bundle) {
        ((C0818zx) this.viewModel).m12104A(CoreModule.K().me_());
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.xw
            public final void call(Object obj) {
                this.f5364a.m9181p0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.yw
            public final Object call() {
                return CoreModule.K().waitPatchSettings().switchMap(new w9j() { // from class: l.cx
                    public final Object call(Object obj) {
                        return CoreModule.K().me();
                    }
                });
            }
        }).subscribe(mkd0.m9874G(new e30() { // from class: l.zw
            public final void call(Object obj) {
                this.f5574a.m9185q0((User) obj);
            }
        }));
        duringCreated((c) C0532eq.f2628c).subscribe(mkd0.m9875H(new e30() { // from class: l.ax
            public final void call(Object obj) {
                this.f1902a.m9186r0((roj0) obj);
            }
        }, new e30() { // from class: l.bx
            public final void call(Object obj) {
                C0549fx.m9178j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m9182m0(String str) {
        pv6.s3(str).subscribe(mkd0.m9875H(new e30() { // from class: l.dx
            public final void call(Object obj) {
                this.f2606a.m9183n0((roj0) obj);
            }
        }, new e30() { // from class: l.ex
            public final void call(Object obj) {
                this.f2647a.m9184o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m9183n0(roj0 roj0Var) {
        lsi0.m9850x(R.string.c2, false);
        User userMe_ = CoreModule.K().me_();
        if (NullChecker.a(userMe_) && TEnum.equals(userMe_.source, "google")) {
            a.a(m9552Y(), new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").a()).c();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m9184o0(Throwable th) {
        ((C0818zx) this.viewModel).m12116y(th);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m9185q0(User user) {
        ((C0818zx) this.viewModel).m12117z(user);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m9186r0(roj0 roj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: s0 */
    public void m9187s0(Intent intent) {
        ((C0818zx) this.viewModel).act().startActivity(intent);
    }

    /* JADX INFO: renamed from: t0 */
    public void m9188t0(Class<?> cls) {
        ((C0818zx) this.viewModel).act().startActivity(new Intent((Context) ((C0818zx) this.viewModel).act(), cls));
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
