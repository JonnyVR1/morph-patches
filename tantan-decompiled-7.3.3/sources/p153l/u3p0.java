package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHeartBeat;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heartbeat.VoiceTopHeartBeatView;

/* JADX INFO: loaded from: classes5.dex */
public class u3p0 extends i6t<rwn0, VoiceTopHeartBeatView> {

    /* JADX INFO: renamed from: i */
    public VoiceLiveHeartBeatInfoMessage f177358i;

    public u3p0(dum<? extends rwn0> dumVar, VoiceTopHeartBeatView voiceTopHeartBeatView) {
        super(dumVar);
        mo52715C(voiceTopHeartBeatView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m194379K3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m194382O3(jsv jsvVar) {
        m194383N3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final void m194383N3() {
        duringCreated(VoiceRoomApiProvider.getVoiceLiveHeartBeat(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.t3p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171940a.m194384P3((BLiveVoiceHeartBeat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m194384P3(BLiveVoiceHeartBeat bLiveVoiceHeartBeat) {
        ((VoiceTopHeartBeatView) this.viewModel).m79362R(bLiveVoiceHeartBeat.heartbeats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final void m194385R3(VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage) {
        if (((rwn0) m213810E2()).mo183440n().f45172id.equals(voiceLiveHeartBeatInfoMessage.roomId) && ((rwn0) m213810E2()).mo183435j().f45171id.equals(voiceLiveHeartBeatInfoMessage.liveId)) {
            VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage2 = this.f177358i;
            if (voiceLiveHeartBeatInfoMessage2 != null && voiceLiveHeartBeatInfoMessage.timestamp <= voiceLiveHeartBeatInfoMessage2.timestamp) {
                return;
            }
            ((VoiceTopHeartBeatView) this.viewModel).m79362R(voiceLiveHeartBeatInfoMessage.heartBeat);
            this.f177358i = voiceLiveHeartBeatInfoMessage;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        boolean zM203693o7 = zrv.m221193k().m203693o7();
        V v2 = this.viewModel;
        if (!zM203693o7) {
            ((VoiceTopHeartBeatView) v2).m79363S(false);
            return;
        }
        ((VoiceTopHeartBeatView) v2).m79363S(true);
        m194383N3();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98245O0()).subscribe(dhw.m115826e(new y20() { // from class: l.q3p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155475a.m194385R3((VoiceLiveHeartBeatInfoMessage) obj);
            }
        }, new y20() { // from class: l.r3p0
            @Override // p153l.y20
            public final void call(Object obj) {
                u3p0.m194379K3((Throwable) obj);
            }
        }));
        if (m213815L2()) {
            return;
        }
        duringCreated(((rwn0) m213810E2()).mo183449u()).subscribe(dhw.m115829h(new y20() { // from class: l.s3p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166026a.m194382O3((jsv) obj);
            }
        }));
    }
}
