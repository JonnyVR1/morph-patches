package p002l;

import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.bwr;
import l.ddv;
import l.e30;
import l.ffw;
import l.t100;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x7g extends lk2<t7g> {
    public x7g(bsm bsmVar) {
        super(bsmVar);
        C(new t7g(bsmVar.f8332a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m25739m4(Boolean bool) {
        ((t7g) ((bwr) this).viewModel).m22808M(bool.booleanValue());
        ((t7g) ((bwr) this).viewModel).m5211E();
    }

    /* JADX INFO: renamed from: k4 */
    public void m25740k4() {
        ((t7g) ((bwr) this).viewModel).m5217q(null);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m25741l4() {
        m25548F2().OpenH5Event.open().j(jp50.m16064c(7001).m16094B(ddv.j).m16093A(xdl0.y0(), ((t7g) ((bwr) this).viewModel).f20119k.getHeight() + t100.d(10.0f)).m16098s(t100.d(10.0f)).m16095p(CommonH5Builder.BgType.DEFAULT_BG).m16099t(80).m16096q());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m25742n4() {
        ((t7g) ((bwr) this).viewModel).m22807J();
        z2(new x8g(this.f22036e, this));
    }

    /* JADX INFO: renamed from: o4 */
    public void m25743o4() {
        ((t7g) ((bwr) this).viewModel).f20119k.post(new Runnable() { // from class: l.w7g
            @Override // java.lang.Runnable
            public final void run() {
                this.f21548a.m25741l4();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m25744t() {
        super.t();
        duringCreated((c) m25548F2().FansClubEvent.showFansClubBigEventDialog().g()).subscribe(ffw.d(new e30() { // from class: l.v7g
            public final void call(Object obj) {
                this.f21026a.m25739m4((Boolean) obj);
            }
        }));
    }
}
