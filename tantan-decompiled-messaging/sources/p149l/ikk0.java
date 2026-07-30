package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes5.dex */
public class ikk0 extends tkk0 {

    /* JADX INFO: renamed from: o */
    public String f113682o;

    /* JADX INFO: renamed from: p */
    public String f113683p;

    public ikk0(bsm bsmVar) {
        super(bsmVar);
        this.f113683p = "";
        this.f170894k = (nsm0) m144512z2(new gnm0(bsmVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m136802E4(Throwable th) {
        mo136828k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public void m136803K4(iqv iqvVar) {
        if (iqvVar.m137796c() || iqvVar.m137795b()) {
            xpm0 xpm0Var = new xpm0();
            xpm0Var.f193941e = ((nnn0) m206027E2()).m160261Y2();
            m189512b4(xpm0Var, jkk0.f118391a);
        }
        if (!((nnn0) m206027E2()).m160275m3() && iqvVar.m137796c()) {
            mo136828k4();
        } else if (iqvVar.m137795b() && ((nnn0) m206027E2()).m160275m3()) {
            mo136828k4();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m136811A4(BLiveVoiceCall bLiveVoiceCall) {
        if (alk0.m97313l(bLiveVoiceCall)) {
            if (TextUtils.isEmpty(this.f113682o)) {
                m189511a4(bLiveVoiceCall);
            } else {
                this.f170892i.m219190S3(this.f113682o);
            }
        }
        m136821M4();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m136812B4(BLiveVoiceCall bLiveVoiceCall) {
        if (alk0.m97313l(bLiveVoiceCall) || alk0.m97307f(bLiveVoiceCall)) {
            mo136828k4();
            m136820L4();
        }
        m136821M4();
    }

    /* JADX INFO: renamed from: C4 */
    public final boolean m136813C4() {
        return !TextUtils.isEmpty(this.f113682o);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m136814D4() {
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(4400))).mo133471a();
        if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            m136820L4();
        } else {
            gkh0.m126627j("[voice][call]", "rtc has started, skip this step");
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m136815F4() {
        m189517h4("", new ckk0(this));
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m136816G4(BLiveRtcToken bLiveRtcToken) {
        h5j0.INSTANCE.m129402a("voice_audience_res_loading", "voice audience res check");
        ((oxl) m129297F3(new rv00(9000))).mo133474d(m136831y4(bLiveRtcToken));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m136817H4(BLiveVoiceCall bLiveVoiceCall) {
        hfw.m130790a("[live]voiceEntry", "getRoomCallObs --- joinRtc ");
        m136814D4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ Boolean m136818I4(tgd0 tgd0Var) {
        return Boolean.valueOf(m136813C4());
    }

    /* JADX INFO: renamed from: J4 */
    public final void m136819J4(iqv iqvVar) {
        if (iqvVar.m137797d()) {
            m136814D4();
        }
        m189516g4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public final void m136820L4() {
        BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) m206027E2()).m160261Y2();
        if (alk0.m97306e(bLiveVoiceCallM160261Y2)) {
            PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79892j(false).m79897o(new d30() { // from class: l.bkk0
                @Override // p149l.d30
                public final void call() {
                    this.f76050a.m136815F4();
                }
            }).m79898p(new C17569a(bLiveVoiceCallM160261Y2)).m79891i(this.f188513f);
        } else {
            m189517h4("", new ckk0(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public void m136821M4() {
        C12714b c12714bMo133471a;
        oxl oxlVar = (oxl) m129297F3(new rv00(9000));
        if (oxlVar == null || (c12714bMo133471a = oxlVar.mo133471a()) == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            return;
        }
        ((bim0) c12714bMo133471a.m71891T0(bim0.class)).m142991z1(alk0.m97309h(((nnn0) m206027E2()).m160261Y2()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0
    /* JADX INFO: renamed from: S3 */
    public String mo136822S3() {
        return vdt.m198092b(3) ? super.mo136822S3() : m136830x4(m136832z4().m121378Y3(), ((nnn0) m206027E2()).m149818o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if ((m206027E2() instanceof fhm0) && ((fhm0) m206027E2()).m121382c4()) {
            hfw.m130790a("[live]voiceEntry", "rtc进房优化，符合条件，开始请求token ");
            duringCreated(((fhm0) m206027E2()).m121376W3()).subscribe(ffw.m121197h(new e30() { // from class: l.akk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70283a.m136802E4((Throwable) obj);
                }
            }));
            m136814D4();
        }
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: T3 */
    public void mo136823T3(BLiveVoiceCall bLiveVoiceCall) {
        if (TextUtils.isEmpty(this.f113683p) || this.f113683p.contains("tencent")) {
            m136812B4(bLiveVoiceCall);
        } else {
            m136811A4(bLiveVoiceCall);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0
    /* JADX INFO: renamed from: V3 */
    public void mo136824V3() {
        gkh0.m126627j("[voice][call]", "handlePushError");
        u4n0.m191747f(this, ((nnn0) m206027E2()).m160261Y2());
        this.f113682o = "";
        m136820L4();
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: W3 */
    public void mo136825W3(String str) {
        super.mo136825W3(str);
        this.f113682o = ypv.f199493a.m199309D0().equals(str) ? ypv.f199493a.m199309D0() : "";
        m136821M4();
        h5j0.INSTANCE.m129402a("voice_enter_room_rtc", "onLocalJoinChannel");
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: c4 */
    public void mo136826c4(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall == null) {
            gkh0.m126627j("[voice][call]", "join voice init rtc failed");
            return;
        }
        BLiveVoiceCall bLiveVoiceCallMo223809clone = bLiveVoiceCall.mo223809clone();
        bLiveVoiceCallMo223809clone.state = "hung-up";
        m189520m4(bLiveVoiceCallMo223809clone);
        lsi0.m151595y(this.f188513f.getString(R$string.f46712H1, ""));
        gkh0.m126627j("[voice][call]", "upper mic  rtc failed");
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: j4 */
    public void mo136827j4(final BLiveRtcToken bLiveRtcToken) {
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129404c("voice_enter_room_rtc", "got rtc token");
        this.f113683p = bLiveRtcToken.rtcProvider;
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(9000))).mo133471a();
        if (c12714bMo133471a != null && c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            this.f170892i.m219190S3(ypv.f199493a.m199309D0());
        } else {
            h5j0Var.m129405d("voice_audience_res_loading");
            vet.m198233q(this.f188513f, hgt.INSTANCE.m130912S(), R$string.f47265gj, new d30() { // from class: l.hkk0
                @Override // p149l.d30
                public final void call() {
                    this.f108242a.m136816G4(bLiveRtcToken);
                }
            });
        }
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: k4 */
    public boolean mo136828k4() {
        oxl oxlVar = (oxl) m129297F3(new rv00(9000));
        if (oxlVar == null) {
            return false;
        }
        gkh0.m126627j("[voice][call]", "voice deputy stop motion push");
        oxlVar.mo133472b();
        this.f113682o = "";
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        if (((nnn0) m206027E2()).m160273k3()) {
            return;
        }
        mo136828k4();
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: o4 */
    public void mo136829o4(BLiveVoiceCall bLiveVoiceCall) {
        m136821M4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.dkk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86665a.m136803K4((iqv) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).mo149823u()).subscribe(ffw.m121193d(new e30() { // from class: l.ekk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91992a.m136819J4((iqv) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.fkk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98080a.m136817H4((BLiveVoiceCall) obj);
            }
        }));
        if (!m136813C4()) {
            hfw.m130790a("[live]voiceEntry", "validState --- joinRtc ");
            m136814D4();
        }
        m129301d3(tgd0.class, new w9j() { // from class: l.gkk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103204a.m136818I4((tgd0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final String m136830x4(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(str2) ? str2 : "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final MotionParams m136831y4(BLiveRtcToken bLiveRtcToken) {
        return m136832z4().m121382c4() ? new cim0(m136832z4().m121377X3(), m136832z4().m121378Y3(), m136832z4().m121375V3(), m136832z4().m121374U3(), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, alk0.m97309h(((nnn0) m206027E2()).m160261Y2()), m189507R3()) : new cim0(((nnn0) m206027E2()).mo149813j().streamUrl.push, ((nnn0) m206027E2()).m149818o(), String.valueOf(((nnn0) m206027E2()).mo149813j().streamCdnInfo.provider), String.valueOf(((nnn0) m206027E2()).mo149813j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, alk0.m97309h(((nnn0) m206027E2()).m160261Y2()), m189507R3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final fhm0 m136832z4() {
        return (fhm0) m206027E2();
    }

    /* JADX INFO: renamed from: l.ikk0$a */
    public class C17569a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveVoiceCall f113684a;

        public C17569a(BLiveVoiceCall bLiveVoiceCall) {
            this.f113684a = bLiveVoiceCall;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            ikk0.this.m189512b4(new xpm0().m210508b(this.f113684a), "");
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
        }
    }
}
