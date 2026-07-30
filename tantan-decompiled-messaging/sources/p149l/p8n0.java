package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;

/* JADX INFO: loaded from: classes5.dex */
public class p8n0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public final y7m f147617i;

    /* JADX INFO: renamed from: j */
    public final ia1 f147618j;

    /* JADX INFO: renamed from: k */
    public boolean f147619k;

    /* JADX INFO: renamed from: l */
    public boolean f147620l;

    /* JADX WARN: Multi-variable type inference failed */
    public p8n0(bsm bsmVar, y7m y7mVar) {
        super(bsmVar);
        this.f147619k = false;
        this.f147617i = y7mVar;
        this.f147618j = new ia1(((nnn0) m206027E2()).m132067H0());
    }

    /* JADX INFO: renamed from: Z3 */
    public static BLiveAvatarFrameConfig m167812Z3(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
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
    public final void m167813S3(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        hfw.m130790a("voice_effect_gift", "changeAudioEffect:" + bLiveAvatarFrameConfig.changeVoiceNo);
        if (this.f147619k) {
            return;
        }
        if (!bLiveAvatarFrameConfig.checkNeedChangeVoice()) {
            m167820a4();
        } else {
            this.f147618j.m135109b(bLiveAvatarFrameConfig);
            this.f147618j.m135116i((int) bLiveAvatarFrameConfig.getFixedRemainingSec());
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m167814T3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvGameInfo == null || (bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo) == null) {
            this.f147619k = false;
        } else {
            this.f147619k = TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0());
        }
        hfw.m130790a("voice_effect_gift", "checkIsKtvSinger:" + this.f147619k);
        if (this.f147619k) {
            this.f147618j.m135111d();
        } else {
            e51.m114743H(this.f188513f, new Runnable() { // from class: l.n8n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137664a.m167816V3();
                }
            }, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public void m167815U3(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        hfw.m130790a("voice_effect_gift", "photoSticker:" + voiceLivePhotoSticker.toString());
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigM167812Z3 = m167812Z3(voiceLivePhotoSticker.getFrameConfig());
        mqv<i54> mqvVarM102064m = ((nnn0) m206027E2()).m160249P2().m102064m(voiceLivePhotoSticker.getUserId());
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVarM102064m);
        if (hxn0VarM133350c.f109896b != null && voiceLivePhotoSticker.hasFrameConfig()) {
            hxn0VarM133350c.f109896b.avatarConfig.frameConfig = bLiveAvatarFrameConfigM167812Z3;
        }
        boolean zM207013c = x4s.m207013c(((nnn0) m206027E2()).mo149813j().liveMode);
        y7m y7mVar = this.f147617i;
        if (zM207013c) {
            y7mVar.mo139727I0(voiceLivePhotoSticker.getUserId(), bLiveAvatarFrameConfigM167812Z3);
        } else {
            y7mVar.mo139728V1(mqvVarM102064m);
        }
        if (voiceLivePhotoSticker.getUserId().equals(ypv.f199493a.m199309D0())) {
            m167813S3(bLiveAvatarFrameConfigM167812Z3);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m167817W3(BLiveCallVolume bLiveCallVolume, bik0 bik0Var, BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || (bLiveUserMask = hxn0.m133350c(bik0Var.m102064m(bLiveVoiceCall.user)).f109896b) == null || !bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            return;
        }
        this.f147617i.mo139738k0(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m167818X3(String str) {
        m167816V3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m167819Y3(bik0.C15867a c15867a) {
        m167816V3();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m167820a4() {
        this.f147618j.m135112e();
        this.f147618j.m135111d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public final void m167816V3() {
        BLiveUserMask bLiveUserMask;
        if (!alk0.m97309h(((nnn0) m206027E2()).m160261Y2())) {
            if (alk0.m97307f(((nnn0) m206027E2()).m160261Y2())) {
                m167820a4();
            }
        } else {
            if (((nnn0) m206027E2()).f139747Q && !this.f147620l) {
                duringCreated(nhn0.m159424h(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new h8n0(this)));
                this.f147620l = true;
                return;
            }
            hxn0 hxn0VarM133350c = hxn0.m133350c(((nnn0) m206027E2()).m160249P2().m102064m(ypv.f199493a.m199309D0()));
            if (hxn0VarM133350c == null || (bLiveUserMask = hxn0VarM133350c.f109896b) == null) {
                m167820a4();
            } else {
                m167813S3(bLiveUserMask.avatarConfig.frameConfig);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m167822c4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null || this.f147617i == null) {
            return;
        }
        final bik0 bik0VarM160249P2 = ((nnn0) m206027E2()).m160249P2();
        vwb.m200354z(bik0VarM160249P2.m102067p(), new e30() { // from class: l.o8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142659a.m167817W3(bLiveCallVolume, bik0VarM160249P2, (BLiveVoiceCall) obj);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f147618j.m135111d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CallEvent.memberVolume().m172460g()).onBackpressureDrop().subscribe(ffw.m121193d(new e30() { // from class: l.g8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101506a.m167822c4((BLiveCallVolume) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).m132160q1().m189037B0(), false).subscribe(ffw.m121197h(new h8n0(this)));
        m104250o2(((nnn0) m206027E2()).m132160q1().m189157y0(), false).filter(new lgo0()).subscribe(ffw.m121197h(new e30() { // from class: l.i8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112058a.m167815U3((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).map(new w9j() { // from class: l.j8n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.k8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121842a.m167818X3((String) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160251Q2()).filter(new w9j() { // from class: l.l8n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((bik0.C15867a) obj).f75773b == 1);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.m8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132590a.m167819Y3((bik0.C15867a) obj);
            }
        }));
    }
}
