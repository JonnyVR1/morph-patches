package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvPanelViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public class z2r extends h4t<nnn0, KtvPanelViewModel> {
    public z2r(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public Pair<int[], Integer> m216985K3(j6n0 j6n0Var) {
        BLiveVoiceKtvPlayInfo playInfo = ((KtvPanelViewModel) this.viewModel).f52442c.getPlayInfo();
        return (playInfo == null || !TextUtils.equals(j6n0Var.f116489d, playInfo.userId)) ? ((KtvPanelViewModel) this.viewModel).f52443d.m77012u(j6n0Var.f116489d) : new Pair<>(sxj.m186441b(((KtvPanelViewModel) this.viewModel).f52442c.get_avatar()), Integer.valueOf(((KtvPanelViewModel) this.viewModel).f52442c.get_avatar().getWidth()));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        bsm<? extends T> bsmVar = this.f188512e;
        boolean z = bsmVar.f77098d;
        V v2 = this.viewModel;
        if (z) {
            m144512z2(new oyl0(bsmVar, ((KtvPanelViewModel) v2).f52443d));
        } else {
            m144512z2(new zsl0(bsmVar, ((KtvPanelViewModel) v2).f52443d));
        }
        m144512z2(new q2r(this.f188512e, ((KtvPanelViewModel) this.viewModel).f52442c));
        m129301d3(j6n0.class, new w9j() { // from class: l.y2r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195708a.m216985K3((j6n0) obj);
            }
        });
    }
}
