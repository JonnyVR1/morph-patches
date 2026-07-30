package p149l;

import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class f8n0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public final c8m f96386i;

    /* JADX INFO: renamed from: j */
    public final ia1 f96387j;

    /* JADX INFO: renamed from: k */
    public final Runnable f96388k;

    /* JADX WARN: Multi-variable type inference failed */
    public f8n0(bsm bsmVar, c8m c8mVar) {
        super(bsmVar);
        this.f96388k = new Runnable() { // from class: l.c8n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79775a.m120034U3();
            }
        };
        this.f96386i = c8mVar;
        this.f96387j = new ia1(((nnn0) m206027E2()).m132067H0());
    }

    /* JADX INFO: renamed from: N3 */
    private void m120031N3(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f96387j.m135109b(bLiveAvatarFrameConfig);
        m120036O3();
        int i = bLiveAvatarFrameConfig.remainingSec;
        if (i > 0) {
            m129320z3(((long) i) * 1000, this.f96388k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m120032S3(BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        if (!alk0.m97309h(bLiveVoiceCall)) {
            if (alk0.m97307f(bLiveVoiceCall)) {
                m120034U3();
                m120036O3();
                return;
            }
            return;
        }
        hxn0 hxn0VarM133350c = hxn0.m133350c(((nnn0) m206027E2()).m160249P2().m102064m(ypv.f199493a.m199309D0()));
        if (hxn0VarM133350c == null || (bLiveUserMask = hxn0VarM133350c.f109896b) == null) {
            return;
        }
        m120031N3(bLiveUserMask.avatarConfig.frameConfig);
    }

    /* JADX INFO: renamed from: T3 */
    public static BLiveAvatarFrameConfig m120033T3(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigNew_ = BLiveAvatarFrameConfig.new_();
        bLiveAvatarFrameConfigNew_.staticUrl = pictureConfig.getStaticUrl();
        bLiveAvatarFrameConfigNew_.dynamicUrl = pictureConfig.getDynamicUrl();
        bLiveAvatarFrameConfigNew_.smallDynamicUrl = pictureConfig.getSmallDynamicUrl();
        bLiveAvatarFrameConfigNew_.mediumDynamicUrl = pictureConfig.getMediumDynamicUrl();
        bLiveAvatarFrameConfigNew_.totalSec = (int) pictureConfig.getTotalSec();
        bLiveAvatarFrameConfigNew_.remainingSec = (int) pictureConfig.getRemainingSec();
        bLiveAvatarFrameConfigNew_.changeVoiceNo = (int) pictureConfig.getChangeVoiceNo();
        bLiveAvatarFrameConfigNew_.endMill = pictureConfig.getEndMill();
        return bLiveAvatarFrameConfigNew_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m120034U3() {
        this.f96387j.m135112e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m120035V3(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null || this.f96386i == null) {
            return;
        }
        final bik0 bik0VarM160249P2 = ((nnn0) m206027E2()).m160249P2();
        vwb.m200354z(bik0VarM160249P2.m102067p(), new e30() { // from class: l.e8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89840a.m120038R3(bLiveCallVolume, bik0VarM160249P2, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final void m120036O3() {
        m129296E3(this.f96388k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m120037P3(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        hxn0 hxn0VarM133350c = hxn0.m133350c(((nnn0) m206027E2()).m160249P2().m102064m(voiceLivePhotoSticker.getUserId()));
        if (hxn0VarM133350c.f109896b == null || !voiceLivePhotoSticker.hasFrameConfig()) {
            return;
        }
        hxn0VarM133350c.f109896b.avatarConfig.frameConfig = m120033T3(voiceLivePhotoSticker.getFrameConfig());
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(voiceLivePhotoSticker.getUserId());
        if (bLiveVoiceCallM102063l == null) {
            return;
        }
        c8m c8mVar = this.f96386i;
        if (c8mVar != null) {
            c8mVar.mo103626t2(((nnn0) m206027E2()).m160249P2(), bLiveVoiceCallM102063l);
        }
        if (voiceLivePhotoSticker.getUserId().equals(ypv.f199493a.m199309D0())) {
            m120031N3(hxn0VarM133350c.f109896b.avatarConfig.frameConfig);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m120038R3(BLiveCallVolume bLiveCallVolume, bik0 bik0Var, BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume || (bLiveUserMask = hxn0.m133350c(bik0Var.m102064m(bLiveVoiceCall.user)).f109896b) == null || bLiveUserMask.avatarConfig.frameConfig.changeVoiceNo == 0) {
            return;
        }
        this.f96386i.mo103611D(bLiveVoiceCall);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().CallEvent.memberVolume().m172460g()).onBackpressureDrop().subscribe(ffw.m121193d(new e30() { // from class: l.d8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84880a.m120035V3((BLiveCallVolume) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m120036O3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189157y0()).filter(new lgo0()).subscribe(ffw.m121197h(new e30() { // from class: l.a8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68057a.m120037P3((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121197h(new e30() { // from class: l.b8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74136a.m120032S3((BLiveVoiceCall) obj);
            }
        }));
    }
}
