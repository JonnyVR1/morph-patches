package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class xpn0 extends h4t<nnn0, VoiceLiveHeatBoxEntryView> {
    public xpn0(bsm bsmVar, VoiceLiveHeatBoxEntryView voiceLiveHeatBoxEntryView) {
        super(bsmVar);
        mo51532C(voiceLiveHeatBoxEntryView);
    }

    /* JADX INFO: renamed from: M3 */
    public void m210521M3(String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(x1e0.m206696b(1124, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m210522N3(Long l2) {
        return VoiceRoomApiProvider.getHeatBoxData(((nnn0) m206027E2()).m149818o());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m210523O3(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance) {
        ((VoiceLiveHeatBoxEntryView) this.viewModel).m78185l0(bLiveVoiceHeatBoxEntrance, true);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m210524P3(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance) {
        ((VoiceLiveHeatBoxEntryView) this.viewModel).m78185l0(bLiveVoiceHeatBoxEntrance, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final void m210525R3() {
        m129299H3(((nnn0) m206027E2()).m132135h2(30, TimeUnit.SECONDS)).flatMap(new w9j() { // from class: l.vpn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182514a.m210522N3((Long) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.wpn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187566a.m210523O3((BLiveVoiceHeatBoxEntrance) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(VoiceRoomApiProvider.getHeatBoxData(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.upn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177647a.m210524P3((BLiveVoiceHeatBoxEntrance) obj);
            }
        }));
        m210525R3();
    }
}
