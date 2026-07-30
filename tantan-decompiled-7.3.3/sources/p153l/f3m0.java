package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class f3m0 extends y8s<rwn0, z2m0> {
    public f3m0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new z2m0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m123745Y3(vxj0 vxj0Var) {
        m123749a4();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m123746W3(BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass, uxj0 uxj0Var) {
        m213811F2().VirtualRoomInfoEvent.updateRoomCategory().mo199273j(bLiveVoiceRoomSubClass.name);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m123747X3(List list) {
        ((z2m0) this.viewModel).m218453M(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m123748Z3(final BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        fhw.m125605a("[live][virtual_voice]", "saveCategory:" + bLiveVoiceRoomSubClass.f45355id);
        duringCreated(VirtualVoiceRoomApiProvider.saveRoomCategory(((rwn0) m213810E2()).m202194o(), bLiveVoiceRoomSubClass.f45355id)).doOnNext(new y20() { // from class: l.c3m0
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("[live][virtual_voice]", "saveCategory success");
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.d3m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84916a.m123746W3(bLiveVoiceRoomSubClass, (uxj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m123749a4() {
        ((z2m0) this.viewModel).m73017E();
        duringCreated(VirtualVoiceRoomApiProvider.getRoomCategory(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.e3m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91981a.m123747X3((List) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VirtualRoomInfoEvent.showVoiceCategoryDialog(), new y20() { // from class: l.b3m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74788a.m123745Y3((vxj0) obj);
            }
        });
    }
}
