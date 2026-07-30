package p153l;

import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class l9g extends tk2<h9g> {
    public l9g(dum dumVar) {
        super(dumVar);
        mo52715C(new h9g(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m153421m4(Boolean bool) {
        ((h9g) this.viewModel).m134055M(bool.booleanValue());
        ((h9g) this.viewModel).m73017E();
    }

    /* JADX INFO: renamed from: k4 */
    public void m153422k4() {
        ((h9g) this.viewModel).m73022q(null);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m153423l4() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7001).m174141B(efv.f93853j).m174140A(bnl0.m105592y0(), ((h9g) this.viewModel).f108405k.getHeight() + qa00.m175859d(10.0f)).m174145s(qa00.m175859d(10.0f)).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174146t(80).m174143q());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m153424n4() {
        ((h9g) this.viewModel).m134054J();
        m153103z2(new lag(this.f196918e, this));
    }

    /* JADX INFO: renamed from: o4 */
    public void m153425o4() {
        ((h9g) this.viewModel).f108405k.post(new Runnable() { // from class: l.k9g
            @Override // java.lang.Runnable
            public final void run() {
                this.f124543a.m153423l4();
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansClubEvent.showFansClubBigEventDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.j9g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118880a.m153421m4((Boolean) obj);
            }
        }));
    }
}
