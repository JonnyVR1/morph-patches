package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class rgo0 {

    /* JADX INFO: renamed from: a */
    public final j7j0 f159270a;

    /* JADX INFO: renamed from: b */
    public final f30<Boolean, Boolean> f159271b;

    /* JADX INFO: renamed from: c */
    public C22392a<Pair<Boolean, Boolean>> f159272c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public jxl f159273d;

    /* JADX INFO: renamed from: e */
    public nnn0 f159274e;

    /* JADX INFO: renamed from: f */
    public e30<Boolean> f159275f;

    /* JADX INFO: renamed from: g */
    public boolean f159276g;

    /* JADX INFO: renamed from: h */
    public ia1 f159277h;

    public rgo0(nnn0 nnn0Var, j7j0 j7j0Var, f30<Boolean, Boolean> f30Var, e30<Boolean> e30Var) {
        this.f159274e = nnn0Var;
        this.f159270a = j7j0Var;
        this.f159271b = f30Var;
        this.f159275f = e30Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C22306c m179185f(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: A */
    public final void m179197A(Boolean bool) {
        m179226d0(bool.booleanValue());
        hfw.m130790a("[live][voiceWindow]", "isFront:" + this.f159276g);
        if (this.f159276g) {
            C12459a.m68524b().m68527e(ypv.f199497e);
        }
        hfw.m130790a("[live][voiceWindow]", "handLiftCycle is front:" + bool);
        this.f159275f.call(bool);
        m179227e0();
    }

    /* JADX INFO: renamed from: B */
    public final void m179198B(iqv iqvVar) {
        hfw.m130790a("[live][voiceWindow]", "handLiveState:" + iqvVar.m137794a());
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m179217U();
        } else if (iM137794a == 4) {
            m179216T();
        }
        gkh0.m126627j("[live][voiceWindow]", "roomState:" + iqvVar.m137794a());
    }

    /* JADX INFO: renamed from: C */
    public void m179199C() {
        m179224b0("", new ego0(this));
    }

    /* JADX INFO: renamed from: D */
    public void m179200D(BLiveVoiceCall bLiveVoiceCall) {
        new StringBuilder("call:").append(bLiveVoiceCall);
        gkh0.m126627j("[live][voiceWindow]", bLiveVoiceCall.toString());
        this.f159274e.m160240J2(bLiveVoiceCall);
        if (alk0.m97309h(bLiveVoiceCall)) {
            m179227e0();
            m179230h0();
        } else if (alk0.m97313l(bLiveVoiceCall)) {
            m179225c0();
        } else if (alk0.m97307f(bLiveVoiceCall)) {
            m179230h0();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m179201E() {
        m179203G();
        m179202F();
        if (this.f159273d != null) {
            this.f159272c.m132487l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
            m179226d0(Act.isAppVisible());
        } else {
            f30<Boolean, Boolean> f30Var = this.f159271b;
            Boolean bool = Boolean.TRUE;
            f30Var.call(bool, bool);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m179202F() {
        m179236t(this.f159274e.m132153n1()).subscribe(ffw.m121197h(new e30() { // from class: l.vfo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181292a.m179207K((LiveControlMessage) obj);
            }
        }));
        m179236t(this.f159274e.m132160q1().m189155x0()).filter(new w9j() { // from class: l.ggo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(alk0.m97311j(((cmn0) obj).m107677e()));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.jgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117813a.m179218V((cmn0) obj);
            }
        }));
        m179236t(this.f159274e.m132160q1().m189059M0()).subscribe(ffw.m121193d(new e30() { // from class: l.kgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123049a.m179208L((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
        m179236t(this.f159274e.m132160q1().m189157y0()).onBackpressureBuffer(100L).filter(new lgo0()).map(new w9j() { // from class: l.mgo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f8n0.m120033T3(((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj).getFrameConfig());
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ngo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138892a.m179209M((BLiveAvatarFrameConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public final void m179203G() {
        if (this.f159273d == null) {
            this.f159273d = this.f159274e.m132067H0();
        }
        jxl jxlVar = this.f159273d;
        if (jxlVar == null) {
            return;
        }
        if (this.f159277h == null) {
            this.f159277h = new ia1(jxlVar);
        }
        this.f159273d.mo138338d().onResume();
        this.f159273d.mo138338d().mo133473c(new ogo0(this));
        m179236t(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.pgo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).filter(new w9j() { // from class: l.qgo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154364a.m179210N((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.wfo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186098a.m179211O((NetworkInfo) obj);
            }
        }));
        m179236t(this.f159274e.m149815l()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.xfo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192704a.m179198B((iqv) obj);
            }
        }));
        m179236t(Act.front()).subscribe(ffw.m121197h(new e30() { // from class: l.yfo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198079a.m179197A((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public final void m179204H(BLiveAbsData bLiveAbsData) {
        if (m179205I()) {
            m179220X(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m179205I() {
        return this.f159270a.f116609a != null;
    }

    /* JADX INFO: renamed from: J */
    public final void m179206J(String str) {
        BLiveAbsData bLiveAbsDataNew_ = BLiveAbsData.new_();
        bLiveAbsDataNew_.f44323id = str;
        m179204H(bLiveAbsDataNew_);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m179207K(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46951S5));
                f30<Boolean, Boolean> f30Var = this.f159271b;
                Boolean bool = Boolean.TRUE;
                f30Var.call(bool, bool);
                break;
            case "stop":
            case "force_stop":
                this.f159274e.mo149812h(u7s.f175055e);
                break;
            case "start":
            case "recover":
                m179206J(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                lsi0.m151595y(liveControlMessage.isAnchor ? ypv.f199497e.getString(R$string.f46972T5) : ypv.f199497e.getString(R$string.f46930R5));
                f30<Boolean, Boolean> f30Var2 = this.f159271b;
                Boolean bool2 = Boolean.TRUE;
                f30Var2.call(bool2, bool2);
                break;
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m179208L(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        if (m179235s().mo149817n() == null) {
            return;
        }
        sco0.m183422a(m179235s().mo149817n(), voiceRoomBgPicUpdateMessage);
        if (TextUtils.isEmpty(voiceRoomBgPicUpdateMessage.getUrl())) {
            return;
        }
        m179235s().mo149817n().backgroundUrl = voiceRoomBgPicUpdateMessage.getUrl();
        m179235s().mo149817n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m179209M(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        int i;
        if (bLiveAvatarFrameConfig.changeVoiceNo != 0 && (i = bLiveAvatarFrameConfig.remainingSec) > 0) {
            this.f159277h.m135116i(i);
        }
        this.f159277h.m135109b(bLiveAvatarFrameConfig);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m179210N(NetworkInfo networkInfo) {
        return Boolean.valueOf(NullChecker.m81303a(this.f159274e) && NullChecker.m81303a(this.f159274e.mo149813j()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m179211O(NetworkInfo networkInfo) {
        m179220X(this.f159274e.mo149813j());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m179212P(BLiveVoiceCall bLiveVoiceCall) {
        this.f159274e.m160240J2(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ C22306c m179213Q(soj0 soj0Var) {
        return m179236t(VCallApiProvider.requestSdkToken(this.f159274e.m149818o(), ""));
    }

    /* JADX INFO: renamed from: R */
    public void m179214R(Integer num, Object obj) {
        if (this.f159274e == null) {
            return;
        }
        gkh0.m126627j("[live][voiceWindow]", "onEngineCallback " + ks2.m147035b(num.intValue()));
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            m179224b0(String.valueOf(obj), new e30() { // from class: l.fgo0
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f97391a.m179232j0((BLiveRtcToken) obj2);
                }
            });
        } else if (iIntValue == 3) {
            m179222Z();
        } else {
            if (iIntValue != 4) {
                return;
            }
            m179199C();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m179215S(Throwable th) {
        gkh0.m126627j("[live][voiceWindow]", "onErrorHandle :" + (th == null ? "" : th.getMessage()));
    }

    /* JADX INFO: renamed from: T */
    public final void m179216T() {
        m179229g0(true);
        e8m e8mVarM179241y = m179241y();
        if (NullChecker.m81303a(e8mVarM179241y)) {
            e8mVarM179241y.mo75608d(this.f159274e, ypv.f199497e.getString(R$string.f47528sj));
            e8mVarM179241y.mo75605a();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m179217U() {
        nnn0 nnn0Var = this.f159274e;
        nnn0Var.mo97489e2(nnn0Var.mo97490p(), this.f159274e.mo149813j());
        if (!this.f159273d.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || !this.f159273d.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            m179225c0();
        }
        e8m e8mVarM179241y = m179241y();
        if (NullChecker.m81303a(e8mVarM179241y)) {
            e8mVarM179241y.mo75608d(this.f159274e, ypv.f199497e.getString(R$string.f46838Mi));
            e8mVarM179241y.mo75607c();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m179218V(cmn0 cmn0Var) {
        int iM107682j = cmn0Var.m107682j();
        if (iM107682j != 1) {
            switch (iM107682j) {
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
                    if (!this.f159274e.mo97490p() && ypv.f199493a.m199309D0().equals(cmn0Var.m107679g().f135304a.f111520a)) {
                        if (cmn0Var.m107684l()) {
                            lsi0.m151593w(R$string.f47460ph);
                        } else if (!m179235s().m160271i3()) {
                            lsi0.m151593w(R$string.f47438oh);
                        } else {
                            lsi0.m151593w(R$string.f47283hf);
                        }
                    }
                    break;
                default:
                    return;
            }
        }
        m179200D(cmn0Var.m107677e());
    }

    /* JADX INFO: renamed from: W */
    public void m179219W() {
        m179226d0(true);
        C12459a.m68524b().m68527e(ypv.f199497e);
        m179227e0();
    }

    /* JADX INFO: renamed from: X */
    public final void m179220X(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        m179236t(hrv.m132760v(bLiveAbsData)).subscribe(ffw.m121194e(new e30() { // from class: l.bgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75476a.m179234r((r8d0) obj);
            }
        }, new cgo0(this)));
        m179233k0();
    }

    /* JADX INFO: renamed from: Y */
    public void m179221Y(boolean z, boolean z2) {
        gkh0.m126627j("[live][voiceWindow]", "VoiceRoomManager:" + z + z2);
        this.f159272c.onCompleted();
        m179229g0(z2);
        m179223a0();
        nnn0 nnn0Var = this.f159274e;
        if (nnn0Var != null) {
            if (z) {
                nnn0Var.m132132g2(nnn0Var.mo149813j());
                iwx.m138782b(App.f15369e);
            }
            if (z2 && !this.f159274e.mo97490p()) {
                VoiceRoomApiProvider.getOutRoom(this.f159274e.m149818o(), ypv.f199493a.m199309D0(), m179235s().m149826x());
            } else if (z2 && this.f159274e.mo97490p()) {
                hrv.m132737T(this.f159274e.m149814k());
            }
        }
        this.f159274e = null;
        this.f159273d = null;
        this.f159277h.m135111d();
    }

    /* JADX INFO: renamed from: Z */
    public final void m179222Z() {
        nnn0 nnn0Var = this.f159274e;
        if (nnn0Var == null || nnn0Var.m160261Y2() == null || TextUtils.isEmpty(this.f159274e.m160261Y2().f44485id)) {
            return;
        }
        gkh0.m126627j("[live][voiceWindow]", "reportCallStatus");
        m179236t(VCallApiProvider.reportConnect(this.f159274e.m160261Y2().f44485id, true)).subscribe(ffw.m121197h(new e30() { // from class: l.igo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113139a.m179200D((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m179223a0() {
        if (this.f159274e.m160261Y2() == null || TextUtils.isEmpty(this.f159274e.m160261Y2().f44485id)) {
            return;
        }
        m179236t(VCallApiProvider.deputyGoAway(this.f159274e.m160261Y2().f44485id)).subscribe(ffw.m121197h(new e30() { // from class: l.zfo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202972a.m179212P((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public void m179224b0(String str, e30<BLiveRtcToken> e30Var) {
        if (TextUtils.isEmpty(this.f159274e.m149818o())) {
            return;
        }
        m179236t(VCallApiProvider.requestSdkToken(this.f159274e.m149818o(), str)).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m179225c0() {
        hfw.m130790a("[live][voiceWindow]", "requestRtcTokenEnterRoom:");
        m179236t(vet.m198232p(hgt.INSTANCE.m130912S(), null, new Object[0])).flatMap(new w9j() { // from class: l.dgo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86147a.m179213Q((soj0) obj);
            }
        }).subscribe(ffw.m121194e(new ego0(this), new cgo0(this)));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m179226d0(boolean z) {
        this.f159276g = z;
        hfw.m130790a("[live][voiceWindow]", "setFront:" + z);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m179227e0() {
        boolean z = !this.f159276g || (this.f159274e.m160261Y2() != null && (this.f159274e.m160261Y2().mutedByAnchor || this.f159274e.m160261Y2().mutedByUser));
        hfw.m130790a("[live][voiceWindow]", "set local Mute:" + z);
        jxl jxlVar = this.f159273d;
        if (z) {
            jxlVar.mo138339e().mo118678i0(true);
        } else {
            jxlVar.mo138339e().mo118679n(false);
            this.f159273d.mo138339e().mo118678i0(false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m179228f0(BLiveRtcToken bLiveRtcToken) {
        hfw.m130790a("[live][voiceWindow]", "startCallEngineMotion");
        C12714b c12714bMo133471a = this.f159273d.mo138338d().mo133471a();
        if (c12714bMo133471a != null) {
            hfw.m130790a("[live][voiceWindow]", "motion" + c12714bMo133471a.m71897Z0().toString());
        }
        if (c12714bMo133471a == null || !(c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR))) {
            hfw.m130790a("[live][voiceWindow]", " start startCallEngineMotion");
            this.f159273d.mo138338d().mo133474d(new cim0(this.f159274e.mo149813j().streamUrl.push, this.f159274e.m149818o(), String.valueOf(this.f159274e.mo149813j().streamCdnInfo.provider), String.valueOf(this.f159274e.mo149813j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, alk0.m97309h(this.f159274e.m160261Y2()), new ogo0(this)));
        } else {
            if (alk0.m97313l(this.f159274e.m160261Y2())) {
                m179222Z();
            }
            hfw.m130790a("[live][voiceWindow]", "startCallEngineMotion  return");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m179229g0(boolean z) {
        if (this.f159273d == null) {
            return;
        }
        gkh0.m126627j("[live][voiceWindow]", "stop push needStopRtc:" + z);
        if (z) {
            if (this.f159273d.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || this.f159273d.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                if (this.f159273d.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                    this.f159273d.mo138335a().stopSurroundMusic();
                }
                this.f159273d.mo138338d().mo133472b();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m179230h0() {
        C12714b c12714bMo133471a = this.f159273d.mo138338d().mo133471a();
        if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            return;
        }
        ((bim0) c12714bMo133471a.m71891T0(bim0.class)).m142991z1(alk0.m97309h(this.f159274e.m160261Y2()));
        gkh0.m126627j("[live][voiceWindow]", "updateClientRole:" + alk0.m97309h(this.f159274e.m160261Y2()));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m179231i0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall != null) {
            m179200D(bLiveVoiceCall);
        } else {
            if (this.f159274e.m160261Y2() == null || !alk0.m97307f(this.f159274e.m160261Y2())) {
                return;
            }
            BLiveVoiceCall bLiveVoiceCallClone = this.f159274e.m160261Y2().mo223809clone();
            bLiveVoiceCallClone.state = "hung-up";
            m179200D(bLiveVoiceCallClone);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m179232j0(BLiveRtcToken bLiveRtcToken) {
        if (bLiveRtcToken != null) {
            gkh0.m126627j("[live][voiceWindow]", "updateRtcToken :" + bLiveRtcToken.channelKey);
            this.f159273d.mo138339e().mo118680o(bLiveRtcToken.channelKey);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m179233k0() {
        nnn0 nnn0Var = this.f159274e;
        if (nnn0Var == null) {
            return;
        }
        m179236t(VCallApiProvider.getSelfCallInfo(nnn0Var.m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.hgo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107612a.m179231i0((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final void m179234r(r8d0 r8d0Var) {
        this.f159274e.mo132090S(r8d0Var);
        this.f159274e.m132099V(r8d0Var.f187610c);
        gkh0.m126627j("[live][voiceWindow]", "refreshWindow:" + r8d0Var.f187610c.streamUrl.pullFlv);
    }

    /* JADX INFO: renamed from: s */
    public nnn0 m179235s() {
        return this.f159274e;
    }

    /* JADX INFO: renamed from: t */
    public <T> C22306c<T> m179236t(final C22306c<T> c22306c) {
        return mkd0.m154952D(new v9j() { // from class: l.ago0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return rgo0.m179185f(c22306c);
            }
        }, this.f159272c, false);
    }

    /* JADX INFO: renamed from: u */
    public String m179237u() {
        return this.f159270a.f116612d;
    }

    /* JADX INFO: renamed from: v */
    public String m179238v() {
        return this.f159270a.f116611c;
    }

    /* JADX INFO: renamed from: w */
    public ho2 m179239w() {
        return this.f159274e;
    }

    /* JADX INFO: renamed from: x */
    public boolean m179240x() {
        return (alk0.m97309h(this.f159274e.m160261Y2()) || this.f159274e.mo97490p()) && this.f159274e.m149816m().m137794a() == 2;
    }

    /* JADX INFO: renamed from: y */
    public final e8m m179241y() {
        return (e8m) this.f159270a.f116609a;
    }

    /* JADX INFO: renamed from: z */
    public String m179242z() {
        return NullChecker.m81303a(this.f159274e) ? this.f159274e.m149814k() : "";
    }
}
