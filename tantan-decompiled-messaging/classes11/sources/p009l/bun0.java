package p009l;

import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.h4t;
import l.nnn0;
import l.wxs;
import l.z2k;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bun0 extends h4t<nnn0, gun0> {

    /* JADX INFO: renamed from: i */
    public txn0 f10320i;

    public bun0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        C(new gun0());
        ((gun0) ((bwr) this).viewModel).m15309i1(this);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m12271M3() {
        ((gun0) ((bwr) this).viewModel).m15312p();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m12272N3(BLiveIntlMedalWall bLiveIntlMedalWall) {
        ((gun0) ((bwr) this).viewModel).m15306C(bLiveIntlMedalWall);
    }

    /* JADX INFO: renamed from: O3 */
    public void m12273O3(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        this.f10320i.m22694L3(bLiveIntlMedalWallItem);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m12274P3(String str) {
        duringCreated(VoiceRoomApiProvider.getMedalWallData(str)).subscribe(ffw.e(new e30() { // from class: l.aun0
            public final void call(Object obj) {
                this.f9701a.m12272N3((BLiveIntlMedalWall) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: T */
    public void m12275T() {
        super/*l.k4t*/.T();
        txn0 txn0VarZ2 = z2(new txn0(((wxs) this).e));
        this.f10320i = txn0VarZ2;
        txn0VarZ2.m22693K3(new d30() { // from class: l.ytn0
            public final void call() {
                this.f23230a.m12271M3();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m12276t() {
        super/*l.k4t*/.t();
        duringCreated((c) F2().IntlVoiceMedalWallEvent.showMedalWall().g()).subscribe(ffw.e(new e30() { // from class: l.ztn0
            public final void call(Object obj) {
                this.f23903a.m12274P3((String) obj);
            }
        }, new z2k()));
    }
}
