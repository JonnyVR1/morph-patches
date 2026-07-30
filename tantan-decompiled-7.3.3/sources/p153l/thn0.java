package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;

/* JADX INFO: loaded from: classes5.dex */
public class thn0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public final oam f174395i;

    /* JADX INFO: renamed from: j */
    public final pa1 f174396j;

    /* JADX INFO: renamed from: k */
    public boolean f174397k;

    /* JADX INFO: renamed from: l */
    public boolean f174398l;

    /* JADX WARN: Multi-variable type inference failed */
    public thn0(dum dumVar, oam oamVar) {
        super(dumVar);
        this.f174397k = false;
        this.f174395i = oamVar;
        this.f174396j = new pa1(((rwn0) m213810E2()).m168456H0());
    }

    /* JADX INFO: renamed from: Z3 */
    public static BLiveAvatarFrameConfig m191288Z3(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigNew_ = BLiveAvatarFrameConfig.new_();
        bLiveAvatarFrameConfigNew_.staticUrl = pictureConfig.getStaticUrl();
        bLiveAvatarFrameConfigNew_.dynamicUrl = pictureConfig.getDynamicUrl();
        bLiveAvatarFrameConfigNew_.smallDynamicUrl = pictureConfig.getSmallDynamicUrl();
        bLiveAvatarFrameConfigNew_.mediumDynamicUrl = pictureConfig.getMediumDynamicUrl();
        bLiveAvatarFrameConfigNew_.totalSec = (int) pictureConfig.getTotalSec();
        bLiveAvatarFrameConfigNew_.remainingSec = (int) pictureConfig.getRemainingSec();
        bLiveAvatarFrameConfigNew_.changeVoiceNo = (int) pictureConfig.getChangeVoiceNo();
        bLiveAvatarFrameConfigNew_.endMill = pictureConfig.getEndMill();
        bLiveAvatarFrameConfigNew_.funnyUrl = pictureConfig.getFunnyUrl();
        return bLiveAvatarFrameConfigNew_;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m191289S3(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        fhw.m125605a("voice_effect_gift", "changeAudioEffect:" + bLiveAvatarFrameConfig.changeVoiceNo);
        if (this.f174397k) {
            return;
        }
        if (!bLiveAvatarFrameConfig.checkNeedChangeVoice()) {
            m191296a4();
        } else {
            this.f174396j.m171399b(bLiveAvatarFrameConfig);
            this.f174396j.m171406i((int) bLiveAvatarFrameConfig.getFixedRemainingSec());
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m191290T3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvGameInfo == null || (bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo) == null) {
            this.f174397k = false;
        } else {
            this.f174397k = TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0());
        }
        fhw.m125605a("voice_effect_gift", "checkIsKtvSinger:" + this.f174397k);
        if (this.f174397k) {
            this.f174396j.m171401d();
        } else {
            l51.m152888H(this.f196919f, new Runnable() { // from class: l.rhn0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163186a.m191292V3();
                }
            }, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public void m191291U3(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        fhw.m125605a("voice_effect_gift", "photoSticker:" + voiceLivePhotoSticker.toString());
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigM191288Z3 = m191288Z3(voiceLivePhotoSticker.getFrameConfig());
        nsv<h64> nsvVarM136874m = ((rwn0) m213810E2()).m183411P2().m136874m(voiceLivePhotoSticker.getUserId());
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVarM136874m);
        if (l6o0VarM153068c.f130275b != null && voiceLivePhotoSticker.hasFrameConfig()) {
            l6o0VarM153068c.f130275b.avatarConfig.frameConfig = bLiveAvatarFrameConfigM191288Z3;
        }
        boolean zM214495c = y6s.m214495c(((rwn0) m213810E2()).mo183435j().liveMode);
        oam oamVar = this.f174395i;
        if (zM214495c) {
            oamVar.mo162759I0(voiceLivePhotoSticker.getUserId(), bLiveAvatarFrameConfigM191288Z3);
        } else {
            oamVar.mo162760V1(nsvVarM136874m);
        }
        if (voiceLivePhotoSticker.getUserId().equals(zrv.f205799a.m207631D0())) {
            m191289S3(bLiveAvatarFrameConfigM191288Z3);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m191293W3(BLiveCallVolume bLiveCallVolume, hrk0 hrk0Var, BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || (bLiveUserMask = l6o0.m153068c(hrk0Var.m136874m(bLiveVoiceCall.user)).f130275b) == null || !bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            return;
        }
        this.f174395i.mo162767k0(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m191294X3(String str) {
        m191292V3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m191295Y3(hrk0.C17564a c17564a) {
        m191292V3();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m191296a4() {
        this.f174396j.m171402e();
        this.f174396j.m171401d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public final void m191292V3() {
        BLiveUserMask bLiveUserMask;
        if (!guk0.m132329h(((rwn0) m213810E2()).m183423Y2())) {
            if (guk0.m132327f(((rwn0) m213810E2()).m183423Y2())) {
                m191296a4();
            }
        } else {
            if (((rwn0) m213810E2()).f165194Q && !this.f174398l) {
                duringCreated(rqn0.m182665h(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new lhn0(this)));
                this.f174398l = true;
                return;
            }
            l6o0 l6o0VarM153068c = l6o0.m153068c(((rwn0) m213810E2()).m183411P2().m136874m(zrv.f205799a.m207631D0()));
            if (l6o0VarM153068c == null || (bLiveUserMask = l6o0VarM153068c.f130275b) == null) {
                m191296a4();
            } else {
                m191289S3(bLiveUserMask.avatarConfig.frameConfig);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m191298c4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null || this.f174395i == null) {
            return;
        }
        final hrk0 hrk0VarM183411P2 = ((rwn0) m213810E2()).m183411P2();
        jyb.m147537z(hrk0VarM183411P2.m136877p(), new y20() { // from class: l.shn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168731a.m191293W3(bLiveCallVolume, hrk0VarM183411P2, (BLiveVoiceCall) obj);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f174396j.m171401d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CallEvent.memberVolume().m199270g()).onBackpressureDrop().subscribe(dhw.m115825d(new y20() { // from class: l.khn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126890a.m191298c4((BLiveCallVolume) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).m168545q1().m98219B0(), false).subscribe(dhw.m115829h(new lhn0(this)));
        m113231o2(((rwn0) m213810E2()).m168545q1().m98339y0(), false).filter(new ppo0()).subscribe(dhw.m115829h(new y20() { // from class: l.mhn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136865a.m191291U3((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).map(new qcj() { // from class: l.nhn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.ohn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147467a.m191294X3((String) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183413Q2()).filter(new qcj() { // from class: l.phn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hrk0.C17564a) obj).f111360b == 1);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.qhn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157739a.m191295Y3((hrk0.C17564a) obj);
            }
        }));
    }
}
