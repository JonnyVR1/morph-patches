package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l.lk */
/* JADX INFO: loaded from: classes6.dex */
public class C18405lk extends ar2<C19858rk> {
    public C18405lk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m154597f0() {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m154599h0() {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m154603l0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m154607u0(Bundle bundle) {
        ((C19858rk) this.viewModel).m181776r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m154608A0() {
        m154611p0(false);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m154609C0(View view) {
        m154613r0(true);
    }

    /* JADX INFO: renamed from: D0 */
    public View.OnClickListener m154610D0() {
        return new View.OnClickListener() { // from class: l.dk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88958a.m154609C0(view);
            }
        };
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71924a.m154607u0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m154611p0(boolean z) {
        x95.INSTANCE.m209793m("Delete account", null);
        ((C19858rk) this.viewModel).getAct().progress(R$string.f28619R0);
        (z ? sw6.m188240A3("", CoreModule.m30929H().mo29155K7()) : sw6.m188256s3("")).subscribe(psd0.m173597H(new y20() { // from class: l.kk
            @Override // p153l.y20
            public final void call(Object obj) {
                C18405lk.m154603l0((uxj0) obj);
            }
        }, new y20() { // from class: l.bk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77032a.m154614s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public View.OnClickListener m154612q0() {
        return new View.OnClickListener() { // from class: l.ck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82230a.m154615t0(view);
            }
        };
    }

    /* JADX INFO: renamed from: r0 */
    public final void m154613r0(final boolean z) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || !CoreModule.f18273l.m143405a().mo34492e2() || CoreModule.f18264c.f20312H0.m155435Y4() > 0 || (CoreModule.m30930K().mo31838xf() && CoreModule.f18264c.f20315I0.m144054K3() > 0)) {
            C21356xk.INSTANCE.m211278f(z, act(), new Function0() { // from class: l.ek
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f94333a.m154616x0(z);
                }
            });
            return;
        }
        V v2 = this.viewModel;
        if (z) {
            ((C19858rk) v2).m181775l(new x20() { // from class: l.fk
                @Override // p153l.x20
                public final void call() {
                    this.f99443a.m154617y0();
                }
            }, new x20() { // from class: l.gk
                @Override // p153l.x20
                public final void call() {
                    C18405lk.m154597f0();
                }
            });
        } else {
            ((C19858rk) v2).m181774k(new x20() { // from class: l.hk
                @Override // p153l.x20
                public final void call() {
                    this.f110346a.m154618z0();
                }
            }, new x20() { // from class: l.ik
                @Override // p153l.x20
                public final void call() {
                    this.f115312a.m154608A0();
                }
            }, new x20() { // from class: l.jk
                @Override // p153l.x20
                public final void call() {
                    C18405lk.m154599h0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m154614s0(Throwable th) {
        ((C19858rk) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m154615t0(View view) {
        m154613r0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Unit m154616x0(boolean z) {
        m154611p0(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m154617y0() {
        m154611p0(true);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m154618z0() {
        m154611p0(true);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
