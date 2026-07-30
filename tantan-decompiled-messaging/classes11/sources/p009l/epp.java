package p009l;

import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import java.util.List;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.h4t;
import l.nnn0;
import l.q9o;
import l.s25;
import l.z2k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class epp extends h4t<nnn0, hpp> {
    public epp(bsm<? extends nnn0> bsmVar, hpp hppVar) {
        super(bsmVar);
        C(hppVar);
    }

    /* JADX INFO: renamed from: M3 */
    public void m14085M3(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        duringCreated(q9o.i(E2().o(), bLiveVoiceBackGroundPics.id)).subscribe(ffw.e(new e30() { // from class: l.cpp
            public final void call(Object obj) {
                this.f10723a.m14086N3(bLiveVoiceBackGroundPics, (BLiveVoiceRoom) obj);
            }
        }, new e30() { // from class: l.dpp
            public final void call(Object obj) {
                this.f11942a.m14087O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m14086N3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, BLiveVoiceRoom bLiveVoiceRoom) {
        ((hpp) ((bwr) this).viewModel).m15929i(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m14087O3(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43140) {
            m14089R3();
        }
        s25.c(th);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m14088P3(List list) {
        ((hpp) ((bwr) this).viewModel).m15928f(list);
    }

    /* JADX INFO: renamed from: R3 */
    public void m14089R3() {
        duringCreated(q9o.g()).subscribe(ffw.e(new e30() { // from class: l.bpp
            public final void call(Object obj) {
                this.f10235a.m14088P3((List) obj);
            }
        }, new z2k()));
    }
}
