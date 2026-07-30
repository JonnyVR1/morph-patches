package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHeartBeat;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heartbeat.VoiceTopHeartBeatView;

/* JADX INFO: loaded from: classes5.dex */
public class quo0 extends h4t<nnn0, VoiceTopHeartBeatView> {

    /* JADX INFO: renamed from: i */
    public VoiceLiveHeartBeatInfoMessage f156529i;

    public quo0(bsm<? extends nnn0> bsmVar, VoiceTopHeartBeatView voiceTopHeartBeatView) {
        super(bsmVar);
        mo51532C(voiceTopHeartBeatView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m176629K3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m176632O3(iqv iqvVar) {
        m176633N3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final void m176633N3() {
        duringCreated(VoiceRoomApiProvider.getVoiceLiveHeartBeat(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.puo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151327a.m176634P3((BLiveVoiceHeartBeat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m176634P3(BLiveVoiceHeartBeat bLiveVoiceHeartBeat) {
        ((VoiceTopHeartBeatView) this.viewModel).m78179R(bLiveVoiceHeartBeat.heartbeats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final void m176635R3(VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage) {
        if (((nnn0) m206027E2()).mo149817n().f44324id.equals(voiceLiveHeartBeatInfoMessage.roomId) && ((nnn0) m206027E2()).mo149813j().f44323id.equals(voiceLiveHeartBeatInfoMessage.liveId)) {
            VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage2 = this.f156529i;
            if (voiceLiveHeartBeatInfoMessage2 != null && voiceLiveHeartBeatInfoMessage.timestamp <= voiceLiveHeartBeatInfoMessage2.timestamp) {
                return;
            }
            ((VoiceTopHeartBeatView) this.viewModel).m78179R(voiceLiveHeartBeatInfoMessage.heartBeat);
            this.f156529i = voiceLiveHeartBeatInfoMessage;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        boolean zM195906o7 = ypv.m215672k().m195906o7();
        V v2 = this.viewModel;
        if (!zM195906o7) {
            ((VoiceTopHeartBeatView) v2).m78180S(false);
            return;
        }
        ((VoiceTopHeartBeatView) v2).m78180S(true);
        m176633N3();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189063O0()).subscribe(ffw.m121194e(new e30() { // from class: l.muo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135826a.m176635R3((VoiceLiveHeartBeatInfoMessage) obj);
            }
        }, new e30() { // from class: l.nuo0
            @Override // p149l.e30
            public final void call(Object obj) {
                quo0.m176629K3((Throwable) obj);
            }
        }));
        if (m206032L2()) {
            return;
        }
        duringCreated(((nnn0) m206027E2()).mo149823u()).subscribe(ffw.m121197h(new e30() { // from class: l.ouo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145716a.m176632O3((iqv) obj);
            }
        }));
    }
}
