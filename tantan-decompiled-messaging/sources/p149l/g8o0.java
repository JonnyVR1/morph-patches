package p149l;

import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class g8o0 extends pat<fhm0> implements l3m, bul {

    /* JADX INFO: renamed from: i */
    public c4g0 f101508i;

    /* JADX INFO: renamed from: j */
    public final nph0 f101509j;

    /* JADX INFO: renamed from: k */
    public d8s f101510k;

    /* JADX INFO: renamed from: l.g8o0$a */
    public class C17023a extends d8s {
        public C17023a() {
        }

        @Override // p149l.d8s, p149l.g4m
        /* JADX INFO: renamed from: d0 */
        public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo110356d0(str, j, mMLivePushType);
            gkh0.m126627j("[live]voicePlayer", "stop player when rtc connect");
            g8o0.this.m124765U3();
        }
    }

    public g8o0(bsm bsmVar) {
        super(bsmVar);
        this.f101510k = new C17023a();
        final nph0 nph0Var = new nph0();
        this.f101509j = nph0Var;
        C22306c<cul> c22306cM172460g = m206028F2().PlayerEvent.updatePlayer().m172460g();
        Objects.requireNonNull(nph0Var);
        this.f101508i = c22306cM172460g.subscribe(ffw.m121193d(new e30() { // from class: l.c8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                nph0Var.m160502y((cul) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    private void m124762O3() {
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(4400))).mo133471a();
        if (c12714bMo133471a != null || c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            gkh0.m126627j("[voice][call]", "rtc has started, needn't pull video stream");
        } else {
            m129299H3(((fhm0) m206027E2()).m132135h2(10, TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.e8o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89852a.m124768S3((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m124763P3(BLiveAbsData bLiveAbsData) {
        if (((Boolean) m129297F3(new tgd0(40001))).booleanValue()) {
            gkh0.m126627j("[voice][call]", "join rtc ,can`t play cdn voice stream ");
            return;
        }
        gkh0.m126627j("[live]voicePlayer", "voice player result:" + this.f101509j.m160492o(bLiveAbsData, null, this, ((fhm0) m206027E2()).m149826x(), ((fhm0) m206027E2()).mo132155o0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    private void m124764T3() {
        act().progressDismiss();
        BLiveVoice bLiveVoiceMo149813j = ((fhm0) m206027E2()).mo149813j();
        if (bLiveVoiceMo149813j.streamUrl.useCurrentPullStream || !this.f101509j.m160488k()) {
            m124763P3(bLiveVoiceMo149813j);
        } else {
            gkh0.m126627j("[live]voicePlayer", "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m124765U3() {
        this.f101509j.m160498u(true);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: D0 */
    public void mo103933D0() {
        q880.m173349e(this);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m124766N3(String str) {
        if (pqi.m170914f()) {
            return;
        }
        this.f101509j.m160482e(str);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: O0 */
    public void mo103936O0(BLiveCallVolume bLiveCallVolume) {
        m206028F2().PlayerEvent.callVolumeChanged().mo172463j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m124767R3(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m124764T3();
        } else {
            if (iM137794a != 4) {
                return;
            }
            gkh0.m126627j("[live]voicePlayer", "stop player when live end");
            m124765U3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m124768S3(Long l2) {
        gkh0.m126627j("[live]voicePlayer", "audience retryConnect");
        duringCreated(hrv.m132729L(((fhm0) m206027E2()).m149814k())).subscribe(ffw.m121193d(new e30() { // from class: l.f8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96392a.m124763P3((BLiveVoice) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m124766N3("voice");
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.d8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84882a.m124767R3((iqv) obj);
            }
        }));
        ((kql) m129297F3(new s0f(1800))).mo118144b(this.f101510k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bul
    /* JADX INFO: renamed from: l0 */
    public void mo103940l0(int i) {
        if (((fhm0) m206027E2()).m149820r()) {
            m124762O3();
        }
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
        mkd0.m154992z(this.f101508i);
        this.f101509j.m160483f();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        gkh0.m126627j("[live]voicePlayer", "stop player when detach");
        this.f101509j.m160499v();
        this.f101509j.m160501x();
        super.mo69117n();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: q0 */
    public void mo103943q0() {
        lsi0.m151563A(ypv.f199497e.getString(R$string.f46786K9), true);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: O */
    public void mo103935O() {
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: f2 */
    public void mo103939f2() {
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: p1 */
    public void mo103942p1(int i) {
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: s1 */
    public void mo103944s1(ArrayList<String> arrayList) {
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: u1 */
    public void mo103945u1() {
    }
}
