package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;

/* JADX INFO: loaded from: classes9.dex */
public class vys extends dvs<LiveTeenModeViewModel> {
    public vys(ner nerVar, nus nusVar, LiveTeenModeViewModel liveTeenModeViewModel) {
        super(nerVar, nusVar);
        this.viewModel = liveTeenModeViewModel;
        mo52715C(liveTeenModeViewModel);
    }

    /* JADX INFO: renamed from: R2 */
    public void m204038R2(final ViewGroup viewGroup, View view, final Act act) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.tys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ppi0.m173207l().m173210C(act);
            }
        });
        bnl0.m105525M0(viewGroup, ppi0.m173207l().m173228x());
        duringCreated(ppi0.m173207l().m173229y()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.uys
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105524M(viewGroup, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        V v2 = this.viewModel;
        m204038R2((ViewGroup) v2, ((LiveTeenModeViewModel) v2).f45878a, getAct());
    }
}
