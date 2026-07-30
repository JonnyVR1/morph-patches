package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class vpo0 {

    /* JADX INFO: renamed from: a */
    public final ngj0 f185273a;

    /* JADX INFO: renamed from: b */
    public final z20<Boolean, Boolean> f185274b;

    /* JADX INFO: renamed from: c */
    public C22507a<Pair<Boolean, Boolean>> f185275c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public c0m f185276d;

    /* JADX INFO: renamed from: e */
    public rwn0 f185277e;

    /* JADX INFO: renamed from: f */
    public y20<Boolean> f185278f;

    /* JADX INFO: renamed from: g */
    public boolean f185279g;

    /* JADX INFO: renamed from: h */
    public pa1 f185280h;

    public vpo0(rwn0 rwn0Var, ngj0 ngj0Var, z20<Boolean, Boolean> z20Var, y20<Boolean> y20Var) {
        this.f185277e = rwn0Var;
        this.f185273a = ngj0Var;
        this.f185274b = z20Var;
        this.f185278f = y20Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C22421c m202274f(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: A */
    public final void m202286A(Boolean bool) {
        m202315d0(bool.booleanValue());
        fhw.m125605a("[live][voiceWindow]", "isFront:" + this.f185279g);
        if (this.f185279g) {
            C12622a.m69707b().m69710e(zrv.f205803e);
        }
        fhw.m125605a("[live][voiceWindow]", "handLiftCycle is front:" + bool);
        this.f185278f.call(bool);
        m202316e0();
    }

    /* JADX INFO: renamed from: B */
    public final void m202287B(jsv jsvVar) {
        fhw.m125605a("[live][voiceWindow]", "handLiveState:" + jsvVar.m146875a());
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m202306U();
        } else if (iM146875a == 4) {
            m202305T();
        }
        nsh0.m164608j("[live][voiceWindow]", "roomState:" + jsvVar.m146875a());
    }

    /* JADX INFO: renamed from: C */
    public void m202288C() {
        m202313b0("", new ipo0(this));
    }

    /* JADX INFO: renamed from: D */
    public void m202289D(BLiveVoiceCall bLiveVoiceCall) {
        new StringBuilder("call:").append(bLiveVoiceCall);
        nsh0.m164608j("[live][voiceWindow]", bLiveVoiceCall.toString());
        this.f185277e.m183402J2(bLiveVoiceCall);
        if (guk0.m132329h(bLiveVoiceCall)) {
            m202316e0();
            m202319h0();
        } else if (guk0.m132333l(bLiveVoiceCall)) {
            m202314c0();
        } else if (guk0.m132327f(bLiveVoiceCall)) {
            m202319h0();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m202290E() {
        m202292G();
        m202291F();
        if (this.f185276d != null) {
            this.f185275c.m137019l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
            m202315d0(Act.isAppVisible());
        } else {
            z20<Boolean, Boolean> z20Var = this.f185274b;
            Boolean bool = Boolean.TRUE;
            z20Var.call(bool, bool);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m202291F() {
        m202325t(this.f185277e.m168539n1()).subscribe(dhw.m115829h(new y20() { // from class: l.zoo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205365a.m202296K((LiveControlMessage) obj);
            }
        }));
        m202325t(this.f185277e.m168545q1().m98337x0()).filter(new qcj() { // from class: l.kpo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(guk0.m132331j(((gvn0) obj).m132564e()));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.npo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143112a.m202307V((gvn0) obj);
            }
        }));
        m202325t(this.f185277e.m168545q1().m98241M0()).subscribe(dhw.m115825d(new y20() { // from class: l.opo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148475a.m202297L((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
        m202325t(this.f185277e.m168545q1().m98339y0()).onBackpressureBuffer(100L).filter(new ppo0()).map(new qcj() { // from class: l.qpo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jhn0.m144923T3(((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj).getFrameConfig());
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.rpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164386a.m202298M((BLiveAvatarFrameConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public final void m202292G() {
        if (this.f185276d == null) {
            this.f185276d = this.f185277e.m168456H0();
        }
        c0m c0mVar = this.f185276d;
        if (c0mVar == null) {
            return;
        }
        if (this.f185280h == null) {
            this.f185280h = new pa1(c0mVar);
        }
        this.f185276d.mo107433d().onResume();
        this.f185276d.mo107433d().mo133184c(new spo0(this));
        m202325t(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.tpo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).filter(new qcj() { // from class: l.upo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180302a.m202299N((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.apo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72742a.m202300O((NetworkInfo) obj);
            }
        }));
        m202325t(this.f185277e.m202192l()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.bpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77795a.m202287B((jsv) obj);
            }
        }));
        m202325t(Act.front()).subscribe(dhw.m115829h(new y20() { // from class: l.cpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83014a.m202286A((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public final void m202293H(BLiveAbsData bLiveAbsData) {
        if (m202294I()) {
            m202309X(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m202294I() {
        return this.f185273a.f141828a != null;
    }

    /* JADX INFO: renamed from: J */
    public final void m202295J(String str) {
        BLiveAbsData bLiveAbsDataNew_ = BLiveAbsData.new_();
        bLiveAbsDataNew_.f45171id = str;
        m202293H(bLiveAbsDataNew_);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m202296K(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47799S5));
                z20<Boolean, Boolean> z20Var = this.f185274b;
                Boolean bool = Boolean.TRUE;
                z20Var.call(bool, bool);
                break;
            case "stop":
            case "force_stop":
                this.f185277e.mo160116h(v9s.f183031e);
                break;
            case "start":
            case "recover":
                m202295J(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                o1j0.m165651y(liveControlMessage.isAnchor ? zrv.f205803e.getString(R$string.f47820T5) : zrv.f205803e.getString(R$string.f47778R5));
                z20<Boolean, Boolean> z20Var2 = this.f185274b;
                Boolean bool2 = Boolean.TRUE;
                z20Var2.call(bool2, bool2);
                break;
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m202297L(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        if (m202324s().mo183440n() == null) {
            return;
        }
        wlo0.m207067a(m202324s().mo183440n(), voiceRoomBgPicUpdateMessage);
        if (TextUtils.isEmpty(voiceRoomBgPicUpdateMessage.getUrl())) {
            return;
        }
        m202324s().mo183440n().backgroundUrl = voiceRoomBgPicUpdateMessage.getUrl();
        m202324s().mo183440n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m202298M(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        int i;
        if (bLiveAvatarFrameConfig.changeVoiceNo != 0 && (i = bLiveAvatarFrameConfig.remainingSec) > 0) {
            this.f185280h.m171406i(i);
        }
        this.f185280h.m171399b(bLiveAvatarFrameConfig);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m202299N(NetworkInfo networkInfo) {
        return Boolean.valueOf(NullChecker.m82486a(this.f185277e) && NullChecker.m82486a(this.f185277e.mo183435j()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m202300O(NetworkInfo networkInfo) {
        m202309X(this.f185277e.mo183435j());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m202301P(BLiveVoiceCall bLiveVoiceCall) {
        this.f185277e.m183402J2(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ C22421c m202302Q(vxj0 vxj0Var) {
        return m202325t(VCallApiProvider.requestSdkToken(this.f185277e.m202194o(), ""));
    }

    /* JADX INFO: renamed from: R */
    public void m202303R(Integer num, Object obj) {
        if (this.f185277e == null) {
            return;
        }
        nsh0.m164608j("[live][voiceWindow]", "onEngineCallback " + at2.m100018b(num.intValue()));
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            m202313b0(String.valueOf(obj), new y20() { // from class: l.jpo0
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f122125a.m202321j0((BLiveRtcToken) obj2);
                }
            });
        } else if (iIntValue == 3) {
            m202311Z();
        } else {
            if (iIntValue != 4) {
                return;
            }
            m202288C();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m202304S(Throwable th) {
        nsh0.m164608j("[live][voiceWindow]", "onErrorHandle :" + (th == null ? "" : th.getMessage()));
    }

    /* JADX INFO: renamed from: T */
    public final void m202305T() {
        m202318g0(true);
        uam uamVarM202330y = m202330y();
        if (NullChecker.m82486a(uamVarM202330y)) {
            uamVarM202330y.mo76791d(this.f185277e, zrv.f205803e.getString(R$string.f48376sj));
            uamVarM202330y.mo76788a();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m202306U() {
        rwn0 rwn0Var = this.f185277e;
        rwn0Var.mo146096e2(rwn0Var.mo118373p(), this.f185277e.mo183435j());
        if (!this.f185276d.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || !this.f185276d.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            m202314c0();
        }
        uam uamVarM202330y = m202330y();
        if (NullChecker.m82486a(uamVarM202330y)) {
            uamVarM202330y.mo76791d(this.f185277e, zrv.f205803e.getString(R$string.f47686Mi));
            uamVarM202330y.mo76790c();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m202307V(gvn0 gvn0Var) {
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
                    if (!this.f185277e.mo118373p() && zrv.f205799a.m207631D0().equals(gvn0Var.m132566g().f143542a.f107997a)) {
                        if (gvn0Var.m132571l()) {
                            o1j0.m165649w(R$string.f48308ph);
                        } else if (!m202324s().m183434i3()) {
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
        m202289D(gvn0Var.m132564e());
    }

    /* JADX INFO: renamed from: W */
    public void m202308W() {
        m202315d0(true);
        C12622a.m69707b().m69710e(zrv.f205803e);
        m202316e0();
    }

    /* JADX INFO: renamed from: X */
    public final void m202309X(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        m202325t(itv.m142119v(bLiveAbsData)).subscribe(dhw.m115826e(new y20() { // from class: l.fpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100208a.m202323r((ugd0) obj);
            }
        }, new gpo0(this)));
        m202322k0();
    }

    /* JADX INFO: renamed from: Y */
    public void m202310Y(boolean z, boolean z2) {
        nsh0.m164608j("[live][voiceWindow]", "VoiceRoomManager:" + z + z2);
        this.f185275c.onCompleted();
        m202318g0(z2);
        m202312a0();
        rwn0 rwn0Var = this.f185277e;
        if (rwn0Var != null) {
            if (z) {
                rwn0Var.m168518g2(rwn0Var.mo183435j());
                f5y.m124261b(App.f16088e);
            }
            if (z2 && !this.f185277e.mo118373p()) {
                VoiceRoomApiProvider.getOutRoom(this.f185277e.m202194o(), zrv.f205799a.m207631D0(), m202324s().m202200x());
            } else if (z2 && this.f185277e.mo118373p()) {
                itv.m142096T(this.f185277e.m202191k());
            }
        }
        this.f185277e = null;
        this.f185276d = null;
        this.f185280h.m171401d();
    }

    /* JADX INFO: renamed from: Z */
    public final void m202311Z() {
        rwn0 rwn0Var = this.f185277e;
        if (rwn0Var == null || rwn0Var.m183423Y2() == null || TextUtils.isEmpty(this.f185277e.m183423Y2().f45333id)) {
            return;
        }
        nsh0.m164608j("[live][voiceWindow]", "reportCallStatus");
        m202325t(VCallApiProvider.reportConnect(this.f185277e.m183423Y2().f45333id, true)).subscribe(dhw.m115829h(new y20() { // from class: l.mpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137934a.m202289D((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m202312a0() {
        if (this.f185277e.m183423Y2() == null || TextUtils.isEmpty(this.f185277e.m183423Y2().f45333id)) {
            return;
        }
        m202325t(VCallApiProvider.deputyGoAway(this.f185277e.m183423Y2().f45333id)).subscribe(dhw.m115829h(new y20() { // from class: l.dpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90077a.m202301P((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public void m202313b0(String str, y20<BLiveRtcToken> y20Var) {
        if (TextUtils.isEmpty(this.f185277e.m202194o())) {
            return;
        }
        m202325t(VCallApiProvider.requestSdkToken(this.f185277e.m202194o(), str)).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m202314c0() {
        fhw.m125605a("[live][voiceWindow]", "requestRtcTokenEnterRoom:");
        m202325t(wgt.m206249p(iit.INSTANCE.m140133S(), null, new Object[0])).flatMap(new qcj() { // from class: l.hpo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111040a.m202302Q((vxj0) obj);
            }
        }).subscribe(dhw.m115826e(new ipo0(this), new gpo0(this)));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m202315d0(boolean z) {
        this.f185279g = z;
        fhw.m125605a("[live][voiceWindow]", "setFront:" + z);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m202316e0() {
        boolean z = !this.f185279g || (this.f185277e.m183423Y2() != null && (this.f185277e.m183423Y2().mutedByAnchor || this.f185277e.m183423Y2().mutedByUser));
        fhw.m125605a("[live][voiceWindow]", "set local Mute:" + z);
        c0m c0mVar = this.f185276d;
        if (z) {
            c0mVar.mo107434e().mo170530i0(true);
        } else {
            c0mVar.mo107434e().mo170536n(false);
            this.f185276d.mo107434e().mo170530i0(false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m202317f0(BLiveRtcToken bLiveRtcToken) {
        fhw.m125605a("[live][voiceWindow]", "startCallEngineMotion");
        C12877b c12877bMo133182a = this.f185276d.mo107433d().mo133182a();
        if (c12877bMo133182a != null) {
            fhw.m125605a("[live][voiceWindow]", "motion" + c12877bMo133182a.m73080Z0().toString());
        }
        if (c12877bMo133182a == null || !(c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR))) {
            fhw.m125605a("[live][voiceWindow]", " start startCallEngineMotion");
            this.f185276d.mo107433d().mo133185d(new grm0(this.f185277e.mo183435j().streamUrl.push, this.f185277e.m202194o(), String.valueOf(this.f185277e.mo183435j().streamCdnInfo.provider), String.valueOf(this.f185277e.mo183435j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, guk0.m132329h(this.f185277e.m183423Y2()), new spo0(this)));
        } else {
            if (guk0.m132333l(this.f185277e.m183423Y2())) {
                m202311Z();
            }
            fhw.m125605a("[live][voiceWindow]", "startCallEngineMotion  return");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m202318g0(boolean z) {
        if (this.f185276d == null) {
            return;
        }
        nsh0.m164608j("[live][voiceWindow]", "stop push needStopRtc:" + z);
        if (z) {
            if (this.f185276d.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || this.f185276d.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                if (this.f185276d.mo107433d().mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                    this.f185276d.mo107430a().stopSurroundMusic();
                }
                this.f185276d.mo107433d().mo133183b();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m202319h0() {
        C12877b c12877bMo133182a = this.f185276d.mo107433d().mo133182a();
        if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            return;
        }
        ((frm0) c12877bMo133182a.m73074T0(frm0.class)).m221308z1(guk0.m132329h(this.f185277e.m183423Y2()));
        nsh0.m164608j("[live][voiceWindow]", "updateClientRole:" + guk0.m132329h(this.f185277e.m183423Y2()));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m202320i0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall != null) {
            m202289D(bLiveVoiceCall);
        } else {
            if (this.f185277e.m183423Y2() == null || !guk0.m132327f(this.f185277e.m183423Y2())) {
                return;
            }
            BLiveVoiceCall bLiveVoiceCallClone = this.f185277e.m183423Y2().mo225055clone();
            bLiveVoiceCallClone.state = "hung-up";
            m202289D(bLiveVoiceCallClone);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m202321j0(BLiveRtcToken bLiveRtcToken) {
        if (bLiveRtcToken != null) {
            nsh0.m164608j("[live][voiceWindow]", "updateRtcToken :" + bLiveRtcToken.channelKey);
            this.f185276d.mo107434e().mo170538o(bLiveRtcToken.channelKey);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m202322k0() {
        rwn0 rwn0Var = this.f185277e;
        if (rwn0Var == null) {
            return;
        }
        m202325t(VCallApiProvider.getSelfCallInfo(rwn0Var.m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.lpo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133081a.m202320i0((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final void m202323r(ugd0 ugd0Var) {
        this.f185277e.mo168476S(ugd0Var);
        this.f185277e.m168485V(ugd0Var.f138293c);
        nsh0.m164608j("[live][voiceWindow]", "refreshWindow:" + ugd0Var.f138293c.streamUrl.pullFlv);
    }

    /* JADX INFO: renamed from: s */
    public rwn0 m202324s() {
        return this.f185277e;
    }

    /* JADX INFO: renamed from: t */
    public <T> C22421c<T> m202325t(final C22421c<T> c22421c) {
        return psd0.m173593D(new pcj() { // from class: l.epo0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vpo0.m202274f(c22421c);
            }
        }, this.f185275c, false);
    }

    /* JADX INFO: renamed from: u */
    public String m202326u() {
        return this.f185273a.f141831d;
    }

    /* JADX INFO: renamed from: v */
    public String m202327v() {
        return this.f185273a.f141830c;
    }

    /* JADX INFO: renamed from: w */
    public oo2 m202328w() {
        return this.f185277e;
    }

    /* JADX INFO: renamed from: x */
    public boolean m202329x() {
        return (guk0.m132329h(this.f185277e.m183423Y2()) || this.f185277e.mo118373p()) && this.f185277e.m202193m().m146875a() == 2;
    }

    /* JADX INFO: renamed from: y */
    public final uam m202330y() {
        return (uam) this.f185273a.f141828a;
    }

    /* JADX INFO: renamed from: z */
    public String m202331z() {
        return NullChecker.m82486a(this.f185277e) ? this.f185277e.m202191k() : "";
    }
}
