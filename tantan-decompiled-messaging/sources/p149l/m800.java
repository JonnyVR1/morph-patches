package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentActivitiesAct;

/* JADX INFO: loaded from: classes12.dex */
public class m800 extends jq2<w800> {

    /* JADX INFO: renamed from: a */
    public q860<MomentActivity> f132503a;

    /* JADX INFO: renamed from: b */
    public boolean f132504b;

    public m800(MomentActivitiesAct momentActivitiesAct) {
        super(momentActivitiesAct);
        this.f132504b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m153425i0(Bundle bundle) {
        FeedModule.f38854c.m60698S2();
        ((w800) this.viewModel).m202099r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m153426j0() {
        act().setResult(-1);
        FeedModule.f38854c.m60696R2(((w800) this.viewModel).m202092e());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.i800
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111973a.m153425i0((Bundle) obj);
            }
        }, new d30() { // from class: l.j800
            @Override // p149l.d30
            public final void call() {
                this.f116672a.m153426j0();
            }
        });
        duringCreated(FeedModule.f38854c.m60691O2()).subscribe(mkd0.m154955G(new e30() { // from class: l.k800
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121712a.m153427k0((q860) obj);
            }
        }));
        duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.l800
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126779a.m153428l0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m153427k0(q860 q860Var) {
        if (this.f132504b) {
            this.f132504b = false;
        } else {
            this.f132503a = q860Var;
            ((w800) this.viewModel).m202097l(q860Var.f153135a.size() > 0, q860Var);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m153428l0(j760 j760Var) {
        this.f132504b = true;
        ((w800) this.viewModel).m202097l(this.f132503a.f153135a.size() > 0, this.f132503a);
        if (this.f132503a.m173343c()) {
            FeedModule.f38854c.m60698S2();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
