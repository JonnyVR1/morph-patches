package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l.qk */
/* JADX INFO: loaded from: classes8.dex */
public class C19526qk extends jq2<C20883wk> {
    public C19526qk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m175048f0() {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m175050h0() {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m175054l0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m175058u0(Bundle bundle) {
        ((C20883wk) this.viewModel).m203594r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m175059A0() {
        m175062p0(false);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m175060C0(View view) {
        m175064r0(true);
    }

    /* JADX INFO: renamed from: D0 */
    public View.OnClickListener m175061D0() {
        return new View.OnClickListener() { // from class: l.ik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113619a.m175060C0(view);
            }
        };
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.fk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98019a.m175058u0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m175062p0(boolean z) {
        w85.INSTANCE.m202145m("Delete account", null);
        ((C20883wk) this.viewModel).getAct().progress(R$string.f27771R0);
        (z ? pv6.m171544A3("", CoreModule.m29931H().mo28156K7()) : pv6.m171560s3("")).subscribe(mkd0.m154956H(new e30() { // from class: l.pk
            @Override // p149l.e30
            public final void call(Object obj) {
                C19526qk.m175054l0((roj0) obj);
            }
        }, new e30() { // from class: l.gk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103113a.m175065s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public View.OnClickListener m175063q0() {
        return new View.OnClickListener() { // from class: l.hk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108139a.m175066t0(view);
            }
        };
    }

    /* JADX INFO: renamed from: r0 */
    public final void m175064r0(final boolean z) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || !CoreModule.f17554l.m94651a().mo33489e2() || CoreModule.f17545c.f19570H0.m210347Y4() > 0 || (CoreModule.m29932K().mo30835xf() && CoreModule.f17545c.f19573I0.m140257K3() > 0)) {
            C16185cl.INSTANCE.m107439f(z, act(), new Function0() { // from class: l.jk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f118326a.m175067x0(z);
                }
            });
            return;
        }
        V v2 = this.viewModel;
        if (z) {
            ((C20883wk) v2).m203593l(new d30() { // from class: l.kk
                @Override // p149l.d30
                public final void call() {
                    this.f123519a.m175068y0();
                }
            }, new d30() { // from class: l.lk
                @Override // p149l.d30
                public final void call() {
                    C19526qk.m175048f0();
                }
            });
        } else {
            ((C20883wk) v2).m203592k(new d30() { // from class: l.mk
                @Override // p149l.d30
                public final void call() {
                    this.f134270a.m175069z0();
                }
            }, new d30() { // from class: l.nk
                @Override // p149l.d30
                public final void call() {
                    this.f139365a.m175059A0();
                }
            }, new d30() { // from class: l.ok
                @Override // p149l.d30
                public final void call() {
                    C19526qk.m175050h0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m175065s0(Throwable th) {
        ((C20883wk) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m175066t0(View view) {
        m175064r0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Unit m175067x0(boolean z) {
        m175062p0(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m175068y0() {
        m175062p0(true);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m175069z0() {
        m175062p0(true);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
