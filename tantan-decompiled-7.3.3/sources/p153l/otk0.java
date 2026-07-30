package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes5.dex */
public class otk0 extends ztk0 {

    /* JADX INFO: renamed from: o */
    public String f148970o;

    /* JADX INFO: renamed from: p */
    public String f148971p;

    public otk0(dum dumVar) {
        super(dumVar);
        this.f148971p = "";
        this.f206018k = (r1n0) m153103z2(new kwm0(dumVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m169095E4(Throwable th) {
        mo169121k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public void m169096K4(jsv jsvVar) {
        if (jsvVar.m146877c() || jsvVar.m146876b()) {
            bzm0 bzm0Var = new bzm0();
            bzm0Var.f79151e = ((rwn0) m213810E2()).m183423Y2();
            m221553b4(bzm0Var, ptk0.f154091a);
        }
        if (!((rwn0) m213810E2()).m183439m3() && jsvVar.m146877c()) {
            mo169121k4();
        } else if (jsvVar.m146876b() && ((rwn0) m213810E2()).m183439m3()) {
            mo169121k4();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m169104A4(BLiveVoiceCall bLiveVoiceCall) {
        if (guk0.m132333l(bLiveVoiceCall)) {
            if (TextUtils.isEmpty(this.f148970o)) {
                m221552a4(bLiveVoiceCall);
            } else {
                this.f206016i.m127516S3(this.f148970o);
            }
        }
        m169114M4();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m169105B4(BLiveVoiceCall bLiveVoiceCall) {
        if (guk0.m132333l(bLiveVoiceCall) || guk0.m132327f(bLiveVoiceCall)) {
            mo169121k4();
            m169113L4();
        }
        m169114M4();
    }

    /* JADX INFO: renamed from: C4 */
    public final boolean m169106C4() {
        return !TextUtils.isEmpty(this.f148970o);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m169107D4() {
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(4400))).mo133182a();
        if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            m169113L4();
        } else {
            nsh0.m164608j("[voice][call]", "rtc has started, skip this step");
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m169108F4() {
        m221558h4("", new itk0(this));
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m169109G4(BLiveRtcToken bLiveRtcToken) {
        lej0.INSTANCE.m153907a("voice_audience_res_loading", "voice audience res check");
        ((h0m) m138856F3(new z310(9000))).mo133185d(m169124y4(bLiveRtcToken));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m169110H4(BLiveVoiceCall bLiveVoiceCall) {
        fhw.m125605a("[live]voiceEntry", "getRoomCallObs --- joinRtc ");
        m169107D4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ Boolean m169111I4(wod0 wod0Var) {
        return Boolean.valueOf(m169106C4());
    }

    /* JADX INFO: renamed from: J4 */
    public final void m169112J4(jsv jsvVar) {
        if (jsvVar.m146878d()) {
            m169107D4();
        }
        m221557g4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public final void m169113L4() {
        BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) m213810E2()).m183423Y2();
        if (guk0.m132326e(bLiveVoiceCallM183423Y2)) {
            PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81075j(false).m81080o(new x20() { // from class: l.htk0
                @Override // p153l.x20
                public final void call() {
                    this.f111563a.m169108F4();
                }
            }).m81081p(new C19210a(bLiveVoiceCallM183423Y2)).m81074i(this.f196919f);
        } else {
            m221558h4("", new itk0(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public void m169114M4() {
        C12877b c12877bMo133182a;
        h0m h0mVar = (h0m) m138856F3(new z310(9000));
        if (h0mVar == null || (c12877bMo133182a = h0mVar.mo133182a()) == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            return;
        }
        ((frm0) c12877bMo133182a.m73074T0(frm0.class)).m221308z1(guk0.m132329h(((rwn0) m213810E2()).m183423Y2()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0
    /* JADX INFO: renamed from: S3 */
    public String mo169115S3() {
        return wft.m206159b(3) ? super.mo169115S3() : m169123x4(m169125z4().m146604Y3(), ((rwn0) m213810E2()).m202194o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if ((m213810E2() instanceof jqm0) && ((jqm0) m213810E2()).m146611c4()) {
            fhw.m125605a("[live]voiceEntry", "rtc进房优化，符合条件，开始请求token ");
            duringCreated(((jqm0) m213810E2()).m146602W3()).subscribe(dhw.m115829h(new y20() { // from class: l.gtk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106428a.m169095E4((Throwable) obj);
                }
            }));
            m169107D4();
        }
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: T3 */
    public void mo169116T3(BLiveVoiceCall bLiveVoiceCall) {
        if (TextUtils.isEmpty(this.f148971p) || this.f148971p.contains("tencent")) {
            m169105B4(bLiveVoiceCall);
        } else {
            m169104A4(bLiveVoiceCall);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0
    /* JADX INFO: renamed from: V3 */
    public void mo169117V3() {
        nsh0.m164608j("[voice][call]", "handlePushError");
        ydn0.m215253f(this, ((rwn0) m213810E2()).m183423Y2());
        this.f148970o = "";
        m169113L4();
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: W3 */
    public void mo169118W3(String str) {
        super.mo169118W3(str);
        this.f148970o = zrv.f205799a.m207631D0().equals(str) ? zrv.f205799a.m207631D0() : "";
        m169114M4();
        lej0.INSTANCE.m153907a("voice_enter_room_rtc", "onLocalJoinChannel");
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: c4 */
    public void mo169119c4(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall == null) {
            nsh0.m164608j("[voice][call]", "join voice init rtc failed");
            return;
        }
        BLiveVoiceCall bLiveVoiceCallMo225055clone = bLiveVoiceCall.mo225055clone();
        bLiveVoiceCallMo225055clone.state = "hung-up";
        m221561m4(bLiveVoiceCallMo225055clone);
        o1j0.m165651y(this.f196919f.getString(R$string.f47560H1, ""));
        nsh0.m164608j("[voice][call]", "upper mic  rtc failed");
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: j4 */
    public void mo169120j4(final BLiveRtcToken bLiveRtcToken) {
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153909c("voice_enter_room_rtc", "got rtc token");
        this.f148971p = bLiveRtcToken.rtcProvider;
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(9000))).mo133182a();
        if (c12877bMo133182a != null && c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            this.f206016i.m127516S3(zrv.f205799a.m207631D0());
        } else {
            lej0Var.m153910d("voice_audience_res_loading");
            wgt.m206250q(this.f196919f, iit.INSTANCE.m140133S(), R$string.f48113gj, new x20() { // from class: l.ntk0
                @Override // p153l.x20
                public final void call() {
                    this.f143609a.m169109G4(bLiveRtcToken);
                }
            });
        }
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: k4 */
    public boolean mo169121k4() {
        h0m h0mVar = (h0m) m138856F3(new z310(9000));
        if (h0mVar == null) {
            return false;
        }
        nsh0.m164608j("[voice][call]", "voice deputy stop motion push");
        h0mVar.mo133183b();
        this.f148970o = "";
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        if (((rwn0) m213810E2()).m183437k3()) {
            return;
        }
        mo169121k4();
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: o4 */
    public void mo169122o4(BLiveVoiceCall bLiveVoiceCall) {
        m169114M4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.jtk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122600a.m169096K4((jsv) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).mo183449u()).subscribe(dhw.m115825d(new y20() { // from class: l.ktk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128714a.m169112J4((jsv) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.ltk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133552a.m169110H4((BLiveVoiceCall) obj);
            }
        }));
        if (!m169106C4()) {
            fhw.m125605a("[live]voiceEntry", "validState --- joinRtc ");
            m169107D4();
        }
        m138860d3(wod0.class, new qcj() { // from class: l.mtk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f138637a.m169111I4((wod0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final String m169123x4(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(str2) ? str2 : "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final MotionParams m169124y4(BLiveRtcToken bLiveRtcToken) {
        return m169125z4().m146611c4() ? new grm0(m169125z4().m146603X3(), m169125z4().m146604Y3(), m169125z4().m146601V3(), m169125z4().m146600U3(), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, guk0.m132329h(((rwn0) m213810E2()).m183423Y2()), m221548R3()) : new grm0(((rwn0) m213810E2()).mo183435j().streamUrl.push, ((rwn0) m213810E2()).m202194o(), String.valueOf(((rwn0) m213810E2()).mo183435j().streamCdnInfo.provider), String.valueOf(((rwn0) m213810E2()).mo183435j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, guk0.m132329h(((rwn0) m213810E2()).m183423Y2()), m221548R3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final jqm0 m169125z4() {
        return (jqm0) m213810E2();
    }

    /* JADX INFO: renamed from: l.otk0$a */
    public class C19210a implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveVoiceCall f148972a;

        public C19210a(BLiveVoiceCall bLiveVoiceCall) {
            this.f148972a = bLiveVoiceCall;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            otk0.this.m221553b4(new bzm0().m107181b(this.f148972a), "");
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
        }
    }
}
