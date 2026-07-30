package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;

/* JADX INFO: loaded from: classes13.dex */
public class uws extends cts<LiveTeenModeViewModel> {
    public uws(mcr mcrVar, mss mssVar, LiveTeenModeViewModel liveTeenModeViewModel) {
        super(mcrVar, mssVar);
        this.viewModel = liveTeenModeViewModel;
        mo51532C(liveTeenModeViewModel);
    }

    /* JADX INFO: renamed from: R2 */
    public void m196139R2(final ViewGroup viewGroup, View view, final Act act) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.sws
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pgi0.m168730l().m168733C(act);
            }
        });
        xdl0.m208345M0(viewGroup, pgi0.m168730l().m168751x());
        duringCreated(pgi0.m168730l().m168752y()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.tws
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208344M(viewGroup, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        V v2 = this.viewModel;
        m196139R2((ViewGroup) v2, ((LiveTeenModeViewModel) v2).f45030a, getAct());
    }
}
