package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;

/* JADX INFO: loaded from: classes5.dex */
public class hul0 extends x6s<nnn0, eul0> {
    public hul0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new eul0(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m133121T3(BLiveVoiceRoomProfile bLiveVoiceRoomProfile) {
        ((eul0) this.viewModel).m118188O(bLiveVoiceRoomProfile);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VirtualRoomInfoEvent.showVoiceRoomHeatDialog(), new e30() { // from class: l.gul0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104418a.m133121T3((BLiveVoiceRoomProfile) obj);
            }
        });
    }
}
