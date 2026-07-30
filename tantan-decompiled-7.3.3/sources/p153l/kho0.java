package p153l;

import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class kho0 extends qct<jqm0> implements c6m, pwl {

    /* JADX INFO: renamed from: i */
    public kcg0 f126893i;

    /* JADX INFO: renamed from: j */
    public final uxh0 f126894j;

    /* JADX INFO: renamed from: k */
    public eas f126895k;

    /* JADX INFO: renamed from: l.kho0$a */
    public class C18166a extends eas {
        public C18166a() {
        }

        @Override // p153l.eas, p153l.w6m
        /* JADX INFO: renamed from: d0 */
        public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo96686d0(str, j, mMLivePushType);
            nsh0.m164608j("[live]voicePlayer", "stop player when rtc connect");
            kho0.this.m149813U3();
        }
    }

    public kho0(dum dumVar) {
        super(dumVar);
        this.f126895k = new C18166a();
        final uxh0 uxh0Var = new uxh0();
        this.f126894j = uxh0Var;
        C22421c<qwl> c22421cM199270g = m213811F2().PlayerEvent.updatePlayer().m199270g();
        Objects.requireNonNull(uxh0Var);
        this.f126893i = c22421cM199270g.subscribe(dhw.m115825d(new y20() { // from class: l.gho0
            @Override // p153l.y20
            public final void call(Object obj) {
                uxh0Var.m198481y((qwl) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    private void m149810O3() {
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(4400))).mo133182a();
        if (c12877bMo133182a != null || c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            nsh0.m164608j("[voice][call]", "rtc has started, needn't pull video stream");
        } else {
            m138858H3(((jqm0) m213810E2()).m168521h2(10, TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.iho0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114991a.m149816S3((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m149811P3(BLiveAbsData bLiveAbsData) {
        if (((Boolean) m138856F3(new wod0(40001))).booleanValue()) {
            nsh0.m164608j("[voice][call]", "join rtc ,can`t play cdn voice stream ");
            return;
        }
        nsh0.m164608j("[live]voicePlayer", "voice player result:" + this.f126894j.m198471o(bLiveAbsData, null, this, ((jqm0) m213810E2()).m202200x(), ((jqm0) m213810E2()).mo160117o0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    private void m149812T3() {
        act().progressDismiss();
        BLiveVoice bLiveVoiceMo183435j = ((jqm0) m213810E2()).mo183435j();
        if (bLiveVoiceMo183435j.streamUrl.useCurrentPullStream || !this.f126894j.m198467k()) {
            m149811P3(bLiveVoiceMo183435j);
        } else {
            nsh0.m164608j("[live]voicePlayer", "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m149813U3() {
        this.f126894j.m198477u(true);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: D0 */
    public void mo120245D0() {
        wg80.m206185e(this);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m149814N3(String str) {
        if (lti.m155791f()) {
            return;
        }
        this.f126894j.m198461e(str);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: O0 */
    public void mo139885O0(BLiveCallVolume bLiveCallVolume) {
        m213811F2().PlayerEvent.callVolumeChanged().mo199273j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m149815R3(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m149812T3();
        } else {
            if (iM146875a != 4) {
                return;
            }
            nsh0.m164608j("[live]voicePlayer", "stop player when live end");
            m149813U3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m149816S3(Long l2) {
        nsh0.m164608j("[live]voicePlayer", "audience retryConnect");
        duringCreated(itv.m142088L(((jqm0) m213810E2()).m202191k())).subscribe(dhw.m115825d(new y20() { // from class: l.jho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120993a.m149811P3((BLiveVoice) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m149814N3("voice");
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.hho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109913a.m149815R3((jsv) obj);
            }
        }));
        ((wsl) m138856F3(new w1f(1800))).mo161149b(this.f126895k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.pwl
    /* JADX INFO: renamed from: l0 */
    public void mo123267l0(int i) {
        if (((jqm0) m213810E2()).m202195r()) {
            m149810O3();
        }
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
        psd0.m173633z(this.f126893i);
        this.f126894j.m198462f();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        nsh0.m164608j("[live]voicePlayer", "stop player when detach");
        this.f126894j.m198478v();
        this.f126894j.m198480x();
        super.mo70300n();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: q0 */
    public void mo139901q0() {
        o1j0.m165619A(zrv.f205803e.getString(R$string.f47634K9), true);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: O */
    public void mo120246O() {
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: f2 */
    public void mo120248f2() {
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: u1 */
    public void mo120249u1() {
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: p1 */
    public void mo139899p1(int i) {
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: s1 */
    public void mo139904s1(ArrayList<String> arrayList) {
    }
}
