package p007l;

import android.os.Bundle;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.d30;
import l.e30;
import l.pv6;
import l.roj0;
import l.w85;

/* JADX INFO: renamed from: l.qk */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0673qk extends jq2<C0754wk> {
    public C0673qk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m10431f0() {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m10433h0() {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m10437l0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m10441u0(Bundle bundle) {
        ((C0754wk) this.viewModel).m11369r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m10442A0() {
        m10445p0(false);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m10443C0(View view) {
        m10447r0(true);
    }

    /* JADX INFO: renamed from: D0 */
    public View.OnClickListener m10444D0() {
        return new View.OnClickListener() { // from class: l.ik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2917a.m10443C0(view);
            }
        };
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.fk
            public final void call(Object obj) {
                this.f2730a.m10441u0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10445p0(boolean z) {
        w85.INSTANCE.m("Delete account", (Map) null);
        ((C0754wk) this.viewModel).act().progress(R.string.R0);
        (z ? pv6.A3("", CoreModule.H().K7()) : pv6.s3("")).subscribe(mkd0.m9875H(new e30() { // from class: l.pk
            public final void call(Object obj) {
                C0673qk.m10437l0((roj0) obj);
            }
        }, new e30() { // from class: l.gk
            public final void call(Object obj) {
                this.f2785a.m10448s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public View.OnClickListener m10446q0() {
        return new View.OnClickListener() { // from class: l.hk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2845a.m10449t0(view);
            }
        };
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10447r0(final boolean z) {
        if (CoreModule.c.e0.p9().isVIP() || !CoreModule.l.a().e2() || CoreModule.c.H0.Y4() > 0 || (CoreModule.K().xf() && CoreModule.c.I0.K3() > 0)) {
            C0517cl.INSTANCE.m8790f(z, act(), new Function0() { // from class: l.jk
                public final Object invoke() {
                    return this.f2997a.m10450x0(z);
                }
            });
            return;
        }
        V v = this.viewModel;
        if (z) {
            ((C0754wk) v).m11368l(new d30() { // from class: l.kk
                public final void call() {
                    this.f3075a.m10451y0();
                }
            }, new d30() { // from class: l.lk
                public final void call() {
                    C0673qk.m10431f0();
                }
            });
        } else {
            ((C0754wk) v).m11367k(new d30() { // from class: l.mk
                public final void call() {
                    this.f3307a.m10452z0();
                }
            }, new d30() { // from class: l.nk
                public final void call() {
                    this.f3411a.m10442A0();
                }
            }, new d30() { // from class: l.ok
                public final void call() {
                    C0673qk.m10433h0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m10448s0(Throwable th) {
        ((C0754wk) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m10449t0(View view) {
        m10447r0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Unit m10450x0(boolean z) {
        m10445p0(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m10451y0() {
        m10445p0(true);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m10452z0() {
        m10445p0(true);
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
