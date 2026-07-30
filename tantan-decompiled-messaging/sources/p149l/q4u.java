package p149l;

import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;

/* JADX INFO: loaded from: classes13.dex */
public class q4u extends cts<LiveSquareTopButtonViewModel> {
    public q4u(mcr mcrVar, mss mssVar, LiveSquareTopButtonViewModel liveSquareTopButtonViewModel) {
        super(mcrVar, mssVar);
        mo51532C(liveSquareTopButtonViewModel);
        m144512z2(new t8v(mcrVar, mssVar, ((LiveSquareTopButtonViewModel) this.viewModel).f45038e));
        m144512z2(new nws(mcrVar, mssVar, ((LiveSquareTopButtonViewModel) this.viewModel).f45037d));
        m144512z2(new ivu(mcrVar, mssVar, ((LiveSquareTopButtonViewModel) this.viewModel).f45039f));
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m172975Q2(String str, gul gulVar) {
        if (gulVar instanceof le50) {
            le50 le50Var = (le50) gulVar;
            le50Var.mo138652S(le50Var.mo138654b2(str), str);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final void m172976R2(final String str) {
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.p4u
            @Override // p149l.e30
            public final void call(Object obj) {
                q4u.m172975Q2(str, (gul) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.o4u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141815a.m172976R2((String) obj);
            }
        }));
    }
}
