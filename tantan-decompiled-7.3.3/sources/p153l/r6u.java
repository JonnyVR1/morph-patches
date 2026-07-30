package p153l;

import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;

/* JADX INFO: loaded from: classes9.dex */
public class r6u extends dvs<LiveSquareTopButtonViewModel> {
    public r6u(ner nerVar, nus nusVar, LiveSquareTopButtonViewModel liveSquareTopButtonViewModel) {
        super(nerVar, nusVar);
        mo52715C(liveSquareTopButtonViewModel);
        m153103z2(new uav(nerVar, nusVar, ((LiveSquareTopButtonViewModel) this.viewModel).f45886e));
        m153103z2(new oys(nerVar, nusVar, ((LiveSquareTopButtonViewModel) this.viewModel).f45885d));
        m153103z2(new jxu(nerVar, nusVar, ((LiveSquareTopButtonViewModel) this.viewModel).f45887f));
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m180047Q2(String str, uwl uwlVar) {
        if (uwlVar instanceof sm50) {
            sm50 sm50Var = (sm50) uwlVar;
            sm50Var.mo147413S(sm50Var.mo147415b2(str), str);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final void m180048R2(final String str) {
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.q6u
            @Override // p153l.y20
            public final void call(Object obj) {
                r6u.m180047Q2(str, (uwl) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.p6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150875a.m180048R2((String) obj);
            }
        }));
    }
}
