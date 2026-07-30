package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.base.room.LiveBgView;

/* JADX INFO: loaded from: classes4.dex */
public class yyr extends i6t<oo2, LiveBgView> {
    public yyr(dum dumVar, LiveBgView liveBgView, View view) {
        super(dumVar);
        liveBgView.setPlayerMaskView(view);
        mo52715C(liveBgView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ Boolean m218001L3(vyr vyrVar) {
        return Boolean.valueOf(m213810E2().m202193m().m146884j());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m218002M3(vyr vyrVar) {
        int i = vyrVar.f186419c;
        V v2 = this.viewModel;
        if (i == -1) {
            ((LiveBgView) v2).m73166c(false, i);
        } else {
            ((LiveBgView) v2).m73166c(true, i);
        }
        ((LiveBgView) this.viewModel).m73167d(vyrVar.f186417a, vyrVar.f186418b);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (m213810E2() instanceof mc50) {
            ((LiveBgView) this.viewModel).setOfficialShowMode(true);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LiveBgEvent.showBg().m199270g()).filter(new qcj() { // from class: l.wyr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191673a.m218001L3((vyr) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.xyr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196780a.m218002M3((vyr) obj);
            }
        }));
    }
}
