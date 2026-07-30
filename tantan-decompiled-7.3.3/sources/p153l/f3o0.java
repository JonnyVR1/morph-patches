package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;

/* JADX INFO: loaded from: classes10.dex */
public class f3o0 extends i6t<rwn0, k3o0> {

    /* JADX INFO: renamed from: i */
    public x6o0 f97002i;

    public f3o0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new k3o0());
        ((k3o0) this.viewModel).mo22064i1(this);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m123768M3() {
        ((k3o0) this.viewModel).m148138p();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m123769N3(BLiveIntlMedalWall bLiveIntlMedalWall) {
        ((k3o0) this.viewModel).m148134C(bLiveIntlMedalWall);
    }

    /* JADX INFO: renamed from: O3 */
    public void m123770O3(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        this.f97002i.m209511L3(bLiveIntlMedalWallItem);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m123771P3(String str) {
        duringCreated(VoiceRoomApiProvider.getMedalWallData(str)).subscribe(dhw.m115826e(new y20() { // from class: l.e3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91984a.m123769N3((BLiveIntlMedalWall) obj);
            }
        }, new r5k()));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        x6o0 x6o0Var = (x6o0) m153103z2(new x6o0(this.f196918e));
        this.f97002i = x6o0Var;
        x6o0Var.m209510K3(new x20() { // from class: l.c3o0
            @Override // p153l.x20
            public final void call() {
                this.f79635a.m123768M3();
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().IntlVoiceMedalWallEvent.showMedalWall().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.d3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84929a.m123771P3((String) obj);
            }
        }, new r5k()));
    }
}
