package p153l;

import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class jhn0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public final sam f120988i;

    /* JADX INFO: renamed from: j */
    public final pa1 f120989j;

    /* JADX INFO: renamed from: k */
    public final Runnable f120990k;

    /* JADX WARN: Multi-variable type inference failed */
    public jhn0(dum dumVar, sam samVar) {
        super(dumVar);
        this.f120990k = new Runnable() { // from class: l.ghn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104135a.m144924U3();
            }
        };
        this.f120988i = samVar;
        this.f120989j = new pa1(((rwn0) m213810E2()).m168456H0());
    }

    /* JADX INFO: renamed from: N3 */
    private void m144921N3(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f120989j.m171399b(bLiveAvatarFrameConfig);
        m144926O3();
        int i = bLiveAvatarFrameConfig.remainingSec;
        if (i > 0) {
            m138879z3(((long) i) * 1000, this.f120990k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m144922S3(BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        if (!guk0.m132329h(bLiveVoiceCall)) {
            if (guk0.m132327f(bLiveVoiceCall)) {
                m144924U3();
                m144926O3();
                return;
            }
            return;
        }
        l6o0 l6o0VarM153068c = l6o0.m153068c(((rwn0) m213810E2()).m183411P2().m136874m(zrv.f205799a.m207631D0()));
        if (l6o0VarM153068c == null || (bLiveUserMask = l6o0VarM153068c.f130275b) == null) {
            return;
        }
        m144921N3(bLiveUserMask.avatarConfig.frameConfig);
    }

    /* JADX INFO: renamed from: T3 */
    public static BLiveAvatarFrameConfig m144923T3(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
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
    public void m144924U3() {
        this.f120989j.m171402e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m144925V3(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null || this.f120988i == null) {
            return;
        }
        final hrk0 hrk0VarM183411P2 = ((rwn0) m213810E2()).m183411P2();
        jyb.m147537z(hrk0VarM183411P2.m136877p(), new y20() { // from class: l.ihn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114988a.m144928R3(bLiveCallVolume, hrk0VarM183411P2, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final void m144926O3() {
        m138855E3(this.f120990k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m144927P3(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        l6o0 l6o0VarM153068c = l6o0.m153068c(((rwn0) m213810E2()).m183411P2().m136874m(voiceLivePhotoSticker.getUserId()));
        if (l6o0VarM153068c.f130275b == null || !voiceLivePhotoSticker.hasFrameConfig()) {
            return;
        }
        l6o0VarM153068c.f130275b.avatarConfig.frameConfig = m144923T3(voiceLivePhotoSticker.getFrameConfig());
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(voiceLivePhotoSticker.getUserId());
        if (bLiveVoiceCallM136873l == null) {
            return;
        }
        sam samVar = this.f120988i;
        if (samVar != null) {
            samVar.mo182850t2(((rwn0) m213810E2()).m183411P2(), bLiveVoiceCallM136873l);
        }
        if (voiceLivePhotoSticker.getUserId().equals(zrv.f205799a.m207631D0())) {
            m144921N3(l6o0VarM153068c.f130275b.avatarConfig.frameConfig);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m144928R3(BLiveCallVolume bLiveCallVolume, hrk0 hrk0Var, BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume || (bLiveUserMask = l6o0.m153068c(hrk0Var.m136874m(bLiveVoiceCall.user)).f130275b) == null || bLiveUserMask.avatarConfig.frameConfig.changeVoiceNo == 0) {
            return;
        }
        this.f120988i.mo182837D(bLiveVoiceCall);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().CallEvent.memberVolume().m199270g()).onBackpressureDrop().subscribe(dhw.m115825d(new y20() { // from class: l.hhn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109911a.m144925V3((BLiveCallVolume) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m144926O3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98339y0()).filter(new ppo0()).subscribe(dhw.m115829h(new y20() { // from class: l.ehn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94054a.m144927P3((VoiceFunnyAvatar.VoiceLivePhotoSticker) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115829h(new y20() { // from class: l.fhn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99086a.m144922S3((BLiveVoiceCall) obj);
            }
        }));
    }
}
