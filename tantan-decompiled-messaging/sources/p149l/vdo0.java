package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class vdo0 implements ktl {

    /* JADX INFO: renamed from: a */
    public q5m0 f181102a;

    /* JADX INFO: renamed from: b */
    public C22392a<Pair<Boolean, Boolean>> f181103b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public jxl f181104c;

    /* JADX INFO: renamed from: d */
    public nnn0 f181105d;

    /* JADX INFO: renamed from: e */
    public boolean f181106e;

    /* JADX INFO: renamed from: f */
    public jur f181107f;

    /* JADX INFO: renamed from: g */
    public ia1 f181108g;

    public vdo0(q5m0 q5m0Var, nnn0 nnn0Var) {
        this.f181102a = q5m0Var;
        this.f181105d = nnn0Var;
    }

    /* JADX INFO: renamed from: D */
    private e8m m198011D() {
        return this.f181102a.m173055g();
    }

    /* JADX INFO: renamed from: e0 */
    private void m198017e0() {
        m198081t0(true);
        e8m e8mVarM198011D = m198011D();
        if (NullChecker.m81303a(e8mVarM198011D)) {
            e8mVarM198011D.mo75608d(this.f181105d, ypv.f199497e.getString(R$string.f47528sj));
            e8mVarM198011D.mo75605a();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m198019f0() {
        nnn0 nnn0Var = this.f181105d;
        nnn0Var.mo97489e2(nnn0Var.mo97490p(), this.f181105d.mo149813j());
        if (!this.f181104c.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || !this.f181104c.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            m198030p0();
        }
        e8m e8mVarM198011D = m198011D();
        if (NullChecker.m81303a(e8mVarM198011D)) {
            e8mVarM198011D.mo75608d(this.f181105d, ypv.f199497e.getString(R$string.f46838Mi));
            e8mVarM198011D.mo75607c();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C22306c m198023j(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: p0 */
    private void m198030p0() {
        hfw.m130790a("[live][voiceWindow]", "requestRtcTokenEnterRoom:");
        mo147210L1(vet.m198232p(hgt.INSTANCE.m130912S(), null, new Object[0])).flatMap(new w9j() { // from class: l.ido0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112668a.m198067b0((soj0) obj);
            }
        }).subscribe(ffw.m121194e(new jdo0(this), new gdo0(this)));
    }

    /* JADX INFO: renamed from: r0 */
    private void m198033r0() {
        boolean z = !this.f181106e || (this.f181105d.m160261Y2() != null && (this.f181105d.m160261Y2().mutedByAnchor || this.f181105d.m160261Y2().mutedByUser));
        hfw.m130790a("[live][voiceWindow]", "set local Mute:" + z);
        jxl jxlVar = this.f181104c;
        if (z) {
            jxlVar.mo138339e().mo118678i0(true);
        } else {
            jxlVar.mo138339e().mo118679n(false);
            this.f181104c.mo138339e().mo118678i0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m198039x0(BLiveRtcToken bLiveRtcToken) {
        if (bLiveRtcToken != null) {
            gkh0.m126627j("[live][voiceWindow]", "updateRtcToken :" + bLiveRtcToken.channelKey);
            this.f181104c.mo138339e().mo118680o(bLiveRtcToken.channelKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m198060U(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if ((bLiveVoiceKtvGameInfo == null || (bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo) == null) ? false : TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0())) {
            this.f181108g.m135111d();
            return;
        }
        final BLiveAvatarFrameConfig bLiveAvatarFrameConfig = hxn0.m133350c(this.f181105d.m160249P2().m102064m(ypv.f199493a.m199309D0())).f109896b.avatarConfig.frameConfig;
        if (!bLiveAvatarFrameConfig.checkNeedChangeVoice()) {
            this.f181108g.m135112e();
        } else {
            final int fixedRemainingSec = (int) bLiveAvatarFrameConfig.getFixedRemainingSec();
            e51.m114743H(Act.foreground_().f15343a.get(), new Runnable() { // from class: l.hdo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107283a.m198056Q(fixedRemainingSec, bLiveAvatarFrameConfig);
                }
            }, 150L);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m198041A() {
        this.f181102a.mo110328K0(true, true);
    }

    /* JADX INFO: renamed from: B */
    public nnn0 m198042B() {
        return this.f181105d;
    }

    /* JADX INFO: renamed from: C */
    public boolean m198043C() {
        return (alk0.m97309h(this.f181105d.m160261Y2()) || this.f181105d.mo97490p()) && this.f181105d.m149816m().m137794a() == 2;
    }

    /* JADX INFO: renamed from: E */
    public String m198044E() {
        return NullChecker.m81303a(this.f181105d) ? this.f181105d.m149814k() : "";
    }

    /* JADX INFO: renamed from: F */
    public final void m198045F(Boolean bool) {
        m198079q0(bool.booleanValue());
        hfw.m130790a("[live][voiceWindow]", "isFront:" + this.f181106e);
        if (this.f181106e) {
            C12459a.m68524b().m68527e(ypv.f199497e);
        }
        hfw.m130790a("[live][voiceWindow]", "handLiftCycle is front:" + bool);
        this.f181102a.m173056h(bool.booleanValue());
    }

    /* JADX INFO: renamed from: G */
    public final void m198046G(iqv iqvVar) {
        hfw.m130790a("[live][voiceWindow]", "handLiveState:" + iqvVar.m137794a());
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m198019f0();
        } else if (iM137794a == 4) {
            m198017e0();
        }
        gkh0.m126627j("[live][voiceWindow]", "roomState:" + iqvVar.m137794a());
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m198059T(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        hfw.m130790a("voice_effect_gift", "window photoSticker:" + voiceLivePhotoSticker.toString());
        hxn0 hxn0VarM133350c = hxn0.m133350c(this.f181105d.m160249P2().m102064m(voiceLivePhotoSticker.getUserId()));
        if (hxn0VarM133350c.f109896b == null || !voiceLivePhotoSticker.hasFrameConfig()) {
            return;
        }
        hxn0VarM133350c.f109896b.avatarConfig.frameConfig = p8n0.m167812Z3(voiceLivePhotoSticker.getFrameConfig());
        if (NullChecker.m81303a(this.f181105d.m160257U2())) {
            BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = this.f181105d.m160257U2().f113580a;
            if (NullChecker.m81303a(bLiveVoiceKtvGameInfo.playInfo) && ypv.f199493a.m199309D0().equals(bLiveVoiceKtvGameInfo.playInfo.userId)) {
                this.f181108g.m135111d();
                return;
            }
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = hxn0VarM133350c.f109896b.avatarConfig.frameConfig;
        boolean zCheckNeedChangeVoice = bLiveAvatarFrameConfig.checkNeedChangeVoice();
        ia1 ia1Var = this.f181108g;
        if (!zCheckNeedChangeVoice) {
            ia1Var.m135112e();
        } else {
            ia1Var.m135116i((int) bLiveAvatarFrameConfig.getFixedRemainingSec());
            this.f181108g.m135109b(bLiveAvatarFrameConfig);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m198048I() {
        m198078o0("", new jdo0(this));
    }

    /* JADX INFO: renamed from: J */
    public void m198049J(BLiveVoiceCall bLiveVoiceCall) {
        new StringBuilder("call:").append(bLiveVoiceCall);
        gkh0.m126627j("[live][voiceWindow]", bLiveVoiceCall.toString());
        this.f181105d.m160240J2(bLiveVoiceCall);
        if (alk0.m97309h(bLiveVoiceCall)) {
            m198033r0();
            m198083v0();
        } else if (alk0.m97313l(bLiveVoiceCall)) {
            m198030p0();
        } else if (alk0.m97307f(bLiveVoiceCall)) {
            m198083v0();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m198050K() {
        m198051L();
        m198052M();
        jxl jxlVar = this.f181104c;
        if (jxlVar == null) {
            m198041A();
            return;
        }
        this.f181108g = new ia1(jxlVar);
        this.f181103b.m132487l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
        m198079q0(Act.isAppVisible());
        if (this.f181105d.m160257U2() != null) {
            this.f181105d.m160257U2().m136690X(this);
            this.f181105d.m160257U2().m136692Z();
        }
        m198086y();
    }

    /* JADX INFO: renamed from: L */
    public final void m198051L() {
        mo147210L1(this.f181105d.m132153n1()).subscribe(ffw.m121197h(new e30() { // from class: l.tdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169578a.m198057R((LiveControlMessage) obj);
            }
        }));
        mo147210L1(this.f181105d.m132160q1().m189155x0()).filter(new w9j() { // from class: l.uco0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(alk0.m97311j(((cmn0) obj).m107677e()));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.vco0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180970a.m198071h0((cmn0) obj);
            }
        }));
        mo147210L1(this.f181105d.m132160q1().m189059M0()).subscribe(ffw.m121193d(new e30() { // from class: l.wco0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185703a.m198058S((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
        mo147210L1(this.f181105d.m132160q1().m189157y0()).onBackpressureBuffer(100L).filter(new lgo0()).subscribe(ffw.m121197h(new e30() { // from class: l.xco0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192246a.m198059T((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj);
            }
        }));
        mo147210L1(this.f181105d.m132160q1().m189037B0()).delay(50L, TimeUnit.MILLISECONDS).compose(mkd0.m154951C()).subscribe(ffw.m121197h(new e30() { // from class: l.yco0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197470a.m198060U((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        mo147210L1(this.f181105d.m132160q1().m189077V0()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.zco0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202560a.m198061V((LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage) obj);
            }
        }));
        mo147210L1(this.f181105d.f108769z.m181789r().m189079W0()).subscribe(ffw.m121197h(new e30() { // from class: l.ado0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68952a.m198062W((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
        mo147210L1(this.f181105d.m132160q1().m189067Q0()).map(new w9j() { // from class: l.bdo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VoiceLiveInfoMessage) obj).template;
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.udo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175938a.m198063X((String) obj);
            }
        }));
    }

    @Override // p149l.ktl
    /* JADX INFO: renamed from: L1 */
    public <T> C22306c<T> mo147210L1(final C22306c<T> c22306c) {
        return mkd0.m154952D(new v9j() { // from class: l.ddo0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vdo0.m198023j(c22306c);
            }
        }, this.f181103b, false);
    }

    /* JADX INFO: renamed from: M */
    public final void m198052M() {
        if (this.f181104c == null) {
            this.f181104c = this.f181105d.m132067H0();
        }
        jxl jxlVar = this.f181104c;
        if (jxlVar == null) {
            return;
        }
        jxlVar.mo138338d().onResume();
        this.f181104c.mo138338d().mo133473c(new edo0(this));
        mo147210L1(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.ndo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).filter(new w9j() { // from class: l.odo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143221a.m198064Y((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.pdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148318a.m198065Z((NetworkInfo) obj);
            }
        }));
        mo147210L1(this.f181105d.m149815l()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.qdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153947a.m198046G((iqv) obj);
            }
        }));
        mo147210L1(Act.front()).subscribe(ffw.m121197h(new e30() { // from class: l.rdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158961a.m198045F((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final void m198053N(BLiveAbsData bLiveAbsData) {
        if (m198054O()) {
            m198073j0(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m198054O() {
        return m198011D() != null;
    }

    /* JADX INFO: renamed from: P */
    public final void m198055P(String str) {
        BLiveAbsData bLiveAbsDataNew_ = BLiveAbsData.new_();
        bLiveAbsDataNew_.f44323id = str;
        m198053N(bLiveAbsDataNew_);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m198056Q(int i, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f181108g.m135116i(i);
        this.f181108g.m135109b(bLiveAvatarFrameConfig);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m198057R(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46951S5));
                m198041A();
                break;
            case "stop":
            case "force_stop":
                this.f181105d.mo149812h(u7s.f175055e);
                break;
            case "start":
            case "recover":
                m198055P(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                lsi0.m151595y(liveControlMessage.isAnchor ? ypv.f199497e.getString(R$string.f46972T5) : ypv.f199497e.getString(R$string.f46930R5));
                m198041A();
                break;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m198058S(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        if (TextUtils.isEmpty(voiceRoomBgPicUpdateMessage.getUrl()) || mo147211Y1().mo149817n() == null) {
            return;
        }
        mo147211Y1().mo149817n().backgroundUrl = voiceRoomBgPicUpdateMessage.getUrl();
        mo147211Y1().mo149817n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m198061V(LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage) {
        mo147211Y1().mo149813j().liveMode = voiceLiveModeMessage.getLiveMode();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m198062W(LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        mo147211Y1().mo149813j().template = voiceLiveTemplateMessage.getTemplate();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m198063X(String str) {
        mo147211Y1().mo149813j().template = str;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m198064Y(NetworkInfo networkInfo) {
        return Boolean.valueOf(NullChecker.m81303a(this.f181105d) && NullChecker.m81303a(this.f181105d.mo149813j()));
    }

    @Override // p149l.ktl
    /* JADX INFO: renamed from: Y1 */
    public nnn0 mo147211Y1() {
        return this.f181105d;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m198065Z(NetworkInfo networkInfo) {
        m198070g0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m198066a0(BLiveVoiceCall bLiveVoiceCall) {
        this.f181105d.m160240J2(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ C22306c m198067b0(soj0 soj0Var) {
        return mo147210L1(VCallApiProvider.requestSdkToken(this.f181105d.m149818o(), ""));
    }

    /* JADX INFO: renamed from: c0 */
    public void m198068c0(Integer num, Object obj) {
        if (this.f181105d == null) {
            return;
        }
        gkh0.m126627j("[live][voiceWindow]", "onEngineCallback " + ks2.m147035b(num.intValue()));
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            m198078o0(String.valueOf(obj), new e30() { // from class: l.kdo0
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f122571a.m198039x0((BLiveRtcToken) obj2);
                }
            });
        } else if (iIntValue == 3) {
            m198075l0();
        } else {
            if (iIntValue != 4) {
                return;
            }
            m198048I();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m198069d0(Throwable th) {
        gkh0.m126627j("[live][voiceWindow]", "onErrorHandle :" + (th == null ? "" : th.getMessage()));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m198070g0() {
        m198073j0(this.f181105d.mo149813j());
    }

    /* JADX INFO: renamed from: h0 */
    public void m198071h0(cmn0 cmn0Var) {
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
                    if (!this.f181105d.mo97490p() && ypv.f199493a.m199309D0().equals(cmn0Var.m107679g().f135304a.f111520a)) {
                        if (cmn0Var.m107684l()) {
                            lsi0.m151593w(R$string.f47460ph);
                        } else if (!mo147211Y1().m160271i3()) {
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
        m198049J(cmn0Var.m107677e());
    }

    /* JADX INFO: renamed from: i0 */
    public void m198072i0() {
        m198079q0(true);
        C12459a.m68524b().m68527e(ypv.f199497e);
        m198033r0();
        mo147210L1(mo147211Y1().f139739I).distinctUntilChanged().skip(1).subscribe(ffw.m121197h(new e30() { // from class: l.sdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163863a.m198082u0((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m198073j0(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            return;
        }
        mo147210L1(hrv.m132760v(bLiveAbsData)).subscribe(ffw.m121194e(new e30() { // from class: l.fdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97063a.m198085x((r8d0) obj);
            }
        }, new gdo0(this)));
        m198087y0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m198074k0(boolean z, boolean z2) {
        gkh0.m126627j("[live][voiceWindow]", "VoiceRoomManager:" + z + z2);
        this.f181103b.onCompleted();
        if (mo147211Y1().m160257U2() != null) {
            mo147211Y1().m160257U2().m136697r(z2);
        }
        m198081t0(z2);
        m198076m0();
        kur.m147296a();
        this.f181107f = null;
        nnn0 nnn0Var = this.f181105d;
        if (nnn0Var != null) {
            if (z) {
                nnn0Var.m132132g2(nnn0Var.mo149813j());
                iwx.m138782b(App.f15369e);
            }
            if (z2) {
                VoiceRoomApiProvider.getOutRoom(this.f181105d.m149818o(), ypv.f199493a.m199309D0(), mo147211Y1().m149826x());
            }
        }
        this.f181105d = null;
        this.f181104c = null;
        this.f181108g.m135111d();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m198075l0() {
        nnn0 nnn0Var = this.f181105d;
        if (nnn0Var == null || nnn0Var.m160261Y2() == null || TextUtils.isEmpty(this.f181105d.m160261Y2().f44485id)) {
            return;
        }
        gkh0.m126627j("[live][voiceWindow]", "reportCallStatus");
        mo147210L1(VCallApiProvider.reportConnect(this.f181105d.m160261Y2().f44485id, true)).subscribe(ffw.m121197h(new e30() { // from class: l.mdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133282a.m198049J((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m198076m0() {
        if (this.f181105d.m160261Y2() == null || TextUtils.isEmpty(this.f181105d.m160261Y2().f44485id)) {
            return;
        }
        mo147210L1(VCallApiProvider.deputyGoAway(this.f181105d.m160261Y2().f44485id)).subscribe(ffw.m121197h(new e30() { // from class: l.tco0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169467a.m198066a0((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m198077n0() {
        if (this.f181105d == null) {
            return;
        }
        m198086y();
        kur.m147298c(alk0.m97309h(this.f181105d.m160261Y2()), this.f181107f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m198078o0(String str, e30<BLiveRtcToken> e30Var) {
        if (TextUtils.isEmpty(this.f181105d.m149818o())) {
            return;
        }
        mo147210L1(VCallApiProvider.requestSdkToken(this.f181105d.m149818o(), str)).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m198079q0(boolean z) {
        this.f181106e = z;
        hfw.m130790a("[live][voiceWindow]", "setFront:" + z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m198080s0(BLiveRtcToken bLiveRtcToken) {
        hfw.m130790a("[live][voiceWindow]", "startCallEngineMotion");
        C12714b c12714bMo133471a = this.f181104c.mo138338d().mo133471a();
        if (c12714bMo133471a != null) {
            hfw.m130790a("[live][voiceWindow]", "motion" + c12714bMo133471a.m71897Z0().toString());
        }
        if (c12714bMo133471a == null || !(c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR))) {
            hfw.m130790a("[live][voiceWindow]", " start startCallEngineMotion");
            this.f181104c.mo138338d().mo133474d(new ks2(this.f181105d.mo149813j().streamUrl.push, this.f181105d.m149818o(), String.valueOf(this.f181105d.mo149813j().streamCdnInfo.provider), String.valueOf(this.f181105d.mo149813j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, alk0.m97309h(this.f181105d.m160261Y2()), new edo0(this)));
        } else {
            if (alk0.m97313l(this.f181105d.m160261Y2())) {
                m198075l0();
            }
            hfw.m130790a("[live][voiceWindow]", "startCallEngineMotion  return");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m198081t0(boolean z) {
        if (this.f181104c == null) {
            return;
        }
        gkh0.m126627j("[live][voiceWindow]", "stop push needStopRtc:" + z);
        if (z) {
            if (this.f181104c.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) || this.f181104c.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                if (this.f181104c.mo138338d().mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
                    this.f181104c.mo138335a().stopSurroundMusic();
                }
                this.f181104c.mo138338d().mo133472b();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m198082u0(BLiveVoiceCall bLiveVoiceCall) {
        m198086y();
        kur.m147302g(alk0.m97309h(bLiveVoiceCall), this.f181107f);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m198083v0() {
        C12714b c12714bMo133471a = this.f181104c.mo138338d().mo133471a();
        if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE)) {
            return;
        }
        ((bim0) c12714bMo133471a.m71891T0(bim0.class)).m142991z1(alk0.m97309h(this.f181105d.m160261Y2()));
        gkh0.m126627j("[live][voiceWindow]", "updateClientRole:" + alk0.m97309h(this.f181105d.m160261Y2()));
    }

    /* JADX INFO: renamed from: w0 */
    public final void m198084w0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall != null) {
            m198049J(bLiveVoiceCall);
        } else {
            if (this.f181105d.m160261Y2() == null || !alk0.m97307f(this.f181105d.m160261Y2())) {
                return;
            }
            BLiveVoiceCall bLiveVoiceCallClone = this.f181105d.m160261Y2().mo223809clone();
            bLiveVoiceCallClone.state = "hung-up";
            m198049J(bLiveVoiceCallClone);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m198085x(r8d0 r8d0Var) {
        this.f181105d.mo132090S(r8d0Var);
        this.f181105d.m132099V(r8d0Var.f187610c);
        gkh0.m126627j("[live][voiceWindow]", "refreshWindow:" + r8d0Var.f187610c.streamUrl.pullFlv);
    }

    /* JADX INFO: renamed from: y */
    public final void m198086y() {
        if (this.f181107f == null) {
            this.f181107f = new jur(new d30() { // from class: l.cdo0
                @Override // p149l.d30
                public final void call() {
                    this.f80397a.m198041A();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m198087y0() {
        nnn0 nnn0Var = this.f181105d;
        if (nnn0Var == null) {
            return;
        }
        mo147210L1(VCallApiProvider.getSelfCallInfo(nnn0Var.m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.ldo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127572a.m198084w0((BLiveVoiceCall) obj);
            }
        }));
    }
}
