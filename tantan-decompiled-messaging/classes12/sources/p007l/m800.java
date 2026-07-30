package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentActivitiesAct;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.q860;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m800 extends jq2<w800> {

    /* JADX INFO: renamed from: a */
    public q860<MomentActivity> f10252a;

    /* JADX INFO: renamed from: b */
    public boolean f10253b;

    public m800(MomentActivitiesAct momentActivitiesAct) {
        super(momentActivitiesAct);
        this.f10253b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m11839i0(Bundle bundle) {
        FeedModule.f315c.m1624S2();
        ((w800) ((jq2) this).viewModel).m15742r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m11840j0() {
        act().setResult(-1);
        FeedModule.f315c.m1622R2(((w800) ((jq2) this).viewModel).m15734e());
    }

    /* JADX INFO: renamed from: a0 */
    public void m11841a0() {
        creates(new e30() { // from class: l.i800
            public final void call(Object obj) {
                this.f8956a.m11839i0((Bundle) obj);
            }
        }, new d30() { // from class: l.j800
            public final void call() {
                this.f9249a.m11840j0();
            }
        });
        duringCreated(FeedModule.f315c.m1617O2()).subscribe(mkd0.G(new e30() { // from class: l.k800
            public final void call(Object obj) {
                this.f9631a.m11842k0((q860) obj);
            }
        }));
        duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.l800
            public final void call(Object obj) {
                this.f9939a.m11843l0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m11842k0(q860 q860Var) {
        if (this.f10253b) {
            this.f10253b = false;
        } else {
            this.f10252a = q860Var;
            ((w800) ((jq2) this).viewModel).m15740l(q860Var.a.size() > 0, q860Var);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m11843l0(j760 j760Var) {
        this.f10253b = true;
        ((w800) ((jq2) this).viewModel).m15740l(this.f10252a.a.size() > 0, this.f10252a);
        if (this.f10252a.c()) {
            FeedModule.f315c.m1624S2();
        }
    }

    public void destroy() {
    }
}
