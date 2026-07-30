package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class bzn0 extends i6t<rwn0, VoiceLiveHeatBoxEntryView> {
    public bzn0(dum dumVar, VoiceLiveHeatBoxEntryView voiceLiveHeatBoxEntryView) {
        super(dumVar);
        mo52715C(voiceLiveHeatBoxEntryView);
    }

    /* JADX INFO: renamed from: M3 */
    public void m107240M3(String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(bae0.m103149b(1124, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m107241N3(Long l2) {
        return VoiceRoomApiProvider.getHeatBoxData(((rwn0) m213810E2()).m202194o());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m107242O3(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance) {
        ((VoiceLiveHeatBoxEntryView) this.viewModel).m79368l0(bLiveVoiceHeatBoxEntrance, true);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m107243P3(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance) {
        ((VoiceLiveHeatBoxEntryView) this.viewModel).m79368l0(bLiveVoiceHeatBoxEntrance, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final void m107244R3() {
        m138858H3(((rwn0) m213810E2()).m168521h2(30, TimeUnit.SECONDS)).flatMap(new qcj() { // from class: l.zyn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206619a.m107241N3((Long) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.azn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74174a.m107242O3((BLiveVoiceHeatBoxEntrance) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(VoiceRoomApiProvider.getHeatBoxData(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.yyn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202120a.m107243P3((BLiveVoiceHeatBoxEntrance) obj);
            }
        }));
        m107244R3();
    }
}
