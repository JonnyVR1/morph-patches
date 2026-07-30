package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;
import com.p051p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;

/* JADX INFO: loaded from: classes5.dex */
public class gun0 extends rvo0<jqm0> {
    public gun0(dum dumVar, FrameLayout frameLayout) {
        super(dumVar, frameLayout);
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ void m132353h4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m132355j4(jsv jsvVar) {
        m183291V3();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m132356k4(BLiveVoice bLiveVoice) {
        if (this.f165041k.equals(bLiveVoice.liveMode)) {
            return;
        }
        String str = bLiveVoice.liveMode;
        this.f165041k = str;
        if ("auction".equals(str)) {
            m183292W3(VoiceLiveMotionType.voice_auction);
        } else if ("normal".equals(this.f165041k) || !wft.m206159b(3)) {
            m183292W3(VoiceLiveMotionType.voice_call_normal);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m132357l4(Integer num) {
        m183293X3();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m132358m4(jsv jsvVar) {
        if (jsvVar.m146877c()) {
            m183294Y3(false, null, this.f165040j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.rvo0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.vtn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185732a.m132358m4((jsv) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).mo183449u()).subscribe(dhw.m115825d(new y20() { // from class: l.ztn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206030a.m132355j4((jsv) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m183409O2().m188658d()).subscribe(dhw.m115829h(new y20() { // from class: l.aun0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73533a.m132356k4((BLiveVoice) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m168545q1().f71686Y).map(new bun0()).map(new qcj() { // from class: l.cun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("end".equals(((BLiveUndercoverGame) obj).status));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.dun0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90831a.m183295Z3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(((jqm0) m213810E2()).m168545q1().f71763s0).filter(new qcj() { // from class: l.eun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSingTogether) obj).status != BLiveVoiceSingTogehterState.get("end"));
            }
        }).map(new qcj() { // from class: l.fun0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(BLiveVoiceSingTogehterState.get("end").equals(((BLiveVoiceSingTogether) obj).status));
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.dun0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90831a.m183295Z3(((Boolean) obj).booleanValue());
            }
        }, new y20() { // from class: l.wtn0
            @Override // p153l.y20
            public final void call(Object obj) {
                gun0.m132353h4((Throwable) obj);
            }
        }));
        duringCreated(m213811F2().VoiceGameChangeEvent.stopVoiceGame().m199270g()).filter(new qcj() { // from class: l.xtn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 5);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ytn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201528a.m132357l4((Integer) obj);
            }
        }));
    }
}
