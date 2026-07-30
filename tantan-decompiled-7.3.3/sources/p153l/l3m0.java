package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;

/* JADX INFO: loaded from: classes5.dex */
public class l3m0 extends y8s<rwn0, i3m0> {
    public l3m0(dum dumVar) {
        super(dumVar);
        mo52715C(new i3m0(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m152713T3(BLiveVoiceRoomProfile bLiveVoiceRoomProfile) {
        ((i3m0) this.viewModel).m138322O(bLiveVoiceRoomProfile);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VirtualRoomInfoEvent.showVoiceRoomHeatDialog(), new y20() { // from class: l.k3m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123726a.m152713T3((BLiveVoiceRoomProfile) obj);
            }
        });
    }
}
