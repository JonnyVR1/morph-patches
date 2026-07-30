package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes5.dex */
public class cvl0 extends x6s<nnn0, xul0> {
    public cvl0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new xul0(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m108882V3(Notification notification) {
        ((xul0) this.viewModel).m71834E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ C22306c m108883W3(soj0 soj0Var) {
        return VirtualVoiceRoomApiProvider.getVirtualRoomLevelDetail(((nnn0) m206027E2()).m149818o());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m108884X3(BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail) {
        ((xul0) this.viewModel).m211137W(bLiveVoiceRoomLevelDetail);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m172460g()).doOnEach(new e30() { // from class: l.zul0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204862a.m108882V3((Notification) obj);
            }
        }).flatMap(new w9j() { // from class: l.avl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f71950a.m108883W3((soj0) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.bvl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77471a.m108884X3((BLiveVoiceRoomLevelDetail) obj);
            }
        }));
    }
}
