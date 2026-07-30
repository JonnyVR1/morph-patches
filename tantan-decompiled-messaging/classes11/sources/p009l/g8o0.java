package p009l;

import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.livingroom.archi.sdk.motion.base.b;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.bsm;
import l.bul;
import l.c4g0;
import l.cul;
import l.d8s;
import l.e30;
import l.ffw;
import l.fhm0;
import l.gkh0;
import l.hrv;
import l.iqv;
import l.kql;
import l.l3m;
import l.lsi0;
import l.mkd0;
import l.nph0;
import l.oxl;
import l.pat;
import l.pqi;
import l.q880;
import l.rv00;
import l.s0f;
import l.tgd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g8o0 extends pat<fhm0> implements l3m, bul {

    /* JADX INFO: renamed from: i */
    public c4g0 f13374i;

    /* JADX INFO: renamed from: j */
    public final nph0 f13375j;

    /* JADX INFO: renamed from: k */
    public d8s f13376k;

    /* JADX INFO: renamed from: l.g8o0$a */
    public class C0911a extends d8s {
        public C0911a() {
        }

        /* JADX INFO: renamed from: d0 */
        public void m14844d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.d0(str, j, mMLivePushType);
            gkh0.j("[live]voicePlayer", "stop player when rtc connect");
            g8o0.this.m14828U3();
        }
    }

    public g8o0(bsm bsmVar) {
        super(bsmVar);
        this.f13376k = new C0911a();
        final nph0 nph0Var = new nph0();
        this.f13375j = nph0Var;
        c cVar = (c) F2().PlayerEvent.updatePlayer().g();
        Objects.requireNonNull(nph0Var);
        this.f13374i = cVar.subscribe(ffw.d(new e30() { // from class: l.c8o0
            public final void call(Object obj) {
                nph0Var.y((cul) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O3 */
    private void m14825O3() {
        b bVarA = ((oxl) F3(new rv00(4400))).a();
        if (bVarA != null || bVarA.c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            gkh0.j("[voice][call]", "rtc has started, needn't pull video stream");
        } else {
            H3(E2().h2(10, TimeUnit.SECONDS)).subscribe(ffw.d(new e30() { // from class: l.e8o0
                public final void call(Object obj) {
                    this.f12450a.m14834S3((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public void m14826P3(BLiveAbsData bLiveAbsData) {
        if (((Boolean) F3(new tgd0(40001))).booleanValue()) {
            gkh0.j("[voice][call]", "join rtc ,can`t play cdn voice stream ");
            return;
        }
        gkh0.j("[live]voicePlayer", "voice player result:" + this.f13375j.o(bLiveAbsData, (FrameLayout) null, this, E2().x(), E2().o0()));
    }

    /* JADX INFO: renamed from: T3 */
    private void m14827T3() {
        act().progressDismiss();
        BLiveVoice bLiveVoiceV2 = E2().V2();
        if (((BLiveAbsData) bLiveVoiceV2).streamUrl.useCurrentPullStream || !this.f13375j.k()) {
            m14826P3(bLiveVoiceV2);
        } else {
            gkh0.j("[live]voicePlayer", "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m14828U3() {
        this.f13375j.u(true);
    }

    /* JADX INFO: renamed from: D0 */
    public void m14829D0() {
        q880.e(this);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m14830N3(String str) {
        if (pqi.f()) {
            return;
        }
        this.f13375j.e(str);
    }

    /* JADX INFO: renamed from: O0 */
    public void m14832O0(BLiveCallVolume bLiveCallVolume) {
        F2().PlayerEvent.callVolumeChanged().j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m14833R3(iqv iqvVar) {
        int iA = iqvVar.a();
        if (iA == 2) {
            m14827T3();
        } else {
            if (iA != 4) {
                return;
            }
            gkh0.j("[live]voicePlayer", "stop player when live end");
            m14828U3();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m14834S3(Long l2) {
        gkh0.j("[live]voicePlayer", "audience retryConnect");
        duringCreated(hrv.L(E2().k())).subscribe(ffw.d(new e30() { // from class: l.f8o0
            public final void call(Object obj) {
                this.f12866a.m14826P3((BLiveVoice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m14835T() {
        super/*l.k4t*/.T();
        m14830N3("voice");
        duringCreated(E2().l()).subscribe(ffw.d(new e30() { // from class: l.d8o0
            public final void call(Object obj) {
                this.f11671a.m14833R3((iqv) obj);
            }
        }));
        ((kql) F3(new s0f(1800))).b(this.f13376k);
    }

    /* JADX INFO: renamed from: l0 */
    public void m14837l0(int i) {
        if (E2().r()) {
            m14825O3();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m14838m1() {
        mkd0.z(this.f13374i);
        this.f13375j.f();
    }

    /* JADX INFO: renamed from: n */
    public void m14839n() {
        gkh0.j("[live]voicePlayer", "stop player when detach");
        this.f13375j.v();
        this.f13375j.x();
        super/*l.h4t*/.n();
    }

    /* JADX INFO: renamed from: q0 */
    public void m14841q0() {
        lsi0.A(ypv.f23200e.getString(R.string.K9), true);
    }

    /* JADX INFO: renamed from: O */
    public void m14831O() {
    }

    /* JADX INFO: renamed from: f2 */
    public void m14836f2() {
    }

    /* JADX INFO: renamed from: p1 */
    public void m14840p1(int i) {
    }

    /* JADX INFO: renamed from: s1 */
    public void m14842s1(ArrayList<String> arrayList) {
    }

    /* JADX INFO: renamed from: u1 */
    public void m14843u1() {
    }
}
