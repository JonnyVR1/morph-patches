package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class bul0 extends x6s<nnn0, vtl0> {
    public bul0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new vtl0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m103950Y3(soj0 soj0Var) {
        m103954a4();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m103951W3(BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass, roj0 roj0Var) {
        m206028F2().VirtualRoomInfoEvent.updateRoomCategory().mo172463j(bLiveVoiceRoomSubClass.name);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m103952X3(List list) {
        ((vtl0) this.viewModel).m200045M(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m103953Z3(final BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        hfw.m130790a("[live][virtual_voice]", "saveCategory:" + bLiveVoiceRoomSubClass.f44507id);
        duringCreated(VirtualVoiceRoomApiProvider.saveRoomCategory(((nnn0) m206027E2()).m149818o(), bLiveVoiceRoomSubClass.f44507id)).doOnNext(new e30() { // from class: l.ytl0
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("[live][virtual_voice]", "saveCategory success");
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ztl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204737a.m103951W3(bLiveVoiceRoomSubClass, (roj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m103954a4() {
        ((vtl0) this.viewModel).m71834E();
        duringCreated(VirtualVoiceRoomApiProvider.getRoomCategory(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.aul0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71842a.m103952X3((List) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VirtualRoomInfoEvent.showVoiceCategoryDialog(), new e30() { // from class: l.xtl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194417a.m103950Y3((soj0) obj);
            }
        });
    }
}
