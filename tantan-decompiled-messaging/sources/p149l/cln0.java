package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;
import com.p046p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;

/* JADX INFO: loaded from: classes5.dex */
public class cln0 extends nmo0<fhm0> {
    public cln0(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar, frameLayout);
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ void m107570h4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m107572j4(iqv iqvVar) {
        m160148V3();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m107573k4(BLiveVoice bLiveVoice) {
        if (this.f139650k.equals(bLiveVoice.liveMode)) {
            return;
        }
        String str = bLiveVoice.liveMode;
        this.f139650k = str;
        if ("auction".equals(str)) {
            m160149W3(VoiceLiveMotionType.voice_auction);
        } else if ("normal".equals(this.f139650k) || !vdt.m198092b(3)) {
            m160149W3(VoiceLiveMotionType.voice_call_normal);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m107574l4(Integer num) {
        m160150X3();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m107575m4(iqv iqvVar) {
        if (iqvVar.m137796c()) {
            m160151Y3(false, null, this.f139649j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.nmo0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.rkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159875a.m107575m4((iqv) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).mo149823u()).subscribe(ffw.m121193d(new e30() { // from class: l.vkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181830a.m107572j4((iqv) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m160247O2().m165466d()).subscribe(ffw.m121197h(new e30() { // from class: l.wkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186790a.m107573k4((BLiveVoice) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m132160q1().f170419Y).map(new xkn0()).map(new w9j() { // from class: l.ykn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("end".equals(((BLiveUndercoverGame) obj).status));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.zkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203554a.m160152Z3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(((fhm0) m206027E2()).m132160q1().f170496s0).filter(new w9j() { // from class: l.aln0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSingTogether) obj).status != BLiveVoiceSingTogehterState.get("end"));
            }
        }).map(new w9j() { // from class: l.bln0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(BLiveVoiceSingTogehterState.get("end").equals(((BLiveVoiceSingTogether) obj).status));
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.zkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203554a.m160152Z3(((Boolean) obj).booleanValue());
            }
        }, new e30() { // from class: l.skn0
            @Override // p149l.e30
            public final void call(Object obj) {
                cln0.m107570h4((Throwable) obj);
            }
        }));
        duringCreated(m206028F2().VoiceGameChangeEvent.stopVoiceGame().m172460g()).filter(new w9j() { // from class: l.tkn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 5);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ukn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176947a.m107574l4((Integer) obj);
            }
        }));
    }
}
