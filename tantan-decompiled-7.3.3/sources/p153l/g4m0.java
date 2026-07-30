package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes5.dex */
public class g4m0 extends y8s<rwn0, b4m0> {
    public g4m0(dum dumVar) {
        super(dumVar);
        mo52715C(new b4m0(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m128903V3(Notification notification) {
        ((b4m0) this.viewModel).m73017E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ C22421c m128904W3(vxj0 vxj0Var) {
        return VirtualVoiceRoomApiProvider.getVirtualRoomLevelDetail(((rwn0) m213810E2()).m202194o());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m128905X3(BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail) {
        ((b4m0) this.viewModel).m102493W(bLiveVoiceRoomLevelDetail);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m199270g()).doOnEach(new y20() { // from class: l.d4m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85054a.m128903V3((Notification) obj);
            }
        }).flatMap(new qcj() { // from class: l.e4m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92134a.m128904W3((vxj0) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.f4m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97115a.m128905X3((BLiveVoiceRoomLevelDetail) obj);
            }
        }));
    }
}
