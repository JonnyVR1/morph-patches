package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvPanelViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public class a5r extends i6t<rwn0, KtvPanelViewModel> {
    public a5r(dum<? extends rwn0> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public Pair<int[], Integer> m96242K3(nfn0 nfn0Var) {
        BLiveVoiceKtvPlayInfo playInfo = ((KtvPanelViewModel) this.viewModel).f53290c.getPlayInfo();
        return (playInfo == null || !TextUtils.equals(nfn0Var.f141748d, playInfo.userId)) ? ((KtvPanelViewModel) this.viewModel).f53291d.m78195u(nfn0Var.f141748d) : new Pair<>(i0k.m137975b(((KtvPanelViewModel) this.viewModel).f53290c.get_avatar()), Integer.valueOf(((KtvPanelViewModel) this.viewModel).f53290c.get_avatar().getWidth()));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        dum<? extends T> dumVar = this.f196918e;
        boolean z = dumVar.f90818d;
        V v2 = this.viewModel;
        if (z) {
            m153103z2(new s7m0(dumVar, ((KtvPanelViewModel) v2).f53291d));
        } else {
            m153103z2(new d2m0(dumVar, ((KtvPanelViewModel) v2).f53291d));
        }
        m153103z2(new r4r(this.f196918e, ((KtvPanelViewModel) this.viewModel).f53290c));
        m138860d3(nfn0.class, new qcj() { // from class: l.z4r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202974a.m96242K3((nfn0) obj);
            }
        });
    }
}
