package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class zmo0 implements yvl {

    /* JADX INFO: renamed from: a */
    public uem0 f205087a;

    /* JADX INFO: renamed from: b */
    public C22507a<Pair<Boolean, Boolean>> f205088b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public c0m f205089c;

    /* JADX INFO: renamed from: d */
    public rwn0 f205090d;

    /* JADX INFO: renamed from: e */
    public boolean f205091e;

    /* JADX INFO: renamed from: f */
    public kwr f205092f;

    /* JADX INFO: renamed from: g */
    public pa1 f205093g;

    public zmo0(uem0 uem0Var, rwn0 rwn0Var) {
        this.f205087a = uem0Var;
        this.f205090d = rwn0Var;
    }

    /* JADX INFO: renamed from: D */
    private uam m220397D() {
        return this.f205087a.m195786g();
    }

    /* JADX INFO: renamed from: e0 */
    private void m220403e0() {
        m220467t0(true);
        uam uamVarM220397D = m220397D();
        if (NullChecker.m82486a(uamVarM220397D)) {
            uamVarM220397D.mo76791d(this.f205090d, zrv.f205803e.getString(R$string.f48376sj));
            uamVarM220397D.mo76788a();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m220405f0() {
        rwn0 rwn0Var = this.f205090d;
        rwn0Var.mo146096e2(rwn0Var.mo118373p(), this.f205090d.mo183435j());
        if (!this.f205089c.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || !this.f205089c.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            m220416p0();
        }
        uam uamVarM220397D = m220397D();
        if (NullChecker.m82486a(uamVarM220397D)) {
            uamVarM220397D.mo76791d(this.f205090d, zrv.f205803e.getString(R$string.f47686Mi));
            uamVarM220397D.mo76790c();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C22421c m220409j(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: p0 */
    private void m220416p0() {
        fhw.m125605a("[live][voiceWindow]", "requestRtcTokenEnterRoom:");
        mo217199L1(wgt.m206249p(iit.INSTANCE.m140133S(), null, new Object[0])).flatMap(new qcj() { // from class: l.mmo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f137624a.m220453b0((vxj0) obj);
            }
        }).subscribe(dhw.m115826e(new nmo0(this), new kmo0(this)));
    }

    /* JADX INFO: renamed from: r0 */
    private void m220419r0() {
        boolean z = !this.f205091e || (this.f205090d.m183423Y2() != null && (this.f205090d.m183423Y2().mutedByAnchor || this.f205090d.m183423Y2().mutedByUser));
        fhw.m125605a("[live][voiceWindow]", "set local Mute:" + z);
        c0m c0mVar = this.f205089c;
        if (z) {
            c0mVar.mo107434e().mo170530i0(true);
        } else {
            c0mVar.mo107434e().mo170536n(false);
            this.f205089c.mo107434e().mo170530i0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m220425x0(BLiveRtcToken bLiveRtcToken) {
        if (bLiveRtcToken != null) {
            nsh0.m164608j("[live][voiceWindow]", "updateRtcToken :" + bLiveRtcToken.channelKey);
            this.f205089c.mo107434e().mo170538o(bLiveRtcToken.channelKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m220446U(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if ((bLiveVoiceKtvGameInfo == null || (bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo) == null) ? false : TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0())) {
            this.f205093g.m171401d();
            return;
        }
        final BLiveAvatarFrameConfig bLiveAvatarFrameConfig = l6o0.m153068c(this.f205090d.m183411P2().m136874m(zrv.f205799a.m207631D0())).f130275b.avatarConfig.frameConfig;
        if (!bLiveAvatarFrameConfig.checkNeedChangeVoice()) {
            this.f205093g.m171402e();
        } else {
            final int fixedRemainingSec = (int) bLiveAvatarFrameConfig.getFixedRemainingSec();
            l51.m152888H(Act.foreground_().f16062a.get(), new Runnable() { // from class: l.lmo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132704a.m220442Q(fixedRemainingSec, bLiveAvatarFrameConfig);
                }
            }, 150L);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m220427A() {
        this.f205087a.mo135957K0(true, true);
    }

    /* JADX INFO: renamed from: B */
    public rwn0 m220428B() {
        return this.f205090d;
    }

    /* JADX INFO: renamed from: C */
    public boolean m220429C() {
        return (guk0.m132329h(this.f205090d.m183423Y2()) || this.f205090d.mo118373p()) && this.f205090d.m202193m().m146875a() == 2;
    }

    /* JADX INFO: renamed from: E */
    public String m220430E() {
        return NullChecker.m82486a(this.f205090d) ? this.f205090d.m202191k() : "";
    }

    /* JADX INFO: renamed from: F */
    public final void m220431F(Boolean bool) {
        m220465q0(bool.booleanValue());
        fhw.m125605a("[live][voiceWindow]", "isFront:" + this.f205091e);
        if (this.f205091e) {
            C12622a.m69707b().m69710e(zrv.f205803e);
        }
        fhw.m125605a("[live][voiceWindow]", "handLiftCycle is front:" + bool);
        this.f205087a.m195787h(bool.booleanValue());
    }

    /* JADX INFO: renamed from: G */
    public final void m220432G(jsv jsvVar) {
        fhw.m125605a("[live][voiceWindow]", "handLiveState:" + jsvVar.m146875a());
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m220405f0();
        } else if (iM146875a == 4) {
            m220403e0();
        }
        nsh0.m164608j("[live][voiceWindow]", "roomState:" + jsvVar.m146875a());
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m220445T(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        fhw.m125605a("voice_effect_gift", "window photoSticker:" + voiceLivePhotoSticker.toString());
        l6o0 l6o0VarM153068c = l6o0.m153068c(this.f205090d.m183411P2().m136874m(voiceLivePhotoSticker.getUserId()));
        if (l6o0VarM153068c.f130275b == null || !voiceLivePhotoSticker.hasFrameConfig()) {
            return;
        }
        l6o0VarM153068c.f130275b.avatarConfig.frameConfig = thn0.m191288Z3(voiceLivePhotoSticker.getFrameConfig());
        if (NullChecker.m82486a(this.f205090d.m183419U2())) {
            BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = this.f205090d.m183419U2().f138502a;
            if (NullChecker.m82486a(bLiveVoiceKtvGameInfo.playInfo) && zrv.f205799a.m207631D0().equals(bLiveVoiceKtvGameInfo.playInfo.userId)) {
                this.f205093g.m171401d();
                return;
            }
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = l6o0VarM153068c.f130275b.avatarConfig.frameConfig;
        boolean zCheckNeedChangeVoice = bLiveAvatarFrameConfig.checkNeedChangeVoice();
        pa1 pa1Var = this.f205093g;
        if (!zCheckNeedChangeVoice) {
            pa1Var.m171402e();
        } else {
            pa1Var.m171406i((int) bLiveAvatarFrameConfig.getFixedRemainingSec());
            this.f205093g.m171399b(bLiveAvatarFrameConfig);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m220434I() {
        m220464o0("", new nmo0(this));
    }

    /* JADX INFO: renamed from: J */
    public void m220435J(BLiveVoiceCall bLiveVoiceCall) {
        new StringBuilder("call:").append(bLiveVoiceCall);
        nsh0.m164608j("[live][voiceWindow]", bLiveVoiceCall.toString());
        this.f205090d.m183402J2(bLiveVoiceCall);
        if (guk0.m132329h(bLiveVoiceCall)) {
            m220419r0();
            m220469v0();
        } else if (guk0.m132333l(bLiveVoiceCall)) {
            m220416p0();
        } else if (guk0.m132327f(bLiveVoiceCall)) {
            m220469v0();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m220436K() {
        m220437L();
        m220438M();
        c0m c0mVar = this.f205089c;
        if (c0mVar == null) {
            m220427A();
            return;
        }
        this.f205093g = new pa1(c0mVar);
        this.f205088b.m137019l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
        m220465q0(Act.isAppVisible());
        if (this.f205090d.m183419U2() != null) {
            this.f205090d.m183419U2().m159873X(this);
            this.f205090d.m183419U2().m159875Z();
        }
        m220472y();
    }

    /* JADX INFO: renamed from: L */
    public final void m220437L() {
        mo217199L1(this.f205090d.m168539n1()).subscribe(dhw.m115829h(new y20() { // from class: l.xmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195113a.m220443R((LiveControlMessage) obj);
            }
        }));
        mo217199L1(this.f205090d.m168545q1().m98337x0()).filter(new qcj() { // from class: l.ylo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(guk0.m132331j(((gvn0) obj).m132564e()));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.zlo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204988a.m220457h0((gvn0) obj);
            }
        }));
        mo217199L1(this.f205090d.m168545q1().m98241M0()).subscribe(dhw.m115825d(new y20() { // from class: l.amo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72241a.m220444S((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
        mo217199L1(this.f205090d.m168545q1().m98339y0()).onBackpressureBuffer(100L).filter(new ppo0()).subscribe(dhw.m115829h(new y20() { // from class: l.bmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77357a.m220445T((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj);
            }
        }));
        mo217199L1(this.f205090d.m168545q1().m98219B0()).delay(50L, TimeUnit.MILLISECONDS).compose(psd0.m173592C()).subscribe(dhw.m115829h(new y20() { // from class: l.cmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82637a.m220446U((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        mo217199L1(this.f205090d.m168545q1().m98259V0()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.dmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89717a.m220447V((LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage) obj);
            }
        }));
        mo217199L1(this.f205090d.f148282z.m170284r().m98261W0()).subscribe(dhw.m115829h(new y20() { // from class: l.emo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94676a.m220448W((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
        mo217199L1(this.f205090d.m168545q1().m98249Q0()).map(new qcj() { // from class: l.fmo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VoiceLiveInfoMessage) obj).template;
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.ymo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200690a.m220449X((String) obj);
            }
        }));
    }

    @Override // p153l.yvl
    /* JADX INFO: renamed from: L1 */
    public <T> C22421c<T> mo217199L1(final C22421c<T> c22421c) {
        return psd0.m173593D(new pcj() { // from class: l.hmo0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return zmo0.m220409j(c22421c);
            }
        }, this.f205088b, false);
    }

    /* JADX INFO: renamed from: M */
    public final void m220438M() {
        if (this.f205089c == null) {
            this.f205089c = this.f205090d.m168456H0();
        }
        c0m c0mVar = this.f205089c;
        if (c0mVar == null) {
            return;
        }
        c0mVar.mo107433d().onResume();
        this.f205089c.mo107433d().mo133184c(new imo0(this));
        mo217199L1(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.rmo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).filter(new qcj() { // from class: l.smo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169593a.m220450Y((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.tmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174951a.m220451Z((NetworkInfo) obj);
            }
        }));
        mo217199L1(this.f205090d.m202192l()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.umo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179662a.m220432G((jsv) obj);
            }
        }));
        mo217199L1(Act.front()).subscribe(dhw.m115829h(new y20() { // from class: l.vmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184747a.m220431F((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final void m220439N(BLiveAbsData bLiveAbsData) {
        if (m220440O()) {
            m220459j0(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m220440O() {
        return m220397D() != null;
    }

    /* JADX INFO: renamed from: P */
    public final void m220441P(String str) {
        BLiveAbsData bLiveAbsDataNew_ = BLiveAbsData.new_();
        bLiveAbsDataNew_.f45171id = str;
        m220439N(bLiveAbsDataNew_);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m220442Q(int i, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f205093g.m171406i(i);
        this.f205093g.m171399b(bLiveAvatarFrameConfig);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m220443R(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47799S5));
                m220427A();
                break;
            case "stop":
            case "force_stop":
                this.f205090d.mo160116h(v9s.f183031e);
                break;
            case "start":
            case "recover":
                m220441P(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                o1j0.m165651y(liveControlMessage.isAnchor ? zrv.f205803e.getString(R$string.f47820T5) : zrv.f205803e.getString(R$string.f47778R5));
                m220427A();
                break;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m220444S(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        if (TextUtils.isEmpty(voiceRoomBgPicUpdateMessage.getUrl()) || mo217200Y1().mo183440n() == null) {
            return;
        }
        mo217200Y1().mo183440n().backgroundUrl = voiceRoomBgPicUpdateMessage.getUrl();
        mo217200Y1().mo183440n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m220447V(LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage) {
        mo217200Y1().mo183435j().liveMode = voiceLiveModeMessage.getLiveMode();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m220448W(LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        mo217200Y1().mo183435j().template = voiceLiveTemplateMessage.getTemplate();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m220449X(String str) {
        mo217200Y1().mo183435j().template = str;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m220450Y(NetworkInfo networkInfo) {
        return Boolean.valueOf(NullChecker.m82486a(this.f205090d) && NullChecker.m82486a(this.f205090d.mo183435j()));
    }

    @Override // p153l.yvl
    /* JADX INFO: renamed from: Y1 */
    public rwn0 mo217200Y1() {
        return this.f205090d;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m220451Z(NetworkInfo networkInfo) {
        m220456g0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m220452a0(BLiveVoiceCall bLiveVoiceCall) {
        this.f205090d.m183402J2(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ C22421c m220453b0(vxj0 vxj0Var) {
        return mo217199L1(VCallApiProvider.requestSdkToken(this.f205090d.m202194o(), ""));
    }

    /* JADX INFO: renamed from: c0 */
    public void m220454c0(Integer num, Object obj) {
        if (this.f205090d == null) {
            return;
        }
        nsh0.m164608j("[live][voiceWindow]", "onEngineCallback " + at2.m100018b(num.intValue()));
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            m220464o0(String.valueOf(obj), new y20() { // from class: l.omo0
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f147981a.m220425x0((BLiveRtcToken) obj2);
                }
            });
        } else if (iIntValue == 3) {
            m220461l0();
        } else {
            if (iIntValue != 4) {
                return;
            }
            m220434I();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m220455d0(Throwable th) {
        nsh0.m164608j("[live][voiceWindow]", "onErrorHandle :" + (th == null ? "" : th.getMessage()));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m220456g0() {
        m220459j0(this.f205090d.mo183435j());
    }

    /* JADX INFO: renamed from: h0 */
    public void m220457h0(gvn0 gvn0Var) {
        int iM132569j = gvn0Var.m132569j();
        if (iM132569j != 1) {
            switch (iM132569j) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                case 9:
                    if (!this.f205090d.mo118373p() && zrv.f205799a.m207631D0().equals(gvn0Var.m132566g().f143542a.f107997a)) {
                        if (gvn0Var.m132571l()) {
                            o1j0.m165649w(R$string.f48308ph);
                        } else if (!mo217200Y1().m183434i3()) {
                            o1j0.m165649w(R$string.f48286oh);
                        } else {
                            o1j0.m165649w(R$string.f48131hf);
                        }
                    }
                    break;
                default:
                    return;
            }
        }
        m220435J(gvn0Var.m132564e());
    }

    /* JADX INFO: renamed from: i0 */
    public void m220458i0() {
        m220465q0(true);
        C12622a.m69707b().m69710e(zrv.f205803e);
        m220419r0();
        mo217199L1(mo217200Y1().f165186I).distinctUntilChanged().skip(1).subscribe(dhw.m115829h(new y20() { // from class: l.wmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189817a.m220468u0((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m220459j0(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        mo217199L1(itv.m142119v(bLiveAbsData)).subscribe(dhw.m115826e(new y20() { // from class: l.jmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121692a.m220471x((ugd0) obj);
            }
        }, new kmo0(this)));
        m220473y0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m220460k0(boolean z, boolean z2) {
        nsh0.m164608j("[live][voiceWindow]", "VoiceRoomManager:" + z + z2);
        this.f205088b.onCompleted();
        if (mo217200Y1().m183419U2() != null) {
            mo217200Y1().m183419U2().m159880r(z2);
        }
        m220467t0(z2);
        m220462m0();
        lwr.m156093a();
        this.f205092f = null;
        rwn0 rwn0Var = this.f205090d;
        if (rwn0Var != null) {
            if (z) {
                rwn0Var.m168518g2(rwn0Var.mo183435j());
                f5y.m124261b(App.f16088e);
            }
            if (z2) {
                VoiceRoomApiProvider.getOutRoom(this.f205090d.m202194o(), zrv.f205799a.m207631D0(), mo217200Y1().m202200x());
            }
        }
        this.f205090d = null;
        this.f205089c = null;
        this.f205093g.m171401d();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m220461l0() {
        rwn0 rwn0Var = this.f205090d;
        if (rwn0Var == null || rwn0Var.m183423Y2() == null || TextUtils.isEmpty(this.f205090d.m183423Y2().f45333id)) {
            return;
        }
        nsh0.m164608j("[live][voiceWindow]", "reportCallStatus");
        mo217199L1(VCallApiProvider.reportConnect(this.f205090d.m183423Y2().f45333id, true)).subscribe(dhw.m115829h(new y20() { // from class: l.qmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158388a.m220435J((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m220462m0() {
        if (this.f205090d.m183423Y2() == null || TextUtils.isEmpty(this.f205090d.m183423Y2().f45333id)) {
            return;
        }
        mo217199L1(VCallApiProvider.deputyGoAway(this.f205090d.m183423Y2().f45333id)).subscribe(dhw.m115829h(new y20() { // from class: l.xlo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195008a.m220452a0((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m220463n0() {
        if (this.f205090d == null) {
            return;
        }
        m220472y();
        lwr.m156095c(guk0.m132329h(this.f205090d.m183423Y2()), this.f205092f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m220464o0(String str, y20<BLiveRtcToken> y20Var) {
        if (TextUtils.isEmpty(this.f205090d.m202194o())) {
            return;
        }
        mo217199L1(VCallApiProvider.requestSdkToken(this.f205090d.m202194o(), str)).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m220465q0(boolean z) {
        this.f205091e = z;
        fhw.m125605a("[live][voiceWindow]", "setFront:" + z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m220466s0(BLiveRtcToken bLiveRtcToken) {
        fhw.m125605a("[live][voiceWindow]", "startCallEngineMotion");
        C12877b c12877bMo133182a = this.f205089c.mo107433d().mo133182a();
        if (c12877bMo133182a != null) {
            fhw.m125605a("[live][voiceWindow]", "motion" + c12877bMo133182a.m73080Z0().toString());
        }
        if (c12877bMo133182a == null || !(c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR))) {
            fhw.m125605a("[live][voiceWindow]", " start startCallEngineMotion");
            this.f205089c.mo107433d().mo133185d(new at2(this.f205090d.mo183435j().streamUrl.push, this.f205090d.m202194o(), String.valueOf(this.f205090d.mo183435j().streamCdnInfo.provider), String.valueOf(this.f205090d.mo183435j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, guk0.m132329h(this.f205090d.m183423Y2()), new imo0(this)));
        } else {
            if (guk0.m132333l(this.f205090d.m183423Y2())) {
                m220461l0();
            }
            fhw.m125605a("[live][voiceWindow]", "startCallEngineMotion  return");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m220467t0(boolean z) {
        if (this.f205089c == null) {
            return;
        }
        nsh0.m164608j("[live][voiceWindow]", "stop push needStopRtc:" + z);
        if (z) {
            if (this.f205089c.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || this.f205089c.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                if (this.f205089c.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                    this.f205089c.mo107430a().stopSurroundMusic();
                }
                this.f205089c.mo107433d().mo133183b();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m220468u0(BLiveVoiceCall bLiveVoiceCall) {
        m220472y();
        lwr.m156099g(guk0.m132329h(bLiveVoiceCall), this.f205092f);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m220469v0() {
        C12877b c12877bMo133182a = this.f205089c.mo107433d().mo133182a();
        if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            return;
        }
        ((frm0) c12877bMo133182a.m73074T0(frm0.class)).m221308z1(guk0.m132329h(this.f205090d.m183423Y2()));
        nsh0.m164608j("[live][voiceWindow]", "updateClientRole:" + guk0.m132329h(this.f205090d.m183423Y2()));
    }

    /* JADX INFO: renamed from: w0 */
    public final void m220470w0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall != null) {
            m220435J(bLiveVoiceCall);
        } else {
            if (this.f205090d.m183423Y2() == null || !guk0.m132327f(this.f205090d.m183423Y2())) {
                return;
            }
            BLiveVoiceCall bLiveVoiceCallClone = this.f205090d.m183423Y2().mo225055clone();
            bLiveVoiceCallClone.state = "hung-up";
            m220435J(bLiveVoiceCallClone);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m220471x(ugd0 ugd0Var) {
        this.f205090d.mo168476S(ugd0Var);
        this.f205090d.m168485V(ugd0Var.f138293c);
        nsh0.m164608j("[live][voiceWindow]", "refreshWindow:" + ugd0Var.f138293c.streamUrl.pullFlv);
    }

    /* JADX INFO: renamed from: y */
    public final void m220472y() {
        if (this.f205092f == null) {
            this.f205092f = new kwr(new x20() { // from class: l.gmo0
                @Override // p153l.x20
                public final void call() {
                    this.f105020a.m220427A();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m220473y0() {
        rwn0 rwn0Var = this.f205090d;
        if (rwn0Var == null) {
            return;
        }
        mo217199L1(VCallApiProvider.getSelfCallInfo(rwn0Var.m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.pmo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153209a.m220470w0((BLiveVoiceCall) obj);
            }
        }));
    }
}
