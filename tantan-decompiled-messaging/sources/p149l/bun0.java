package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;

/* JADX INFO: loaded from: classes11.dex */
public class bun0 extends h4t<nnn0, gun0> {

    /* JADX INFO: renamed from: i */
    public txn0 f77360i;

    public bun0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new gun0());
        ((gun0) this.viewModel).mo21065i1(this);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m103972M3() {
        ((gun0) this.viewModel).m128067p();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m103973N3(BLiveIntlMedalWall bLiveIntlMedalWall) {
        ((gun0) this.viewModel).m128063C(bLiveIntlMedalWall);
    }

    /* JADX INFO: renamed from: O3 */
    public void m103974O3(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        this.f77360i.m190964L3(bLiveIntlMedalWallItem);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m103975P3(String str) {
        duringCreated(VoiceRoomApiProvider.getMedalWallData(str)).subscribe(ffw.m121194e(new e30() { // from class: l.aun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71845a.m103973N3((BLiveIntlMedalWall) obj);
            }
        }, new z2k()));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        txn0 txn0Var = (txn0) m144512z2(new txn0(this.f188512e));
        this.f77360i = txn0Var;
        txn0Var.m190963K3(new d30() { // from class: l.ytn0
            @Override // p149l.d30
            public final void call() {
                this.f199999a.m103972M3();
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().IntlVoiceMedalWallEvent.showMedalWall().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.ztn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204743a.m103975P3((String) obj);
            }
        }, new z2k()));
    }
}
